package com.google.android.gms.internal.ads;

import io.bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzigg extends zzida {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, EventTypeExtended.EVENT_TYPE_EXTENDED_RESUME_VALUE, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzida zzd;
    private final zzida zze;
    private final int zzf;
    private final int zzg;

    /* synthetic */ zzigg(zzida zzidaVar, zzida zzidaVar2, byte[] bArr) {
        this(zzidaVar, zzidaVar2);
    }

    private static zzida zzG(zzida zzidaVar, zzida zzidaVar2) {
        int iZzb = zzidaVar.zzb();
        int iZzb2 = zzidaVar2.zzb();
        byte[] bArr = new byte[iZzb + iZzb2];
        zzidaVar.zzz(bArr, 0, 0, iZzb);
        zzidaVar2.zzz(bArr, 0, iZzb, iZzb2);
        return zzida.zzv(bArr);
    }

    static zzida zzk(zzida zzidaVar, zzida zzidaVar2) {
        if (zzidaVar2.zzb() == 0) {
            return zzidaVar;
        }
        if (zzidaVar.zzb() == 0) {
            return zzidaVar2;
        }
        int iZzb = zzidaVar.zzb() + zzidaVar2.zzb();
        if (iZzb < 128) {
            return zzG(zzidaVar, zzidaVar2);
        }
        if (zzidaVar instanceof zzigg) {
            zzigg zziggVar = (zzigg) zzidaVar;
            zzida zzidaVar3 = zziggVar.zze;
            if (zzidaVar3.zzb() + zzidaVar2.zzb() < 128) {
                return new zzigg(zziggVar.zzd, zzG(zzidaVar3, zzidaVar2));
            }
            zzida zzidaVar4 = zziggVar.zzd;
            if (zzidaVar4.zzp() > zzidaVar3.zzp() && zziggVar.zzg > zzidaVar2.zzp()) {
                return new zzigg(zzidaVar4, new zzigg(zzidaVar3, zzidaVar2));
            }
        }
        return iZzb >= zzn(Math.max(zzidaVar.zzp(), zzidaVar2.zzp()) + 1) ? new zzigg(zzidaVar, zzidaVar2) : zzige.zza(zzidaVar, zzidaVar2, new ArrayDeque());
    }

    static int zzn(int i10) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzida, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzigd(this);
    }

    final /* synthetic */ zzida zzF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final byte zza(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zza(i10) : this.zze.zza(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzida zzc(int i10, int i11) {
        return zzd(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzida zzd(int i10, int i11) {
        int i12 = this.zzc;
        int iZzD = zzida.zzD(i10, i11, i12);
        if (iZzD == 0) {
            return zzida.zza;
        }
        if (iZzD == i12) {
            return this;
        }
        int i13 = this.zzf;
        if (i11 <= i13) {
            return this.zzd.zzc(i10, i11);
        }
        int i14 = i11 - i13;
        if (i10 >= i13) {
            return this.zze.zzc(i10 - i13, i14);
        }
        zzida zzidaVar = this.zzd;
        return new zzigg(zzidaVar.zzc(i10, zzidaVar.zzb()), this.zze.zzc(0, i14));
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.zze.zze(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final void zzg(zzicr zzicrVar) throws IOException {
        this.zzd.zzg(zzicrVar);
        this.zze.zzg(zzicrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final String zzh(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzi() {
        zzigf zzigfVar = new zzigf(this, null);
        while (zzigfVar.hasNext()) {
            if (!zzigfVar.next().zzi()) {
                return zzihf.zza(zzA());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzj(zzida zzidaVar) {
        zzicx zzicxVarZza;
        byte[] bArr = null;
        zzigf zzigfVar = new zzigf(this, bArr);
        zzicx zzicxVarZza2 = zzigfVar.next();
        zzigf zzigfVar2 = new zzigf(zzidaVar, bArr);
        zzicx zzicxVarZza3 = zzigfVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iZzb = zzicxVarZza2.zzb() - i10;
            int iZzb2 = zzicxVarZza3.zzb() - i11;
            int iMin = Math.min(iZzb, iZzb2);
            if (!(i10 == 0 ? zzicxVarZza2.zzk(zzicxVarZza3, i11, iMin) : zzicxVarZza3.zzk(zzicxVarZza2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzb) {
                zzicxVarZza = zzigfVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == iZzb2) {
                zzicxVarZza2 = zzicxVarZza2;
                zzicxVarZza2 = zzicxVarZza;
                zzicxVarZza3 = zzigfVar2.next();
                i11 = 0;
            } else {
                zzicxVarZza2 = zzicxVarZza2;
                zzicxVarZza2 = zzicxVarZza;
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final int zzl(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzl(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzl(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzl(this.zzd.zzl(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzide zzm() {
        ArrayList arrayList = new ArrayList();
        zzigf zzigfVar = new zzigf(this, null);
        while (zzigfVar.hasNext()) {
            arrayList.add(zzigfVar.next().zzf());
        }
        int i10 = zzide.zze;
        return zzide.zzH(new zzieu(arrayList), 4096);
    }

    final /* synthetic */ zzida zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    /* JADX INFO: renamed from: zzr */
    public final zzicv iterator() {
        return new zzigd(this);
    }

    private zzigg(zzida zzidaVar, zzida zzidaVar2) {
        this.zzd = zzidaVar;
        this.zze = zzidaVar2;
        int iZzb = zzidaVar.zzb();
        this.zzf = iZzb;
        this.zzc = iZzb + zzidaVar2.zzb();
        this.zzg = Math.max(zzidaVar.zzp(), zzidaVar2.zzp()) + 1;
    }
}
