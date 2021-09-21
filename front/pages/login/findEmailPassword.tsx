import { NextPage } from 'next';

import Layout from '../../components/common/Layout';
import FindEmailPassword from '../../components/FindEmailPassword';

const LoginPage: NextPage = () => {
  return (
    <Layout>
      <FindEmailPassword />
    </Layout>
  )
}

export default LoginPage;