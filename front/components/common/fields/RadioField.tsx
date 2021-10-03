import React, { useState } from 'react';
import { Controller, FieldError } from 'react-hook-form';
import styled from 'styled-components';
import { Radio } from 'antd';
import { THEME_COLOR1, WHITE_COLOR } from '../../../utils/theme/theme';

interface RadioOption {
  label: string;
  value: string | number;
}

export interface RadioFieldProps {
  type?: string;
  name: string;
  control: any;
  size: 'small' | 'middle' | 'large';
  required?: boolean;
  error?: FieldError;
  rules?: any;
  prefix?: string;
  options?: any;
  color?: string;
  inputcolor?: string;
  marginBottom?: string;
  trigger?: any;
  setFormColor?: any;
}

const RadioField = (props: RadioFieldProps) => {
  const { name, control, rules, size, trigger, setFormColor, options = null } = props;
  const [color, setColor] = useState(THEME_COLOR1);

  const radioOptions = options?.map(({ label, value }: RadioOption, i: number) => (
    <StyledRadio key={i} value={value}>
      {label}
    </StyledRadio>
  ));

  const onBlur = async () => {
    if (trigger) {
      const validated = await trigger(name);
      if (validated) {
        setFormColor(WHITE_COLOR);
        setColor(WHITE_COLOR);
      }
    }
  };

  return (
    <Controller
      name={name}
      control={control}
      rules={rules}
      render={({ field: { name, value, onChange } }) => {
        return (
          <StyledRadioGroup
            name={name}
            value={value}
            size={size}
            color={color}
            onChange={(e) => {
              onChange(e);
              onBlur();
            }}
          >
            {radioOptions}
          </StyledRadioGroup>
        );
      }}
    />
  );
};

export default RadioField;

interface StyleProps {
  color: string;
}

const StyledRadioGroup = styled(Radio.Group)`
  width: 100%;

  & span {
    font-size: 14px;
    color: ${({ color }: StyleProps) => color};
  }

  & span.ant-radio-inner::after {
    background-color: ${() => THEME_COLOR1};
  }
`;

const StyledRadio = styled(Radio)`
  font-size: 16px;
`;
