package pa;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d0 implements a0, v, y, x, c0, b0, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fb.b f23714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23715b = new CopyOnWriteArrayList();

    class a extends b {
        a() {
            super(null);
        }

        @Override // wb.v
        public void p() {
            d0.this.u().j();
            d0.this.f23715b.remove(this);
        }
    }

    private static abstract class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f23717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f23718b;

        private b() {
        }

        private long e() {
            return Math.max(this.f23718b - System.currentTimeMillis(), 0L);
        }

        public void a() {
            this.f23717a = e();
            qb.h.c(this);
        }

        public void c(long j10) {
            this.f23717a = j10;
            this.f23718b = System.currentTimeMillis() + j10;
            d();
        }

        public void d() {
            long j10 = this.f23717a;
            if (j10 > 0) {
                qb.h.e(this, j10);
            } else {
                qb.h.d(this);
            }
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d0(fb.b bVar) {
        this.f23714a = bVar;
    }

    public void a() {
    }

    public void destroy() {
        Iterator it = this.f23715b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        this.f23715b.clear();
    }

    @Override // pa.a0
    public void j() {
        Iterator it = this.f23715b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).d();
        }
    }

    @Override // pa.a0
    public void pause() {
        Iterator it = this.f23715b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
    }

    public fb.b u() {
        return this.f23714a;
    }

    public abstract String v();

    public void w() {
        this.f23714a.l();
    }

    @Override // pa.x
    public void a(long j10, long j11, float f10) {
    }

    @Override // pa.c0
    public void a(String str) {
    }

    @Override // pa.a0
    public void a(long j10) {
        a aVar = new a();
        this.f23715b.add(aVar);
        aVar.c(j10);
    }

    public void e() {
    }

    @Override // pa.y
    public void i() {
    }

    public void p(Integer num) {
    }

    public void q(Integer num) {
    }
}
