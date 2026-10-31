package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m1.p;

/* JADX INFO: compiled from: ConstraintsCommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f3704e = l.f("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f3707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i1.d f3708d;

    c(Context context, int i10, e eVar) {
        this.f3705a = context;
        this.f3706b = i10;
        this.f3707c = eVar;
        this.f3708d = new i1.d(context, eVar.f(), null);
    }

    void a() {
        List<p> listD = this.f3707c.g().o().B().d();
        ConstraintProxy.a(this.f3705a, listD);
        this.f3708d.d(listD);
        ArrayList arrayList = new ArrayList(listD.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (p pVar : listD) {
            String str = pVar.f22078a;
            if (jCurrentTimeMillis >= pVar.a() && (!pVar.b() || this.f3708d.c(str))) {
                arrayList.add(pVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((p) it.next()).f22078a;
            Intent intentB = b.b(this.f3705a, str2);
            l.c().a(f3704e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f3707c;
            eVar.k(new e.b(eVar, intentB, this.f3706b));
        }
        this.f3708d.e();
    }
}
