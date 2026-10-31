package x0;

/* JADX INFO: compiled from: SimpleSQLiteQuery.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f27935b;

    public a(String str, Object[] objArr) {
        this.f27934a = str;
        this.f27935b = objArr;
    }

    private static void a(d dVar, int i10, Object obj) {
        if (obj == null) {
            dVar.f0(i10);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.Z(i10, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dVar.q(i10, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            dVar.q(i10, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            dVar.X(i10, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            dVar.X(i10, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            dVar.X(i10, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            dVar.X(i10, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            dVar.S(i10, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            dVar.X(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            a(dVar, i10, obj);
        }
    }

    @Override // x0.e
    public void b(d dVar) {
        d(dVar, this.f27935b);
    }

    @Override // x0.e
    public String c() {
        return this.f27934a;
    }

    public a(String str) {
        this(str, null);
    }
}
