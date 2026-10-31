package com.google.protobuf;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: FieldType.java */
/* JADX INFO: loaded from: classes4.dex */
public final class v {
    private static final /* synthetic */ v[] $VALUES;
    public static final v BOOL;
    public static final v BOOL_LIST;
    public static final v BOOL_LIST_PACKED;
    public static final v BYTES;
    public static final v BYTES_LIST;
    public static final v DOUBLE;
    public static final v DOUBLE_LIST;
    public static final v DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final v ENUM;
    public static final v ENUM_LIST;
    public static final v ENUM_LIST_PACKED;
    public static final v FIXED32;
    public static final v FIXED32_LIST;
    public static final v FIXED32_LIST_PACKED;
    public static final v FIXED64;
    public static final v FIXED64_LIST;
    public static final v FIXED64_LIST_PACKED;
    public static final v FLOAT;
    public static final v FLOAT_LIST;
    public static final v FLOAT_LIST_PACKED;
    public static final v GROUP;
    public static final v GROUP_LIST;
    public static final v INT32;
    public static final v INT32_LIST;
    public static final v INT32_LIST_PACKED;
    public static final v INT64;
    public static final v INT64_LIST;
    public static final v INT64_LIST_PACKED;
    public static final v MAP;
    public static final v MESSAGE;
    public static final v MESSAGE_LIST;
    public static final v SFIXED32;
    public static final v SFIXED32_LIST;
    public static final v SFIXED32_LIST_PACKED;
    public static final v SFIXED64;
    public static final v SFIXED64_LIST;
    public static final v SFIXED64_LIST_PACKED;
    public static final v SINT32;
    public static final v SINT32_LIST;
    public static final v SINT32_LIST_PACKED;
    public static final v SINT64;
    public static final v SINT64_LIST;
    public static final v SINT64_LIST_PACKED;
    public static final v STRING;
    public static final v STRING_LIST;
    public static final v UINT32;
    public static final v UINT32_LIST;
    public static final v UINT32_LIST_PACKED;
    public static final v UINT64;
    public static final v UINT64_LIST;
    public static final v UINT64_LIST_PACKED;
    private static final v[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f12458id;
    private final d0 javaType;
    private final boolean primitiveScalar;

    /* JADX INFO: compiled from: FieldType.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

        static {
            int[] iArr = new int[d0.values().length];
            $SwitchMap$com$google$protobuf$JavaType = iArr;
            try {
                iArr[d0.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[d0.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[d0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            $SwitchMap$com$google$protobuf$FieldType$Collection = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType$Collection[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType$Collection[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldType.java */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean z10) {
            this.isList = z10;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    private v(String str, int i10, int i11, b bVar, d0 d0Var) {
        int i12;
        super(str, i10);
        this.f12458id = i11;
        this.collection = bVar;
        this.javaType = d0Var;
        int i13 = a.$SwitchMap$com$google$protobuf$FieldType$Collection[bVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.elementType = d0Var.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.$SwitchMap$com$google$protobuf$JavaType[d0Var.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static v forId(int i10) {
        if (i10 < 0) {
            return null;
        }
        v[] vVarArr = VALUES;
        if (i10 >= vVarArr.length) {
            return null;
        }
        return vVarArr[i10];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        boolean z10;
        while (true) {
            int i10 = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i10 >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i10];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i10++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                    Type type = actualTypeArguments[i11];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 >= typeParameters.length) {
                                z10 = false;
                                break;
                            }
                            if (type == typeParameters[i12]) {
                                actualTypeArguments[i11] = typeArr[i12];
                                z10 = true;
                                break;
                            }
                            i12++;
                        }
                        if (!z10) {
                            throw new RuntimeException("Unable to find replacement for " + type);
                        }
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    public d0 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f12458id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == b.MAP;
    }

    public boolean isPacked() {
        return b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return b.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }

    static {
        b bVar = b.SCALAR;
        d0 d0Var = d0.DOUBLE;
        v vVar = new v("DOUBLE", 0, 0, bVar, d0Var);
        DOUBLE = vVar;
        d0 d0Var2 = d0.FLOAT;
        v vVar2 = new v("FLOAT", 1, 1, bVar, d0Var2);
        FLOAT = vVar2;
        d0 d0Var3 = d0.LONG;
        v vVar3 = new v("INT64", 2, 2, bVar, d0Var3);
        INT64 = vVar3;
        v vVar4 = new v("UINT64", 3, 3, bVar, d0Var3);
        UINT64 = vVar4;
        d0 d0Var4 = d0.INT;
        v vVar5 = new v("INT32", 4, 4, bVar, d0Var4);
        INT32 = vVar5;
        v vVar6 = new v("FIXED64", 5, 5, bVar, d0Var3);
        FIXED64 = vVar6;
        v vVar7 = new v("FIXED32", 6, 6, bVar, d0Var4);
        FIXED32 = vVar7;
        String str = CwEo.YgTezSe;
        d0 d0Var5 = d0.BOOLEAN;
        v vVar8 = new v(str, 7, 7, bVar, d0Var5);
        BOOL = vVar8;
        d0 d0Var6 = d0.STRING;
        v vVar9 = new v("STRING", 8, 8, bVar, d0Var6);
        STRING = vVar9;
        d0 d0Var7 = d0.MESSAGE;
        v vVar10 = new v("MESSAGE", 9, 9, bVar, d0Var7);
        MESSAGE = vVar10;
        d0 d0Var8 = d0.BYTE_STRING;
        v vVar11 = new v("BYTES", 10, 10, bVar, d0Var8);
        BYTES = vVar11;
        v vVar12 = new v("UINT32", 11, 11, bVar, d0Var4);
        UINT32 = vVar12;
        d0 d0Var9 = d0.ENUM;
        v vVar13 = new v("ENUM", 12, 12, bVar, d0Var9);
        ENUM = vVar13;
        v vVar14 = new v("SFIXED32", 13, 13, bVar, d0Var4);
        SFIXED32 = vVar14;
        v vVar15 = new v("SFIXED64", 14, 14, bVar, d0Var3);
        SFIXED64 = vVar15;
        v vVar16 = new v("SINT32", 15, 15, bVar, d0Var4);
        SINT32 = vVar16;
        v vVar17 = new v("SINT64", 16, 16, bVar, d0Var3);
        SINT64 = vVar17;
        v vVar18 = new v("GROUP", 17, 17, bVar, d0Var7);
        GROUP = vVar18;
        b bVar2 = b.VECTOR;
        v vVar19 = new v("DOUBLE_LIST", 18, 18, bVar2, d0Var);
        DOUBLE_LIST = vVar19;
        v vVar20 = new v("FLOAT_LIST", 19, 19, bVar2, d0Var2);
        FLOAT_LIST = vVar20;
        v vVar21 = new v("INT64_LIST", 20, 20, bVar2, d0Var3);
        INT64_LIST = vVar21;
        v vVar22 = new v("UINT64_LIST", 21, 21, bVar2, d0Var3);
        UINT64_LIST = vVar22;
        v vVar23 = new v("INT32_LIST", 22, 22, bVar2, d0Var4);
        INT32_LIST = vVar23;
        v vVar24 = new v("FIXED64_LIST", 23, 23, bVar2, d0Var3);
        FIXED64_LIST = vVar24;
        v vVar25 = new v("FIXED32_LIST", 24, 24, bVar2, d0Var4);
        FIXED32_LIST = vVar25;
        v vVar26 = new v("BOOL_LIST", 25, 25, bVar2, d0Var5);
        BOOL_LIST = vVar26;
        v vVar27 = new v("STRING_LIST", 26, 26, bVar2, d0Var6);
        STRING_LIST = vVar27;
        v vVar28 = new v("MESSAGE_LIST", 27, 27, bVar2, d0Var7);
        MESSAGE_LIST = vVar28;
        v vVar29 = new v("BYTES_LIST", 28, 28, bVar2, d0Var8);
        BYTES_LIST = vVar29;
        v vVar30 = new v("UINT32_LIST", 29, 29, bVar2, d0Var4);
        UINT32_LIST = vVar30;
        v vVar31 = new v("ENUM_LIST", 30, 30, bVar2, d0Var9);
        ENUM_LIST = vVar31;
        v vVar32 = new v("SFIXED32_LIST", 31, 31, bVar2, d0Var4);
        SFIXED32_LIST = vVar32;
        v vVar33 = new v("SFIXED64_LIST", 32, 32, bVar2, d0Var3);
        SFIXED64_LIST = vVar33;
        v vVar34 = new v("SINT32_LIST", 33, 33, bVar2, d0Var4);
        SINT32_LIST = vVar34;
        v vVar35 = new v("SINT64_LIST", 34, 34, bVar2, d0Var3);
        SINT64_LIST = vVar35;
        b bVar3 = b.PACKED_VECTOR;
        v vVar36 = new v("DOUBLE_LIST_PACKED", 35, 35, bVar3, d0Var);
        DOUBLE_LIST_PACKED = vVar36;
        v vVar37 = new v("FLOAT_LIST_PACKED", 36, 36, bVar3, d0Var2);
        FLOAT_LIST_PACKED = vVar37;
        v vVar38 = new v("INT64_LIST_PACKED", 37, 37, bVar3, d0Var3);
        INT64_LIST_PACKED = vVar38;
        v vVar39 = new v("UINT64_LIST_PACKED", 38, 38, bVar3, d0Var3);
        UINT64_LIST_PACKED = vVar39;
        v vVar40 = new v("INT32_LIST_PACKED", 39, 39, bVar3, d0Var4);
        INT32_LIST_PACKED = vVar40;
        v vVar41 = new v("FIXED64_LIST_PACKED", 40, 40, bVar3, d0Var3);
        FIXED64_LIST_PACKED = vVar41;
        v vVar42 = new v("FIXED32_LIST_PACKED", 41, 41, bVar3, d0Var4);
        FIXED32_LIST_PACKED = vVar42;
        v vVar43 = new v("BOOL_LIST_PACKED", 42, 42, bVar3, d0Var5);
        BOOL_LIST_PACKED = vVar43;
        v vVar44 = new v("UINT32_LIST_PACKED", 43, 43, bVar3, d0Var4);
        UINT32_LIST_PACKED = vVar44;
        v vVar45 = new v("ENUM_LIST_PACKED", 44, 44, bVar3, d0Var9);
        ENUM_LIST_PACKED = vVar45;
        v vVar46 = new v(sRGQSqxgxlS.MZDPTWOZGgNPZ, 45, 45, bVar3, d0Var4);
        SFIXED32_LIST_PACKED = vVar46;
        v vVar47 = new v("SFIXED64_LIST_PACKED", 46, 46, bVar3, d0Var3);
        SFIXED64_LIST_PACKED = vVar47;
        v vVar48 = new v("SINT32_LIST_PACKED", 47, 47, bVar3, d0Var4);
        SINT32_LIST_PACKED = vVar48;
        v vVar49 = new v("SINT64_LIST_PACKED", 48, 48, bVar3, d0Var3);
        SINT64_LIST_PACKED = vVar49;
        v vVar50 = new v("GROUP_LIST", 49, 49, bVar2, d0Var7);
        GROUP_LIST = vVar50;
        v vVar51 = new v("MAP", 50, 50, b.MAP, d0.VOID);
        MAP = vVar51;
        $VALUES = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, vVar12, vVar13, vVar14, vVar15, vVar16, vVar17, vVar18, vVar19, vVar20, vVar21, vVar22, vVar23, vVar24, vVar25, vVar26, vVar27, vVar28, vVar29, vVar30, vVar31, vVar32, vVar33, vVar34, vVar35, vVar36, vVar37, vVar38, vVar39, vVar40, vVar41, vVar42, vVar43, vVar44, vVar45, vVar46, vVar47, vVar48, vVar49, vVar50, vVar51};
        EMPTY_TYPES = new Type[0];
        v[] vVarArrValues = values();
        VALUES = new v[vVarArrValues.length];
        for (v vVar52 : vVarArrValues) {
            VALUES[vVar52.f12458id] = vVar52;
        }
    }
}
