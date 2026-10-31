package wc;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x implements Comparable<x> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27788b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f27789a;

    /* JADX INFO: compiled from: UByte.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    private /* synthetic */ x(byte b10) {
        this.f27789a = b10;
    }

    public static final /* synthetic */ x a(byte b10) {
        return new x(b10);
    }

    public static boolean c(byte b10, Object obj) {
        return (obj instanceof x) && b10 == ((x) obj).g();
    }

    public static int d(byte b10) {
        return Byte.hashCode(b10);
    }

    public static String e(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(x xVar) {
        return kotlin.jvm.internal.t.g(g() & 255, xVar.g() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f27789a, obj);
    }

    public final /* synthetic */ byte g() {
        return this.f27789a;
    }

    public int hashCode() {
        return d(this.f27789a);
    }

    public String toString() {
        return e(this.f27789a);
    }

    public static byte b(byte b10) {
        return b10;
    }
}
