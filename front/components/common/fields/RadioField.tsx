import React, { useState } from 'react';
import { Controller, FieldError } from 'react-hook-form';
import styled from 'styled-components';
import { Radio } from 'antd';
import { PRIMARY_COLOR2, WHITE_COLOR } from '../../../utils/theme/theme';

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
  const [color, setColor] = useState(PRIMARY_COLOR2);

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

  & span.ant-radio-inner {
    background-color: transparent;
    border: 1px solid ${PRIMARY_COLOR2};
    box-sizing: border-box;
    border-radius: 4px;
    transform: matrix(1, 0, 0, -1, 0, 0);
  }

  & span.ant-radio-inner::after {
    background-color: ${() => PRIMARY_COLOR2};
  }

  & span.ant-radio:hover,
  & span.ant-radio:hover .ant-radio-inner {
    border-color: ${PRIMARY_COLOR2};
  }
`;

const StyledRadio = styled(Radio)`
  font-size: 16px;
`;
