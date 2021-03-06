import { Button } from 'antd';
import styled, { createGlobalStyle } from 'styled-components';

import {
  BUTTON_COLOR1,
  PRIMARY_COLOR,
  SUB_COLOR2,
  COMMON_MARGIN_S,
  COMMON_MARGIN_M,
  COMMON_PADDING_XL,
} from '../../utils/theme/theme';

export const LoginGlobalStyle = createGlobalStyle`
  body {
    background: linear-gradient(${() => PRIMARY_COLOR}, ${() => SUB_COLOR2});
  }
`;

export const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 360px;
  height: 640px;
  margin-left: auto;
  margin-right: auto;
`;

export const WholeMarginWrap = styled.div`
  margin: 0px ${COMMON_MARGIN_S};
`;

export const Title = styled.div`
  color: white;
  text-align: center;
  font-size: 25px;
  font-weight: bolder;
  margin-bottom: ${COMMON_MARGIN_M};
`;

export const TitleImage = styled.img`
  display: flex;
  margin: 0 auto;
  padding: ${COMMON_PADDING_XL} 0px;
`;

export const FullWidthButton = styled(Button)`
  width: 100%;
  height: 48px;
  background-color: ${() => PRIMARY_COLOR};
  border-radius: 6px;
  border: none;
  span {
    color: white;
    font-size: 20px;
    font-weight: bold;
  }
  &:hover {
    background-color: ${() => PRIMARY_COLOR};
  }
`;

export const FullWidthButtonWithRadius = styled(Button)`
  width: 100%;
  background-color: ${() => BUTTON_COLOR1};
  height: 40px;
  border: none;
  span {
    color: white;
  }
  &:hover {
    background-color: ${() => BUTTON_COLOR1};
  }
`;
