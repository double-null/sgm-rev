package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbdi {
    public static String zza(Context context, String str, List list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzhcp zzhcpVarZze = zzhcp.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbdh
            @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzhcp zzhcpVar = zzhcpVarZze;
                if (list2 == null) {
                    zzhcpVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ApkChecksum apkChecksum = (ApkChecksum) list2.get(i10);
                        if (apkChecksum.getType() == 8) {
                            zzhcpVar.zza(zzbbv.zza(apkChecksum.getValue()));
                            return;
                        }
                    }
                    zzhcpVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhcpVar.zza((Object) null);
                }
            }
        });
        return (String) zzhcpVarZze.get();
    }
}
