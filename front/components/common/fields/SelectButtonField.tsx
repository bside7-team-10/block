import React, { useState } from 'react';
import { Controller } from 'react-hook-form';
import styled from 'styled-components';
import { PRIMARY_COLOR2, WHITE_COLOR, BLACK_COLOR } from '../../../utils/theme/theme';

export interface SelectButtonFieldProps {
  name: string;
  control: any;
  required: boolean;
  options: any;
}

const SelectButtonField = (props: SelectButtonFieldProps) => {
  const { name, control, options = null } = props;
  const [localOptions, setLocalOptions] = useState(options);

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

interface ButtonProps {
  checked: boolean;
}

const StyledButton = styled.button`
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
