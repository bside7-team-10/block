import "../styles/globals.css";
import type { AppProps } from "next/app";
import { Provider } from "react-redux";
import withRedux from "next-redux-wrapper";
import { StylesProvider } from "@material-ui/core/styles";

import { store } from "../state/store";

function MyApp({ Component, pageProps }: AppProps) {
  return (
    <Provider store={store}>
      <StylesProvider injectFirst>
        <Component {...pageProps} />
      </StylesProvider>
    </Provider>
  );
}
export default withRedux(() => store)(MyApp);
