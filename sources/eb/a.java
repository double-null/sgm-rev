package eb;

import android.graphics.Bitmap;
import android.graphics.Color;
import kotlin.jvm.internal.t;
import pb.p;
import wb.d0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f14516a;

    public a(p algorithmParams) {
        t.f(algorithmParams, "algorithmParams");
        this.f14516a = algorithmParams;
    }

    public final float a(int i10) {
        return (d0.z(i10) * 0.299f) + (d0.q(i10) * 0.587f) + (d0.a(i10) * 0.114f);
    }

    public final int b(Bitmap bitmap, int i10, int i11) {
        t.f(bitmap, "<this>");
        return f(bitmap.getPixel(i10, i11));
    }

    public abstract Boolean c(Bitmap bitmap);

    public final p d() {
        return this.f14516a;
    }

    public final void e(Float f10, Boolean bool) {
        if (pa.t.j()) {
            pa.t.g("BrokenCreativeDetector", this.f14516a.b().name() + " result - " + f10 + " (isBroken - " + bool + ')', new Object[0]);
        }
    }

    public final int f(int i10) {
        return (int) ((Color.red(i10) * 0.299f) + (Color.green(i10) * 0.587f) + (Color.blue(i10) * 0.114f));
    }

    public final Boolean g(Bitmap image) {
        t.f(image, "image");
        try {
            return c(image);
        } catch (Throwable unused) {
            return null;
        }
    }
}
