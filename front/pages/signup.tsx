import React from 'react';
import { NextPage } from 'next';

import Layout from '../components/common/Layout';
import Signup from '../components/Signup';

const SignupPage: NextPage = () => {
  return (
    <Layout>
      <Signup />
    </Layout>
  );
};

export default SignupPage;
