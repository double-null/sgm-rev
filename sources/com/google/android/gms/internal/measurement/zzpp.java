package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.common.collect.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpp {
    private static final Object zza = new Object();
    private static volatile Map zzb;
    private final String zzc;

    zzpp(Context context, zzpr zzprVar) {
        this.zzc = zzprVar.zzb() ? zzlg.zzb(context, zzprVar.zza(), false) : zzprVar.zza();
        zzprVar.zzc();
        zzprVar.zzf();
        zzprVar.zzd();
        zzprVar.zze();
    }

    static Map zza(Context context) {
        Map map = zzb;
        if (map == null) {
            synchronized (zza) {
                map = zzb;
                if (map == null) {
                    v.a aVarB = v.b();
                    try {
                        String[] list = context.getAssets().list("phenotype");
                        if (list != null) {
                            for (String str : list) {
                                if (str.endsWith("_package_metadata.binarypb")) {
                                    try {
                                        AssetManager assets = context.getAssets();
                                        StringBuilder sb2 = new StringBuilder(str.length() + 10);
                                        sb2.append("phenotype/");
                                        sb2.append(str);
                                        InputStream inputStreamOpen = assets.open(sb2.toString());
                                        try {
                                            zzpp zzppVar = new zzpp(context, zzpr.zzh(inputStreamOpen, zzadf.zza()));
                                            aVarB.g(zzppVar.zzc, zzppVar);
                                            if (inputStreamOpen != null) {
                                                inputStreamOpen.close();
                                            }
                                        } catch (Throwable th) {
                                            if (inputStreamOpen != null) {
                                                try {
                                                    inputStreamOpen.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (zzaeh e10) {
                                        StringBuilder sb3 = new StringBuilder(str.length() + 45);
                                        sb3.append("Unable to read Phenotype PackageMetadata for ");
                                        sb3.append(str);
                                        Log.e("PackageInfo", sb3.toString(), e10);
                                    }
                                }
                            }
                        }
                    } catch (IOException e11) {
                        Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e11);
                    }
                    v vVarD = aVarB.d();
                    zzb = vVarD;
                    map = vVarD;
                }
            }
        }
        return map;
    }
}
