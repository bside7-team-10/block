import React, { useState } from 'react';
import { Controller } from 'react-hook-form';
import styled from 'styled-components';
import { PRIMARY_COLOR2, WHITE_COLOR, BLACK_COLOR, GREY_3 } from '../../../utils/theme/theme';

export interface SelectButtonFieldProps {
  name: string;
  control: any;
  required: boolean;
  options: any;
  page: string; // 사용하는 페이지 e.g.. signup, write
}

const SelectButtonField = (props: SelectButtonFieldProps) => {
  const { name, control, options = null, page } = props;
  const [localOptions, setLocalOptions] = useState(options);

  const StyledButton = whichPage(page);

  const onOptionClicked = (value: string, onChange: any) => {
    const newOptions = localOptions.map((option: any) => {
      if (option.value === value) {
        return { ...option, checked: !option.checked };
      }
      return option;
    });
    setLocalOptions([...newOptions]);
    const checkedOptions = newOptions
      .filter((option: any) => option.checked)
      .map((option: any) => option.value);
    onChange(checkedOptions);
  };

  return (
    <Controller
      name={name}
      control={control}
      render={({ field: { onChange } }) => {
        return localOptions.map((option: any, i: number) => (
          <StyledButton
            key={i}
            checked={option.checked}
            onClick={(event) => {
              event.preventDefault();
              onOptionClicked(option.value, onChange);
            }}
          >{`${option.label}`}</StyledButton>
        ));
      }}
    />
  );
};

export default SelectButtonField;

function whichPage(page: string) {
  switch (page) {
    case 'signup':
      return StyledSignupButton;
    case 'write':
      return StyledWriteButton;
    default:
      return StyledSignupButton;
  }
}

interface ButtonProps {
  checked: boolean;
}

const StyledSignupButton = styled.button`
  padding: 6px 12px;
  height: 33px;
  box-sizing: border-box;
  border-radius: 37px;
  font-weight: 500;
  font-size: 14px;
  margin-right: 5px;
  margin-bottom: 5px;
  border: ${({ checked }: ButtonProps) =>
    checked ? '1px solid transparent' : `1px solid ${PRIMARY_COLOR2}`};
  color: ${({ checked }: ButtonProps) => (checked ? `${BLACK_COLOR}` : `${PRIMARY_COLOR2}`)};
  background-color: ${({ checked }: ButtonProps) => (checked ? `${WHITE_COLOR}` : 'transparent')};
`;

const StyledWriteButton = styled.button`
  padding: 3px 6px;
  height: 21px;
  box-sizing: border-box;
  border-radius: 37px;
  font-weight: 500;
  font-size: 10px;
  margin-right: 3px;
  margin-bottom: 6px;
  border: 1px solid ${GREY_3};
  color: ${({ checked }: ButtonProps) => (checked ? `${WHITE_COLOR}` : `${GREY_3}`)};
  background-color: ${({ checked }: ButtonProps) => (checked ? `${GREY_3}` : 'transparent')};
`;
