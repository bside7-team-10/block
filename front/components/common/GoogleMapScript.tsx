import React from 'react';
import config from '../../config/test-config';

const GoogleScript = () => {
  const googleMapUrl = config.NEXT_GOOGLE_MAP_URL;
  if (googleMapUrl.length > 0) {
    return (
      <>
        <script type="text/javascript" src={googleMapUrl}></script>
      </>
    );
  }
  console.error('NEXT_GOOGLE_MAP_URL is not exist on process environment');
  return <></>;
};

export default GoogleScript;
