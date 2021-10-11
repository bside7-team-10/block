import dayjs from 'dayjs';
import { useRouter } from 'next/router';
import React, { useCallback, useRef, useState } from 'react';
import { useSelector } from 'react-redux';
import Webcam from 'react-webcam';
import styled from 'styled-components';
import { useActions } from '../hooks/use-actions';
import { RootState } from '../state';
import { Image } from '../state/image';

const videoConstraintsInitialState = {
  width: 360,
  height: 640,
  facingMode: 'user',
};

const WebcamCamera = () => {
  const webcamRef = useRef<any>(null);
  const [videoConstraints, setVideoConstraints] = useState(videoConstraintsInitialState);

  const { captureImage } = useActions();
  const router = useRouter();

  const { toComeBackPath } = useSelector((state: RootState) => state.post);

  const callback = () => {
    if (!toComeBackPath) {
      router.back();
    } else {
      router.push(toComeBackPath);
    }
  };

  const onClickCapture = useCallback(() => {
    const src = webcamRef.current?.getScreenshot();
    const date = dayjs().format('YYYY-MM-DD HH:mm:ss');

    const image: Image = {
      src,
      date,
    };

    captureImage(image, callback);
  }, [webcamRef]);

  return (
    <Wrapper>
      <Webcam
        audio={false}
        ref={webcamRef}
        screenshotFormat="image/jpeg"
        videoConstraints={videoConstraints}
      />
      <button onClick={onClickCapture}>촬영</button>
    </Wrapper>
  );
};

export default WebcamCamera;

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  width: 360px;
  height: 640px;
  margin-left: auto;
  margin-right: auto;
`;