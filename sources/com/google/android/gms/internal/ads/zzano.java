package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzano implements zzahk {
    private final zzahk zza;
    private final zzanj zzb;
    private zzanl zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfl.zzb;
    private final zzet zzc = new zzet();

    public zzano(zzahk zzahkVar, zzanj zzanjVar) {
        this.zza = zzahkVar;
        this.zzb = zzanjVar;
    }

    private final void zzi(int i10) {
        int length = this.zzf.length;
        int i11 = this.zze;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.zzd;
        int iMax = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i12);
        this.zzd = 0;
        this.zze = i12;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzA(zzv zzvVar) {
        String str = zzvVar.zzp;
        str.getClass();
        zzgtj.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzanj zzanjVar = this.zzb;
            this.zzg = zzanjVar.zza(zzvVar) ? zzanjVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzA(zzvVar);
            return;
        }
        zzahk zzahkVar = this.zza;
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzo("application/x-media3-cues");
        zztVarZza.zzk(str);
        zztVarZza.zzt(Long.MAX_VALUE);
        zztVarZza.zzM(this.zzb.zzb(zzvVar));
        zzahkVar.zzA(zztVarZza.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i10, z10, 0);
        }
        zzi(i10);
        int iZza = zzjVar.zza(this.zzf, this.zze, i10);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzd(zzet zzetVar, int i10, int i11) {
        if (this.zzg == null) {
            this.zza.zzd(zzetVar, i10, i11);
            return;
        }
        zzi(i10);
        zzetVar.zzm(this.zzf, this.zze, i10);
        this.zze += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zze(final long j10, final int i10, int i11, int i12, zzahj zzahjVar) {
        if (this.zzg == null) {
            this.zza.zze(j10, i10, i11, i12, zzahjVar);
            return;
        }
        zzgtj.zzb(zzahjVar == null, "DRM on subtitles is not supported");
        int i13 = (this.zze - i12) - i11;
        try {
            this.zzg.zza(this.zzf, i13, i11, zzank.zza(), new zzdt() { // from class: com.google.android.gms.internal.ads.zzann
                @Override // com.google.android.gms.internal.ads.zzdt
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzh(j10, i10, (zzand) obj);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.zzi) {
                throw e10;
            }
            zzeg.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.zzd = i14;
        if (i14 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    public final void zzf(boolean z10) {
        this.zzi = true;
    }

    final /* synthetic */ void zzh(long j10, int i10, zzand zzandVar) {
        this.zzh.getClass();
        zzgwm zzgwmVar = zzandVar.zza;
        long j11 = zzandVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgwmVar.size());
        Iterator<E> it = zzgwmVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcx) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzet zzetVar = this.zzc;
        int length = bArrMarshall.length;
        zzetVar.zzb(bArrMarshall, length);
        zzahk zzahkVar = this.zza;
        zzahkVar.zzc(zzetVar, length);
        long j12 = zzandVar.zzb;
        if (j12 == -9223372036854775807L) {
            zzgtj.zzi(this.zzh.zzu == Long.MAX_VALUE);
        } else {
            long j13 = this.zzh.zzu;
            j10 = j13 == Long.MAX_VALUE ? j10 + j12 : j12 + j13;
        }
        zzahkVar.zze(j10, i10 | 1, length, 0, null);
    }
}
