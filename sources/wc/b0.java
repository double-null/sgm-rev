package wc;

/* JADX INFO: compiled from: ULong.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements Comparable<b0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27741b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27742a;

    /* JADX INFO: compiled from: ULong.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    private /* synthetic */ b0(long j10) {
        this.f27742a = j10;
    }

    public static final /* synthetic */ b0 a(long j10) {
        return new b0(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof b0) && j10 == ((b0) obj).g();
    }

    public static int d(long j10) {
        return Long.hashCode(j10);
    }

    public static String e(long j10) {
        return i0.c(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(b0 b0Var) {
        return i0.b(g(), b0Var.g());
    }

    public boolean equals(Object obj) {
        return c(this.f27742a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f27742a;
    }

    public int hashCode() {
        return d(this.f27742a);
    }

    public String toString() {
        return e(this.f27742a);
    }

    public static long b(long j10) {
        return j10;
    }
}
