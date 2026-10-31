package com.explorestack.protobuf;

/* JADX INFO: compiled from: FieldInfo.java */
/* JADX INFO: loaded from: classes.dex */
final class d0 implements Comparable<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Field f10328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f10329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<?> f10330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.reflect.Field f10332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f10333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f10334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f10335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q1 f10336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.lang.reflect.Field f10337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Class<?> f10338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f10339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final l0.e f10340m;

    /* JADX INFO: compiled from: FieldInfo.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10341a;

        static {
            int[] iArr = new int[f0.values().length];
            f10341a = iArr;
            try {
                iArr[f0.f10403o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10341a[f0.f10411w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10341a[f0.G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10341a[f0.f10389c0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private d0(java.lang.reflect.Field field, int i10, f0 f0Var, Class<?> cls, java.lang.reflect.Field field2, int i11, boolean z10, boolean z11, q1 q1Var, Class<?> cls2, Object obj, l0.e eVar, java.lang.reflect.Field field3) {
        this.f10328a = field;
        this.f10329b = f0Var;
        this.f10330c = cls;
        this.f10331d = i10;
        this.f10332e = field2;
        this.f10333f = i11;
        this.f10334g = z10;
        this.f10335h = z11;
        this.f10336i = q1Var;
        this.f10338k = cls2;
        this.f10339l = obj;
        this.f10340m = eVar;
        this.f10337j = field3;
    }

    private static void a(int i10) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i10);
    }

    public static d0 c(java.lang.reflect.Field field, int i10, f0 f0Var, boolean z10) {
        a(i10);
        l0.b(field, "field");
        l0.b(f0Var, "fieldType");
        if (f0Var == f0.G || f0Var == f0.f10389c0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new d0(field, i10, f0Var, null, null, 0, false, z10, null, null, null, null, null);
    }

    public static d0 d(java.lang.reflect.Field field, int i10, f0 f0Var, l0.e eVar) {
        a(i10);
        l0.b(field, "field");
        return new d0(field, i10, f0Var, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static d0 e(java.lang.reflect.Field field, int i10, Object obj, l0.e eVar) {
        l0.b(obj, "mapDefaultEntry");
        a(i10);
        l0.b(field, "field");
        return new d0(field, i10, f0.f10390d0, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static d0 g(int i10, f0 f0Var, q1 q1Var, Class<?> cls, boolean z10, l0.e eVar) {
        a(i10);
        l0.b(f0Var, "fieldType");
        l0.b(q1Var, "oneof");
        l0.b(cls, "oneofStoredType");
        if (f0Var.h()) {
            return new d0(null, i10, f0Var, null, null, 0, false, z10, q1Var, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i10 + " is of type " + f0Var);
    }

    public static d0 h(java.lang.reflect.Field field, int i10, f0 f0Var, java.lang.reflect.Field field2) {
        a(i10);
        l0.b(field, "field");
        l0.b(f0Var, "fieldType");
        if (f0Var == f0.G || f0Var == f0.f10389c0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new d0(field, i10, f0Var, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static d0 i(java.lang.reflect.Field field, int i10, f0 f0Var, l0.e eVar, java.lang.reflect.Field field2) {
        a(i10);
        l0.b(field, "field");
        return new d0(field, i10, f0Var, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static d0 j(java.lang.reflect.Field field, int i10, f0 f0Var, java.lang.reflect.Field field2, int i11, boolean z10, l0.e eVar) {
        a(i10);
        l0.b(field, "field");
        l0.b(f0Var, "fieldType");
        l0.b(field2, "presenceField");
        if (field2 == null || x(i11)) {
            return new d0(field, i10, f0Var, null, field2, i11, false, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static d0 k(java.lang.reflect.Field field, int i10, f0 f0Var, java.lang.reflect.Field field2, int i11, boolean z10, l0.e eVar) {
        a(i10);
        l0.b(field, "field");
        l0.b(f0Var, "fieldType");
        l0.b(field2, "presenceField");
        if (field2 == null || x(i11)) {
            return new d0(field, i10, f0Var, null, field2, i11, true, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static d0 l(java.lang.reflect.Field field, int i10, f0 f0Var, Class<?> cls) {
        a(i10);
        l0.b(field, "field");
        l0.b(f0Var, "fieldType");
        l0.b(cls, "messageClass");
        return new d0(field, i10, f0Var, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean x(int i10) {
        return i10 != 0 && (i10 & (i10 + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(d0 d0Var) {
        return this.f10331d - d0Var.f10331d;
    }

    public java.lang.reflect.Field m() {
        return this.f10337j;
    }

    public l0.e n() {
        return this.f10340m;
    }

    public java.lang.reflect.Field o() {
        return this.f10328a;
    }

    public int p() {
        return this.f10331d;
    }

    public Object q() {
        return this.f10339l;
    }

    public Class<?> r() {
        int i10 = a.f10341a[this.f10329b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            java.lang.reflect.Field field = this.f10328a;
            return field != null ? field.getType() : this.f10338k;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f10330c;
        }
        return null;
    }

    public q1 s() {
        return this.f10336i;
    }

    public java.lang.reflect.Field t() {
        return this.f10332e;
    }

    public int u() {
        return this.f10333f;
    }

    public f0 v() {
        return this.f10329b;
    }

    public boolean w() {
        return this.f10335h;
    }

    public boolean y() {
        return this.f10334g;
    }
}
