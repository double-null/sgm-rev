package k;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.x2;
import androidx.core.view.y2;
import androidx.core.view.z2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f21105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    y2 f21106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21107e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f21104b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z2 f21108f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<x2> f21103a = new ArrayList<>();

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
    class a extends z2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21109a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21110b = 0;

        a() {
        }

        @Override // androidx.core.view.y2
        public void b(View view) {
            int i10 = this.f21110b + 1;
            this.f21110b = i10;
            if (i10 == h.this.f21103a.size()) {
                y2 y2Var = h.this.f21106d;
                if (y2Var != null) {
                    y2Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.z2, androidx.core.view.y2
        public void c(View view) {
            if (this.f21109a) {
                return;
            }
            this.f21109a = true;
            y2 y2Var = h.this.f21106d;
            if (y2Var != null) {
                y2Var.c(null);
            }
        }

        void d() {
            this.f21110b = 0;
            this.f21109a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f21107e) {
            Iterator<x2> it = this.f21103a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f21107e = false;
        }
    }

    void b() {
        this.f21107e = false;
    }

    public h c(x2 x2Var) {
        if (!this.f21107e) {
            this.f21103a.add(x2Var);
        }
        return this;
    }

    public h d(x2 x2Var, x2 x2Var2) {
        this.f21103a.add(x2Var);
        x2Var2.j(x2Var.d());
        this.f21103a.add(x2Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f21107e) {
            this.f21104b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f21107e) {
            this.f21105c = interpolator;
        }
        return this;
    }

    public h g(y2 y2Var) {
        if (!this.f21107e) {
            this.f21106d = y2Var;
        }
        return this;
    }

    public void h() {
        if (this.f21107e) {
            return;
        }
        for (x2 x2Var : this.f21103a) {
            long j10 = this.f21104b;
            if (j10 >= 0) {
                x2Var.f(j10);
            }
            Interpolator interpolator = this.f21105c;
            if (interpolator != null) {
                x2Var.g(interpolator);
            }
            if (this.f21106d != null) {
                x2Var.h(this.f21108f);
            }
            x2Var.l();
        }
        this.f21107e = true;
    }
}
