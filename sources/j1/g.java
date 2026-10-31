package j1;

import android.content.Context;
import android.os.Build;
import androidx.work.m;
import m1.p;

/* JADX INFO: compiled from: NetworkUnmeteredController.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends c<i1.b> {
    public g(Context context, o1.a aVar) {
        super(k1.g.c(context, aVar).d());
    }

    @Override // j1.c
    boolean b(p pVar) {
        return pVar.f22087j.b() == m.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f22087j.b() == m.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j1.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(i1.b bVar) {
        return !bVar.a() || bVar.b();
    }
}
