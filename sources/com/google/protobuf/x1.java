package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: WireFormat.java */
/* JADX INFO: loaded from: classes4.dex */
public final class x1 {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);

    /* JADX INFO: compiled from: WireFormat.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: WireFormat.java */
    public static class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BOOL;
        public static final b BYTES;
        public static final b DOUBLE;
        public static final b ENUM;
        public static final b FIXED32;
        public static final b FIXED64;
        public static final b FLOAT;
        public static final b GROUP;
        public static final b INT32;
        public static final b INT64;
        public static final b MESSAGE;
        public static final b SFIXED32;
        public static final b SFIXED64;
        public static final b SINT32;
        public static final b SINT64;
        public static final b STRING;
        public static final b UINT32;
        public static final b UINT64;
        private final c javaType;
        private final int wireType;

        /* JADX INFO: compiled from: WireFormat.java */
        final enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.x1.b
            public boolean isPackable() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.x1$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WireFormat.java */
        final enum C0159b extends b {
            C0159b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.x1.b
            public boolean isPackable() {
                return false;
            }
        }

        /* JADX INFO: compiled from: WireFormat.java */
        final enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.x1.b
            public boolean isPackable() {
                return false;
            }
        }

        /* JADX INFO: compiled from: WireFormat.java */
        final enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.x1.b
            public boolean isPackable() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            DOUBLE = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            FLOAT = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            INT64 = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            UINT64 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            INT32 = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            FIXED64 = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            FIXED32 = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            BOOL = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            STRING = aVar;
            c cVar3 = c.MESSAGE;
            C0159b c0159b = new C0159b("GROUP", 9, cVar3, 3);
            GROUP = c0159b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            MESSAGE = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            BYTES = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            UINT32 = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            ENUM = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            SFIXED32 = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            SFIXED64 = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            SINT32 = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            SINT64 = bVar14;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0159b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        /* synthetic */ b(String str, int i10, c cVar, int i11, a aVar) {
            this(str, i10, cVar, i11);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public c getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        private b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.javaType = cVar;
            this.wireType = i11;
        }
    }

    /* JADX INFO: compiled from: WireFormat.java */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(i.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        c(Object obj) {
            this.defaultDefault = obj;
        }

        Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: WireFormat.java */
    static abstract class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d LAZY;
        public static final d LOOSE;
        public static final d STRICT;

        /* JADX INFO: compiled from: WireFormat.java */
        final enum a extends d {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.x1.d
            Object readString(j jVar) throws IOException {
                return jVar.readString();
            }
        }

        /* JADX INFO: compiled from: WireFormat.java */
        final enum b extends d {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.x1.d
            Object readString(j jVar) throws IOException {
                return jVar.readStringRequireUtf8();
            }
        }

        /* JADX INFO: compiled from: WireFormat.java */
        final enum c extends d {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.x1.d
            Object readString(j jVar) throws IOException {
                return jVar.readBytes();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            LOOSE = aVar;
            b bVar = new b("STRICT", 1);
            STRICT = bVar;
            c cVar = new c("LAZY", 2);
            LAZY = cVar;
            $VALUES = new d[]{aVar, bVar, cVar};
        }

        private d(String str, int i10) {
            super(str, i10);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        abstract Object readString(j jVar) throws IOException;

        /* synthetic */ d(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    private x1() {
    }

    public static int getTagFieldNumber(int i10) {
        return i10 >>> 3;
    }

    public static int getTagWireType(int i10) {
        return i10 & 7;
    }

    static int makeTag(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    static Object readPrimitiveField(j jVar, b bVar, d dVar) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(jVar.readDouble());
            case 2:
                return Float.valueOf(jVar.readFloat());
            case 3:
                return Long.valueOf(jVar.readInt64());
            case 4:
                return Long.valueOf(jVar.readUInt64());
            case 5:
                return Integer.valueOf(jVar.readInt32());
            case 6:
                return Long.valueOf(jVar.readFixed64());
            case 7:
                return Integer.valueOf(jVar.readFixed32());
            case 8:
                return Boolean.valueOf(jVar.readBool());
            case 9:
                return jVar.readBytes();
            case 10:
                return Integer.valueOf(jVar.readUInt32());
            case 11:
                return Integer.valueOf(jVar.readSFixed32());
            case 12:
                return Long.valueOf(jVar.readSFixed64());
            case 13:
                return Integer.valueOf(jVar.readSInt32());
            case 14:
                return Long.valueOf(jVar.readSInt64());
            case 15:
                return dVar.readString(jVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
