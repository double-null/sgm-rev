package od;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23393e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f23394f = new h(1, 0);

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final h a() {
            return h.f23394f;
        }
    }

    public h(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // od.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (a() != hVar.a() || c() != hVar.c()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean g(int i10) {
        return a() <= i10 && i10 <= c();
    }

    @Override // od.f
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + c();
    }

    public Integer i() {
        return Integer.valueOf(c());
    }

    @Override // od.f
    public boolean isEmpty() {
        return a() > c();
    }

    public Integer j() {
        return Integer.valueOf(a());
    }

    @Override // od.f
    public String toString() {
        return a() + ".." + c();
    }
}
