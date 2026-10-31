package e0;

import java.io.File;
import java.util.List;
import ud.e1;
import ud.t2;

/* JADX INFO: compiled from: DataStoreFactory.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f13625a = new l();

    private l() {
    }

    public static /* synthetic */ k c(l lVar, g0 g0Var, f0.b bVar, List list, ud.o0 o0Var, id.a aVar, int i10, Object obj) {
        f0.b bVar2 = (i10 & 2) != 0 ? null : bVar;
        if ((i10 & 4) != 0) {
            list = kotlin.collections.t.k();
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            o0Var = ud.p0.a(e1.b().z(t2.b(null, 1, null)));
        }
        return lVar.a(g0Var, bVar2, list2, o0Var, aVar);
    }

    public final <T> k<T> a(g0<T> serializer, f0.b<T> bVar, List<? extends i<T>> migrations, ud.o0 scope, id.a<? extends File> produceFile) {
        kotlin.jvm.internal.t.f(serializer, "serializer");
        kotlin.jvm.internal.t.f(migrations, "migrations");
        kotlin.jvm.internal.t.f(scope, "scope");
        kotlin.jvm.internal.t.f(produceFile, "produceFile");
        return b(new q(serializer, null, produceFile, 2, null), bVar, migrations, scope);
    }

    public final <T> k<T> b(l0<T> storage, f0.b<T> bVar, List<? extends i<T>> migrations, ud.o0 scope) {
        kotlin.jvm.internal.t.f(storage, "storage");
        kotlin.jvm.internal.t.f(migrations, "migrations");
        kotlin.jvm.internal.t.f(scope, "scope");
        if (bVar == null) {
            bVar = (f0.b<T>) new f0.a();
        }
        return new m(storage, kotlin.collections.s.e(j.f13591a.b(migrations)), bVar, scope);
    }
}
