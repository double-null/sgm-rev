package com.applovin.adview;

import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.r;
import com.applovin.impl.p2;
import com.applovin.impl.y1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f5873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p2 f5874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f5875c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y1 f5876d;

    public AppLovinFullscreenAdViewObserver(f fVar, p2 p2Var) {
        this.f5873a = fVar;
        this.f5874b = p2Var;
        fVar.a(this);
    }

    @r(f.a.ON_DESTROY)
    public void onDestroy() {
        this.f5873a.c(this);
        p2 p2Var = this.f5874b;
        if (p2Var != null) {
            p2Var.a();
            this.f5874b = null;
        }
        y1 y1Var = this.f5876d;
        if (y1Var != null) {
            y1Var.a("lifecycle_on_destroy");
            this.f5876d.r();
            this.f5876d = null;
        }
    }

    @r(f.a.ON_PAUSE)
    public void onPause() {
        y1 y1Var = this.f5876d;
        if (y1Var != null) {
            y1Var.s();
            this.f5876d.v();
        }
    }

    @r(f.a.ON_RESUME)
    public void onResume() {
        y1 y1Var;
        if (this.f5875c.getAndSet(false) || (y1Var = this.f5876d) == null) {
            return;
        }
        y1Var.t();
        this.f5876d.b(0L);
    }

    @r(f.a.ON_STOP)
    public void onStop() {
        y1 y1Var = this.f5876d;
        if (y1Var != null) {
            y1Var.u();
        }
    }

    public void setPresenter(y1 y1Var) {
        this.f5876d = y1Var;
    }
}
