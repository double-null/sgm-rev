package b4;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ProcessDataManager.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wc.k f3880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wc.k f3882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wc.k f3883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3884f;

    public b0(Context appContext, final a1 uuidGenerator) {
        kotlin.jvm.internal.t.f(appContext, "appContext");
        kotlin.jvm.internal.t.f(uuidGenerator, "uuidGenerator");
        this.f3879a = appContext;
        this.f3880b = wc.m.a(new id.a() { // from class: b4.y
            @Override // id.a
            public final Object invoke() {
                return b0.p(this.f4088a);
            }
        });
        this.f3881c = Process.myPid();
        this.f3882d = wc.m.a(new id.a() { // from class: b4.z
            @Override // id.a
            public final Object invoke() {
                return b0.q(uuidGenerator);
            }
        });
        this.f3883e = wc.m.a(new id.a() { // from class: b4.a0
            @Override // id.a
            public final Object invoke() {
                return b0.o(this.f3872a);
            }
        });
    }

    private final List<d0> j() {
        return e0.f3940a.a(this.f3879a);
    }

    private final d0 l() {
        return (d0) this.f3883e.getValue();
    }

    private final boolean n(d0 d0Var, w wVar) {
        if (kotlin.jvm.internal.t.a(a(), d0Var.c())) {
            if (d0Var.b() != wVar.a() || !kotlin.jvm.internal.t.a(m(), wVar.b())) {
                return true;
            }
        } else if (d0Var.b() != wVar.a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 o(b0 b0Var) {
        return e0.f3940a.b(b0Var.f3879a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(b0 b0Var) {
        return b0Var.l().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(a1 a1Var) {
        String string = a1Var.next().toString();
        kotlin.jvm.internal.t.e(string, "toString(...)");
        return string;
    }

    @Override // b4.x
    public String a() {
        return (String) this.f3880b.getValue();
    }

    @Override // b4.x
    public boolean b(Map<String, w> processDataMap) {
        kotlin.jvm.internal.t.f(processDataMap, "processDataMap");
        w wVar = processDataMap.get(a());
        return (wVar != null && wVar.a() == k() && kotlin.jvm.internal.t.a(wVar.b(), m())) ? false : true;
    }

    @Override // b4.x
    public Map<String, w> c(Map<String, w> map) {
        Map mapU;
        if (map != null && (mapU = kotlin.collections.o0.u(map)) != null) {
            mapU.put(a(), new w(Process.myPid(), m()));
            Map<String, w> mapS = kotlin.collections.o0.s(mapU);
            if (mapS != null) {
                return mapS;
            }
        }
        return kotlin.collections.n0.f(wc.w.a(a(), new w(Process.myPid(), m())));
    }

    @Override // b4.x
    public void d() {
        this.f3884f = true;
    }

    @Override // b4.x
    public boolean e(Map<String, w> processDataMap) {
        kotlin.jvm.internal.t.f(processDataMap, "processDataMap");
        if (this.f3884f) {
            return false;
        }
        List<d0> listJ = j();
        ArrayList<wc.q> arrayList = new ArrayList();
        for (d0 d0Var : listJ) {
            w wVar = processDataMap.get(d0Var.c());
            wc.q qVar = wVar != null ? new wc.q(d0Var, wVar) : null;
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        if (!arrayList.isEmpty()) {
            for (wc.q qVar2 : arrayList) {
                if (!n((d0) qVar2.b(), (w) qVar2.c())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // b4.x
    public Map<String, w> f() {
        return x.a.a(this);
    }

    public int k() {
        return this.f3881c;
    }

    public String m() {
        return (String) this.f3882d.getValue();
    }
}
