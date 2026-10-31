package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Formattable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzyy extends zzabm implements zzabi {
    protected final Object[] zza;
    protected final StringBuilder zzb;
    private int zzc;

    protected zzyy(zzaaf zzaafVar, Object[] objArr, StringBuilder sb2) {
        super(zzaafVar);
        this.zzc = 0;
        this.zza = objArr;
        this.zzb = sb2;
    }

    public static StringBuilder zza(zzzd zzzdVar, StringBuilder sb2) {
        if (zzzdVar.zzh() != null) {
            zzyy zzyyVar = new zzyy(zzzdVar.zzh(), zzzdVar.zzi(), sb2);
            sb2 = (StringBuilder) zzyyVar.zzl();
            if (zzzdVar.zzi().length > zzyyVar.zzj()) {
                sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                return sb2;
            }
        } else {
            sb2.append(zzzh.zza(zzzdVar.zzj()));
        }
        return sb2;
    }

    private static void zzm(StringBuilder sb2, Object obj, String str) {
        sb2.append("[INVALID: format=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(obj.getClass().getCanonicalName());
        sb2.append(", value=");
        sb2.append(zzzh.zza(obj));
        sb2.append("]");
    }

    @Override // com.google.android.gms.internal.measurement.zzabm
    public final void zzb(int i10, int i11, zzabh zzabhVar) {
        zzh().zzd(this.zzb, zzi(), this.zzc, i10);
        zzabhVar.zze(this, this.zza);
        this.zzc = i11;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    /* JADX WARN: Code duplicated, block: B:32:0x0041  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    @Override // com.google.android.gms.internal.measurement.zzabi
    public final void zzc(Object obj, zzyz zzyzVar, zzza zzzaVar) {
        boolean zIsValidCodePoint;
        int iOrdinal = zzyzVar.zzc().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                zzm(this.zzb, obj, zzyzVar.zze());
                return;
            }
        }
        StringBuilder sb2 = this.zzb;
        int iOrdinal2 = zzyzVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                if (zzzaVar.zze()) {
                    sb2.append(obj);
                    return;
                }
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 5 && zzzaVar.zzd(128, false, false).equals(zzzaVar)) {
                        zzzh.zzc(sb2, (Number) obj, zzzaVar);
                        return;
                    }
                } else if (zzzaVar.zze()) {
                    sb2.append(obj);
                    return;
                }
            } else if (zzzaVar.zze()) {
                if (obj instanceof Character) {
                    sb2.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb2.append((char) iIntValue);
                    return;
                } else {
                    sb2.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else if (obj instanceof Formattable) {
            zzzh.zzb((Formattable) obj, sb2, zzzaVar);
            return;
        } else if (zzzaVar.zze()) {
            sb2.append(zzzh.zza(obj));
            return;
        }
        String strZze = zzyzVar.zze();
        if (!zzzaVar.zze()) {
            int iZzb = zzyzVar.zzb();
            if (zzzaVar.zzk()) {
                iZzb &= 65503;
            }
            StringBuilder sb3 = new StringBuilder("%");
            zzzaVar.zzl(sb3);
            sb3.append((char) iZzb);
            strZze = sb3.toString();
        }
        sb2.append(String.format(zzzh.zza, strZze, obj));
    }

    @Override // com.google.android.gms.internal.measurement.zzabi
    public final void zzd(Object obj, zzabf zzabfVar, zzza zzzaVar) {
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            zzzaVar.zzl(sb2);
            sb2.append(true != zzzaVar.zzk() ? 't' : 'T');
            sb2.append(zzabfVar.zzb());
            this.zzb.append(String.format(zzzh.zza, sb2.toString(), obj));
            return;
        }
        StringBuilder sb3 = this.zzb;
        char cZzb = zzabfVar.zzb();
        StringBuilder sb4 = new StringBuilder(String.valueOf(cZzb).length() + 2);
        sb4.append("%t");
        sb4.append(cZzb);
        zzm(sb3, obj, sb4.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzabi
    public final void zze() {
        this.zzb.append("[ERROR: MISSING LOG ARGUMENT]");
    }

    @Override // com.google.android.gms.internal.measurement.zzabi
    public final void zzf() {
        this.zzb.append("null");
    }

    @Override // com.google.android.gms.internal.measurement.zzabm
    public final /* bridge */ /* synthetic */ Object zzg() {
        zzabn zzabnVarZzh = zzh();
        String strZzi = zzi();
        int i10 = this.zzc;
        int length = zzi().length();
        StringBuilder sb2 = this.zzb;
        zzabnVarZzh.zzd(sb2, strZzi, i10, length);
        return sb2;
    }
}
