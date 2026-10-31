package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Parser.java */
/* JADX INFO: loaded from: classes4.dex */
public interface c1<MessageType> {
    MessageType parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parseDelimitedFrom(InputStream inputStream, p pVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(i iVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(i iVar, p pVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(j jVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(j jVar, p pVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parseFrom(InputStream inputStream, p pVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteBuffer byteBuffer, p pVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, int i10, int i11, p pVar) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, p pVar) throws InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(InputStream inputStream, p pVar) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(i iVar) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(i iVar, p pVar) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(j jVar) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(j jVar, p pVar) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(InputStream inputStream, p pVar) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, int i10, int i11, p pVar) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, p pVar) throws InvalidProtocolBufferException;
}
