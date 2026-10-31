package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfp implements zzjd {
    private final zzfo zza;

    private zzfp(zzfo zzfoVar) {
        this.zza = zzfoVar;
        zzfoVar.zza = this;
    }

    public static zzfp zza(zzfo zzfoVar) {
        Object obj = zzfoVar.zza;
        return obj != null ? (zzfp) obj : new zzfp(zzfoVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzA(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzha)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            zzfoVar.zzu(i12);
            while (i11 < list.size()) {
                zzfoVar.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzha zzhaVar = (zzha) list;
        if (!z10) {
            while (i11 < zzhaVar.size()) {
                this.zza.zzj(i10, zzhaVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhaVar.size(); i15++) {
            zzhaVar.zze(i15);
            i14 += 8;
        }
        zzfoVar2.zzu(i14);
        while (i11 < zzhaVar.size()) {
            zzfoVar2.zzk(zzhaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzC(int i10, int i11) throws IOException {
        this.zza.zzt(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzfo zzfoVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzfoVar.zzt(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            zzfo zzfoVar2 = this.zza;
            zzfoVar2.zzs(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzy += zzfo.zzy((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzfoVar2.zzu(iZzy);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzfoVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzgh zzghVar = (zzgh) list;
        if (!z10) {
            while (i11 < zzghVar.size()) {
                zzfo zzfoVar3 = this.zza;
                int iZze = zzghVar.zze(i11);
                zzfoVar3.zzt(i10, (iZze >> 31) ^ (iZze + iZze));
                i11++;
            }
            return;
        }
        zzfo zzfoVar4 = this.zza;
        zzfoVar4.zzs(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzghVar.size(); i13++) {
            int iZze2 = zzghVar.zze(i13);
            iZzy2 += zzfo.zzy((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzfoVar4.zzu(iZzy2);
        while (i11 < zzghVar.size()) {
            int iZze3 = zzghVar.zze(i11);
            zzfoVar4.zzu((iZze3 >> 31) ^ (iZze3 + iZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzE(int i10, long j10) throws IOException {
        this.zza.zzv(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzF(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzha)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzfo zzfoVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzfoVar.zzv(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            zzfo zzfoVar2 = this.zza;
            zzfoVar2.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzz += zzfo.zzz((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzfoVar2.zzu(iZzz);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzfoVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzha zzhaVar = (zzha) list;
        if (!z10) {
            while (i11 < zzhaVar.size()) {
                zzfo zzfoVar3 = this.zza;
                long jZze = zzhaVar.zze(i11);
                zzfoVar3.zzv(i10, (jZze >> 63) ^ (jZze + jZze));
                i11++;
            }
            return;
        }
        zzfo zzfoVar4 = this.zza;
        zzfoVar4.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzhaVar.size(); i13++) {
            long jZze2 = zzhaVar.zze(i13);
            iZzz2 += zzfo.zzz((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        zzfoVar4.zzu(iZzz2);
        while (i11 < zzhaVar.size()) {
            long jZze3 = zzhaVar.zze(i11);
            zzfoVar4.zzw((jZze3 >> 63) ^ (jZze3 + jZze3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    @Deprecated
    public final void zzG(int i10) throws IOException {
        this.zza.zzs(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzH(int i10, String str) throws IOException {
        this.zza.zzq(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzI(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgu)) {
            while (i11 < list.size()) {
                this.zza.zzq(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzgu zzguVar = (zzgu) list;
        while (i11 < list.size()) {
            Object objZza = zzguVar.zza();
            if (objZza instanceof String) {
                this.zza.zzq(i10, (String) objZza);
            } else {
                this.zza.zzf(i10, (zzfg) objZza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzJ(int i10, int i11) throws IOException {
        this.zza.zzt(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzt(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzy += zzfo.zzy(((Integer) list.get(i12)).intValue());
            }
            zzfoVar.zzu(iZzy);
            while (i11 < list.size()) {
                zzfoVar.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgh zzghVar = (zzgh) list;
        if (!z10) {
            while (i11 < zzghVar.size()) {
                this.zza.zzt(i10, zzghVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzghVar.size(); i13++) {
            iZzy2 += zzfo.zzy(zzghVar.zze(i13));
        }
        zzfoVar2.zzu(iZzy2);
        while (i11 < zzghVar.size()) {
            zzfoVar2.zzu(zzghVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzL(int i10, long j10) throws IOException {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzM(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzha)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfo.zzz(((Long) list.get(i12)).longValue());
            }
            zzfoVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfoVar.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzha zzhaVar = (zzha) list;
        if (!z10) {
            while (i11 < zzhaVar.size()) {
                this.zza.zzv(i10, zzhaVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzhaVar.size(); i13++) {
            iZzz2 += zzfo.zzz(zzhaVar.zze(i13));
        }
        zzfoVar2.zzu(iZzz2);
        while (i11 < zzhaVar.size()) {
            zzfoVar2.zzw(zzhaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzd(i10, z10);
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
    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzew)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            zzfoVar.zzu(i12);
            while (i11 < list.size()) {
                zzfoVar.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzew zzewVar = (zzew) list;
        if (!z10) {
            while (i11 < zzewVar.size()) {
                this.zza.zzd(i10, zzewVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzewVar.size(); i15++) {
            zzewVar.zzf(i15);
            i14++;
        }
        zzfoVar2.zzu(i14);
        while (i11 < zzewVar.size()) {
            zzfoVar2.zzb(zzewVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzd(int i10, zzfg zzfgVar) throws IOException {
        this.zza.zzf(i10, zzfgVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzf(i10, (zzfg) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzfq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            zzfoVar.zzu(i12);
            while (i11 < list.size()) {
                zzfoVar.zzk(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzfq zzfqVar = (zzfq) list;
        if (!z10) {
            while (i11 < zzfqVar.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(zzfqVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzfqVar.size(); i15++) {
            zzfqVar.zze(i15);
            i14 += 8;
        }
        zzfoVar2.zzu(i14);
        while (i11 < zzfqVar.size()) {
            zzfoVar2.zzk(Double.doubleToRawLongBits(zzfqVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfo.zzz(((Integer) list.get(i12)).intValue());
            }
            zzfoVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfoVar.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgh zzghVar = (zzgh) list;
        if (!z10) {
            while (i11 < zzghVar.size()) {
                this.zza.zzl(i10, zzghVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzghVar.size(); i13++) {
            iZzz2 += zzfo.zzz(zzghVar.zze(i13));
        }
        zzfoVar2.zzu(iZzz2);
        while (i11 < zzghVar.size()) {
            zzfoVar2.zzm(zzghVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            zzfoVar.zzu(i12);
            while (i11 < list.size()) {
                zzfoVar.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgh zzghVar = (zzgh) list;
        if (!z10) {
            while (i11 < zzghVar.size()) {
                this.zza.zzh(i10, zzghVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzghVar.size(); i15++) {
            zzghVar.zze(i15);
            i14 += 4;
        }
        zzfoVar2.zzu(i14);
        while (i11 < zzghVar.size()) {
            zzfoVar2.zzi(zzghVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzha)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            zzfoVar.zzu(i12);
            while (i11 < list.size()) {
                zzfoVar.zzk(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzha zzhaVar = (zzha) list;
        if (!z10) {
            while (i11 < zzhaVar.size()) {
                this.zza.zzj(i10, zzhaVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzhaVar.size(); i15++) {
            zzhaVar.zze(i15);
            i14 += 8;
        }
        zzfoVar2.zzu(i14);
        while (i11 < zzhaVar.size()) {
            zzfoVar2.zzk(zzhaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzga)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            zzfoVar.zzu(i12);
            while (i11 < list.size()) {
                zzfoVar.zzi(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z10) {
            while (i11 < zzgaVar.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(zzgaVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgaVar.size(); i15++) {
            zzgaVar.zze(i15);
            i14 += 4;
        }
        zzfoVar2.zzu(i14);
        while (i11 < zzgaVar.size()) {
            zzfoVar2.zzi(Float.floatToRawIntBits(zzgaVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzq(int i10, Object obj, zzhw zzhwVar) throws IOException {
        zzfo zzfoVar = this.zza;
        zzfoVar.zzs(i10, 3);
        zzhwVar.zzi((zzer) obj, this);
        zzfoVar.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfo.zzz(((Integer) list.get(i12)).intValue());
            }
            zzfoVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfoVar.zzm(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgh zzghVar = (zzgh) list;
        if (!z10) {
            while (i11 < zzghVar.size()) {
                this.zza.zzl(i10, zzghVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzghVar.size(); i13++) {
            iZzz2 += zzfo.zzz(zzghVar.zze(i13));
        }
        zzfoVar2.zzu(iZzz2);
        while (i11 < zzghVar.size()) {
            zzfoVar2.zzm(zzghVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzha)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzfo.zzz(((Long) list.get(i12)).longValue());
            }
            zzfoVar.zzu(iZzz);
            while (i11 < list.size()) {
                zzfoVar.zzw(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzha zzhaVar = (zzha) list;
        if (!z10) {
            while (i11 < zzhaVar.size()) {
                this.zza.zzv(i10, zzhaVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzhaVar.size(); i13++) {
            iZzz2 += zzfo.zzz(zzhaVar.zze(i13));
        }
        zzfoVar2.zzu(iZzz2);
        while (i11 < zzhaVar.size()) {
            zzfoVar2.zzw(zzhaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzv(int i10, zzhe zzheVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            zzfoVar.zzu(zzhf.zzb(zzheVar, entry.getKey(), entry.getValue()));
            zzhf.zze(zzfoVar, zzheVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzw(int i10, Object obj, zzhw zzhwVar) throws IOException {
        zzfo zzfoVar = this.zza;
        zzer zzerVar = (zzer) obj;
        zzfoVar.zzs(i10, 2);
        zzfoVar.zzu(zzerVar.zzi(zzhwVar));
        zzhwVar.zzi(zzerVar, this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzx(int i10, Object obj) throws IOException {
        if (obj instanceof zzfg) {
            this.zza.zzp(i10, (zzfg) obj);
        } else {
            this.zza.zzo(i10, (zzhm) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzy(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjd
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzfo zzfoVar = this.zza;
            zzfoVar.zzs(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            zzfoVar.zzu(i12);
            while (i11 < list.size()) {
                zzfoVar.zzi(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgh zzghVar = (zzgh) list;
        if (!z10) {
            while (i11 < zzghVar.size()) {
                this.zza.zzh(i10, zzghVar.zze(i11));
                i11++;
            }
            return;
        }
        zzfo zzfoVar2 = this.zza;
        zzfoVar2.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzghVar.size(); i15++) {
            zzghVar.zze(i15);
            i14 += 4;
        }
        zzfoVar2.zzu(i14);
        while (i11 < zzghVar.size()) {
            zzfoVar2.zzi(zzghVar.zze(i11));
            i11++;
        }
    }
}
