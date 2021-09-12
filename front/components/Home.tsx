import { Button } from "@material-ui/core";
import styled from "styled-components";
import { useRouter } from "next/router";

const Home = () => {
  const router = useRouter();

  const onSignupClicked = () => {
    router.push("/signup");
  };

  return (
    <Wrapper>
      <Button variant="contained" color="primary">
        로그인
      </Button>
      <Button variant="contained" color="secondary" onClick={onSignupClicked}>
        회원가입
      </Button>
    </Wrapper>
  );
};

export default Home;

const Wrapper = styled.div`
  display: flex;
  justify-content: center;
`;
