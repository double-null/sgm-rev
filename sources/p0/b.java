package p0;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.ListenableFuture;
import id.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.v0;
import wc.g0;

/* JADX INFO: compiled from: CoroutineAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: compiled from: CoroutineAdapter.kt */
    static final class a extends u implements l<Throwable, g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c.a<T> f23426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ v0<T> f23427e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.a<T> aVar, v0<? extends T> v0Var) {
            super(1);
            this.f23426d = aVar;
            this.f23427e = v0Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void b(Throwable th) {
            if (th == null) {
                this.f23426d.c((T) this.f23427e.h());
            } else if (th instanceof CancellationException) {
                this.f23426d.d();
            } else {
                this.f23426d.f(th);
            }
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Throwable th) {
            b(th);
            return g0.f27756a;
        }
    }

    public static final <T> ListenableFuture<T> b(final v0<? extends T> v0Var, final Object obj) {
        t.f(v0Var, "<this>");
        ListenableFuture<T> listenableFutureA = c.a(new c.InterfaceC0027c() { // from class: p0.a
            @Override // androidx.concurrent.futures.c.InterfaceC0027c
            public final Object attachCompleter(c.a aVar) {
                return b.d(v0Var, obj, aVar);
            }
        });
        t.e(listenableFutureA, "getFuture { completer ->…      }\n        tag\n    }");
        return listenableFutureA;
    }

    public static /* synthetic */ ListenableFuture c(v0 v0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(v0Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(v0 this_asListenableFuture, Object obj, c.a completer) {
        t.f(this_asListenableFuture, "$this_asListenableFuture");
        t.f(completer, "completer");
        this_asListenableFuture.s(new a(completer, this_asListenableFuture));
        return obj;
    }
}
