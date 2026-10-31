package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacm extends zzacp {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzacm(byte[] bArr, int i10, int i11) {
        super(null);
        zzacr.zzn(i10, i10 + i11, bArr.length);
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    final byte zza(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final zzacr zzc(int i10, int i11) {
        int iZzn = zzacr.zzn(i10, i11, this.zzd);
        return iZzn == 0 ? zzacr.zza : new zzacm(this.zzb, this.zzc + i10, iZzn);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    protected final void zzd(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, this.zzc, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    final void zze(zzacj zzacjVar) throws IOException {
        zzacjVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    protected final boolean zzf(zzacr zzacrVar) {
        boolean z10 = zzacrVar instanceof zzacq;
        if (!z10 && !(zzacrVar instanceof zzacm)) {
            return zzacrVar.zzf(this);
        }
        int i10 = this.zzd;
        if (i10 > zzacrVar.zzb()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i10).length());
            sb2.append("Length too large: ");
            sb2.append(i10);
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 <= zzacrVar.zzb()) {
            if (z10) {
                return zzacr.zzo(this.zzb, this.zzc, ((zzacq) zzacrVar).zzh(), 0, i10);
            }
            if (zzacrVar instanceof zzacm) {
                zzacm zzacmVar = (zzacm) zzacrVar;
                return zzacr.zzo(this.zzb, this.zzc, zzacmVar.zzb, zzacmVar.zzc, i10);
            }
            zzacr zzacrVarZzc = zzacrVar.zzc(0, i10);
            int i11 = this.zzc;
            return zzacrVarZzc.equals(zzc(i11, i10 + i11));
        }
        int iZzb = zzacrVar.zzb();
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 27 + String.valueOf(iZzb).length());
        sb3.append("Ran off end of other: 0, ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(iZzb);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    protected final int zzg(int i10, int i11, int i12) {
        return zzaed.zzb(i10, this.zzb, this.zzc, i12);
    }

    final /* synthetic */ byte[] zzh() {
        return this.zzb;
    }

    final /* synthetic */ int zzi() {
        return this.zzc;
    }
}
