package com.explorestack.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: JavaType.java */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f10686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n0 f10687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n0 f10688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n0 f10689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n0 f10690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n0 f10691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n0 f10692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n0 f10693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n0 f10694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n0 f10695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ n0[] f10696n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f10697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f10698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10699c;

    static {
        n0 n0Var = new n0("VOID", 0, Void.class, Void.class, null);
        f10686d = n0Var;
        Class cls = Integer.TYPE;
        n0 n0Var2 = new n0("INT", 1, cls, Integer.class, 0);
        f10687e = n0Var2;
        n0 n0Var3 = new n0("LONG", 2, Long.TYPE, Long.class, 0L);
        f10688f = n0Var3;
        n0 n0Var4 = new n0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f10689g = n0Var4;
        n0 n0Var5 = new n0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f10690h = n0Var5;
        n0 n0Var6 = new n0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f10691i = n0Var6;
        n0 n0Var7 = new n0("STRING", 6, String.class, String.class, "");
        f10692j = n0Var7;
        n0 n0Var8 = new n0("BYTE_STRING", 7, ByteString.class, ByteString.class, ByteString.EMPTY);
        f10693k = n0Var8;
        n0 n0Var9 = new n0("ENUM", 8, cls, Integer.class, null);
        f10694l = n0Var9;
        n0 n0Var10 = new n0("MESSAGE", 9, Object.class, Object.class, null);
        f10695m = n0Var10;
        f10696n = new n0[]{n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7, n0Var8, n0Var9, n0Var10};
    }

    private n0(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f10697a = cls;
        this.f10698b = cls2;
        this.f10699c = obj;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f10696n.clone();
    }

    public Class<?> b() {
        return this.f10698b;
    }
}
