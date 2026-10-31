package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgwv extends zzgwg {
    Object[] zzd;
    private int zze;

    public zzgwv() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgwg, com.google.android.gms.internal.ads.zzgwh
    public final /* bridge */ /* synthetic */ zzgwh zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgwv zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzo = zzgww.zzo(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzo <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgwf.zza(iHashCode);
                while (true) {
                    int i10 = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i10];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iZza = i10 + 1;
                    } else {
                        objArr2[i10] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzgwv zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzgww zzh() {
        zzgww zzgwwVarZzw;
        int i10 = this.zzb;
        if (i10 == 0) {
            return zzgyn.zza;
        }
        if (i10 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgyx(obj);
        }
        if (this.zzd == null || zzgww.zzo(i10) != this.zzd.length) {
            zzgwwVarZzw = zzgww.zzw(this.zzb, this.zza);
            this.zzb = zzgwwVarZzw.size();
        } else {
            int i11 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgww.zzx(i11, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            int i12 = this.zze;
            Object[] objArr = this.zzd;
            zzgwwVarZzw = new zzgyn(objArrCopyOf, i12, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgwwVarZzw;
    }

    zzgwv(int i10, boolean z10) {
        super(i10);
        this.zzd = new Object[zzgww.zzo(i10)];
    }
}
