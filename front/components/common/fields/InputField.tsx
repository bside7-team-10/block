import { Controller, FieldError } from 'react-hook-form';
import styled from 'styled-components';
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
}

const InputField = (props: InputFieldProps) => {
  const { name, control, type, size, placeholder, rules, allowClear = false } = props;

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
          />
        );
      }}
    />
  );
};

export default InputField;

const StyledInput = styled(Input)`
  width: 100%;
  border: none;
  border-radius: 0;
  background-color: transparent;

  ::placeholder {
    color: ${() => THEME_COLOR1};
    font-style: normal;
    font-weight: normal;
    opacity: 0.7;
  }
`;

const StyledPasswordInput = styled(Input.Password)`
  width: 100%;
  border: none;
  border-radius: 0;
  background-color: transparent;

  ::placeholder {
    color: ${() => THEME_COLOR1};
    font-style: normal;
    font-weight: normal;
    opacity: 0.7;
  }
`;
