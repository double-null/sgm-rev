package com.google.protobuf;

import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: FieldInfo.java */
/* JADX INFO: loaded from: classes4.dex */
final class t implements Comparable<t> {
    private final Field cachedSizeField;
    private final boolean enforceUtf8;
    private final a0.e enumVerifier;
    private final Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final b1 oneof;
    private final Class<?> oneofStoredType;
    private final Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final v type;

    /* JADX INFO: compiled from: FieldInfo.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType;

        static {
            int[] iArr = new int[v.values().length];
            $SwitchMap$com$google$protobuf$FieldType = iArr;
            try {
                iArr[v.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[v.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[v.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[v.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldInfo.java */
    public static final class b {
        private Field cachedSizeField;
        private boolean enforceUtf8;
        private a0.e enumVerifier;
        private Field field;
        private int fieldNumber;
        private Object mapDefaultEntry;
        private b1 oneof;
        private Class<?> oneofStoredType;
        private Field presenceField;
        private int presenceMask;
        private boolean required;
        private v type;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public t build() {
            b1 b1Var = this.oneof;
            if (b1Var != null) {
                return t.forOneofMemberField(this.fieldNumber, this.type, b1Var, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return t.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            Field field = this.presenceField;
            if (field != null) {
                return this.required ? t.forLegacyRequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier) : t.forExplicitPresenceField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            a0.e eVar = this.enumVerifier;
            if (eVar != null) {
                Field field2 = this.cachedSizeField;
                return field2 == null ? t.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, eVar) : t.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, eVar, field2);
            }
            Field field3 = this.cachedSizeField;
            return field3 == null ? t.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8) : t.forPackedField(this.field, this.fieldNumber, this.type, field3);
        }

        public b withCachedSizeField(Field field) {
            this.cachedSizeField = field;
            return this;
        }

        public b withEnforceUtf8(boolean z10) {
            this.enforceUtf8 = z10;
            return this;
        }

        public b withEnumVerifier(a0.e eVar) {
            this.enumVerifier = eVar;
            return this;
        }

        public b withField(Field field) {
            if (this.oneof != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.field = field;
            return this;
        }

        public b withFieldNumber(int i10) {
            this.fieldNumber = i10;
            return this;
        }

        public b withMapDefaultEntry(Object obj) {
            this.mapDefaultEntry = obj;
            return this;
        }

        public b withOneof(b1 b1Var, Class<?> cls) {
            if (this.field != null || this.presenceField != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneof = b1Var;
            this.oneofStoredType = cls;
            return this;
        }

        public b withPresence(Field field, int i10) {
            this.presenceField = (Field) a0.checkNotNull(field, "presenceField");
            this.presenceMask = i10;
            return this;
        }

        public b withRequired(boolean z10) {
            this.required = z10;
            return this;
        }

        public b withType(v vVar) {
            this.type = vVar;
            return this;
        }
    }

    private t(Field field, int i10, v vVar, Class<?> cls, Field field2, int i11, boolean z10, boolean z11, b1 b1Var, Class<?> cls2, Object obj, a0.e eVar, Field field3) {
        this.field = field;
        this.type = vVar;
        this.messageClass = cls;
        this.fieldNumber = i10;
        this.presenceField = field2;
        this.presenceMask = i11;
        this.required = z10;
        this.enforceUtf8 = z11;
        this.oneof = b1Var;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = eVar;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int i10) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i10);
    }

    public static t forExplicitPresenceField(Field field, int i10, v vVar, Field field2, int i11, boolean z10, a0.e eVar) {
        checkFieldNumber(i10);
        a0.checkNotNull(field, "field");
        a0.checkNotNull(vVar, "fieldType");
        a0.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i11)) {
            return new t(field, i10, vVar, null, field2, i11, false, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static t forField(Field field, int i10, v vVar, boolean z10) {
        checkFieldNumber(i10);
        a0.checkNotNull(field, "field");
        a0.checkNotNull(vVar, "fieldType");
        if (vVar == v.MESSAGE_LIST || vVar == v.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new t(field, i10, vVar, null, null, 0, false, z10, null, null, null, null, null);
    }

    public static t forFieldWithEnumVerifier(Field field, int i10, v vVar, a0.e eVar) {
        checkFieldNumber(i10);
        a0.checkNotNull(field, "field");
        return new t(field, i10, vVar, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static t forLegacyRequiredField(Field field, int i10, v vVar, Field field2, int i11, boolean z10, a0.e eVar) {
        checkFieldNumber(i10);
        a0.checkNotNull(field, "field");
        a0.checkNotNull(vVar, "fieldType");
        a0.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i11)) {
            return new t(field, i10, vVar, null, field2, i11, true, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static t forMapField(Field field, int i10, Object obj, a0.e eVar) {
        a0.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i10);
        a0.checkNotNull(field, "field");
        return new t(field, i10, v.MAP, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static t forOneofMemberField(int i10, v vVar, b1 b1Var, Class<?> cls, boolean z10, a0.e eVar) {
        checkFieldNumber(i10);
        a0.checkNotNull(vVar, "fieldType");
        a0.checkNotNull(b1Var, "oneof");
        a0.checkNotNull(cls, "oneofStoredType");
        if (vVar.isScalar()) {
            return new t(null, i10, vVar, null, null, 0, false, z10, b1Var, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i10 + " is of type " + vVar);
    }

    public static t forPackedField(Field field, int i10, v vVar, Field field2) {
        checkFieldNumber(i10);
        a0.checkNotNull(field, "field");
        a0.checkNotNull(vVar, "fieldType");
        if (vVar == v.MESSAGE_LIST || vVar == v.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new t(field, i10, vVar, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static t forPackedFieldWithEnumVerifier(Field field, int i10, v vVar, a0.e eVar, Field field2) {
        checkFieldNumber(i10);
        a0.checkNotNull(field, "field");
        return new t(field, i10, vVar, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    private static boolean isExactlyOneBitSet(int i10) {
        return i10 != 0 && (i10 & (i10 + (-1))) == 0;
    }

    public static b newBuilder() {
        return new b(null);
    }

    public Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public a0.e getEnumVerifier() {
        return this.enumVerifier;
    }

    public Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int i10 = a.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        }
        if (i10 == 3 || i10 == 4) {
            return this.messageClass;
        }
        return null;
    }

    public b1 getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public v getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }

    @Override // java.lang.Comparable
    public int compareTo(t tVar) {
        return this.fieldNumber - tVar.fieldNumber;
    }

    public static t forRepeatedMessageField(Field field, int i10, v vVar, Class<?> cls) {
        checkFieldNumber(i10);
        a0.checkNotNull(field, "field");
        a0.checkNotNull(vVar, "fieldType");
        a0.checkNotNull(cls, edUJlCZxhVnO.coYsamZvOfLUjM);
        return new t(field, i10, vVar, cls, null, 0, false, false, null, null, null, null, null);
    }
}
