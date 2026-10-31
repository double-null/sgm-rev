package nb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import kotlin.jvm.internal.t;
import wb.e0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends Button {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        t.f(context, "context");
        setAllCaps(false);
        setMinHeight(e0.k(context, 40.0f));
        setMinWidth(0);
        setGravity(8388627);
        setIncludeFontPadding(false);
        setElevation(0.0f);
        setStateListAnimator(null);
        int iK = e0.k(context, 24.0f);
        int iK2 = e0.k(context, 10.0f);
        int iK3 = e0.k(context, 8.0f);
        setPadding(iK, iK2, iK, iK2);
        setCompoundDrawablePadding(iK3);
        setBackgroundResource(la.b.f21915a);
        setTextColor(e0.r(context, la.a.f21914b));
    }

    private final Drawable a(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Context context = getContext();
        t.e(context, "context");
        int iK = e0.k(context, 24.0f);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == iK && height == iK) {
            return drawable;
        }
        float f10 = iK;
        float f11 = width;
        float f12 = height;
        float fMin = Math.min(f10 / f11, f10 / f12);
        return new BitmapDrawable(getContext().getResources(), Bitmap.createScaledBitmap(bitmap, (int) (f11 * fMin), (int) (f12 * fMin), true));
    }

    public final void setActionIcon(Drawable drawable) {
        Drawable drawableMutate;
        Context context = getContext();
        t.e(context, "context");
        int iR = e0.r(context, la.a.f21913a);
        if (drawable != null) {
            drawableMutate = a(drawable).mutate();
            drawableMutate.setTint(iR);
        } else {
            drawableMutate = null;
        }
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate, (Drawable) null);
    }
}
