import React, { useState } from 'react';
import styled from 'styled-components';
import { Controller } from 'react-hook-form';
import { WHITE_COLOR } from '../../../utils/theme/theme';
import Avatar from '../../../assets/Avatar';

export interface SelectButtonFieldProps {
  name: string;
  control: any;
  required: boolean;
}

const SelectAvatarField = (props: SelectButtonFieldProps) => {
  const { name, control } = props;
  const [avatarOptions, setAvatarOptions] = useState(
    // eslint-disable-next-line @typescript-eslint/no-unused-vars
    [...new Array(20)].map((_) => ({ checked: false }))
  );

  const onAvatarClicked = (index: number, onChange: any) => {
    const newOptions = avatarOptions.map(({ checked }, i) => {
      if (i === index) {
        return { checked: !checked };
      }
      return { checked: false };
    });
    setAvatarOptions([...newOptions]);
    const checkedOption = newOptions.filter((option) => option.checked);
    if (checkedOption.length) {
      onChange(true);
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
            {avatarOptions.map((option, i) => (
              <AvatarWrapper
                key={i}
                onClick={() => onAvatarClicked(i, onChange)}
                checked={option.checked}
              >
                <Avatar />
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
    checked ? `3px solid ${WHITE_COLOR}` : '3px solid transparent'};
`;
