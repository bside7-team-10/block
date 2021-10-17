import React from 'react';
import styled from 'styled-components';
import { Button, Tabs } from 'antd';
import { useForm } from 'react-hook-form';

import InputField from './common/fields/InputField';
import {
  LoginGlobalStyle,
  WholeMarginWrap,
  Wrapper,
  Title,
  TitleImage,
  FullWidthButton,
} from './styled/LoginCommonStyle';
import { PRIMARY_COLOR2, WHITE_COLOR } from '../utils/theme/theme';

const { TabPane } = Tabs;

const FindEmailPassword = () => {
  const { control } = useForm();

  return (
    <>
      <LoginGlobalStyle />
      <Wrapper>
        <WholeMarginWrap>
          <Title>LOGIN</Title>
          <TitleImage src="/static/images/login/login_findEmailPassword_bg.png" />
          <StyledTabs defaultActiveKey="1" centered>
            <TabPane tab="이메일 찾기" key="1">
              <form>
                <Table>
                  <FindInputWrap>
                    <StyledInputField
                      control={control}
                      name="phoneNumber"
                      size="small"
                      placeholder="01012345678"
                      required
                    />
                  </FindInputWrap>
                  <InputWithButton ghost>인증번호 발송</InputWithButton>
                </Table>
                <Table>
                  <FindInputWrap>
                    <StyledInputField
                      control={control}
                      name="authNumber"
                      size="small"
                      placeholder="인증번호 입력"
                      required
                    />
                  </FindInputWrap>
                  <InputWithButton ghost>확인</InputWithButton>
                </Table>
              </form>
              <FullWidthButton>FIND</FullWidthButton>
            </TabPane>
            <TabPane tab="비밀번호 찾기" key="2">
              <form>
                <OnlyInputField>
                  <StyledInputField
                    control={control}
                    name="email"
                    size="small"
                    placeholder="이메일을 입력하세요."
                  />
                </OnlyInputField>
                <Table>
                  <FindInputWrap>
                    <StyledInputField
                      control={control}
                      name="email"
                      size="small"
                      placeholder="이메일 주소를 입력하세요."
                    />
                  </FindInputWrap>
                  <InputWithButton ghost>재설정링크 전송</InputWithButton>
                </Table>
              </form>
              <FullWidthButton>FIND</FullWidthButton>
            </TabPane>
          </StyledTabs>
        </WholeMarginWrap>
      </Wrapper>
    </>
  );
};

export default FindEmailPassword;

const StyledTabs = styled(Tabs)`
  & > .ant-tabs-nav::before {
    border-bottom: 0;
  }

  & > .ant-tabs-nav .ant-tabs-ink-bar {
    height: 4px;
  }

  & .ant-tabs-nav {
    width: 100% !important;

    & > div:nth-of-type(1) {
      display: unset !important;
      width: 100% !important;
    }

    & .ant-tabs-nav-wrap {
      & .ant-tabs-nav-list {
        & .ant-tabs-ink-bar {
          background-color: ${() => WHITE_COLOR};
        }

        & .ant-tabs-tab {
          display: block; /* centers text inside tabs */
          flex: 1;
          text-align: center;
          color: ${() => PRIMARY_COLOR2};
          font-size: 18px;
          line-height: 26px;
          font-weight: bold;
        }

        // 이 부분은 해결하지 못하여 global.css에 임시로 하드코딩했습니다.
        // & ant-tabs-tab.ant-tabs-tab-active .ant-tabs-tab-btn {
        //   color: ${() => WHITE_COLOR} !important;
        // }
      }
    }
  }
`;

const Table = styled.div`
  display: table;
  padding-bottom: 8px;
  border-bottom: 1px solid ${() => WHITE_COLOR};
  margin-bottom: 24px;
`;

const FindInputWrap = styled.div`
  display: table-cell;
  width: 100%;
`;

const StyledInputField = styled(InputField)`
  display: none;
`;

const InputWithButton = styled(Button)`
  border: none;
`;

const OnlyInputField = styled.div`
  padding-top: 4px;
  padding-bottom: 12px;
  border-bottom: 1px solid ${() => WHITE_COLOR};
  margin-bottom: 24px;
`;
