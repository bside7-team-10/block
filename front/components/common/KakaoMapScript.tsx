import React from 'react';
import config from '../../config/test-config';

const KakaoScript = () => {
  const kakaoMapUrl = config.NEXT_KAKAO_MAP_URL;
  if (kakaoMapUrl.length > 0) {
    return (
      <>
        <script type="text/javascript" src={kakaoMapUrl}></script>
      </>
    );
  }
  console.error('NEXT_KAKAO_MAP_URL is not exist on process environment');
  return <></>;
};

export default KakaoScript;
