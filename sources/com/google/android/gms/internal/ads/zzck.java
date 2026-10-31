package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzck {
    private final zzgwm zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzgwm zzgwmVar) {
        this.zza = zzgwmVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z10;
        do {
            z10 = false;
            for (int i10 = 0; i10 <= zzj(); i10++) {
                if (!this.zzc[i10].hasRemaining()) {
                    List list = this.zzb;
                    zzco zzcoVar = (zzco) list.get(i10);
                    if (!zzcoVar.zzg()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.zzc[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzco.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcoVar.zzd(byteBuffer2);
                        this.zzc[i10] = zzcoVar.zzf();
                        boolean z11 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.zzc[i10].hasRemaining() && i10 < zzj()) {
                        ((zzco) list.get(i10 + 1)).zze();
                    }
                }
            }
        } while (z10);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzgwm zzgwmVar = this.zza;
        int size = zzgwmVar.size();
        zzgwm zzgwmVar2 = ((zzck) obj).zza;
        if (size != zzgwmVar2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < zzgwmVar.size(); i10++) {
            if (zzgwmVar.get(i10) != zzgwmVar2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzcn {
        zzcl zzclVar2 = zzcl.zza;
        if (zzclVar.equals(zzclVar2)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i10 = 0;
        while (true) {
            zzgwm zzgwmVar = this.zza;
            if (i10 >= zzgwmVar.size()) {
                return zzclVar;
            }
            zzco zzcoVar = (zzco) zzgwmVar.get(i10);
            zzcl zzclVarZzb = zzcoVar.zzb(zzclVar);
            if (zzcoVar.zzc()) {
                zzgtj.zzi(!zzclVarZzb.equals(zzclVar2));
                zzclVar = zzclVarZzb;
            }
            i10++;
        }
    }

    public final void zzb(zzcm zzcmVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long jZza = zzcmVar.zzb;
        int i10 = 0;
        while (true) {
            zzgwm zzgwmVar = this.zza;
            if (i10 >= zzgwmVar.size()) {
                break;
            }
            zzco zzcoVar = (zzco) zzgwmVar.get(i10);
            zzcoVar.zzi(new zzcm(jZza));
            if (zzcoVar.zzc()) {
                jZza = zzcoVar.zza(jZza);
                zzgtj.zzi(jZza >= 0);
                list.add(zzcoVar);
            }
            i10++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i11 = 0; i11 <= zzj(); i11++) {
            this.zzc[i11] = ((zzco) list.get(i11)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzco.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzco.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzco) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzco) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i10 = 0;
        while (true) {
            zzgwm zzgwmVar = this.zza;
            if (i10 >= zzgwmVar.size()) {
                this.zzb.clear();
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            }
            zzco zzcoVar = (zzco) zzgwmVar.get(i10);
            zzcoVar.zzi(zzcm.zza);
            zzcoVar.zzj();
            i10++;
        }
    }
}
