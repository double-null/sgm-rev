package com.explorestack.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Parser.java */
/* JADX INFO: loaded from: classes.dex */
public interface s1<MessageType> {
    MessageType parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parseDelimitedFrom(InputStream inputStream, y yVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteString byteString) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(n nVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(n nVar, y yVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parseFrom(InputStream inputStream, y yVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException;
}
