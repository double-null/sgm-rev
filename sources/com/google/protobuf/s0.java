package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: MessageLite.java */
/* JADX INFO: loaded from: classes4.dex */
public interface s0 extends t0 {

    /* JADX INFO: compiled from: MessageLite.java */
    public interface a extends t0, Cloneable {
        s0 build();

        s0 buildPartial();

        a clear();

        /* JADX INFO: renamed from: clone */
        a mo203clone();

        @Override // com.google.protobuf.t0
        /* synthetic */ s0 getDefaultInstanceForType();

        @Override // com.google.protobuf.t0
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, p pVar) throws IOException;

        a mergeFrom(i iVar) throws InvalidProtocolBufferException;

        a mergeFrom(i iVar, p pVar) throws InvalidProtocolBufferException;

        a mergeFrom(j jVar) throws IOException;

        a mergeFrom(j jVar, p pVar) throws IOException;

        a mergeFrom(s0 s0Var);

        a mergeFrom(InputStream inputStream) throws IOException;

        a mergeFrom(InputStream inputStream, p pVar) throws IOException;

        a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        a mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        a mergeFrom(byte[] bArr, int i10, int i11, p pVar) throws InvalidProtocolBufferException;

        a mergeFrom(byte[] bArr, p pVar) throws InvalidProtocolBufferException;
    }

    @Override // com.google.protobuf.t0
    /* synthetic */ s0 getDefaultInstanceForType();

    c1<? extends s0> getParserForType();

    int getSerializedSize();

    @Override // com.google.protobuf.t0
    /* synthetic */ boolean isInitialized();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    i toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
