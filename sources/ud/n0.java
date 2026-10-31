package ud;

/* JADX INFO: compiled from: CoroutineName.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n0 extends zc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26793c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26794b;

    /* JADX INFO: compiled from: CoroutineName.kt */
    public static final class a implements zc.j.c<n0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public n0(String str) {
        super(f26793c);
        this.f26794b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && kotlin.jvm.internal.t.a(this.f26794b, ((n0) obj).f26794b);
    }

    public int hashCode() {
        return this.f26794b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f26794b + ')';
    }
}
