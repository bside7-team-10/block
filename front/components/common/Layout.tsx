import React from 'react';
import Head from 'next/head';
import styled from 'styled-components';

interface LayoutProps {
  children: any;
}

const kakaoMapUrl = process.env.NEXT_KAKAO_MAP_URL;

const Layout = ({ children }: LayoutProps) => {
  return (
    <>
      <Head>
        <script type="text/javascript" src={kakaoMapUrl}></script>
      </Head>
      <Wrapper>{children}</Wrapper>
    </>
  );
};

export default Layout;

const Wrapper = styled.div`
  max-width: 2280px;
  width: 100%;
  margin-left: auto;
  margin-right: auto;
`;
