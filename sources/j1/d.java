package j1;

import android.content.Context;
import android.os.Build;
import androidx.work.m;
import m1.p;

/* JADX INFO: compiled from: NetworkConnectedController.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends c<i1.b> {
    public d(Context context, o1.a aVar) {
        super(k1.g.c(context, aVar).d());
    }

    @Override // j1.c
    boolean b(p pVar) {
        return pVar.f22087j.b() == m.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j1.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(i1.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.d()) ? false : true;
        }
        return !bVar.a();
    }
}
