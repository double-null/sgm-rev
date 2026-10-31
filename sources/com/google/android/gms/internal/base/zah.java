package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zah extends Drawable implements Drawable.Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private boolean zag;
    private boolean zah;
    private zag zai;
    private Drawable zaj;
    private Drawable zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private int zao;

    public zah(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? zaf.zaa : drawable;
        this.zaj = drawable;
        drawable.setCallback(this);
        zag zagVar = this.zai;
        zagVar.zab = drawable.getChangingConfigurations() | zagVar.zab;
        drawable2 = drawable2 == null ? zaf.zaa : drawable2;
        this.zak = drawable2;
        drawable2.setCallback(this);
        zag zagVar2 = this.zai;
        zagVar2.zab = drawable2.getChangingConfigurations() | zagVar2.zab;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11 = this.zaa;
        int i12 = 0;
        if (i11 == 1) {
            this.zab = SystemClock.uptimeMillis();
            this.zaa = 2;
            z10 = false;
        } else if (i11 == 2 && this.zab >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.zab) / this.zae;
            z10 = fUptimeMillis >= 1.0f;
            if (z10) {
                this.zaa = 0;
            }
            this.zaf = (int) ((this.zac * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
        } else {
            z10 = true;
        }
        int i13 = this.zaf;
        boolean z11 = this.zag;
        Drawable drawable = this.zaj;
        Drawable drawable2 = this.zak;
        if (!z10) {
            if (z11) {
                drawable.setAlpha(this.zad - i13);
                i12 = 1;
            }
            drawable.draw(canvas);
            if (i12 != 0) {
                drawable.setAlpha(this.zad);
            }
            if (i13 > 0) {
                drawable2.setAlpha(i13);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.zad);
            }
            invalidateSelf();
            return;
        }
        if (z11) {
            if (i13 == 0) {
            }
            i10 = this.zad;
            if (i13 == i10) {
                drawable2.setAlpha(i10);
                drawable2.draw(canvas);
            }
        }
        i12 = i13;
        drawable.draw(canvas);
        i13 = i12;
        i10 = this.zad;
        if (i13 == i10) {
            drawable2.setAlpha(i10);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zag zagVar = this.zai;
        return changingConfigurations | zagVar.zaa | zagVar.zab;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!zaa()) {
            return null;
        }
        this.zai.zaa = getChangingConfigurations();
        return this.zai;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.zan) {
            this.zao = Drawable.resolveOpacity(this.zaj.getOpacity(), this.zak.getOpacity());
            this.zan = true;
        }
        return this.zao;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.zah && super.mutate() == this) {
            if (!zaa()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.zaj.mutate();
            this.zak.mutate();
            this.zah = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.zaj.setBounds(rect);
        this.zak.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.zaf == this.zad) {
            this.zaf = i10;
        }
        this.zad = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.zaj.setColorFilter(colorFilter);
        this.zak.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean zaa() {
        if (!this.zal) {
            boolean z10 = false;
            if (this.zaj.getConstantState() != null && this.zak.getConstantState() != null) {
                z10 = true;
            }
            this.zam = z10;
            this.zal = true;
        }
        return this.zam;
    }

    public final Drawable zab() {
        return this.zak;
    }

    public final void zac(int i10) {
        this.zac = this.zad;
        this.zaf = 0;
        this.zae = 250;
        this.zaa = 1;
        invalidateSelf();
    }

    zah(zag zagVar) {
        this.zaa = 0;
        this.zad = 255;
        this.zaf = 0;
        this.zag = true;
        this.zai = new zag(zagVar);
    }
}
