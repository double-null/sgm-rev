package g7;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f15489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f15490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15491c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f15492d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f15493e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f15494f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f15495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f15496h;

    public interface a {
        void a(float f10, long j10, long j11);

        void b();
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            t.this.a();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jMin = t.this.f15494f;
            if (t.this.f15489a.isShown()) {
                jMin = Math.min(t.this.f15493e, jMin + 16);
                t.this.b(jMin);
                t.this.f15490b.a((t.this.f15494f * 100.0f) / t.this.f15493e, t.this.f15494f, t.this.f15493e);
            }
            if (jMin >= t.this.f15493e) {
                t.this.f15490b.b();
            } else {
                t.this.f15489a.postDelayed(this, 16L);
            }
        }
    }

    public t(View view, a aVar) {
        b bVar = new b();
        this.f15495g = bVar;
        this.f15496h = new c();
        this.f15489a = view;
        this.f15490b = aVar;
        view.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        boolean zIsShown = this.f15489a.isShown();
        if (this.f15491c == zIsShown) {
            return;
        }
        this.f15491c = zIsShown;
        if (!zIsShown) {
            m();
        } else if (j()) {
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j10) {
        this.f15494f = j10;
    }

    public void h() {
        m();
        this.f15489a.getViewTreeObserver().removeGlobalOnLayoutListener(this.f15495g);
    }

    public boolean j() {
        long j10 = this.f15493e;
        return j10 != 0 && this.f15494f < j10;
    }

    public void k(float f10) {
        if (this.f15492d == f10) {
            return;
        }
        this.f15492d = f10;
        this.f15493e = (long) (f10 * 1000.0f);
        l();
    }

    public void l() {
        if (!this.f15489a.isShown() || this.f15493e == 0) {
            return;
        }
        this.f15489a.postDelayed(this.f15496h, 16L);
    }

    public void m() {
        this.f15489a.removeCallbacks(this.f15496h);
    }
}
