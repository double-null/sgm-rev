package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaqm implements zzari {
    private final zzapt zza;
    private final zzes zzb = new zzes(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfi zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaqm(zzapt zzaptVar) {
        this.zza = zzaptVar;
    }

    private final void zze(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zzf(zzet zzetVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzetVar.zzd(), i10 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzetVar.zzk(iMin);
        } else {
            zzetVar.zzm(bArr, this.zzd, iMin);
        }
        int i11 = this.zzd + iMin;
        this.zzd = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zza(zzfi zzfiVar, zzagb zzagbVar, zzarh zzarhVar) {
        this.zze = zzfiVar;
        this.zza.zzb(zzagbVar, zzarhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzes] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.ads.zzapt] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzc(zzet zzetVar, int i10) throws zzat {
        int i11;
        int i12;
        ?? r10;
        zzet zzetVar2;
        int i13;
        int i14;
        int i15;
        ?? r11;
        long jZze;
        char c10;
        zzet zzetVar3 = zzetVar;
        this.zze.getClass();
        int i16 = -1;
        int i17 = 2;
        ?? r12 = 0;
        if ((i10 & 1) != 0) {
            int i18 = this.zzc;
            if (i18 != 0 && i18 != 1) {
                if (i18 != 2) {
                    int i19 = this.zzj;
                    if (i19 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i19).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i19);
                        sb2.append(" more bytes");
                        zzeg.zzc("PesReader", sb2.toString());
                    }
                    this.zza.zze(zzetVar.zze() == 0);
                } else {
                    zzeg.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i20 = i10;
        while (zzetVar.zzd() > 0) {
            int i21 = this.zzc;
            if (i21 == 0) {
                i11 = i20;
                i12 = i17;
                r10 = r12;
                zzetVar2 = zzetVar3;
                i13 = i16;
                zzetVar2.zzk(zzetVar.zzd());
            } else if (i21 == 1) {
                i11 = i20;
                zzes zzesVar = this.zzb;
                zzetVar2 = zzetVar;
                if (zzf(zzetVar2, zzesVar.zza, 9)) {
                    r10 = 0;
                    zzesVar.zzf(0);
                    int iZzj = zzesVar.zzj(24);
                    if (iZzj != 1) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj).length() + 30);
                        sb3.append("Unexpected start code prefix: ");
                        sb3.append(iZzj);
                        zzeg.zzc("PesReader", sb3.toString());
                        i13 = -1;
                        this.zzj = -1;
                        i14 = 0;
                        i12 = 2;
                    } else {
                        zzesVar.zzh(8);
                        int iZzj2 = zzesVar.zzj(16);
                        zzesVar.zzh(5);
                        this.zzk = zzesVar.zzi();
                        i12 = 2;
                        zzesVar.zzh(2);
                        this.zzf = zzesVar.zzi();
                        this.zzg = zzesVar.zzi();
                        zzesVar.zzh(6);
                        int iZzj3 = zzesVar.zzj(8);
                        this.zzi = iZzj3;
                        if (iZzj2 == 0) {
                            this.zzj = -1;
                            i13 = -1;
                        } else {
                            int i22 = (iZzj2 - 3) - iZzj3;
                            this.zzj = i22;
                            if (i22 < 0) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i22).length() + 36);
                                sb4.append("Found negative packet payload size: ");
                                sb4.append(i22);
                                zzeg.zzc("PesReader", sb4.toString());
                                i13 = -1;
                                this.zzj = -1;
                            } else {
                                i13 = -1;
                            }
                        }
                        i14 = 2;
                    }
                    zze(i14);
                } else {
                    i13 = -1;
                    r10 = 0;
                    i12 = 2;
                }
            } else if (i21 != i17) {
                int iZzd = zzetVar.zzd();
                int i23 = this.zzj;
                if (i23 == i16) {
                    r11 = r12;
                } else {
                    i15 = iZzd - i23;
                }
                if (r11 > 0) {
                    r11 = i15;
                    iZzd -= r11;
                    zzetVar3.zzf(zzetVar.zzg() + iZzd);
                }
                r11 = i15;
                ?? r13 = this.zza;
                r13.zzd(zzetVar3);
                int i24 = this.zzj;
                if (i24 != i16) {
                    int i25 = i24 - iZzd;
                    this.zzj = i25;
                    if (i25 == 0) {
                        r13.zze(r12);
                        zze(1);
                    }
                }
                i11 = i20;
                i12 = i17;
                r10 = r12;
                zzetVar2 = zzetVar3;
                i13 = i16;
            } else {
                int iMin = Math.min(10, this.zzi);
                ?? r14 = this.zzb;
                if (zzf(zzetVar3, r14.zza, iMin) && zzf(zzetVar3, null, this.zzi)) {
                    r14.zzf(r12);
                    if (this.zzf) {
                        r14.zzh(4);
                        long jZzj = r14.zzj(3);
                        r14.zzh(1);
                        int iZzj4 = r14.zzj(15) << 15;
                        r14.zzh(1);
                        long jZzj2 = r14.zzj(15);
                        r14.zzh(1);
                        if (this.zzh || !this.zzg) {
                            c10 = 30;
                        } else {
                            r14.zzh(4);
                            long jZzj3 = ((long) r14.zzj(3)) << 30;
                            r14.zzh(1);
                            int iZzj5 = r14.zzj(15) << 15;
                            r14.zzh(1);
                            long jZzj4 = r14.zzj(15);
                            r14.zzh(1);
                            this.zze.zze(jZzj4 | ((long) iZzj5) | jZzj3);
                            this.zzh = true;
                            c10 = 30;
                        }
                        jZze = this.zze.zze((jZzj << c10) | ((long) iZzj4) | jZzj2);
                    } else {
                        i20 = i20;
                        jZze = -9223372036854775807L;
                    }
                    int i26 = i20 | (true != this.zzk ? 0 : 4);
                    this.zza.zzc(jZze, i26);
                    zze(3);
                    zzetVar3 = zzetVar;
                    i20 = i26;
                    i16 = -1;
                    i17 = 2;
                    r12 = 0;
                } else {
                    i11 = i20;
                    i13 = i16;
                    i12 = i17;
                    r10 = r12;
                    zzetVar2 = zzetVar;
                }
            }
            i16 = i13;
            r12 = r10;
            zzetVar3 = zzetVar2;
            i17 = i12;
            i20 = i11;
        }
    }

    public final boolean zzd(boolean z10) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
