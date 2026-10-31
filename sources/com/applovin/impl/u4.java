package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f8876i = new Executor() { // from class: com.applovin.impl.qe
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Executor f8877j = new androidx.privacysandbox.ads.adservices.measurement.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8879b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Object f8884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Object f8885h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8878a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8880c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f8881d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f8882e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f8883f = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z10, Object obj, Object obj2);
    }

    public u4(String str) {
        this.f8879b = str;
    }

    public boolean e() {
        return this.f8881d && !this.f8882e;
    }

    public String toString() {
        String str;
        if (!this.f8881d) {
            str = "Waiting";
        } else if (this.f8882e) {
            str = "Success -> " + this.f8884g;
        } else {
            str = "Failed -> " + this.f8885h;
        }
        return "Promise(" + c() + ": " + str + ")";
    }

    public static u4 a(String str, Object obj) {
        return new u4(str).b(obj);
    }

    public u4 b(Object obj) {
        a(true, obj, (Object) null, false);
        return this;
    }

    public u4 c(Object obj) {
        a(false, (Object) null, obj, true);
        return this;
    }

    public boolean d() {
        return this.f8881d;
    }

    public u4 a(Object obj) {
        a(false, (Object) null, obj, false);
        return this;
    }

    public Object b() {
        m1.a(e());
        return this.f8885h;
    }

    public String c() {
        String str = this.f8879b;
        return str != null ? str : super.toString();
    }

    private Runnable c(final Executor executor, final b bVar) {
        return new Runnable() { // from class: com.applovin.impl.pe
            @Override // java.lang.Runnable
            public final void run() {
                this.f7863a.b(executor, bVar);
            }
        };
    }

    public void a(Executor executor, final Runnable runnable) {
        a(executor, new b() { // from class: com.applovin.impl.re
            @Override // com.applovin.impl.u4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                u4.a(runnable, z10, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z10, Object obj, Object obj2) {
        if (z10) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, final b bVar) {
        try {
            executor.execute(new Runnable() { // from class: com.applovin.impl.oe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7785a.a(bVar);
                }
            });
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Executor executor, final a aVar) {
        a(executor, new b() { // from class: com.applovin.impl.se
            @Override // com.applovin.impl.u4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                u4.a(aVar, z10, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z10, Object obj, Object obj2) {
        if (z10) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable runnableC = c(executor, bVar);
        synchronized (this.f8878a) {
            if (!this.f8881d) {
                this.f8880c.add(runnableC);
            } else {
                runnableC.run();
            }
        }
    }

    public boolean a() {
        return this.f8881d && this.f8883f;
    }

    private void a(boolean z10, Object obj, Object obj2, boolean z11) {
        synchronized (this.f8878a) {
            if (this.f8881d) {
                return;
            }
            this.f8884g = obj;
            this.f8885h = obj2;
            this.f8882e = z10;
            this.f8883f = z11;
            this.f8881d = true;
            Iterator it = this.f8880c.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f8880c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f8882e, this.f8884g, this.f8885h);
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        m1.a(th);
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null) {
            lVar.E().a("Promise", "PromiseCallback: " + c(), th);
        }
    }
}
