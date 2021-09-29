import React from 'react';
import { Controller, FieldError } from 'react-hook-form';
import styled, { css } from 'styled-components';
import { Input } from 'antd';
import { THEME_COLOR1 } from '../../../utils/theme/theme';
export interface InputFieldProps {
  type?: string;
  name: string;
  control: any;
  required?: boolean;
  size: 'small' | 'middle' | 'large';
  placeholder?: string;
  allowClear?: boolean;
  error?: FieldError;
  rules?: any;
  prefix?: string;
  opacity?: number;
}

const InputField = (props: InputFieldProps) => {
  const {
    name,
    control,
    type,
    size,
    placeholder,
    rules,
    allowClear = false,
    opacity = 1.0,
  } = props;

  return (
    <Controller
      name={name}
      control={control}
      rules={rules}
      render={({ field: { name, value, onChange } }) => {
        if (type === 'password') {
          return (
            <StyledPasswordInput
              name={name}
              value={value}
              size={size}
              placeholder={placeholder}
              visibilityToggle={false}
              onChange={onChange}
              opacity={opacity}
            />
          );
        }
        return (
          <StyledInput
            name={name}
            value={value}
            size={size}
            placeholder={placeholder}
            allowClear={allowClear}
            onChange={onChange}
            opacity={opacity}
          />
        );
      }}
    />
  );
};

export default InputField;

interface StyleProps {
  opacity: number;
}

const InputStyle = (opacity: number) => css`
  width: 100%;
  border: none;
  border-radius: 0;
  background-color: transparent;

  ::placeholder {
    color: ${() => THEME_COLOR1};
    font-style: normal;
    font-weight: normal;
    opacity: ${opacity};
  }
`;

const StyledInput = styled(Input)`
  ${({ opacity }: StyleProps) => InputStyle(opacity)}
`;

const StyledPasswordInput = styled(Input.Password)`
  ${({ opacity }: StyleProps) => InputStyle(opacity)}
`;
