package u6;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.u;
import io.bidmachine.protobuf.Waterfall;
import q6.s;

/* JADX INFO: loaded from: classes4.dex */
public class a extends r6.a {

    /* JADX INFO: renamed from: u6.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0437a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25906a;

        static {
            int[] iArr = new int[AdsFormat.values().length];
            f25906a = iArr;
            try {
                iArr[AdsFormat.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25906a[AdsFormat.Banner_320x50.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25906a[AdsFormat.Banner_728x90.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25906a[AdsFormat.Banner_300x250.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25906a[AdsFormat.Interstitial.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25906a[AdsFormat.InterstitialStatic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25906a[AdsFormat.InterstitialVideo.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25906a[AdsFormat.Rewarded.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25906a[AdsFormat.RewardedStatic.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25906a[AdsFormat.RewardedVideo.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public a() {
        super(21, new uc.a(23, 0, 0));
    }

    private boolean f() {
        try {
            int i10 = AdManagerAdView.f11216a;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean g(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return false;
            }
            return !TextUtils.isEmpty(bundle.getString("com.google.android.gms.ads.APPLICATION_ID"));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // r6.b
    public void a(Context context) {
        MobileAds.initialize(context);
    }

    @Override // r6.b
    public boolean d(Context context) {
        return g(context) && f();
    }

    @Override // r6.b
    public u e(s sVar, q6.u uVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, q6.k kVar) {
        switch (C0437a.f25906a[adsFormat.ordinal()]) {
            case 1:
            case 2:
                return new b(sVar, uVar, adsFormat, adUnit, kVar, AdSize.BANNER);
            case 3:
                return new b(sVar, uVar, adsFormat, adUnit, kVar, AdSize.LEADERBOARD);
            case 4:
                return new b(sVar, uVar, adsFormat, adUnit, kVar, AdSize.MEDIUM_RECTANGLE);
            case 5:
            case 6:
            case 7:
                return new g(sVar, uVar, adsFormat, adUnit, kVar);
            case 8:
            case 9:
            case 10:
                return new k(sVar, uVar, adsFormat, adUnit, kVar);
            default:
                return null;
        }
    }

    @Override // r6.b
    public uc.a getVersion() {
        VersionInfo version = MobileAds.getVersion();
        return new uc.a(version.getMajorVersion(), version.getMinorVersion(), version.getMicroVersion());
    }
}
