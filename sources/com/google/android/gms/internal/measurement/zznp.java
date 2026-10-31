package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.util.Log;
import com.google.common.base.m;
import com.google.common.base.p;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zznp implements zzom {
    private final String zza;
    private final zzph zzb;

    zznp(String str, String str2, zzph zzphVar) {
        this.zza = str2;
        this.zzb = zzphVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzom, com.google.common.base.w
    public final Object get() {
        return p.l(zzb(zzlk.zzb()));
    }

    protected Object zza() {
        return null;
    }

    protected final Object zzaA(zznw zznwVar, final zzlk zzlkVar, String str) {
        zzpg zzpgVarZza;
        Object objZza;
        String strZza;
        int iZzf = zznwVar.zzf();
        if (iZzf == -1 || iZzf < zznwVar.zzg().zza()) {
            synchronized (zznwVar) {
                int iZzf2 = zznwVar.zzf();
                Object objZzd = null;
                if (iZzf2 == -1) {
                    zzlk.zzl();
                    p.l(zzlkVar);
                    zzpgVarZza = this.zzb.zza(zzlkVar, "");
                    zznwVar.zzj(zzpgVarZza.zzc());
                } else {
                    zzpgVarZza = null;
                }
                int iZza = zznwVar.zzg().zza();
                if (iZzf2 < iZza) {
                    zzlk.zzl();
                    p.l(zzlkVar);
                    m mVarZza = zzlf.zza(zzlkVar.zzc());
                    if (!mVarZza.e() || (strZza = ((zzle) mVarZza.c()).zza(zzlg.zza("com.google.android.gms.measurement"), null, null, this.zza)) == null) {
                        objZza = null;
                    } else {
                        try {
                            objZza = zzc(strZza);
                        } catch (IOException | IllegalArgumentException e10) {
                            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.zza), e10);
                            objZza = null;
                        }
                    }
                    if (zzpgVarZza == null) {
                        zzpgVarZza = this.zzb.zza(zzlkVar, "");
                    }
                    final String strZzb = zzpgVarZza.zzb();
                    if (Build.VERSION.SDK_INT >= 26 && !zzlkVar.zzc().getPackageName().equals("com.android.vending") && !strZzb.startsWith("com.google.android.gms.measurement#")) {
                        zzpx.zza(zzlkVar.zzg().submit(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpn
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                Map mapZza = zzpp.zza(zzlkVar.zzc());
                                String str2 = strZzb;
                                if (mapZza.containsKey(str2)) {
                                    return;
                                }
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 173);
                                sb2.append("Config package ");
                                sb2.append(str2);
                                sb2.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                                Log.e("FilePhenotypeFlags", sb2.toString());
                            }
                        }));
                    }
                    Object objZza2 = zzpgVarZza.zza(this.zza, false);
                    if (objZza2 != null) {
                        try {
                            objZzd = zzd(objZza2);
                        } catch (IOException | ClassCastException e11) {
                            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.zza), e11);
                        }
                    }
                    if (true != mVarZza.e()) {
                        objZza = objZzd;
                    }
                    if (objZza == null) {
                        objZza = zza();
                    }
                    if (objZza != null) {
                        zznwVar.zzh(objZza);
                        zznwVar.zzi(iZza);
                    }
                    return objZza;
                }
            }
        }
        return zznwVar.zze();
    }

    protected abstract Object zzb(zzlk zzlkVar);

    protected abstract Object zzc(String str) throws IOException;

    protected abstract Object zzd(Object obj) throws IOException;
}
