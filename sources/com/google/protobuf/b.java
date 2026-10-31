package com.google.protobuf;

import com.google.protobuf.s0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: AbstractParser.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b<MessageType extends s0> implements c1<MessageType> {
    private static final p EMPTY_REGISTRY = p.getEmptyRegistry();

    private MessageType checkMessageInitialized(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    private UninitializedMessageException newUninitializedMessageException(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).newUninitializedMessageException() : new UninitializedMessageException(messagetype);
    }

    @Override // com.google.protobuf.c1
    public abstract /* synthetic */ MessageType parsePartialFrom(j jVar, p pVar) throws InvalidProtocolBufferException;

    @Override // com.google.protobuf.c1
    public MessageType parseDelimitedFrom(InputStream inputStream, p pVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialDelimitedFrom(inputStream, pVar));
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialDelimitedFrom(InputStream inputStream, p pVar) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return (MessageType) parsePartialFrom((InputStream) new a.AbstractC0156a.C0157a(inputStream, j.readRawVarint32(i10, inputStream)), pVar);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10);
        }
    }

    @Override // com.google.protobuf.c1
    public MessageType parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialFrom(j jVar) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(jVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialFrom(i iVar, p pVar) throws InvalidProtocolBufferException {
        try {
            j jVarNewCodedInput = iVar.newCodedInput();
            MessageType messagetype = (MessageType) parsePartialFrom(jVarNewCodedInput, pVar);
            try {
                jVarNewCodedInput.checkLastTagWas(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(messagetype);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(j jVar, p pVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized((s0) parsePartialFrom(jVar, pVar));
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(j jVar) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(jVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(i iVar, p pVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(iVar, pVar));
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(i iVar) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(iVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialFrom(i iVar) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(iVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(ByteBuffer byteBuffer, p pVar) throws InvalidProtocolBufferException {
        try {
            j jVarNewInstance = j.newInstance(byteBuffer);
            s0 s0Var = (s0) parsePartialFrom(jVarNewInstance, pVar);
            try {
                jVarNewInstance.checkLastTagWas(0);
                return (MessageType) checkMessageInitialized(s0Var);
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(s0Var);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialFrom(byte[] bArr, int i10, int i11, p pVar) throws InvalidProtocolBufferException {
        try {
            j jVarNewInstance = j.newInstance(bArr, i10, i11);
            MessageType messagetype = (MessageType) parsePartialFrom(jVarNewInstance, pVar);
            try {
                jVarNewInstance.checkLastTagWas(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(messagetype);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialFrom(byte[] bArr, p pVar) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, pVar);
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(byte[] bArr, int i10, int i11, p pVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(bArr, i10, i11, pVar));
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialFrom(InputStream inputStream, p pVar) throws InvalidProtocolBufferException {
        j jVarNewInstance = j.newInstance(inputStream);
        MessageType messagetype = (MessageType) parsePartialFrom(jVarNewInstance, pVar);
        try {
            jVarNewInstance.checkLastTagWas(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(byte[] bArr, p pVar) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, 0, bArr.length, pVar);
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(InputStream inputStream, p pVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(inputStream, pVar));
    }

    @Override // com.google.protobuf.c1
    public MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public MessageType parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }
}
