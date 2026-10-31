package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcxg implements zzdef, zzddl {
    private final Context zza;
    private final zzcku zzb;
    private final zzfkf zzc;
    private final VersionInfoParcel zzd;
    private zzeln zze;
    private boolean zzf;
    private final zzell zzg;

    public zzcxg(Context context, zzcku zzckuVar, zzfkf zzfkfVar, VersionInfoParcel versionInfoParcel, zzell zzellVar) {
        this.zza = context;
        this.zzb = zzckuVar;
        this.zzc = zzfkfVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzellVar;
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgn)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final synchronized void zzdr() {
        zzcku zzckuVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzckuVar = this.zzb) == null) {
            return;
        }
        zzckuVar.zze("onSdkImpression", new androidx.collection.a());
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }

    private final synchronized void zza() {
        zzcku zzckuVar;
        zzelk zzelkVar;
        zzelj zzeljVar;
        zzfkf zzfkfVar = this.zzc;
        if (zzfkfVar.zzT && (zzckuVar = this.zzb) != null) {
            if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
                int i10 = versionInfoParcel.buddyApkVersion;
                int i11 = versionInfoParcel.clientJarVersion;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
                sb2.append(i10);
                sb2.append(".");
                sb2.append(i11);
                String string = sb2.toString();
                zzflb zzflbVar = zzfkfVar.zzV;
                String strZza = zzflbVar.zza();
                if (zzflbVar.zzc() == 1) {
                    zzeljVar = zzelj.VIDEO;
                    zzelkVar = zzelk.DEFINED_BY_JAVASCRIPT;
                } else {
                    int i12 = zzfkfVar.zze;
                    zzelj zzeljVar2 = zzelj.HTML_DISPLAY;
                    zzelkVar = i12 == 1 ? zzelk.ONE_PIXEL : zzelk.BEGIN_TO_RENDER;
                    zzeljVar = zzeljVar2;
                }
                zzeln zzelnVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzckuVar.zzD(), EFLCCdIRcb.FSGmYTmtSGjFq, "javascript", strZza, zzelkVar, zzeljVar, zzfkfVar.zzal);
                this.zze = zzelnVarZzc;
                if (zzelnVarZzc != null) {
                    zzfuk zzfukVarZza = zzelnVarZzc.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgm)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfukVarZza, zzckuVar.zzD());
                        Iterator it = zzckuVar.zzF().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzfukVarZza, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfukVarZza, zzckuVar.zzE());
                    }
                    zzckuVar.zzak(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzu().zze(zzfukVarZza);
                    this.zzf = true;
                    zzckuVar.zze("onSdkLoaded", new androidx.collection.a());
                }
            }
        }
    }
}
