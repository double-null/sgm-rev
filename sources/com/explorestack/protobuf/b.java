package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: AbstractParser.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b<MessageType extends MessageLite> implements s1<MessageType> {
    private static final y EMPTY_REGISTRY = y.b();

    private MessageType checkMessageInitialized(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype).b().setUnfinishedMessage(messagetype);
    }

    private UninitializedMessageException newUninitializedMessageException(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).newUninitializedMessageException() : new UninitializedMessageException(messagetype);
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseDelimitedFrom(InputStream inputStream, y yVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(m182parsePartialDelimitedFrom(inputStream, yVar));
    }

    /* JADX INFO: renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m182parsePartialDelimitedFrom(InputStream inputStream, y yVar) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return (MessageType) m187parsePartialFrom((InputStream) new a.AbstractC0128a.C0129a(inputStream, n.D(i10, inputStream)), yVar);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10);
        }
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialDelimitedFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m181parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) m182parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m185parsePartialFrom(n nVar) throws InvalidProtocolBufferException {
        return parsePartialFrom(nVar, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m184parsePartialFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        try {
            n nVarNewCodedInput = byteString.newCodedInput();
            MessageType partialFrom = parsePartialFrom(nVarNewCodedInput, yVar);
            try {
                nVarNewCodedInput.a(0);
                return partialFrom;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(partialFrom);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(parsePartialFrom(nVar, yVar));
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseFrom(n nVar) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(nVar, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(m184parsePartialFrom(byteString, yVar));
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteString, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m183parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) m184parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        try {
            n nVarJ = n.j(byteBuffer);
            MessageType partialFrom = parsePartialFrom(nVarJ, yVar);
            try {
                nVarJ.a(0);
                return (MessageType) checkMessageInitialized(partialFrom);
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(partialFrom);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m190parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) throws InvalidProtocolBufferException {
        try {
            n nVarM = n.m(bArr, i10, i11);
            MessageType partialFrom = parsePartialFrom(nVarM, yVar);
            try {
                nVarM.a(0);
                return partialFrom;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(partialFrom);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m189parsePartialFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return (MessageType) m190parsePartialFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m191parsePartialFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return (MessageType) m190parsePartialFrom(bArr, 0, bArr.length, yVar);
    }

    /* JADX INFO: renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m180parseFrom(byte[] bArr, int i10, int i11, y yVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(m190parsePartialFrom(bArr, i10, i11, yVar));
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m188parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) m190parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parseFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m179parseFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return (MessageType) m180parseFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m187parsePartialFrom(InputStream inputStream, y yVar) throws InvalidProtocolBufferException {
        n nVarG = n.g(inputStream);
        MessageType partialFrom = parsePartialFrom(nVarG, yVar);
        try {
            nVarG.a(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return (MessageType) m180parseFrom(bArr, 0, bArr.length, yVar);
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseFrom(InputStream inputStream, y yVar) throws InvalidProtocolBufferException {
        return (MessageType) checkMessageInitialized(m187parsePartialFrom(inputStream, yVar));
    }

    @Override // com.explorestack.protobuf.s1
    public MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(inputStream, EMPTY_REGISTRY);
    }

    /* JADX INFO: renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
    public MessageType m186parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) m187parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }
}
