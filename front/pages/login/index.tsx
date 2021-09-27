import React from 'react';
import { NextPage } from 'next';

import Layout from '../../components/common/Layout';
import Login from '../../components/LoginMain';

const LoginPage: NextPage = () => {
  return (
    <Layout>
      <Login />
    </Layout>
  );
};

export default LoginPage;
