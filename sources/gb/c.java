package gb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f15549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Shader f15550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Shader f15551c;

    public c(RectF bounds, int[] colors, Bitmap.Config bitmapConfig, boolean z10) {
        t.f(bounds, "bounds");
        t.f(colors, "colors");
        t.f(bitmapConfig, "bitmapConfig");
        this.f15549a = z10;
        this.f15550b = new a(bounds, colors, bitmapConfig);
        this.f15551c = (!z10 || Build.VERSION.SDK_INT < 33) ? null : new b(bounds, colors);
    }

    @Override // gb.e
    public Shader a(boolean z10) {
        Shader shader;
        return (this.f15549a && (shader = this.f15551c) != null && z10) ? shader : this.f15550b;
    }

    public /* synthetic */ c(RectF rectF, int[] iArr, Bitmap.Config config, boolean z10, int i10, k kVar) {
        this(rectF, iArr, (i10 & 4) != 0 ? Bitmap.Config.ARGB_8888 : config, (i10 & 8) != 0 ? Build.VERSION.SDK_INT >= 33 : z10);
    }
}
