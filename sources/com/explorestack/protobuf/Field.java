package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Field extends j0 implements MessageOrBuilder {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Field f10143l = new Field();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final s1<Field> f10144m = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Object f10148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f10149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<r1> f10152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Object f10153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Object f10154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte f10155k;

    public enum Cardinality implements l0.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private final int value;
        private static final l0.d<Cardinality> internalValueMap = new a();
        private static final Cardinality[] VALUES = values();

        static class a implements l0.d<Cardinality> {
            a() {
            }

            @Override // com.explorestack.protobuf.l0.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Cardinality findValueByNumber(int i10) {
                return Cardinality.forNumber(i10);
            }
        }

        Cardinality(int i10) {
            this.value = i10;
        }

        public static Cardinality forNumber(int i10) {
            if (i10 == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i10 == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i10 == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i10 != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Field.getDescriptor().getEnumTypes().get(1);
        }

        public static l0.d<Cardinality> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.l0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static Cardinality valueOf(int i10) {
            return forNumber(i10);
        }

        public static Cardinality valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum Kind implements l0.c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final l0.d<Kind> internalValueMap = new a();
        private static final Kind[] VALUES = values();

        static class a implements l0.d<Kind> {
            a() {
            }

            @Override // com.explorestack.protobuf.l0.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Kind findValueByNumber(int i10) {
                return Kind.forNumber(i10);
            }
        }

        Kind(int i10) {
            this.value = i10;
        }

        public static Kind forNumber(int i10) {
            switch (i10) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Field.getDescriptor().getEnumTypes().get(0);
        }

        public static l0.d<Kind> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.l0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static Kind valueOf(int i10) {
            return forNumber(i10);
        }

        public static Kind valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static class a extends com.explorestack.protobuf.b<Field> {
        a() {
        }

        @Override // com.explorestack.protobuf.s1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Field parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Field(nVar, yVar, null);
        }
    }

    public static final class b extends j0.b<b> implements MessageOrBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f10160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f10161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f10162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f10163h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<r1> f10164i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private z1<r1, r1.b, Object> f10165j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Object f10166k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Object f10167l;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void k() {
            if ((this.f10156a & 1) == 0) {
                this.f10164i = new ArrayList(this.f10164i);
                this.f10156a |= 1;
            }
        }

        private z1<r1, r1.b, Object> m() {
            if (this.f10165j == null) {
                this.f10165j = new z1<>(this.f10164i, (this.f10156a & 1) != 0, getParentForChildren(), isClean());
                this.f10164i = null;
            }
            return this.f10165j;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                m();
            }
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Field build() {
            Field fieldBuildPartial = buildPartial();
            if (fieldBuildPartial.isInitialized()) {
                return fieldBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) fieldBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Field buildPartial() {
            Field field = new Field(this, (a) null);
            field.f10145a = this.f10157b;
            field.f10146b = this.f10158c;
            field.f10147c = this.f10159d;
            field.f10148d = this.f10160e;
            field.f10149e = this.f10161f;
            field.f10150f = this.f10162g;
            field.f10151g = this.f10163h;
            z1<r1, r1.b, Object> z1Var = this.f10165j;
            if (z1Var == null) {
                if ((this.f10156a & 1) != 0) {
                    this.f10164i = Collections.unmodifiableList(this.f10164i);
                    this.f10156a &= -2;
                }
                field.f10152h = this.f10164i;
            } else {
                field.f10152h = z1Var.f();
            }
            field.f10153i = this.f10166k;
            field.f10154j = this.f10167l;
            onBuilt();
            return field;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b clear() {
            super.clear();
            this.f10157b = 0;
            this.f10158c = 0;
            this.f10159d = 0;
            this.f10160e = "";
            this.f10161f = "";
            this.f10162g = 0;
            this.f10163h = false;
            z1<r1, r1.b, Object> z1Var = this.f10165j;
            if (z1Var == null) {
                this.f10164i = Collections.emptyList();
                this.f10156a &= -2;
            } else {
                z1Var.g();
            }
            this.f10166k = "";
            this.f10167l = "";
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return p2.f10746c;
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
            return p2.f10747d.d(Field.class, b.class);
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
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Field mo164getDefaultInstanceForType() {
            return Field.D();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(n nVar, y yVar) throws Throwable {
            Field field = null;
            try {
                try {
                    Field field2 = (Field) Field.f10144m.parsePartialFrom(nVar, yVar);
                    if (field2 != null) {
                        o(field2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Field field3 = (Field) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        field = field3;
                        if (field != null) {
                            o(field);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (field != null) {
                    o(field);
                }
                throw th;
            }
        }

        public b o(Field field) {
            if (field == Field.D()) {
                return this;
            }
            if (field.f10145a != 0) {
                t(field.N());
            }
            if (field.f10146b != 0) {
                r(field.C());
            }
            if (field.U() != 0) {
                u(field.U());
            }
            if (!field.getName().isEmpty()) {
                this.f10160e = field.f10148d;
                onChanged();
            }
            if (!field.getTypeUrl().isEmpty()) {
                this.f10161f = field.f10149e;
                onChanged();
            }
            if (field.Y() != 0) {
                v(field.Y());
            }
            if (field.e0()) {
                w(field.e0());
            }
            if (this.f10165j == null) {
                if (!field.f10152h.isEmpty()) {
                    if (this.f10164i.isEmpty()) {
                        this.f10164i = field.f10152h;
                        this.f10156a &= -2;
                    } else {
                        k();
                        this.f10164i.addAll(field.f10152h);
                    }
                    onChanged();
                }
            } else if (!field.f10152h.isEmpty()) {
                if (this.f10165j.t()) {
                    this.f10165j.h();
                    this.f10165j = null;
                    this.f10164i = field.f10152h;
                    this.f10156a &= -2;
                    this.f10165j = j0.alwaysUseFieldBuilders ? m() : null;
                } else {
                    this.f10165j.a(field.f10152h);
                }
            }
            if (!field.I().isEmpty()) {
                this.f10166k = field.f10153i;
                onChanged();
            }
            if (!field.G().isEmpty()) {
                this.f10167l = field.f10154j;
                onChanged();
            }
            mergeUnknownFields(field.unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (message instanceof Field) {
                return o((Field) message);
            }
            super.mergeFrom(message);
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final b mergeUnknownFields(u2 u2Var) {
            return (b) super.mergeUnknownFields(u2Var);
        }

        public b r(int i10) {
            this.f10158c = i10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b t(int i10) {
            this.f10157b = i10;
            onChanged();
            return this;
        }

        public b u(int i10) {
            this.f10159d = i10;
            onChanged();
            return this;
        }

        public b v(int i10) {
            this.f10162g = i10;
            onChanged();
            return this;
        }

        public b w(boolean z10) {
            this.f10163h = z10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(u2 u2Var) {
            return (b) super.setUnknownFields(u2Var);
        }

        /* synthetic */ b(j0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f10157b = 0;
            this.f10158c = 0;
            this.f10160e = "";
            this.f10161f = "";
            this.f10164i = Collections.emptyList();
            this.f10166k = "";
            this.f10167l = "";
            maybeForceBuilderInitialization();
        }

        private b(j0.c cVar) {
            super(cVar);
            this.f10157b = 0;
            this.f10158c = 0;
            this.f10160e = "";
            this.f10161f = "";
            this.f10164i = Collections.emptyList();
            this.f10166k = "";
            this.f10167l = "";
            maybeForceBuilderInitialization();
        }
    }

    /* synthetic */ Field(n nVar, y yVar, a aVar) throws InvalidProtocolBufferException {
        this(nVar, yVar);
    }

    public static Field D() {
        return f10143l;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return p2.f10746c;
    }

    public static b h0() {
        return f10143l.toBuilder();
    }

    public int C() {
        return this.f10146b;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Field mo164getDefaultInstanceForType() {
        return f10143l;
    }

    public String G() {
        Object obj = this.f10154j;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f10154j = stringUtf8;
        return stringUtf8;
    }

    public ByteString H() {
        Object obj = this.f10154j;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f10154j = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String I() {
        Object obj = this.f10153i;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f10153i = stringUtf8;
        return stringUtf8;
    }

    public ByteString K() {
        Object obj = this.f10153i;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f10153i = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public int N() {
        return this.f10145a;
    }

    public int U() {
        return this.f10147c;
    }

    public int Y() {
        return this.f10150f;
    }

    public int a0() {
        return this.f10152h.size();
    }

    public List<r1> d0() {
        return this.f10152h;
    }

    public boolean e0() {
        return this.f10151g;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Field)) {
            return super.equals(obj);
        }
        Field field = (Field) obj;
        return this.f10145a == field.f10145a && this.f10146b == field.f10146b && U() == field.U() && getName().equals(field.getName()) && getTypeUrl().equals(field.getTypeUrl()) && Y() == field.Y() && e0() == field.e0() && d0().equals(field.d0()) && I().equals(field.I()) && G().equals(field.G()) && this.unknownFields.equals(field.unknownFields);
    }

    public String getName() {
        Object obj = this.f10148d;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f10148d = stringUtf8;
        return stringUtf8;
    }

    public ByteString getNameBytes() {
        Object obj = this.f10148d;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f10148d = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Field> getParserForType() {
        return f10144m;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iL = this.f10145a != Kind.TYPE_UNKNOWN.getNumber() ? CodedOutputStream.l(1, this.f10145a) + 0 : 0;
        if (this.f10146b != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            iL += CodedOutputStream.l(2, this.f10146b);
        }
        int i11 = this.f10147c;
        if (i11 != 0) {
            iL += CodedOutputStream.x(3, i11);
        }
        if (!getNameBytes().isEmpty()) {
            iL += j0.computeStringSize(4, this.f10148d);
        }
        if (!getTypeUrlBytes().isEmpty()) {
            iL += j0.computeStringSize(6, this.f10149e);
        }
        int i12 = this.f10150f;
        if (i12 != 0) {
            iL += CodedOutputStream.x(7, i12);
        }
        boolean z10 = this.f10151g;
        if (z10) {
            iL += CodedOutputStream.e(8, z10);
        }
        for (int i13 = 0; i13 < this.f10152h.size(); i13++) {
            iL += CodedOutputStream.G(9, this.f10152h.get(i13));
        }
        if (!K().isEmpty()) {
            iL += j0.computeStringSize(10, this.f10153i);
        }
        if (!H().isEmpty()) {
            iL += j0.computeStringSize(11, this.f10154j);
        }
        int serializedSize = iL + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public String getTypeUrl() {
        Object obj = this.f10149e;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f10149e = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTypeUrlBytes() {
        Object obj = this.f10149e;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.f10149e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f10145a) * 37) + 2) * 53) + this.f10146b) * 37) + 3) * 53) + U()) * 37) + 4) * 53) + getName().hashCode()) * 37) + 6) * 53) + getTypeUrl().hashCode()) * 37) + 7) * 53) + Y()) * 37) + 8) * 53) + l0.d(e0());
        if (a0() > 0) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + d0().hashCode();
        }
        int iHashCode2 = (((((((((iHashCode * 37) + 10) * 53) + I().hashCode()) * 37) + 11) * 53) + G().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return h0();
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return p2.f10747d.d(Field.class, b.class);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f10155k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f10155k = (byte) 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(j0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f10143l ? new b(aVar) : new b(aVar).o(this);
    }

    @Override // com.explorestack.protobuf.j0
    protected Object newInstance(j0.g gVar) {
        return new Field();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f10145a != Kind.TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.v0(1, this.f10145a);
        }
        if (this.f10146b != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            codedOutputStream.v0(2, this.f10146b);
        }
        int i10 = this.f10147c;
        if (i10 != 0) {
            codedOutputStream.H0(3, i10);
        }
        if (!getNameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 4, this.f10148d);
        }
        if (!getTypeUrlBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 6, this.f10149e);
        }
        int i11 = this.f10150f;
        if (i11 != 0) {
            codedOutputStream.H0(7, i11);
        }
        boolean z10 = this.f10151g;
        if (z10) {
            codedOutputStream.n0(8, z10);
        }
        for (int i12 = 0; i12 < this.f10152h.size(); i12++) {
            codedOutputStream.L0(9, this.f10152h.get(i12));
        }
        if (!K().isEmpty()) {
            j0.writeString(codedOutputStream, 10, this.f10153i);
        }
        if (!H().isEmpty()) {
            j0.writeString(codedOutputStream, 11, this.f10154j);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* synthetic */ Field(j0.b bVar, a aVar) {
        this(bVar);
    }

    private Field(j0.b<?> bVar) {
        super(bVar);
        this.f10155k = (byte) -1;
    }

    private Field() {
        this.f10155k = (byte) -1;
        this.f10145a = 0;
        this.f10146b = 0;
        this.f10148d = "";
        this.f10149e = "";
        this.f10152h = Collections.emptyList();
        this.f10153i = "";
        this.f10154j = "";
    }

    private Field(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    switch (iK) {
                        case 0:
                            break;
                        case 8:
                            this.f10145a = nVar.t();
                            continue;
                        case 16:
                            this.f10146b = nVar.t();
                            continue;
                        case 24:
                            this.f10147c = nVar.y();
                            continue;
                        case 34:
                            this.f10148d = nVar.J();
                            continue;
                        case 50:
                            this.f10149e = nVar.J();
                            continue;
                        case 56:
                            this.f10150f = nVar.y();
                            continue;
                        case 64:
                            this.f10151g = nVar.q();
                            continue;
                        case 74:
                            if (!(z11 & true)) {
                                this.f10152h = new ArrayList();
                                z11 |= true;
                            }
                            this.f10152h.add((r1) nVar.A(r1.parser(), yVar));
                            continue;
                        case 82:
                            this.f10153i = nVar.J();
                            continue;
                        case 90:
                            this.f10154j = nVar.J();
                            continue;
                        default:
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                break;
                            }
                            break;
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (z11 & true) {
                    this.f10152h = Collections.unmodifiableList(this.f10152h);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z11 & true) {
            this.f10152h = Collections.unmodifiableList(this.f10152h);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
