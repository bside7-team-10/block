import { NextPage } from 'next';

import Layout from '../../components/common/Layout';
import LoginEmail from '../../components/LoginEmail';

const LoginPage: NextPage = () => {
  return (
    <Layout>
      <LoginEmail />
    </Layout>
  )
}

export default LoginPage;