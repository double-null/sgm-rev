package y6;

import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.BannerAdSize;

/* JADX INFO: compiled from: BannerSize.java */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(since = "3.5.0")
public enum d {
    Size_320x50(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50),
    Size_300x250(300, 250),
    Size_728x90(728, 90);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28677b;

    /* JADX INFO: compiled from: BannerSize.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28678a;

        static {
            int[] iArr = new int[d.values().length];
            f28678a = iArr;
            try {
                iArr[d.Size_300x250.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28678a[d.Size_728x90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    d(int i10, int i11) {
        this.f28676a = i10;
        this.f28677b = i11;
    }

    public static BannerAdSize c(d dVar) {
        int i10 = a.f28678a[dVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? BannerAdSize.Banner : BannerAdSize.Leaderboard;
        }
        return BannerAdSize.MediumRectangle;
    }
}
