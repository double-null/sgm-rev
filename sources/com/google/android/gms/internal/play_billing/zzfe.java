package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfe extends zzfd {
    private final byte[] zzb;

    zzfe(byte[] bArr) {
        super(null);
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    final byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    protected final int zzc(int i10, int i11, int i12) {
        return zzgm.zzb(i10, this.zzb, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    public final int zzd() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    public final zzfg zze(int i10, int i11) {
        byte[] bArr = this.zzb;
        int iZzj = zzfg.zzj(0, i11, bArr.length);
        return iZzj == 0 ? zzfg.zza : new zzfa(bArr, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    protected final void zzf(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    final void zzg(zzex zzexVar) throws IOException {
        byte[] bArr = this.zzb;
        ((zzfl) zzexVar).zzc(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfg
    protected final boolean zzh(zzfg zzfgVar) {
        boolean z10 = zzfgVar instanceof zzfe;
        if (z10) {
            return Arrays.equals(this.zzb, ((zzfe) zzfgVar).zzb);
        }
        boolean z11 = zzfgVar instanceof zzfa;
        if (!z11) {
            return zzfgVar.zzh(this);
        }
        byte[] bArr = this.zzb;
        int iZzd = zzfgVar.zzd();
        int length = bArr.length;
        if (length > iZzd) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length <= zzfgVar.zzd()) {
            if (z10) {
                return zzfg.zzl(bArr, 0, ((zzfe) zzfgVar).zzb, 0, length);
            }
            if (!z11) {
                return zzfgVar.zze(0, length).equals(zze(0, length));
            }
            zzfa zzfaVar = (zzfa) zzfgVar;
            return zzfg.zzl(bArr, 0, zzfaVar.zzb, zzfaVar.zzc, length);
        }
        throw new IllegalArgumentException("Ran off end of other: 0, " + length + ", " + zzfgVar.zzd());
    }
}
