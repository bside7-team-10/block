import React from 'react';
import type { NextPage } from 'next';
import Head from 'next/head';
import Home from '../components/Home';
import GoogleMapScript from '../components/common/GoogleMapScript';

const HomePage: NextPage = () => {
  return (
    <>
      <Head>
        <GoogleMapScript />
      </Head>
      <Home />
    </>
  );
};

export default HomePage;
