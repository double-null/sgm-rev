package wb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: compiled from: ImageUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f27707a = new j();

    private j() {
    }

    public static final BitmapFactory.Options a() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return options;
    }

    public static final Bitmap b(byte[] byteImage, BitmapFactory.Options bitmapFactoryOptions) {
        kotlin.jvm.internal.t.f(byteImage, "byteImage");
        kotlin.jvm.internal.t.f(bitmapFactoryOptions, "bitmapFactoryOptions");
        return k.c(byteImage, bitmapFactoryOptions);
    }
}
