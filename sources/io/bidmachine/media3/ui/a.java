package io.bidmachine.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: CanvasSubtitleOutput.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<d0> f20080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<w7.a> f20081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f20083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private fa.a f20084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f20085f;

    public a(Context context) {
        this(context, null);
    }

    private static w7.a b(w7.a aVar) {
        w7.a.b bVarP = aVar.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (aVar.f27548f == 0) {
            bVarP.h(1.0f - aVar.f27547e, 0);
        } else {
            bVarP.h((-aVar.f27547e) - 1.0f, 1);
        }
        int i10 = aVar.f27549g;
        if (i10 == 0) {
            bVarP.i(2);
        } else if (i10 == 2) {
            bVarP.i(0);
        }
        return bVarP.a();
    }

    @Override // io.bidmachine.media3.ui.SubtitleView.a
    public void a(List<w7.a> list, fa.a aVar, float f10, int i10, float f11) {
        this.f20081b = list;
        this.f20084e = aVar;
        this.f20083d = f10;
        this.f20082c = i10;
        this.f20085f = f11;
        while (this.f20080a.size() < list.size()) {
            this.f20080a.add(new d0(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<w7.a> list = this.f20081b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fH = g0.h(this.f20082c, this.f20083d, height, i10);
        if (fH <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            w7.a aVarB = list.get(i11);
            if (aVarB.f27558p != Integer.MIN_VALUE) {
                aVarB = b(aVarB);
            }
            w7.a aVar = aVarB;
            int i12 = paddingBottom;
            this.f20080a.get(i11).b(aVar, this.f20084e, fH, g0.h(aVar.f27556n, aVar.f27557o, height, i10), this.f20085f, canvas, paddingLeft, paddingTop, width, i12);
            i11++;
            size = size;
            i10 = i10;
            paddingBottom = i12;
            width = width;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20080a = new ArrayList();
        this.f20081b = Collections.emptyList();
        this.f20082c = 0;
        this.f20083d = 0.0533f;
        this.f20084e = fa.a.f14759g;
        this.f20085f = 0.08f;
    }
}
