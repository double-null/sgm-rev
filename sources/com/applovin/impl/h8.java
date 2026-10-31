package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f6767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f6768c;

    public h8(View view, com.applovin.impl.sdk.l lVar) {
        this.f6766a = lVar;
        this.f6767b = lVar.Q();
        this.f6768c = view;
    }

    public long a(j3 j3Var) {
        long j10;
        if (com.applovin.impl.sdk.p.a()) {
            this.f6767b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point pointB = p0.b(this.f6768c.getContext());
        if (this.f6768c.isShown()) {
            j10 = 0;
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6767b.b("ViewabilityTracker", "View is hidden");
            }
            j10 = 2;
        }
        if (this.f6768c.getAlpha() < j3Var.m0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6767b.b("ViewabilityTracker", "View is transparent");
            }
            j10 |= 4;
        }
        Animation animation = this.f6768c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6767b.b("ViewabilityTracker", "View is animating");
            }
            j10 |= 8;
        }
        if (this.f6768c.getParent() == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6767b.b("ViewabilityTracker", "No parent view found");
            }
            j10 |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f6768c.getContext(), this.f6768c.getWidth());
        if (iPxToDp < Math.min(j3Var.s0(), pointB.x)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6767b.b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j10 |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f6768c.getContext(), this.f6768c.getHeight());
        if (iPxToDp2 < j3Var.o0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6767b.b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j10 |= 64;
        }
        Rect rect = new Rect(0, 0, pointB.x, pointB.y);
        int[] iArr = {-1, -1};
        this.f6768c.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        Rect rect2 = new Rect(i10, iArr[1], this.f6768c.getWidth() + i10, iArr[1] + this.f6768c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6767b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j10 |= 128;
        }
        Activity activityB = this.f6766a.e().b();
        if (activityB != null && !g8.a(this.f6768c, activityB)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6767b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j10 |= 256;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6767b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j10));
        }
        return j10;
    }
}
