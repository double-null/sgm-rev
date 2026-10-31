package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: compiled from: View.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.k implements id.p<qd.i<? super View>, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1972h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f1973i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f1974j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f1974j = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            a aVar = new a(this.f1974j, fVar);
            aVar.f1973i = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            qd.i iVar;
            Object objF = ad.d.f();
            int i10 = this.f1972h;
            if (i10 != 0) {
                if (i10 == 1) {
                    iVar = (qd.i) this.f1973i;
                    wc.s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                return wc.g0.f27756a;
            }
            wc.s.b(obj);
            iVar = (qd.i) this.f1973i;
            View view = this.f1974j;
            this.f1973i = iVar;
            this.f1972h = 1;
            if (iVar.a(view, this) == objF) {
                return objF;
            }
            View view2 = this.f1974j;
            if (view2 instanceof ViewGroup) {
                qd.g<View> gVarB = t2.b((ViewGroup) view2);
                this.f1973i = null;
                this.f1972h = 2;
                if (iVar.d(gVarB, this) == objF) {
                    return objF;
                }
            }
            return wc.g0.f27756a;
        }

        @Override // id.p
        public final Object invoke(qd.i<? super View> iVar, zc.f<? super wc.g0> fVar) {
            return ((a) create(iVar, fVar)).invokeSuspend(wc.g0.f27756a);
        }
    }

    public static final qd.g<View> a(View view) {
        return qd.k.b(new a(view, null));
    }
}
