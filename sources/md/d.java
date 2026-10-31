package md;

import java.io.Serializable;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22262a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f22263b = cd.b.f5529a.b();

    /* JADX INFO: compiled from: Random.kt */
    public static final class a extends d implements Serializable {

        /* JADX INFO: renamed from: md.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Random.kt */
        private static final class C0365a implements Serializable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0365a f22264a = new C0365a();

            private C0365a() {
            }

            private final Object readResolve() {
                return d.f22262a;
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private final Object writeReplace() {
            return C0365a.f22264a;
        }

        @Override // md.d
        public int c(int i10) {
            return d.f22263b.c(i10);
        }

        @Override // md.d
        public double e() {
            return d.f22263b.e();
        }

        @Override // md.d
        public int f() {
            return d.f22263b.f();
        }

        @Override // md.d
        public long g() {
            return d.f22263b.g();
        }

        private a() {
        }
    }

    public abstract int c(int i10);

    public double e() {
        return c.a(c(26), c(27));
    }

    public int f() {
        return c(32);
    }

    public long g() {
        return (((long) f()) << 32) + ((long) f());
    }
}
