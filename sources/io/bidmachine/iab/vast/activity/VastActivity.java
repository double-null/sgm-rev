package io.bidmachine.iab.vast.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pairip.VMRunner;
import g7.y;
import h7.e;
import h7.f;
import h7.g;
import h7.i;
import h7.m;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import wb.a0;

/* JADX INFO: loaded from: classes4.dex */
public class VastActivity extends pa.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final Map f17856h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Map f17857i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static WeakReference f17858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static WeakReference f17859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static WeakReference f17860l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f17862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i7.a f17863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h7.b f17864d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17867g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f17861a = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17865e = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f17868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h7.b f17869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i7.a f17870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f17871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e7.c f17872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private e7.b f17873f;

        Intent a(Context context) {
            Intent intent = new Intent(context, (Class<?>) VastActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        }

        public c7.b b(Context context) {
            g gVar = this.f17868a;
            if (gVar == null) {
                e.b("VastActivity", "VastRequest is null", new Object[0]);
                return c7.b.f("VastRequest is null");
            }
            try {
                i.b(gVar);
                Intent intentA = a(context);
                intentA.putExtra("vast_request_id", this.f17868a.H());
                h7.b bVar = this.f17869b;
                if (bVar != null) {
                    VastActivity.s(this.f17868a, bVar);
                }
                i7.a aVar = this.f17870c;
                if (aVar != null) {
                    VastActivity.t(this.f17868a, aVar);
                }
                if (this.f17871d != null) {
                    WeakReference unused = VastActivity.f17858j = new WeakReference(this.f17871d);
                } else {
                    WeakReference unused2 = VastActivity.f17858j = null;
                }
                if (this.f17872e != null) {
                    WeakReference unused3 = VastActivity.f17859k = new WeakReference(this.f17872e);
                } else {
                    WeakReference unused4 = VastActivity.f17859k = null;
                }
                if (this.f17873f != null) {
                    WeakReference unused5 = VastActivity.f17860l = new WeakReference(this.f17873f);
                } else {
                    WeakReference unused6 = VastActivity.f17860l = null;
                }
                context.startActivity(intentA);
                return null;
            } catch (Throwable th) {
                e.c("VastActivity", th);
                VastActivity.y(this.f17868a);
                VastActivity.z(this.f17868a);
                WeakReference unused7 = VastActivity.f17858j = null;
                WeakReference unused8 = VastActivity.f17859k = null;
                WeakReference unused9 = VastActivity.f17860l = null;
                return c7.b.j("Exception during displaying VastActivity", th);
            }
        }

        public a c(e7.c cVar) {
            this.f17872e = cVar;
            return this;
        }

        public a d(h7.b bVar) {
            this.f17869b = bVar;
            return this;
        }

        public a e(f fVar) {
            this.f17871d = fVar;
            return this;
        }

        public a f(e7.b bVar) {
            this.f17873f = bVar;
            return this;
        }

        public a g(g gVar) {
            this.f17868a = gVar;
            return this;
        }

        public a h(i7.a aVar) {
            this.f17870c = aVar;
            return this;
        }
    }

    private class c implements m {
        private c() {
        }

        @Override // h7.m
        public void a(i7.a aVar, g gVar, int i10) {
            int iF = gVar.F();
            if (iF > -1) {
                i10 = iF;
            }
            VastActivity.this.g(i10);
        }

        @Override // h7.m
        public void b(i7.a aVar, g gVar) {
            if (VastActivity.this.f17864d != null) {
                VastActivity.this.f17864d.d(VastActivity.this, gVar);
            }
        }

        @Override // h7.m
        public void c(i7.a aVar, g gVar) {
            if (VastActivity.this.f17864d != null) {
                VastActivity.this.f17864d.b(VastActivity.this, gVar);
            }
        }

        @Override // h7.m
        public void d(i7.a aVar, g gVar, c7.b bVar) {
            VastActivity.this.i(gVar, bVar);
        }

        @Override // h7.m
        public void e(i7.a aVar, g gVar, boolean z10) {
            VastActivity.this.l(gVar, z10);
        }

        @Override // h7.m
        public void f(i7.a aVar, g gVar, g7.i iVar, String str) {
            if (VastActivity.this.f17864d != null) {
                VastActivity.this.f17864d.c(VastActivity.this, gVar, iVar, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        int i11;
        if (i10 == 1) {
            i11 = 7;
        } else {
            i11 = i10 == 2 ? 6 : 4;
        }
        setRequestedOrientation(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(g gVar, c7.b bVar) {
        h7.b bVar2 = this.f17864d;
        if (bVar2 != null) {
            bVar2.a(gVar, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(g gVar, boolean z10) {
        h7.b bVar = this.f17864d;
        if (bVar != null && !this.f17867g) {
            bVar.e(this, gVar, z10);
        }
        this.f17867g = true;
        try {
            getWindow().clearFlags(128);
        } catch (Exception e10) {
            e.b("VastActivity", e10.getMessage(), new Object[0]);
        }
        if (gVar != null) {
            g(gVar.L());
        }
        a0.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(i7.a aVar) {
        a0.d(this);
        y.u(aVar);
        setContentView(aVar);
        a0.a(this);
        y.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(g gVar, h7.b bVar) {
        f17856h.put(gVar.H(), new WeakReference(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(g gVar, i7.a aVar) {
        f17857i.put(gVar.H(), new WeakReference(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer u(g gVar) {
        int iF = gVar.F();
        if (iF > -1) {
            return Integer.valueOf(iF);
        }
        int iK = gVar.K();
        if (iK == 0 || iK == getResources().getConfiguration().orientation) {
            return null;
        }
        return Integer.valueOf(iK);
    }

    private static h7.b w(g gVar) {
        WeakReference weakReference = (WeakReference) f17856h.get(gVar.H());
        if (weakReference != null && weakReference.get() != null) {
            return (h7.b) weakReference.get();
        }
        y(gVar);
        return null;
    }

    private static i7.a x(g gVar) {
        WeakReference weakReference = (WeakReference) f17857i.get(gVar.H());
        if (weakReference != null && weakReference.get() != null) {
            return (i7.a) weakReference.get();
        }
        z(gVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(g gVar) {
        f17856h.remove(gVar.H());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(g gVar) {
        f17857i.remove(gVar.H());
    }

    @Override // pa.b
    protected void b() {
        i7.a aVar = this.f17863c;
        if (aVar != null) {
            aVar.v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pa.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        VMRunner.invoke("3YmhLYIE8NHdrs0O", new Object[]{this, bundle});
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        VMRunner.invoke("7XGsuYCpTIgNKQtG", new Object[]{this});
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isLoadPerformed", this.f17866f);
        bundle.putBoolean("isFinishedPerformed", this.f17867g);
    }
}
