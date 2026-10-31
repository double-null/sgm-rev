package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhq implements zzhw {
    private final zzhm zza;
    private final zzil zzb;
    private final boolean zzc;
    private final zzfu zzd;

    private zzhq(zzil zzilVar, zzfu zzfuVar, zzhm zzhmVar) {
        this.zzb = zzilVar;
        this.zzc = zzhmVar instanceof zzgd;
        this.zzd = zzfuVar;
        this.zza = zzhmVar;
    }

    static zzhq zzc(zzil zzilVar, zzfu zzfuVar, zzhm zzhmVar) {
        return new zzhq(zzilVar, zzfuVar, zzhmVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final int zza(Object obj) {
        int iZzb = ((zzgg) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzgd) obj).zzb.zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final int zzb(Object obj) {
        int iHashCode = ((zzgg) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzgd) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final Object zze() {
        zzhm zzhmVar = this.zza;
        return zzhmVar instanceof zzgg ? ((zzgg) zzhmVar).zzs() : zzhmVar.zzw().zzk();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final void zzf(Object obj) {
        this.zzb.zzb(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final void zzg(Object obj, Object obj2) {
        zzhx.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzhx.zzo(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzeu zzeuVar) throws IOException {
        zzgg zzggVar = (zzgg) obj;
        if (zzggVar.zzc == zzim.zzc()) {
            zzggVar.zzc = zzim.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final void zzi(Object obj, zzjd zzjdVar) throws IOException {
        Iterator itZzf = ((zzgd) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzfx zzfxVar = (zzfx) entry.getKey();
            if (zzfxVar.zzc() != zzjc.MESSAGE || zzfxVar.zze() || zzfxVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzgn) {
                zzjdVar.zzx(zzfxVar.zza(), ((zzgn) entry).zza().zze());
            } else {
                zzjdVar.zzx(zzfxVar.zza(), entry.getValue());
            }
        }
        ((zzgg) obj).zzc.zzk(zzjdVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzgg) obj).zzc.equals(((zzgg) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzgd) obj).zzb.equals(((zzgd) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final boolean zzk(Object obj) {
        return ((zzgd) obj).zzb.zzj();
    }
}
