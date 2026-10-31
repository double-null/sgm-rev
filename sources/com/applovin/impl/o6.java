package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class o6 extends k5 implements r0.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f7763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r0.e f7764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f6.b f7765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private z4 f7766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private z4 f7767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f7768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected r0.b f7769m;

    public o6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
        this(aVar, lVar, false);
    }

    public abstract void a(String str, int i10, String str2, Object obj);

    public abstract void a(String str, Object obj, int i10);

    @Override // java.lang.Runnable
    public void run() {
        r0 r0VarX = b().x();
        if (!b().G0() && !b().D0()) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f7763g.f(), -22, null, null);
            return;
        }
        e();
        if (!StringUtils.isValidString(this.f7763g.f()) || this.f7763g.f().length() < 4) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Task has an invalid or null request endpoint.");
            }
            a(this.f7763g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.f7763g.h())) {
                this.f7763g.c(this.f7763g.b() != null ? "POST" : "GET");
            }
            r0VarX.a(this.f7763g, this.f7769m, this.f7764h);
        }
    }

    public o6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z10) {
        super("TaskRepeatRequest", lVar, z10);
        this.f7765i = f6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.f7763g = aVar;
        this.f7769m = new r0.b();
        this.f7764h = new a(lVar);
    }

    private void e() {
        if (((Boolean) this.f6990a.a(z4.f9405z3)).booleanValue() && b().x().a(StringUtils.getHostAndPath(this.f7763g.f()))) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.d(this.f6991b, "Swapping primary endpoint with backup endpoint " + this.f7763g.a());
            }
            String strF = this.f7763g.f();
            com.applovin.impl.sdk.network.a aVar = this.f7763g;
            aVar.b(aVar.a());
            this.f7763g.a(strF);
        }
    }

    public void b(z4 z4Var) {
        this.f7767k = z4Var;
    }

    public void c(z4 z4Var) {
        this.f7766j = z4Var;
    }

    class a implements r0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f7770a;

        a(com.applovin.impl.sdk.l lVar) {
            this.f7770a = lVar;
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, Object obj, int i10) {
            o6.this.b().x().b(o6.this.f7768l);
            o6.this.f7763g.a(0);
            o6.this.a(str, obj, i10);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, Object obj) {
            long millis;
            boolean z10 = false;
            boolean z11 = i10 < 200 || i10 >= 500;
            boolean z12 = i10 == 429;
            boolean z13 = i10 != -1009 || o6.this.f7763g.q();
            boolean z14 = (i10 == -900 || i10 == -1000) ? false : true;
            if (z13 && z14 && (z11 || z12 || o6.this.f7763g.p())) {
                String strA = o6.this.f7763g.a();
                if (o6.this.f7763g.j() <= 0) {
                    if (strA != null && strA.equals(o6.this.f7763g.f())) {
                        o6 o6Var = o6.this;
                        o6Var.a(o6Var.f7767k);
                    } else {
                        o6 o6Var2 = o6.this;
                        o6Var2.a(o6Var2.f7766j);
                    }
                    o6 o6Var3 = o6.this;
                    o6Var3.a(o6Var3.f7763g.f(), i10, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.p pVar = o6.this.f6992c;
                if (com.applovin.impl.sdk.p.a()) {
                    o6 o6Var4 = o6.this;
                    o6Var4.f6992c.k(o6Var4.f6991b, "Unable to send request due to server failure (code " + i10 + "). " + o6.this.f7763g.j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(o6.this.f7763g.k()) + " seconds...");
                }
                int iJ = o6.this.f7763g.j() - 1;
                o6.this.f7763g.a(iJ);
                if (iJ == 0) {
                    o6 o6Var5 = o6.this;
                    o6Var5.a(o6Var5.f7766j);
                    if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                        com.applovin.impl.sdk.p pVar2 = o6.this.f6992c;
                        if (com.applovin.impl.sdk.p.a()) {
                            o6 o6Var6 = o6.this;
                            o6Var6.f6992c.d(o6Var6.f6991b, "Switching to backup endpoint " + strA);
                        }
                        o6 o6Var7 = o6.this;
                        o6Var7.f7768l = o6Var7.f7763g.f();
                        o6.this.f7763g.b(strA);
                        z10 = true;
                    }
                }
                if (((Boolean) this.f7770a.a(z4.f9281l3)).booleanValue() && z10) {
                    millis = 0;
                } else {
                    millis = o6.this.f7763g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, o6.this.f7763g.c())) : o6.this.f7763g.k();
                }
                f6 f6VarS0 = this.f7770a.s0();
                o6 o6Var8 = o6.this;
                f6VarS0.a(o6Var8, o6Var8.f7765i, millis);
                return;
            }
            o6 o6Var9 = o6.this;
            o6Var9.a(o6Var9.f7763g.f(), i10, str2, obj);
        }
    }

    public void a(f6.b bVar) {
        this.f7765i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(z4 z4Var) {
        if (z4Var != null) {
            b().q0().a(z4Var, z4Var.a());
        }
    }
}
