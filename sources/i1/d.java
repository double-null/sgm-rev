package i1;

import android.content.Context;
import androidx.work.l;
import j1.e;
import j1.f;
import j1.g;
import j1.h;
import java.util.ArrayList;
import java.util.List;
import m1.p;

/* JADX INFO: compiled from: WorkConstraintsTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements j1.c.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f15890d = l.f("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f15891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1.c<?>[] f15892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f15893c;

    public d(Context context, o1.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f15891a = cVar;
        this.f15892b = new j1.c[]{new j1.a(applicationContext, aVar), new j1.b(applicationContext, aVar), new h(applicationContext, aVar), new j1.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f15893c = new Object();
    }

    @Override // j1.c.a
    public void a(List<String> list) {
        synchronized (this.f15893c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    l.c().a(f15890d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f15891a;
            if (cVar != null) {
                cVar.f(arrayList);
            }
        }
    }

    @Override // j1.c.a
    public void b(List<String> list) {
        synchronized (this.f15893c) {
            c cVar = this.f15891a;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f15893c) {
            for (j1.c<?> cVar : this.f15892b) {
                if (cVar.d(str)) {
                    l.c().a(f15890d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f15893c) {
            for (j1.c<?> cVar : this.f15892b) {
                cVar.g(null);
            }
            for (j1.c<?> cVar2 : this.f15892b) {
                cVar2.e(iterable);
            }
            for (j1.c<?> cVar3 : this.f15892b) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f15893c) {
            for (j1.c<?> cVar : this.f15892b) {
                cVar.f();
            }
        }
    }
}
