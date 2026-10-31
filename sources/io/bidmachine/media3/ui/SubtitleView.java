package io.bidmachine.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<w7.a> f20054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fa.a f20055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f20057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f20058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f20062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f20063j;

    interface a {
        void a(List<w7.a> list, fa.a aVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20054a = Collections.emptyList();
        this.f20055b = fa.a.f14759g;
        this.f20056c = 0;
        this.f20057d = 0.0533f;
        this.f20058e = 0.08f;
        this.f20059f = true;
        this.f20060g = true;
        io.bidmachine.media3.ui.a aVar = new io.bidmachine.media3.ui.a(context);
        this.f20062i = aVar;
        this.f20063j = aVar;
        addView(aVar);
        this.f20061h = 1;
    }

    private w7.a a(w7.a aVar) {
        w7.a.b bVarA = aVar.a();
        if (!this.f20059f) {
            g0.e(bVarA);
        } else if (!this.f20060g) {
            g0.f(bVarA);
        }
        return bVarA.a();
    }

    private void c(int i10, float f10) {
        this.f20056c = i10;
        this.f20057d = f10;
        f();
    }

    private void f() {
        this.f20062i.a(getCuesWithStylingPreferencesApplied(), this.f20055b, this.f20057d, this.f20056c, this.f20058e);
    }

    private List<w7.a> getCuesWithStylingPreferencesApplied() {
        if (this.f20059f && this.f20060g) {
            return this.f20054a;
        }
        ArrayList arrayList = new ArrayList(this.f20054a.size());
        for (int i10 = 0; i10 < this.f20054a.size(); i10++) {
            arrayList.add(a(this.f20054a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private fa.a getUserCaptionStyle() {
        if (isInEditMode()) {
            return fa.a.f14759g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? fa.a.f14759g : fa.a.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f20063j);
        View view = this.f20063j;
        if (view instanceof i0) {
            ((i0) view).g();
        }
        this.f20063j = t10;
        this.f20062i = t10;
        addView(t10);
    }

    public void b(float f10, boolean z10) {
        c(z10 ? 1 : 0, f10);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f20060g = z10;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f20059f = z10;
        f();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f20058e = f10;
        f();
    }

    public void setCues(List<w7.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f20054a = list;
        f();
    }

    public void setFractionalTextSize(float f10) {
        b(f10, false);
    }

    public void setStyle(fa.a aVar) {
        this.f20055b = aVar;
        f();
    }

    public void setViewType(int i10) {
        if (this.f20061h == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new io.bidmachine.media3.ui.a(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new i0(getContext()));
        }
        this.f20061h = i10;
    }
}
