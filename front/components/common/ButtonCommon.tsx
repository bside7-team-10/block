import { Button } from 'antd';
import styled from 'styled-components';
import { PRIMARY_COLOR, PRIMARY_COLOR3, WHITE_COLOR } from '../../utils/theme/theme';
import { BUTTON_ACTIVE } from '../../lib/constants';
interface ButtonCommonProps {
  active: string;
}

export const ButtonCommon = styled(Button)`
  width: 100%;
  height: 48px;
  background-color: ${({ active }: ButtonCommonProps) =>
    active === BUTTON_ACTIVE ? PRIMARY_COLOR : PRIMARY_COLOR3};
  border-radius: 6px;
  border: none;

  span {
    color: ${({ active }: ButtonCommonProps) =>
      active === BUTTON_ACTIVE ? WHITE_COLOR : PRIMARY_COLOR};
    font-weight: 800;
    font-size: 24px;
    line-height: 29px;
  }

  &:hover {
    background-color: ${() => PRIMARY_COLOR3};
  }
`;
