package wb;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* JADX INFO: compiled from: BitmapUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27681a = new a();

    private a() {
    }

    public final Rect a(Bitmap bitmap, Rect rect) {
        kotlin.jvm.internal.t.f(bitmap, "bitmap");
        if (rect == null) {
            return new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        }
        Rect rect2 = new Rect(Math.max(0, rect.left), Math.max(0, rect.top), Math.min(bitmap.getWidth(), rect.right), Math.min(bitmap.getHeight(), rect.bottom));
        if (rect2.isEmpty()) {
            return null;
        }
        return rect2;
    }
}
