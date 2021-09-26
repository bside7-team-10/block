import React from 'react';
import { NextPage } from 'next';

import Layout from '../components/common/Layout';
import Map from '../components/Map';

const MapPage: NextPage = () => {
  return (
    <Layout>
      <Map />
    </Layout>
  );
};

export default MapPage;
