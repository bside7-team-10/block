import React, { useState } from 'react';
import styled from 'styled-components';
import { Controller } from 'react-hook-form';
import { PRIMARY_COLOR } from '../../../utils/theme/theme';

export interface SelectButtonFieldProps {
  name: string;
  control: any;
  required: boolean;
  options: any;
}

interface AvatarOption {
  option: string;
  checked: boolean;
}

const SelectAvatarField = (props: SelectButtonFieldProps) => {
  const { name, control, options } = props;
  const [avatarOptions, setAvatarOptions] = useState(
    options.map((option: string) => ({ option, checked: false }))
  );

  const onAvatarClicked = (index: number, onChange: any) => {
    const newOptions = avatarOptions.map(({ option, checked }: AvatarOption, i: number) => {
      if (i === index) {
        return { option, checked: !checked };
      }
      return { option, checked: false };
    });
    setAvatarOptions([...newOptions]);
    const checkedOption = newOptions.filter((option: AvatarOption) => option.checked);
    if (checkedOption.length) {
      onChange(checkedOption[0].option);
    } else {
      onChange(false);
    }
  };

  return (
    <Controller
      name={name}
      control={control}
      render={({ field: { onChange } }) => {
        return (
          <Wrapper>
            {avatarOptions.map(({ option, checked }: AvatarOption, i: number) => (
              <AvatarWrapper key={i} onClick={() => onAvatarClicked(i, onChange)} checked={checked}>
                <img src={`/static/images/signup/${option}`} width="50" height="50" key={i} />
              </AvatarWrapper>
            ))}
          </Wrapper>
        );
      }}
    />
  );
};

export default SelectAvatarField;

interface AvatarWrapperProps {
  checked: boolean;
}

const Wrapper = styled.div`
  display: flex;
  flex-wrap: wrap;
`;

const AvatarWrapper = styled.div`
  border-radius: 100%;
  line-height: 0;
  margin-right: 5px;
  margin-bottom: 5px;
  border: ${({ checked }: AvatarWrapperProps) =>
    checked ? `3px solid ${PRIMARY_COLOR}` : '3px solid transparent'};
`;
