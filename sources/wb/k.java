package wb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: compiled from: ImageUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {
    public static final Bitmap a(Bitmap bitmap, double d10) {
        Bitmap bitmapCreateScaledBitmap;
        kotlin.jvm.internal.t.f(bitmap, "<this>");
        if (d10 <= 1.0d) {
            return bitmap;
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((double) bitmap.getWidth()) / d10), (int) (((double) bitmap.getHeight()) / d10), true);
        } catch (Throwable unused) {
            bitmapCreateScaledBitmap = null;
        }
        return bitmapCreateScaledBitmap == null ? bitmap : bitmapCreateScaledBitmap;
    }

    public static final Bitmap b(byte[] bArr, BitmapFactory.Options options) throws Throwable {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public static final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        try {
            return b(bArr, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ Bitmap d(byte[] bArr, BitmapFactory.Options options, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            options = null;
        }
        return c(bArr, options);
    }

    public static final Bitmap e(File file, BitmapFactory.Options bitmapFactoryOptions) throws Throwable {
        kotlin.jvm.internal.t.f(file, "<this>");
        kotlin.jvm.internal.t.f(bitmapFactoryOptions, "bitmapFactoryOptions");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), bitmapFactoryOptions);
        kotlin.jvm.internal.t.e(bitmapDecodeFile, "decodeFile(path, bitmapFactoryOptions)");
        return bitmapDecodeFile;
    }

    public static final Bitmap f(File file, BitmapFactory.Options bitmapFactoryOptions) {
        kotlin.jvm.internal.t.f(file, "<this>");
        kotlin.jvm.internal.t.f(bitmapFactoryOptions, "bitmapFactoryOptions");
        if (!ac.b.i(file)) {
            return null;
        }
        try {
            return e(file, bitmapFactoryOptions);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void g(Bitmap bitmap) {
        kotlin.jvm.internal.t.f(bitmap, "<this>");
        try {
            bitmap.recycle();
            wc.g0 g0Var = wc.g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    public static final BitmapDrawable h(Bitmap bitmap, Context context) {
        kotlin.jvm.internal.t.f(bitmap, "<this>");
        kotlin.jvm.internal.t.f(context, "context");
        Resources resources = context.getResources();
        kotlin.jvm.internal.t.e(resources, "context.resources");
        return i(bitmap, resources);
    }

    public static final BitmapDrawable i(Bitmap bitmap, Resources resources) {
        kotlin.jvm.internal.t.f(bitmap, "<this>");
        kotlin.jvm.internal.t.f(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
