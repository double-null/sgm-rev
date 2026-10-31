package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public interface MessageLite {

    public interface Builder extends Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        Builder clear();

        /* JADX INFO: renamed from: clone */
        Builder m196clone();

        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, y yVar) throws IOException;

        Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        Builder mergeFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException;

        Builder mergeFrom(MessageLite messageLite);

        Builder mergeFrom(n nVar) throws IOException;

        Builder mergeFrom(n nVar, y yVar) throws IOException;

        Builder mergeFrom(InputStream inputStream) throws IOException;

        Builder mergeFrom(InputStream inputStream, y yVar) throws IOException;

        Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11, y yVar) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException;
    }

    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    s1<? extends MessageLite> getParserForType();

    int getSerializedSize();

    /* synthetic */ boolean isInitialized();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
