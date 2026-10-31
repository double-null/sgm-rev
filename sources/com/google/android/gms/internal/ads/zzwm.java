package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwm implements zzyd {
    private final zzage zza;
    private zzafy zzb;
    private zzafz zzc;

    public zzwm(zzage zzageVar) {
        this.zza = zzageVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zza(zzj zzjVar, Uri uri, Map map, long j10, long j11, zzagb zzagbVar) throws IOException {
        zzafp zzafpVar = new zzafp(zzjVar, j10, j11);
        this.zzc = zzafpVar;
        if (this.zzb != null) {
            return;
        }
        zzafy[] zzafyVarArrZzb = this.zza.zzb(uri, map);
        int length = zzafyVarArrZzb.length;
        zzgwj zzgwjVarZzv = zzgwm.zzv(length);
        if (length == 1) {
            this.zzb = zzafyVarArrZzb[0];
        } else {
            for (zzafy zzafyVar : zzafyVarArrZzb) {
                try {
                    if (zzafyVar.zza(zzafpVar)) {
                        this.zzb = zzafyVar;
                        zzgtj.zzi(true);
                        zzafpVar.zzl();
                        break;
                    } else {
                        zzgwjVarZzv.zzh(zzafyVar.zzb());
                        boolean z10 = this.zzb != null || zzafpVar.zzn() == j10;
                        zzgtj.zzi(z10);
                        zzafpVar.zzl();
                    }
                } catch (EOFException unused) {
                    if (this.zzb != null || zzafpVar.zzn() == j10) {
                    }
                } catch (Throwable th) {
                    zzgtj.zzi(this.zzb != null || zzafpVar.zzn() == j10);
                    zzafpVar.zzl();
                    throw th;
                }
                zzgtj.zzi(z10);
                zzafpVar.zzl();
            }
            if (this.zzb == null) {
                String strZzd = zzgtd.zzd(zzgxm.zzc(zzgwm.zzr(zzafyVarArrZzb), zzwl.zza), ", ");
                StringBuilder sb2 = new StringBuilder(strZzd.length() + 58);
                sb2.append("None of the available extractors (");
                sb2.append(strZzd);
                sb2.append(") could read the stream.");
                throw new zzzo(sb2.toString(), uri, zzgwjVarZzv.zzi());
            }
        }
        this.zzb.zzc(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzb() {
        zzafy zzafyVar = this.zzb;
        if (zzafyVar != null) {
            zzafyVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzc() {
        zzafy zzafyVar = this.zzb;
        if (zzafyVar != null && (zzafyVar instanceof zzakp)) {
            ((zzakp) zzafyVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final long zzd() {
        zzafz zzafzVar = this.zzc;
        if (zzafzVar != null) {
            return zzafzVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zze(long j10, long j11) {
        zzafy zzafyVar = this.zzb;
        zzafyVar.getClass();
        zzafyVar.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final int zzf(zzagy zzagyVar) throws IOException {
        zzafz zzafzVar;
        zzafy zzafyVar = this.zzb;
        if (zzafyVar == null || (zzafzVar = this.zzc) == null) {
            throw null;
        }
        return zzafyVar.zzd(zzafzVar, zzagyVar);
    }
}
