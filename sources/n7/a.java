package n7;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g7.j;
import g7.k;
import g7.n;

/* JADX INFO: loaded from: classes4.dex */
public class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f22752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f22753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f22754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f22755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0378a f22756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n f22757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n f22758g;

    /* JADX INFO: renamed from: n7.a$a, reason: collision with other inner class name */
    public interface InterfaceC0378a {
        void a();

        void d();
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f22756e != null) {
                a.this.f22756e.d();
            }
        }
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f22754c == null) {
                return;
            }
            long j10 = a.this.f22752a.f22764d;
            if (a.this.isShown()) {
                j10 += 50;
                a.this.f22752a.a(j10);
                a.this.f22754c.r((int) ((100 * j10) / a.this.f22752a.f22763c), (int) Math.ceil((a.this.f22752a.f22763c - j10) / 1000.0d));
            }
            if (j10 < a.this.f22752a.f22763c) {
                a.this.postDelayed(this, 50L);
                return;
            }
            a.this.j();
            if (a.this.f22752a.f22762b <= 0.0f || a.this.f22756e == null) {
                return;
            }
            a.this.f22756e.a();
        }

        /* synthetic */ c(a aVar, b bVar) {
            this();
        }
    }

    public a(Context context) {
        super(context);
        this.f22752a = new d(null);
    }

    private void e() {
        if (isShown()) {
            h();
            c cVar = new c(this, null);
            this.f22755d = cVar;
            postDelayed(cVar, 50L);
        }
    }

    private void h() {
        c cVar = this.f22755d;
        if (cVar != null) {
            removeCallbacks(cVar);
            this.f22755d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f22752a.j()) {
            j jVar = this.f22753b;
            if (jVar != null) {
                jVar.l();
            }
            if (this.f22754c == null) {
                this.f22754c = new k(null);
            }
            this.f22754c.g(getContext(), this, this.f22758g);
            e();
            return;
        }
        h();
        if (this.f22753b == null) {
            this.f22753b = new j(new b());
        }
        this.f22753b.g(getContext(), this, this.f22757f);
        k kVar = this.f22754c;
        if (kVar != null) {
            kVar.l();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        j jVar = this.f22753b;
        if (jVar != null) {
            jVar.i();
        }
        k kVar = this.f22754c;
        if (kVar != null) {
            kVar.i();
        }
    }

    public long getOnScreenTimeMs() {
        return this.f22752a.h();
    }

    public boolean k() {
        return this.f22752a.e();
    }

    public boolean m() {
        return this.f22752a.l();
    }

    public void n(boolean z10, float f10) {
        if (this.f22752a.f22761a == z10 && this.f22752a.f22762b == f10) {
            return;
        }
        this.f22752a.d(z10, f10);
        if (z10) {
            j();
            return;
        }
        j jVar = this.f22753b;
        if (jVar != null) {
            jVar.l();
        }
        k kVar = this.f22754c;
        if (kVar != null) {
            kVar.l();
        }
        h();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            h();
        } else if (this.f22752a.j() && this.f22752a.l()) {
            e();
        }
        this.f22752a.c(i10 == 0);
    }

    public void setCloseClickListener(InterfaceC0378a interfaceC0378a) {
        this.f22756e = interfaceC0378a;
    }

    public void setCloseStyle(n nVar) {
        this.f22757f = nVar;
        j jVar = this.f22753b;
        if (jVar == null || !jVar.n()) {
            return;
        }
        this.f22753b.g(getContext(), this, nVar);
    }

    public void setCountDownStyle(n nVar) {
        this.f22758g = nVar;
        k kVar = this.f22754c;
        if (kVar == null || !kVar.n()) {
            return;
        }
        this.f22754c.g(getContext(), this, nVar);
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f22761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f22762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f22763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f22764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f22765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f22766f;

        private d() {
            this.f22761a = false;
            this.f22762b = 0.0f;
            this.f22763c = 0L;
            this.f22764d = 0L;
            this.f22765e = 0L;
            this.f22766f = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(boolean z10) {
            if (this.f22765e > 0) {
                this.f22766f += System.currentTimeMillis() - this.f22765e;
            }
            if (z10) {
                this.f22765e = System.currentTimeMillis();
            } else {
                this.f22765e = 0L;
            }
        }

        public void a(long j10) {
            this.f22764d = j10;
        }

        public void d(boolean z10, float f10) {
            this.f22761a = z10;
            this.f22762b = f10;
            this.f22763c = (long) (f10 * 1000.0f);
            this.f22764d = 0L;
        }

        public boolean e() {
            long j10 = this.f22763c;
            return j10 == 0 || this.f22764d >= j10;
        }

        public long h() {
            return this.f22765e > 0 ? System.currentTimeMillis() - this.f22765e : this.f22766f;
        }

        public boolean j() {
            long j10 = this.f22763c;
            return j10 != 0 && this.f22764d < j10;
        }

        public boolean l() {
            return this.f22761a;
        }

        /* synthetic */ d(b bVar) {
            this();
        }
    }
}
