package c5;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, k> f4737d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f4738e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f4739a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile List<b> f4741c;

    private c(Context context) {
        this.f4740b = context != null ? context.getApplicationContext() : null;
        e();
    }

    public static c a(Context context) {
        if (f4738e == null) {
            synchronized (c.class) {
                if (f4738e == null) {
                    f4738e = new c(context);
                }
            }
        }
        return f4738e;
    }

    private void e() {
        f4737d.put("FireTVFOSDAT", j.a(this.f4740b));
    }

    public List<b> b() {
        b bVarA;
        if (this.f4741c != null) {
            return this.f4741c;
        }
        synchronized (this) {
            if (this.f4741c != null) {
                return this.f4741c;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, k> entry : f4737d.entrySet()) {
                    if (entry.getValue().a() && (bVarA = this.f4739a.a(entry.getKey(), this.f4740b)) != null) {
                        arrayList.add(bVarA);
                    }
                }
                this.f4741c = arrayList;
                return this.f4741c;
            } catch (Exception e10) {
                i5.d.b("Error getting supported attestation mechanisms", e10);
                this.f4741c = new ArrayList();
                return this.f4741c;
            }
        }
    }

    public boolean c(String str) {
        k kVar = f4737d.get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return false;
    }

    public boolean d() {
        return b().size() > 0;
    }
}
