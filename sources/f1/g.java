package f1;

import android.text.TextUtils;
import androidx.work.l;
import androidx.work.o;
import androidx.work.t;
import androidx.work.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: WorkContinuationImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f14552j = l.f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f14553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.f f14555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<? extends w> f14556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f14557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f14558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<g> f14559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o f14561i;

    public g(i iVar, List<? extends w> list) {
        this(iVar, null, androidx.work.f.KEEP, list, null);
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> setL = l(gVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains(it.next())) {
                return true;
            }
        }
        List<g> listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator<g> it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator<g> it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().c());
            }
        }
        return hashSet;
    }

    public o a() {
        if (this.f14560h) {
            l.c().h(f14552j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f14557e)), new Throwable[0]);
        } else {
            n1.b bVar = new n1.b(this);
            this.f14553a.p().b(bVar);
            this.f14561i = bVar.e();
        }
        return this.f14561i;
    }

    public androidx.work.f b() {
        return this.f14555c;
    }

    public List<String> c() {
        return this.f14557e;
    }

    public String d() {
        return this.f14554b;
    }

    public List<g> e() {
        return this.f14559g;
    }

    public List<? extends w> f() {
        return this.f14556d;
    }

    public i g() {
        return this.f14553a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f14560h;
    }

    public void k() {
        this.f14560h = true;
    }

    public g(i iVar, String str, androidx.work.f fVar, List<? extends w> list, List<g> list2) {
        this.f14553a = iVar;
        this.f14554b = str;
        this.f14555c = fVar;
        this.f14556d = list;
        this.f14559g = list2;
        this.f14557e = new ArrayList(list.size());
        this.f14558f = new ArrayList();
        if (list2 != null) {
            Iterator<g> it = list2.iterator();
            while (it.hasNext()) {
                this.f14558f.addAll(it.next().f14558f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strA = list.get(i10).a();
            this.f14557e.add(strA);
            this.f14558f.add(strA);
        }
    }
}
