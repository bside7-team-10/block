import React from 'react';
import { NextPage } from 'next';

import Layout from '../components/common/Layout';
import Map from '../components/Map';
import cookies from 'next-cookies';

export const getServerSideProps = (context: any) => {
  const { accessToken } = cookies(context);
  if (!accessToken) {
    return {
      redirect: {
        destination: '/login',
        permanent: false,
      },
    };
  }
  return {
    props: {},
  };
};

const MapPage: NextPage = () => {
  return (
    <Layout>
      <Map />
    </Layout>
  );
};

export default MapPage;
