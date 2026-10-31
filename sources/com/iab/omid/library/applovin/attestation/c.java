package com.iab.omid.library.applovin.attestation;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, k> f12515d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f12516e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f12517a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile List<b> f12519c;

    private c(Context context) {
        this.f12518b = context != null ? context.getApplicationContext() : null;
        c();
    }

    public static c a(Context context) {
        if (f12516e == null) {
            synchronized (c.class) {
                if (f12516e == null) {
                    f12516e = new c(context);
                }
            }
        }
        return f12516e;
    }

    private void c() {
        f12515d.put("FireTVFOSDAT", j.a(this.f12518b));
    }

    public boolean b() {
        return a().size() > 0;
    }

    public List<b> a() {
        b bVarA;
        if (this.f12519c != null) {
            return this.f12519c;
        }
        synchronized (this) {
            if (this.f12519c != null) {
                return this.f12519c;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, k> entry : f12515d.entrySet()) {
                    if (entry.getValue().a() && (bVarA = this.f12517a.a(entry.getKey(), this.f12518b)) != null) {
                        arrayList.add(bVarA);
                    }
                }
                this.f12519c = arrayList;
                return this.f12519c;
            } catch (Exception e10) {
                com.iab.omid.library.applovin.utils.d.a("Error getting supported attestation mechanisms", e10);
                this.f12519c = new ArrayList();
                return this.f12519c;
            }
        }
    }

    public boolean a(String str) {
        k kVar = f12515d.get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return false;
    }
}
