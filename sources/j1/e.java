package j1;

import android.content.Context;
import android.os.Build;
import androidx.work.l;
import androidx.work.m;
import m1.p;

/* JADX INFO: compiled from: NetworkMeteredController.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends c<i1.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20543e = l.f("NetworkMeteredCtrlr");

    public e(Context context, o1.a aVar) {
        super(k1.g.c(context, aVar).d());
    }

    @Override // j1.c
    boolean b(p pVar) {
        return pVar.f22087j.b() == m.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j1.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(i1.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        l.c().a(f20543e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
