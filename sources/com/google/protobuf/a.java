package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0156a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: AbstractMessageLite.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0156a<MessageType, BuilderType>> implements s0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMessageLite.java */
    public static abstract class AbstractC0156a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0156a<MessageType, BuilderType>> implements s0.a {
        @Deprecated
        protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static UninitializedMessageException newUninitializedMessageException(s0 s0Var) {
            return new UninitializedMessageException(s0Var);
        }

        @Override // com.google.protobuf.s0.a
        public abstract /* synthetic */ s0 build();

        @Override // com.google.protobuf.s0.a
        public abstract /* synthetic */ s0 buildPartial();

        @Override // com.google.protobuf.s0.a
        public abstract /* synthetic */ s0.a clear();

        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo203clone();

        @Override // com.google.protobuf.s0.a, com.google.protobuf.t0
        public abstract /* synthetic */ s0 getDefaultInstanceForType();

        protected abstract BuilderType internalMergeFrom(MessageType messagetype);

        @Override // com.google.protobuf.s0.a, com.google.protobuf.t0
        public abstract /* synthetic */ boolean isInitialized();

        @Override // com.google.protobuf.s0.a
        public boolean mergeDelimitedFrom(InputStream inputStream, p pVar) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            mergeFrom((InputStream) new C0157a(inputStream, j.readRawVarint32(i10, inputStream)), pVar);
            return true;
        }

        @Override // com.google.protobuf.s0.a
        public abstract BuilderType mergeFrom(j jVar, p pVar) throws IOException;

        protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            a0.checkNotNull(iterable);
            if (!(iterable instanceof h0)) {
                if (iterable instanceof d1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    addAllCheckingNulls(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((h0) iterable).getUnderlyingElements();
            h0 h0Var = (h0) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (h0Var.size() - size) + " is null.";
                    for (int size2 = h0Var.size() - 1; size2 >= size; size2--) {
                        h0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof i) {
                    h0Var.add((i) obj);
                } else {
                    h0Var.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractMessageLite.java */
        static final class C0157a extends FilterInputStream {
            private int limit;

            C0157a(InputStream inputStream, int i10) {
                super(inputStream);
                this.limit = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.limit--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                int iSkip = (int) super.skip(Math.min(j10, this.limit));
                if (iSkip >= 0) {
                    this.limit -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.limit;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.limit -= i13;
                }
                return i13;
            }
        }

        @Override // com.google.protobuf.s0.a
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, p.getEmptyRegistry());
        }

        @Override // com.google.protobuf.s0.a
        public BuilderType mergeFrom(j jVar) throws IOException {
            return (BuilderType) mergeFrom(jVar, p.getEmptyRegistry());
        }

        @Override // com.google.protobuf.s0.a
        public BuilderType mergeFrom(i iVar) throws InvalidProtocolBufferException {
            try {
                j jVarNewCodedInput = iVar.newCodedInput();
                mergeFrom(jVarNewCodedInput);
                jVarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e11);
            }
        }

        @Override // com.google.protobuf.s0.a
        public BuilderType mergeFrom(i iVar, p pVar) throws InvalidProtocolBufferException {
            try {
                j jVarNewCodedInput = iVar.newCodedInput();
                mergeFrom(jVarNewCodedInput, pVar);
                jVarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e11);
            }
        }

        @Override // com.google.protobuf.s0.a
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.s0.a
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                j jVarNewInstance = j.newInstance(bArr, i10, i11);
                mergeFrom(jVarNewInstance);
                jVarNewInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e11);
            }
        }

        @Override // com.google.protobuf.s0.a
        public BuilderType mergeFrom(byte[] bArr, p pVar) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length, pVar);
        }

        @Override // com.google.protobuf.s0.a
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, p pVar) throws InvalidProtocolBufferException {
            try {
                j jVarNewInstance = j.newInstance(bArr, i10, i11);
                mergeFrom(jVarNewInstance, pVar);
                jVarNewInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e11);
            }
        }

        @Override // com.google.protobuf.s0.a
        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            j jVarNewInstance = j.newInstance(inputStream);
            mergeFrom(jVarNewInstance);
            jVarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.s0.a
        public BuilderType mergeFrom(InputStream inputStream, p pVar) throws IOException {
            j jVarNewInstance = j.newInstance(inputStream);
            mergeFrom(jVarNewInstance, pVar);
            jVarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.s0.a
        public BuilderType mergeFrom(s0 s0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(s0Var)) {
                return (BuilderType) internalMergeFrom((a) s0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0156a.addAll((Iterable) iterable, (List) collection);
    }

    protected static void checkByteStringIsUtf8(i iVar) throws IllegalArgumentException {
        if (!iVar.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.s0, com.google.protobuf.t0
    public abstract /* synthetic */ s0 getDefaultInstanceForType();

    int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.s0
    public abstract /* synthetic */ c1<? extends s0> getParserForType();

    @Override // com.google.protobuf.s0
    public abstract /* synthetic */ int getSerializedSize();

    int getSerializedSize(l1 l1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = l1Var.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    @Override // com.google.protobuf.s0, com.google.protobuf.t0
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.s0
    public abstract /* synthetic */ s0.a newBuilderForType();

    UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    void setMemoizedSerializedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.s0
    public abstract /* synthetic */ s0.a toBuilder();

    @Override // com.google.protobuf.s0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr);
            writeTo(codedOutputStreamNewInstance);
            codedOutputStreamNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e10);
        }
    }

    @Override // com.google.protobuf.s0
    public i toByteString() {
        try {
            i.h hVarNewCodedBuilder = i.newCodedBuilder(getSerializedSize());
            writeTo(hVarNewCodedBuilder.getCodedOutput());
            return hVarNewCodedBuilder.build();
        } catch (IOException e10) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e10);
        }
    }

    @Override // com.google.protobuf.s0
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream, CodedOutputStream.computePreferredBufferSize(CodedOutputStream.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        codedOutputStreamNewInstance.writeUInt32NoTag(serializedSize);
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    @Override // com.google.protobuf.s0
    public abstract /* synthetic */ void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    @Override // com.google.protobuf.s0
    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream, CodedOutputStream.computePreferredBufferSize(getSerializedSize()));
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC0156a.addAll((Iterable) iterable, (List) list);
    }
}
