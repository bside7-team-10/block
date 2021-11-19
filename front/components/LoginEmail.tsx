import React from 'react';
import Link from 'next/link';
import { useForm } from 'react-hook-form';
import styled from 'styled-components';
import { useRouter } from 'next/router';

import { useActions } from '../hooks/use-actions';
import Fields from './common/fields/Fields';
import BlockLoginBottom from '../assets/BlockLoginBottom';
import BlockLogin from '../assets/BlockLogin';
import {
  FullWidthButton,
  LoginGlobalStyle,
  Title,
  WholeMarginWrap,
  Wrapper,
} from './styled/LoginCommonStyle';
import { COMMON_PADDING_M, WHITE_COLOR, COMMON_MARGIN_M } from '../utils/theme/theme';
import { User } from '../state';

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
  const router = useRouter();

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
          <SvgWrapper>
            <BlockLoginWrapper>
              <BlockLogin />
            </BlockLoginWrapper>
            <BlockLoginBottom />
          </SvgWrapper>
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

const BlockLoginWrapper = styled.div`
  position: absolute;
  bottom: 40px;
`;

const SvgWrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  position: relative;
  margin-bottom: ${COMMON_MARGIN_M};
`;

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
