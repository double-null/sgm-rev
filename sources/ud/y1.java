package ud;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Interruptible.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
    static final class a<T> extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super T>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f26831h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f26832i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ id.a<T> f26833j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(id.a<? extends T> aVar, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f26833j = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            a aVar = new a(this.f26833j, fVar);
            aVar.f26832i = obj;
            return aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super T> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f26831h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            return y1.d(((o0) this.f26832i).q(), this.f26833j);
        }
    }

    public static final <T> Object b(zc.j jVar, id.a<? extends T> aVar, zc.f<? super T> fVar) {
        return i.g(jVar, new a(aVar, null), fVar);
    }

    public static /* synthetic */ Object c(zc.j jVar, id.a aVar, zc.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = zc.k.f29181a;
        }
        return b(jVar, aVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(zc.j jVar, id.a<? extends T> aVar) throws Throwable {
        try {
            w2 w2Var = new w2();
            w2Var.C(d2.j(jVar));
            try {
                return aVar.invoke();
            } finally {
                w2Var.z();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
