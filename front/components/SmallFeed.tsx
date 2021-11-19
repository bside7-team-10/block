import React from 'react';
import styled from 'styled-components';

import { PRIMARY_COLOR2, WHITE_COLOR, SUB_COLOR3 } from '../utils/theme/theme';
// import Heart from '../assets/Heart';
// import Comment from '../assets/Comment';
import { Post } from '../state';

interface SmallFeedInterface {
  post: Post
}

const SmallFeed = (props: SmallFeedInterface) => {
  const { post } = props;
  return (
    <Wrapper>
      <Contents>
        <TextWrapper>
          <Address>{post.address}</Address>
          {/* <EngageWrapper>
            <HeartWrapper>
              <Heart />
              <HeartCount>255</HeartCount>
            </HeartWrapper>
            <CommentWrapper>
              <Comment />
              <CommentCount>30</CommentCount>
            </CommentWrapper>
          </EngageWrapper> */}
          <Content>
            { post.content }
          </Content>
          <TimeStamp>10시간 전</TimeStamp>
        </TextWrapper>
        <Thumbnail src={post.image ?? "/static/images/temp/image.jpg"} />
      </Contents>
    </Wrapper>
  );
};

export default SmallFeed;

const Wrapper = styled.div`
  height: 136px;
  width: 360px;
  background: #191d46;
  border-radius: 13px;
  cursor: pointer;
`;

const Address = styled.div`
  color: ${PRIMARY_COLOR2};
`;

// const HeartCount = styled.div`
//   font-size: 10px;
//   font-weight: 400;
//   color: ${PRIMARY_COLOR2};
//   margin-left: 2px;
// `;

// const HeartWrapper = styled.div`
//   display: flex;
//   align-items: center;
// `;

// const CommentCount = styled.div`
//   font-size: 10px;
//   font-weight: 400;
//   color: ${PRIMARY_COLOR2};
//   margin-left: 2px;
// `;

// const CommentWrapper = styled.div`
//   display: flex;
//   align-items: center;
//   margin-left: 5px;
// `;

// const EngageWrapper = styled.div`
//   display: flex;
// `;

const Content = styled.div`
  color: ${WHITE_COLOR};
  font-size: 10px;
  font-weight: 400;
  margin-top: 3px;
`;

const Contents = styled.div`
  padding: 15px;
  display: flex;
`;

const TimeStamp = styled.div`
  font-size: 9px;
  font-weight: 400;
  color: ${SUB_COLOR3};
  margin-top: 10px;
`;

const TextWrapper = styled.div``;

const Thumbnail = styled.img`
  height: 100px;
  border-radius: 5px;
  background-color: red;
  object-fit: contain;
  margin-left: 3px;
`;
