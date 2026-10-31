package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: JavaType.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 BOOLEAN;
    public static final d0 BYTE_STRING;
    public static final d0 DOUBLE;
    public static final d0 ENUM;
    public static final d0 FLOAT;
    public static final d0 INT;
    public static final d0 LONG;
    public static final d0 MESSAGE;
    public static final d0 STRING;
    public static final d0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        d0 d0Var = new d0("VOID", 0, Void.class, Void.class, null);
        VOID = d0Var;
        Class cls = Integer.TYPE;
        d0 d0Var2 = new d0("INT", 1, cls, Integer.class, 0);
        INT = d0Var2;
        d0 d0Var3 = new d0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = d0Var3;
        d0 d0Var4 = new d0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = d0Var4;
        d0 d0Var5 = new d0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = d0Var5;
        d0 d0Var6 = new d0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = d0Var6;
        d0 d0Var7 = new d0("STRING", 6, String.class, String.class, "");
        STRING = d0Var7;
        d0 d0Var8 = new d0("BYTE_STRING", 7, i.class, i.class, i.EMPTY);
        BYTE_STRING = d0Var8;
        d0 d0Var9 = new d0("ENUM", 8, cls, Integer.class, null);
        ENUM = d0Var9;
        d0 d0Var10 = new d0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = d0Var10;
        $VALUES = new d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9, d0Var10};
    }

    private d0(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
