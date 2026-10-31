package androidx.datastore.preferences.protobuf;

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
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f2399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f2400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z f2401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z f2402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z f2403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z f2404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final z f2405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z f2406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z f2407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final z f2408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ z[] f2409n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f2410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f2411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f2412c;

    static {
        z zVar = new z("VOID", 0, Void.class, Void.class, null);
        f2399d = zVar;
        Class cls = Integer.TYPE;
        z zVar2 = new z("INT", 1, cls, Integer.class, 0);
        f2400e = zVar2;
        z zVar3 = new z("LONG", 2, Long.TYPE, Long.class, 0L);
        f2401f = zVar3;
        z zVar4 = new z("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f2402g = zVar4;
        z zVar5 = new z("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f2403h = zVar5;
        z zVar6 = new z("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f2404i = zVar6;
        z zVar7 = new z("STRING", 6, String.class, String.class, "");
        f2405j = zVar7;
        z zVar8 = new z("BYTE_STRING", 7, g.class, g.class, g.f2126b);
        f2406k = zVar8;
        z zVar9 = new z("ENUM", 8, cls, Integer.class, null);
        f2407l = zVar9;
        z zVar10 = new z("MESSAGE", 9, Object.class, Object.class, null);
        f2408m = zVar10;
        f2409n = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9, zVar10};
    }

    private z(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f2410a = cls;
        this.f2411b = cls2;
        this.f2412c = obj;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f2409n.clone();
    }

    public Class<?> b() {
        return this.f2411b;
    }
}
