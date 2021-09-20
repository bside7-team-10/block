import { Controller, FieldError } from "react-hook-form";
import styled from "styled-components";
import { Radio } from "antd";
import { THEME_COLOR1 } from "../../../utils/theme/theme";

interface RadioOption {
  label: string;
  value: string | number;
}

export interface RadioFieldProps {
  type?: string;
  name: string;
  control: any;
  size: "small" | "middle" | "large";
  required?: boolean;
  error?: FieldError;
  rules?: any;
  prefix?: string;
  options?: any;
}

const RadioField = (props: RadioFieldProps) => {
  const { name, control, rules, size, options = null } = props;

  const radioOptions = options?.map(({ label, value }: RadioOption, i: number) => (
    <StyledRadio key={i} value={value}>
      {label}
    </StyledRadio>
  ));

  return (
    <Controller
      name={name}
      control={control}
      rules={rules}
      render={({ field: { name, value, onChange } }) => {
        return (
          <StyledRadioGroup name={name} value={value} size={size} onChange={onChange}>
            {radioOptions}
          </StyledRadioGroup>
        );
      }}
    />
  );
};

export default RadioField;

const StyledRadioGroup = styled(Radio.Group)`
  & span {
    font-size: 16px;
    color: ${() => THEME_COLOR1};
  }

  & span.ant-radio-inner::after {
    background-color: ${() => THEME_COLOR1};
  }
`;

const StyledRadio = styled(Radio)`
  font-size: 16px;
`;
