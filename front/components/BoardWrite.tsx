import { Button } from 'antd';
import Avatar from 'antd/lib/avatar/avatar';
import Checkbox from 'antd/lib/checkbox/Checkbox';
import { useRouter } from 'next/router';
import React, { useEffect, useState } from 'react';
import { Controller, SubmitHandler, useForm } from 'react-hook-form';
import { useSelector } from 'react-redux';
import styled from 'styled-components';
import { useActions } from '../hooks/use-actions';
import { RootState } from '../state';

import { COMMON_SIZE_12PX, GREY_COLOR } from '../utils/theme/theme';
import TextareaField from './common/fields/TextareaField';
import { HorizontalSpace } from './common/Spaces';

interface BoardWriteForm {
  content: string;
  rightNow: boolean;
}

const BoardWrite = () => {
  const { control, handleSubmit, getValues, setValue } = useForm<BoardWriteForm>({
    defaultValues: {
      content: '',
      rightNow: false,
    },
  });

  const router = useRouter();

  const { addPost } = useActions();

  const src = useSelector((state: RootState) => state.image.src);

  useEffect(() => {
    const content = sessionStorage.getItem('postContent');
    const rightNow = sessionStorage.getItem('postRightNow');
    setValue('content', content !== null ? content : '');
    setValue('rightNow', rightNow === 'true' ? true : false);
    // console.log(content, rightNow);
  }, []);

  const removesessionStorageItems = () => {
    sessionStorage.removeItem('postContent');
    sessionStorage.removeItem('postRightNow');
    sessionStorage.removeItem('toComeBackPath');
  };

  const onSubmit: SubmitHandler<BoardWriteForm> = (data: BoardWriteForm) => {
    addPost(data, removesessionStorageItems);
  };

  const onClickCaptureButton = () => {
    const content = getValues('content');
    const rightNow = getValues('rightNow');

    sessionStorage.setItem('postContent', content);
    sessionStorage.setItem('postRightNow', rightNow.toString());
    sessionStorage.setItem('toComeBackPath', '/board/write');
    router.push('/camera');
  };

  return (
    <Wrapper>
      <InnerWrapper>
        <Container>
          <UserInfo>
            <ProfileImage
              shape="square"
              size={36}
              src="https://cdn.pixabay.com/photo/2016/08/08/09/17/avatar-1577909_1280.png"
            />
            <Nickname>닉네임</Nickname>
            <Address>GPS(지정한 정확도에 따라 주소명)</Address>
          </UserInfo>
          <HorizontalSpace height={COMMON_SIZE_12PX} />
          <form onSubmit={handleSubmit(onSubmit)}>
            <TextareaField
              name="content"
              control={control}
              rows={10}
              placeholder="무슨 생각을 하고 계신가요?"
            />
            <HorizontalSpace height={COMMON_SIZE_12PX} />
            <PictureInfo>
              {src !== null ? (
                <CapturedImage src={src} />
              ) : (
                <CaptureButton onClick={onClickCaptureButton}>
                  <CaptureButtonIcon src="https://cdn4.iconfinder.com/data/icons/ios7-essence/23/device_camera_capture_photo__-1024.png" />
                </CaptureButton>
              )}
              <GuideMessage>
                지금 찍은 사진도
                <br />
                공유해보는건 어떨까요?
              </GuideMessage>
            </PictureInfo>
            <HorizontalSpace height={COMMON_SIZE_12PX} />
            <Bottom>
              <Controller
                name="rightNow"
                control={control}
                render={({ field: { name, onChange, value } }) => (
                  <Checkbox name={name} onChange={onChange} checked={value}>
                    Right Now?
                  </Checkbox>
                )}
              />
              <WritingButton htmlType="submit">글쓰기</WritingButton>
            </Bottom>
          </form>
        </Container>
      </InnerWrapper>
    </Wrapper>
  );
};

export default BoardWrite;

export const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 360px;
  // height: 420px;
  margin-left: auto;
  margin-right: auto;
  background-color: blue;
`;

const InnerWrapper = styled.div`
  margin: 9px 10px;
  background-color: ${() => GREY_COLOR};
`;

const Container = styled.div`
  margin: 9px 10px;
`;

const UserInfo = styled.div`
  height: 36px;
`;

const ProfileImage = styled(Avatar)`
  float: left;
`;

const Nickname = styled.div`
  font-size: 13px;
  line-height: 1.4;
  margin-left: 40px;
`;
const Address = styled.div`
  font-size: 13px;
  line-height: 1.4;
  margin-left: 40px;
`;

const TextBox = styled.div``;

const PictureInfo = styled.div`
  height: 86px;
`;

const CaptureButtonIcon = styled.img`
  width: 100%;
`;

const CapturedImage = styled.img`
  width: 86px;
  height: 86px;
  float: right;
  border: none;
  border-radius: 4px;
`;

const CaptureButton = styled(Button)`
  width: 86px;
  height: 86px;
  float: right;
  border: none;
  border-radius: 4px;
`;

const GuideMessage = styled.div`
  text-align: right;
  margin-right: 94px;
`;

const WritingButton = styled(Button)`
  width: 130px;
  height: 48px;
  border-radius: 4px;
`;

const Bottom = styled.div`
  text-align: right;
`;
