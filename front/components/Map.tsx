import { Button, Drawer } from 'antd';
import React, { useState } from 'react';
import { useEffect } from 'react';
import { useForm } from 'react-hook-form';
import { useSelector } from 'react-redux';
import styled from 'styled-components';

import { useActions } from '../hooks/use-actions';
import { RootState } from '../state';
import { DARK_COLOR1, WHITE_COLOR } from '../utils/theme/theme';
import BoardWrite from './BoardWrite';

declare const kakao: any;

const Map = () => {
  const { latitude, longitude } = useSelector((state: RootState) => state.location);
  const { imageSource } = useSelector((state: RootState) => state.post);
  const { getUserLocation } = useActions();
  const [isDrawerVisable, setIsDrawerVisable] = useState(false);
  const [windowHeight, setWindowHeight] = useState(0);

  useEffect(() => {
    getUserLocation();

    const container = document.getElementById('map');
    const options = {
      center: new kakao.maps.LatLng(latitude, longitude),
      level: 3,
    };
    const map = new kakao.maps.Map(container, options);

    const marker = new kakao.maps.Marker({ position: options.center });
    marker.setMap(map);
  }, [latitude, longitude]);

  useEffect(() => {
    if (typeof window !== 'undefined') {
      setWindowHeight(window.innerHeight);
    }
  }, []);

  useEffect(() => {
    if (imageSource) setIsDrawerVisable(true);
  }, []);

  const onClickWriteButton = () => {
    setIsDrawerVisable(true);
  };

  const onCloseDrawer = () => {
    setIsDrawerVisable(false);
  };

  const { handleSubmit } = useForm();

  return (
    <>
      <Wrapper>
        <div id="map" style={{ width: '300px', height: '300px' }}></div>
        <button onClick={onClickWriteButton}>글 쓰기</button>
      </Wrapper>
      <StyledDrawer
        placement="bottom"
        closable={false}
        maskClosable={false}
        onClose={onCloseDrawer}
        visible={isDrawerVisable}
        height={windowHeight - 24}
        footer={
          <WritingButton form="boardWriteForm" htmlType="submit">
            공유하기
          </WritingButton>
        }
      >
        <BoardWrite onCloseDrawer={onCloseDrawer} />
      </StyledDrawer>
    </>
  );
};

export default Map;

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 300px;
  margin-left: auto;
  margin-right: auto;
  margin-top: 20px;
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
