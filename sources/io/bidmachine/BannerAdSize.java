package io.bidmachine;

import android.util.Size;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: BannerAdSize.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BannerAdSize {
    public static final BannerAdSize Banner;
    public static final Companion Companion = new Companion(null);
    private static final BannerAdSize[] FIXED_BANNER_AD_SIZES;
    public static final BannerAdSize Leaderboard;
    public static final BannerAdSize MediumRectangle;
    public static final BannerAdSize Undefined;
    private final int height;
    private final boolean isAdaptive;
    private final int width;

    /* JADX INFO: compiled from: BannerAdSize.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final BannerAdSize adaptive(int i10, int i11) {
            return new BannerAdSize(i10, i11, true, null);
        }

        public final BannerAdSize firstFixedOrNull(int i10, int i11) {
            for (BannerAdSize bannerAdSize : BannerAdSize.FIXED_BANNER_AD_SIZES) {
                if (bannerAdSize.isSuitable(i10, i11)) {
                    return bannerAdSize;
                }
            }
            return null;
        }

        public final int getMaxAdaptiveHeight(int i10) {
            BannerAdSize bannerAdSize = BannerAdSize.Leaderboard;
            return i10 >= bannerAdSize.getWidth() ? bannerAdSize.getHeight() : BannerAdSize.Banner.getHeight();
        }
    }

    static {
        boolean z10 = false;
        int i10 = 4;
        kotlin.jvm.internal.k kVar = null;
        BannerAdSize bannerAdSize = new BannerAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, z10, i10, kVar);
        Banner = bannerAdSize;
        BannerAdSize bannerAdSize2 = new BannerAdSize(728, 90, false, 4, null);
        Leaderboard = bannerAdSize2;
        BannerAdSize bannerAdSize3 = new BannerAdSize(300, 250, z10, i10, kVar);
        MediumRectangle = bannerAdSize3;
        Undefined = new BannerAdSize(-1, -1, false, 4, null);
        FIXED_BANNER_AD_SIZES = new BannerAdSize[]{bannerAdSize, bannerAdSize2, bannerAdSize3};
    }

    public /* synthetic */ BannerAdSize(int i10, int i11, boolean z10, kotlin.jvm.internal.k kVar) {
        this(i10, i11, z10);
    }

    public static final BannerAdSize adaptive(int i10, int i11) {
        return Companion.adaptive(i10, i11);
    }

    public static final BannerAdSize firstFixedOrNull(int i10, int i11) {
        return Companion.firstFixedOrNull(i10, i11);
    }

    public static final int getMaxAdaptiveHeight(int i10) {
        return Companion.getMaxAdaptiveHeight(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.t.a(BannerAdSize.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type io.bidmachine.BannerAdSize");
        BannerAdSize bannerAdSize = (BannerAdSize) obj;
        return this.width == bannerAdSize.width && this.height == bannerAdSize.height && this.isAdaptive == bannerAdSize.isAdaptive;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((this.width * 31) + this.height) * 31) + Boolean.hashCode(this.isAdaptive);
    }

    public final boolean isAdaptive() {
        return this.isAdaptive;
    }

    public final boolean isSuitable(BannerAdSize other) {
        kotlin.jvm.internal.t.f(other, "other");
        return isSuitable(other.width, other.height);
    }

    public final Size toSize() {
        return new Size(this.width, this.height);
    }

    public String toString() {
        return "BannerAdSize(width=" + this.width + ", height=" + this.height + ", isAdaptive=" + this.isAdaptive + ')';
    }

    private BannerAdSize(int i10, int i11, boolean z10) {
        this.width = i10;
        this.height = i11;
        this.isAdaptive = z10;
    }

    public final boolean isSuitable(int i10, int i11) {
        int i12;
        if (this.isAdaptive) {
            if (this.width >= i10 && ((i12 = this.height) == 0 || i12 >= i11)) {
                return true;
            }
        } else if (this.width == i10 && this.height == i11) {
            return true;
        }
        return false;
    }

    /* synthetic */ BannerAdSize(int i10, int i11, boolean z10, int i12, kotlin.jvm.internal.k kVar) {
        this(i10, i11, (i12 & 4) != 0 ? false : z10);
    }
}
