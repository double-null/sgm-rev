package io.bidmachine.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import b8.u;
import com.facebook.appevents.AppEventsConstants;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.exoplayer.source.f0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import u7.h;
import u7.q;
import u7.v;
import v8.o0;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: PlayerEmsgHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r8.b f18466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f18467b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f8.c f18471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f18472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18475j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TreeMap<Long, Long> f18470e = new TreeMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f18469d = l0.B(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g9.b f18468c = new g9.b();

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18477b;

        public a(long j10, long j11) {
            this.f18476a = j10;
            this.f18477b = j11;
        }
    }

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public interface b {
        void a(long j10);

        void b();
    }

    /* JADX INFO: compiled from: PlayerEmsgHandler.java */
    public final class c implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f18478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f18479b = new u();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e9.b f18480c = new e9.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f18481d = -9223372036854775807L;

        c(r8.b bVar) {
            this.f18478a = f0.m(bVar);
        }

        private e9.b h() {
            this.f18480c.g();
            if (this.f18478a.V(this.f18479b, this.f18480c, 0, false) != -4) {
                return null;
            }
            this.f18480c.r();
            return this.f18480c;
        }

        private void l(long j10, long j11) {
            f.this.f18469d.sendMessage(f.this.f18469d.obtainMessage(1, new a(j10, j11)));
        }

        private void m() {
            while (this.f18478a.N(false)) {
                e9.b bVarH = h();
                if (bVarH != null) {
                    long j10 = bVarH.f18059f;
                    v vVarA = f.this.f18468c.a(bVarH);
                    if (vVarA != null) {
                        g9.a aVar = (g9.a) vVarA.d(0);
                        if (f.h(aVar.f15536a, aVar.f15537b)) {
                            n(j10, aVar);
                        }
                    }
                }
            }
            this.f18478a.t();
        }

        private void n(long j10, g9.a aVar) {
            long jF = f.f(aVar);
            if (jF == -9223372036854775807L) {
                return;
            }
            l(j10, jF);
        }

        @Override // v8.o0
        public void a(q qVar) {
            this.f18478a.a(qVar);
        }

        @Override // v8.o0
        public void d(a0 a0Var, int i10, int i11) {
            this.f18478a.b(a0Var, i10);
        }

        @Override // v8.o0
        public int e(h hVar, int i10, boolean z10, int i11) throws IOException {
            return this.f18478a.c(hVar, i10, z10);
        }

        @Override // v8.o0
        public void f(long j10, int i10, int i11, int i12, o0.a aVar) {
            this.f18478a.f(j10, i10, i11, i12, aVar);
            m();
        }

        public boolean i(long j10) {
            return f.this.j(j10);
        }

        public void j(o8.e eVar) {
            long j10 = this.f18481d;
            if (j10 == -9223372036854775807L || eVar.f23175h > j10) {
                this.f18481d = eVar.f23175h;
            }
            f.this.m(eVar);
        }

        public boolean k(o8.e eVar) {
            long j10 = this.f18481d;
            return f.this.n(j10 != -9223372036854775807L && j10 < eVar.f23174g);
        }

        public void o() {
            this.f18478a.W();
        }
    }

    public f(f8.c cVar, b bVar, r8.b bVar2) {
        this.f18471f = cVar;
        this.f18467b = bVar;
        this.f18466a = bVar2;
    }

    private Map.Entry<Long, Long> e(long j10) {
        return this.f18470e.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(g9.a aVar) {
        try {
            return l0.a1(l0.H(aVar.f15540e));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = this.f18470e.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f18470e.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f18470e.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    private void i() {
        if (this.f18473h) {
            this.f18474i = true;
            this.f18473h = false;
            this.f18467b.b();
        }
    }

    private void l() {
        this.f18467b.a(this.f18472g);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f18470e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f18471f.f14672h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f18475j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f18476a, aVar.f18477b);
        return true;
    }

    boolean j(long j10) {
        f8.c cVar = this.f18471f;
        boolean z10 = false;
        if (!cVar.f14668d) {
            return false;
        }
        if (this.f18474i) {
            return true;
        }
        Map.Entry<Long, Long> entryE = e(cVar.f14672h);
        if (entryE != null && entryE.getValue().longValue() < j10) {
            this.f18472g = entryE.getKey().longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f18466a);
    }

    void m(o8.e eVar) {
        this.f18473h = true;
    }

    boolean n(boolean z10) {
        if (!this.f18471f.f14668d) {
            return false;
        }
        if (this.f18474i) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f18475j = true;
        this.f18469d.removeCallbacksAndMessages(null);
    }

    public void q(f8.c cVar) {
        this.f18474i = false;
        this.f18472g = -9223372036854775807L;
        this.f18471f = cVar;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return cTJaRZ.iYeTWrOeWwtpuw.equals(str) && (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(str2) || "2".equals(str2) || "3".equals(str2));
    }
}
