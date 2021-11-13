import { Button } from 'antd';
import Modal from 'antd/lib/modal/Modal';
import React, { ReactNode } from 'react';
import styled from 'styled-components';
import { GREY_COLOR, PRIMARY_COLOR } from '../../utils/theme/theme';

interface IDialog {
  handleOk: () => void;
  okText: string;
  handleCancel: () => void;
  cancleText: string;
  isDialogModalVisible: boolean;
  children: ReactNode;
}

const DialogModal = (props: IDialog) => {
  const {
    handleOk,
    handleCancel,
    isDialogModalVisible,
    children,
    okText = '확인',
    cancleText = '취소',
  } = props;

  return (
    <StyledModal
      centered
      closable={false}
      visible={isDialogModalVisible}
      width={270}
      footer={[
        <CancelButton key="cancel" onClick={handleCancel}>
          {cancleText}
        </CancelButton>,
        <OkButton key="ok" onClick={handleOk}>
          {okText}
        </OkButton>,
      ]}
    >
      {children}
    </StyledModal>
  );
};

export default DialogModal;

const StyledModal = styled(Modal)`
  & .ant-modal-body {
    padding: 16px;
  }

  & .ant-modal-content {
    border-radius: 14px;
  }

  & .ant-modal-footer {
    padding: 0px;
    border-top: none;
  }

  & .ant-modal-footer .ant-btn + .ant-btn:not(.ant-dropdown-trigger) {
    margin: 0px;
  }
`;

const CancelButton = styled(Button)`
  width: 50%;
  margin: 0px;
  border-radius: 0px 0px 0px 14px;
  border: none;
  border-top: 1px solid ${GREY_COLOR};
  border-right: 1px solid ${GREY_COLOR};
  height: 44px;
  font-size: 16px;
  color: ${PRIMARY_COLOR};
`;

const OkButton = styled(Button)`
  width: 50%;
  margin-left: 0px;
  border-radius: 0px 0px 14px 0px;
  border: none;
  border-top: 1px solid ${GREY_COLOR};
  height: 44px;
  font-size: 16px;
  color: ${PRIMARY_COLOR};
`;
