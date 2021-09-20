import Head from 'next/head';
import styled from "styled-components";

interface LayoutProps {
  children: any;
}

const Layout = ({ children }: LayoutProps) => {
  return (
    <>
      <Head>
        <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey="></script>
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
