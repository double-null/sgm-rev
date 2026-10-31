package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzidk implements zzihi {
    private final zzidj zza;

    private zzidk(zzidj zzidjVar) {
        zzidjVar.getClass();
        this.zza = zzidjVar;
        zzidjVar.zza = this;
    }

    public static zzidk zza(zzidj zzidjVar) {
        Object obj = zzidjVar.zza;
        return obj != null ? (zzidk) obj : new zzidk(zzidjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzifd)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            zzidjVar.zzr(i12);
            while (i11 < list.size()) {
                zzidjVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzifd zzifdVar = (zzifd) list;
        if (!z10) {
            while (i11 < zzifdVar.size()) {
                this.zza.zzg(i10, zzifdVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzifdVar.size(); i15++) {
            zzifdVar.zzc(i15);
            i14 += 8;
        }
        zzidjVar2.zzr(i14);
        while (i11 < zzifdVar.size()) {
            zzidjVar2.zzu(zzifdVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzidv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zze(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            zzidjVar.zzr(i12);
            while (i11 < list.size()) {
                zzidjVar.zzs(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzidv zzidvVar = (zzidv) list;
        if (!z10) {
            while (i11 < zzidvVar.size()) {
                this.zza.zze(i10, Float.floatToRawIntBits(zzidvVar.zzf(i11)));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzidvVar.size(); i15++) {
            zzidvVar.zzf(i15);
            i14 += 4;
        }
        zzidjVar2.zzr(i14);
        while (i11 < zzidvVar.size()) {
            zzidjVar2.zzs(Float.floatToRawIntBits(zzidvVar.zzf(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzidl)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            zzidjVar.zzr(i12);
            while (i11 < list.size()) {
                zzidjVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzidl zzidlVar = (zzidl) list;
        if (!z10) {
            while (i11 < zzidlVar.size()) {
                this.zza.zzg(i10, Double.doubleToRawLongBits(zzidlVar.zzf(i11)));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzidlVar.size(); i15++) {
            zzidlVar.zzf(i15);
            i14 += 8;
        }
        zzidjVar2.zzr(i14);
        while (i11 < zzidlVar.size()) {
            zzidjVar2.zzu(Double.doubleToRawLongBits(zzidlVar.zzf(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzief)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzc(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int iZzG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzG += zzidj.zzG(((Integer) list.get(i12)).intValue());
            }
            zzidjVar.zzr(iZzG);
            while (i11 < list.size()) {
                zzidjVar.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzief zziefVar = (zzief) list;
        if (!z10) {
            while (i11 < zziefVar.size()) {
                this.zza.zzc(i10, zziefVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int iZzG2 = 0;
        for (int i13 = 0; i13 < zziefVar.size(); i13++) {
            iZzG2 += zzidj.zzG(zziefVar.zzf(i13));
        }
        zzidjVar2.zzr(iZzG2);
        while (i11 < zziefVar.size()) {
            zzidjVar2.zzq(zziefVar.zzf(i11));
            i11++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzicq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            zzidjVar.zzr(i12);
            while (i11 < list.size()) {
                zzidjVar.zzp(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z10) {
            while (i11 < zzicqVar.size()) {
                this.zza.zzh(i10, zzicqVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzicqVar.size(); i15++) {
            zzicqVar.zzf(i15);
            i14++;
        }
        zzidjVar2.zzr(i14);
        while (i11 < zzicqVar.size()) {
            zzidjVar2.zzp(zzicqVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzF(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzifa)) {
            while (i11 < list.size()) {
                this.zza.zzi(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzifa zzifaVar = (zzifa) list;
        while (i11 < list.size()) {
            Object objZzc = zzifaVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzi(i10, (String) objZzc);
            } else {
                this.zza.zzj(i10, (zzida) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzG(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzj(i10, (zzida) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzH(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzief)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int iZzF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzF += zzidj.zzF(((Integer) list.get(i12)).intValue());
            }
            zzidjVar.zzr(iZzF);
            while (i11 < list.size()) {
                zzidjVar.zzr(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzief zziefVar = (zzief) list;
        if (!z10) {
            while (i11 < zziefVar.size()) {
                this.zza.zzd(i10, zziefVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int iZzF2 = 0;
        for (int i13 = 0; i13 < zziefVar.size(); i13++) {
            iZzF2 += zzidj.zzF(zziefVar.zzf(i13));
        }
        zzidjVar2.zzr(iZzF2);
        while (i11 < zziefVar.size()) {
            zzidjVar2.zzr(zziefVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzief)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zze(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            zzidjVar.zzr(i12);
            while (i11 < list.size()) {
                zzidjVar.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzief zziefVar = (zzief) list;
        if (!z10) {
            while (i11 < zziefVar.size()) {
                this.zza.zze(i10, zziefVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zziefVar.size(); i15++) {
            zziefVar.zzf(i15);
            i14 += 4;
        }
        zzidjVar2.zzr(i14);
        while (i11 < zziefVar.size()) {
            zzidjVar2.zzs(zziefVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzifd)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            zzidjVar.zzr(i12);
            while (i11 < list.size()) {
                zzidjVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzifd zzifdVar = (zzifd) list;
        if (!z10) {
            while (i11 < zzifdVar.size()) {
                this.zza.zzg(i10, zzifdVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzifdVar.size(); i15++) {
            zzifdVar.zzc(i15);
            i14 += 8;
        }
        zzidjVar2.zzr(i14);
        while (i11 < zzifdVar.size()) {
            zzidjVar2.zzu(zzifdVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzief)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzidj zzidjVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzidjVar.zzd(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            zzidj zzidjVar2 = this.zza;
            zzidjVar2.zzb(i10, 2);
            int iZzF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzF += zzidj.zzF((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzidjVar2.zzr(iZzF);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzidjVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzief zziefVar = (zzief) list;
        if (!z10) {
            while (i11 < zziefVar.size()) {
                zzidj zzidjVar3 = this.zza;
                int iZzf = zziefVar.zzf(i11);
                zzidjVar3.zzd(i10, (iZzf >> 31) ^ (iZzf + iZzf));
                i11++;
            }
            return;
        }
        zzidj zzidjVar4 = this.zza;
        zzidjVar4.zzb(i10, 2);
        int iZzF2 = 0;
        for (int i13 = 0; i13 < zziefVar.size(); i13++) {
            int iZzf2 = zziefVar.zzf(i13);
            iZzF2 += zzidj.zzF((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzidjVar4.zzr(iZzF2);
        while (i11 < zziefVar.size()) {
            int iZzf3 = zziefVar.zzf(i11);
            zzidjVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzifd)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzidj zzidjVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzidjVar.zzf(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            zzidj zzidjVar2 = this.zza;
            zzidjVar2.zzb(i10, 2);
            int iZzG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzG += zzidj.zzG((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzidjVar2.zzr(iZzG);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzidjVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzifd zzifdVar = (zzifd) list;
        if (!z10) {
            while (i11 < zzifdVar.size()) {
                zzidj zzidjVar3 = this.zza;
                long jZzc = zzifdVar.zzc(i11);
                zzidjVar3.zzf(i10, (jZzc >> 63) ^ (jZzc + jZzc));
                i11++;
            }
            return;
        }
        zzidj zzidjVar4 = this.zza;
        zzidjVar4.zzb(i10, 2);
        int iZzG2 = 0;
        for (int i13 = 0; i13 < zzifdVar.size(); i13++) {
            long jZzc2 = zzifdVar.zzc(i13);
            iZzG2 += zzidj.zzG((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzidjVar4.zzr(iZzG2);
        while (i11 < zzifdVar.size()) {
            long jZzc3 = zzifdVar.zzc(i11);
            zzidjVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzM(int i10, zzifh zzifhVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            zzidjVar.zzr(zzifi.zzc(zzifhVar, entry.getKey(), entry.getValue()));
            zzifi.zzb(zzidjVar, zzifhVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzb(int i10, int i11) throws IOException {
        this.zza.zze(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzc(int i10, long j10) throws IOException {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzd(int i10, long j10) throws IOException {
        this.zza.zzg(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zze(int i10, float f10) throws IOException {
        this.zza.zze(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzg(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzg(int i10, int i11) throws IOException {
        this.zza.zzc(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzh(int i10, long j10) throws IOException {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzc(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzj(int i10, long j10) throws IOException {
        this.zza.zzg(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zze(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzl(int i10, boolean z10) throws IOException {
        this.zza.zzh(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzm(int i10, String str) throws IOException {
        this.zza.zzi(i10, str);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzn(int i10, zzida zzidaVar) throws IOException {
        this.zza.zzj(i10, zzidaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzo(int i10, int i11) throws IOException {
        this.zza.zzd(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzp(int i10, int i11) throws IOException {
        this.zza.zzd(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzq(int i10, long j10) throws IOException {
        this.zza.zzf(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzr(int i10, Object obj, zzigh zzighVar) throws IOException {
        zzidj zzidjVar = this.zza;
        zzicj zzicjVar = (zzicj) obj;
        zzidjVar.zzb(i10, 2);
        zzidjVar.zzr(zzicjVar.zzaT(zzighVar));
        zzighVar.zzf(zzicjVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzs(int i10, Object obj, zzigh zzighVar) throws IOException {
        zzidj zzidjVar = this.zza;
        zzidjVar.zzb(i10, 3);
        zzighVar.zzf((zzicj) obj, this);
        zzidjVar.zzb(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    @Deprecated
    public final void zzt(int i10) throws IOException {
        this.zza.zzb(i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    @Deprecated
    public final void zzu(int i10) throws IOException {
        this.zza.zzb(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzv(int i10, Object obj) throws IOException {
        if (obj instanceof zzida) {
            this.zza.zzn(i10, (zzida) obj);
        } else {
            this.zza.zzm(i10, (zzifp) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzw(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzief)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzc(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int iZzG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzG += zzidj.zzG(((Integer) list.get(i12)).intValue());
            }
            zzidjVar.zzr(iZzG);
            while (i11 < list.size()) {
                zzidjVar.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzief zziefVar = (zzief) list;
        if (!z10) {
            while (i11 < zziefVar.size()) {
                this.zza.zzc(i10, zziefVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int iZzG2 = 0;
        for (int i13 = 0; i13 < zziefVar.size(); i13++) {
            iZzG2 += zzidj.zzG(zziefVar.zzf(i13));
        }
        zzidjVar2.zzr(iZzG2);
        while (i11 < zziefVar.size()) {
            zzidjVar2.zzq(zziefVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzx(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzief)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zze(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            zzidjVar.zzr(i12);
            while (i11 < list.size()) {
                zzidjVar.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzief zziefVar = (zzief) list;
        if (!z10) {
            while (i11 < zziefVar.size()) {
                this.zza.zze(i10, zziefVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zziefVar.size(); i15++) {
            zziefVar.zzf(i15);
            i14 += 4;
        }
        zzidjVar2.zzr(i14);
        while (i11 < zziefVar.size()) {
            zzidjVar2.zzs(zziefVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzifd)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int iZzG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzG += zzidj.zzG(((Long) list.get(i12)).longValue());
            }
            zzidjVar.zzr(iZzG);
            while (i11 < list.size()) {
                zzidjVar.zzt(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzifd zzifdVar = (zzifd) list;
        if (!z10) {
            while (i11 < zzifdVar.size()) {
                this.zza.zzf(i10, zzifdVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int iZzG2 = 0;
        for (int i13 = 0; i13 < zzifdVar.size(); i13++) {
            iZzG2 += zzidj.zzG(zzifdVar.zzc(i13));
        }
        zzidjVar2.zzr(iZzG2);
        while (i11 < zzifdVar.size()) {
            zzidjVar2.zzt(zzifdVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihi
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzifd)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzidj zzidjVar = this.zza;
            zzidjVar.zzb(i10, 2);
            int iZzG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzG += zzidj.zzG(((Long) list.get(i12)).longValue());
            }
            zzidjVar.zzr(iZzG);
            while (i11 < list.size()) {
                zzidjVar.zzt(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzifd zzifdVar = (zzifd) list;
        if (!z10) {
            while (i11 < zzifdVar.size()) {
                this.zza.zzf(i10, zzifdVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzidj zzidjVar2 = this.zza;
        zzidjVar2.zzb(i10, 2);
        int iZzG2 = 0;
        for (int i13 = 0; i13 < zzifdVar.size(); i13++) {
            iZzG2 += zzidj.zzG(zzifdVar.zzc(i13));
        }
        zzidjVar2.zzr(iZzG2);
        while (i11 < zzifdVar.size()) {
            zzidjVar2.zzt(zzifdVar.zzc(i11));
            i11++;
        }
    }
}
