package wc;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z implements Comparable<z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27793b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27794a;

    /* JADX INFO: compiled from: UInt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    private /* synthetic */ z(int i10) {
        this.f27794a = i10;
    }

    public static final /* synthetic */ z a(int i10) {
        return new z(i10);
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof z) && i10 == ((z) obj).g();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(z zVar) {
        return i0.a(g(), zVar.g());
    }

    public boolean equals(Object obj) {
        return c(this.f27794a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f27794a;
    }

    public int hashCode() {
        return d(this.f27794a);
    }

    public String toString() {
        return e(this.f27794a);
    }

    public static int b(int i10) {
        return i10;
    }
}
