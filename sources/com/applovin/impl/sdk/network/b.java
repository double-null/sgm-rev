package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f8603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f8605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8606e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f8607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f8608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f8609h;

    /* JADX INFO: loaded from: classes.dex */
    class a implements AppLovinPostbackListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f8610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f8611b;

        a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f8610a = dVar;
            this.f8611b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            p unused = b.this.f8603b;
            if (p.a()) {
                b.this.f8603b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f8610a + " with error code: " + i10 + "; will retry later...");
            }
            b.this.d(this.f8610a);
            v2.a(this.f8611b, str, i10);
            if (this.f8610a.c() == 1) {
                b.this.f8602a.E().a("dispatchPostback", str, i10, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f8610a);
            p unused = b.this.f8603b;
            if (p.a()) {
                b.this.f8603b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f8610a);
            }
            b.this.c();
            v2.a(this.f8611b, str);
        }
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f8602a.s0().a((k5) this.f8605d, f6.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f8606e) {
            while (this.f8607f.size() > this.f8604c) {
                this.f8607f.remove(0);
            }
            this.f8607f.add(dVar);
        }
        if (p.a()) {
            this.f8603b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f8606e) {
            Iterator it = new ArrayList(this.f8607f).iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
        }
    }

    protected List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f8606e) {
            if (((Boolean) this.f8602a.a(z4.P2)).booleanValue()) {
                arrayList.ensureCapacity(this.f8609h.size());
                arrayList.addAll(this.f8609h);
            } else {
                arrayList.ensureCapacity(this.f8607f.size());
                arrayList.addAll(this.f8607f);
            }
        }
        return arrayList;
    }

    public b(l lVar) {
        ArrayList arrayList = new ArrayList();
        this.f8607f = arrayList;
        this.f8608g = new HashSet();
        this.f8609h = new ArrayList();
        if (lVar != null) {
            this.f8602a = lVar;
            this.f8603b = lVar.Q();
            int iIntValue = ((Integer) lVar.a(z4.N2)).intValue();
            this.f8604c = iIntValue;
            if (((Boolean) lVar.a(z4.Q2)).booleanValue()) {
                c cVar = new c(this, lVar);
                this.f8605d = cVar;
                arrayList.addAll(cVar.a(iIntValue));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(EFLCCdIRcb.iNpgLBaar));
                return;
            }
            this.f8605d = null;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f8606e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(final d dVar, boolean z10, final AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (p.a()) {
                this.f8603b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                dVar.a();
            }
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8647a.b(dVar, appLovinPostbackListener);
                }
            }, q7.i(), dVar.m());
        }
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f8650a.e();
            }
        }, true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f8606e) {
            Iterator it = this.f8609h.iterator();
            while (it.hasNext()) {
                b((d) it.next());
            }
            this.f8609h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f8606e) {
            this.f8608g.remove(dVar);
            this.f8609h.add(dVar);
        }
    }

    public void a() {
        synchronized (this.f8606e) {
            this.f8607f.clear();
            this.f8609h.clear();
        }
        this.f8602a.s0().a((k5) this.f8605d, f6.b.OTHER);
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (p.a()) {
            this.f8603b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f8602a.G0() && !dVar.m()) {
            if (p.a()) {
                this.f8603b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (p.a()) {
                this.f8603b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f8606e) {
            if (this.f8608g.contains(dVar)) {
                if (p.a()) {
                    this.f8603b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                }
                return;
            }
            dVar.l();
            Integer num = (Integer) this.f8602a.a(z4.M2);
            if (dVar.c() > num.intValue()) {
                if (p.a()) {
                    this.f8603b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                }
                a(dVar);
                return;
            }
            synchronized (this.f8606e) {
                this.f8608g.add(dVar);
            }
            e eVarB = e.b(this.f8602a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
            if (p.a()) {
                this.f8603b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
            }
            this.f8602a.i0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f8606e) {
            this.f8608g.remove(dVar);
            this.f8607f.remove(dVar);
        }
        if (p.a()) {
            this.f8603b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.f8602a.s0().a((k5) new u6(this.f8602a, z11, "runPostbackTask", runnable), f6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
