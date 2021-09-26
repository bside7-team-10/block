import type { NextPage } from "next";
import Head from "next/head";
import Home from "../components/Home";
import KakaoScript from "../components/common/KakaoMapScript";


const HomePage: NextPage = () => {
  return (
    <>
      <Head>
        <KakaoScript />
      </Head>
      <Home />
    </>
  );
};

export default HomePage;
