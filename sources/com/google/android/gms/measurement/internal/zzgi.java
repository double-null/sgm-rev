package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzaja;
import com.vungle.ads.internal.signals.SignalManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgi extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private final String zzk;
    private int zzl;
    private String zzm;
    private String zzn;
    private long zzo;
    private String zzp;

    zzgi(zzic zzicVar, long j10, long j11, String str) {
        super(zzicVar);
        this.zzo = 0L;
        this.zzp = null;
        this.zzg = j10;
        this.zzh = j11;
        this.zzk = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:46:0x0147  */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x0176 A[Catch: IllegalStateException -> 0x01a2, TryCatch #1 {IllegalStateException -> 0x01a2, blocks: (B:49:0x016d, B:53:0x0184, B:57:0x018c, B:59:0x0190, B:52:0x0176), top: B:83:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x018a  */
    /* JADX WARN: Code duplicated, block: B:56:0x018b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0190 A[Catch: IllegalStateException -> 0x01a2, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x01a2, blocks: (B:49:0x016d, B:53:0x0184, B:57:0x018c, B:59:0x0190, B:52:0x0176), top: B:83:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01df  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fc A[EDGE_INSN: B:75:0x01fc->B:76:0x01fe BREAK  A[LOOP:0: B:70:0x01e3->B:91:?]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0200  */
    /* JADX WARN: Code duplicated, block: B:79:0x020b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fc A[SYNTHETIC] */
    @Override // com.google.android.gms.measurement.internal.zzg
    protected final void zzf() {
        String str;
        String string;
        zzic zzicVar;
        int iZzC;
        zzic zzicVar2;
        zzic zzicVar3;
        List listZzs;
        Iterator it;
        String strZza;
        zzic zzicVar4 = this.zzu;
        zzicVar4.zzaW().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzicVar4.zzaZ().getPackageName();
        PackageManager packageManager = zzicVar4.zzaZ().getPackageManager();
        String str2 = "";
        int i10 = Integer.MIN_VALUE;
        String str3 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzu.zzaW().zzb().zzb("Error retrieving app installer package name. appId", zzgu.zzl(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzu.zzaZ().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                        try {
                            str3 = packageInfo.versionName;
                            i10 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.zzu.zzaW().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str3;
                this.zzc = i10;
                this.zze = string;
                this.zzf = 0L;
                zzicVar = this.zzu;
                iZzC = zzicVar.zzC();
                if (iZzC != 0) {
                    this.zzu.zzaW().zzk().zza("App measurement collection enabled");
                } else if (iZzC != 1) {
                    this.zzu.zzaW().zzi().zza("App measurement deactivated via the manifest");
                } else if (iZzC != 3) {
                    this.zzu.zzaW().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iZzC != 4) {
                    this.zzu.zzaW().zzi().zza("App measurement disabled via the manifest");
                } else if (iZzC != 6) {
                    this.zzu.zzaW().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iZzC != 7) {
                    this.zzu.zzaW().zzi().zza("App measurement disabled via the global data collection setting");
                } else if (iZzC != 8) {
                    zzic zzicVar5 = this.zzu;
                    zzicVar5.zzaW().zzi().zza("App measurement disabled");
                    zzicVar5.zzaW().zzc().zza("Invalid scion state in identity");
                } else {
                    this.zzu.zzaW().zzi().zza("App measurement disabled due to denied storage consent");
                }
                this.zzm = "";
                zzicVar2 = this.zzu;
                zzicVar2.zzaV();
                strZza = this.zzk;
                if (!TextUtils.isEmpty(strZza)) {
                    strZza = zzlt.zza(zzicVar2.zzaZ(), "google_app_id", zzicVar.zzq());
                }
                if (TextUtils.isEmpty(strZza)) {
                    str2 = strZza;
                }
                this.zzm = str2;
                if (iZzC == 0) {
                    zzicVar2.zzaW().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzm);
                }
                this.zzi = null;
                zzicVar3 = this.zzu;
                zzicVar3.zzaV();
                listZzs = zzicVar3.zzc().zzs("analytics.safelisted_events");
                if (listZzs != null) {
                    this.zzi = listZzs;
                    break;
                } else if (listZzs.isEmpty()) {
                    it = listZzs.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzi = listZzs;
                            break;
                        }
                    } while (zzicVar3.zzk().zzl("safelisted event", (String) it.next()));
                } else {
                    zzicVar3.zzaW().zzh().zza("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.zzl = InstantApps.isInstantApp(zzicVar3.zzaZ()) ? 1 : 0;
                } else {
                    this.zzl = 0;
                }
            }
            zzicVar4.zzaW().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzgu.zzl(packageName));
            strZza = this.zzk;
            if (!TextUtils.isEmpty(strZza)) {
                strZza = zzlt.zza(zzicVar2.zzaZ(), "google_app_id", zzicVar.zzq());
            }
            if (TextUtils.isEmpty(strZza)) {
                str2 = strZza;
            }
            this.zzm = str2;
            if (iZzC == 0) {
                zzicVar2.zzaW().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzm);
            }
        } catch (IllegalStateException e10) {
            this.zzu.zzaW().zzb().zzc("Fetching Google App Id failed with exception. appId", zzgu.zzl(packageName), e10);
        }
        string = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str3;
        this.zzc = i10;
        this.zze = string;
        this.zzf = 0L;
        zzicVar = this.zzu;
        iZzC = zzicVar.zzC();
        if (iZzC != 0) {
            this.zzu.zzaW().zzk().zza("App measurement collection enabled");
        } else if (iZzC != 1) {
            this.zzu.zzaW().zzi().zza("App measurement deactivated via the manifest");
        } else if (iZzC != 3) {
            this.zzu.zzaW().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iZzC != 4) {
            this.zzu.zzaW().zzi().zza("App measurement disabled via the manifest");
        } else if (iZzC != 6) {
            this.zzu.zzaW().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iZzC != 7) {
            this.zzu.zzaW().zzi().zza("App measurement disabled via the global data collection setting");
        } else if (iZzC != 8) {
            zzic zzicVar6 = this.zzu;
            zzicVar6.zzaW().zzi().zza("App measurement disabled");
            zzicVar6.zzaW().zzc().zza("Invalid scion state in identity");
        } else {
            this.zzu.zzaW().zzi().zza("App measurement disabled due to denied storage consent");
        }
        this.zzm = "";
        zzicVar2 = this.zzu;
        zzicVar2.zzaV();
        this.zzi = null;
        zzicVar3 = this.zzu;
        zzicVar3.zzaV();
        listZzs = zzicVar3.zzc().zzs("analytics.safelisted_events");
        if (listZzs != null) {
            this.zzi = listZzs;
            break;
        } else if (listZzs.isEmpty()) {
            it = listZzs.iterator();
            do {
                if (it.hasNext()) {
                    this.zzi = listZzs;
                    break;
                }
            } while (zzicVar3.zzk().zzl("safelisted event", (String) it.next()));
        } else {
            zzicVar3.zzaW().zzh().zza("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.zzl = InstantApps.isInstantApp(zzicVar3.zzaZ()) ? 1 : 0;
        } else {
            this.zzl = 0;
        }
    }

    final void zzi() {
        String str;
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzicVar.zzk().zzf().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzicVar.zzaW().zzj().zza("Analytics Storage consent is not granted");
            str = null;
        }
        zzgs zzgsVarZzj = zzicVar.zzaW().zzj();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        zzgsVarZzj.zza(String.format("Resetting session stitching token to %s", objArr));
        this.zzn = str;
        this.zzo = zzicVar.zzba().currentTimeMillis();
    }

    final String zzj() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzk() {
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzm);
        return this.zzm;
    }

    final String zzl() {
        zzb();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    final int zzm() {
        zzb();
        return this.zzc;
    }

    final long zzn() {
        return this.zzh;
    }

    final int zzo() {
        zzb();
        return this.zzl;
    }

    final List zzp() {
        return this.zzi;
    }

    final boolean zzq(String str) {
        String str2 = this.zzp;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.zzp = str;
        return z10;
    }

    final zzr zzh(String str) {
        String str2;
        long j10;
        int i10;
        List list;
        String str3;
        int i11;
        int i12;
        long j11;
        long jZzR;
        zzg();
        String strZzj = zzj();
        String strZzk = zzk();
        zzb();
        String str4 = this.zzb;
        zzb();
        long j12 = this.zzc;
        zzb();
        Preconditions.checkNotNull(this.zzd);
        String str5 = this.zzd;
        zzic zzicVar = this.zzu;
        zzicVar.zzc().zzi();
        zzb();
        zzg();
        long j13 = this.zzf;
        if (j13 == 0) {
            zzpp zzppVarZzk = this.zzu.zzk();
            Context contextZzaZ = zzicVar.zzaZ();
            String packageName = zzicVar.zzaZ().getPackageName();
            zzppVarZzk.zzg();
            Preconditions.checkNotNull(contextZzaZ);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzaZ.getPackageManager();
            MessageDigest messageDigestZzQ = zzpp.zzQ();
            if (messageDigestZzQ == null) {
                zzppVarZzk.zzu.zzaW().zzb().zza("Could not get MD5 instance");
                j13 = -1;
            } else if (packageManager != null) {
                try {
                    if (zzppVarZzk.zzag(contextZzaZ, packageName)) {
                        jZzR = 0;
                    } else {
                        PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(contextZzaZ);
                        zzic zzicVar2 = zzppVarZzk.zzu;
                        Signature[] signatureArr = packageManagerWrapperPackageManager.getPackageInfo(zzicVar2.zzaZ().getPackageName(), 64).signatures;
                        if (signatureArr == null || signatureArr.length <= 0) {
                            zzicVar2.zzaW().zze().zza("Could not get signatures");
                            jZzR = -1;
                        } else {
                            jZzR = zzpp.zzR(messageDigestZzQ.digest(signatureArr[0].toByteArray()));
                        }
                    }
                    j13 = jZzR;
                } catch (PackageManager.NameNotFoundException e10) {
                    zzppVarZzk.zzu.zzaW().zzb().zzb("Package name not found", e10);
                    j13 = 0;
                }
            } else {
                j13 = 0;
            }
            this.zzf = j13;
        }
        long j14 = j13;
        zzic zzicVar3 = this.zzu;
        boolean zZzB = zzicVar3.zzB();
        boolean z10 = !zzicVar3.zzd().zzm;
        zzg();
        if (zzicVar3.zzB()) {
            zzaja.zza();
            if (zzicVar3.zzc().zzp(null, zzfy.zzaH)) {
                this.zzu.zzaW().zzk().zza("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = zzicVar3.zzaZ().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzu.zzaZ());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                } catch (Exception unused) {
                                    this.zzu.zzaW().zzh().zza("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.zzu.zzaW().zzf().zza(TwDPD.YKgxyQ);
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzic zzicVar4 = this.zzu;
        long jZza = zzicVar4.zzd().zzc.zza();
        long jMin = jZza == 0 ? zzicVar4.zza : Math.min(zzicVar4.zza, jZza);
        zzb();
        int i13 = this.zzl;
        zzic zzicVar5 = this.zzu;
        boolean zZzu = zzicVar5.zzc().zzu();
        zzhh zzhhVarZzd = zzicVar5.zzd();
        zzhhVarZzd.zzg();
        boolean z11 = zzhhVarZzd.zzd().getBoolean("deferred_analytics_collection", false);
        boolean z12 = zzicVar5.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) != zzji.GRANTED;
        long j15 = this.zzg;
        Boolean boolValueOf = Boolean.valueOf(z12);
        List list2 = this.zzi;
        String strZzl = zzicVar5.zzd().zzl().zzl();
        if (this.zzj == null) {
            this.zzj = zzicVar5.zzk().zzaz();
        }
        String str6 = this.zzj;
        if (zzicVar5.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            zzg();
            j10 = 0;
            if (this.zzo == 0) {
                i10 = i13;
                list = list2;
            } else {
                i10 = i13;
                list = list2;
                long jCurrentTimeMillis = zzicVar5.zzba().currentTimeMillis() - this.zzo;
                if (this.zzn != null && jCurrentTimeMillis > SignalManager.TWENTY_FOUR_HOURS_MILLIS && this.zzp == null) {
                    zzi();
                }
            }
            if (this.zzn == null) {
                zzi();
            }
            str3 = this.zzn;
        } else {
            i10 = i13;
            list = list2;
            j10 = 0;
            str3 = null;
        }
        boolean zZzx = zzicVar5.zzc().zzx();
        zzpp zzppVarZzk2 = zzicVar5.zzk();
        String strZzj2 = zzj();
        zzic zzicVar6 = zzppVarZzk2.zzu;
        if (zzicVar6.zzaZ().getPackageManager() == null) {
            j11 = j10;
            i11 = 0;
        } else {
            try {
                i11 = 0;
                try {
                    ApplicationInfo applicationInfo = Wrappers.packageManager(zzicVar6.zzaZ()).getApplicationInfo(strZzj2, 0);
                    i12 = applicationInfo != null ? applicationInfo.targetSdkVersion : i11;
                } catch (PackageManager.NameNotFoundException unused4) {
                    zzic zzicVar7 = zzppVarZzk2.zzu;
                    zzicVar7.zzaV();
                    zzicVar7.zzaW().zzi().zzb("PackageManager failed to find running app: app_id", strZzj2);
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                i11 = 0;
            }
            j11 = i12;
        }
        zzic zzicVar8 = this.zzu;
        int iZzb = zzicVar8.zzd().zzl().zzb();
        String strZze = zzicVar8.zzd().zzj().zze();
        zzaif.zza();
        zzal zzalVarZzc = zzicVar8.zzc();
        zzfx zzfxVar = zzfy.zzaP;
        int iZzW = zzalVarZzc.zzp(null, zzfxVar) ? zzicVar8.zzk().zzW() : i11;
        zzaif.zza();
        long jZzX = zzicVar8.zzc().zzp(null, zzfxVar) ? zzicVar8.zzk().zzX() : j10;
        String strZzz = zzicVar8.zzc().zzz();
        String strZzb = new zze(zzicVar8.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true)).zzb();
        zzic zzicVar9 = this.zzu;
        return new zzr(strZzj, strZzk, str4, j12, str5, 161000L, j14, str, zZzB, z10, str2, jMin, i10, zZzu, z11, boolValueOf, j15, list, strZzl, str6, str3, zZzx, j11, iZzb, strZze, iZzW, jZzX, strZzz, strZzb, zzicVar9.zza, zzicVar9.zzx().zzj().zza(), zzicVar8.zzc().zzp(null, zzfy.zzbe) ? zzicVar9.zzb : j10);
    }
}
