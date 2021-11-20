import React, { useEffect, useState } from 'react';
import { RootStateOrAny, useSelector } from 'react-redux';
import { Button, Drawer } from 'antd';
import { useForm } from 'react-hook-form';
import styled from 'styled-components';

import { useActions } from '../hooks/use-actions';
import { RootState } from '../state';
import { MPost, Post } from '../state'
import BoardWrite from './BoardWrite';
import SmallFeed from './SmallFeed';
import BigFeed from './BigFeed';
import { HorizontalSpace } from './common/Spaces';
import { COMMON_SIZE_12PX, DARK_COLOR1, WHITE_COLOR } from '../utils/theme/theme';
import PlusIcon from '../assets/Plus'
import Service from '../state/service';

declare const google: any;

const Map = () => {
  const { getUserLocation, getFakeUserLocation, getPosts, getPost, startWritePost } = useActions();
  const { latitude, longitude } = useSelector((state: RootStateOrAny) => state.location);
  const { imageSource, writing } = useSelector((state: RootState) => state.post);
  const { posts }: { posts: MPost[] } = useSelector((state: RootState) => state.posts);
  const { post }: { post: Post } = useSelector((state: RootState) => state.getPost);
  const [isDrawerVisable, setIsDrawerVisable] = useState(false);
  const [windowHeight, setWindowHeight] = useState(0);
  const [map, setMap] = useState(null);
  const [userMarker, setUserMarker] = useState<google.maps.Marker>();
  const [smallFeedVisible, setSmallFeedVisible] = useState(false);
  const [bigFeedVisible, setBigFeedVisible] = useState(false);
  const [markers, setMarkers] = useState<google.maps.Marker[]>([]);

  useEffect(() => {
    if (latitude && longitude) {
      getPosts({ latitude, longitude });
    }
  }, [latitude, longitude])

  useEffect(() => {
    const getUserLocationInterval = setInterval(() => getFakeUserLocation({ latitude, longitude }), 2000);
    return () => clearInterval(getUserLocationInterval);
  }, [])

  useEffect(() => {
    const container = document.getElementById('map');
    const map = new google.maps.Map(container, {
      zoom: 15,
      center: { lat: latitude, lng: longitude },
      disableDefaultUI: true,
      draggable: false,
      disableDoubleClickZoom: true,
    });
    setMap(map)
  }, []);


  useEffect(() => {
    const options = {
      center: new google.maps.LatLng(latitude, longitude),
      level: 3,
    };

    userMarker && userMarker.setMap(null);

    const marker = new google.maps.Marker({
      position: options.center,
      icon: '/static/images/pin/mylocation.png',
      map,
    });

    setUserMarker(marker)
  }, [latitude, longitude]);

  useEffect(() => {
    if (typeof window !== 'undefined') {
      setWindowHeight(window.innerHeight);
    }
  }, []);

  useEffect(() => {
    if (imageSource) setIsDrawerVisable(true);
  }, []);

  useEffect(() => {
    if (!!map && !!posts && posts.length > 0) {
      for (const m of markers) {
        m.setMap(null);
      }
      markers.length = 0;
      posts.map(({ postId, latitude, longitude }: MPost) => {
        const marker = new google.maps.Marker({
          position: new google.maps.LatLng(latitude, longitude),
          icon: '/static/images/pin/pin.png',
          map,
        });
        marker.addListener('click', async () => {
          await getPost(postId);
          !smallFeedVisible && setSmallFeedVisible(true);
        });
        markers.push(marker)
        setMarkers(markers);
      })
    }

  }, [map, posts])

  const onClickWriteButton = () => {
    setIsDrawerVisable(true);
    startWritePost();
  };

  const onCloseDrawer = () => {
    setIsDrawerVisable(false);
  };

  const { handleSubmit } = useForm();

  const onMapClick = () => {
    setSmallFeedVisible(false);
    setBigFeedVisible(false);
  }

  return (
    <Wrapper>
      <StyledMap id="map" onClick={onMapClick} />
      {smallFeedVisible ? (
        <SmallFeedWrapper onClick={() => { setBigFeedVisible(true) }}>
          <FeedBar />
          <HorizontalSpace height={COMMON_SIZE_12PX} />
          <SmallFeed post={post} />
        </SmallFeedWrapper>
      ) : <></>}
      {bigFeedVisible ? (
        <BigFeedWrapper>
          <BigFeed setVisible={setBigFeedVisible} post={post} />
        </BigFeedWrapper>) : <></>}
      {!smallFeedVisible && !bigFeedVisible && (
        <WritePostButtonWrapper>
          <WritePostButton onClick={onClickWriteButton}>
            <PlusIcon />
          </WritePostButton>
        </WritePostButtonWrapper>)}

      <StyledDrawer
        placement="bottom"
        closable={false}
        maskClosable={false}
        onClose={onCloseDrawer}
        visible={writing}
        height={windowHeight - 24}
        footer={
          <WritingButton form="boardWriteForm" htmlType="submit">
            공유하기
          </WritingButton>
        }
      >
        <BoardWrite onCloseDrawer={onCloseDrawer} />
      </StyledDrawer>
    </Wrapper>
  );
};

export default Map;

const WritePostButtonWrapper = styled.div`
  display: flex;
  justify-content: center;
`

const WritePostButton = styled.div`
  width: 48px;
  height: 48px;
  border-radius: 100%;
  background-color: white;
  position: absolute;
  bottom: 30px;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
`

const FeedBar = styled.div`
  width: 56px;
  height: 5px;
  background: #191D46;
  border-radius: 100px;
`

const StyledMap = styled.div`
  width: 100%;
  height: 100vh;
`

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  position: relative;
`;

const SmallFeedWrapper = styled.div`
  width: 100%;
  position: absolute;
  bottom: 30px;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
`;

const BigFeedWrapper = styled.div`
  width: 100%;
  position: absolute;
  position: absolute;
  bottom: 0px;
`;

const StyledDrawer = styled(Drawer)`
  &. ant-drawer-content-wrapper {
    height: 100%;
  }

  & .ant-drawer-content {
    background-color: inherit;
  }

  & .ant-drawer-body {
    border-radius: 10px 10px 0px 0px;
    padding: 0px;
    background-color: ${WHITE_COLOR};
  }

  & .ant-drawer-footer {
    background-color: ${WHITE_COLOR};
    border-top: none;
  }
`;

const WritingButton = styled(Button)`
  width: 100%;
  height: 48px;
  border-radius: 4px;
  font-size: 14px;
  background-color: ${() => DARK_COLOR1};

  color: ${() => WHITE_COLOR};

  &:hover {
    background-color: ${() => DARK_COLOR1};
    color: ${() => WHITE_COLOR};
  }
  &:active {
    background-color: ${() => DARK_COLOR1};
    color: ${() => WHITE_COLOR};
  }
  &:focus {
    background-color: ${() => DARK_COLOR1};
    color: ${() => WHITE_COLOR};
  }
`;
