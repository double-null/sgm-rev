package e0;

/* JADX INFO: compiled from: StorageConnection.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: StorageConnection.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
    static final class a<T> extends kotlin.coroutines.jvm.internal.l implements id.q<e0<T>, Boolean, zc.f<? super T>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f13777h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f13778i;

        a(zc.f<? super a> fVar) {
            super(3, fVar);
        }

        public final Object f(e0<T> e0Var, boolean z10, zc.f<? super T> fVar) {
            a aVar = new a(fVar);
            aVar.f13778i = e0Var;
            return aVar.invokeSuspend(wc.g0.f27756a);
        }

        @Override // id.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return f((e0) obj, bool.booleanValue(), (zc.f) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f13777h;
            if (i10 == 0) {
                wc.s.b(obj);
                e0 e0Var = (e0) this.f13778i;
                this.f13777h = 1;
                obj = e0Var.c(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object a(m0<T> m0Var, zc.f<? super T> fVar) {
        return m0Var.a(new a(null), fVar);
    }
}
