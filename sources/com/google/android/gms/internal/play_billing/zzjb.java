package com.google.android.gms.internal.play_billing;

import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
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
public final class zzjb {
    public static final zzjb zza;
    public static final zzjb zzb;
    public static final zzjb zzc;
    public static final zzjb zzd;
    public static final zzjb zze;
    public static final zzjb zzf;
    public static final zzjb zzg;
    public static final zzjb zzh;
    public static final zzjb zzi;
    public static final zzjb zzj;
    public static final zzjb zzk;
    public static final zzjb zzl;
    public static final zzjb zzm;
    public static final zzjb zzn;
    public static final zzjb zzo;
    public static final zzjb zzp;
    public static final zzjb zzq;
    public static final zzjb zzr;
    private static final /* synthetic */ zzjb[] zzs;
    private final zzjc zzt;
    private final int zzu;

    private zzjb(String str, int i10, zzjc zzjcVar, int i11) {
        super(str, i10);
        this.zzt = zzjcVar;
        this.zzu = i11;
    }

    public static zzjb[] values() {
        return (zzjb[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzjc zzb() {
        return this.zzt;
    }

    static {
        zzjb zzjbVar = new zzjb("DOUBLE", 0, zzjc.DOUBLE, 1);
        zza = zzjbVar;
        zzjb zzjbVar2 = new zzjb("FLOAT", 1, zzjc.FLOAT, 5);
        zzb = zzjbVar2;
        zzjc zzjcVar = zzjc.LONG;
        zzjb zzjbVar3 = new zzjb("INT64", 2, zzjcVar, 0);
        zzc = zzjbVar3;
        zzjb zzjbVar4 = new zzjb("UINT64", 3, zzjcVar, 0);
        zzd = zzjbVar4;
        zzjc zzjcVar2 = zzjc.INT;
        zzjb zzjbVar5 = new zzjb("INT32", 4, zzjcVar2, 0);
        zze = zzjbVar5;
        zzjb zzjbVar6 = new zzjb("FIXED64", 5, zzjcVar, 1);
        zzf = zzjbVar6;
        zzjb zzjbVar7 = new zzjb("FIXED32", 6, zzjcVar2, 5);
        zzg = zzjbVar7;
        zzjb zzjbVar8 = new zzjb("BOOL", 7, zzjc.BOOLEAN, 0);
        zzh = zzjbVar8;
        zzjb zzjbVar9 = new zzjb("STRING", 8, zzjc.STRING, 2);
        zzi = zzjbVar9;
        zzjc zzjcVar3 = zzjc.MESSAGE;
        zzjb zzjbVar10 = new zzjb("GROUP", 9, zzjcVar3, 3);
        zzj = zzjbVar10;
        zzjb zzjbVar11 = new zzjb("MESSAGE", 10, zzjcVar3, 2);
        zzk = zzjbVar11;
        zzjb zzjbVar12 = new zzjb(WKirgUEJJ.OccHd, 11, zzjc.BYTE_STRING, 2);
        zzl = zzjbVar12;
        zzjb zzjbVar13 = new zzjb("UINT32", 12, zzjcVar2, 0);
        zzm = zzjbVar13;
        zzjb zzjbVar14 = new zzjb("ENUM", 13, zzjc.ENUM, 0);
        zzn = zzjbVar14;
        zzjb zzjbVar15 = new zzjb("SFIXED32", 14, zzjcVar2, 5);
        zzo = zzjbVar15;
        zzjb zzjbVar16 = new zzjb("SFIXED64", 15, zzjcVar, 1);
        zzp = zzjbVar16;
        zzjb zzjbVar17 = new zzjb("SINT32", 16, zzjcVar2, 0);
        zzq = zzjbVar17;
        zzjb zzjbVar18 = new zzjb("SINT64", 17, zzjcVar, 0);
        zzr = zzjbVar18;
        zzs = new zzjb[]{zzjbVar, zzjbVar2, zzjbVar3, zzjbVar4, zzjbVar5, zzjbVar6, zzjbVar7, zzjbVar8, zzjbVar9, zzjbVar10, zzjbVar11, zzjbVar12, zzjbVar13, zzjbVar14, zzjbVar15, zzjbVar16, zzjbVar17, zzjbVar18};
    }
}
