package io.bidmachine.media3.exoplayer.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c8.b2;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.facebook.ads.AdError;
import com.google.common.collect.c1;
import com.google.common.collect.u;
import com.google.common.collect.w;
import com.google.common.collect.w0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import u7.q;
import x7.l0;
import x7.r;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultDrmSessionManager implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f18516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m.c f18517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f18518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f18519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f18521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f18522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f f18523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f18524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f18525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f18526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<DefaultDrmSession> f18527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<e> f18528n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<DefaultDrmSession> f18529o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private m f18531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DefaultDrmSession f18532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private DefaultDrmSession f18533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Looper f18534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f18535u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f18537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private b2 f18538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    volatile d f18539y;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18543d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f18540a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f18541b = u7.f.f26062d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m.c f18542c = n.f18589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f18544e = new int[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18545f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.upstream.b f18546g = new io.bidmachine.media3.exoplayer.upstream.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f18547h = 300000;

        public DefaultDrmSessionManager a(p pVar) {
            return new DefaultDrmSessionManager(this.f18541b, this.f18542c, pVar, this.f18540a, this.f18543d, this.f18544e, this.f18545f, this.f18546g, this.f18547h);
        }

        public b b(io.bidmachine.media3.exoplayer.upstream.b bVar) {
            this.f18546g = (io.bidmachine.media3.exoplayer.upstream.b) x7.a.e(bVar);
            return this;
        }

        public b c(boolean z10) {
            this.f18543d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f18545f = z10;
            return this;
        }

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                x7.a.a(z10);
            }
            this.f18544e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, m.c cVar) {
            this.f18541b = (UUID) x7.a.e(uuid);
            this.f18542c = (m.c) x7.a.e(cVar);
            return this;
        }
    }

    private class c implements m.b {
        private c() {
        }

        @Override // io.bidmachine.media3.exoplayer.drm.m.b
        public void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) x7.a.e(DefaultDrmSessionManager.this.f18539y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f18527m) {
                if (defaultDrmSession.u(bArr)) {
                    defaultDrmSession.C(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements i.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h.a f18550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DrmSession f18551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18552d;

        public e(h.a aVar) {
            this.f18550b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(q qVar) {
            if (DefaultDrmSessionManager.this.f18530p == 0 || this.f18552d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            this.f18551c = defaultDrmSessionManager.t((Looper) x7.a.e(defaultDrmSessionManager.f18534t), this.f18550b, qVar, false);
            DefaultDrmSessionManager.this.f18528n.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g() {
            if (this.f18552d) {
                return;
            }
            DrmSession drmSession = this.f18551c;
            if (drmSession != null) {
                drmSession.f(this.f18550b);
            }
            DefaultDrmSessionManager.this.f18528n.remove(this);
            this.f18552d = true;
        }

        public void e(final q qVar) {
            ((Handler) x7.a.e(DefaultDrmSessionManager.this.f18535u)).post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18567a.f(qVar);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.drm.i.b
        public void release() {
            l0.c1((Handler) x7.a.e(DefaultDrmSessionManager.this.f18535u), new Runnable() { // from class: io.bidmachine.media3.exoplayer.drm.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18566a.g();
                }
            });
        }
    }

    private class f implements DefaultDrmSession.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<DefaultDrmSession> f18554a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private DefaultDrmSession f18555b;

        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.bidmachine.media3.exoplayer.drm.DefaultDrmSession.a
        public void a(Exception exc, boolean z10) {
            this.f18555b = null;
            u uVarB = u.B(this.f18554a);
            this.f18554a.clear();
            c1 it = uVarB.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).E(exc, z10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.bidmachine.media3.exoplayer.drm.DefaultDrmSession.a
        public void b() {
            this.f18555b = null;
            u uVarB = u.B(this.f18554a);
            this.f18554a.clear();
            c1 it = uVarB.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).D();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DefaultDrmSession.a
        public void c(DefaultDrmSession defaultDrmSession) {
            this.f18554a.add(defaultDrmSession);
            if (this.f18555b != null) {
                return;
            }
            this.f18555b = defaultDrmSession;
            defaultDrmSession.I();
        }

        public void d(DefaultDrmSession defaultDrmSession) {
            this.f18554a.remove(defaultDrmSession);
            if (this.f18555b == defaultDrmSession) {
                this.f18555b = null;
                if (this.f18554a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.f18554a.iterator().next();
                this.f18555b = next;
                next.I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class g implements DefaultDrmSession.b {
        private g() {
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DefaultDrmSession.b
        public void a(DefaultDrmSession defaultDrmSession, int i10) {
            if (DefaultDrmSessionManager.this.f18526l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f18529o.remove(defaultDrmSession);
                ((Handler) x7.a.e(DefaultDrmSessionManager.this.f18535u)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DefaultDrmSession.b
        public void b(final DefaultDrmSession defaultDrmSession, int i10) {
            if (i10 == 1 && DefaultDrmSessionManager.this.f18530p > 0 && DefaultDrmSessionManager.this.f18526l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f18529o.add(defaultDrmSession);
                ((Handler) x7.a.e(DefaultDrmSessionManager.this.f18535u)).postAtTime(new Runnable() { // from class: io.bidmachine.media3.exoplayer.drm.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.f(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f18526l);
            } else if (i10 == 0) {
                DefaultDrmSessionManager.this.f18527m.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f18532r == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f18532r = null;
                }
                if (DefaultDrmSessionManager.this.f18533s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f18533s = null;
                }
                DefaultDrmSessionManager.this.f18523i.d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f18526l != -9223372036854775807L) {
                    ((Handler) x7.a.e(DefaultDrmSessionManager.this.f18535u)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f18529o.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.C();
        }
    }

    private DrmSession A(int i10, boolean z10) {
        m mVar = (m) x7.a.e(this.f18531q);
        if ((mVar.f() == 2 && g8.l.f15528d) || l0.O0(this.f18521g, i10) == -1 || mVar.f() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f18532r;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionX = x(u.H(), true, null, z10);
            this.f18527m.add(defaultDrmSessionX);
            this.f18532r = defaultDrmSessionX;
        } else {
            defaultDrmSession.g(null);
        }
        return this.f18532r;
    }

    private void B(Looper looper) {
        if (this.f18539y == null) {
            this.f18539y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f18531q != null && this.f18530p == 0 && this.f18527m.isEmpty() && this.f18528n.isEmpty()) {
            ((m) x7.a.e(this.f18531q)).release();
            this.f18531q = null;
        }
    }

    private void D() {
        c1 it = w.x(this.f18529o).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).f(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E() {
        c1 it = w.x(this.f18528n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    private void G(DrmSession drmSession, h.a aVar) {
        drmSession.f(aVar);
        if (this.f18526l != -9223372036854775807L) {
            drmSession.f(null);
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f18534t == null) {
            r.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) x7.a.e(this.f18534t)).getThread()) {
            r.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f18534t.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public DrmSession t(Looper looper, h.a aVar, q qVar, boolean z10) {
        List<u7.l.b> listY;
        B(looper);
        u7.l lVar = qVar.f26256s;
        if (lVar == null) {
            return A(u7.w.k(qVar.f26252o), z10);
        }
        DefaultDrmSession defaultDrmSessionX = null;
        Object[] objArr = 0;
        if (this.f18537w == null) {
            listY = y((u7.l) x7.a.e(lVar), this.f18516b, false);
            if (listY.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f18516b);
                r.d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new l(new DrmSession.DrmSessionException(missingSchemeDataException, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            listY = null;
        }
        if (this.f18520f) {
            for (DefaultDrmSession defaultDrmSession : this.f18527m) {
                if (Objects.equals(defaultDrmSession.f18483a, listY)) {
                    defaultDrmSessionX = defaultDrmSession;
                    break;
                }
            }
        } else {
            defaultDrmSessionX = this.f18533s;
        }
        if (defaultDrmSessionX == null) {
            defaultDrmSessionX = x(listY, false, aVar, z10);
            if (!this.f18520f) {
                this.f18533s = defaultDrmSessionX;
            }
            this.f18527m.add(defaultDrmSessionX);
        } else {
            defaultDrmSessionX.g(aVar);
        }
        return defaultDrmSessionX;
    }

    private static boolean u(DrmSession drmSession) {
        if (drmSession.k() != 1) {
            return false;
        }
        Throwable cause = ((DrmSession.DrmSessionException) x7.a.e(drmSession.getError())).getCause();
        return (cause instanceof ResourceBusyException) || j.e(cause);
    }

    private DefaultDrmSession w(List<u7.l.b> list, boolean z10, h.a aVar) {
        x7.a.e(this.f18531q);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f18516b, this.f18531q, this.f18523i, this.f18525k, list, this.f18536v, this.f18522h | z10, z10, this.f18537w, this.f18519e, this.f18518d, (Looper) x7.a.e(this.f18534t), this.f18524j, (b2) x7.a.e(this.f18538x));
        defaultDrmSession.g(aVar);
        if (this.f18526l != -9223372036854775807L) {
            defaultDrmSession.g(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession x(List<u7.l.b> list, boolean z10, h.a aVar, boolean z11) {
        DefaultDrmSession defaultDrmSessionW = w(list, z10, aVar);
        if (u(defaultDrmSessionW) && !this.f18529o.isEmpty()) {
            D();
            G(defaultDrmSessionW, aVar);
            defaultDrmSessionW = w(list, z10, aVar);
        }
        if (!u(defaultDrmSessionW) || !z11 || this.f18528n.isEmpty()) {
            return defaultDrmSessionW;
        }
        E();
        if (!this.f18529o.isEmpty()) {
            D();
        }
        G(defaultDrmSessionW, aVar);
        return w(list, z10, aVar);
    }

    private static List<u7.l.b> y(u7.l lVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(lVar.f26196d);
        for (int i10 = 0; i10 < lVar.f26196d; i10++) {
            u7.l.b bVarE = lVar.e(i10);
            if ((bVarE.d(uuid) || (u7.f.f26061c.equals(uuid) && bVarE.d(u7.f.f26060b))) && (bVarE.f26201e != null || z10)) {
                arrayList.add(bVarE);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        Looper looper2 = this.f18534t;
        if (looper2 == null) {
            this.f18534t = looper;
            this.f18535u = new Handler(looper);
        } else {
            x7.a.g(looper2 == looper);
            x7.a.e(this.f18535u);
        }
    }

    public void F(int i10, byte[] bArr) {
        x7.a.g(this.f18527m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            x7.a.e(bArr);
        }
        this.f18536v = i10;
        this.f18537w = bArr;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.i
    public final void k() {
        H(true);
        int i10 = this.f18530p;
        this.f18530p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f18531q == null) {
            m mVarA = this.f18517c.a(this.f18516b);
            this.f18531q = mVarA;
            mVarA.k(new c());
        } else if (this.f18526l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f18527m.size(); i11++) {
                this.f18527m.get(i11).g(null);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.drm.i
    public void l(Looper looper, b2 b2Var) {
        z(looper);
        this.f18538x = b2Var;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.i
    public i.b m(h.a aVar, q qVar) {
        x7.a.g(this.f18530p > 0);
        x7.a.i(this.f18534t);
        e eVar = new e(aVar);
        eVar.e(qVar);
        return eVar;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.i
    public int n(q qVar) {
        H(false);
        int iF = ((m) x7.a.e(this.f18531q)).f();
        u7.l lVar = qVar.f26256s;
        if (lVar != null) {
            if (v(lVar)) {
                return iF;
            }
            return 1;
        }
        if (l0.O0(this.f18521g, u7.w.k(qVar.f26252o)) != -1) {
            return iF;
        }
        return 0;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.i
    public DrmSession o(h.a aVar, q qVar) {
        H(false);
        x7.a.g(this.f18530p > 0);
        x7.a.i(this.f18534t);
        return t(this.f18534t, aVar, qVar, true);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.i
    public final void release() {
        H(true);
        int i10 = this.f18530p - 1;
        this.f18530p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f18526l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f18527m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((DefaultDrmSession) arrayList.get(i11)).f(null);
            }
        }
        E();
        C();
    }

    private DefaultDrmSessionManager(UUID uuid, m.c cVar, p pVar, HashMap<String, String> map, boolean z10, int[] iArr, boolean z11, io.bidmachine.media3.exoplayer.upstream.b bVar, long j10) {
        x7.a.e(uuid);
        x7.a.b(!u7.f.f26060b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f18516b = uuid;
        this.f18517c = cVar;
        this.f18518d = pVar;
        this.f18519e = map;
        this.f18520f = z10;
        this.f18521g = iArr;
        this.f18522h = z11;
        this.f18524j = bVar;
        this.f18523i = new f();
        this.f18525k = new g();
        this.f18536v = 0;
        this.f18527m = new ArrayList();
        this.f18528n = w0.i();
        this.f18529o = w0.i();
        this.f18526l = j10;
    }

    private boolean v(u7.l lVar) {
        if (this.f18537w != null) {
            return true;
        }
        if (y(lVar, this.f18516b, true).isEmpty()) {
            if (lVar.f26196d != 1 || !lVar.e(0).d(u7.f.f26060b)) {
                return false;
            }
            r.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f18516b);
        }
        String str = lVar.f26195c;
        if (str == null || sRGQSqxgxlS.yGomsZw.equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            return l0.f28136a >= 25;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }
}
