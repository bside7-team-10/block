import React from 'react';
import type { NextPage } from 'next';
import Head from 'next/head';

import Home from '../components/Home';

const kakaoMapUrl = process.env.NEXT_KAKAO_MAP_URL;

const HomePage: NextPage = () => {
  return (
    <>
      <Head>
        <script type="text/javascript" src={kakaoMapUrl}></script>
      </Head>
      <Home />
    </>
  );
};

export default HomePage;
