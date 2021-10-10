# Path to this plugin, Note this must be an abolsute path on Windows (see #15)
$PROTOC_GEN_TS_PATH=".\node_modules\.bin\protoc-gen-ts.cmd"

$SRC_DIR="./src"

# Directory to write generated code to (.js and .d.ts files)
$OUT_DIR_FRONT="..\front\_generated"

protoc `
    --plugin="protoc-gen-ts=$PROTOC_GEN_TS_PATH" `
    --js_out="import_style=commonjs,binary:$OUT_DIR_FRONT" `
    --ts_out="service=grpc-web:$OUT_DIR_FRONT" `
    -I $SRC_DIR `
    "$SRC_DIR/UserProtocol.proto" `
    "$SRC_DIR/PostProtocol.proto"