package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzapv implements zzapt {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzahk zzb;
    private final zzarl zzd;
    private final String zze;
    private final zzet zzf;
    private final zzaqk zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzapu zzi = new zzapu(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzapv(zzarl zzarlVar, String str) {
        zzet zzetVar;
        this.zzd = zzarlVar;
        this.zze = str;
        if (zzarlVar != null) {
            this.zzg = new zzaqk(178, 128);
            zzetVar = new zzet();
        } else {
            zzetVar = null;
            this.zzg = null;
        }
        this.zzf = zzetVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        zzgp.zzj(this.zzh);
        this.zzi.zza();
        zzaqk zzaqkVar = this.zzg;
        if (zzaqkVar != null) {
            zzaqkVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(zzagb zzagbVar, zzarh zzarhVar) {
        zzarhVar.zza();
        this.zza = zzarhVar.zzc();
        this.zzb = zzagbVar.zzu(zzarhVar.zzb(), 2);
        zzarl zzarlVar = this.zzd;
        if (zzarlVar != null) {
            zzarlVar.zza(zzagbVar, zzarhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j10, int i10) {
        this.zzn = j10;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
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
    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(zzet zzetVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        long j10;
        double d10;
        int i14;
        int i15;
        this.zzb.getClass();
        int iZzg = zzetVar.zzg();
        int iZze = zzetVar.zze();
        byte[] bArrZzi = zzetVar.zzi();
        this.zzj += (long) zzetVar.zzd();
        this.zzb.zzc(zzetVar, zzetVar.zzd());
        while (true) {
            int iZzi = zzgp.zzi(bArrZzi, iZzg, iZze, this.zzh);
            if (iZzi == iZze) {
                break;
            }
            int i16 = iZzi + 3;
            int i17 = zzetVar.zzi()[i16] & 255;
            int i18 = iZzi - iZzg;
            if (!this.zzl) {
                if (i18 > 0) {
                    this.zzi.zzc(bArrZzi, iZzg, iZzi);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                zzapu zzapuVar = this.zzi;
                if (zzapuVar.zzb(i17, i19)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] bArrCopyOf = Arrays.copyOf(zzapuVar.zzc, zzapuVar.zza);
                    int i20 = bArrCopyOf[4] & 255;
                    int i21 = bArrCopyOf[5] & 255;
                    int i22 = (i20 << 4) | (i21 >> 4);
                    int i23 = (bArrCopyOf[7] & 240) >> 4;
                    int i24 = ((i21 & 15) << 8) | (bArrCopyOf[6] & 255);
                    if (i23 == 2) {
                        i11 = i24 * 4;
                        i12 = i22 * 3;
                    } else if (i23 != 3) {
                        if (i23 != 4) {
                            f10 = 1.0f;
                        } else {
                            i11 = i24 * 121;
                            i12 = i22 * 100;
                        }
                        zzt zztVar = new zzt();
                        zztVar.zza(str);
                        zztVar.zzn(str2);
                        zztVar.zzo("video/mpeg2");
                        zztVar.zzv(i22);
                        zztVar.zzw(i24);
                        zztVar.zzB(f10);
                        zztVar.zzr(Collections.singletonList(bArrCopyOf));
                        zzv zzvVarZzO = zztVar.zzO();
                        i13 = (bArrCopyOf[7] & 15) - 1;
                        j10 = 0;
                        if (i13 >= 0 && i13 < 8) {
                            d10 = zzc[i13];
                            byte b10 = bArrCopyOf[zzapuVar.zzb + 9];
                            i14 = (b10 & 96) >> 5;
                            i15 = b10 & 31;
                            if (i14 != i15) {
                                d10 *= (((double) i14) + 1.0d) / ((double) (i15 + 1));
                            }
                            j10 = (long) (1000000.0d / d10);
                        }
                        Pair pairCreate = Pair.create(zzvVarZzO, Long.valueOf(j10));
                        this.zzb.zzA((zzv) pairCreate.first);
                        this.zzm = ((Long) pairCreate.second).longValue();
                        this.zzl = true;
                    } else {
                        i11 = i24 * 16;
                        i12 = i22 * 9;
                    }
                    f10 = i11 / i12;
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzn(str2);
                    zztVar2.zzo("video/mpeg2");
                    zztVar2.zzv(i22);
                    zztVar2.zzw(i24);
                    zztVar2.zzB(f10);
                    zztVar2.zzr(Collections.singletonList(bArrCopyOf));
                    zzv zzvVarZzO2 = zztVar2.zzO();
                    i13 = (bArrCopyOf[7] & 15) - 1;
                    j10 = 0;
                    if (i13 >= 0) {
                        d10 = zzc[i13];
                        byte b11 = bArrCopyOf[zzapuVar.zzb + 9];
                        i14 = (b11 & 96) >> 5;
                        i15 = b11 & 31;
                        if (i14 != i15) {
                            d10 *= (((double) i14) + 1.0d) / ((double) (i15 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    }
                    Pair pairCreate2 = Pair.create(zzvVarZzO2, Long.valueOf(j10));
                    this.zzb.zzA((zzv) pairCreate2.first);
                    this.zzm = ((Long) pairCreate2.second).longValue();
                    this.zzl = true;
                }
            }
            zzaqk zzaqkVar = this.zzg;
            if (zzaqkVar != null) {
                if (i18 > 0) {
                    zzaqkVar.zzd(bArrZzi, iZzg, iZzi);
                    i10 = 0;
                } else {
                    i10 = -i18;
                }
                if (zzaqkVar.zze(i10)) {
                    int iZza = zzgp.zza(zzaqkVar.zza, zzaqkVar.zzb);
                    zzet zzetVar2 = this.zzf;
                    String str3 = zzfl.zza;
                    zzetVar2.zzb(zzaqkVar.zza, iZza);
                    this.zzd.zzb(this.zzp, zzetVar2);
                }
                if (i17 == 178) {
                    if (zzetVar.zzi()[iZzi + 2] == 1) {
                        zzaqkVar.zzc(178);
                    }
                    i17 = 178;
                }
            }
            if (i17 == 0 || i17 == 179) {
                int i25 = iZze - iZzi;
                if (this.zzr && this.zzl) {
                    long j11 = this.zzp;
                    if (j11 != -9223372036854775807L) {
                        this.zzb.zze(j11, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i25, i25, null);
                    }
                }
                if (!this.zzk || this.zzr) {
                    this.zzo = this.zzj - ((long) i25);
                    long j12 = this.zzn;
                    if (j12 == -9223372036854775807L) {
                        long j13 = this.zzp;
                        j12 = j13 != -9223372036854775807L ? j13 + this.zzm : -9223372036854775807L;
                    }
                    this.zzp = j12;
                    z10 = false;
                    this.zzq = false;
                    this.zzn = -9223372036854775807L;
                    z11 = true;
                    this.zzk = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
                this.zzr = i17 == 0 ? z11 : z10;
            } else if (i17 == 184) {
                this.zzq = true;
            }
            iZzg = i16;
        }
        if (!this.zzl) {
            this.zzi.zzc(bArrZzi, iZzg, iZze);
        }
        zzaqk zzaqkVar2 = this.zzg;
        if (zzaqkVar2 != null) {
            zzaqkVar2.zzd(bArrZzi, iZzg, iZze);
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
    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z10) {
        zzahk zzahkVar = this.zzb;
        zzahkVar.getClass();
        if (z10) {
            boolean z11 = this.zzq;
            long j10 = this.zzj - this.zzo;
            zzahkVar.zze(this.zzp, z11 ? 1 : 0, (int) j10, 0, null);
        }
    }
}
