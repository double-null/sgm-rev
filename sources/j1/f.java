package j1;

import android.content.Context;
import androidx.work.l;
import androidx.work.m;
import m1.p;

/* JADX INFO: compiled from: NetworkNotRoamingController.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends c<i1.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20544e = l.f("NetworkNotRoamingCtrlr");

    public f(Context context, o1.a aVar) {
        super(k1.g.c(context, aVar).d());
    }

    @Override // j1.c
    boolean b(p pVar) {
        return pVar.f22087j.b() == m.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j1.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(i1.b bVar) {
        return (bVar.a() && bVar.c()) ? false : true;
    }
}
