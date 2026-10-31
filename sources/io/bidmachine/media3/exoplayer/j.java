package io.bidmachine.media3.exoplayer;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: DefaultLoadControl.java */
/* JADX INFO: loaded from: classes4.dex */
public class j implements j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r8.g f19086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f19092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f19093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f19094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<c8.b2, b> f19095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19096l;

    /* JADX INFO: compiled from: DefaultLoadControl.java */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19098b;

        private b() {
        }
    }

    public j() {
        this(new r8.g(true, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    private static void r(int i10, int i11, String str, String str2) {
        x7.a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    private static int u(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void v(c8.b2 b2Var) {
        if (this.f19095k.remove(b2Var) != null) {
            x();
        }
    }

    private void w(c8.b2 b2Var) {
        b bVar = (b) x7.a.e(this.f19095k.get(b2Var));
        int i10 = this.f19091g;
        if (i10 == -1) {
            i10 = 13107200;
        }
        bVar.f19098b = i10;
        bVar.f19097a = false;
    }

    private void x() {
        if (this.f19095k.isEmpty()) {
            this.f19086b.g();
        } else {
            this.f19086b.h(t());
        }
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public void d(c8.b2 b2Var) {
        v(b2Var);
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public boolean e(c8.b2 b2Var) {
        return this.f19094j;
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public boolean g(j1.a aVar) {
        long jL0 = x7.l0.l0(aVar.f19105e, aVar.f19106f);
        long jMin = aVar.f19108h ? this.f19090f : this.f19089e;
        long j10 = aVar.f19109i;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        return jMin <= 0 || jL0 >= jMin || (!this.f19092h && this.f19086b.f() >= t());
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public r8.b h() {
        return this.f19086b;
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public boolean j(j1.a aVar) {
        b bVar = (b) x7.a.e(this.f19095k.get(aVar.f19101a));
        boolean z10 = true;
        boolean z11 = this.f19086b.f() >= t();
        long jMin = this.f19087c;
        float f10 = aVar.f19106f;
        if (f10 > 1.0f) {
            jMin = Math.min(x7.l0.g0(jMin, f10), this.f19088d);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f19105e;
        if (j10 < jMax) {
            if (!this.f19092h && z11) {
                z10 = false;
            }
            bVar.f19097a = z10;
            if (!z10 && j10 < 500000) {
                x7.r.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f19088d || z11) {
            bVar.f19097a = false;
        }
        return bVar.f19097a;
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public long k(c8.b2 b2Var) {
        return this.f19093i;
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public void l(j1.a aVar, n8.x xVar, q8.q[] qVarArr) {
        b bVar = (b) x7.a.e(this.f19095k.get(aVar.f19101a));
        int iS = this.f19091g;
        if (iS == -1) {
            iS = s(qVarArr);
        }
        bVar.f19098b = iS;
        x();
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public boolean m(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar, long j10) {
        Iterator<b> it = this.f19095k.values().iterator();
        while (it.hasNext()) {
            if (it.next().f19097a) {
                return false;
            }
        }
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public void o(c8.b2 b2Var) {
        v(b2Var);
        if (this.f19095k.isEmpty()) {
            this.f19096l = -1L;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.j1
    public void q(c8.b2 b2Var) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f19096l;
        x7.a.h(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f19096l = id2;
        if (!this.f19095k.containsKey(b2Var)) {
            this.f19095k.put(b2Var, new b());
        }
        w(b2Var);
    }

    protected int s(q8.q[] qVarArr) {
        int iU = 0;
        for (q8.q qVar : qVarArr) {
            if (qVar != null) {
                iU += u(qVar.m().f26056c);
            }
        }
        return Math.max(13107200, iU);
    }

    int t() {
        Iterator<b> it = this.f19095k.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f19098b;
        }
        return i10;
    }

    protected j(r8.g gVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        r(i12, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        r(i13, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        r(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        r(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        r(i11, i10, "maxBufferMs", "minBufferMs");
        r(i15, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f19086b = gVar;
        this.f19087c = x7.l0.S0(i10);
        this.f19088d = x7.l0.S0(i11);
        this.f19089e = x7.l0.S0(i12);
        this.f19090f = x7.l0.S0(i13);
        this.f19091g = i14;
        this.f19092h = z10;
        this.f19093i = x7.l0.S0(i15);
        this.f19094j = z11;
        this.f19095k = new HashMap<>();
        this.f19096l = -1L;
    }
}
