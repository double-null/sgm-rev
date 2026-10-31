package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: compiled from: BatteryState.java */
/* JADX INFO: loaded from: classes4.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Float f12114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12115b;

    private d(Float f10, boolean z10) {
        this.f12115b = z10;
        this.f12114a = f10;
    }

    public static d a(Context context) {
        boolean zE = false;
        Float fD = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zE = e(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e10) {
            z2.f.f().e("An error occurred getting battery state.", e10);
        }
        return new d(fD, zE);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f12114a;
    }

    public int c() {
        Float f10;
        if (!this.f12115b || (f10 = this.f12114a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}
