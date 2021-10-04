package com.block.server.controller.grpc;

import com.block.server._generated.proto.postservice.PostProtocolGrpc;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@RequiredArgsConstructor
@GRpcService
public class PostProtocol extends PostProtocolGrpc.PostProtocolImplBase {

}
