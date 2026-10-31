package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
class AdvertisingDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16425a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<b> f16426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f16427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AdvertisingData f16428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f16429e;

    public static class AdvertisingData {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f16430id;
        private final boolean limitAdTrackingEnabled;

        public AdvertisingData(String str, boolean z10) {
            this.f16430id = str;
            this.limitAdTrackingEnabled = z10;
        }

        public String getId() {
            return this.f16430id;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }
    }

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f16431a = new AtomicBoolean(true);

        private boolean b() {
            return this.f16431a.get();
        }

        protected abstract AdvertisingData a(Context context) throws Throwable;

        public AdvertisingData c(Context context) {
            if (!b()) {
                return null;
            }
            try {
                return a(context);
            } catch (NoClassDefFoundError e10) {
                d(false);
                io.bidmachine.core.a.o(e10);
                return null;
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
                return null;
            }
        }

        protected void d(boolean z10) {
            this.f16431a.set(z10);
        }
    }

    private static class c extends b {
        private c() {
        }

        @Override // io.bidmachine.AdvertisingDataManager.b
        protected AdvertisingData a(Context context) throws Throwable {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                if (advertisingIdInfo != null) {
                    return new AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
                }
                return null;
            } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException unused) {
                d(false);
                return null;
            }
        }
    }

    private static class d extends b {
        private d() {
        }

        @Override // io.bidmachine.AdvertisingDataManager.b
        protected AdvertisingData a(Context context) throws Throwable {
            com.huawei.hms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.huawei.hms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                return new AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
            }
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f16426b = arrayList;
        arrayList.add(new c());
        arrayList.add(new d());
    }

    static String a(Context context, boolean z10) {
        if (z10) {
            return "00000000-0000-0000-0000-000000000000";
        }
        AdvertisingData advertisingData = f16428d;
        String id2 = advertisingData != null ? advertisingData.getId() : null;
        return (TextUtils.isEmpty(id2) || "00000000-0000-0000-0000-000000000000".equals(id2)) ? c(context) : id2;
    }

    static boolean b() {
        AdvertisingData advertisingData = f16428d;
        return advertisingData != null && advertisingData.isLimitAdTrackingEnabled();
    }

    private static String c(Context context) {
        if (!TextUtils.isEmpty(f16429e)) {
            return f16429e;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ad_core_preferences", 0);
        String strE = wb.x.e(sharedPreferences, "uuid", null);
        f16429e = strE;
        if (!TextUtils.isEmpty(strE)) {
            return f16429e;
        }
        f16429e = f16425a;
        sharedPreferences.edit().putString("uuid", f16429e).apply();
        return f16429e;
    }

    static void d(Context context) {
        b bVar = f16427c;
        if (bVar != null) {
            AdvertisingData advertisingDataC = bVar.c(context);
            if (advertisingDataC != null) {
                f16428d = advertisingDataC;
                return;
            }
            return;
        }
        for (b bVar2 : f16426b) {
            AdvertisingData advertisingDataC2 = bVar2.c(context);
            if (advertisingDataC2 != null) {
                f16427c = bVar2;
                f16428d = advertisingDataC2;
                return;
            }
        }
    }
}
