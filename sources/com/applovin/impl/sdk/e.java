package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.b5;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import pb.vBC.NyXuoef;

/* JADX INFO: loaded from: classes2.dex */
public class e implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f8362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8363c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: loaded from: classes.dex */
    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    public e(l lVar) {
        this.f8361a = lVar;
        this.f8362b = new d(lVar);
    }

    private void e() {
        String str = (String) this.f8361a.r0().a(b5.E);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            try {
                d.a aVarA = d.a.a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f8361a);
                if (aVarA != null) {
                    if (a(aVarA)) {
                        long jC = aVarA.c() - SystemClock.elapsedRealtime();
                        this.f8361a.g().d(f2.f6469a0, CollectionUtils.map("details", "ttl = " + jC + "ms"));
                    } else {
                        this.f8363c.add(0, aVarA);
                    }
                }
            } catch (Throwable th) {
                this.f8361a.Q();
                if (p.a()) {
                    this.f8361a.Q().a("AdPersistenceManager", "Failed to deserialize persisted ad file path", th);
                }
                this.f8361a.E().a("AdPersistenceManager", "deserializePersistedAdFilePath", th);
            }
        }
    }

    private void f() {
        this.f8361a.s0().a((k5) new u6(this.f8361a, "loadPersistedAdFilesQueueAndCleanupAsync", new Runnable() { // from class: com.applovin.impl.sdk.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8381a.c();
            }
        }), f6.b.OTHER);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f8363c) {
            Iterator it = this.f8363c.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((d.a) it.next()).a());
                } catch (Throwable th) {
                    this.f8361a.Q();
                    if (p.a()) {
                        this.f8361a.Q().a("AdPersistenceManager", "Failed to serialize persisted ad file path", th);
                    }
                    this.f8361a.E().a("AdPersistenceManager", "serializePersistedAdFilePath", th);
                }
            }
        }
        this.f8361a.r0().b(b5.E, new JSONArray((Collection) arrayList).toString());
    }

    public void g() {
        this.f8361a.s0().a((k5) new u6(this.f8361a, "resetManagerState", new Runnable() { // from class: com.applovin.impl.sdk.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8360a.d();
            }
        }), f6.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(d.a aVar) {
        if (aVar == null) {
            this.f8361a.Q();
            if (p.a()) {
                this.f8361a.Q().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f8363c.add(aVar);
        if (((Boolean) this.f8361a.a(z4.f9198c1)).booleanValue()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f8361a.r0().b(b5.E);
        this.f8362b.a();
    }

    public void a(final com.applovin.impl.u uVar, final a aVar) {
        if (aVar == null) {
            this.f8361a.Q();
            if (p.a()) {
                this.f8361a.Q().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            com.applovin.impl.m1.a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (uVar == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f8361a.g().a(f2.X, uVar, (AppLovinError) null);
        final d.a aVarA = a(uVar.g());
        this.f8362b.a(aVarA, new d.c() { // from class: com.applovin.impl.sdk.e0
            @Override // com.applovin.impl.sdk.d.c
            public final void a(com.applovin.impl.sdk.ad.b bVar, String str) {
                this.f8364a.a(aVar, aVarA, uVar, bVar, str);
            }
        });
    }

    public void b() {
        f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    private void d(d.a aVar) {
        if (aVar != null && this.f8363c.remove(aVar)) {
            this.f8362b.b(aVar);
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f8361a.g().a(f2.U, bVar);
        this.f8362b.b(bVar, new d.b() { // from class: com.applovin.impl.sdk.f0
            @Override // com.applovin.impl.sdk.d.b
            public final void a(d.a aVar) {
                this.f8373a.c(aVar);
            }
        });
    }

    private boolean b(d.a aVar) {
        long jB = aVar.b();
        return (jB == 0 || jB == l.o()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, d.a aVar2, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar, String str) {
        if (bVar != null && !StringUtils.isValidString(str)) {
            a(aVar, bVar, aVar2);
        } else {
            a(aVar, aVar2, uVar, str);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        d(d.a.a(bVar));
    }

    private d.a a(AppLovinAdType appLovinAdType) {
        d.a aVar;
        synchronized (this.f8363c) {
            Iterator it = this.f8363c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = (d.a) it.next();
                if (aVar.f().equals(appLovinAdType) && !a(aVar) && b(aVar)) {
                    break;
                }
            }
            this.f8363c.remove(aVar);
        }
        return aVar;
    }

    private void a(a aVar, d.a aVar2, com.applovin.impl.u uVar, String str) {
        if (aVar == null) {
            return;
        }
        this.f8361a.Q();
        if (p.a()) {
            this.f8361a.Q().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.f8362b.b(aVar2);
        this.f8361a.g().a(f2.Z, uVar, new AppLovinError(-1, str));
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, d.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f8361a.Q();
        if (p.a()) {
            this.f8361a.Q().a(NyXuoef.qRw, "Loading persisted ad");
        }
        aVar.a(bVar);
        this.f8362b.b(aVar2);
        this.f8361a.g().a(f2.Y, bVar);
    }

    private boolean a(d.a aVar) {
        return SystemClock.elapsedRealtime() + ((Long) this.f8361a.a(z4.f9216e1)).longValue() >= aVar.c();
    }

    private void a() {
        synchronized (this.f8363c) {
            this.f8362b.a(new ArrayList(this.f8363c));
        }
    }
}
