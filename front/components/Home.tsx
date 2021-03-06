import React from 'react';
import { Button } from '@material-ui/core';
import styled from 'styled-components';
import { useRouter } from 'next/router';

const Home = () => {
  const router = useRouter();

  const onSignupClicked = () => {
    router.push('/signup');
  };

  const onLoginClicked = () => {
    router.push('/login');
  };

  const onMapClicked = () => {
    router.push('/map');
  };

  return (
    <Wrapper>
      <Button variant="contained" color="primary" onClick={onLoginClicked}>
        로그인
      </Button>
      <Button variant="contained" color="secondary" onClick={onSignupClicked}>
        회원가입
      </Button>
      <Button variant="contained" color="default" onClick={onMapClicked}>
        Map
      </Button>
    </Wrapper>
  );
};

export default Home;

const Wrapper = styled.div`
  display: flex;
  justify-content: center;
`;
