import React from 'react';
import { Controller, FieldError } from 'react-hook-form';
import styled, { css } from 'styled-components';
import { Input } from 'antd';
import { FORM_ERROR_COLOR, THEME_COLOR1 } from '../../../utils/theme/theme';
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
  color?: string;
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
    color = THEME_COLOR1,
    error,
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
              color={color}
              error={error}
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
            color={color}
            error={error}
          />
        );
      }}
    />
  );
};

export default InputField;

interface StyleProps {
  opacity: number;
  color: string;
  error?: any;
}

const InputStyle = (opacity: number, color: string, error: any) => css`
  width: 100%;
  border: none;
  border-radius: 0;
  background-color: transparent;
  color: ${() => (error ? FORM_ERROR_COLOR : color)};

  ::placeholder {
    color: ${() => (error ? FORM_ERROR_COLOR : color)};
    font-style: normal;
    font-weight: normal;
    opacity: ${() => (error ? 1 : opacity)};
  }
`;

const StyledInput = styled(Input)`
  ${({ opacity, color, error }: StyleProps) => InputStyle(opacity, color, error)};
`;

const StyledPasswordInput = styled(Input.Password)`
  ${({ opacity, color, error }: StyleProps) => InputStyle(opacity, color, error)};
`;
