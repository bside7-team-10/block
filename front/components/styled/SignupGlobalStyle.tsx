import { createGlobalStyle } from 'styled-components';
import { DARK_COLOR1 } from '../../utils/theme/theme';

export const SignupGlobalStyle = createGlobalStyle`
  body {
    background: ${() => DARK_COLOR1};
  }
`;
