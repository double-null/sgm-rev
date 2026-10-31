package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzadb implements zzago {
    private final zzada zza;

    private zzadb(zzada zzadaVar) {
        this.zza = zzadaVar;
        zzadaVar.zza = this;
    }

    public static zzadb zza(zzada zzadaVar) {
        Object obj = zzadaVar.zza;
        return obj != null ? (zzadb) obj : new zzadb(zzadaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            zzadaVar.zzr(i12);
            while (i11 < list.size()) {
                zzadaVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z10) {
            while (i11 < zzaeqVar.size()) {
                this.zza.zzg(i10, zzaeqVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzaeqVar.size(); i15++) {
            zzaeqVar.zzc(i15);
            i14 += 8;
        }
        zzadaVar2.zzr(i14);
        while (i11 < zzaeqVar.size()) {
            zzadaVar2.zzu(zzaeqVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadm)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zze(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            zzadaVar.zzr(i12);
            while (i11 < list.size()) {
                zzadaVar.zzs(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzadm zzadmVar = (zzadm) list;
        if (!z10) {
            while (i11 < zzadmVar.size()) {
                this.zza.zze(i10, Float.floatToRawIntBits(zzadmVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzadmVar.size(); i15++) {
            zzadmVar.zze(i15);
            i14 += 4;
        }
        zzadaVar2.zzr(i14);
        while (i11 < zzadmVar.size()) {
            zzadaVar2.zzs(Float.floatToRawIntBits(zzadmVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            zzadaVar.zzr(i12);
            while (i11 < list.size()) {
                zzadaVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzadc zzadcVar = (zzadc) list;
        if (!z10) {
            while (i11 < zzadcVar.size()) {
                this.zza.zzg(i10, Double.doubleToRawLongBits(zzadcVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzadcVar.size(); i15++) {
            zzadcVar.zze(i15);
            i14 += 8;
        }
        zzadaVar2.zzr(i14);
        while (i11 < zzadcVar.size()) {
            zzadaVar2.zzu(Double.doubleToRawLongBits(zzadcVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzc(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int iZzF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzF += zzada.zzF(((Integer) list.get(i12)).intValue());
            }
            zzadaVar.zzr(iZzF);
            while (i11 < list.size()) {
                zzadaVar.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z10) {
            while (i11 < zzadvVar.size()) {
                this.zza.zzc(i10, zzadvVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int iZzF2 = 0;
        for (int i13 = 0; i13 < zzadvVar.size(); i13++) {
            iZzF2 += zzada.zzF(zzadvVar.zzf(i13));
        }
        zzadaVar2.zzr(iZzF2);
        while (i11 < zzadvVar.size()) {
            zzadaVar2.zzq(zzadvVar.zzf(i11));
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
    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaci)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            zzadaVar.zzr(i12);
            while (i11 < list.size()) {
                zzadaVar.zzp(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzaci zzaciVar = (zzaci) list;
        if (!z10) {
            while (i11 < zzaciVar.size()) {
                this.zza.zzh(i10, zzaciVar.zze(i11));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzaciVar.size(); i15++) {
            zzaciVar.zze(i15);
            i14++;
        }
        zzadaVar2.zzr(i14);
        while (i11 < zzaciVar.size()) {
            zzadaVar2.zzp(zzaciVar.zze(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzF(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaen)) {
            while (i11 < list.size()) {
                this.zza.zzi(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzaen zzaenVar = (zzaen) list;
        while (i11 < list.size()) {
            Object objZzc = zzaenVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzi(i10, (String) objZzc);
            } else {
                this.zza.zzj(i10, (zzacr) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzG(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzj(i10, (zzacr) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzH(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int iZzE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzE += zzada.zzE(((Integer) list.get(i12)).intValue());
            }
            zzadaVar.zzr(iZzE);
            while (i11 < list.size()) {
                zzadaVar.zzr(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z10) {
            while (i11 < zzadvVar.size()) {
                this.zza.zzd(i10, zzadvVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int iZzE2 = 0;
        for (int i13 = 0; i13 < zzadvVar.size(); i13++) {
            iZzE2 += zzada.zzE(zzadvVar.zzf(i13));
        }
        zzadaVar2.zzr(iZzE2);
        while (i11 < zzadvVar.size()) {
            zzadaVar2.zzr(zzadvVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zze(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            zzadaVar.zzr(i12);
            while (i11 < list.size()) {
                zzadaVar.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z10) {
            while (i11 < zzadvVar.size()) {
                this.zza.zze(i10, zzadvVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzadvVar.size(); i15++) {
            zzadvVar.zzf(i15);
            i14 += 4;
        }
        zzadaVar2.zzr(i14);
        while (i11 < zzadvVar.size()) {
            zzadaVar2.zzs(zzadvVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            zzadaVar.zzr(i12);
            while (i11 < list.size()) {
                zzadaVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z10) {
            while (i11 < zzaeqVar.size()) {
                this.zza.zzg(i10, zzaeqVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzaeqVar.size(); i15++) {
            zzaeqVar.zzc(i15);
            i14 += 8;
        }
        zzadaVar2.zzr(i14);
        while (i11 < zzaeqVar.size()) {
            zzadaVar2.zzu(zzaeqVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzada zzadaVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzadaVar.zzd(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            zzada zzadaVar2 = this.zza;
            zzadaVar2.zzb(i10, 2);
            int iZzE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzE += zzada.zzE((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzadaVar2.zzr(iZzE);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzadaVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z10) {
            while (i11 < zzadvVar.size()) {
                zzada zzadaVar3 = this.zza;
                int iZzf = zzadvVar.zzf(i11);
                zzadaVar3.zzd(i10, (iZzf >> 31) ^ (iZzf + iZzf));
                i11++;
            }
            return;
        }
        zzada zzadaVar4 = this.zza;
        zzadaVar4.zzb(i10, 2);
        int iZzE2 = 0;
        for (int i13 = 0; i13 < zzadvVar.size(); i13++) {
            int iZzf2 = zzadvVar.zzf(i13);
            iZzE2 += zzada.zzE((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzadaVar4.zzr(iZzE2);
        while (i11 < zzadvVar.size()) {
            int iZzf3 = zzadvVar.zzf(i11);
            zzadaVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzada zzadaVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzadaVar.zzf(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            zzada zzadaVar2 = this.zza;
            zzadaVar2.zzb(i10, 2);
            int iZzF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzF += zzada.zzF((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzadaVar2.zzr(iZzF);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzadaVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z10) {
            while (i11 < zzaeqVar.size()) {
                zzada zzadaVar3 = this.zza;
                long jZzc = zzaeqVar.zzc(i11);
                zzadaVar3.zzf(i10, (jZzc >> 63) ^ (jZzc + jZzc));
                i11++;
            }
            return;
        }
        zzada zzadaVar4 = this.zza;
        zzadaVar4.zzb(i10, 2);
        int iZzF2 = 0;
        for (int i13 = 0; i13 < zzaeqVar.size(); i13++) {
            long jZzc2 = zzaeqVar.zzc(i13);
            iZzF2 += zzada.zzF((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzadaVar4.zzr(iZzF2);
        while (i11 < zzaeqVar.size()) {
            long jZzc3 = zzaeqVar.zzc(i11);
            zzadaVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzM(int i10, zzaeu zzaeuVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            zzadaVar.zzr(zzaev.zzc(zzaeuVar, entry.getKey(), entry.getValue()));
            zzaev.zzb(zzadaVar, zzaeuVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzb(int i10, int i11) throws IOException {
        this.zza.zze(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzc(int i10, long j10) throws IOException {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzd(int i10, long j10) throws IOException {
        this.zza.zzg(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zze(int i10, float f10) throws IOException {
        this.zza.zze(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzg(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzg(int i10, int i11) throws IOException {
        this.zza.zzc(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzh(int i10, long j10) throws IOException {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzc(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzj(int i10, long j10) throws IOException {
        this.zza.zzg(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zze(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzl(int i10, boolean z10) throws IOException {
        this.zza.zzh(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzm(int i10, String str) throws IOException {
        this.zza.zzi(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzn(int i10, zzacr zzacrVar) throws IOException {
        this.zza.zzj(i10, zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzo(int i10, int i11) throws IOException {
        this.zza.zzd(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzp(int i10, int i11) throws IOException {
        this.zza.zzd(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzq(int i10, long j10) throws IOException {
        this.zza.zzf(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzr(int i10, Object obj, zzafp zzafpVar) throws IOException {
        zzada zzadaVar = this.zza;
        zzacb zzacbVar = (zzacb) obj;
        zzadaVar.zzb(i10, 2);
        zzadaVar.zzr(zzacbVar.zzcf(zzafpVar));
        zzafpVar.zzf(zzacbVar, this);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzs(int i10, Object obj, zzafp zzafpVar) throws IOException {
        zzada zzadaVar = this.zza;
        zzadaVar.zzb(i10, 3);
        zzafpVar.zzf((zzacb) obj, this);
        zzadaVar.zzb(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    @Deprecated
    public final void zzt(int i10) throws IOException {
        this.zza.zzb(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    @Deprecated
    public final void zzu(int i10) throws IOException {
        this.zza.zzb(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzv(int i10, Object obj) throws IOException {
        if (obj instanceof zzacr) {
            this.zza.zzn(i10, (zzacr) obj);
        } else {
            this.zza.zzm(i10, (zzafc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzw(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzc(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int iZzF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzF += zzada.zzF(((Integer) list.get(i12)).intValue());
            }
            zzadaVar.zzr(iZzF);
            while (i11 < list.size()) {
                zzadaVar.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z10) {
            while (i11 < zzadvVar.size()) {
                this.zza.zzc(i10, zzadvVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int iZzF2 = 0;
        for (int i13 = 0; i13 < zzadvVar.size(); i13++) {
            iZzF2 += zzada.zzF(zzadvVar.zzf(i13));
        }
        zzadaVar2.zzr(iZzF2);
        while (i11 < zzadvVar.size()) {
            zzadaVar2.zzq(zzadvVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzx(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadv)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zze(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            zzadaVar.zzr(i12);
            while (i11 < list.size()) {
                zzadaVar.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z10) {
            while (i11 < zzadvVar.size()) {
                this.zza.zze(i10, zzadvVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzadvVar.size(); i15++) {
            zzadvVar.zzf(i15);
            i14 += 4;
        }
        zzadaVar2.zzr(i14);
        while (i11 < zzadvVar.size()) {
            zzadaVar2.zzs(zzadvVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int iZzF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzF += zzada.zzF(((Long) list.get(i12)).longValue());
            }
            zzadaVar.zzr(iZzF);
            while (i11 < list.size()) {
                zzadaVar.zzt(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z10) {
            while (i11 < zzaeqVar.size()) {
                this.zza.zzf(i10, zzaeqVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int iZzF2 = 0;
        for (int i13 = 0; i13 < zzaeqVar.size(); i13++) {
            iZzF2 += zzada.zzF(zzaeqVar.zzc(i13));
        }
        zzadaVar2.zzr(iZzF2);
        while (i11 < zzaeqVar.size()) {
            zzadaVar2.zzt(zzaeqVar.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i10, 2);
            int iZzF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzF += zzada.zzF(((Long) list.get(i12)).longValue());
            }
            zzadaVar.zzr(iZzF);
            while (i11 < list.size()) {
                zzadaVar.zzt(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z10) {
            while (i11 < zzaeqVar.size()) {
                this.zza.zzf(i10, zzaeqVar.zzc(i11));
                i11++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i10, 2);
        int iZzF2 = 0;
        for (int i13 = 0; i13 < zzaeqVar.size(); i13++) {
            iZzF2 += zzada.zzF(zzaeqVar.zzc(i13));
        }
        zzadaVar2.zzr(iZzF2);
        while (i11 < zzaeqVar.size()) {
            zzadaVar2.zzt(zzaeqVar.zzc(i11));
            i11++;
        }
    }
}
