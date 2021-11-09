#!/bin/sh

PROTOC_GEN_TS_PATH="./node_modules/.bin/protoc-gen-ts"

SRC_DIR="src"
SRC_DIR_ABS_PATH=$(pwd)/$SRC_DIR

# Directory to write generated code to (.js and .d.ts files)
OUT_DIR_FRONT="../front/_generated"

protoc \
    --plugin="protoc-gen-ts=$PROTOC_GEN_TS_PATH" \
    --js_out="import_style=commonjs,binary:$OUT_DIR_FRONT" \
    --ts_out="service=grpc-web:$OUT_DIR_FRONT" \
    -I $SRC_DIR_ABS_PATH \
    "$SRC_DIR_ABS_PATH/UserProtocol.proto" \
    "$SRC_DIR_ABS_PATH/PostProtocol.proto" \