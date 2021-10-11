import React from 'react';
import { NextPage } from 'next';

import Layout from '../../components/common/Layout';
import BoardWrite from '../../components/BoardWrite';

const BoardWritePage: NextPage = () => {
  return (
    <Layout>
      <BoardWrite />
    </Layout>
  );
};

export default BoardWritePage;
