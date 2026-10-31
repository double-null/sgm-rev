package zc;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ContinuationInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface g extends j.b {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final b f29179a9 = b.f29180a;

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class a {
        public static <E extends j.b> E a(g gVar, j.c<E> key) {
            t.f(key, "key");
            if (!(key instanceof zc.b)) {
                if (g.f29179a9 != key) {
                    return null;
                }
                t.d(gVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return gVar;
            }
            zc.b bVar = (zc.b) key;
            if (!bVar.a(gVar.getKey())) {
                return null;
            }
            E e10 = (E) bVar.b(gVar);
            if (e10 instanceof j.b) {
                return e10;
            }
            return null;
        }

        public static j b(g gVar, j.c<?> key) {
            t.f(key, "key");
            if (!(key instanceof zc.b)) {
                return g.f29179a9 == key ? k.f29181a : gVar;
            }
            zc.b bVar = (zc.b) key;
            return (!bVar.a(gVar.getKey()) || bVar.b(gVar) == null) ? gVar : k.f29181a;
        }
    }

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class b implements j.c<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f29180a = new b();

        private b() {
        }
    }

    void i0(f<?> fVar);

    <T> f<T> t(f<? super T> fVar);
}
