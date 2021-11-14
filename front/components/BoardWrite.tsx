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
import DialogModal from './common/DialogModal';
import Service from '../state/service';

interface IBoardWriteProp {
  onCloseDrawer: () => void;
}

interface BoardWriteForm {
  content: string;
  rightNow: boolean;
  hashtag: string[];
}

const hashtagOptionLabels = [
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
];

const BoardWrite = ({ onCloseDrawer }: IBoardWriteProp) => {
  const { control, handleSubmit, getValues, setValue } = useForm<BoardWriteForm>({
    defaultValues: {
      content: '',
      rightNow: true,
      hashtag: ['오늘의이야기'],
    },
  });

  const router = useRouter();

  const { addPost, saveTempPost, removeTempImage, removeTempPost } = useActions();

  const { latitude, longitude } = useSelector((state: RootState) => state.location);
  const [ imageUrl, setImageUrl ] = useState("");

  const { content, rightNow, imageSource, hashtagIndex } = useSelector(
    (state: RootState) => state.post
  );

  const hashtagOptions = hashtagOptionLabels.map((option: string, index: number) => ({
    label: `#${option}`,
    value: option,
    checked: hashtagIndex?.includes(index) || index === 0 ? true : false,
  }));

  const [isDialogModalVisible, setIsDialogModalVisible] = useState<boolean>(false);

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
    console.log(post);

    addPost(post, removeTempPost);
  };

  const onClickCaptureButton = () => {
    const content = getValues('content');
    const rightNow = getValues('rightNow');
    const hashtag = getValues('hashtag');

    const arr: number[] = hashtagOptionLabels
      .map((val: string, index: number) => (hashtag.includes(val) ? index : undefined))
      .filter((val: number | undefined) => val !== undefined) as number[];
    const toComeBackPath = '/map';

    const data: Post = {
      content,
      rightNow,
      hashtagIndex: arr,
      toComeBackPath,
      latitude,
      longitude,
    };

    saveTempPost(data);
    router.push('/camera');
  };

  const onClickRemoveImageButton = () => {
    removeTempImage();
  };

  const handleCancelDialogCancel = () => {
    setIsDialogModalVisible(false);
  };

  const handleCancelDialogOk = () => {
    setIsDialogModalVisible(false);
    removeTempImage();
    setValue('content', '');
    setValue('rightNow', true);
    onCloseDrawer();
  };

  const onCloseBoardWrite = () => {
    setIsDialogModalVisible(true);
  };

  // GetPost에서 이미지를 사용하는 법 예제입니다.
  const testGetPostHandler = async () => {
    const svc = Service();
    const postId = 40;
    const result = await svc.getPost(postId);
    setImageUrl(result.image);
  }

  return (
    <>
      <Wrapper>
        <InnerWrapper>
          <Container>
            <div>
              <span style={{ position: 'relative', float: 'right', top: '30px', right: '10px' }}>
                <CloseButton onClick={onCloseBoardWrite}>
                  <CloseIcon />
                </CloseButton>
              </span>
              <Address>서울시 종로구 소공동 81</Address>
              <IP>123.45.678.91</IP>
            </div>

            <HorizontalSpace height={COMMON_SIZE_12PX} />
            <form id="boardWriteForm" onSubmit={handleSubmit(onSubmit)}>
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
              {/* <Hr /> */}
              {/* <div>
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
              </div> */}
              <HorizontalSpace height={COMMON_SIZE_12PX} />
              {/* GetPost로 이미지 나오는거 테스트용 */}
              <img src={imageUrl} />
              <Button onClick={testGetPostHandler}>getImage</Button>
            </form>
          </Container>
        </InnerWrapper>
      </Wrapper>
      <DialogModal
        handleCancel={handleCancelDialogCancel}
        handleOk={handleCancelDialogOk}
        isDialogModalVisible={isDialogModalVisible}
        okText="나가기"
        cancleText="취소"
      >
        <p>지금 나가면</p>
        <p>작성된 내용이 삭제돼요 ㅜㅜ</p>
      </DialogModal>
    </>
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
`;

const InnerWrapper = styled.div`
  background-color: ${() => WHITE_COLOR};
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
  float: right;

  &.ant-switch-checked {
    background-color: ${SUB_COLOR1};
  }

  & > .ant-switch-handle::before {
    right: 1px;
  }

  & > .ant-switch-handle {
    width: 20px;
    height: 20px;
    top: 1px;
  }
`;

const NowDescription = styled.div`
  color: ${() => GREY_3};
  font-size: 10px;
`;
