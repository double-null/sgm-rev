package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f8910a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f8911b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collection f8912c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f8913d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f8914e = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8916b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EnumC0121a f8917c = EnumC0121a.NOT_SET;

        /* JADX INFO: renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        public enum EnumC0121a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f8922a;

            EnumC0121a(String str) {
                this.f8922a = str;
            }

            public String b() {
                return this.f8922a;
            }
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0121a b() {
            return this.f8917c;
        }

        public boolean c() {
            return this.f8915a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            EnumC0121a enumC0121aB = b();
            EnumC0121a enumC0121aB2 = aVar.b();
            return enumC0121aB != null ? enumC0121aB.equals(enumC0121aB2) : enumC0121aB2 == null;
        }

        public int hashCode() {
            int i10 = c() ? 79 : 97;
            String strA = a();
            int iHashCode = ((i10 + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            EnumC0121a enumC0121aB = b();
            return (iHashCode * 59) + (enumC0121aB != null ? enumC0121aB.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(boolean z10) {
            this.f8915a = z10;
        }

        public void a(String str) {
            this.f8916b = str;
        }

        public void a(EnumC0121a enumC0121a) {
            this.f8917c = enumC0121a;
        }

        public String a() {
            return this.f8916b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        q7.a();
        Object obj = f8911b;
        synchronized (obj) {
            if (f8913d) {
                return f8914e;
            }
            Collection collection = f8912c;
            boolean zIsEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (zIsEmpty) {
                a aVarC = c(context);
                synchronized (obj) {
                    f8913d = true;
                    f8914e = aVarC;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) it.next()).countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                    com.applovin.impl.sdk.p.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e10) {
                com.applovin.impl.sdk.p.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e10);
            }
            synchronized (f8911b) {
                aVar = f8914e;
            }
            return aVar;
        }
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return aVarCollectGoogleAdvertisingInfo == null ? new a() : aVarCollectGoogleAdvertisingInfo;
    }

    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f8910a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z10);
                aVar.a(z10 ? a.EnumC0121a.ON : a.EnumC0121a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e10) {
                com.applovin.impl.sdk.p.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e10);
            } catch (Throwable th) {
                com.applovin.impl.sdk.p.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f8910a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        q7.a();
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.p.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(zIsLimitAdTrackingEnabled);
            aVar.a(zIsLimitAdTrackingEnabled ? a.EnumC0121a.ON : a.EnumC0121a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.p.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }

    public static boolean a() {
        return q7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
