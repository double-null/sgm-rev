package bc;

import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wb.h;

/* JADX INFO: compiled from: LoggerInstance.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: compiled from: LoggerInstance.kt */
    static final class a extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f4448d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(0);
            this.f4448d = hVar;
        }

        @Override // id.a
        public final String invoke() {
            return this.f4448d.a();
        }
    }

    static /* synthetic */ void a(c cVar, Object obj, h hVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        cVar.f(obj, hVar);
    }

    static /* synthetic */ void c(c cVar, Object obj, id.a aVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        cVar.d(obj, aVar);
    }

    static /* synthetic */ void e(c cVar, Object obj, id.a aVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        cVar.b(obj, aVar);
    }

    void b(Object obj, id.a<String> aVar);

    void d(Object obj, id.a<String> aVar);

    default void f(Object obj, h error) {
        t.f(error, "error");
        d(obj, new a(error));
    }

    void g(Object obj, id.a<String> aVar);
}
