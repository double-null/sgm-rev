package i0;

import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: Preferences.kt */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15879a;

        public final String a() {
            return this.f15879a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return t.a(this.f15879a, ((a) obj).f15879a);
            }
            return false;
        }

        public int hashCode() {
            return this.f15879a.hashCode();
        }

        public String toString() {
            return this.f15879a;
        }

        public a(String str) {
            t.f(str, cNMUz.uMHuV);
            this.f15879a = str;
        }
    }

    /* JADX INFO: compiled from: Preferences.kt */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<T> f15880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f15881b;

        public final a<T> a() {
            return this.f15880a;
        }

        public final T b() {
            return this.f15881b;
        }
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);

    public final c c() {
        return new c(o0.u(a()), false);
    }

    public final f d() {
        return new c(o0.u(a()), true);
    }
}
