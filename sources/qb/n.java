package qb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.t;
import wb.e0;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f24737a = new n();

    private n() {
    }

    public final Drawable a(Context context, String str) {
        byte[] bArrE;
        Bitmap bitmapD;
        BitmapDrawable bitmapDrawableH;
        t.f(context, "context");
        if (str == null) {
            return null;
        }
        try {
            String strZ = e0.z(str);
            if (strZ == null || (bArrE = e0.e(strZ, 0)) == null || (bitmapD = wb.k.d(bArrE, null, 1, null)) == null || (bitmapDrawableH = wb.k.h(bitmapD, context)) == null) {
                return null;
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawableH.setTileModeXY(tileMode, tileMode);
            return bitmapDrawableH;
        } catch (Throwable unused) {
            return null;
        }
    }
}
