import type { NextPage } from "next";
import Head from "next/head";

import Home from "../components/Home";

const HomePage: NextPage = () => {
  return (
    <>
      <Head>
        <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey="></script>
      </Head>
      <Home />
    </>
  );
};

export default HomePage;
