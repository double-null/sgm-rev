package q5;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, k> f24424d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f24425e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f24426a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile List<b> f24428c;

    private c(Context context) {
        this.f24427b = context != null ? context.getApplicationContext() : null;
        e();
    }

    public static c b(Context context) {
        if (f24425e == null) {
            synchronized (c.class) {
                if (f24425e == null) {
                    f24425e = new c(context);
                }
            }
        }
        return f24425e;
    }

    private void e() {
        f24424d.put("FireTVFOSDAT", j.a(this.f24427b));
    }

    public List<b> a() {
        b bVarA;
        if (this.f24428c != null) {
            return this.f24428c;
        }
        synchronized (this) {
            if (this.f24428c != null) {
                return this.f24428c;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, k> entry : f24424d.entrySet()) {
                    if (entry.getValue().a() && (bVarA = this.f24426a.a(entry.getKey(), this.f24427b)) != null) {
                        arrayList.add(bVarA);
                    }
                }
                this.f24428c = arrayList;
                return this.f24428c;
            } catch (Exception e10) {
                w5.d.b("Error getting supported attestation mechanisms", e10);
                this.f24428c = new ArrayList();
                return this.f24428c;
            }
        }
    }

    public boolean c(String str) {
        k kVar = f24424d.get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return false;
    }

    public boolean d() {
        return a().size() > 0;
    }
}
