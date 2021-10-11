import { useRouter } from 'next/router';
import React from 'react';
import { useEffect } from 'react';
import { RootStateOrAny, useSelector } from 'react-redux';
import styled from 'styled-components';

import { useActions } from '../hooks/use-actions';

declare const kakao: any;

const Map = () => {
  const { latitude, longitude } = useSelector((state: RootStateOrAny) => state.location);
  const { getUserLocation } = useActions();

  const router = useRouter();

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

  const onClickWriteButton = () => {
    router.push('/board/write');
  };

  return (
    <>
      <Wrapper>
        <div id="map" style={{ width: '300px', height: '300px' }}></div>
        <button onClick={onClickWriteButton}>글 쓰기</button>
      </Wrapper>
    </>
  );
};

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 300px;
  margin-left: auto;
  margin-right: auto;
  margin-top: 20px;
`;

export default Map;
