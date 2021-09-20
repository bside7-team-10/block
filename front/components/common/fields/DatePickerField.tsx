import { Controller, FieldError } from "react-hook-form";
import styled from "styled-components";
import { DatePicker } from "antd";
import { THEME_COLOR1 } from "../../../utils/theme/theme";
export interface DatePickerFieldProps {
  type?: string;
  name: string;
  control: any;
  placeholder?: string;
  size: "small" | "middle" | "large";
  required?: boolean;
  error?: FieldError;
  allowClear?: boolean;
  rules?: any;
  prefix?: string;
}

const DatePickerField = (props: DatePickerFieldProps) => {
  const { name, control, placeholder, size, rules, allowClear = false } = props;

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
            allowClear={allowClear}
            onChange={onChange}
          />
        );
      }}
    />
  );
};

export default DatePickerField;

const StyledDatePicker = styled(DatePicker)`
  width: 100%;
  border: none;
  border-radius: 0;

  & input::placeholder {
    color: ${() => THEME_COLOR1};
    font-style: normal;
    font-weight: normal;
  }
`;
