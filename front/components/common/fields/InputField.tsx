import React from 'react';
import { Controller, FieldError } from 'react-hook-form';
import styled, { css } from 'styled-components';
import { Input } from 'antd';
import { FORM_ERROR_COLOR, THEME_COLOR1, WHITE_COLOR } from '../../../utils/theme/theme';
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
  inputcolor?: string;
  marginBottom?: string;
  trigger?: any;
  setFormColor?: any;
}

const InputField = (props: InputFieldProps) => {
  const {
    name,
    control,
    type,
    size,
    placeholder,
    rules,
    trigger,
    setFormColor,
    allowClear = false,
    opacity = 1.0,
    color = THEME_COLOR1,
    inputcolor = WHITE_COLOR,
    error,
  } = props;

  const onBlur = async () => {
    if (trigger) {
      const validated = await trigger(name);
      if (validated) {
        setFormColor(WHITE_COLOR);
      }
    }
  };

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
              onChange={(e) => {
                onChange(e);
                onBlur();
              }}
              opacity={opacity}
              color={color}
              inputcolor={inputcolor}
              error={error}
              bordered={false}
              onBlur={onBlur}
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
            inputcolor={inputcolor}
            error={error}
            bordered={false}
            onBlur={onBlur}
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
  inputcolor: string;
  error?: any;
}

const InputStyle = (opacity: number, color: string, inputcolor: string, error: any) => css`
  width: 100%;
  border: none;
  border-radius: 0;
  background-color: transparent;
  color: ${() => (error ? FORM_ERROR_COLOR : inputcolor)};

  ::placeholder {
    color: ${() => (error ? FORM_ERROR_COLOR : color)};
    font-style: normal;
    font-weight: normal;
    opacity: ${() => (error ? 1 : opacity)};
    font-size: 14px;
  }

  &:-webkit-autofill,
  &:-webkit-autofill:hover,
  &:-webkit-autofill:focus,
  &:-webkit-autofill:active {
    transition: ${WHITE_COLOR} 9999s ease-out;
    -webkit-transition: ${WHITE_COLOR} 9999s ease-out;
    -webkit-transition-delay: 9999s;
    -webkit-text-fill-color: ${WHITE_COLOR} !important;
  }
`;

const StyledInput = styled(Input)`
  ${({ opacity, color, inputcolor, error }: StyleProps) =>
    InputStyle(opacity, color, inputcolor, error)};
`;

const StyledPasswordInput = styled(Input.Password)`
  ${({ opacity, color, inputcolor, error }: StyleProps) =>
    InputStyle(opacity, color, inputcolor, error)};
`;
