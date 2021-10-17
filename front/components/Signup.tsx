import React, { useEffect, useState } from 'react';
import { useForm } from 'react-hook-form';
import styled from 'styled-components';
import router from 'next/router';
import dayjs from 'dayjs';

import { useActions } from '../hooks/use-actions';
import Logo from '../assets/Logo';
import { User } from '../state/user';
import Fields from '../components/common/fields/Fields';
import { SignupGlobalStyle } from './styled/SignupGlobalStyle';
import { ButtonCommon } from './common/ButtonCommon';
import SelectButtonField from './common/fields/SelectButtonField';
import SelectAvatarField from './common/fields/SelectAvatarField';
import { HorizontalSpace } from './common/Spaces';
import {
  PRIMARY_COLOR,
  PRIMARY_COLOR2,
  WHITE_COLOR,
  COMMON_SIZE_72PX,
  COMMON_SIZE_32PX,
  COMMON_SIZE_24PX,
} from '../utils/theme/theme';
import { GENDER_OPTION_VALUES, BUTTON_ACTIVE, BUTTON_INACTIVE } from '../lib/constants';
import { checkEmailFormat } from '../utils';

const Signup = () => {
  const {
    control,
    handleSubmit,
    getValues,
    register,
    setError,
    watch,
    trigger,
    formState: { errors },
  } = useForm({ mode: 'onBlur', defaultValues });
  const { userSignup } = useActions();
  const [step, setStep] = useState(SIGNUP_STEP.STEP1);
  const [title, setTitle] = useState(STEP_TITLE.STEP1);
  const [description, setDescription] = useState('');
  const [nextBtnActive, setNextBtnActive] = useState(BUTTON_INACTIVE);

  const onSubmit = (data: User) => {
    const { birthday } = data;
    data.birthday = dayjs(birthday).format('YYYY-MM-DD');
    userSignup(data);
    setStep(step + 1);
  };

  const onStartBtnClicked = () => {
    router.push('/');
  };

  const onNextButtonClicked = () => {
    if (nextBtnActive !== BUTTON_ACTIVE) return;

    if (step === SIGNUP_STEP.STEP1) {
      const email = getValues(FIELDS_NAME.EMAIL);
      const password = getValues(FIELDS_NAME.PASSWORD);
      const confirmPassword = getValues(FIELDS_NAME.CONFIRM_PASSWORD);
      if (!email) {
        setError(FIELDS_NAME.EMAIL, { type: 'required' });
      }
      if (!password) {
        setError(FIELDS_NAME.PASSWORD, { type: 'required' });
      }
      if (!confirmPassword) {
        setError(FIELDS_NAME.CONFIRM_PASSWORD, { type: 'required' });
      }
      if (password !== confirmPassword) {
        setError(FIELDS_NAME.CONFIRM_PASSWORD, { type: 'validate' });
      }
      if (!email || !password || !confirmPassword || password !== confirmPassword) return;
    } else if (step === SIGNUP_STEP.STEP2) {
      const nickName = getValues(FIELDS_NAME.NICKNAME);
      const birthday = getValues(FIELDS_NAME.BIRTHDAY);
      if (!nickName) {
        setError(FIELDS_NAME.NICKNAME, { type: 'required' });
      }
      if (!birthday) {
        setError(FIELDS_NAME.BIRTHDAY, { type: 'required' });
      }
      if (!nickName || !birthday) return;
    } else if (step === SIGNUP_STEP.STEP3) {
      // TODO. step3 validation
    } else if (step === SIGNUP_STEP.STEP4) {
      // TODO. step4 validation
    }
    setStep(step + 1);
  };

  const checkConfirmPassword = (confirmPassword: string) => {
    return confirmPassword === getValues(FIELDS_NAME.PASSWORD);
  };

  const watchEmail = watch(FIELDS_NAME.EMAIL);
  const watchPassword = watch(FIELDS_NAME.PASSWORD);
  const watchConfirmPassword = watch(FIELDS_NAME.CONFIRM_PASSWORD);
  const watchNickName = watch(FIELDS_NAME.NICKNAME);
  const watchBirthday = watch(FIELDS_NAME.BIRTHDAY);
  const watchGender = watch(FIELDS_NAME.GENDER);
  const watchInterests: [] = watch(FIELDS_NAME.INTERESTS);
  const watchAvatar = watch(FIELDS_NAME.AVATAR);

  useEffect(() => {
    async function controlNextBtnActive() {
      if (step === SIGNUP_STEP.STEP1) {
        if (watchEmail && watchPassword && watchConfirmPassword) {
          const validated = await trigger([
            FIELDS_NAME.EMAIL,
            FIELDS_NAME.PASSWORD,
            FIELDS_NAME.CONFIRM_PASSWORD,
          ]);
          if (validated) {
            setNextBtnActive(BUTTON_ACTIVE);
          } else {
            setNextBtnActive(BUTTON_INACTIVE);
          }
        }
      } else if (step === SIGNUP_STEP.STEP2) {
        setNextBtnActive(BUTTON_INACTIVE);
        if (watchNickName && watchBirthday) {
          const validated = await trigger([
            FIELDS_NAME.NICKNAME,
            FIELDS_NAME.BIRTHDAY,
            FIELDS_NAME.GENDER,
          ]);
          if (validated) {
            setNextBtnActive(BUTTON_ACTIVE);
          } else {
            setNextBtnActive(BUTTON_INACTIVE);
          }
        }
      } else if (step === SIGNUP_STEP.STEP3) {
        if (watchInterests && watchInterests.length) {
          setNextBtnActive(BUTTON_ACTIVE);
        } else {
          setNextBtnActive(BUTTON_INACTIVE);
        }
      } else if (step === SIGNUP_STEP.STEP4) {
        if (watchAvatar) {
          setNextBtnActive(BUTTON_ACTIVE);
        } else {
          setNextBtnActive(BUTTON_INACTIVE);
        }
      }
    }
    controlNextBtnActive();
  }, [
    watchEmail,
    watchPassword,
    watchConfirmPassword,
    watchNickName,
    watchBirthday,
    watchGender,
    watchInterests,
    watchAvatar,
  ]);

  register(FIELDS_NAME.CONFIRM_PASSWORD, { validate: checkConfirmPassword });
  register(FIELDS_NAME.EMAIL, { validate: checkEmailFormat });

  useEffect(() => {
    setNextBtnActive(BUTTON_INACTIVE);
    if (step === SIGNUP_STEP.STEP1) {
      setTitle(STEP_TITLE.STEP1);
      setDescription('');
    } else if (step === SIGNUP_STEP.STEP2) {
      setTitle(STEP_TITLE.STEP2);
      setDescription('');
    } else if (step === SIGNUP_STEP.STEP3) {
      setTitle(STEP_TITLE.STEP3);
      setDescription('');
    } else if (step === SIGNUP_STEP.STEP4) {
      setTitle(STEP_TITLE.STEP4);
      setDescription(STEP_DESCRIPTION.STEP4);
    } else if (step === SIGNUP_STEP.STEP5) {
      setTitle(STEP_TITLE.STEP5);
      setDescription('');
    }
  }, [step]);

  const selectedNickname = getValues(FIELDS_NAME.NICKNAME);
  const selectedAvatar = getValues(FIELDS_NAME.AVATAR);

  return (
    <Wrapper>
      <SignupGlobalStyle />
      <HorizontalSpace height={COMMON_SIZE_24PX} />
      <LogoWrapper>
        <Logo width="97.46" height="24" />
      </LogoWrapper>
      <HorizontalSpace height={COMMON_SIZE_72PX} />
      <Title>{title}</Title>
      {description && (
        <>
          <HorizontalSpace height={COMMON_SIZE_24PX} />
          <Description>{description}</Description>
        </>
      )}
      <HorizontalSpace height={COMMON_SIZE_32PX} />
      <StyledForm>
        <FieldsWrapper>
          {step === SIGNUP_STEP.STEP1 && (
            <>
              <Fields
                name={FIELDS_NAME.EMAIL}
                size="large"
                placeholder="사용할 이메일 주소를 입력하세요"
                prefix="MAIL"
                control={control}
                error={errors.email}
                trigger={trigger}
                marginBottom="0px"
                inputcolor={WHITE_COLOR}
                required
              />
              <HorizontalSpace height={COMMON_SIZE_24PX} />
              <Fields
                name={FIELDS_NAME.PASSWORD}
                type="password"
                size="large"
                placeholder="비밀번호"
                prefix="PW"
                control={control}
                error={errors.password}
                trigger={trigger}
                marginBottom="0px"
                inputcolor={WHITE_COLOR}
                required
              />
              <HorizontalSpace height={COMMON_SIZE_24PX} />
              <Fields
                name={FIELDS_NAME.CONFIRM_PASSWORD}
                type="password"
                size="large"
                placeholder="비밀번호 확인"
                prefix="PW"
                control={control}
                error={errors.confirmPassword}
                trigger={trigger}
                inputcolor={WHITE_COLOR}
                marginBottom="0px"
              />
            </>
          )}
          {step === SIGNUP_STEP.STEP2 && (
            <>
              <Fields
                name={FIELDS_NAME.NICKNAME}
                size="large"
                placeholder="닉네임을 입력하세요"
                prefix="ID"
                control={control}
                error={errors.nickName}
                trigger={trigger}
                marginBottom="0px"
                inputcolor={WHITE_COLOR}
                required
              />
              <HorizontalSpace height={COMMON_SIZE_24PX} />
              <Fields
                name={FIELDS_NAME.BIRTHDAY}
                type="date"
                size="large"
                placeholder="출생년도를 입력하세요"
                prefix="YY"
                control={control}
                error={errors.birthday}
                trigger={trigger}
                marginBottom="0px"
                inputcolor={WHITE_COLOR}
                required
              />
              <HorizontalSpace height={COMMON_SIZE_24PX} />
              <Fields
                name={FIELDS_NAME.GENDER}
                type="checkbox"
                size="large"
                prefix="XY"
                control={control}
                error={errors.gender}
                options={genderOptions}
                trigger={trigger}
                marginBottom="0px"
                inputcolor={WHITE_COLOR}
                current={watchGender}
                required
              />
            </>
          )}
          {step === SIGNUP_STEP.STEP3 && (
            <SelectButtonField
              name={FIELDS_NAME.INTERESTS}
              control={control}
              options={interestOptions}
              required
            />
          )}
          {step === SIGNUP_STEP.STEP4 && (
            <SelectAvatarField
              name={FIELDS_NAME.AVATAR}
              control={control}
              options={avatarOptions}
              required
            />
          )}
          {step === SIGNUP_STEP.STEP5 && (
            <Step5Wrapper>
              <img src={`/static/images/signup/${selectedAvatar}`} width="200" height="200" />
              <HorizontalSpace height={COMMON_SIZE_24PX} />
              <WelcomeText>
                &ldquo;{selectedNickname}&rdquo;님 반가워요~!
                <br /> 이제 주변의 블록으로 떠나볼까요!
              </WelcomeText>
            </Step5Wrapper>
          )}
        </FieldsWrapper>
        <ReturnButtonComponent
          step={step}
          nextBtnActive={nextBtnActive}
          onNextButtonClicked={onNextButtonClicked}
          onStartBtnClicked={onStartBtnClicked}
          handleSubmit={handleSubmit}
          onSubmit={onSubmit}
        />
      </StyledForm>
    </Wrapper>
  );
};

export default Signup;

const ReturnButtonComponent = ({
  step,
  nextBtnActive,
  onNextButtonClicked,
  onStartBtnClicked,
  handleSubmit,
  onSubmit,
}: any) => {
  if (step === SIGNUP_STEP.STEP5) {
    return (
      <ButtonCommon onClick={onStartBtnClicked} active={BUTTON_ACTIVE}>
        START!
      </ButtonCommon>
    );
  }
  if (step === SIGNUP_STEP.STEP4) {
    return (
      <ButtonCommon onClick={onNextButtonClicked} active={nextBtnActive}>
        NEXT
      </ButtonCommon>
    );
  }
  return (
    <ButtonCommon onClick={onNextButtonClicked} active={nextBtnActive}>
      NEXT
    </ButtonCommon>
  );
};

enum SIGNUP_STEP {
  STEP1 = 1,
  STEP2 = 2,
  STEP3 = 3,
  STEP4 = 4,
  STEP5 = 5,
}

enum STEP_TITLE {
  STEP1 = 'JOIN.',
  STEP2 = 'INFO.',
  STEP3 = 'INTEREST.',
  STEP4 = 'AVATAR.',
  STEP5 = 'WELCOME!',
}

enum FIELDS_NAME {
  EMAIL = 'email',
  PASSWORD = 'password',
  CONFIRM_PASSWORD = 'confirmPassword',
  NICKNAME = 'nickName',
  BIRTHDAY = 'birthday',
  GENDER = 'gender',
  INTERESTS = 'interests',
  AVATAR = 'avatar',
}

enum STEP_DESCRIPTION {
  STEP4 = '사용할 아바타를 선택해주세요.',
}

const defaultValues = {
  email: '',
  password: '',
  confirmPassword: '',
  nickName: '',
  birthday: '',
  gender: '',
  interests: [],
  avatar: '',
};

const interestOptions = [
  '나만아는장소',
  '데이트코스',
  '포토스팟',
  '뷰맛집',
  '이상한곳',
  '친구찾기',
  '고백',
  '도움요청',
  '나눔',
  '일기(하소연)',
  '가십',
  '벽보',
  '실시간소통',
  '할인쿠폰',
  '제보',
  '힐링공감',
  '동네맛집',
  '후기공유',
].map((option: string) => ({ label: `#${option}`, value: option, checked: false }));

const avatarOptions = [
  'avatar1.png',
  'avatar2.png',
  'avatar3.png',
  'avatar4.png',
  'avatar5.png',
  'avatar6.png',
  'avatar7.png',
  'avatar8.png',
  'avatar9.png',
  'avatar10.png',
  'avatar11.png',
  'avatar12.png',
  'avatar13.png',
];

interface FormSelectOptions {
  [index: number]: { label: string; value: number };
}

const genderOptions: FormSelectOptions = [
  { label: '남성', value: GENDER_OPTION_VALUES.MALE },
  { label: '여성', value: GENDER_OPTION_VALUES.FEMALE },
];

const LogoWrapper = styled.div`
  display: flex;
  justify-content: center;
`;

const Description = styled.div`
  font-size: 14px;
  color: ${PRIMARY_COLOR2};
`;

const Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  width: 350px;
  height: 640px;
  margin-left: auto;
  margin-right: auto;
  @media (max-width: 640px) {
    width: 85%;
  }
`;

const FieldsWrapper = styled.div``;

const StyledForm = styled.form`
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  height: 100%;
`;

const Title = styled.div`
  font-size: 32px;
  line-height: 39px;
  color: ${() => PRIMARY_COLOR};
  font-weight: 800;
`;

const Step5Wrapper = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
`;

const WelcomeText = styled.div`
  font-weight: 300;
  font-size: 14px;
  line-height: 20px;
  color: ${PRIMARY_COLOR2};
  text-align: center;
`;
