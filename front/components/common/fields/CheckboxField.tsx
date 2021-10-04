import React, { useState } from 'react';
import { Controller, FieldError } from 'react-hook-form';
import styled from 'styled-components';
import { Checkbox } from 'antd';
import { BLACK_COLOR, THEME_COLOR1, WHITE_COLOR } from '../../../utils/theme/theme';

export interface CheckboxFieldProps {
  type?: string;
  name: string;
  control: any;
  size: 'small' | 'middle' | 'large';
  required?: boolean;
  error?: FieldError;
  rules?: any;
  prefix?: string;
  options?: any;
  color?: string;
  inputcolor?: string;
  marginBottom?: string;
  trigger?: any;
  setFormColor?: any;
  current?: any;
}

const CheckboxField = (props: CheckboxFieldProps) => {
  const { name, control, rules, trigger, setFormColor, current, options = null } = props;
  const [color, setColor] = useState(THEME_COLOR1);

  const onBlur = async () => {
    if (trigger) {
      const validated = await trigger(name);
      if (validated) {
        setFormColor(WHITE_COLOR);
        setColor(WHITE_COLOR);
        return;
      }
      setFormColor(THEME_COLOR1);
      setColor(THEME_COLOR1);
    }
  };

  return (
    <Controller
      name={name}
      control={control}
      rules={rules}
      render={({ field: { name, value, onChange } }) => {
        return (
          <StyledCheckboxGroup
            name={name}
            value={value}
            options={options}
            color={color}
            // TODO. 현재 보기 두개의 경우만 사용가능. 필요시 추후 업데이트 요망.
            onChange={(values) => {
              if (values.length === 2) {
                if (current[0] === 1) {
                  onChange([0]);
                  return;
                }
                onChange([1]);
                return;
              }
              onChange(values);
              onBlur();
            }}
          />
        );
      }}
    />
  );
};

export default CheckboxField;

interface StyleProps {
  color: string;
}

const StyledCheckboxGroup = styled(Checkbox.Group)`
  width: 100%;

  & span {
    font-size: 14px;
    color: ${({ color }: StyleProps) => color};
  }

  & span.ant-checkbox-inner {
    background-color: transparent;
    border: 1px solid ${THEME_COLOR1};
    box-sizing: border-box;
    border-radius: 4px;
  }

  & span.ant-checkbox-checked .ant-checkbox-inner {
    background-color: ${WHITE_COLOR};
  }

  & span.ant-checkbox-checked .ant-checkbox-inner::after {
    border-color: ${BLACK_COLOR};
  }

  & span.ant-checkbox-checked .ant-checkbox-inner {
    border-color: transparent;
  }
`;
