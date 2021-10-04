import React from 'react';
import { Controller, FieldError } from 'react-hook-form';
import styled from 'styled-components';
import { DatePicker } from 'antd';
import { THEME_COLOR1, WHITE_COLOR, FORM_ERROR_COLOR } from '../../../utils/theme/theme';

export interface DatePickerFieldProps {
  type?: string;
  name: string;
  control: any;
  placeholder?: string;
  size: 'small' | 'middle' | 'large';
  required?: boolean;
  error?: FieldError;
  allowClear?: boolean;
  rules?: any;
  prefix?: string;
  color?: string;
  inputcolor?: string;
  marginBottom?: string;
  trigger?: any;
  setFormColor?: any;
}

const DatePickerField = (props: DatePickerFieldProps) => {
  const {
    name,
    control,
    placeholder,
    size,
    rules,
    trigger,
    setFormColor,
    allowClear = false,
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
        return (
          <StyledDatePicker
            suffixIcon={null}
            name={name}
            value={value}
            placeholder={placeholder}
            size={size}
            error={error}
            allowClear={allowClear}
            onChange={onChange}
            bordered={false}
            onBlur={onBlur}
          />
        );
      }}
    />
  );
};

export default DatePickerField;

interface ErrorProps {
  error: any;
}

const StyledDatePicker = styled(DatePicker)`
  width: 100%;
  border: none;
  border-radius: 0;
  background-color: transparent;

  & input {
    color: ${WHITE_COLOR};
  }

  & input::placeholder {
    color: ${({ error }: ErrorProps) => (error ? FORM_ERROR_COLOR : THEME_COLOR1)};
    font-style: normal;
    font-weight: normal;
    font-size: 14px;
  }

  &.ant-picker-large .ant-picker-input > input {
    font-size: 14px;
  }
`;
