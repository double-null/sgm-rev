package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzicy extends zzicx {
    private final byte[] zzb;

    zzicy(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzida zzc(int i10, int i11) {
        byte[] bArr = this.zzb;
        int iZzD = zzida.zzD(i10, i11, bArr.length);
        return iZzD == 0 ? zzida.zza : new zzicu(bArr, i10, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzida zzd(int i10, int i11) {
        byte[] bArr = this.zzb;
        int iZzD = zzida.zzD(i10, i11, bArr.length);
        return iZzD == 0 ? zzida.zza : new zzicu(bArr, i10, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final void zzg(zzicr zzicrVar) throws IOException {
        byte[] bArr = this.zzb;
        zzicrVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzi() {
        return zzihf.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final boolean zzj(zzida zzidaVar) {
        if (zzidaVar instanceof zzicy) {
            return Arrays.equals(this.zzb, ((zzicy) zzidaVar).zzb);
        }
        return zzidaVar instanceof zzicu ? zzk(zzidaVar, 0, this.zzb.length) : zzidaVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzicx
    final boolean zzk(zzida zzidaVar, int i10, int i11) {
        if (i11 > zzidaVar.zzb()) {
            byte[] bArr = this.zzb;
            int length = String.valueOf(i11).length();
            int length2 = bArr.length;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= zzidaVar.zzb()) {
            if (zzidaVar instanceof zzicy) {
                return zzida.zzE(this.zzb, 0, ((zzicy) zzidaVar).zzb, i10, i11);
            }
            if (!(zzidaVar instanceof zzicu)) {
                return zzidaVar.zzd(i10, i12).equals(zzd(0, i11));
            }
            zzicu zzicuVar = (zzicu) zzidaVar;
            return zzida.zzE(this.zzb, 0, zzicuVar.zzn(), zzicuVar.zzo() + i10, i11);
        }
        int iZzb = zzidaVar.zzb();
        int length3 = String.valueOf(i10).length();
        StringBuilder sb3 = new StringBuilder(length3 + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iZzb).length());
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
        return zzier.zzb(i10, this.zzb, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzide zzm() {
        byte[] bArr = this.zzb;
        return zzide.zzI(bArr, 0, bArr.length, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
