package io.bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes4.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f17725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f17726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f17727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f17728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f17729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f17730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f17731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f17732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f17733i;

    public i0(float f10, Rect screenRectPx, Rect screenRectDp, Rect rootViewRectPx, Rect rootViewRectDp, Rect currentAdRectPx, Rect currentAdRectDp, Rect defaultAdRectPx, Rect defaultAdRectDp) {
        kotlin.jvm.internal.t.f(screenRectPx, "screenRectPx");
        kotlin.jvm.internal.t.f(screenRectDp, "screenRectDp");
        kotlin.jvm.internal.t.f(rootViewRectPx, "rootViewRectPx");
        kotlin.jvm.internal.t.f(rootViewRectDp, "rootViewRectDp");
        kotlin.jvm.internal.t.f(currentAdRectPx, "currentAdRectPx");
        kotlin.jvm.internal.t.f(currentAdRectDp, "currentAdRectDp");
        kotlin.jvm.internal.t.f(defaultAdRectPx, "defaultAdRectPx");
        kotlin.jvm.internal.t.f(defaultAdRectDp, "defaultAdRectDp");
        this.f17725a = f10;
        this.f17726b = screenRectPx;
        this.f17727c = screenRectDp;
        this.f17728d = rootViewRectPx;
        this.f17729e = rootViewRectDp;
        this.f17730f = currentAdRectPx;
        this.f17731g = currentAdRectDp;
        this.f17732h = defaultAdRectPx;
        this.f17733i = defaultAdRectDp;
    }

    private final boolean a(Rect rect, Rect rect2, int i10, int i11, int i12, int i13) {
        if (rect.left == i10 && rect.top == i11 && i10 + i12 == rect.right && i11 + i13 == rect.bottom) {
            return false;
        }
        rect.set(i10, i11, i12 + i10, i13 + i11);
        wb.e0.F(rect2, rect, this.f17725a);
        return true;
    }

    public final Rect b() {
        return this.f17731g;
    }

    public final Rect c() {
        return this.f17733i;
    }

    public final Rect d() {
        return this.f17729e;
    }

    public final Rect e() {
        return this.f17727c;
    }

    public final boolean f(int i10, int i11, int i12, int i13) {
        return a(this.f17730f, this.f17731g, i10, i11, i12, i13);
    }

    public final boolean g(int i10, int i11, int i12, int i13) {
        return a(this.f17732h, this.f17733i, i10, i11, i12, i13);
    }

    public final boolean h(int i10, int i11, int i12, int i13) {
        return a(this.f17728d, this.f17729e, i10, i11, i12, i13);
    }

    public final boolean i(int i10, int i11) {
        if (this.f17726b.width() == i10 && this.f17726b.height() == i11) {
            return false;
        }
        this.f17726b.set(0, 0, i10, i11);
        wb.e0.F(this.f17727c, this.f17726b, this.f17725a);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(Context context) {
        this(wb.g.g(context), new Rect(), new Rect(), new Rect(), new Rect(), new Rect(), new Rect(), new Rect(), new Rect());
        kotlin.jvm.internal.t.f(context, "context");
    }
}
