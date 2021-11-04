import React from 'react';
import Head from 'next/head';
import styled from 'styled-components';
import KakaoScript from './KakaoMapScript';
import GoogleMapScript from './GoogleMapScript';

interface LayoutProps {
  children: any;
}

const Layout = ({ children }: LayoutProps) => {
  return (
    <>
      <Head>
        <GoogleMapScript />
        <meta
          name="viewport"
          content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0"
        />
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
