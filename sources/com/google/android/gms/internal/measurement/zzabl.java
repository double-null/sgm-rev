package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabl extends zzabp {
    private static final zzabp zza = new zzabl();

    private zzabl() {
    }

    public static zzabp zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzabp
    public final int zzb(zzabm zzabmVar, int i10, String str, int i11, int i12, int i13) throws zzabo {
        zzabh zzabhVarZza;
        char cCharAt = str.charAt(i13);
        zzza zzzaVarZzb = zzza.zzb(str, i12, i13, (cCharAt & ' ') == 0);
        zzyz zzyzVarZza = zzyz.zza(cCharAt);
        int i14 = i13 + 1;
        if (zzyzVarZza != null) {
            if (!zzzaVarZzb.zzi(zzyzVarZza)) {
                throw zzabo.zza("invalid format specifier", str, i11, i14);
            }
            zzabhVarZza = zzabj.zza(i10, zzyzVarZza, zzzaVarZzb);
        } else if (cCharAt == 't' || cCharAt == 'T') {
            if (!zzzaVarZzb.zzh(160, false)) {
                throw zzabo.zza("invalid format specification", str, i11, i14);
            }
            int i15 = i14 + 1;
            if (i15 > str.length()) {
                throw zzabo.zzb("truncated format specifier", str, i11);
            }
            zzabf zzabfVarZza = zzabf.zza(str.charAt(i14));
            if (zzabfVarZza == null) {
                throw zzabo.zzb("illegal date/time conversion", str, i14);
            }
            zzabhVarZza = zzabg.zza(zzabfVarZza, zzzaVarZzb, i10);
            i14 = i15;
        } else {
            if (cCharAt != 'h' && cCharAt != 'H') {
                throw zzabo.zza("invalid format specification", str, i11, i14);
            }
            if (!zzzaVarZzb.zzh(160, false)) {
                throw zzabo.zza("invalid format specification", str, i11, i14);
            }
            zzabhVarZza = new zzabk(zzzaVarZzb, i10, zzzaVarZzb);
        }
        zzabmVar.zzk(i11, i14, zzabhVarZza);
        return i14;
    }
}
