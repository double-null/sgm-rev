package com.explorestack.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: Option.java */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends j0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r1 f10787d = new r1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final s1<r1> f10788e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f10789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Any f10790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f10791c;

    /* JADX INFO: compiled from: Option.java */
    static class a extends com.explorestack.protobuf.b<r1> {
        a() {
        }

        @Override // com.explorestack.protobuf.s1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r1 parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new r1(nVar, yVar, null);
        }
    }

    /* JADX INFO: compiled from: Option.java */
    public static final class b extends j0.b<b> implements MessageOrBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f10792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Any f10793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e2<Any, Any.Builder, e> f10794c;

        /* synthetic */ b(j0.c cVar, a aVar) {
            this(cVar);
        }

        private void maybeForceBuilderInitialization() {
            boolean z10 = j0.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r1 build() {
            r1 r1VarBuildPartial = buildPartial();
            if (r1VarBuildPartial.isInitialized()) {
                return r1VarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) r1VarBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r1 buildPartial() {
            r1 r1Var = new r1(this, (a) null);
            r1Var.f10789a = this.f10792a;
            e2<Any, Any.Builder, e> e2Var = this.f10794c;
            if (e2Var == null) {
                r1Var.f10790b = this.f10793b;
            } else {
                r1Var.f10790b = (Any) e2Var.a();
            }
            onBuilt();
            return r1Var;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f10792a = "";
            if (this.f10794c == null) {
                this.f10793b = null;
            } else {
                this.f10793b = null;
                this.f10794c = null;
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return p2.f10752i;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (b) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (b) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return p2.f10753j.d(r1.class, b.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b mo162clone() {
            return (b) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public r1 mo164getDefaultInstanceForType() {
            return r1.f();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(n nVar, y yVar) throws Throwable {
            r1 r1Var = null;
            try {
                try {
                    r1 r1Var2 = (r1) r1.f10788e.parsePartialFrom(nVar, yVar);
                    if (r1Var2 != null) {
                        n(r1Var2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    r1 r1Var3 = (r1) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        r1Var = r1Var3;
                        if (r1Var != null) {
                            n(r1Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (r1Var != null) {
                    n(r1Var);
                }
                throw th;
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof r1) {
                return n((r1) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public b n(r1 r1Var) {
            if (r1Var == r1.f()) {
                return this;
            }
            if (!r1Var.getName().isEmpty()) {
                this.f10792a = r1Var.f10789a;
                onChanged();
            }
            if (r1Var.hasValue()) {
                p(r1Var.h());
            }
            mergeUnknownFields(r1Var.unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(u2 u2Var) {
            return (b) super.mergeUnknownFields(u2Var);
        }

        public b p(Any any) {
            e2<Any, Any.Builder, e> e2Var = this.f10794c;
            if (e2Var == null) {
                Any any2 = this.f10793b;
                if (any2 != null) {
                    this.f10793b = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                } else {
                    this.f10793b = any;
                }
                onChanged();
            } else {
                e2Var.g(any);
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(u2 u2Var) {
            return (b) super.setUnknownFields(u2Var);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            this.f10792a = "";
            maybeForceBuilderInitialization();
        }

        private b(j0.c cVar) {
            super(cVar);
            this.f10792a = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ r1(n nVar, y yVar, a aVar) throws InvalidProtocolBufferException {
        this(nVar, yVar);
    }

    public static r1 f() {
        return f10787d;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return p2.f10752i;
    }

    public static b k() {
        return f10787d.toBuilder();
    }

    public static s1<r1> parser() {
        return f10788e;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return super.equals(obj);
        }
        r1 r1Var = (r1) obj;
        if (getName().equals(r1Var.getName()) && hasValue() == r1Var.hasValue()) {
            return (!hasValue() || h().equals(r1Var.h())) && this.unknownFields.equals(r1Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public r1 mo164getDefaultInstanceForType() {
        return f10787d;
    }

    public String getName() {
        Object obj = this.f10789a;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f10789a = stringUtf8;
        return stringUtf8;
    }

    public ByteString getNameBytes() {
        Object obj = this.f10789a;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f10789a = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<r1> getParserForType() {
        return f10788e;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = getNameBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.f10789a);
        if (this.f10790b != null) {
            iComputeStringSize += CodedOutputStream.G(2, h());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    public Any h() {
        Any any = this.f10790b;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public boolean hasValue() {
        return this.f10790b != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (hasValue()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + h().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return p2.f10753j.d(r1.class, b.class);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f10791c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f10791c = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return k();
    }

    @Override // com.explorestack.protobuf.j0
    protected Object newInstance(j0.g gVar) {
        return new r1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(j0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f10787d ? new b(aVar) : new b(aVar).n(this);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.f10789a);
        }
        if (this.f10790b != null) {
            codedOutputStream.L0(2, h());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* synthetic */ r1(j0.b bVar, a aVar) {
        this(bVar);
    }

    private r1(j0.b<?> bVar) {
        super(bVar);
        this.f10791c = (byte) -1;
    }

    private r1() {
        this.f10791c = (byte) -1;
        this.f10789a = "";
    }

    private r1(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            this.f10789a = nVar.J();
                        } else if (iK != 18) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            Any any = this.f10790b;
                            Any.Builder builder = any != null ? any.toBuilder() : null;
                            Any any2 = (Any) nVar.A(Any.parser(), yVar);
                            this.f10790b = any2;
                            if (builder != null) {
                                builder.mergeFrom(any2);
                                this.f10790b = builder.buildPartial();
                            }
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
