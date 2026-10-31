package ib;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements m {
    @Override // ib.m
    public int[] a(Bitmap bitmap, Rect rect) {
        t.f(bitmap, "bitmap");
        t.f(rect, "rect");
        int[] iArr = new int[rect.width() * rect.height()];
        bitmap.getPixels(iArr, 0, rect.width(), rect.left, rect.top, rect.width(), rect.height());
        return iArr;
    }
}
