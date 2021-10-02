import React from 'react';
import Link from 'next/link';
import { useForm } from 'react-hook-form';
import styled from 'styled-components';
import router from 'next/router';

import { useActions } from '../hooks/use-actions';
import { User } from '../state';
import Fields from './common/fields/Fields';
import {
  FullWidthButton,
  LoginGlobalStyle,
  Title,
  TitleImage,
  WholeMarginWrap,
  Wrapper,
} from './styled/LoginCommonStyle';
import { COMMON_PADDING_M, WHITE_COLOR } from '../utils/theme/theme';

const defaultValues = {
  email: '',
  password: '',
};

const LoginEmail = () => {
  const {
    control,
    handleSubmit,
    formState: { errors },
  } = useForm({ defaultValues });

  const { userLogin } = useActions();

  const onLoginSubmit = (data: User) => {
    userLogin(data, onLoginSuccessCallback);
  };

  const onLoginSuccessCallback = () => {
    router.push('/map');
  };

  return (
    <>
      <LoginGlobalStyle />
      <Wrapper>
        <WholeMarginWrap>
          <Title>LOGIN</Title>
          <TitleImage src="/static/images/login/login_email_bg.png" />
          <form>
            <FieldsWrap>
              <Fields
                name="email"
                type="email"
                size="small"
                placeholder="이메일 주소를 입력하세요."
                prefix="MAIL"
                control={control}
                error={errors.email}
                opacity={0.7}
                color={WHITE_COLOR}
                required
              />
            </FieldsWrap>
            <FieldsWrap>
              <Fields
                name="password"
                type="password"
                size="small"
                placeholder="비밀번호를 입력하세요."
                prefix="PW"
                control={control}
                error={errors.password}
                opacity={0.7}
                color={WHITE_COLOR}
                required
              />
            </FieldsWrap>
          </form>
          <FullWidthButton type="primary" onClick={handleSubmit(onLoginSubmit)}>
            NEXT
          </FullWidthButton>
          <Links>
            <Link href="/signup">
              <a>블럭 회원 가입하기</a>
            </Link>
          </Links>
        </WholeMarginWrap>
      </Wrapper>
    </>
  );
};

export default LoginEmail;

const FieldsWrap = styled.div`
  overflow: clip;
  padding-bottom: ${COMMON_PADDING_M};
`;

const Links = styled.div`
  padding: ${COMMON_PADDING_M} 0px;
  text-align: center;
  a {
    color: ${() => WHITE_COLOR};
  }
  span {
    color: ${() => WHITE_COLOR};
  }
`;
