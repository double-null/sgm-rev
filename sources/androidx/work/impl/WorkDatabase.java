package androidx.work.impl;

import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m1.e;
import m1.k;
import m1.n;
import m1.q;
import m1.t;
import x0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f3670l = TimeUnit.DAYS.toMillis(1);

    class a implements c.InterfaceC0464c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f3671a;

        a(Context context) {
            this.f3671a = context;
        }

        @Override // x0.c.InterfaceC0464c
        public c a(c.b bVar) {
            c.b.a aVarA = c.b.a(this.f3671a);
            aVarA.c(bVar.f27938b).b(bVar.f27939c).d(true);
            return new y0.c().a(aVarA.a());
        }
    }

    class b extends h.b {
        b() {
        }

        @Override // androidx.room.h.b
        public void c(x0.b bVar) {
            super.c(bVar);
            bVar.a();
            try {
                bVar.j(WorkDatabase.w());
                bVar.w();
            } finally {
                bVar.A();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z10) {
        h.a aVarA;
        if (z10) {
            aVarA = g.c(context, WorkDatabase.class).c();
        } else {
            aVarA = g.a(context, WorkDatabase.class, f1.h.d());
            aVarA.f(new a(context));
        }
        return (WorkDatabase) aVarA.g(executor).a(u()).b(androidx.work.impl.a.f3680a).b(new androidx.work.impl.a.h(context, 2, 3)).b(androidx.work.impl.a.f3681b).b(androidx.work.impl.a.f3682c).b(new androidx.work.impl.a.h(context, 5, 6)).b(androidx.work.impl.a.f3683d).b(androidx.work.impl.a.f3684e).b(androidx.work.impl.a.f3685f).b(new androidx.work.impl.a.i(context)).b(new androidx.work.impl.a.h(context, 10, 11)).b(androidx.work.impl.a.f3686g).e().d();
    }

    static h.b u() {
        return new b();
    }

    static long v() {
        return System.currentTimeMillis() - f3670l;
    }

    static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract m1.b t();

    public abstract e x();

    public abstract m1.h y();

    public abstract k z();
}
