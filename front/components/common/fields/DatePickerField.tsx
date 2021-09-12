import "date-fns";
import React from "react";
import Grid from "@material-ui/core/Grid";
import DateFnsUtils from "@date-io/date-fns";
import { MuiPickersUtilsProvider, KeyboardDatePicker } from "@material-ui/pickers";
import { TextField } from "@material-ui/core";
import { Controller, FieldErrors } from "react-hook-form";
import styled from "styled-components";

interface DatePickerFieldProps {
  name: string;
  control: any;
  required?: boolean;
  label: string;
  variant?: "filled" | "outlined";
}

const DatePickerField = (props: DatePickerFieldProps) => {
  const { name, control, required = false, label, variant } = props;

  const rules = { required: required };

  const getErrorMessage = (error: FieldErrors) => {
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
            <MuiPickersUtilsProvider utils={DateFnsUtils}>
              <Grid container justifyContent="space-around">
                <KeyboardDatePicker
                  margin="normal"
                  id="date-picker-dialog"
                  label="Date picker dialog"
                  format="MM/dd/yyyy"
                  value={value}
                  onChange={onChange}
                  KeyboardButtonProps={{
                    "aria-label": "change date",
                  }}
                />
              </Grid>
            </MuiPickersUtilsProvider>
          );
        }}
        name={name}
        control={control}
        rules={rules}
      />
    </>
  );
};

export default DatePickerField;

const StyledTextField = styled(TextField)`
  margin-bottom: 10px;
  width: 100%;
`;
