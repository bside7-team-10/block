import TextArea from 'antd/lib/input/TextArea';
import React from 'react';
import { Controller } from 'react-hook-form';

interface TextareaFieldProps {
  type?: string;
  name: string;
  control: any;
  allowClear?: boolean;
  placeholder: string;
  rows: number;
}

const Textarea = (props: TextareaFieldProps) => {
  const { name, control, placeholder, rows, ...rest } = props;

  return (
    <Controller
      control={control}
      name={name}
      render={({ field: { name, onChange, value } }) => (
        <TextArea
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
