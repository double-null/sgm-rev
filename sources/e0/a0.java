package e0;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: MultiProcessDataStoreFactory.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f13550a = new a0();

    /* JADX INFO: compiled from: MultiProcessDataStoreFactory.android.kt */
    static final class a extends kotlin.jvm.internal.u implements id.l<File, v> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ud.o0 f13551d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ud.o0 o0Var) {
            super(1);
            this.f13551d = o0Var;
        }

        @Override // id.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v invoke(File it) {
            kotlin.jvm.internal.t.f(it, "it");
            return new z(this.f13551d.q(), it);
        }
    }

    private a0() {
    }

    public final <T> k<T> a(g0<T> serializer, f0.b<T> bVar, List<? extends i<T>> migrations, ud.o0 scope, id.a<? extends File> produceFile) {
        kotlin.jvm.internal.t.f(serializer, "serializer");
        kotlin.jvm.internal.t.f(migrations, "migrations");
        kotlin.jvm.internal.t.f(scope, "scope");
        kotlin.jvm.internal.t.f(produceFile, "produceFile");
        q qVar = new q(serializer, new a(scope), produceFile);
        List listE = kotlin.collections.s.e(j.f13591a.b(migrations));
        if (bVar == null) {
            bVar = (f0.b<T>) new f0.a();
        }
        return new m(qVar, listE, bVar, scope);
    }
}
