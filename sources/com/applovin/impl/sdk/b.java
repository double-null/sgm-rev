package com.applovin.impl.sdk;

import com.applovin.impl.j7;
import com.applovin.impl.z4;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f8335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f8336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j7 f8337d;

    private b(com.applovin.impl.u1 u1Var, a.InterfaceC0117a interfaceC0117a, l lVar) {
        this.f8335b = new WeakReference(u1Var);
        this.f8336c = new WeakReference(interfaceC0117a);
        this.f8334a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f8334a.f().a(this);
    }

    public com.applovin.impl.u1 b() {
        return (com.applovin.impl.u1) this.f8335b.get();
    }

    public void d() {
        a();
        com.applovin.impl.u1 u1VarB = b();
        if (u1VarB == null) {
            return;
        }
        u1VarB.setExpired();
        a.InterfaceC0117a interfaceC0117a = (a.InterfaceC0117a) this.f8336c.get();
        if (interfaceC0117a == null) {
            return;
        }
        interfaceC0117a.onAdExpired(u1VarB);
    }

    public static b a(com.applovin.impl.u1 u1Var, a.InterfaceC0117a interfaceC0117a, l lVar) {
        b bVar = new b(u1Var, interfaceC0117a, lVar);
        bVar.a(u1Var.getTimeToLiveMillis());
        return bVar;
    }

    public void a(long j10) {
        a();
        if (((Boolean) this.f8334a.a(z4.f9225f1)).booleanValue() || !this.f8334a.o0().isApplicationPaused()) {
            this.f8337d = j7.a(j10, this.f8334a, new Runnable() { // from class: com.applovin.impl.sdk.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8272a.c();
                }
            });
        }
    }

    public void a() {
        j7 j7Var = this.f8337d;
        if (j7Var != null) {
            j7Var.a();
            this.f8337d = null;
        }
    }
}
