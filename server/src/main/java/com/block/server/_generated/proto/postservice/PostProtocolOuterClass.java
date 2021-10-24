// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PostProtocol.proto

package com.block.server._generated.proto.postservice;

public final class PostProtocolOuterClass {
  private PostProtocolOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Location_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Post_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Post_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPostRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPostResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPostsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPostsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPostsRequest_Filter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPostsRequest_Filter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPostsRequest_Filter_DistanceFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPostsRequest_Filter_DistanceFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPostsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPostsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreatePostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreatePostRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreatePostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreatePostResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifyPostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifyPostRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifyPostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifyPostResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeletePostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeletePostRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeletePostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeletePostResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateCommentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateCommentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateCommentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateCommentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifyCommentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifyCommentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifyCommentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifyCommentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteCommentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteCommentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteCommentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteCommentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LikePostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LikePostRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LikePostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LikePostResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022PostProtocol.proto\"%\n\010Location\022\013\n\003lat\030" +
      "\001 \001(\001\022\014\n\004long\030\002 \001(\001\"d\n\007Comment\022\021\n\tcommen" +
      "tId\030\001 \001(\t\022\016\n\006author\030\002 \001(\t\022\017\n\007content\030\003 \001" +
      "(\t\022\021\n\tcreatedTS\030\004 \001(\005\022\022\n\nmodifiedTS\030\005 \001(" +
      "\005\"\221\001\n\004Post\022\016\n\006postId\030\001 \001(\t\022\016\n\006author\030\002 \001" +
      "(\t\022\017\n\007content\030\003 \001(\t\022\020\n\010imageUrl\030\004 \001(\t\022\r\n" +
      "\005likes\030\005 \001(\005\022\032\n\010comments\030\006 \003(\0132\010.Comment" +
      "\022\033\n\010location\030\007 \001(\0132\t.Location\" \n\016GetPost" +
      "Request\022\016\n\006postId\030\001 \001(\t\"K\n\017GetPostRespon" +
      "se\022#\n\006status\030\001 \001(\0162\023.PostProtocolStatus\022" +
      "\023\n\004post\030\002 \001(\0132\005.Post\"\270\002\n\017GetPostsRequest" +
      "\022\022\n\npageNumber\030\001 \001(\005\022\032\n\rresultPerPage\030\002 " +
      "\001(\005H\000\210\001\001\022\"\n\017currentLocation\030\003 \001(\0132\t.Loca" +
      "tion\022\'\n\006filter\030\004 \001(\0132\027.GetPostsRequest.F" +
      "ilter\032\225\001\n\006Filter\022>\n\016distanceFilter\030\001 \001(\013" +
      "2&.GetPostsRequest.Filter.DistanceFilter" +
      "\022\026\n\016rightNowFilter\030\002 \001(\010\0323\n\016DistanceFilt" +
      "er\022\017\n\007enabled\030\001 \001(\010\022\020\n\010distance\030\002 \001(\005B\020\n" +
      "\016_resultPerPage\"M\n\020GetPostsResponse\022#\n\006s" +
      "tatus\030\001 \001(\0162\023.PostProtocolStatus\022\024\n\005post" +
      "s\030\002 \003(\0132\005.Post\"`\n\021CreatePostRequest\022\016\n\006a" +
      "uthor\030\001 \001(\t\022\017\n\007content\030\002 \001(\t\022\r\n\005image\030\003 " +
      "\001(\014\022\033\n\010location\030\004 \001(\0132\t.Location\"I\n\022Crea" +
      "tePostResponse\022#\n\006status\030\001 \001(\0162\023.PostPro" +
      "tocolStatus\022\016\n\006postId\030\002 \001(\t\"i\n\021ModifyPos" +
      "tRequest\022\016\n\006postId\030\001 \001(\t\022\017\n\007content\030\002 \001(" +
      "\t\022\025\n\rmodifiedImage\030\003 \001(\010\022\022\n\005image\030\004 \001(\014H" +
      "\000\210\001\001B\010\n\006_image\"I\n\022ModifyPostResponse\022#\n\006" +
      "status\030\001 \001(\0162\023.PostProtocolStatus\022\016\n\006pos" +
      "tId\030\002 \001(\t\"#\n\021DeletePostRequest\022\016\n\006postId" +
      "\030\001 \001(\t\"I\n\022DeletePostResponse\022#\n\006status\030\001" +
      " \001(\0162\023.PostProtocolStatus\022\016\n\006postId\030\002 \001(" +
      "\t\"G\n\024CreateCommentRequest\022\016\n\006author\030\001 \001(" +
      "\t\022\016\n\006postId\030\002 \001(\t\022\017\n\007content\030\003 \001(\t\"O\n\025Cr" +
      "eateCommentResponse\022#\n\006status\030\001 \001(\0162\023.Po" +
      "stProtocolStatus\022\021\n\tcommentId\030\002 \001(\t\":\n\024M" +
      "odifyCommentRequest\022\021\n\tcommentId\030\001 \001(\t\022\017" +
      "\n\007content\030\002 \001(\t\"O\n\025ModifyCommentResponse" +
      "\022#\n\006status\030\001 \001(\0162\023.PostProtocolStatus\022\021\n" +
      "\tcommentId\030\002 \001(\t\")\n\024DeleteCommentRequest" +
      "\022\021\n\tcommentId\030\001 \001(\t\"<\n\025DeleteCommentResp" +
      "onse\022#\n\006status\030\001 \001(\0162\023.PostProtocolStatu" +
      "s\"/\n\017LikePostRequest\022\016\n\006postId\030\001 \001(\t\022\014\n\004" +
      "like\030\002 \001(\010\"L\n\020LikePostResponse\022#\n\006status" +
      "\030\001 \001(\0162\023.PostProtocolStatus\022\023\n\004post\030\002 \001(" +
      "\0132\005.Post*f\n\022PostProtocolStatus\022\013\n\007SUCCES" +
      "S\020\000\022\013\n\007NO_POST\020\001\022\016\n\nNO_COMMENT\020\002\022\022\n\016NOT_" +
      "AUTHORIZED\020\003\022\022\n\016INTERNAL_ERROR\020c2\316\004\n\014Pos" +
      "tProtocol\022.\n\007GetPost\022\017.GetPostRequest\032\020." +
      "GetPostResponse\"\000\0221\n\010GetPosts\022\020.GetPosts" +
      "Request\032\021.GetPostsResponse\"\000\0227\n\nCreatePo" +
      "st\022\022.CreatePostRequest\032\023.CreatePostRespo" +
      "nse\"\000\0227\n\nModifyPost\022\022.ModifyPostRequest\032" +
      "\023.ModifyPostResponse\"\000\0227\n\nDeletePost\022\022.D" +
      "eletePostRequest\032\023.DeletePostResponse\"\000\022" +
      "@\n\rCreateComment\022\025.CreateCommentRequest\032" +
      "\026.CreateCommentResponse\"\000\022@\n\rModifyComme" +
      "nt\022\025.ModifyCommentRequest\032\026.ModifyCommen" +
      "tResponse\"\000\022@\n\rDeleteComment\022\025.DeleteCom" +
      "mentRequest\032\026.DeleteCommentResponse\"\000\0221\n" +
      "\010LikePost\022\020.LikePostRequest\032\021.LikePostRe" +
      "sponse\"\000\0227\n\016CancelLikePost\022\020.LikePostReq" +
      "uest\032\021.LikePostResponse\"\000B1\n-com.block.s" +
      "erver._generated.proto.postserviceP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Location_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Location_descriptor,
        new java.lang.String[] { "Lat", "Long", });
    internal_static_Comment_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Comment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_descriptor,
        new java.lang.String[] { "CommentId", "Author", "Content", "CreatedTS", "ModifiedTS", });
    internal_static_Post_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Post_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Post_descriptor,
        new java.lang.String[] { "PostId", "Author", "Content", "ImageUrl", "Likes", "Comments", "Location", });
    internal_static_GetPostRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetPostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPostRequest_descriptor,
        new java.lang.String[] { "PostId", });
    internal_static_GetPostResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetPostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPostResponse_descriptor,
        new java.lang.String[] { "Status", "Post", });
    internal_static_GetPostsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_GetPostsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPostsRequest_descriptor,
        new java.lang.String[] { "PageNumber", "ResultPerPage", "CurrentLocation", "Filter", "ResultPerPage", });
    internal_static_GetPostsRequest_Filter_descriptor =
      internal_static_GetPostsRequest_descriptor.getNestedTypes().get(0);
    internal_static_GetPostsRequest_Filter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPostsRequest_Filter_descriptor,
        new java.lang.String[] { "DistanceFilter", "RightNowFilter", });
    internal_static_GetPostsRequest_Filter_DistanceFilter_descriptor =
      internal_static_GetPostsRequest_Filter_descriptor.getNestedTypes().get(0);
    internal_static_GetPostsRequest_Filter_DistanceFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPostsRequest_Filter_DistanceFilter_descriptor,
        new java.lang.String[] { "Enabled", "Distance", });
    internal_static_GetPostsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_GetPostsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPostsResponse_descriptor,
        new java.lang.String[] { "Status", "Posts", });
    internal_static_CreatePostRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_CreatePostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreatePostRequest_descriptor,
        new java.lang.String[] { "Author", "Content", "Image", "Location", });
    internal_static_CreatePostResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_CreatePostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreatePostResponse_descriptor,
        new java.lang.String[] { "Status", "PostId", });
    internal_static_ModifyPostRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_ModifyPostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifyPostRequest_descriptor,
        new java.lang.String[] { "PostId", "Content", "ModifiedImage", "Image", "Image", });
    internal_static_ModifyPostResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_ModifyPostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifyPostResponse_descriptor,
        new java.lang.String[] { "Status", "PostId", });
    internal_static_DeletePostRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_DeletePostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeletePostRequest_descriptor,
        new java.lang.String[] { "PostId", });
    internal_static_DeletePostResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_DeletePostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeletePostResponse_descriptor,
        new java.lang.String[] { "Status", "PostId", });
    internal_static_CreateCommentRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_CreateCommentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateCommentRequest_descriptor,
        new java.lang.String[] { "Author", "PostId", "Content", });
    internal_static_CreateCommentResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_CreateCommentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateCommentResponse_descriptor,
        new java.lang.String[] { "Status", "CommentId", });
    internal_static_ModifyCommentRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_ModifyCommentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifyCommentRequest_descriptor,
        new java.lang.String[] { "CommentId", "Content", });
    internal_static_ModifyCommentResponse_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_ModifyCommentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifyCommentResponse_descriptor,
        new java.lang.String[] { "Status", "CommentId", });
    internal_static_DeleteCommentRequest_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_DeleteCommentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteCommentRequest_descriptor,
        new java.lang.String[] { "CommentId", });
    internal_static_DeleteCommentResponse_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_DeleteCommentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteCommentResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_LikePostRequest_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_LikePostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LikePostRequest_descriptor,
        new java.lang.String[] { "PostId", "Like", });
    internal_static_LikePostResponse_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_LikePostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LikePostResponse_descriptor,
        new java.lang.String[] { "Status", "Post", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}