package com.google.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: MessageSchema.java */
/* JADX INFO: loaded from: classes4.dex */
final class v0<T> implements l1<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final s0 defaultInstance;
    private final q<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final i0 listFieldSchema;
    private final boolean lite;
    private final n0 mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final x0 newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final e1 syntax;
    private final r1<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = v1.getUnsafe();

    /* JADX INFO: compiled from: MessageSchema.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[x1.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[x1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private v0(int[] iArr, Object[] objArr, int i10, int i11, s0 s0Var, e1 e1Var, boolean z10, int[] iArr2, int i12, int i13, x0 x0Var, i0 i0Var, r1<?, ?> r1Var, q<?> qVar, n0 n0Var) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = s0Var instanceof y;
        this.syntax = e1Var;
        this.hasExtensions = qVar != null && qVar.hasExtensions(s0Var);
        this.useCachedSizeField = z10;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = x0Var;
        this.listFieldSchema = i0Var;
        this.unknownFieldSchema = r1Var;
        this.extensionSchema = qVar;
        this.defaultInstance = s0Var;
        this.mapFieldSchema = n0Var;
    }

    private boolean arePresentForEquals(T t10, T t11, int i10) {
        return isFieldPresent(t10, i10) == isFieldPresent(t11, i10);
    }

    private static <T> boolean booleanAt(T t10, long j10) {
        return v1.getBoolean(t10, j10);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, l0.b<K, V> bVar, Map<K, V> map, e.b bVar2) throws IOException {
        int iDecodeVarint32;
        int iDecodeVarint33 = e.decodeVarint32(bArr, i10, bVar2);
        int i12 = bVar2.int1;
        if (i12 < 0 || i12 > i11 - iDecodeVarint33) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = iDecodeVarint33 + i12;
        Object obj = bVar.defaultKey;
        Object obj2 = bVar.defaultValue;
        while (iDecodeVarint33 < i13) {
            int i14 = iDecodeVarint33 + 1;
            int i15 = bArr[iDecodeVarint33];
            if (i15 < 0) {
                iDecodeVarint32 = e.decodeVarint32(i15, bArr, i14, bVar2);
                i15 = bVar2.int1;
            } else {
                iDecodeVarint32 = i14;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == bVar.valueType.getWireType()) {
                    iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i11, bVar.valueType, bVar.defaultValue.getClass(), bVar2);
                    obj2 = bVar2.object1;
                } else {
                    iDecodeVarint33 = e.skipField(i15, bArr, iDecodeVarint32, i11, bVar2);
                }
            } else if (i17 == bVar.keyType.getWireType()) {
                iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i11, bVar.keyType, null, bVar2);
                obj = bVar2.object1;
            } else {
                iDecodeVarint33 = e.skipField(i15, bArr, iDecodeVarint32, i11, bVar2);
            }
        }
        if (iDecodeVarint33 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i13;
    }

    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, x1.b bVar, Class<?> cls, e.b bVar2) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                int iDecodeVarint64 = e.decodeVarint64(bArr, i10, bVar2);
                bVar2.object1 = Boolean.valueOf(bVar2.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return e.decodeBytes(bArr, i10, bVar2);
            case 3:
                bVar2.object1 = Double.valueOf(e.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                bVar2.object1 = Integer.valueOf(e.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                bVar2.object1 = Long.valueOf(e.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                bVar2.object1 = Float.valueOf(e.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = e.decodeVarint32(bArr, i10, bVar2);
                bVar2.object1 = Integer.valueOf(bVar2.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = e.decodeVarint64(bArr, i10, bVar2);
                bVar2.object1 = Long.valueOf(bVar2.long1);
                return iDecodeVarint65;
            case 14:
                return e.decodeMessageField(f1.getInstance().schemaFor((Class) cls), bArr, i10, i11, bVar2);
            case 15:
                int iDecodeVarint33 = e.decodeVarint32(bArr, i10, bVar2);
                bVar2.object1 = Integer.valueOf(j.decodeZigZag32(bVar2.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = e.decodeVarint64(bArr, i10, bVar2);
                bVar2.object1 = Long.valueOf(j.decodeZigZag64(bVar2.long1));
                return iDecodeVarint66;
            case 17:
                return e.decodeStringRequireUtf8(bArr, i10, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t10, long j10) {
        return v1.getDouble(t10, j10);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub2, r1<UT, UB> r1Var, Object obj2) {
        a0.e enumFieldVerifier;
        int iNumberAt = numberAt(i10);
        Object object = v1.getObject(obj, offset(typeAndOffsetAt(i10)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i10)) == null) ? ub2 : (UB) filterUnknownEnumMap(i10, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, r1Var, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, a0.e eVar, UB ub2, r1<UT, UB> r1Var, Object obj) {
        l0.b<?, ?> bVarForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = r1Var.getBuilderFromMessage(obj);
                }
                i.h hVarNewCodedBuilder = i.newCodedBuilder(l0.computeSerializedSize(bVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    l0.writeTo(hVarNewCodedBuilder.getCodedOutput(), bVarForMapMetadata, next.getKey(), next.getValue());
                    r1Var.addLengthDelimited(ub2, i11, hVarNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t10, long j10) {
        return v1.getFloat(t10, j10);
    }

    private a0.e getEnumFieldVerifier(int i10) {
        return (a0.e) this.objects[((i10 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    private l1 getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        l1 l1Var = (l1) this.objects[i11];
        if (l1Var != null) {
            return l1Var;
        }
        l1<T> l1VarSchemaFor = f1.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = l1VarSchemaFor;
        return l1VarSchemaFor;
    }

    static s1 getMutableUnknownFields(Object obj) {
        y yVar = (y) obj;
        s1 s1Var = yVar.unknownFields;
        if (s1Var != s1.getDefaultInstance()) {
            return s1Var;
        }
        s1 s1VarNewInstance = s1.newInstance();
        yVar.unknownFields = s1VarNewInstance;
        return s1VarNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(r1<UT, UB> r1Var, T t10) {
        return r1Var.getSerializedSize(r1Var.getFromMessage(t10));
    }

    private static <T> int intAt(T t10, long j10) {
        return v1.getInt(t10, j10);
    }

    private static boolean isEnforceUtf8(int i10) {
        return (i10 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return isFieldPresent(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) v1.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        l1 messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.l1] */
    private boolean isMapInitialized(T t10, int i10, int i11) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(v1.getObject(t10, offset(i10)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)).valueType.getJavaType() != x1.c.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            if (SchemaFor == 0) {
                SchemaFor = SchemaFor;
                SchemaFor = f1.getInstance().schemaFor((Class) obj.getClass());
            }
            SchemaFor = SchemaFor;
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y) {
            return ((y) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t10, T t11, int i10) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        return v1.getInt(t10, jPresenceMaskAndOffsetAt) == v1.getInt(t11, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t10, int i10, int i11) {
        return v1.getInt(t10, (long) (presenceMaskAndOffsetAt(i11) & 1048575)) == i10;
    }

    private static boolean isRequired(int i10) {
        return (i10 & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t10, long j10) {
        return v1.getLong(t10, j10);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0646 A[Catch: all -> 0x069e, TRY_LEAVE, TryCatch #12 {all -> 0x069e, blocks: (B:156:0x0617, B:167:0x0640, B:169:0x0646, B:179:0x066e, B:180:0x0673), top: B:212:0x0617 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0653 A[LOOP:2: B:172:0x064f->B:174:0x0653, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0668  */
    /* JADX WARN: Code duplicated, block: B:178:0x066c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x066e A[Catch: all -> 0x069e, TRY_ENTER, TryCatch #12 {all -> 0x069e, blocks: (B:156:0x0617, B:167:0x0640, B:169:0x0646, B:179:0x066e, B:180:0x0673), top: B:212:0x0617 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0680 A[LOOP:3: B:183:0x067c->B:185:0x0680, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x0695  */
    /* JADX WARN: Code duplicated, block: B:201:0x06af A[LOOP:4: B:199:0x06ab->B:201:0x06af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:231:0x064c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0679 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends u.c<ET>> void mergeFromHelper(r1<UT, UB> r1Var, q<ET> qVar, T t10, j1 j1Var, p pVar) throws Throwable {
        T t11;
        r1 r1Var2;
        int i10;
        Object objFilterMapUnknownEnumValues;
        T t12;
        p pVar2;
        int i11;
        Object objFilterMapUnknownEnumValues2;
        int i12;
        Object objFilterMapUnknownEnumValues3;
        Object obj;
        r1 r1Var3 = r1Var;
        T t13 = t10;
        p pVar3 = pVar;
        Object builderFromMessage = null;
        Object obj2 = null;
        while (true) {
            try {
                int fieldNumber = j1Var.getFieldNumber();
                int iPositionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (iPositionForFieldNumber >= 0) {
                    t11 = t13;
                    try {
                        int iTypeAndOffsetAt = typeAndOffsetAt(iPositionForFieldNumber);
                        try {
                            switch (type(iTypeAndOffsetAt)) {
                                case 0:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putDouble(t11, offset(iTypeAndOffsetAt), j1Var.readDouble());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 1:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putFloat(t11, offset(iTypeAndOffsetAt), j1Var.readFloat());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 2:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putLong(t11, offset(iTypeAndOffsetAt), j1Var.readInt64());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 3:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putLong(t11, offset(iTypeAndOffsetAt), j1Var.readUInt64());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 4:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putInt(t11, offset(iTypeAndOffsetAt), j1Var.readInt32());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 5:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putLong(t11, offset(iTypeAndOffsetAt), j1Var.readFixed64());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 6:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putInt(t11, offset(iTypeAndOffsetAt), j1Var.readFixed32());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 7:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putBoolean(t11, offset(iTypeAndOffsetAt), j1Var.readBool());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 8:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    readString(t11, iTypeAndOffsetAt, j1Var);
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 9:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    s0 s0Var = (s0) mutableMessageFieldForMerge(t11, iPositionForFieldNumber);
                                    j1Var.mergeMessageField(s0Var, getMessageFieldSchema(iPositionForFieldNumber), pVar2);
                                    storeMessageField(t11, iPositionForFieldNumber, s0Var);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 10:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), j1Var.readBytes());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 11:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putInt(t11, offset(iTypeAndOffsetAt), j1Var.readUInt32());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 12:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    int i13 = j1Var.readEnum();
                                    a0.e enumFieldVerifier = getEnumFieldVerifier(iPositionForFieldNumber);
                                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i13)) {
                                        v1.putInt(t11, offset(iTypeAndOffsetAt), i13);
                                        setFieldPresent(t11, iPositionForFieldNumber);
                                        builderFromMessage = obj;
                                    } else {
                                        builderFromMessage = n1.storeUnknownEnum(t11, fieldNumber, i13, obj, r1Var2);
                                    }
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 13:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putInt(t11, offset(iTypeAndOffsetAt), j1Var.readSFixed32());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 14:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putLong(t11, offset(iTypeAndOffsetAt), j1Var.readSFixed64());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 15:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putInt(t11, offset(iTypeAndOffsetAt), j1Var.readSInt32());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 16:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    v1.putLong(t11, offset(iTypeAndOffsetAt), j1Var.readSInt64());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 17:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    s0 s0Var2 = (s0) mutableMessageFieldForMerge(t11, iPositionForFieldNumber);
                                    j1Var.mergeGroupField(s0Var2, getMessageFieldSchema(iPositionForFieldNumber), pVar2);
                                    storeMessageField(t11, iPositionForFieldNumber, s0Var2);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 18:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readDoubleList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 19:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readFloatList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 20:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 21:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readUInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 22:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 23:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readFixed64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 24:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readFixed32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 25:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readBoolList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 26:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    readStringList(t11, iTypeAndOffsetAt, j1Var);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 27:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    readMessageList(t10, iTypeAndOffsetAt, j1Var, getMessageFieldSchema(iPositionForFieldNumber), pVar);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 28:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readBytesList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 29:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readUInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 30:
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    List<Integer> listMutableListAt = this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt));
                                    j1Var.readEnumList(listMutableListAt);
                                    builderFromMessage = n1.filterUnknownEnumList(t10, fieldNumber, listMutableListAt, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, r1Var);
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 31:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readSFixed32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 32:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readSFixed64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 33:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readSInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 34:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readSInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 35:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readDoubleList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 36:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readFloatList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 37:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 38:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readUInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 39:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 40:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readFixed64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 41:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readFixed32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 42:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readBoolList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 43:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readUInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 44:
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    List<Integer> listMutableListAt2 = this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt));
                                    j1Var.readEnumList(listMutableListAt2);
                                    builderFromMessage = n1.filterUnknownEnumList(t10, fieldNumber, listMutableListAt2, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, r1Var);
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 45:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readSFixed32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 46:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readSFixed64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 47:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readSInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 48:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    j1Var.readSInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 49:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    readGroupList(t10, offset(iTypeAndOffsetAt), j1Var, getMessageFieldSchema(iPositionForFieldNumber), pVar);
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 50:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    try {
                                        mergeMap(t10, iPositionForFieldNumber, getMapFieldDefaultEntry(iPositionForFieldNumber), pVar, j1Var);
                                        r1Var2 = r1Var3;
                                        builderFromMessage = obj;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                        r1Var2 = r1Var3;
                                        builderFromMessage = obj;
                                        if (r1Var2.shouldDiscardUnknownFields(j1Var)) {
                                            if (builderFromMessage == null) {
                                                builderFromMessage = r1Var2.getBuilderFromMessage(t11);
                                            }
                                            if (!r1Var2.mergeOneFieldFrom(builderFromMessage, j1Var, 0)) {
                                                objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                for (i11 = this.checkInitializedCount; i11 < this.repeatedFieldOffsetStart; i11++) {
                                                    objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t10, this.intArray[i11], objFilterMapUnknownEnumValues2, r1Var, t10);
                                                }
                                                if (objFilterMapUnknownEnumValues2 != null) {
                                                    r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!j1Var.skipField()) {
                                            objFilterMapUnknownEnumValues3 = builderFromMessage;
                                            for (i12 = this.checkInitializedCount; i12 < this.repeatedFieldOffsetStart; i12++) {
                                                objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t10, this.intArray[i12], objFilterMapUnknownEnumValues3, r1Var, t10);
                                            }
                                            if (objFilterMapUnknownEnumValues3 != null) {
                                                r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        r1Var2 = r1Var3;
                                        builderFromMessage = obj;
                                        objFilterMapUnknownEnumValues = builderFromMessage;
                                        for (i10 = this.checkInitializedCount; i10 < this.repeatedFieldOffsetStart; i10++) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i10], objFilterMapUnknownEnumValues, r1Var, t10);
                                        }
                                        if (objFilterMapUnknownEnumValues != null) {
                                            r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues);
                                        }
                                        throw th;
                                    }
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 51:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Double.valueOf(j1Var.readDouble()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 52:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Float.valueOf(j1Var.readFloat()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 53:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Long.valueOf(j1Var.readInt64()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 54:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Long.valueOf(j1Var.readUInt64()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 55:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(j1Var.readInt32()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 56:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Long.valueOf(j1Var.readFixed64()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 57:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(j1Var.readFixed32()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 58:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Boolean.valueOf(j1Var.readBool()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 59:
                                    readString(t11, iTypeAndOffsetAt, j1Var);
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 60:
                                    s0 s0Var3 = (s0) mutableOneofMessageFieldForMerge(t11, fieldNumber, iPositionForFieldNumber);
                                    j1Var.mergeMessageField(s0Var3, getMessageFieldSchema(iPositionForFieldNumber), pVar3);
                                    storeOneofMessageField(t11, fieldNumber, iPositionForFieldNumber, s0Var3);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 61:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), j1Var.readBytes());
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 62:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(j1Var.readUInt32()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 63:
                                    int i14 = j1Var.readEnum();
                                    a0.e enumFieldVerifier2 = getEnumFieldVerifier(iPositionForFieldNumber);
                                    if (enumFieldVerifier2 == null || enumFieldVerifier2.isInRange(i14)) {
                                        v1.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(i14));
                                        setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                        obj = builderFromMessage;
                                        pVar2 = pVar3;
                                        r1Var2 = r1Var3;
                                        builderFromMessage = obj;
                                    } else {
                                        builderFromMessage = n1.storeUnknownEnum(t11, fieldNumber, i14, builderFromMessage, r1Var3);
                                        pVar2 = pVar3;
                                        r1Var2 = r1Var3;
                                    }
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 64:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(j1Var.readSFixed32()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 65:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Long.valueOf(j1Var.readSFixed64()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 66:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(j1Var.readSInt32()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 67:
                                    v1.putObject(t11, offset(iTypeAndOffsetAt), Long.valueOf(j1Var.readSInt64()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    builderFromMessage = obj;
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                case 68:
                                    try {
                                        s0 s0Var4 = (s0) mutableOneofMessageFieldForMerge(t11, fieldNumber, iPositionForFieldNumber);
                                        j1Var.mergeGroupField(s0Var4, getMessageFieldSchema(iPositionForFieldNumber), pVar3);
                                        storeOneofMessageField(t11, fieldNumber, iPositionForFieldNumber, s0Var4);
                                        obj = builderFromMessage;
                                        pVar2 = pVar3;
                                        r1Var2 = r1Var3;
                                        builderFromMessage = obj;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        pVar2 = pVar3;
                                        r1Var2 = r1Var3;
                                        if (r1Var2.shouldDiscardUnknownFields(j1Var)) {
                                            if (builderFromMessage == null) {
                                                builderFromMessage = r1Var2.getBuilderFromMessage(t11);
                                            }
                                            if (!r1Var2.mergeOneFieldFrom(builderFromMessage, j1Var, 0)) {
                                                objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                while (i11 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t10, this.intArray[i11], objFilterMapUnknownEnumValues2, r1Var, t10);
                                                }
                                                if (objFilterMapUnknownEnumValues2 != null) {
                                                    r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!j1Var.skipField()) {
                                            objFilterMapUnknownEnumValues3 = builderFromMessage;
                                            while (i12 < this.repeatedFieldOffsetStart) {
                                                objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t10, this.intArray[i12], objFilterMapUnknownEnumValues3, r1Var, t10);
                                            }
                                            if (objFilterMapUnknownEnumValues3 != null) {
                                                r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r1Var2 = r1Var3;
                                        objFilterMapUnknownEnumValues = builderFromMessage;
                                        while (i10 < this.repeatedFieldOffsetStart) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i10], objFilterMapUnknownEnumValues, r1Var, t10);
                                        }
                                        if (objFilterMapUnknownEnumValues != null) {
                                            r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues);
                                        }
                                        throw th;
                                    }
                                    pVar3 = pVar2;
                                    r1Var3 = r1Var2;
                                    t13 = t11;
                                    break;
                                default:
                                    obj = builderFromMessage;
                                    pVar2 = pVar3;
                                    r1Var2 = r1Var3;
                                    if (obj == null) {
                                        try {
                                            builderFromMessage = r1Var2.getBuilderFromMessage(t11);
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            builderFromMessage = obj;
                                            if (r1Var2.shouldDiscardUnknownFields(j1Var)) {
                                                if (builderFromMessage == null) {
                                                    builderFromMessage = r1Var2.getBuilderFromMessage(t11);
                                                }
                                                if (!r1Var2.mergeOneFieldFrom(builderFromMessage, j1Var, 0)) {
                                                    objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                    while (i11 < this.repeatedFieldOffsetStart) {
                                                        objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t10, this.intArray[i11], objFilterMapUnknownEnumValues2, r1Var, t10);
                                                    }
                                                    if (objFilterMapUnknownEnumValues2 != null) {
                                                        r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!j1Var.skipField()) {
                                                objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                while (i12 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t10, this.intArray[i12], objFilterMapUnknownEnumValues3, r1Var, t10);
                                                }
                                                if (objFilterMapUnknownEnumValues3 != null) {
                                                    r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues3);
                                                    return;
                                                }
                                                return;
                                            }
                                            pVar3 = pVar2;
                                            r1Var3 = r1Var2;
                                            t13 = t11;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            builderFromMessage = obj;
                                        }
                                    } else {
                                        builderFromMessage = obj;
                                    }
                                    try {
                                        try {
                                            if (!r1Var2.mergeOneFieldFrom(builderFromMessage, j1Var, 0)) {
                                                Object objFilterMapUnknownEnumValues4 = builderFromMessage;
                                                for (int i15 = this.checkInitializedCount; i15 < this.repeatedFieldOffsetStart; i15++) {
                                                    objFilterMapUnknownEnumValues4 = filterMapUnknownEnumValues(t10, this.intArray[i15], objFilterMapUnknownEnumValues4, r1Var, t10);
                                                }
                                                if (objFilterMapUnknownEnumValues4 != null) {
                                                    r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues4);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            if (r1Var2.shouldDiscardUnknownFields(j1Var)) {
                                                if (builderFromMessage == null) {
                                                    builderFromMessage = r1Var2.getBuilderFromMessage(t11);
                                                }
                                                if (!r1Var2.mergeOneFieldFrom(builderFromMessage, j1Var, 0)) {
                                                    objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                    while (i11 < this.repeatedFieldOffsetStart) {
                                                        objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t10, this.intArray[i11], objFilterMapUnknownEnumValues2, r1Var, t10);
                                                    }
                                                    if (objFilterMapUnknownEnumValues2 != null) {
                                                        r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!j1Var.skipField()) {
                                                objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                while (i12 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t10, this.intArray[i12], objFilterMapUnknownEnumValues3, r1Var, t10);
                                                }
                                                if (objFilterMapUnknownEnumValues3 != null) {
                                                    r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        pVar3 = pVar2;
                                        r1Var3 = r1Var2;
                                        t13 = t11;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                    break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        Object objFilterMapUnknownEnumValues5 = builderFromMessage;
                        for (int i16 = this.checkInitializedCount; i16 < this.repeatedFieldOffsetStart; i16++) {
                            objFilterMapUnknownEnumValues5 = filterMapUnknownEnumValues(t10, this.intArray[i16], objFilterMapUnknownEnumValues5, r1Var, t10);
                        }
                        if (objFilterMapUnknownEnumValues5 != null) {
                            r1Var3.setBuilderToMessage(t13, objFilterMapUnknownEnumValues5);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objFindExtensionByNumber = !this.hasExtensions ? null : qVar.findExtensionByNumber(pVar3, this.defaultInstance, fieldNumber);
                        if (objFindExtensionByNumber != null) {
                            Object mutableExtensions = obj2 == null ? qVar.getMutableExtensions(t10) : obj2;
                            t12 = t13;
                            try {
                                builderFromMessage = qVar.parseExtension(t10, j1Var, objFindExtensionByNumber, pVar, mutableExtensions, builderFromMessage, r1Var);
                                obj2 = mutableExtensions;
                            } catch (Throwable th6) {
                                th = th6;
                                t11 = t12;
                                r1Var2 = r1Var3;
                                objFilterMapUnknownEnumValues = builderFromMessage;
                                while (i10 < this.repeatedFieldOffsetStart) {
                                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i10], objFilterMapUnknownEnumValues, r1Var, t10);
                                }
                                if (objFilterMapUnknownEnumValues != null) {
                                    r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues);
                                }
                                throw th;
                            }
                        } else {
                            t12 = t13;
                            if (!r1Var3.shouldDiscardUnknownFields(j1Var)) {
                                if (builderFromMessage == null) {
                                    builderFromMessage = r1Var3.getBuilderFromMessage(t12);
                                }
                                if (!r1Var3.mergeOneFieldFrom(builderFromMessage, j1Var, 0)) {
                                }
                            } else if (!j1Var.skipField()) {
                            }
                        }
                        t13 = t12;
                    } catch (Throwable th7) {
                        th = th7;
                        t11 = t13;
                        r1Var2 = r1Var3;
                        objFilterMapUnknownEnumValues = builderFromMessage;
                        while (i10 < this.repeatedFieldOffsetStart) {
                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i10], objFilterMapUnknownEnumValues, r1Var, t10);
                        }
                        if (objFilterMapUnknownEnumValues != null) {
                            r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
            objFilterMapUnknownEnumValues = builderFromMessage;
            while (i10 < this.repeatedFieldOffsetStart) {
                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i10], objFilterMapUnknownEnumValues, r1Var, t10);
            }
            if (objFilterMapUnknownEnumValues != null) {
                r1Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues);
            }
            throw th;
        }
        int i17 = this.checkInitializedCount;
        Object objFilterMapUnknownEnumValues6 = builderFromMessage;
        while (i17 < this.repeatedFieldOffsetStart) {
            objFilterMapUnknownEnumValues6 = filterMapUnknownEnumValues(t10, this.intArray[i17], objFilterMapUnknownEnumValues6, r1Var, t10);
            i17++;
            t12 = t12;
        }
        T t14 = t12;
        if (objFilterMapUnknownEnumValues6 != null) {
            r1Var3.setBuilderToMessage(t14, objFilterMapUnknownEnumValues6);
        }
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, p pVar, j1 j1Var) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i10));
        Object object = v1.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            v1.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            v1.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        j1Var.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t10, T t11, int i10) {
        if (isFieldPresent(t11, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t11, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t11);
            }
            l1 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isFieldPresent(t10, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t10, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t10, jOffset, object);
                }
                setFieldPresent(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t10, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t10, T t11, int i10) {
        int iNumberAt = numberAt(i10);
        if (isOneofPresent(t11, iNumberAt, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t11, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t11);
            }
            l1 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isOneofPresent(t10, iNumberAt, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t10, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t10, jOffset, object);
                }
                setOneofPresent(t10, iNumberAt, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t10, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t10, T t11, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i10);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t11, i10)) {
                    v1.putDouble(t10, jOffset, v1.getDouble(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 1:
                if (isFieldPresent(t11, i10)) {
                    v1.putFloat(t10, jOffset, v1.getFloat(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 2:
                if (isFieldPresent(t11, i10)) {
                    v1.putLong(t10, jOffset, v1.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 3:
                if (isFieldPresent(t11, i10)) {
                    v1.putLong(t10, jOffset, v1.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 4:
                if (isFieldPresent(t11, i10)) {
                    v1.putInt(t10, jOffset, v1.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 5:
                if (isFieldPresent(t11, i10)) {
                    v1.putLong(t10, jOffset, v1.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 6:
                if (isFieldPresent(t11, i10)) {
                    v1.putInt(t10, jOffset, v1.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 7:
                if (isFieldPresent(t11, i10)) {
                    v1.putBoolean(t10, jOffset, v1.getBoolean(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 8:
                if (isFieldPresent(t11, i10)) {
                    v1.putObject(t10, jOffset, v1.getObject(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 9:
                mergeMessage(t10, t11, i10);
                break;
            case 10:
                if (isFieldPresent(t11, i10)) {
                    v1.putObject(t10, jOffset, v1.getObject(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 11:
                if (isFieldPresent(t11, i10)) {
                    v1.putInt(t10, jOffset, v1.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 12:
                if (isFieldPresent(t11, i10)) {
                    v1.putInt(t10, jOffset, v1.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 13:
                if (isFieldPresent(t11, i10)) {
                    v1.putInt(t10, jOffset, v1.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 14:
                if (isFieldPresent(t11, i10)) {
                    v1.putLong(t10, jOffset, v1.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 15:
                if (isFieldPresent(t11, i10)) {
                    v1.putInt(t10, jOffset, v1.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 16:
                if (isFieldPresent(t11, i10)) {
                    v1.putLong(t10, jOffset, v1.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 17:
                mergeMessage(t10, t11, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t10, t11, jOffset);
                break;
            case 50:
                n1.mergeMap(this.mapFieldSchema, t10, t11, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t11, iNumberAt, i10)) {
                    v1.putObject(t10, jOffset, v1.getObject(t11, jOffset));
                    setOneofPresent(t10, iNumberAt, i10);
                }
                break;
            case 60:
                mergeOneofMessage(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t11, iNumberAt, i10)) {
                    v1.putObject(t10, jOffset, v1.getObject(t11, jOffset));
                    setOneofPresent(t10, iNumberAt, i10);
                }
                break;
            case 68:
                mergeOneofMessage(t10, t11, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t10, int i10) {
        l1 messageFieldSchema = getMessageFieldSchema(i10);
        long jOffset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(t10, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t10, int i10, int i11) {
        l1 messageFieldSchema = getMessageFieldSchema(i11);
        if (!isOneofPresent(t10, i10, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, offset(typeAndOffsetAt(i11)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    static <T> v0<T> newSchema(Class<T> cls, q0 q0Var, x0 x0Var, i0 i0Var, r1<?, ?> r1Var, q<?> qVar, n0 n0Var) {
        return q0Var instanceof i1 ? newSchemaForRawMessageInfo((i1) q0Var, x0Var, i0Var, r1Var, qVar, n0Var) : newSchemaForMessageInfo((p1) q0Var, x0Var, i0Var, r1Var, qVar, n0Var);
    }

    static <T> v0<T> newSchemaForMessageInfo(p1 p1Var, x0 x0Var, i0 i0Var, r1<?, ?> r1Var, q<?> qVar, n0 n0Var) {
        int fieldNumber;
        int fieldNumber2;
        t[] fields = p1Var.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i10 = 0;
        int i11 = 0;
        for (t tVar : fields) {
            if (tVar.getType() == v.MAP) {
                i10++;
            } else if (tVar.getType().id() >= 18 && tVar.getType().id() <= 49) {
                i11++;
            }
        }
        int[] iArr2 = i10 > 0 ? new int[i10] : null;
        int[] iArr3 = i11 > 0 ? new int[i11] : null;
        int[] checkInitialized = p1Var.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < fields.length) {
            t tVar2 = fields[i12];
            int fieldNumber3 = tVar2.getFieldNumber();
            storeFieldData(tVar2, iArr, i13, objArr);
            if (i14 < checkInitialized.length && checkInitialized[i14] == fieldNumber3) {
                checkInitialized[i14] = i13;
                i14++;
            }
            if (tVar2.getType() == v.MAP) {
                iArr2[i15] = i13;
                i15++;
            } else {
                if (tVar2.getType().id() >= 18 && tVar2.getType().id() <= 49) {
                    iArr3[i16] = (int) v1.objectFieldOffset(tVar2.getField());
                    i16++;
                }
                i12++;
                i13 += 3;
            }
            i12++;
            i13 += 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new v0<>(iArr, objArr, fieldNumber, fieldNumber2, p1Var.getDefaultInstance(), p1Var.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, x0Var, i0Var, r1Var, qVar, n0Var);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0248  */
    /* JADX WARN: Code duplicated, block: B:122:0x024b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0262  */
    /* JADX WARN: Code duplicated, block: B:126:0x0265  */
    static <T> v0<T> newSchemaForRawMessageInfo(i1 i1Var, x0 x0Var, i0 i0Var, r1<?, ?> r1Var, q<?> qVar, n0 n0Var) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        boolean z10;
        int iObjectFieldOffset;
        int i26;
        int i27;
        int iObjectFieldOffset2;
        Field fieldReflectField;
        int i28;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldReflectField2;
        int i32;
        Object obj2;
        Field fieldReflectField3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        String stringInfo = i1Var.getStringInfo();
        int length = stringInfo.length();
        char c10 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i10 = i37 + 1;
                if (stringInfo.charAt(i37) < 55296) {
                    break;
                }
                i37 = i10;
            }
        } else {
            i10 = 1;
        }
        int i38 = i10 + 1;
        int iCharAt3 = stringInfo.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i39 = iCharAt3 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = stringInfo.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            iCharAt3 = i39 | (cCharAt13 << i40);
            i38 = i36;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i14 = 0;
            i15 = 0;
            i11 = 0;
            i13 = 0;
            iArr = EMPTY_INT_ARRAY;
            i12 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt4 = stringInfo.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i23 = i41 + 1;
                    cCharAt8 = stringInfo.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i23;
                }
                iCharAt4 = i42 | (cCharAt8 << i43);
                i41 = i23;
            }
            int i44 = i41 + 1;
            int iCharAt5 = stringInfo.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i22 = i44 + 1;
                    cCharAt7 = stringInfo.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i22;
                }
                iCharAt5 = i45 | (cCharAt7 << i46);
                i44 = i22;
            }
            int i47 = i44 + 1;
            int iCharAt6 = stringInfo.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i21 = i47 + 1;
                    cCharAt6 = stringInfo.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i21;
                }
                iCharAt6 = i48 | (cCharAt6 << i49);
                i47 = i21;
            }
            int i50 = i47 + 1;
            int iCharAt7 = stringInfo.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i20 = i50 + 1;
                    cCharAt5 = stringInfo.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i20;
                }
                iCharAt7 = i51 | (cCharAt5 << i52);
                i50 = i20;
            }
            int i53 = i50 + 1;
            iCharAt = stringInfo.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i19 = i53 + 1;
                    cCharAt4 = stringInfo.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i19;
                }
                iCharAt = i54 | (cCharAt4 << i55);
                i53 = i19;
            }
            int i56 = i53 + 1;
            iCharAt2 = stringInfo.charAt(i53);
            if (iCharAt2 >= 55296) {
                int i57 = iCharAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i18 = i56 + 1;
                    cCharAt3 = stringInfo.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i18;
                }
                iCharAt2 = i57 | (cCharAt3 << i58);
                i56 = i18;
            }
            int i59 = i56 + 1;
            int iCharAt8 = stringInfo.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i17 = i59 + 1;
                    cCharAt2 = stringInfo.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i17;
                }
                iCharAt8 = i60 | (cCharAt2 << i61);
                i59 = i17;
            }
            int i62 = i59 + 1;
            int iCharAt9 = stringInfo.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i16 = i62 + 1;
                    cCharAt = stringInfo.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i16;
                }
                iCharAt9 = i63 | (cCharAt << i64);
                i62 = i16;
            }
            i11 = (iCharAt4 * 2) + iCharAt5;
            i12 = iCharAt4;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i13 = iCharAt9;
            i38 = i62;
            i14 = iCharAt6;
            i15 = iCharAt7;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = i1Var.getObjects();
        Class<?> cls = i1Var.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i65 = i13 + iCharAt2;
        int i66 = i13;
        int i67 = i65;
        int i68 = 0;
        int i69 = 0;
        while (i38 < length) {
            int i70 = i38 + 1;
            int iCharAt10 = stringInfo.charAt(i38);
            if (iCharAt10 >= c10) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i35 = i72 + 1;
                    cCharAt12 = stringInfo.charAt(i72);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i35;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i24 = i35;
            } else {
                i24 = i70;
            }
            int i74 = i24 + 1;
            int iCharAt11 = stringInfo.charAt(i24);
            if (iCharAt11 >= c10) {
                int i75 = iCharAt11 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i34 = i76 + 1;
                    cCharAt11 = stringInfo.charAt(i76);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i77;
                    i77 += 13;
                    i76 = i34;
                }
                iCharAt11 = i75 | (cCharAt11 << i77);
                i25 = i34;
            } else {
                i25 = i74;
            }
            int i78 = iCharAt11 & 255;
            int i79 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i80 = i68;
            if (i78 >= 51) {
                int i81 = i25 + 1;
                int iCharAt12 = stringInfo.charAt(i25);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = 13;
                    while (true) {
                        i33 = i81 + 1;
                        cCharAt10 = stringInfo.charAt(i81);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i81 = i33;
                        c11 = 55296;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i83);
                    i81 = i33;
                }
                int i84 = i78 - 51;
                int i85 = i81;
                if (i84 == 9 || i84 == 17) {
                    i30 = i11 + 1;
                    objArr[((i69 / 3) * 2) + 1] = objects[i11];
                } else {
                    if (i84 == 12 && (i1Var.getSyntax().equals(e1.PROTO2) || (iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0)) {
                        i30 = i11 + 1;
                        objArr[((i69 / 3) * 2) + 1] = objects[i11];
                    }
                    i31 = iCharAt12 * 2;
                    obj = objects[i31];
                    if (obj instanceof Field) {
                        fieldReflectField2 = (Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (String) obj);
                        objects[i31] = fieldReflectField2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    i32 = i31 + 1;
                    obj2 = objects[i32];
                    if (obj2 instanceof Field) {
                        fieldReflectField3 = (Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (String) obj2);
                        objects[i32] = fieldReflectField3;
                    }
                    stringInfo = stringInfo;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    i26 = i85;
                    i27 = 0;
                }
                i11 = i30;
                i31 = iCharAt12 * 2;
                obj = objects[i31];
                if (obj instanceof Field) {
                    fieldReflectField2 = (Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i31] = fieldReflectField2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                i32 = i31 + 1;
                obj2 = objects[i32];
                if (obj2 instanceof Field) {
                    fieldReflectField3 = (Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i32] = fieldReflectField3;
                }
                stringInfo = stringInfo;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i26 = i85;
                i27 = 0;
            } else {
                int i86 = i11 + 1;
                Field fieldReflectField4 = reflectField(cls, (String) objects[i11]);
                if (i78 == 9 || i78 == 17) {
                    z10 = true;
                    objArr[((i69 / 3) * 2) + 1] = fieldReflectField4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        z10 = true;
                        i29 = i86 + 1;
                        objArr[((i69 / 3) * 2) + 1] = objects[i86];
                    } else {
                        if (i78 == 12 || i78 == 30 || i78 == 44) {
                            if (i1Var.getSyntax() == e1.PROTO2 || (iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0) {
                                z10 = true;
                                i29 = i86 + 1;
                                objArr[((i69 / 3) * 2) + 1] = objects[i86];
                            }
                        } else if (i78 == 50) {
                            int i87 = i66 + 1;
                            iArr[i66] = i69;
                            int i88 = (i69 / 3) * 2;
                            int i89 = i86 + 1;
                            objArr[i88] = objects[i86];
                            if ((iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0) {
                                i86 = i89 + 1;
                                objArr[i88 + 1] = objects[i89];
                                i66 = i87;
                            } else {
                                i66 = i87;
                                i86 = i89;
                            }
                        }
                        z10 = true;
                    }
                    i86 = i29;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if (!((iCharAt11 & 4096) != 0 ? z10 : false) || i78 > 17) {
                    iObjectFieldOffset = 1048575;
                    i26 = i25;
                    i27 = 0;
                } else {
                    i26 = i25 + 1;
                    int iCharAt13 = stringInfo.charAt(i25);
                    if (iCharAt13 >= 55296) {
                        int i90 = iCharAt13 & 8191;
                        int i91 = 13;
                        while (true) {
                            i28 = i26 + 1;
                            cCharAt9 = stringInfo.charAt(i26);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i90 |= (cCharAt9 & 8191) << i91;
                            i91 += 13;
                            i26 = i28;
                        }
                        iCharAt13 = i90 | (cCharAt9 << i91);
                        i26 = i28;
                    }
                    int i92 = (i12 * 2) + (iCharAt13 / 32);
                    Object obj3 = objects[i92];
                    if (obj3 instanceof Field) {
                        fieldReflectField = (Field) obj3;
                    } else {
                        fieldReflectField = reflectField(cls, (String) obj3);
                        objects[i92] = fieldReflectField;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField);
                    i27 = iCharAt13 % 32;
                }
                if (i78 >= 18 && i78 <= 49) {
                    iArr[i67] = iObjectFieldOffset3;
                    i67++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
                i11 = i86;
            }
            int i93 = i69 + 1;
            iArr2[i69] = iCharAt10;
            int i94 = i93 + 1;
            int i95 = i12;
            Unsafe unsafe2 = unsafe;
            iArr2[i93] = iObjectFieldOffset2 | (i78 << 20) | ((iCharAt11 & 512) != 0 ? ENFORCE_UTF8_MASK : 0) | ((iCharAt11 & 256) != 0 ? REQUIRED_MASK : 0) | ((iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0 ? Integer.MIN_VALUE : 0);
            int i96 = i94 + 1;
            iArr2[i94] = iObjectFieldOffset | (i27 << 20);
            i38 = i26;
            i12 = i95;
            unsafe = unsafe2;
            i68 = i80;
            stringInfo = stringInfo;
            i14 = i14;
            c10 = 55296;
            i69 = i96;
            length = i79;
        }
        return new v0<>(iArr2, objArr, i14, i15, i1Var.getDefaultInstance(), i1Var.getSyntax(), false, iArr, i13, i65, x0Var, i0Var, r1Var, qVar, n0Var);
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t10, long j10) {
        return ((Boolean) v1.getObject(t10, j10)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t10, long j10) {
        return ((Double) v1.getObject(t10, j10)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t10, long j10) {
        return ((Float) v1.getObject(t10, j10)).floatValue();
    }

    private static <T> int oneofIntAt(T t10, long j10) {
        return ((Integer) v1.getObject(t10, j10)).intValue();
    }

    private static <T> long oneofLongAt(T t10, long j10) {
        return ((Long) v1.getObject(t10, j10)).longValue();
    }

    private <K, V> int parseMapField(T t10, byte[] bArr, int i10, int i11, int i12, long j10, e.b bVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t10, j10, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i10, i11, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), bVar);
    }

    private int parseOneofField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e.b bVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j11 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Double.valueOf(e.decodeDouble(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Float.valueOf(e.decodeFloat(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint64 = e.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(bVar.long1));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint32 = e.decodeVarint32(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(bVar.int1));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Long.valueOf(e.decodeFixed64(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(e.decodeFixed32(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint65 = e.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Boolean.valueOf(bVar.long1 != 0));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint65;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeVarint33 = e.decodeVarint32(bArr, i10, bVar);
                int i22 = bVar.int1;
                if (i22 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & ENFORCE_UTF8_MASK) != 0 && !w1.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, iDecodeVarint33, i22, a0.UTF_8));
                    iDecodeVarint33 += i22;
                }
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint33;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t10, i13, i17);
                int iMergeMessageField = e.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i17), bArr, i10, i11, bVar);
                storeOneofMessageField(t10, i13, i17, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeBytes = e.decodeBytes(bArr, i10, bVar);
                unsafe.putObject(t10, j10, bVar.object1);
                unsafe.putInt(t10, j11, i13);
                return iDecodeBytes;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint34 = e.decodeVarint32(bArr, i10, bVar);
                int i23 = bVar.int1;
                a0.e enumFieldVerifier = getEnumFieldVerifier(i17);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i23)) {
                    unsafe.putObject(t10, j10, Integer.valueOf(i23));
                    unsafe.putInt(t10, j11, i13);
                } else {
                    getMutableUnknownFields(t10).storeField(i12, Long.valueOf(i23));
                }
                return iDecodeVarint34;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint35 = e.decodeVarint32(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(j.decodeZigZag32(bVar.int1)));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint35;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint66 = e.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(j.decodeZigZag64(bVar.long1)));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint66;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t10, i13, i17);
                int iMergeGroupField = e.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                storeOneofMessageField(t10, i13, i17, objMutableOneofMessageFieldForMerge2);
                return iMergeGroupField;
            default:
                return i10;
        }
    }

    private int parseRepeatedField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, e.b bVar) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        a0.i iVarMutableCopyWithCapacity2 = (a0.i) unsafe.getObject(t10, j11);
        if (!iVarMutableCopyWithCapacity2.isModifiable()) {
            int size = iVarMutableCopyWithCapacity2.size();
            iVarMutableCopyWithCapacity2 = iVarMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, iVarMutableCopyWithCapacity2);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return e.decodePackedDoubleList(bArr, i10, iVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 1 ? e.decodeDoubleList(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return e.decodePackedFloatList(bArr, i10, iVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 5 ? e.decodeFloatList(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return e.decodePackedVarint64List(bArr, i10, iVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? e.decodeVarint64List(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return e.decodePackedVarint32List(bArr, i10, iVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? e.decodeVarint32List(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return e.decodePackedFixed64List(bArr, i10, iVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 1 ? e.decodeFixed64List(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return e.decodePackedFixed32List(bArr, i10, iVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 5 ? e.decodeFixed32List(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return e.decodePackedBoolList(bArr, i10, iVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? e.decodeBoolList(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? e.decodeStringList(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : e.decodeStringListRequireUtf8(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar);
                }
                return i10;
            case 27:
                return i14 == 2 ? e.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 28:
                return i14 == 2 ? e.decodeBytesList(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 30:
            case 44:
                if (i14 == 2) {
                    iDecodeVarint32List = e.decodePackedVarint32List(bArr, i10, iVarMutableCopyWithCapacity2, bVar);
                } else {
                    if (i14 != 0) {
                        return i10;
                    }
                    iDecodeVarint32List = e.decodeVarint32List(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar);
                }
                n1.filterUnknownEnumList((Object) t10, i13, (List<Integer>) iVarMutableCopyWithCapacity2, getEnumFieldVerifier(i15), (Object) null, (r1<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i14 == 2) {
                    return e.decodePackedSInt32List(bArr, i10, iVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? e.decodeSInt32List(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return e.decodePackedSInt64List(bArr, i10, iVarMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? e.decodeSInt64List(i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            case 49:
                return i14 == 3 ? e.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, iVarMutableCopyWithCapacity2, bVar) : i10;
            default:
                return i10;
        }
    }

    private int positionForFieldNumber(int i10) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, 0);
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j10, j1 j1Var, l1<E> l1Var, p pVar) throws IOException {
        j1Var.readGroupList(this.listFieldSchema.mutableListAt(obj, j10), l1Var, pVar);
    }

    private <E> void readMessageList(Object obj, int i10, j1 j1Var, l1<E> l1Var, p pVar) throws IOException {
        j1Var.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), l1Var, pVar);
    }

    private void readString(Object obj, int i10, j1 j1Var) throws IOException {
        if (isEnforceUtf8(i10)) {
            v1.putObject(obj, offset(i10), j1Var.readStringRequireUtf8());
        } else if (this.lite) {
            v1.putObject(obj, offset(i10), j1Var.readString());
        } else {
            v1.putObject(obj, offset(i10), j1Var.readBytes());
        }
    }

    private void readStringList(Object obj, int i10, j1 j1Var) throws IOException {
        if (isEnforceUtf8(i10)) {
            j1Var.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            j1Var.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        }
    }

    private static Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t10, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 == 1048575) {
            return;
        }
        v1.putInt(t10, j10, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | v1.getInt(t10, j10));
    }

    private void setOneofPresent(T t10, int i10, int i11) {
        v1.putInt(t10, presenceMaskAndOffsetAt(i11) & 1048575, i10);
    }

    private int slowPositionForFieldNumber(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iNumberAt = numberAt(i13);
            if (i10 == iNumberAt) {
                return i13;
            }
            if (i10 < iNumberAt) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(t tVar, int[] iArr, int i10, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i11;
        Class<?> messageFieldClass;
        int i12;
        b1 oneof = tVar.getOneof();
        if (oneof == null) {
            v type = tVar.getType();
            iObjectFieldOffset = (int) v1.objectFieldOffset(tVar.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                Field presenceField = tVar.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) v1.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(tVar.getPresenceMask());
            } else if (tVar.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = v1.objectFieldOffset(tVar.getCachedSizeField());
            }
            iArr[i10] = tVar.getFieldNumber();
            int i13 = i10 + 1;
            if (tVar.isEnforceUtf8()) {
                i11 = ENFORCE_UTF8_MASK;
            } else {
                i11 = 0;
            }
            iArr[i13] = (tVar.isRequired() ? REQUIRED_MASK : 0) | i11 | (iId << 20) | iObjectFieldOffset;
            iArr[i10 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = tVar.getMessageFieldClass();
            if (tVar.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[((i10 / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (tVar.getEnumVerifier() != null) {
                        objArr[((i10 / 3) * 2) + 1] = tVar.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i12 = (i10 / 3) * 2;
            objArr[i12] = tVar.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i12 + 1] = messageFieldClass;
            } else if (tVar.getEnumVerifier() != null) {
                objArr[i12 + 1] = tVar.getEnumVerifier();
            }
        }
        iId = tVar.getType().id() + 51;
        iObjectFieldOffset = (int) v1.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = v1.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i10] = tVar.getFieldNumber();
        int i14 = i10 + 1;
        if (tVar.isEnforceUtf8()) {
            i11 = ENFORCE_UTF8_MASK;
        } else {
            i11 = 0;
        }
        iArr[i14] = (tVar.isRequired() ? REQUIRED_MASK : 0) | i11 | (iId << 20) | iObjectFieldOffset;
        iArr[i10 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = tVar.getMessageFieldClass();
        if (tVar.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objArr[((i10 / 3) * 2) + 1] = messageFieldClass;
                return;
            } else {
                if (tVar.getEnumVerifier() != null) {
                    objArr[((i10 / 3) * 2) + 1] = tVar.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i12 = (i10 / 3) * 2;
        objArr[i12] = tVar.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i12 + 1] = messageFieldClass;
        } else if (tVar.getEnumVerifier() != null) {
            objArr[i12 + 1] = tVar.getEnumVerifier();
        }
    }

    private void storeMessageField(T t10, int i10, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i10)), obj);
        setFieldPresent(t10, i10);
    }

    private void storeOneofMessageField(T t10, int i10, int i11, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i11)), obj);
        setOneofPresent(t10, i10, i11);
    }

    private static int type(int i10) {
        return (i10 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void writeFieldsInAscendingOrder(T t10, y1 y1Var) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i10;
        Map.Entry<?, ?> entry2;
        int i11;
        int i12;
        Map.Entry<?, ?> entry3;
        boolean z10;
        if (this.hasExtensions) {
            u<T> extensions = this.extensionSchema.getExtensions(t10);
            if (extensions.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = this.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i16 < length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i16);
            int iNumberAt = numberAt(i16);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i17 = this.buffer[i16 + 2];
                int i18 = i17 & i13;
                if (i18 != i14) {
                    i15 = i18 == i13 ? 0 : unsafe.getInt(t10, i18);
                    i14 = i18;
                } else {
                    entry = entry;
                }
                int i19 = 1 << (i17 >>> 20);
                i10 = i14;
                i11 = i19;
                entry2 = entry;
            } else {
                i10 = i14;
                entry2 = entry;
                i11 = 0;
            }
            int i20 = i15;
            while (entry2 != null && this.extensionSchema.extensionNumber(entry2) <= iNumberAt) {
                this.extensionSchema.serializeExtension(y1Var, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeDouble(iNumberAt, doubleAt(t10, jOffset));
                    }
                    break;
                case 1:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeFloat(iNumberAt, floatAt(t10, jOffset));
                    }
                    break;
                case 2:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeInt64(iNumberAt, unsafe.getLong(t10, jOffset));
                    }
                    break;
                case 3:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeUInt64(iNumberAt, unsafe.getLong(t10, jOffset));
                    }
                    break;
                case 4:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeInt32(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 5:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeFixed64(iNumberAt, unsafe.getLong(t10, jOffset));
                    }
                    break;
                case 6:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeFixed32(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 7:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeBool(iNumberAt, booleanAt(t10, jOffset));
                    }
                    break;
                case 8:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writeString(iNumberAt, unsafe.getObject(t10, jOffset), y1Var);
                    }
                    break;
                case 9:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i16));
                    }
                    break;
                case 10:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeBytes(iNumberAt, (i) unsafe.getObject(t10, jOffset));
                    }
                    break;
                case 11:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeUInt32(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 12:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeEnum(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 13:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeSFixed32(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 14:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeSFixed64(iNumberAt, unsafe.getLong(t10, jOffset));
                    }
                    break;
                case 15:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeSInt32(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 16:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeSInt64(iNumberAt, unsafe.getLong(t10, jOffset));
                    }
                    break;
                case 17:
                    entry3 = entry2;
                    i12 = length;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        y1Var.writeGroup(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i16));
                    }
                    break;
                case 18:
                    z10 = false;
                    n1.writeDoubleList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 19:
                    z10 = false;
                    n1.writeFloatList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 20:
                    z10 = false;
                    n1.writeInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 21:
                    z10 = false;
                    n1.writeUInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 22:
                    z10 = false;
                    n1.writeInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 23:
                    z10 = false;
                    n1.writeFixed64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 24:
                    z10 = false;
                    n1.writeFixed32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 25:
                    z10 = false;
                    n1.writeBoolList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 26:
                    n1.writeStringList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 27:
                    n1.writeMessageList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, getMessageFieldSchema(i16));
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 28:
                    n1.writeBytesList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 29:
                    z10 = false;
                    n1.writeUInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 30:
                    z10 = false;
                    n1.writeEnumList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 31:
                    z10 = false;
                    n1.writeSFixed32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 32:
                    z10 = false;
                    n1.writeSFixed64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 33:
                    z10 = false;
                    n1.writeSInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 34:
                    z10 = false;
                    n1.writeSInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 35:
                    n1.writeDoubleList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 36:
                    n1.writeFloatList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 37:
                    n1.writeInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 38:
                    n1.writeUInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 39:
                    n1.writeInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 40:
                    n1.writeFixed64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 41:
                    n1.writeFixed32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 42:
                    n1.writeBoolList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 43:
                    n1.writeUInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 44:
                    n1.writeEnumList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 45:
                    n1.writeSFixed32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 46:
                    n1.writeSFixed64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 47:
                    n1.writeSInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 48:
                    n1.writeSInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 49:
                    n1.writeGroupList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), y1Var, getMessageFieldSchema(i16));
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 50:
                    writeMapHelper(y1Var, iNumberAt, unsafe.getObject(t10, jOffset), i16);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeDouble(iNumberAt, oneofDoubleAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeFloat(iNumberAt, oneofFloatAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeInt64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeUInt64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeInt32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeFixed64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeFixed32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeBool(iNumberAt, oneofBooleanAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writeString(iNumberAt, unsafe.getObject(t10, jOffset), y1Var);
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i16));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeBytes(iNumberAt, (i) unsafe.getObject(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeUInt32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeEnum(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeSFixed32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeSFixed64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeSInt32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeSInt64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        y1Var.writeGroup(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i16));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                default:
                    i12 = length;
                    entry3 = entry2;
                    break;
            }
            i16 += 3;
            i14 = i10;
            entry = entry3;
            i15 = i20;
            length = i12;
            i13 = 1048575;
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(y1Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t10, y1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(T t10, y1 y1Var) throws IOException {
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, t10, y1Var);
        if (this.hasExtensions) {
            u<T> extensions = this.extensionSchema.getExtensions(t10);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (Map.Entry) itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            entry = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(y1Var, entry);
                entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeDouble(iNumberAt, doubleAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeFloat(iNumberAt, floatAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeInt64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeUInt64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeInt32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeFixed64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeFixed32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeBool(iNumberAt, booleanAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t10, length)) {
                        writeString(iNumberAt, v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeMessage(iNumberAt, v1.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeBytes(iNumberAt, (i) v1.getObject(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeUInt32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeEnum(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeSFixed32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeSFixed64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeSInt32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeSInt64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t10, length)) {
                        y1Var.writeGroup(iNumberAt, v1.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    n1.writeDoubleList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 19:
                    n1.writeFloatList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 20:
                    n1.writeInt64List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 21:
                    n1.writeUInt64List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 22:
                    n1.writeInt32List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 23:
                    n1.writeFixed64List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 24:
                    n1.writeFixed32List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 25:
                    n1.writeBoolList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 26:
                    n1.writeStringList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var);
                    break;
                case 27:
                    n1.writeMessageList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, getMessageFieldSchema(length));
                    break;
                case 28:
                    n1.writeBytesList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var);
                    break;
                case 29:
                    n1.writeUInt32List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 30:
                    n1.writeEnumList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 31:
                    n1.writeSFixed32List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 32:
                    n1.writeSFixed64List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 33:
                    n1.writeSInt32List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 34:
                    n1.writeSInt64List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, false);
                    break;
                case 35:
                    n1.writeDoubleList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 36:
                    n1.writeFloatList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 37:
                    n1.writeInt64List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 38:
                    n1.writeUInt64List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 39:
                    n1.writeInt32List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 40:
                    n1.writeFixed64List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 41:
                    n1.writeFixed32List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 42:
                    n1.writeBoolList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 43:
                    n1.writeUInt32List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 44:
                    n1.writeEnumList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 45:
                    n1.writeSFixed32List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 46:
                    n1.writeSFixed64List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 47:
                    n1.writeSInt32List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 48:
                    n1.writeSInt64List(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, true);
                    break;
                case 49:
                    n1.writeGroupList(numberAt(length), (List) v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(y1Var, iNumberAt, v1.getObject(t10, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeDouble(iNumberAt, oneofDoubleAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeFloat(iNumberAt, oneofFloatAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeInt64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeUInt64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeInt32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeFixed64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeFixed32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeBool(iNumberAt, oneofBooleanAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writeString(iNumberAt, v1.getObject(t10, offset(iTypeAndOffsetAt)), y1Var);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeMessage(iNumberAt, v1.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeBytes(iNumberAt, (i) v1.getObject(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeUInt32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeEnum(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeSFixed32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeSFixed64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeSInt32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeSInt64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        y1Var.writeGroup(iNumberAt, v1.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(y1Var, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(y1 y1Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            y1Var.writeMap(i10, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i10, Object obj, y1 y1Var) throws IOException {
        if (obj instanceof String) {
            y1Var.writeString(i10, (String) obj);
        } else {
            y1Var.writeBytes(i10, (i) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(r1<UT, UB> r1Var, T t10, y1 y1Var) throws IOException {
        r1Var.writeTo(r1Var.getFromMessage(t10), y1Var);
    }

    @Override // com.google.protobuf.l1
    public boolean equals(T t10, T t11) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!equals(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v215 */
    /* JADX WARN: Type inference failed for: r0v217 */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // com.google.protobuf.l1
    public int getSerializedSize(T t10) {
        int i10;
        ?? r16;
        ?? r17;
        ?? r10;
        ?? r15;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSizeFixed64List;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        ?? r11;
        int i11;
        Unsafe unsafe = UNSAFE;
        ?? r12 = 0;
        int i12 = 1048575;
        ?? r13 = 0;
        int i13 = 0;
        int iComputeSFixed32Size = 0;
        int i14 = 1048575;
        while (i13 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i13);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i13);
            int i15 = this.buffer[i13 + 2];
            int i16 = i15 & i12;
            if (iType <= 17) {
                if (i16 != i14) {
                    r11 = i16 == i12 ? r12 : unsafe.getInt(t10, i16 == true ? 1L : 0L);
                    i11 = i16 == true ? 1 : 0;
                }
                i10 = i11;
                r16 = r11;
                r17 = 1 << (i15 >>> 20);
            } else {
                i11 = i14;
                r11 = r13;
                i10 = i14 == true ? 1 : 0;
                r16 = r13 == true ? 1 : 0;
                r17 = r12;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < v.DOUBLE_LIST_PACKED.id() || iType > v.SINT64_LIST_PACKED.id()) {
                r10 = i16;
                r10 = r12;
            }
            r10 = i16;
            ?? r14 = r10;
            switch (iType) {
                case 0:
                    r15 = r12;
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    r15 = r12;
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    r15 = r12;
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    r15 = r12;
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    r15 = r12;
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    r15 = r12;
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (!isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        r15 = 0;
                    } else {
                        r15 = 0;
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 8:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        Object object = unsafe.getObject(t10, jOffset);
                        iComputeBoolSize = object instanceof i ? CodedOutputStream.computeBytesSize(iNumberAt, (i) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 9:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = n1.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 10:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (i) unsafe.getObject(t10, jOffset));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 11:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 12:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 13:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeSFixed32Size += CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                    }
                    r15 = 0;
                    break;
                case 14:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 15:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 16:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 17:
                    if (isFieldPresent(t10, i13, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (s0) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 18:
                    iComputeSizeFixed64List = n1.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 19:
                    iComputeSizeFixed64List = n1.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 20:
                    iComputeSizeFixed64List = n1.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 21:
                    iComputeSizeFixed64List = n1.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 22:
                    iComputeSizeFixed64List = n1.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 23:
                    iComputeSizeFixed64List = n1.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 24:
                    iComputeSizeFixed64List = n1.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 25:
                    iComputeSizeFixed64List = n1.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 26:
                    iComputeSizeFixed64List = n1.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 27:
                    iComputeSizeFixed64List = n1.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 28:
                    iComputeSizeFixed64List = n1.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 29:
                    iComputeSizeFixed64List = n1.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 30:
                    iComputeSizeFixed64List = n1.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 31:
                    iComputeSizeFixed64List = n1.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 32:
                    iComputeSizeFixed64List = n1.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 33:
                    iComputeSizeFixed64List = n1.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 34:
                    iComputeSizeFixed64List = n1.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeUInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeBoolListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeUInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeEnumListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeSInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = n1.computeSizeSInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 49:
                    iComputeSizeFixed64List = n1.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 50:
                    iComputeSizeFixed64List = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t10, jOffset), getMapFieldDefaultEntry(i13));
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeFixed32Size(iNumberAt, r12);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        Object object2 = unsafe.getObject(t10, jOffset);
                        iComputeSizeFixed64List = object2 instanceof i ? CodedOutputStream.computeBytesSize(iNumberAt, (i) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = n1.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeBytesSize(iNumberAt, (i) unsafe.getObject(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeSFixed32Size(iNumberAt, r12);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeGroupSize(iNumberAt, (s0) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                default:
                    r15 = r12;
                    break;
            }
            i13 += 3;
            i14 = i10;
            r12 = r15;
            r13 = r16;
            i12 = 1048575;
        }
        int unknownFieldsSerializedSize = iComputeSFixed32Size + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t10).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.l1
    public int hashCode(T t10) {
        int i10;
        int iHashLong;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i12);
            int iNumberAt = numberAt(i12);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(Double.doubleToLongBits(v1.getDouble(t10, jOffset)));
                    i11 = i10 + iHashLong;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(v1.getFloat(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(v1.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(v1.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(v1.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = a0.hashBoolean(v1.getBoolean(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) v1.getObject(t10, jOffset)).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 9:
                    Object object = v1.getObject(t10, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = v1.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(v1.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = v1.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = a0.hashLong(v1.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 17:
                    Object object2 = v1.getObject(t10, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iHashLong = v1.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = v1.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(Double.doubleToLongBits(oneofDoubleAt(t10, jOffset)));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashBoolean(oneofBooleanAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = ((String) v1.getObject(t10, jOffset)).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = v1.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = v1.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = a0.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = v1.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.unknownFieldSchema.getFromMessage(t10).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t10).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[SYNTHETIC] */
    @Override // com.google.protobuf.l1
    public final boolean isInitialized(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.checkInitializedCount) {
            int i15 = this.intArray[i14];
            int iNumberAt = numberAt(i15);
            int iTypeAndOffsetAt = typeAndOffsetAt(i15);
            int i16 = this.buffer[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = UNSAFE.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t10, i15, i10, i11, i18) && !isInitialized(t10, iTypeAndOffsetAt, getMessageFieldSchema(i15))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t10, iTypeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t10, iNumberAt, i15) && !isInitialized(t10, iTypeAndOffsetAt, getMessageFieldSchema(i15))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t10, iTypeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (!isListInitialized(t10, iTypeAndOffsetAt, i15)) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t10).isInitialized();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.l1
    public void makeImmutable(T t10) {
        if (isMutable(t10)) {
            if (t10 instanceof y) {
                y yVar = (y) t10;
                yVar.clearMemoizedSerializedSize();
                yVar.clearMemoizedHashCode();
                yVar.markImmutable();
            }
            int length = this.buffer.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i10);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    if (iType != 60 && iType != 68) {
                        switch (iType) {
                            case 17:
                                if (isFieldPresent(t10, i10)) {
                                    getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t10, jOffset));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(t10, jOffset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(t10, jOffset);
                                if (object != null) {
                                    unsafe.putObject(t10, jOffset, this.mapFieldSchema.toImmutable(object));
                                }
                                break;
                        }
                    } else if (isOneofPresent(t10, numberAt(i10), i10)) {
                        getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t10, jOffset));
                    }
                } else if (isFieldPresent(t10, i10)) {
                    getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t10, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t10);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t10);
            }
        }
    }

    @Override // com.google.protobuf.l1
    public void mergeFrom(T t10, T t11) {
        checkMutable(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(t10, t11, i10);
        }
        n1.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            n1.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    @Override // com.google.protobuf.l1
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0099. Please report as an issue. */
    int parseMessage(T t10, byte[] bArr, int i10, int i11, int i12, e.b bVar) throws IOException {
        Unsafe unsafe;
        v0<T> v0Var;
        int i13;
        int i14;
        int i15;
        int i16;
        T t11;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        byte[] bArr2;
        int i24;
        int i25;
        byte b10;
        byte[] bArr3;
        int iDecodeVarint64;
        int i26;
        int i27;
        v0<T> v0Var2 = this;
        T t12 = t10;
        byte[] bArr4 = bArr;
        i11 = i11;
        i12 = i12;
        e.b bVar2 = bVar;
        checkMutable(t10);
        Unsafe unsafe2 = UNSAFE;
        int iDecodeUnknownField = i10;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = -1;
        int i32 = 1048575;
        while (true) {
            if (iDecodeUnknownField < i11) {
                int i33 = iDecodeUnknownField + 1;
                byte b11 = bArr4[iDecodeUnknownField];
                if (b11 < 0) {
                    int iDecodeVarint32 = e.decodeVarint32(b11, bArr4, i33, bVar2);
                    i17 = bVar2.int1;
                    i33 = iDecodeVarint32;
                } else {
                    i17 = b11;
                }
                int i34 = i17 >>> 3;
                int i35 = i17 & 7;
                int iPositionForFieldNumber = i34 > i31 ? v0Var2.positionForFieldNumber(i34, i28 / 3) : v0Var2.positionForFieldNumber(i34);
                if (iPositionForFieldNumber == -1) {
                    i18 = i34;
                    i19 = i33;
                    i14 = i17;
                    i20 = i30;
                    i21 = i32;
                    unsafe = unsafe2;
                    i12 = i12;
                    i22 = 0;
                } else {
                    int i36 = v0Var2.buffer[iPositionForFieldNumber + 1];
                    int iType = type(i36);
                    long jOffset = offset(i36);
                    int i37 = i17;
                    if (iType <= 17) {
                        int i38 = v0Var2.buffer[iPositionForFieldNumber + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = 1048575;
                        int i41 = i38 & 1048575;
                        if (i41 != i32) {
                            if (i32 != 1048575) {
                                unsafe2.putInt(t12, i32, i30);
                                i40 = 1048575;
                            }
                            i21 = i41;
                            i23 = i41 == i40 ? 0 : unsafe2.getInt(t12, i41);
                        } else {
                            i23 = i30;
                            i21 = i32;
                        }
                        switch (iType) {
                            case 0:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 1) {
                                    v1.putDouble(t12, jOffset, e.decodeDouble(bArr2, i33));
                                    iDecodeUnknownField = i33 + 8;
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr2;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 5) {
                                    v1.putFloat(t12, jOffset, e.decodeFloat(bArr2, i33));
                                    iDecodeUnknownField = i33 + 4;
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr2;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 0) {
                                    iDecodeVarint64 = e.decodeVarint64(bArr3, i33, bVar2);
                                    unsafe2.putLong(t10, jOffset, bVar2.long1);
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr3;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 0) {
                                    iDecodeUnknownField = e.decodeVarint32(bArr2, i33, bVar2);
                                    unsafe2.putInt(t12, jOffset, bVar2.int1);
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr2;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 1) {
                                    unsafe2.putLong(t10, jOffset, e.decodeFixed64(bArr2, i33));
                                    iDecodeUnknownField = i33 + 8;
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr2;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 5) {
                                    unsafe2.putInt(t12, jOffset, e.decodeFixed32(bArr2, i33));
                                    iDecodeUnknownField = i33 + 4;
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr2;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 0) {
                                    iDecodeUnknownField = e.decodeVarint64(bArr2, i33, bVar2);
                                    v1.putBoolean(t12, jOffset, bVar2.long1 != 0);
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr2;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 2) {
                                    iDecodeUnknownField = isEnforceUtf8(i36) ? e.decodeStringRequireUtf8(bArr2, i33, bVar2) : e.decodeString(bArr2, i33, bVar2);
                                    unsafe2.putObject(t12, jOffset, bVar2.object1);
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr2;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 2) {
                                    Object objMutableMessageFieldForMerge = v0Var2.mutableMessageFieldForMerge(t12, i24);
                                    iDecodeUnknownField = e.mergeMessageField(objMutableMessageFieldForMerge, v0Var2.getMessageFieldSchema(i24), bArr, i33, i11, bVar);
                                    v0Var2.storeMessageField(t12, i24, objMutableMessageFieldForMerge);
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr2;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 2) {
                                    iDecodeUnknownField = e.decodeBytes(bArr2, i33, bVar2);
                                    unsafe2.putObject(t12, jOffset, bVar2.object1);
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr2;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 12:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 0) {
                                    iDecodeUnknownField = e.decodeVarint32(bArr2, i33, bVar2);
                                    int i42 = bVar2.int1;
                                    a0.e enumFieldVerifier = v0Var2.getEnumFieldVerifier(i24);
                                    if (!isLegacyEnumIsClosed(i36) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i42)) {
                                        unsafe2.putInt(t12, jOffset, i42);
                                        i30 = i23 | i39;
                                        i28 = i24;
                                        bArr4 = bArr2;
                                        i29 = i25;
                                        i32 = i21;
                                        i31 = i18;
                                    } else {
                                        getMutableUnknownFields(t10).storeField(i25, Long.valueOf(i42));
                                        i12 = i12;
                                        i28 = i24;
                                        i30 = i23;
                                        i29 = i25;
                                        i32 = i21;
                                        i31 = i18;
                                        bArr4 = bArr2;
                                    }
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 0) {
                                    iDecodeUnknownField = e.decodeVarint32(bArr2, i33, bVar2);
                                    unsafe2.putInt(t12, jOffset, j.decodeZigZag32(bVar2.int1));
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr2;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 16:
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                bArr3 = bArr;
                                if (i35 == 0) {
                                    iDecodeVarint64 = e.decodeVarint64(bArr3, i33, bVar2);
                                    unsafe2.putLong(t10, jOffset, j.decodeZigZag64(bVar2.long1));
                                    i30 = i23 | i39;
                                    i28 = i24;
                                    bArr4 = bArr3;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            case 17:
                                if (i35 == 3) {
                                    Object objMutableMessageFieldForMerge2 = v0Var2.mutableMessageFieldForMerge(t12, iPositionForFieldNumber);
                                    i18 = i34;
                                    i25 = i37;
                                    iDecodeUnknownField = e.mergeGroupField(objMutableMessageFieldForMerge2, v0Var2.getMessageFieldSchema(iPositionForFieldNumber), bArr, i33, i11, (i34 << 3) | 4, bVar);
                                    v0Var2.storeMessageField(t12, iPositionForFieldNumber, objMutableMessageFieldForMerge2);
                                    i30 = i23 | i39;
                                    bArr4 = bArr;
                                    i28 = iPositionForFieldNumber;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i18 = i34;
                                    i25 = i37;
                                    b10 = -1;
                                    i24 = iPositionForFieldNumber;
                                    i12 = i12;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                }
                                break;
                            default:
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                i12 = i12;
                                i19 = i33;
                                i22 = i24;
                                unsafe = unsafe2;
                                i20 = i23;
                                i14 = i25;
                                break;
                        }
                    } else {
                        i18 = i34;
                        int i43 = i32;
                        i20 = i30;
                        if (iType != 27) {
                            i21 = i43;
                            if (iType <= 49) {
                                int i44 = i33;
                                unsafe = unsafe2;
                                i22 = iPositionForFieldNumber;
                                i27 = i37;
                                iDecodeUnknownField = parseRepeatedField(t10, bArr, i33, i11, i37, i18, i35, iPositionForFieldNumber, i36, iType, jOffset, bVar);
                                if (iDecodeUnknownField != i44) {
                                    v0Var2 = this;
                                    t12 = t10;
                                    bArr4 = bArr;
                                    i12 = i12;
                                    bVar2 = bVar;
                                    i29 = i27;
                                    i30 = i20;
                                    i28 = i22;
                                    i32 = i21;
                                    i31 = i18;
                                    unsafe2 = unsafe;
                                } else {
                                    i19 = iDecodeUnknownField;
                                    i14 = i27;
                                }
                            } else {
                                i26 = i33;
                                unsafe = unsafe2;
                                i22 = iPositionForFieldNumber;
                                i27 = i37;
                                if (iType != 50) {
                                    iDecodeUnknownField = parseOneofField(t10, bArr, i26, i11, i27, i18, i35, i36, iType, jOffset, i22, bVar);
                                    if (iDecodeUnknownField != i26) {
                                        v0Var2 = this;
                                        t12 = t10;
                                        bArr4 = bArr;
                                        i12 = i12;
                                        bVar2 = bVar;
                                        i29 = i27;
                                        i30 = i20;
                                        i28 = i22;
                                        i32 = i21;
                                        i31 = i18;
                                        unsafe2 = unsafe;
                                    } else {
                                        i19 = iDecodeUnknownField;
                                        i14 = i27;
                                    }
                                } else if (i35 == 2) {
                                    iDecodeUnknownField = parseMapField(t10, bArr, i26, i11, i22, jOffset, bVar);
                                    if (iDecodeUnknownField != i26) {
                                        v0Var2 = this;
                                        t12 = t10;
                                        bArr4 = bArr;
                                        i12 = i12;
                                        bVar2 = bVar;
                                        i29 = i27;
                                        i30 = i20;
                                        i28 = i22;
                                        i32 = i21;
                                        i31 = i18;
                                        unsafe2 = unsafe;
                                    } else {
                                        i19 = iDecodeUnknownField;
                                        i14 = i27;
                                    }
                                }
                            }
                        } else if (i35 == 2) {
                            a0.i iVarMutableCopyWithCapacity2 = (a0.i) unsafe2.getObject(t12, jOffset);
                            if (!iVarMutableCopyWithCapacity2.isModifiable()) {
                                int size = iVarMutableCopyWithCapacity2.size();
                                iVarMutableCopyWithCapacity2 = iVarMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t12, jOffset, iVarMutableCopyWithCapacity2);
                            }
                            iDecodeUnknownField = e.decodeMessageList(v0Var2.getMessageFieldSchema(iPositionForFieldNumber), i37, bArr, i33, i11, iVarMutableCopyWithCapacity2, bVar);
                            i12 = i12;
                            i28 = iPositionForFieldNumber;
                            i29 = i37;
                            i30 = i20;
                            i32 = i43;
                            i31 = i18;
                            bArr4 = bArr;
                        } else {
                            i21 = i43;
                            i26 = i33;
                            unsafe = unsafe2;
                            i22 = iPositionForFieldNumber;
                            i27 = i37;
                        }
                        i19 = i26;
                        i14 = i27;
                    }
                }
                if (i14 != i12 || i12 == 0) {
                    iDecodeUnknownField = (!this.hasExtensions || bVar.extensionRegistry == p.getEmptyRegistry()) ? e.decodeUnknownField(i14, bArr, i19, i11, getMutableUnknownFields(t10), bVar) : e.decodeExtensionOrUnknownField(i14, bArr, i19, i11, t10, this.defaultInstance, this.unknownFieldSchema, bVar);
                    t12 = t10;
                    bArr4 = bArr;
                    i29 = i14;
                    v0Var2 = this;
                    bVar2 = bVar;
                    i30 = i20;
                    i28 = i22;
                    i32 = i21;
                    i31 = i18;
                    unsafe2 = unsafe;
                    i12 = i12;
                } else {
                    i16 = 1048575;
                    v0Var = this;
                    i13 = i19;
                    i30 = i20;
                    i15 = i21;
                }
            } else {
                int i45 = i32;
                unsafe = unsafe2;
                i12 = i12;
                v0Var = v0Var2;
                i13 = iDecodeUnknownField;
                i14 = i29;
                i15 = i45;
                i16 = 1048575;
            }
        }
        if (i15 != i16) {
            t11 = t10;
            unsafe.putInt(t11, i15, i30);
        } else {
            t11 = t10;
        }
        s1 s1Var = null;
        for (int i46 = v0Var.checkInitializedCount; i46 < v0Var.repeatedFieldOffsetStart; i46++) {
            s1Var = (s1) filterMapUnknownEnumValues(t10, v0Var.intArray[i46], s1Var, v0Var.unknownFieldSchema, t10);
        }
        if (s1Var != null) {
            v0Var.unknownFieldSchema.setBuilderToMessage(t11, s1Var);
        }
        if (i12 == 0) {
            if (i13 != i11) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i13 > i11 || i14 != i12) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i13;
    }

    @Override // com.google.protobuf.l1
    public void writeTo(T t10, y1 y1Var) throws IOException {
        if (y1Var.fieldOrder() == y1.a.DESCENDING) {
            writeFieldsInDescendingOrder(t10, y1Var);
        } else {
            writeFieldsInAscendingOrder(t10, y1Var);
        }
    }

    private boolean isFieldPresent(T t10, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 != 1048575) {
            return (v1.getInt(t10, j10) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(v1.getDouble(t10, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(v1.getFloat(t10, jOffset)) != 0;
            case 2:
                return v1.getLong(t10, jOffset) != 0;
            case 3:
                return v1.getLong(t10, jOffset) != 0;
            case 4:
                return v1.getInt(t10, jOffset) != 0;
            case 5:
                return v1.getLong(t10, jOffset) != 0;
            case 6:
                return v1.getInt(t10, jOffset) != 0;
            case 7:
                return v1.getBoolean(t10, jOffset);
            case 8:
                Object object = v1.getObject(t10, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof i) {
                    return !i.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return v1.getObject(t10, jOffset) != null;
            case 10:
                return !i.EMPTY.equals(v1.getObject(t10, jOffset));
            case 11:
                return v1.getInt(t10, jOffset) != 0;
            case 12:
                return v1.getInt(t10, jOffset) != 0;
            case 13:
                return v1.getInt(t10, jOffset) != 0;
            case 14:
                return v1.getLong(t10, jOffset) != 0;
            case 15:
                return v1.getInt(t10, jOffset) != 0;
            case 16:
                return v1.getLong(t10, jOffset) != 0;
            case 17:
                return v1.getObject(t10, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    @Override // com.google.protobuf.l1
    public void mergeFrom(T t10, j1 j1Var, p pVar) throws Throwable {
        pVar.getClass();
        checkMutable(t10);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, j1Var, pVar);
    }

    private boolean equals(T t10, T t11, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t10, t11, i10) && Double.doubleToLongBits(v1.getDouble(t10, jOffset)) == Double.doubleToLongBits(v1.getDouble(t11, jOffset));
            case 1:
                return arePresentForEquals(t10, t11, i10) && Float.floatToIntBits(v1.getFloat(t10, jOffset)) == Float.floatToIntBits(v1.getFloat(t11, jOffset));
            case 2:
                return arePresentForEquals(t10, t11, i10) && v1.getLong(t10, jOffset) == v1.getLong(t11, jOffset);
            case 3:
                return arePresentForEquals(t10, t11, i10) && v1.getLong(t10, jOffset) == v1.getLong(t11, jOffset);
            case 4:
                return arePresentForEquals(t10, t11, i10) && v1.getInt(t10, jOffset) == v1.getInt(t11, jOffset);
            case 5:
                return arePresentForEquals(t10, t11, i10) && v1.getLong(t10, jOffset) == v1.getLong(t11, jOffset);
            case 6:
                return arePresentForEquals(t10, t11, i10) && v1.getInt(t10, jOffset) == v1.getInt(t11, jOffset);
            case 7:
                return arePresentForEquals(t10, t11, i10) && v1.getBoolean(t10, jOffset) == v1.getBoolean(t11, jOffset);
            case 8:
                return arePresentForEquals(t10, t11, i10) && n1.safeEquals(v1.getObject(t10, jOffset), v1.getObject(t11, jOffset));
            case 9:
                return arePresentForEquals(t10, t11, i10) && n1.safeEquals(v1.getObject(t10, jOffset), v1.getObject(t11, jOffset));
            case 10:
                return arePresentForEquals(t10, t11, i10) && n1.safeEquals(v1.getObject(t10, jOffset), v1.getObject(t11, jOffset));
            case 11:
                return arePresentForEquals(t10, t11, i10) && v1.getInt(t10, jOffset) == v1.getInt(t11, jOffset);
            case 12:
                return arePresentForEquals(t10, t11, i10) && v1.getInt(t10, jOffset) == v1.getInt(t11, jOffset);
            case 13:
                return arePresentForEquals(t10, t11, i10) && v1.getInt(t10, jOffset) == v1.getInt(t11, jOffset);
            case 14:
                return arePresentForEquals(t10, t11, i10) && v1.getLong(t10, jOffset) == v1.getLong(t11, jOffset);
            case 15:
                return arePresentForEquals(t10, t11, i10) && v1.getInt(t10, jOffset) == v1.getInt(t11, jOffset);
            case 16:
                return arePresentForEquals(t10, t11, i10) && v1.getLong(t10, jOffset) == v1.getLong(t11, jOffset);
            case 17:
                return arePresentForEquals(t10, t11, i10) && n1.safeEquals(v1.getObject(t10, jOffset), v1.getObject(t11, jOffset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return n1.safeEquals(v1.getObject(t10, jOffset), v1.getObject(t11, jOffset));
            case 50:
                return n1.safeEquals(v1.getObject(t10, jOffset), v1.getObject(t11, jOffset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t10, t11, i10) && n1.safeEquals(v1.getObject(t10, jOffset), v1.getObject(t11, jOffset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.l1
    public void mergeFrom(T t10, byte[] bArr, int i10, int i11, e.b bVar) throws IOException {
        parseMessage(t10, bArr, i10, i11, 0, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i10, l1 l1Var) {
        return l1Var.isInitialized(v1.getObject(obj, offset(i10)));
    }
}
