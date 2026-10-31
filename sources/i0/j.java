package i0;

import e0.k;
import id.p;
import kotlin.coroutines.jvm.internal.l;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: compiled from: Preferences.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
    static final class a extends l implements p<f, zc.f<? super f>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15883h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f15884i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ p<c, zc.f<? super g0>, Object> f15885j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super c, ? super zc.f<? super g0>, ? extends Object> pVar, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f15885j = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            a aVar = new a(this.f15885j, fVar);
            aVar.f15884i = obj;
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
            int i10 = this.f15883h;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f15884i;
                s.b(obj);
                return cVar;
            }
            s.b(obj);
            c cVarC = ((f) this.f15884i).c();
            p<c, zc.f<? super g0>, Object> pVar = this.f15885j;
            this.f15884i = cVarC;
            this.f15883h = 1;
            return pVar.invoke(cVarC, this) == objF ? objF : cVarC;
        }
    }

    public static final Object a(k<f> kVar, p<? super c, ? super zc.f<? super g0>, ? extends Object> pVar, zc.f<? super f> fVar) {
        return kVar.a(new a(pVar, null), fVar);
    }
}
