import { useForm } from 'react-hook-form';
import styled from 'styled-components';
import { Button } from '@material-ui/core';
import router from 'next/router';

import { User } from '../state/user';
import { useActions } from '../hooks/use-actions';
import Fields from '../components/common/fields/Fields';

const defaultValues = {
  email: '',
  password: '',
  confirmPassword: '',
  nickName: '',
  birthday: '',
  gender: '',
};

const Signup = () => {
  const {
    control,
    handleSubmit,
    getValues,
    register,
    formState: { errors },
  } = useForm({ mode: 'onChange', defaultValues });
  const { userSignup } = useActions();

  const onSubmit = (data: User) => {
    userSignup(data, onSigupSuccessCallback);
  };

  const onSigupSuccessCallback = () => {
    router.push('/');
  };

  const checkConfirmPassword = (confirmPassword: string) => {
    return confirmPassword === getValues('password');
  };

  register('confirmPassword', { validate: checkConfirmPassword });

  return (
    <div>
      <Wrapper>
        <Title>회원가입</Title>
        <form>
          <Fields
            name="email"
            size="large"
            placeholder="사용할 이메일 주소를 입력하세요"
            prefix="MAIL"
            control={control}
            error={errors.email}
            required
          />
          <Fields
            name="password"
            type="password"
            size="large"
            placeholder="비밀번호"
            prefix="PW"
            control={control}
            error={errors.password}
            required
          />
          <Fields
            name="confirmPassword"
            type="password"
            size="large"
            placeholder="비밀번호 확인"
            prefix="PW"
            control={control}
            error={errors.confirmPassword}
          />
          <Fields
            name="nickName"
            size="large"
            placeholder="닉네임을 입력하세요"
            prefix="ID"
            control={control}
            error={errors.nickName}
            required
          />
          <Fields
            name="birthday"
            type="date"
            size="large"
            placeholder="출생년도를 입력하세요"
            prefix="YY"
            control={control}
            error={errors.birthday}
            required
          />
          <Fields
            name="gender"
            type="radio"
            size="large"
            prefix="XY"
            control={control}
            error={errors.gender}
            options={genderOptions}
            required
          />
        </form>
        <Button size="large" onClick={handleSubmit(onSubmit)} variant="contained" color="primary">
          회원가입
        </Button>
      </Wrapper>
    </div>
  );
};

export default Signup;

interface FormSelectOptions {
  [index: number]: { label: string; value: string };
}

const genderOptions: FormSelectOptions = [
  { label: '남성', value: 'man' },
  { label: '여성', value: 'woman' },
];

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 350px;
  margin-left: auto;
  margin-right: auto;
  margin-top: 100px;
`;

const Title = styled.div`
  display: flex;
  justify-content: center;
  font-size: 18px;
  font-weight: bold;
  height: 50px;
`;
