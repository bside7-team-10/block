import React from 'react';
import styled from 'styled-components';
import { Button } from 'antd';
import router from 'next/router';

import BlockMain from '../assets/BlockMain';
import {
  LoginGlobalStyle,
  Wrapper,
  WholeMarginWrap,
  FullWidthButtonWithRadius,
} from './styled/LoginCommonStyle';
import {
  BUTTON_COLOR1,
  COMMON_MARGIN_L,
  COMMON_MARGIN_M,
  COMMON_MARGIN_S2,
  SUB_COLOR2,
  WHITE_COLOR,
} from '../utils/theme/theme';

const LoginMain = () => {
  return (
    <>
      <LoginGlobalStyle />
      <Wrapper>
        <WholeMarginWrap>
          <BlockMainWrapper>
            <BlockMain />
          </BlockMainWrapper>
          <IconGroup>
            <IconButton ghost>
              <img src="/static/images/login/facebook_icon.png" />
            </IconButton>
            <IconButton ghost>
              <img src="/static/images/login/google_icon.png" />
            </IconButton>
            <IconButton ghost>
              <img src="/static/images/login/naver_icon.png" />
            </IconButton>
            <IconButton ghost>
              <img src="/static/images/login/kakao_icon.png" />
            </IconButton>
          </IconGroup>
          <EmailLoginButton shape="round" onClick={() => router.push('/login/email')}>
            이메일로 로그인
          </EmailLoginButton>
          <SignupButton shape="round" onClick={() => router.push('/signup')}>
            회원가입
          </SignupButton>
          <Footer>2021 Block. All Rights Reserved.</Footer>
        </WholeMarginWrap>
      </Wrapper>
    </>
  );
};

export default LoginMain;

const BlockMainWrapper = styled.div`
  display: flex;
  justify-content: center;
`

const IconGroup = styled.div`
  text-align: center;
  margin-top: 110px;
`;

const IconButton = styled(Button)`
  height: 56px;
  border: 0;
  padding: 0;
  margin: 0px 6px;
`;

const EmailLoginButton = styled(FullWidthButtonWithRadius)`
  background-color: ${() => BUTTON_COLOR1};
  margin-top: ${COMMON_MARGIN_L};
`;

const SignupButton = styled(FullWidthButtonWithRadius)`
  background-color: ${() => SUB_COLOR2};
  margin-top: ${COMMON_MARGIN_S2};
`;

const Footer = styled.footer`
  margin: ${COMMON_MARGIN_L} 0px ${COMMON_MARGIN_M} 0px;
  text-align: center;
  color: ${() => WHITE_COLOR};
`;
