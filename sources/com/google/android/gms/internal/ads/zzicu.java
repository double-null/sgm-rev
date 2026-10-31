package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzicu extends zzicx {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzicu(byte[] bArr, int i10, int i11) {
        super(null);
        zzida.zzD(i10, i10 + i11, bArr.length);
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final byte zza(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzida zzc(int i10, int i11) {
        int iZzD = zzida.zzD(i10, i11, this.zzd);
        return iZzD == 0 ? zzida.zza : new zzicu(this.zzb, this.zzc + i10, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzida zzd(int i10, int i11) {
        int iZzD = zzida.zzD(i10, i11, this.zzd);
        return iZzD == 0 ? zzida.zza : new zzicu(this.zzb, this.zzc + i10, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, this.zzc + i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final void zzg(zzicr zzicrVar) throws IOException {
        zzicrVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        return zzihf.zzb(bArr, i10, this.zzd + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final boolean zzj(zzida zzidaVar) {
        return ((zzidaVar instanceof zzicy) || (zzidaVar instanceof zzicu)) ? zzk(zzidaVar, 0, this.zzd) : zzidaVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzicx
    final boolean zzk(zzida zzidaVar, int i10, int i11) {
        if (i11 > zzidaVar.zzb()) {
            int i12 = this.zzd;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 18 + String.valueOf(i12).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(i12);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i13 = i10 + i11;
        if (i13 <= zzidaVar.zzb()) {
            if (zzidaVar instanceof zzicy) {
                return zzida.zzE(this.zzb, this.zzc, ((zzicy) zzidaVar).zzn(), i10, i11);
            }
            if (zzidaVar instanceof zzicu) {
                zzicu zzicuVar = (zzicu) zzidaVar;
                return zzida.zzE(this.zzb, this.zzc, zzicuVar.zzb, zzicuVar.zzc + i10, i11);
            }
            zzida zzidaVarZzd = zzidaVar.zzd(i10, i13);
            int i14 = this.zzc;
            return zzidaVarZzd.equals(zzd(i14, i11 + i14));
        }
        int iZzb = zzidaVar.zzb();
        int length = String.valueOf(i10).length();
        StringBuilder sb3 = new StringBuilder(length + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iZzb).length());
        sb3.append("Ran off end of other: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(iZzb);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final int zzl(int i10, int i11, int i12) {
        return zzier.zzb(i10, this.zzb, this.zzc + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzide zzm() {
        return zzide.zzI(this.zzb, this.zzc, this.zzd, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    final /* synthetic */ int zzo() {
        return this.zzc;
    }
}
