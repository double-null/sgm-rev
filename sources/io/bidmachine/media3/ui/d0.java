package io.bidmachine.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.Objects;

/* JADX INFO: compiled from: SubtitlePainter.java */
/* JADX INFO: loaded from: classes4.dex */
final class d0 {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f20197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f20198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f20199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f20200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f20201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f20202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f20203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f20204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f20205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Layout.Alignment f20206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f20207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f20208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f20210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f20211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f20212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f20213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f20214r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20215s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20216t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f20217u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f20218v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f20219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f20220x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f20221y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f20222z;

    public d0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f20201e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f20200d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f20197a = fRound;
        this.f20198b = fRound;
        this.f20199c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f20202f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f20203g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f20204h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f20207k, (Rect) null, this.J, this.f20204h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        x7.a.e(this.J);
        x7.a.e(this.f20207k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f20217u) > 0) {
            this.f20203g.setColor(this.f20217u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f20203g);
        }
        int i10 = this.f20219w;
        if (i10 == 1) {
            this.f20202f.setStrokeJoin(Paint.Join.ROUND);
            this.f20202f.setStrokeWidth(this.f20197a);
            this.f20202f.setColor(this.f20218v);
            this.f20202f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f20202f;
            float f10 = this.f20198b;
            float f11 = this.f20199c;
            textPaint.setShadowLayer(f10, f11, f11, this.f20218v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f20218v;
            int i12 = z10 ? this.f20218v : -1;
            float f12 = this.f20198b / 2.0f;
            this.f20202f.setColor(this.f20215s);
            this.f20202f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f20202f.setShadowLayer(this.f20198b, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.f20202f.setShadowLayer(this.f20198b, f12, f12, i12);
        }
        this.f20202f.setColor(this.f20215s);
        this.f20202f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f20202f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    private void f() {
        float f10;
        int i10;
        float f11;
        Bitmap bitmap = this.f20207k;
        int i11 = this.C;
        int i12 = this.A;
        int i13 = this.D;
        int i14 = this.B;
        float f12 = i11 - i12;
        float f13 = i12 + (this.f20211o * f12);
        float f14 = i13 - i14;
        float f15 = i14 + (this.f20208l * f14);
        int iRound = Math.round(f12 * this.f20213q);
        float f16 = this.f20214r;
        int iRound2 = f16 != -3.4028235E38f ? Math.round(f14 * f16) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i15 = this.f20212p;
        if (i15 != 2) {
            if (i15 == 1) {
                f10 = iRound / 2;
            }
            int iRound3 = Math.round(f13);
            i10 = this.f20210n;
            if (i10 == 2) {
                if (i10 == 1) {
                    f11 = iRound2 / 2;
                }
                int iRound4 = Math.round(f15);
                this.J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f11 = iRound2;
            f15 -= f11;
            int iRound5 = Math.round(f15);
            this.J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f10 = iRound;
        f13 -= f10;
        int iRound6 = Math.round(f13);
        i10 = this.f20210n;
        if (i10 == 2) {
            if (i10 == 1) {
                f11 = iRound2 / 2;
            }
            int iRound7 = Math.round(f15);
            this.J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f11 = iRound2;
        f15 -= f11;
        int iRound8 = Math.round(f15);
        this.J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    private void g() {
        int i10;
        int i11;
        int iMax;
        int iMin;
        int iRound;
        int i12;
        CharSequence charSequence = this.f20205i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f20205i);
        int i13 = this.C - this.A;
        int i14 = this.D - this.B;
        this.f20202f.setTextSize(this.f20220x);
        int i15 = (int) ((this.f20220x * 0.125f) + 0.5f);
        int i16 = i15 * 2;
        int i17 = i13 - i16;
        float f10 = this.f20213q;
        if (f10 != -3.4028235E38f) {
            i17 = (int) (i17 * f10);
        }
        int i18 = i17;
        if (i18 <= 0) {
            x7.r.h("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f20221y > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f20221y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f20219w == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.f20216t) > 0) {
            int i19 = this.f20219w;
            if (i19 == 0 || i19 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f20216t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f20216t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f20206j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f20202f, i18, alignment2, this.f20200d, this.f20201e, true);
        this.E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.E.getLineCount();
        int iMax2 = 0;
        for (int i20 = 0; i20 < lineCount; i20++) {
            iMax2 = Math.max((int) Math.ceil(this.E.getLineWidth(i20)), iMax2);
        }
        if (this.f20213q == -3.4028235E38f || iMax2 >= i18) {
            i18 = iMax2;
        }
        int i21 = i18 + i16;
        float f11 = this.f20211o;
        if (f11 != -3.4028235E38f) {
            int iRound2 = Math.round(i13 * f11);
            int i22 = this.A;
            int i23 = iRound2 + i22;
            int i24 = this.f20212p;
            i10 = 1;
            if (i24 != 1) {
                i11 = 2;
                if (i24 == 2) {
                    i23 -= i21;
                }
            } else {
                i11 = 2;
                i23 = ((i23 * 2) - i21) / 2;
            }
            iMax = Math.max(i23, i22);
            iMin = Math.min(i21 + iMax, this.C);
        } else {
            i10 = 1;
            i11 = 2;
            iMax = ((i13 - i21) / 2) + this.A;
            iMin = iMax + i21;
        }
        int i25 = iMin - iMax;
        if (i25 <= 0) {
            x7.r.h("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f12 = this.f20208l;
        if (f12 != -3.4028235E38f) {
            if (this.f20209m == 0) {
                iRound = Math.round(i14 * f12) + this.B;
                int i26 = this.f20210n;
                if (i26 == i11) {
                    iRound -= height;
                } else if (i26 == i10) {
                    iRound = ((iRound * 2) - height) / i11;
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f13 = this.f20208l;
                if (f13 >= 0.0f) {
                    iRound = Math.round(f13 * lineBottom) + this.B;
                } else {
                    iRound = Math.round((f13 + 1.0f) * lineBottom) + this.D;
                    iRound -= height;
                }
            }
            int i27 = iRound + height;
            int i28 = this.D;
            if (i27 <= i28) {
                int i29 = this.B;
                if (iRound < i29) {
                    i12 = i29;
                }
                this.E = new StaticLayout(spannableStringBuilder, this.f20202f, i25, alignment2, this.f20200d, this.f20201e, true);
                this.F = new StaticLayout(spannableStringBuilder2, this.f20202f, i25, alignment2, this.f20200d, this.f20201e, true);
                this.G = iMax;
                this.H = i12;
                this.I = i15;
            }
            iRound = i28 - height;
        } else {
            iRound = (this.D - height) - ((int) (i14 * this.f20222z));
        }
        i12 = iRound;
        this.E = new StaticLayout(spannableStringBuilder, this.f20202f, i25, alignment2, this.f20200d, this.f20201e, true);
        this.F = new StaticLayout(spannableStringBuilder2, this.f20202f, i25, alignment2, this.f20200d, this.f20201e, true);
        this.G = iMax;
        this.H = i12;
        this.I = i15;
    }

    public void b(w7.a aVar, fa.a aVar2, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = aVar.f27546d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(aVar.f27543a)) {
            return;
        } else {
            i14 = aVar.f27554l ? aVar.f27555m : aVar2.f14762c;
        }
        if (a(this.f20205i, aVar.f27543a) && Objects.equals(this.f20206j, aVar.f27544b) && this.f20207k == aVar.f27546d && this.f20208l == aVar.f27547e && this.f20209m == aVar.f27548f && Objects.equals(Integer.valueOf(this.f20210n), Integer.valueOf(aVar.f27549g)) && this.f20211o == aVar.f27550h && Objects.equals(Integer.valueOf(this.f20212p), Integer.valueOf(aVar.f27551i)) && this.f20213q == aVar.f27552j && this.f20214r == aVar.f27553k && this.f20215s == aVar2.f14760a && this.f20216t == aVar2.f14761b && this.f20217u == i14 && this.f20219w == aVar2.f14763d && this.f20218v == aVar2.f14764e && Objects.equals(this.f20202f.getTypeface(), aVar2.f14765f) && this.f20220x == f10 && this.f20221y == f11 && this.f20222z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            d(canvas, z10);
            return;
        }
        this.f20205i = aVar.f27543a;
        this.f20206j = aVar.f27544b;
        this.f20207k = aVar.f27546d;
        this.f20208l = aVar.f27547e;
        this.f20209m = aVar.f27548f;
        this.f20210n = aVar.f27549g;
        this.f20211o = aVar.f27550h;
        this.f20212p = aVar.f27551i;
        this.f20213q = aVar.f27552j;
        this.f20214r = aVar.f27553k;
        this.f20215s = aVar2.f14760a;
        this.f20216t = aVar2.f14761b;
        this.f20217u = i14;
        this.f20219w = aVar2.f14763d;
        this.f20218v = aVar2.f14764e;
        this.f20202f.setTypeface(aVar2.f14765f);
        this.f20220x = f10;
        this.f20221y = f11;
        this.f20222z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            x7.a.e(this.f20205i);
            g();
        } else {
            x7.a.e(this.f20207k);
            f();
        }
        d(canvas, z10);
    }
}
