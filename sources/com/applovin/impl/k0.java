package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f6944w = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f6945x = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f6946y = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f6947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f6948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Paint f6949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Paint f6950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f6951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f6952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f6959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f6960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f6961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f6962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f6963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f6964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f6965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f6966t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f6967u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f6968v;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public k0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f6956j) * 360.0f;
    }

    protected void a() {
        this.f6957k = f6944w;
        this.f6953g = f6945x;
        this.f6952f = this.f6966t;
        setMax(100);
        setProgress(0);
        this.f6958l = this.f6965s;
        this.f6959m = 0;
        this.f6962p = this.f6967u;
        this.f6954h = f6946y;
    }

    protected void b() {
        TextPaint textPaint = new TextPaint();
        this.f6949c = textPaint;
        textPaint.setColor(this.f6953g);
        this.f6949c.setTextSize(this.f6952f);
        this.f6949c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f6950d = textPaint2;
        textPaint2.setColor(this.f6954h);
        this.f6950d.setTextSize(this.f6962p);
        this.f6950d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f6947a = paint;
        paint.setColor(this.f6957k);
        this.f6947a.setStyle(Paint.Style.STROKE);
        this.f6947a.setAntiAlias(true);
        this.f6947a.setStrokeWidth(this.f6958l);
        Paint paint2 = new Paint();
        this.f6948b = paint2;
        paint2.setColor(this.f6959m);
        this.f6948b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f6957k;
    }

    public float getFinishedStrokeWidth() {
        return this.f6958l;
    }

    public int getInnerBackgroundColor() {
        return this.f6959m;
    }

    public String getInnerBottomText() {
        return this.f6963q;
    }

    public int getInnerBottomTextColor() {
        return this.f6954h;
    }

    public float getInnerBottomTextSize() {
        return this.f6962p;
    }

    public int getMax() {
        return this.f6956j;
    }

    public String getPrefixText() {
        return this.f6960n;
    }

    public int getProgress() {
        return this.f6955i;
    }

    public String getSuffixText() {
        return this.f6961o;
    }

    public int getTextColor() {
        return this.f6953g;
    }

    public float getTextSize() {
        return this.f6952f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f6958l;
        this.f6951e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f6958l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f6948b);
        canvas.drawArc(this.f6951e, 270.0f, -getProgressAngle(), false, this.f6947a);
        String str = this.f6960n + this.f6955i + this.f6961o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f6949c.measureText(str)) / 2.0f, (getWidth() - (this.f6949c.descent() + this.f6949c.ascent())) / 2.0f, this.f6949c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f6950d.setTextSize(this.f6962p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f6950d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f6964r) - ((this.f6949c.descent() + this.f6949c.ascent()) / 2.0f), this.f6950d);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f6964r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f6953g = bundle.getInt("text_color");
        this.f6952f = bundle.getFloat("text_size");
        this.f6962p = bundle.getFloat("inner_bottom_text_size");
        this.f6963q = bundle.getString("inner_bottom_text");
        this.f6954h = bundle.getInt("inner_bottom_text_color");
        this.f6957k = bundle.getInt("finished_stroke_color");
        this.f6958l = bundle.getFloat("finished_stroke_width");
        this.f6959m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt(AppLovinMediationProvider.MAX));
        setProgress(bundle.getInt("progress"));
        this.f6960n = bundle.getString("prefix");
        this.f6961o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt(AppLovinMediationProvider.MAX, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f6957k = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f6958l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f6959m = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f6963q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f6954h = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f6962p = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f6956j = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f6960n = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f6955i = i10;
        if (i10 > getMax()) {
            this.f6955i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f6961o = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f6953g = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f6952f = f10;
        invalidate();
    }

    public k0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6951e = new RectF();
        this.f6955i = 0;
        this.f6960n = "";
        this.f6961o = "";
        this.f6963q = "";
        this.f6966t = a.d(getResources(), 14.0f);
        this.f6968v = (int) a.c(getResources(), 100.0f);
        this.f6965s = a.c(getResources(), 4.0f);
        this.f6967u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f6968v;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
