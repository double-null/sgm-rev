package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbc {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final zzbf zzg;

    zzbc(zzic zzicVar, String str, String str2, String str3, long j10, long j11, long j12, Bundle bundle) {
        zzbf zzbfVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        if (j12 != 0 && j12 > j10) {
            zzicVar.zzaW().zze().zzb("Event created with reverse previous/current timestamps. appId", zzgu.zzl(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbfVar = new zzbf(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzicVar.zzaW().zzb().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object objZzG = zzicVar.zzk().zzG(next, bundle2.get(next));
                    if (objZzG == null) {
                        zzicVar.zzaW().zze().zzb("Param value can't be null", zzicVar.zzl().zzb(next));
                        it.remove();
                    } else {
                        zzicVar.zzk().zzO(bundle2, next, objZzG);
                    }
                }
            }
            zzbfVar = new zzbf(bundle2);
        }
        this.zzg = zzbfVar;
    }

    public final String toString() {
        String string = this.zzg.toString();
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    final zzbc zza(zzic zzicVar, long j10) {
        return new zzbc(zzicVar, this.zzc, this.zza, this.zzb, this.zzd, this.zze, j10, this.zzg);
    }

    private zzbc(zzic zzicVar, String str, String str2, String str3, long j10, long j11, long j12, zzbf zzbfVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbfVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        if (j12 != 0 && j12 > j10) {
            zzicVar.zzaW().zze().zzc("Event created with reverse previous/current timestamps. appId, name", zzgu.zzl(str2), zzgu.zzl(str3));
        }
        this.zzg = zzbfVar;
    }
}
