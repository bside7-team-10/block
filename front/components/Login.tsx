import Link from 'next/link';
import { useForm } from 'react-hook-form';
import styled from 'styled-components';
import { Button, Grid } from '@material-ui/core';
import router from 'next/router';

import { useActions } from '../hooks/use-actions';
import InputField from './common/fields/InputField';
import { User } from '../state';

const defaultValues = {
  email: '',
  password: '',
};

const Login = () => {
  const { control, handleSubmit, setError, getValues, setFocus, clearErrors } = useForm({ defaultValues });
  const { userLogin } = useActions();

  const onLoginSubmit = (data: User) => {
    userLogin(data, onLoginSuccessCallback);
  };

  const onLoginSuccessCallback = () => {
    router.push('/');
  };

  return (
    <Wrapper>
      <MainImage src="https://blog.kakaocdn.net/dn/eGYXO4/btqwmu4l3p3/ucIxOVwvUIq8KKrMMstmIK/img.png" />

      <LoginForm>
        <LoginLabel htmlFor="email">Enter Email</LoginLabel>
        {/* <InputField name="email" label="" control={control} required={true} variant="outlined" /> */}
        <LoginLabel htmlFor="password">Enter Password</LoginLabel>
        {/* <InputField name="password" label="" control={control} required={true} variant="outlined"/> */}
      </LoginForm>

      <Link href="#">
        <ForgotPasswordLink>forgot Password?</ForgotPasswordLink>
      </Link>

      <Grid container direction="row" justifyContent="center" alignItems="center" spacing={1}>
        <Grid item xs={6}>
          <GridButton size="small" variant="contained" color="primary" onClick={handleSubmit(onLoginSubmit)}>
            LOGIN
          </GridButton>
        </Grid>
        <Grid item xs={6}>
          <GridButton size="small" variant="contained" color="primary">
            Create Account
          </GridButton>
        </Grid>
      </Grid>

      <Footer>2021 Block. All Rights Reserved.</Footer>
    </Wrapper>
  );
};

export default Login;

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 300px;
  margin-left: auto;
  margin-right: auto;
  margin-top: 20px;
`;

const MainImage = styled.img`
  border-radius: 5px;
`;

const LoginForm = styled.form`
  width: 70%;
  margin: 0 auto;
  margin-top: 30px;
`;

const LoginLabel = styled.label`
  display: inline-block;
  margin-left: 3px;
  margin-bottom: 3px;
  font-size: 15px;
  color: dimgray;
`;

const ForgotPasswordLink = styled.a`
  color: blue;
  text-align: center;
  cursor: pointer;
  margin-bottom: 40px;
`;

const GridButton = styled(Button)`
  width: 100%;
  padding: 10px;
`;

const Footer = styled.div`
  margin-top: 20px;
  margin-bottom: 20px;
  font-size: 15px;
  text-align: center;
`;
