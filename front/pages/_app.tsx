import React from 'react';
import 'antd/dist/antd.css';
import type { AppProps } from 'next/app';
import { Provider } from 'react-redux';
import withRedux from 'next-redux-wrapper';

import { store } from '../state/store';
import '../styles/globals.css';

function MyApp({ Component, pageProps }: AppProps) {
  return (
    <Provider store={store}>
      <Component {...pageProps} />
    </Provider>
  );
}
export default withRedux(() => store)(MyApp);
