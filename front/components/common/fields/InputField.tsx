import { TextField } from "@material-ui/core";
import { Controller, FieldErrors } from "react-hook-form";
import styled from "styled-components";

interface InputFieldProps {
  name: string;
  control: any;
  required?: boolean;
  label: string;
  variant?: "filled" | "outlined";
  onChange?: (value: any) => void;
}

const InputField = (props: InputFieldProps) => {
  const { name, control, required = false, label, variant, onChange: handleChange } = props;

  const rules = { required: required };

  const getErrorMessage = (error: FieldErrors) => {
    if (error.message) return error.message;
    switch (error.type) {
      case "required":
        return "*필수 입력";
    }
  };

  return (
    <>
      <Controller
        render={({ field: { name, value, onChange }, fieldState: { invalid, isTouched, isDirty, error }, formState }) => {
          return (
            <StyledTextField
              label={label}
              variant={variant}
              name={name}
              value={value}
              onChange={(e) => {
                onChange(e);
                handleChange && handleChange(e);
              }}
              error={error ? true : false}
              helperText={error ? getErrorMessage(error) : ""}
            />
          );
        }}
        name={name}
        control={control}
        rules={rules}
      />
    </>
  );
};

export default InputField;

const StyledTextField = styled(TextField)`
  margin-bottom: 10px;
  width: 100%;
`;
