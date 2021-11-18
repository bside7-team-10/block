import React from 'react';
import styled from 'styled-components';

const BlockLoginBottom = () => {
  return (
    <svg width="249" height="114" viewBox="0 0 249 114" fill="none" xmlns="http://www.w3.org/2000/svg">
      <StyledG opacity="0.2">
        <path d="M9.5 66.5H45.25M244 66.5H163M5 108.5H47L81 66.5M81 66.5H108.5H119H141M81 66.5H45.25M163 66.5L185.5 31M163 66.5H141M141 66.5L115 101H216.5M45.25 66.5L67.125 35.75M89 5L67.125 35.75M67.125 35.75H26.5" stroke="url(#paint0_radial_716_7455)" strokeWidth="10" strokeLinecap="round" strokeLinejoin="round" />
      </StyledG>
      <StyledG opacity="0.3">
        <ellipse rx="13.9941" ry="7.17647" transform="matrix(1 0 0 -1 121.5 66.0646)" fill="#0C0C33" />
      </StyledG>
      <StyledG opacity="0.3">
        <ellipse rx="30.5" ry="14.3529" transform="matrix(1 0 0 -1 121.5 67.5)" fill="#0C0C33" />
      </StyledG>
      <defs>
        <radialGradient id="paint0_radial_716_7455" cx="0" cy="0" r="1" gradientUnits="userSpaceOnUse" gradientTransform="translate(121 71.25) rotate(90) scale(79.25 126.169)">
          <stop stopColor="#0C0C33" />
          <stop offset="1" stopColor="#0C0C33" stopOpacity="0.1" />
        </radialGradient>
      </defs>
    </svg>
  );
};

export default BlockLoginBottom;

const StyledG = styled.g`
  min-blend-mode: overlay;
`;