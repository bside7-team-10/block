import { NextPage } from "next";
import Layout from "../components/common/Layout";
import Login from "../components/Login";

const LoginPage: NextPage = () => {
  return (
    <Layout>
      <Login />
    </Layout>
  )
}

export default LoginPage;