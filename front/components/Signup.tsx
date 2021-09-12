import { useForm } from "react-hook-form";
import styled from "styled-components";
import { Button } from "@material-ui/core";

import { User } from "../state/user";
import { useActions } from "../hooks/use-actions";
import InputField from "../components/common/fields/InputField";
import router from "next/router";

const defaultValues = {
  email: "",
  password: "",
  confirmPassword: "",
  nickName: "",
};

const Signup = () => {
  const { control, handleSubmit, setError, getValues, clearErrors } = useForm({ defaultValues });
  const { userSignup } = useActions();

  const onSubmit = (data: User) => {
    userSignup(data, onSigupSuccessCallback);
  };

  const onConfirmPasswordChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    const confirmPassword = event.target?.value;
    if (getValues("password") !== confirmPassword) {
      setError("confirmPassword", { message: "비밀번호가 틀립니다." });
      return;
    }
    clearErrors("confirmPassword");
  };

  const onSigupSuccessCallback = () => {
    router.push("/");
  };

  return (
    <div>
      <Wrapper>
        <Title>회원가입</Title>
        <form>
          <InputField name="email" label="Enter email" control={control} required={true} variant="filled" />
          <InputField name="password" label="Enter password" control={control} required={true} variant="filled" />
          <InputField name="confirmPassword" label="Confirm password" control={control} required={true} variant="filled" onChange={onConfirmPasswordChange} />
          <InputField name="nickName" label="Enter Nickname" control={control} required={true} variant="filled" />
        </form>
        <Button size="large" onClick={handleSubmit(onSubmit)} variant="contained" color="primary">
          회원가입
        </Button>
      </Wrapper>
    </div>
  );
};

export default Signup;

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 300px;
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
