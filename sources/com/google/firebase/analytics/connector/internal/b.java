package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.common.collect.u;
import com.google.common.collect.w;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w f11899a = w.K("_in", "_xa", "_xu", edUJlCZxhVnO.bCLwPQujXceizG, "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u f11900b = u.Y("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f11901c = u.N("auto", "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u f11902d = u.K("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u f11903e = new u.a().j(zzjo.zza).j(zzjo.zzb).m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final u f11904f = u.K("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f11905g = 0;

    public static boolean a(String str) {
        return !f11901c.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(String str, Bundle bundle) {
        if (f11900b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        u uVar = f11902d;
        int size = uVar.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) uVar.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f11899a.contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str, String str2, Bundle bundle) {
        byte b10;
        if (!UICvx.bdNCg.equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        u uVar = f11902d;
        int size = uVar.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) uVar.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("fdl")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b10 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b10 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }
}
