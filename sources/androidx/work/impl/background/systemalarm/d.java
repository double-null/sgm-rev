package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.l;
import com.facebook.AuthenticationTokenClaims;
import java.util.Collections;
import java.util.List;
import m1.p;
import n1.m;
import n1.q;

/* JADX INFO: compiled from: DelayMetCommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements i1.c, f1.b, q.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f3709j = l.f("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f3713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i1.d f3714e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PowerManager.WakeLock f3717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3718i = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3716g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f3715f = new Object();

    d(Context context, int i10, String str, e eVar) {
        this.f3710a = context;
        this.f3711b = i10;
        this.f3713d = eVar;
        this.f3712c = str;
        this.f3714e = new i1.d(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.f3715f) {
            this.f3714e.e();
            this.f3713d.h().c(this.f3712c);
            PowerManager.WakeLock wakeLock = this.f3717h;
            if (wakeLock != null && wakeLock.isHeld()) {
                l.c().a(f3709j, String.format("Releasing wakelock %s for WorkSpec %s", this.f3717h, this.f3712c), new Throwable[0]);
                this.f3717h.release();
            }
        }
    }

    private void g() {
        synchronized (this.f3715f) {
            if (this.f3716g < 2) {
                this.f3716g = 2;
                l lVarC = l.c();
                String str = f3709j;
                lVarC.a(str, String.format("Stopping work for WorkSpec %s", this.f3712c), new Throwable[0]);
                Intent intentF = b.f(this.f3710a, this.f3712c);
                e eVar = this.f3713d;
                eVar.k(new e.b(eVar, intentF, this.f3711b));
                if (this.f3713d.d().g(this.f3712c)) {
                    l.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f3712c), new Throwable[0]);
                    Intent intentD = b.d(this.f3710a, this.f3712c);
                    e eVar2 = this.f3713d;
                    eVar2.k(new e.b(eVar2, intentD, this.f3711b));
                } else {
                    l.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f3712c), new Throwable[0]);
                }
            } else {
                l.c().a(f3709j, String.format("Already stopped work for %s", this.f3712c), new Throwable[0]);
            }
        }
    }

    @Override // n1.q.b
    public void a(String str) {
        l.c().a(f3709j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // i1.c
    public void b(List<String> list) {
        g();
    }

    void d() {
        this.f3717h = m.b(this.f3710a, String.format("%s (%s)", this.f3712c, Integer.valueOf(this.f3711b)));
        l lVarC = l.c();
        String str = f3709j;
        lVarC.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f3717h, this.f3712c), new Throwable[0]);
        this.f3717h.acquire();
        p pVarG = this.f3713d.g().o().B().g(this.f3712c);
        if (pVarG == null) {
            g();
            return;
        }
        boolean zB = pVarG.b();
        this.f3718i = zB;
        if (zB) {
            this.f3714e.d(Collections.singletonList(pVarG));
        } else {
            l.c().a(str, String.format("No constraints for %s", this.f3712c), new Throwable[0]);
            f(Collections.singletonList(this.f3712c));
        }
    }

    @Override // f1.b
    public void e(String str, boolean z10) {
        l.c().a(f3709j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        c();
        if (z10) {
            Intent intentD = b.d(this.f3710a, this.f3712c);
            e eVar = this.f3713d;
            eVar.k(new e.b(eVar, intentD, this.f3711b));
        }
        if (this.f3718i) {
            Intent intentA = b.a(this.f3710a);
            e eVar2 = this.f3713d;
            eVar2.k(new e.b(eVar2, intentA, this.f3711b));
        }
    }

    @Override // i1.c
    public void f(List<String> list) {
        if (list.contains(this.f3712c)) {
            synchronized (this.f3715f) {
                if (this.f3716g == 0) {
                    this.f3716g = 1;
                    l.c().a(f3709j, String.format("onAllConstraintsMet for %s", this.f3712c), new Throwable[0]);
                    if (this.f3713d.d().j(this.f3712c)) {
                        this.f3713d.h().b(this.f3712c, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, this);
                    } else {
                        c();
                    }
                } else {
                    l.c().a(f3709j, String.format("Already started work for %s", this.f3712c), new Throwable[0]);
                }
            }
        }
    }
}
