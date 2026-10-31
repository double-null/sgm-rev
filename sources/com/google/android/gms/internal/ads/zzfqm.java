package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k9.dW.xjwcmjDeOXR;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfqm extends zziee implements zzifq {
    private static final zzfqm zzaG;
    private static volatile zzifx zzaH;
    private int zzC;
    private int zzE;
    private int zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private int zzX;
    private int zzY;
    private int zza;
    private zzfrp zzaA;
    private zzfrd zzaB;
    private zzfqu zzaC;
    private zzfpt zzaD;
    private int zzaE;
    private int zzaF;
    private int zzaa;
    private long zzak;
    private int zzam;
    private int zzan;
    private int zzao;
    private zzfrn zzap;
    private int zzaq;
    private zzfrj zzar;
    private zzfqs zzas;
    private zzfqy zzat;
    private zzfqw zzau;
    private zzfrl zzav;
    private zzfrf zzaw;
    private zzfrb zzax;
    private zziht zzay;
    private int zzb;
    private int zzc;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzd = "";
    private zziem zzh = zziee.zzbC();
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzA = "";
    private String zzB = "";
    private String zzD = "";
    private String zzG = "";
    private zziep zzH = zziee.zzbE();
    private String zzR = "";
    private String zzS = "";
    private String zzT = "";
    private String zzU = "";
    private String zzV = "";
    private String zzW = "";
    private String zzZ = "";
    private String zzab = "";
    private String zzac = "";
    private String zzad = "";
    private String zzae = "";
    private String zzaf = "";
    private String zzag = "";
    private String zzah = "";
    private String zzai = "";
    private String zzaj = "";
    private String zzal = "";
    private String zzaz = "";

    static {
        zzfqm zzfqmVar = new zzfqm();
        zzaG = zzfqmVar;
        zziee.zzbu(zzfqm.class, zzfqmVar);
    }

    private zzfqm() {
    }

    public static zzfqk zza() {
        return (zzfqk) zzaG.zzbn();
    }

    final /* synthetic */ void zzA(int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzI = i10 - 2;
    }

    final /* synthetic */ void zzB(int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzQ = i10 - 2;
    }

    final /* synthetic */ void zzb(boolean z10) {
        this.zzi = z10;
    }

    final /* synthetic */ void zzc(long j10) {
        this.zzj = j10;
    }

    final /* synthetic */ void zzd(long j10) {
        this.zzk = j10;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zzu = str;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzz = str;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zzB = str;
    }

    final /* synthetic */ void zzi(int i10) {
        this.zzC = i10;
    }

    final /* synthetic */ void zzj(Iterable iterable) {
        zziep zziepVar = this.zzH;
        if (!zziepVar.zza()) {
            this.zzH = zziee.zzbF(zziepVar);
        }
        zzicj.zzaW(iterable, this.zzH);
    }

    final /* synthetic */ void zzk(int i10) {
        this.zzK = i10;
    }

    final /* synthetic */ void zzl(long j10) {
        this.zzM = j10;
    }

    final /* synthetic */ void zzm(String str) {
        str.getClass();
        this.zzR = str;
    }

    final /* synthetic */ void zzn(String str) {
        str.getClass();
        this.zzS = str;
    }

    final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzae = str;
    }

    final /* synthetic */ void zzp(String str) {
        this.zzaf = str;
    }

    final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzag = str;
    }

    final /* synthetic */ void zzr(String str) {
        str.getClass();
        this.zzah = str;
    }

    final /* synthetic */ void zzs(String str) {
        str.getClass();
        this.zzai = str;
    }

    final /* synthetic */ void zzt(String str) {
        str.getClass();
        this.zzaj = str;
    }

    final /* synthetic */ void zzu(zzfql zzfqlVar) {
        this.zzaq = zzfqlVar.zza();
    }

    final /* synthetic */ void zzv(zziht zzihtVar) {
        this.zzay = zzihtVar;
        this.zza |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    final /* synthetic */ void zzw(String str) {
        this.zzaz = str;
    }

    final /* synthetic */ void zzy(int i10) {
        this.zzb = i10 - 2;
    }

    final /* synthetic */ void zzz(int i10) {
        this.zzp = 1;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    byte[] bArr = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                zzifx zzidzVar = zzaH;
                                if (zzidzVar == null) {
                                    synchronized (zzfqm.class) {
                                        zzidzVar = zzaH;
                                        if (zzidzVar == null) {
                                            zzidzVar = new zzidz(zzaG);
                                            zzaH = zzidzVar;
                                        }
                                    }
                                }
                                return zzidzVar;
                            }
                            throw null;
                        }
                        return zzaG;
                    }
                    return new zzfqk(bArr);
                }
                return new zzfqm();
            }
            return zziee.zzbv(zzaG, "\u0004O\u0000\u0001\u0001OO\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\nFȈGဉ\u000bH\u0004I\u0004J\u0004K\u0002L\u0002M\fN\fOဉ\f", new Object[]{"zza", "zzb", "zzi", GEmOVMyH.QleTnXhE, "zzp", "zzu", "zzz", "zzB", "zzC", "zzI", "zzK", "zzM", "zzQ", "zzR", "zzS", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzv", "zzx", "zzD", "zzG", "zzH", "zzT", "zzU", "zzac", "zzak", "zzd", "zze", GEmOVMyH.skf, "zzg", "zzk", "zzn", edUJlCZxhVnO.qLeMoafk, "zzh", "zzan", "zzao", "zzc", "zzar", "zzas", "zzX", "zzZ", "zzW", "zzV", "zzaq", "zzY", "zzaa", "zzab", "zzA", "zzat", "zzJ", "zzau", "zzal", "zzam", "zzap", "zzav", "zzaw", "zzad", "zzax", "zzay", "zzaz", "zzy", xjwcmjDeOXR.paAm, "zzN", "zzO", "zzP", "zzaB", "zzw", "zzaC", "zzL", "zzaE", "zzaF", "zzl", "zzm", "zzE", "zzF", "zzaD"});
        }
        return (byte) 1;
    }
}
