package i0;

import e0.k;
import id.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements k<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k<f> f15873a;

    /* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
    static final class a extends l implements p<f, zc.f<? super f>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15874h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f15875i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ p<f, zc.f<? super f>, Object> f15876j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super f, ? super zc.f<? super f>, ? extends Object> pVar, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f15876j = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            a aVar = new a(this.f15876j, fVar);
            aVar.f15875i = obj;
            return aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, zc.f<? super f> fVar2) {
            return ((a) create(fVar, fVar2)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f15874h;
            if (i10 == 0) {
                s.b(obj);
                f fVar = (f) this.f15875i;
                p<f, zc.f<? super f>, Object> pVar = this.f15876j;
                this.f15874h = 1;
                obj = pVar.invoke(fVar, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            f fVar2 = (f) obj;
            t.d(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).f();
            return fVar2;
        }
    }

    public d(k<f> delegate) {
        t.f(delegate, "delegate");
        this.f15873a = delegate;
    }

    @Override // e0.k
    public Object a(p<? super f, ? super zc.f<? super f>, ? extends Object> pVar, zc.f<? super f> fVar) {
        return this.f15873a.a(new a(pVar, null), fVar);
    }

    @Override // e0.k
    public xd.c<f> getData() {
        return this.f15873a.getData();
    }
}
