package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzai;
import com.google.android.gms.internal.common.zzam;
import com.google.android.gms.internal.common.zzaq;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile HashSet zzd;
    private static volatile HashSet zze;
    private final Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(Context context) {
        this.zzb = context.getApplicationContext();
    }

    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zza == null) {
                zzo.zza(context);
                zza = new GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    static final boolean zza(PackageInfo packageInfo, boolean z10) {
        zzam zzamVarZzj;
        if (packageInfo == null) {
            return false;
        }
        if (z10 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE) == 0) ? false : true;
        }
        try {
            zzam zzamVar = z10 ? zzn.zzc : zzn.zzb;
            int i10 = AndroidUtilsLight.zza;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] byteArray = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    byteArray = signatureArr[0].toByteArray();
                }
                zzamVarZzj = byteArray != null ? zzam.zzk(byteArray) : zzam.zzj();
            } else {
                com.google.android.gms.internal.common.zzs.zza(i11 >= 28);
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    zzamVarZzj = zzam.zzj();
                } else {
                    int i12 = zzam.zzd;
                    zzai zzaiVar = new zzai();
                    for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                        zzaiVar.zzb(signature.toByteArray());
                    }
                    zzamVarZzj = zzaiVar.zzd();
                }
            }
            if (zzamVarZzj.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            zzam zzamVarZzh = zzamVarZzj.zzh();
            int size = zzamVarZzh.size();
            int i13 = 0;
            while (i13 < size) {
                byte[] bArr = (byte[]) zzamVarZzh.get(i13);
                zzaq zzaqVarListIterator = zzamVar.listIterator(0);
                do {
                    int i14 = i13 + 1;
                    if (!zzaqVarListIterator.hasNext()) {
                        i13 = i14;
                    }
                } while (!Arrays.equals(bArr, (byte[]) zzaqVarListIterator.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z10 ? zzc(packageInfo, zzn.zza) : zzc(packageInfo, zzn.zza[0])) != null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    private final zzy zzb(String str, boolean z10, boolean z11) {
        zzy zzyVarZzc;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzy.zzc("null pkg");
        }
        if (str.equals(this.zzc)) {
            return zzy.zzb();
        }
        int i10 = zzo.zzh;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzo.zzb();
                boolean zZzg = zzo.zzg.zzg();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (zZzg) {
                    zzv zzvVar = new zzv(null);
                    zzvVar.zza(str);
                    zzvVar.zzb(GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb));
                    zzvVar.zzc(true);
                    zzyVarZzc = zzo.zzc(zzvVar.zzd());
                } else {
                    threadPolicyAllowThreadDiskReads = Build.VERSION.SDK_INT;
                    try {
                        PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str, threadPolicyAllowThreadDiskReads >= 28 ? 134217792 : 64);
                        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                        if (packageInfo == null) {
                            zzyVarZzc = zzy.zzc("null pkg");
                        } else {
                            Signature[] signatureArr = packageInfo.signatures;
                            if (signatureArr == null || signatureArr.length != 1) {
                                zzyVarZzc = zzy.zzc("single cert required");
                            } else {
                                zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                                String str2 = packageInfo.packageName;
                                zzy zzyVarZzd = zzo.zzd(str2, zzkVar, zHonorsDebugCertificates, false);
                                zzyVarZzc = (!zzyVarZzd.zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !zzo.zzd(str2, zzkVar, false, true).zza) ? zzyVarZzd : zzy.zzc("debuggable release cert app rejected");
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        return zzy.zzd("no pkg ".concat(str), e10);
                    }
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        } catch (RemoteException | DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        if (zzyVarZzc.zza) {
            this.zzc = str;
        }
        return zzyVarZzc;
    }

    private static zzj zzc(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < zzjVarArr.length; i10++) {
                if (zzjVarArr[i10].equals(zzkVar)) {
                    return zzjVarArr[i10];
                }
            }
        }
        return null;
    }

    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean isPackageGoogleSigned(String str) {
        zzy zzyVarZzb = zzb(str, false, false);
        zzyVarZzb.zze();
        return zzyVarZzb.zza;
    }

    public boolean isUidGoogleSigned(int i10) {
        zzy zzyVarZzc;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            zzyVarZzc = zzy.zzc("no pkgs");
        } else {
            zzyVarZzc = null;
            for (String str : packagesForUid) {
                zzyVarZzc = zzb(str, false, false);
                if (!zzyVarZzc.zza) {
                }
            }
            Preconditions.checkNotNull(zzyVarZzc);
        }
        zzyVarZzc.zze();
        return zzyVarZzc.zza;
    }
}
