package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class g extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f6073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6074b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e eVarA = e.a(aVar, activity);
        this.f6073a = eVarA;
        addView(eVarA);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f6073a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f6073a.getLayoutParams();
        removeView(this.f6073a);
        e eVarA = e.a(aVar, getContext());
        this.f6073a = eVarA;
        addView(eVarA);
        this.f6073a.setLayoutParams(layoutParams);
        this.f6073a.a(this.f6074b);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f6074b = i10;
        int i14 = i11 + i10 + i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i14;
            layoutParams.width = i14;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10, i13);
        layoutParams2.setMargins(i12, i12, i12, 0);
        this.f6073a.setLayoutParams(layoutParams2);
        this.f6073a.a(i10);
    }
}
