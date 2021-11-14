import { Button, Switch } from 'antd';
import dayjs from 'dayjs';
import { useRouter } from 'next/router';
import React, { useEffect, useState } from 'react';
import { Controller, SubmitHandler, useForm } from 'react-hook-form';
import { useSelector } from 'react-redux';
import styled from 'styled-components';
import { useActions } from '../hooks/use-actions';
import { RootState } from '../state';
import { Post } from '../state/post';

import {
  COMMON_SIZE_16PX,
  COMMON_SIZE_12PX,
  GREY_3,
  GREY_4,
  WHITE_COLOR,
  DARK_COLOR1,
  GREY_COLOR,
  BACK_COLOR2,
  SUB_COLOR1,
} from '../utils/theme/theme';
import SelectButtonField from './common/fields/SelectButtonField';
import TextareaField from './common/fields/TextareaField';
import { HorizontalSpace } from './common/Spaces';
import CloseIcon from '../assets/CloseIcon';
import Service from '../state/service';

interface BoardWriteForm {
  content: string;
  rightNow: boolean;
  hashtag: string[];
}

const hashtagOptions = [
  '오늘의이야기',
  '그냥하는말',
  '대나무숲',
  '제보',
  '하소연',
  '댓글고고',
  '도움요청',
  '친구해요',
  '고백해요',
  '나눔',
  '힐링합시다',
  '장소추천',
  '뷰맛집',
  '동네맛집',
  '후기공유',
].map((option: string, index: number) => ({
  label: `#${option}`,
  value: option,
  checked: index === 0 ? true : false,
}));

const BoardWrite = () => {
  const { control, handleSubmit, getValues, setValue } = useForm<BoardWriteForm>({
    defaultValues: {
      content: '',
      rightNow: true,
      hashtag: ['오늘의이야기'],
    },
  });

  const router = useRouter();

  const { addPost, saveTempPost, removeTempImage } = useActions();

  const { imageSource } = useSelector((state: RootState) => state.post);
  const { latitude, longitude } = useSelector((state: RootState) => state.location);
  const [ imageUrl, setImageUrl ] = useState("");

  const { content, rightNow, removeTempPost } = useSelector((state: RootState) => state.post);

  useEffect(() => {
    setValue('content', content !== null ? content : '');
    setValue('rightNow', rightNow === null ? true : rightNow);
  }, []);

  const onSubmit: SubmitHandler<BoardWriteForm> = (data: BoardWriteForm) => {
    const { content, rightNow, hashtag } = data;
    const date = dayjs().format('YYYY-MM-DD HH:mm:ss');
    const post: Post = {
      content,
      rightNow,
      latitude,
      longitude,
      date,
      hashtag,
      imageSource,
    };

    addPost(post, removeTempPost);
  };

  const onClickCaptureButton = () => {
    const content = getValues('content');
    const rightNow = getValues('rightNow');

    const data: Post = {
      content,
      rightNow,
      toComeBackPath: '/board/write',
    };

    saveTempPost(data);
    router.push('/camera');
  };

  const onClickRemoveImageButton = () => {
    removeTempImage();
  };

  // GetPost에서 이미지를 사용하는 법 예제입니다.
  const testGetPostHandler = async () => {
    const svc = Service();
    const postId = 40;
    const result = await svc.getPost(postId);
    setImageUrl(result.image);
  }

  return (
    <Wrapper>
      <InnerWrapper>
        <Container>
          <div>
            <span style={{ position: 'relative', float: 'right', top: '30px', right: '10px' }}>
              <CloseButton>
                <CloseIcon />
              </CloseButton>
            </span>
            <Address>서울시 종로구 소공동 81</Address>
            <IP>123.45.678.91</IP>
          </div>

          <HorizontalSpace height={COMMON_SIZE_12PX} />
          <form onSubmit={handleSubmit(onSubmit)}>
            <TextAreaWithCheckboxes>
              <TextareaField
                name="content"
                control={control}
                rows={7}
                placeholder="어떤 생각을 하고 계신가요?"
              />
              <Hr />
              <SelectButtonField
                name="hashtag"
                control={control}
                options={hashtagOptions}
                page="write"
                required
              />
            </TextAreaWithCheckboxes>
            <HorizontalSpace height={COMMON_SIZE_12PX} />
            <PictureInfo>
              {imageSource !== null ? (
                <span style={{ position: 'relative' }}>
                  <DeletePhotoButton onClick={onClickRemoveImageButton}>
                    <CloseIcon />
                  </DeletePhotoButton>
                  <CapturedImage src={imageSource} />
                </span>
              ) : (
                <CaptureButton onClick={onClickCaptureButton}>
                  <CaptureButtonIcon
                    src="https://cdn4.iconfinder.com/data/icons/ios7-essence/23/device_camera_capture_photo__-1024.png"
                    height="18"
                    width="18"
                  />
                  <span>카메라 열기</span>
                </CaptureButton>
              )}
            </PictureInfo>
            <Hr />
            <div>
              <span>‘NOW’로 업로드</span>
              <Controller
                name="rightNow"
                control={control}
                render={({ field: { onChange, value } }) => (
                  <StyledSwitch onChange={onChange} checked={value} defaultChecked />
                )}
              />
              <br />
              <NowDescription>
                ‘NOW’로 업로드된 피드는 5시간 후에 자동 삭제되며,
                <br />
                지도 상에 빨간색 블럭으로 표시됩니다.
              </NowDescription>
            </div>
            <HorizontalSpace height={COMMON_SIZE_12PX} />
            <Bottom>
              <WritingButton htmlType="submit">공유하기</WritingButton>
              {/* GetPost로 이미지 나오는거 테스트용 */}
              <img src={imageUrl} />
              <Button onClick={testGetPostHandler}>hi</Button>
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
  margin-left: auto;
  margin-right: auto;
  background-color: ${() => DARK_COLOR1};

  border: 1px solid black;
`;

const InnerWrapper = styled.div`
  margin: 24px 0px 0px 0px;
  background-color: ${() => WHITE_COLOR};
  border-radius: 10px 10px 0px 0px;
`;

const Container = styled.div`
  margin: 16px 23px;
`;

const IP = styled.div`
  color: ${() => GREY_4};
  font-size: 10px;
`;

const Address = styled.div`
  font-size: 13px;
  line-height: 1.4;
  font-weight: 500;
`;

const TextAreaWithCheckboxes = styled.div`
  background-color: #f5f5f5;
  padding: 16px;
  border-radius: 12px;
`;

const Hr = styled.hr`
  margin-top: ${() => COMMON_SIZE_16PX};
  margin-bottom: ${() => COMMON_SIZE_16PX};
  background-color: ${() => GREY_COLOR};
`;

const PictureInfo = styled.div``;

const CaptureButtonIcon = styled.img`
  margin-right: 6px;
`;

const DeletePhotoButton = styled.button`
  width: 17px;
  height: 17px;
  border-radius: 100px;
  position: absolute;
  right: 0;
  right: -8px;
  top: -28px;
  border: none;
  padding: 0px;
  background-color: ${BACK_COLOR2};

  & > svg {
    width: 12px;
    height: 12px;
  }
`;

const CloseButton = styled.button`
  width: 24px;
  height: 24px;
  border-radius: 100px;
  position: absolute;
  right: 0;
  right: -8px;
  top: -28px;
  border: none;
  padding: 0px;
  background-color: ${BACK_COLOR2};

  & > svg {
    position: relative;
    top: 4px;
  }
`;

const CapturedImage = styled.img`
  width: 63px;
  height: 63px;
  border: none;
  border-radius: 4px;
`;

const CaptureButton = styled(Button)`
  width: 124px;
  height: 34px;
  border: 1px solid ${() => GREY_4};
  border-radius: 6px;

  &:hover {
    border: 1px solid ${() => GREY_4};
    color: ${GREY_4};
  }
`;

const StyledSwitch = styled(Switch)`
  height: 23px;
  min-width: 38px;

  & > .ant-switch-handle::before {
    right: 1px;
  }
  & > .ant-switch-handle {
    width: 20px;
    height: 20px;
    top: 1px;
  }

  float: right;
  background-color: ${SUB_COLOR1};
`;

const NowDescription = styled.div`
  color: ${() => GREY_3};
  font-size: 10px;
`;

const WritingButton = styled(Button)`
  margin-top: 83px;
  width: 100%;
  height: 48px;
  border-radius: 4px;
  background-color: ${() => DARK_COLOR1};
  color: ${() => WHITE_COLOR};

  &:hover {
    background-color: ${() => DARK_COLOR1};
    color: ${() => WHITE_COLOR};
  }
  &:active {
    background-color: ${() => DARK_COLOR1};
    color: ${() => WHITE_COLOR};
  }
  &:focus {
    background-color: ${() => DARK_COLOR1};
    color: ${() => WHITE_COLOR};
  }
`;

const Bottom = styled.div`
  text-align: right;
`;
