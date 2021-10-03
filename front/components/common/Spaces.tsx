import React from 'react';
import styled from 'styled-components';
import { WHITE_COLOR } from '../../utils/theme/theme';

interface HorizontalSpaceProps {
  height: string;
}

export const HorizontalSpace = (props: HorizontalSpaceProps) => {
  const { height } = props;
  return <HSpace height={height} />;
};

interface HSpaceProps {
  height: string;
}

const HSpace = styled.div`
  height: ${({ height }: HSpaceProps) => height};
  background-color: transparent;
  /* background-color: ${WHITE_COLOR}; */
`;
