import React, { useState } from 'react';
import styled from 'styled-components';
import { FieldErrors } from 'react-hook-form';

import DatePickerField, { DatePickerFieldProps } from './DatePickerField';
import InputField, { InputFieldProps } from './InputField';
import RadioField, { RadioFieldProps } from './RadioField';
import { THEME_COLOR1, FORM_ERROR_COLOR } from '../../../utils/theme/theme';

type FieldsInterface = DatePickerFieldProps | InputFieldProps | RadioFieldProps;

const Fields = (props: FieldsInterface) => {
  const {
    type,
    name,
    control,
    error,
    prefix,
    inputcolor,
    trigger,
    color = THEME_COLOR1,
    marginBottom = '10px',
    required = false,
    ...rest
  } = props;

  const [formColor, setFormColor] = useState(color);

  const ReturnComponent = getReturnComponent(type);

  const getErrorMessage = (error: FieldErrors) => {
    switch (error.type) {
      case 'required':
        return '*필수입력';
      case 'validate':
        if (error?.ref?.name === 'confirmPassword') {
          return '비밀번호가 일치하지 않습니다.';
        }
        if (error?.ref?.name === 'email') {
          return '이메일 형식이 맞지 않습니다.';
        }
        return;
      default:
        return '';
    }
  };

  const rules = { required: required };

  return (
    <FieldsWrapper marginBottom={marginBottom}>
      <Wrapper error={error} color={formColor}>
        {prefix && (
          <Prefix color={formColor} error={error}>
            {prefix}
          </Prefix>
        )}
        <ReturnComponentWrapper>
          <ReturnComponent
            name={name}
            control={control}
            type={type}
            rules={rules}
            color={formColor}
            inputcolor={inputcolor}
            trigger={trigger}
            setFormColor={setFormColor}
            error={error}
            {...rest}
          />
        </ReturnComponentWrapper>
      </Wrapper>
      {error && <Error>{getErrorMessage(error)}</Error>}
    </FieldsWrapper>
  );
};

export default Fields;

function getReturnComponent(type: string | undefined) {
  switch (type) {
    case 'date':
      return DatePickerField;
    case 'radio':
      return RadioField;
    default:
      return InputField;
  }
}

interface inputcolorStyleProps {
  error?: any;
  color?: string;
}
interface MarginBottomProps {
  marginBottom: string;
}

const ReturnComponentWrapper = styled.div`
  position: absolute;
  left: 50px;
  width: 80%;
`;

const Wrapper = styled.div`
  position: relative;
  display: flex;
  height: 40px;
  align-items: center;
  border-bottom: 0.75px solid;
  border-radius: 0;
  border-color: ${({ error, color }: inputcolorStyleProps) => (error ? FORM_ERROR_COLOR : color)};
`;

const FieldsWrapper = styled.div`
  margin-bottom: ${({ marginBottom }: MarginBottomProps) => marginBottom};
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
  color: ${({ error, color }: inputcolorStyleProps) => (error ? FORM_ERROR_COLOR : color)};
`;
