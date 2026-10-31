package fa;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* JADX INFO: compiled from: CaptionStyleCompat.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f14759g = new a(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Typeface f14765f;

    public a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f14760a = i10;
        this.f14761b = i11;
        this.f14762c = i12;
        this.f14763d = i13;
        this.f14764e = i14;
        this.f14765f = typeface;
    }

    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f14759g.f14760a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f14759g.f14761b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f14759g.f14762c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f14759g.f14763d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f14759g.f14764e, captionStyle.getTypeface());
    }
}
