import TextArea from 'antd/lib/input/TextArea';
import React from 'react';
import { Controller } from 'react-hook-form';
import styled from 'styled-components';

interface TextareaFieldProps {
  type?: string;
  name: string;
  control: any;
  allowClear?: boolean;
  placeholder: string;
  rows: number;
}

const Textarea = (props: TextareaFieldProps) => {
  const { name, control, placeholder, rows } = props;

  return (
    <Controller
      control={control}
      name={name}
      render={({ field: { name, onChange, value } }) => (
        <StyledTextArea
          name={name}
          value={value}
          placeholder={placeholder}
          onChange={onChange}
          rows={rows}
        />
      )}
    />
  );
};

export default Textarea;

const StyledTextArea = styled(TextArea)`
  border: none;
  background-color: inherit;
  padding: 0px;
  resize: none;
`;
