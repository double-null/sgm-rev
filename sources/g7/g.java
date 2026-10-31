package g7;

import android.graphics.Point;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static final Point a(PointF pointF, int i10, int i11) {
        kotlin.jvm.internal.t.f(pointF, "<this>");
        return new Point(kd.c.a(i10 * pointF.x), kd.c.a(i11 * pointF.y));
    }
}
