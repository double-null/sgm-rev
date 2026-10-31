package wc;

/* JADX INFO: compiled from: UShort.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements Comparable<e0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27751b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f27752a;

    /* JADX INFO: compiled from: UShort.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    private /* synthetic */ e0(short s10) {
        this.f27752a = s10;
    }

    public static final /* synthetic */ e0 a(short s10) {
        return new e0(s10);
    }

    public static boolean c(short s10, Object obj) {
        return (obj instanceof e0) && s10 == ((e0) obj).g();
    }

    public static int d(short s10) {
        return Short.hashCode(s10);
    }

    public static String e(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(e0 e0Var) {
        return kotlin.jvm.internal.t.g(g() & 65535, e0Var.g() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f27752a, obj);
    }

    public final /* synthetic */ short g() {
        return this.f27752a;
    }

    public int hashCode() {
        return d(this.f27752a);
    }

    public String toString() {
        return e(this.f27752a);
    }

    public static short b(short s10) {
        return s10;
    }
}
