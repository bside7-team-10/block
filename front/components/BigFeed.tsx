import React from 'react';
import styled from 'styled-components';
import { PRIMARY_COLOR2, WHITE_COLOR, SUB_COLOR3 } from '../utils/theme/theme';
import FeedMenu from '../assets/FeedMenu';

interface BigFeedInterface {
  setVisible: (arg: boolean) => void
}

const BigFeed = ({ setVisible }: BigFeedInterface) => {

  const tempTextContent =
    'big 유저는 지도상의 남이 쓴 게시글을 확인할 수 있다. 6.유저는 지도상의 남이 쓴 게시글을 클릭 시 스몰 썸네일 확인 7. 스몰썸네일 클릭해서 빅 썸네일로 볼 수 있음 big 유저는 지도상의';

  return (
    <Wrapper>
      <Contents>
        <FeedBarWrapper onClick={() => setVisible(false)}>
          <FeedBar />
        </FeedBarWrapper>
        <HeaderWrapper>
          <HeaderLeftWrapper>
            <Profile src="/static/images/signup/avatar5.png" />
            <AddressAndLocationWrapper>
              <Address>서울시 종로구 소공동 54</Address>
              <Location>123.45.678.91</Location>
            </AddressAndLocationWrapper>
          </HeaderLeftWrapper>
          <FeedMenu />
        </HeaderWrapper>
        <MainImage src="/static/images/temp/image.jpg" />
        <UserNickNameAndTimeStampWrapper>
          <UserNickName>광화문빌런</UserNickName>
          <TimeStamp>10시간 전</TimeStamp>
        </UserNickNameAndTimeStampWrapper>
        <Content>{tempTextContent}</Content>
      </Contents>
    </Wrapper>
  );
};

export default BigFeed;

const FeedBarWrapper = styled.div`
  display: flex;
  align-items: center;
  flex-direction: column;
  height: 24px;
`

const FeedBar = styled.div`
  width: 56px;
  height: 5px;
  background: #7377A7;
  border-radius: 100px;
`

const Wrapper = styled.div`
  background: #191d46;
  border-radius: 13px;
`;

const HeaderLeftWrapper = styled.div`
  display: flex;
`;

const UserNickNameAndTimeStampWrapper = styled.div`
  display: flex;
  align-items: center;
  margin-top: 15px;
`;

const UserNickName = styled.div`
  font-weight: 700;
  font-size: 12px;
  color: ${WHITE_COLOR};
`;

const TimeStamp = styled.div`
  font-size: 9px;
  font-weight: 400;
  color: ${SUB_COLOR3};
  margin-left: 5px;
`;

const HeaderWrapper = styled.div`
  display: flex;
  align-items: center;
  justify-content: space-between;
`;

const AddressAndLocationWrapper = styled.div`
  display: flex;
  flex-direction: column;
  margin-left: 7px;
`;

const Profile = styled.img`
  width: 32px;
  height: 32px;
`;

const Address = styled.div`
  color: ${PRIMARY_COLOR2};
`;

const Location = styled.div`
  color: ${SUB_COLOR3};
  font-size: 10px;
  font-weight: 400;
`;

const Content = styled.div`
  color: ${WHITE_COLOR};
  font-size: 10px;
  font-weight: 400;
  margin-top: 10px;
  border-radius: 12px;
  padding: 16px 12px;
  background-color: rgba(255, 255, 255, 0.1);
`;

const Contents = styled.div`
  padding: 20px;
`;

const MainImage = styled.img`
  height: 400px;
  width: 100%;
  border-radius: 5px;
  object-fit: cover;
  margin-top: 5px;
`;
