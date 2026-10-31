package com.google.android.gms.internal.play_billing;

import com.applovin.mediation.ads.Zfi.OgqfiHA;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgt {
    public static final zzgt zza;
    public static final zzgt zzb;
    public static final zzgt zzc;
    public static final zzgt zzd;
    public static final zzgt zze;
    public static final zzgt zzf;
    public static final zzgt zzg;
    public static final zzgt zzh;
    public static final zzgt zzi;
    public static final zzgt zzj;
    private static final /* synthetic */ zzgt[] zzk;
    private final Class zzl;

    private zzgt(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.zzl = cls2;
    }

    public static zzgt[] values() {
        return (zzgt[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }

    static {
        zzgt zzgtVar = new zzgt("VOID", 0, Void.class, Void.class, null);
        zza = zzgtVar;
        Class cls = Integer.TYPE;
        zzgt zzgtVar2 = new zzgt(OgqfiHA.qogBPAEydaApbQ, 1, cls, Integer.class, 0);
        zzb = zzgtVar2;
        zzgt zzgtVar3 = new zzgt("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgtVar3;
        zzgt zzgtVar4 = new zzgt("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgtVar4;
        zzgt zzgtVar5 = new zzgt("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgtVar5;
        zzgt zzgtVar6 = new zzgt("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgtVar6;
        zzgt zzgtVar7 = new zzgt("STRING", 6, String.class, String.class, "");
        zzg = zzgtVar7;
        zzgt zzgtVar8 = new zzgt("BYTE_STRING", 7, zzfg.class, zzfg.class, zzfg.zza);
        zzh = zzgtVar8;
        zzgt zzgtVar9 = new zzgt("ENUM", 8, cls, Integer.class, null);
        zzi = zzgtVar9;
        zzgt zzgtVar10 = new zzgt("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgtVar10;
        zzk = new zzgt[]{zzgtVar, zzgtVar2, zzgtVar3, zzgtVar4, zzgtVar5, zzgtVar6, zzgtVar7, zzgtVar8, zzgtVar9, zzgtVar10};
    }
}
