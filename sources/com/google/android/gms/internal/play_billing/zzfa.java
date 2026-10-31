package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfa extends zzfd {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzfa(byte[] bArr, int i10, int i11) {
        super(null);
        zzfg.zzj(i10, i10 + i11, bArr.length);
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    final byte zza(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    protected final int zzc(int i10, int i11, int i12) {
        return zzgm.zzb(i10, this.zzb, this.zzc, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    public final zzfg zze(int i10, int i11) {
        int iZzj = zzfg.zzj(i10, i11, this.zzd);
        return iZzj == 0 ? zzfg.zza : new zzfa(this.zzb, this.zzc + i10, iZzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    protected final void zzf(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, this.zzc, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    final void zzg(zzex zzexVar) throws IOException {
        ((zzfl) zzexVar).zzc(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    protected final boolean zzh(zzfg zzfgVar) {
        boolean z10 = zzfgVar instanceof zzfe;
        if (!z10 && !(zzfgVar instanceof zzfa)) {
            return zzfgVar.zzh(this);
        }
        int i10 = this.zzd;
        if (i10 > zzfgVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i10 + i10);
        }
        if (i10 > zzfgVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i10 + ", " + zzfgVar.zzd());
        }
        if (z10) {
            return zzfg.zzl(this.zzb, this.zzc, ((zzfe) zzfgVar).zzb, 0, i10);
        }
        if (zzfgVar instanceof zzfa) {
            zzfa zzfaVar = (zzfa) zzfgVar;
            return zzfg.zzl(this.zzb, this.zzc, zzfaVar.zzb, zzfaVar.zzc, i10);
        }
        zzfg zzfgVarZze = zzfgVar.zze(0, i10);
        int i11 = this.zzc;
        return zzfgVarZze.equals(zze(i11, i10 + i11));
    }
}
