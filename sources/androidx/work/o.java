package androidx.work;

/* JADX INFO: compiled from: Operation.java */
/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f3824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C0078b f3825b;

    /* JADX INFO: compiled from: Operation.java */
    public static abstract class b {

        /* JADX INFO: compiled from: Operation.java */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f3826a;

            public a(Throwable th) {
                this.f3826a = th;
            }

            public Throwable a() {
                return this.f3826a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f3826a.getMessage());
            }
        }

        /* JADX INFO: renamed from: androidx.work.o$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Operation.java */
        public static final class C0078b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0078b() {
            }
        }

        /* JADX INFO: compiled from: Operation.java */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f3824a = new b.c();
        f3825b = new b.C0078b();
    }
}
