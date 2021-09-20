import React from "react";
import styled from "styled-components";
import { FieldErrors } from "react-hook-form";

import DatePickerField, { DatePickerFieldProps } from "./DatePickerField";
import InputField, { InputFieldProps } from "./InputField";
import RadioField, { RadioFieldProps } from "./RadioField";
import { THEME_COLOR1, FORM_ERROR_COLOR } from "../../../utils/theme/theme";

type FieldsInterface = DatePickerFieldProps | InputFieldProps | RadioFieldProps;

const Fields = (props: FieldsInterface) => {
  const { type, name, control, error, prefix, required = false, ...rest } = props;

  let ReturnComponent = InputField;

  switch (type) {
    case "date":
      ReturnComponent = DatePickerField;
      break;
    case "radio":
      ReturnComponent = RadioField;
      break;
  }

  const getErrorMessage = (error: FieldErrors) => {
    switch (error.type) {
      case "required":
        return "*필수입력";
      case "validate":
        return "비밀번호가 틀립니다";
      default:
        return "";
    }
  };

  const rules = { required: required };

  return (
    <FieldsWrapper>
      <Wrapper error={error}>
        {prefix && <Prefix>{prefix}</Prefix>}
        <ReturnComponentWrapper>
          <ReturnComponent name={name} control={control} rules={rules} {...rest} />
        </ReturnComponentWrapper>
      </Wrapper>
      {error && <Error>{getErrorMessage(error)}</Error>}
    </FieldsWrapper>
  );
};

export default Fields;

interface ErrorProps {
  error?: any;
}

const ReturnComponentWrapper = styled.div`
  width: 100%;
  position: absolute;
  left: 50px;
  overflow-x: hidden;
`;

const Wrapper = styled.div`
  position: relative;
  display: flex;
  height: 40px;
  align-items: center;
  border-bottom: 1px solid;
  border-radius: 0;
  border-color: ${({ error }: ErrorProps) => (error ? FORM_ERROR_COLOR : THEME_COLOR1)};
`;

const FieldsWrapper = styled.div`
  margin-bottom: 10px;
`;

const Error = styled.div`
  font-size: 14px;
  margin-top: 3px;
  color: ${() => FORM_ERROR_COLOR};
`;

const Prefix = styled.div`
  font-style: normal;
  font-weight: bold;
  font-size: 16px;
  color: ${() => THEME_COLOR1};
`;
