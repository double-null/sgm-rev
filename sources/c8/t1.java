package c8;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 implements a2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.common.base.w<String> f4942i = new com.google.common.base.w() { // from class: c8.s1
        @Override // com.google.common.base.w
        public final Object get() {
            return t1.m();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f4943j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u7.d0.c f4944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u7.d0.b f4945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f4946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.common.base.w<String> f4947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a2.a f4948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u7.d0 f4949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f4950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4951h;

    /* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f4954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.source.r.b f4955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4957f;

        public a(String str, int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
            this.f4952a = str;
            this.f4953b = i10;
            this.f4954c = bVar == null ? -1L : bVar.f19687d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f4955d = bVar;
        }

        private int l(u7.d0 d0Var, u7.d0 d0Var2, int i10) {
            if (i10 >= d0Var.p()) {
                if (i10 < d0Var2.p()) {
                    return i10;
                }
                return -1;
            }
            d0Var.n(i10, t1.this.f4944a);
            for (int i11 = t1.this.f4944a.f26048n; i11 <= t1.this.f4944a.f26049o; i11++) {
                int iB = d0Var2.b(d0Var.m(i11));
                if (iB != -1) {
                    return d0Var2.f(iB, t1.this.f4945b).f26020c;
                }
            }
            return -1;
        }

        public boolean i(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
            if (bVar == null) {
                return i10 == this.f4953b;
            }
            io.bidmachine.media3.exoplayer.source.r.b bVar2 = this.f4955d;
            if (bVar2 == null) {
                return !bVar.b() && bVar.f19687d == this.f4954c;
            }
            return bVar.f19687d == bVar2.f19687d && bVar.f19685b == bVar2.f19685b && bVar.f19686c == bVar2.f19686c;
        }

        public boolean j(b.a aVar) {
            io.bidmachine.media3.exoplayer.source.r.b bVar = aVar.f4792d;
            if (bVar == null) {
                return this.f4953b != aVar.f4791c;
            }
            long j10 = this.f4954c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f19687d > j10) {
                return true;
            }
            if (this.f4955d == null) {
                return false;
            }
            int iB = aVar.f4790b.b(bVar.f19684a);
            int iB2 = aVar.f4790b.b(this.f4955d.f19684a);
            io.bidmachine.media3.exoplayer.source.r.b bVar2 = aVar.f4792d;
            if (bVar2.f19687d < this.f4955d.f19687d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f4792d.f19688e;
                return i10 == -1 || i10 > this.f4955d.f19685b;
            }
            io.bidmachine.media3.exoplayer.source.r.b bVar3 = aVar.f4792d;
            int i11 = bVar3.f19685b;
            int i12 = bVar3.f19686c;
            io.bidmachine.media3.exoplayer.source.r.b bVar4 = this.f4955d;
            int i13 = bVar4.f19685b;
            if (i11 <= i13) {
                return i11 == i13 && i12 > bVar4.f19686c;
            }
            return true;
        }

        public void k(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
            if (this.f4954c != -1 || i10 != this.f4953b || bVar == null || bVar.f19687d < t1.this.n()) {
                return;
            }
            this.f4954c = bVar.f19687d;
        }

        public boolean m(u7.d0 d0Var, u7.d0 d0Var2) {
            int iL = l(d0Var, d0Var2, this.f4953b);
            this.f4953b = iL;
            if (iL == -1) {
                return false;
            }
            io.bidmachine.media3.exoplayer.source.r.b bVar = this.f4955d;
            return bVar == null || d0Var2.b(bVar.f19684a) != -1;
        }
    }

    public t1() {
        this(f4942i);
    }

    private void l(a aVar) {
        if (aVar.f4954c != -1) {
            this.f4951h = aVar.f4954c;
        }
        this.f4950g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f4943j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = this.f4946c.get(this.f4950g);
        return (aVar == null || aVar.f4954c == -1) ? this.f4951h + 1 : aVar.f4954c;
    }

    private a o(int i10, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f4946c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f4954c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) x7.l0.i(aVar)).f4955d != null && aVar2.f4955d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f4947d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f4946c.put(str, aVar3);
        return aVar3;
    }

    private void p(b.a aVar) {
        if (aVar.f4790b.q()) {
            String str = this.f4950g;
            if (str != null) {
                l((a) x7.a.e(this.f4946c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = this.f4946c.get(this.f4950g);
        a aVarO = o(aVar.f4791c, aVar.f4792d);
        this.f4950g = aVarO.f4952a;
        d(aVar);
        io.bidmachine.media3.exoplayer.source.r.b bVar = aVar.f4792d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f4954c == aVar.f4792d.f19687d && aVar2.f4955d != null && aVar2.f4955d.f19685b == aVar.f4792d.f19685b && aVar2.f4955d.f19686c == aVar.f4792d.f19686c) {
            return;
        }
        io.bidmachine.media3.exoplayer.source.r.b bVar2 = aVar.f4792d;
        this.f4948e.C(aVar, o(aVar.f4791c, new io.bidmachine.media3.exoplayer.source.r.b(bVar2.f19684a, bVar2.f19687d)).f4952a, aVarO.f4952a);
    }

    @Override // c8.a2
    public synchronized String a() {
        return this.f4950g;
    }

    @Override // c8.a2
    public synchronized void b(b.a aVar, int i10) {
        x7.a.e(this.f4948e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f4946c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j(aVar)) {
                it.remove();
                if (next.f4956e) {
                    boolean zEquals = next.f4952a.equals(this.f4950g);
                    boolean z11 = z10 && zEquals && next.f4957f;
                    if (zEquals) {
                        l(next);
                    }
                    this.f4948e.z(aVar, next.f4952a, z11);
                }
            }
        }
        p(aVar);
    }

    @Override // c8.a2
    public synchronized void c(b.a aVar) {
        x7.a.e(this.f4948e);
        u7.d0 d0Var = this.f4949f;
        this.f4949f = aVar.f4790b;
        Iterator<a> it = this.f4946c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m(d0Var, this.f4949f) || next.j(aVar)) {
                it.remove();
                if (next.f4956e) {
                    if (next.f4952a.equals(this.f4950g)) {
                        l(next);
                    }
                    this.f4948e.z(aVar, next.f4952a, false);
                }
            }
        }
        p(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    @Override // c8.a2
    public synchronized void d(b.a aVar) {
        b.a aVar2;
        a aVar3;
        x7.a.e(this.f4948e);
        if (aVar.f4790b.q()) {
            return;
        }
        io.bidmachine.media3.exoplayer.source.r.b bVar = aVar.f4792d;
        if (bVar != null) {
            if (bVar.f19687d < n()) {
                return;
            }
            a aVar4 = this.f4946c.get(this.f4950g);
            if (aVar4 != null && aVar4.f4954c == -1 && aVar4.f4953b != aVar.f4791c) {
                return;
            }
        }
        a aVarO = o(aVar.f4791c, aVar.f4792d);
        if (this.f4950g == null) {
            this.f4950g = aVarO.f4952a;
        }
        io.bidmachine.media3.exoplayer.source.r.b bVar2 = aVar.f4792d;
        if (bVar2 != null && bVar2.b()) {
            io.bidmachine.media3.exoplayer.source.r.b bVar3 = aVar.f4792d;
            io.bidmachine.media3.exoplayer.source.r.b bVar4 = new io.bidmachine.media3.exoplayer.source.r.b(bVar3.f19684a, bVar3.f19687d, bVar3.f19685b);
            a aVarO2 = o(aVar.f4791c, bVar4);
            if (!aVarO2.f4956e) {
                aVarO2.f4956e = true;
                aVar.f4790b.h(aVar.f4792d.f19684a, this.f4945b);
                this.f4948e.i(new b.a(aVar.f4789a, aVar.f4790b, aVar.f4791c, bVar4, Math.max(0L, x7.l0.t1(this.f4945b.f(aVar.f4792d.f19685b)) + this.f4945b.m()), aVar.f4794f, aVar.f4795g, aVar.f4796h, aVar.f4797i, aVar.f4798j), aVarO2.f4952a);
            }
        }
        if (aVarO.f4956e) {
            aVar2 = aVar;
            aVar3 = aVarO;
        } else {
            aVar3 = aVarO;
            aVar3.f4956e = true;
            aVar2 = aVar;
            this.f4948e.i(aVar2, aVar3.f4952a);
        }
        if (aVar3.f4952a.equals(this.f4950g) && !aVar3.f4957f) {
            aVar3.f4957f = true;
            this.f4948e.B(aVar2, aVar3.f4952a);
        }
    }

    @Override // c8.a2
    public synchronized String e(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        return o(d0Var.h(bVar.f19684a, this.f4945b).f26020c, bVar).f4952a;
    }

    @Override // c8.a2
    public void f(a2.a aVar) {
        this.f4948e = aVar;
    }

    @Override // c8.a2
    public synchronized void g(b.a aVar) {
        a2.a aVar2;
        String str = this.f4950g;
        if (str != null) {
            l((a) x7.a.e(this.f4946c.get(str)));
        }
        Iterator<a> it = this.f4946c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f4956e && (aVar2 = this.f4948e) != null) {
                aVar2.z(aVar, next.f4952a, false);
            }
        }
    }

    public t1(com.google.common.base.w<String> wVar) {
        this.f4947d = wVar;
        this.f4944a = new u7.d0.c();
        this.f4945b = new u7.d0.b();
        this.f4946c = new HashMap<>();
        this.f4949f = u7.d0.f26009a;
        this.f4951h = -1L;
    }
}
