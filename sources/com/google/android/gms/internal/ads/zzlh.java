package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import c0.IbU.elEbP;
import com.adjust.sdk.network.ErrorCodes;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlh extends zzf implements zzjv {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfc zzC;
    private final zzlg zzD;
    private final zzjx zzE;
    private final zzjx zzF;
    private int zzG;
    private int zzH;
    private boolean zzI;
    private zznh zzJ;
    private zzni zzK;
    private zzju zzL;
    private zzax zzM;
    private zzan zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private zzeu zzR;
    private zzd zzS;
    private float zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private boolean zzY;
    private zzan zzZ;
    private zzms zzaa;
    private int zzab;
    private long zzac;
    private zzzf zzad;
    final zzabi zzb;
    final zzax zzc;
    private final zzds zze;
    private final Context zzf;
    private final zzbb zzg;
    private final zzna[] zzh;
    private final zzna[] zzi;
    private final zzabh zzj;
    private final zzdz zzk;
    private final zzls zzl;
    private final zzlu zzm;
    private final zzef zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zznm zzs;
    private final Looper zzt;
    private final zzabq zzu;
    private final zzdo zzv;
    private final zzkd zzw;
    private final zzlc zzx;
    private final zzfr zzy;
    private final zzfs zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzlh(zzjt zzjtVar, zzbb zzbbVar) throws Throwable {
        zzlu zzluVar;
        zzdo zzdoVar;
        zzjt zzjtVar2;
        final zzlh zzlhVar = this;
        zzlhVar.zze = new zzds(zzdo.zza);
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfl.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + 1);
            sb2.append("Init ");
            sb2.append(hexString);
            sb2.append(" [AndroidXMedia3/1.10.0-rc02] [");
            sb2.append(str);
            sb2.append("]");
            zzeg.zzb("ExoPlayerImpl", sb2.toString());
            zzlhVar.zzf = zzjtVar.zza.getApplicationContext();
            zzlhVar.zzs = (zznm) zzjtVar.zzh.apply(zzjtVar.zzb);
            zzlhVar.zzX = zzjtVar.zzj;
            zzlhVar.zzS = zzjtVar.zzk;
            zzlhVar.zzQ = zzjtVar.zzl;
            zzlhVar.zzU = false;
            zzlhVar.zzA = zzjtVar.zzq;
            zzkd zzkdVar = new zzkd(zzlhVar, null);
            zzlhVar.zzw = zzkdVar;
            zzlhVar.zzx = new zzlc(null);
            zzna[] zznaVarArrZza = ((zznf) zzjtVar.zzc.zza()).zza(new Handler(zzjtVar.zzi), zzkdVar, zzkdVar, zzkdVar, zzkdVar);
            zzlhVar.zzh = zznaVarArrZza;
            int length = zznaVarArrZza.length;
            zzlhVar.zzi = new zzna[2];
            int i10 = 0;
            while (true) {
                zzna[] zznaVarArr = zzlhVar.zzi;
                int length2 = zznaVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zzna zznaVar = zzlhVar.zzh[i10];
                zznaVarArr[i10] = null;
                i10++;
                zzlhVar.zze.zza();
                throw th;
            }
            zzabh zzabhVar = (zzabh) zzjtVar.zze.zza();
            zzlhVar.zzj = zzabhVar;
            zzabq zzabqVar = (zzabq) zzjtVar.zzg.zza();
            zzlhVar.zzu = zzabqVar;
            zzlhVar.zzr = zzjtVar.zzm;
            zzlhVar.zzK = zzjtVar.zzn;
            zzlhVar.zzJ = zzjtVar.zzo;
            Looper looper = zzjtVar.zzi;
            zzlhVar.zzt = looper;
            zzdo zzdoVar2 = zzjtVar.zzb;
            zzlhVar.zzv = zzdoVar2;
            zzlhVar.zzg = zzbbVar;
            zzlhVar.zzn = new zzef(looper, zzdoVar2, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlb
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    this.zza.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            zzlhVar.zzo = copyOnWriteArraySet;
            zzlhVar.zzq = new ArrayList();
            zzlhVar.zzad = new zzzf(0);
            zzlhVar.zzL = zzju.zza;
            int length3 = zzlhVar.zzh.length;
            zzabi zzabiVar = new zzabi(new zznd[2], new zzaba[2], zzbn.zza, null);
            zzlhVar.zzb = zzabiVar;
            zzlhVar.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzabhVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zzaxVarZze = zzawVar.zze();
            zzlhVar.zzc = zzaxVarZze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVarZze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            zzlhVar.zzM = zzawVar2.zze();
            zzlhVar.zzk = zzdoVar2.zzd(looper, null);
            zzls zzlsVar = new zzls() { // from class: com.google.android.gms.internal.ads.zzke
                @Override // com.google.android.gms.internal.ads.zzls
                public final /* synthetic */ void zza(zzlr zzlrVar) {
                    this.zza.zzK(zzlrVar);
                }
            };
            zzlhVar.zzl = zzlsVar;
            zzlhVar.zzaa = zzms.zza(zzabiVar);
            zzlhVar.zzs.zzx(zzbbVar, looper);
            final zzqf zzqfVar = new zzqf(zzjtVar.zzx);
            try {
                zzlu zzluVar2 = new zzlu(zzlhVar.zzf, zzlhVar.zzh, zzlhVar.zzi, zzabhVar, zzabiVar, (zzly) zzjtVar.zzf.zza(), zzabqVar, 0, false, zzlhVar.zzs, zzlhVar.zzK, zzjtVar.zzz, zzjtVar.zzp, false, false, looper, zzdoVar2, zzlsVar, zzqfVar, null, zzlhVar.zzL, zzlhVar.zzx, zzjtVar.zzy);
                zzlhVar = this;
                zzlhVar.zzm = zzluVar2;
                Looper looperZzn = zzluVar2.zzn();
                zzlhVar.zzT = 1.0f;
                zzan zzanVar = zzan.zza;
                zzlhVar.zzN = zzanVar;
                zzlhVar.zzZ = zzanVar;
                zzlhVar.zzab = -1;
                int i11 = zzcz.zza;
                zzlhVar.zzV = true;
                zzlhVar.zze(zzlhVar.zzs);
                zzabqVar.zzf(new Handler(looper), zzlhVar.zzs);
                copyOnWriteArraySet.add(zzlhVar.zzw);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 31) {
                    final Context context = zzlhVar.zzf;
                    zzluVar = zzluVar2;
                    zzjtVar2 = zzjtVar;
                    final boolean z10 = zzjtVar2.zzv;
                    zzdoVar = zzdoVar2;
                    zzdoVar.zzd(zzluVar.zzn(), null).zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzqb zzqbVarZza = zzqb.zza(context);
                            if (zzqbVarZza == null) {
                                zzeg.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                                return;
                            }
                            if (z10) {
                                zzlhVar.zzD(zzqbVarZza);
                            }
                            zzqfVar.zzb(zzqbVarZza.zzb());
                        }
                    });
                } else {
                    zzluVar = zzluVar2;
                    zzdoVar = zzdoVar2;
                    zzjtVar2 = zzjtVar;
                }
                zzdm zzdmVar = new zzdm(0, looperZzn, looper, zzdoVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzkp
                    @Override // com.google.android.gms.internal.ads.zzdl
                    public final /* synthetic */ void zza(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        this.zza.zzL(((Integer) obj).intValue(), iIntValue);
                    }
                });
                zzlhVar.zzB = zzdmVar;
                zzdmVar.zzd(new Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzM();
                    }
                });
                new zzbz(zzjtVar2.zza, looperZzn, zzjtVar2.zzi, zzlhVar.zzw, zzdoVar);
                boolean z11 = (zzjtVar2.zzs == Integer.MAX_VALUE || zzjtVar2.zzt == Integer.MAX_VALUE) ? false : true;
                zzfr zzfrVar = new zzfr(zzjtVar2.zza, looperZzn, zzdoVar);
                zzlhVar.zzy = zzfrVar;
                zzfrVar.zza(z11);
                zzlhVar.zzz = new zzfs(zzjtVar2.zza, looperZzn, zzdoVar);
                int i13 = zzm.zza;
                zzbv zzbvVar = zzbv.zza;
                zzlhVar.zzR = zzeu.zza;
                zzlhVar.zzD = i12 >= 34 ? new zzlg(zzlhVar, zzjtVar2.zza, null) : null;
                zzlhVar.zzE = new zzjx(zzlhVar, 1, null);
                zzlhVar.zzF = new zzjx(zzlhVar, 2, null);
                zzlhVar.zzC = new zzfc(this, zzlhVar.zzw, zzdoVar, zzjtVar2.zzr, zzjtVar2.zzs, zzjtVar2.zzt, zzjtVar2.zzu);
                zzluVar.zzg(zzlhVar.zzJ);
                zzluVar.zzi(zzlhVar.zzS, false);
                zzlhVar.zzau(1, 3, zzlhVar.zzS);
                zzlhVar.zzau(2, 4, Integer.valueOf(zzlhVar.zzQ));
                zzlhVar.zzau(2, 5, 0);
                zzlhVar.zzau(1, 9, Boolean.valueOf(zzlhVar.zzU));
                zzlhVar.zzau(6, 8, zzlhVar.zzx);
                zzlhVar.zzau(-1, 16, Integer.valueOf(zzlhVar.zzX));
                zzlhVar.zze.zza();
            } catch (Throwable th) {
                th = th;
                zzlhVar = this;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzP(zzjk zzjkVar) {
        zzms zzmsVar = this.zzaa;
        zzms zzmsVarZzh = zzmsVar.zzh(zzmsVar.zzb);
        zzmsVarZzh.zzq = zzmsVarZzh.zzs;
        zzmsVarZzh.zzr = 0L;
        zzms zzmsVarZzam = zzam(zzmsVarZzh, 1);
        if (zzjkVar != null) {
            zzmsVarZzam = zzmsVarZzam.zzf(zzjkVar);
        }
        this.zzG++;
        this.zzm.zzh();
        zzaj(zzmsVarZzam, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzag(zzms zzmsVar) {
        zzbf zzbfVar = zzmsVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmsVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzah(zzms zzmsVar) {
        zzxk zzxkVar = zzmsVar.zzb;
        if (!zzxkVar.zzb()) {
            return zzfl.zzr(zzai(zzmsVar));
        }
        zzbf zzbfVar = zzmsVar.zza;
        zzbfVar.zzo(zzxkVar.zza, this.zzp);
        long j10 = zzmsVar.zzc;
        if (j10 != -9223372036854775807L) {
            return zzfl.zzr(0L) + zzfl.zzr(j10);
        }
        long j11 = zzbfVar.zzb(zzag(zzmsVar), this.zza, 0L).zzl;
        return zzfl.zzr(0L);
    }

    private final long zzai(zzms zzmsVar) {
        zzbf zzbfVar = zzmsVar.zza;
        if (zzbfVar.zzg()) {
            return zzfl.zzs(this.zzac);
        }
        long j10 = zzmsVar.zzs;
        zzxk zzxkVar = zzmsVar.zzb;
        if (zzxkVar.zzb()) {
            return j10;
        }
        zzao(zzbfVar, zzxkVar, j10);
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0295  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:106:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:115:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:117:0x0310  */
    /* JADX WARN: Code duplicated, block: B:119:0x0320  */
    /* JADX WARN: Code duplicated, block: B:122:0x032f  */
    /* JADX WARN: Code duplicated, block: B:125:0x033d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0350  */
    /* JADX WARN: Code duplicated, block: B:133:0x0361  */
    /* JADX WARN: Code duplicated, block: B:136:0x0376  */
    /* JADX WARN: Code duplicated, block: B:139:0x038c  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:149:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:152:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:155:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:156:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:158:0x0404  */
    /* JADX WARN: Code duplicated, block: B:161:0x040f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0423  */
    /* JADX WARN: Code duplicated, block: B:164:0x0425  */
    /* JADX WARN: Code duplicated, block: B:168:0x0434  */
    /* JADX WARN: Code duplicated, block: B:171:0x0444  */
    /* JADX WARN: Code duplicated, block: B:174:0x045c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x0460  */
    /* JADX WARN: Code duplicated, block: B:179:0x0466 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x046a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0470 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x047a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0480 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x0484  */
    /* JADX WARN: Code duplicated, block: B:197:0x048c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x0496  */
    /* JADX WARN: Code duplicated, block: B:205:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:210:0x04af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127 A[LOOP:1: B:51:0x0121->B:53:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x0149  */
    /* JADX WARN: Code duplicated, block: B:62:0x0176  */
    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:66:0x017f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0181  */
    /* JADX WARN: Code duplicated, block: B:70:0x0186  */
    /* JADX WARN: Code duplicated, block: B:73:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0200  */
    /* JADX WARN: Code duplicated, block: B:89:0x0207  */
    /* JADX WARN: Code duplicated, block: B:90:0x020a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0212  */
    /* JADX WARN: Code duplicated, block: B:93:0x0219  */
    /* JADX WARN: Code duplicated, block: B:97:0x0249  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
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
    private final void zzaj(final zzms zzmsVar, final int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        int i13;
        boolean z12;
        Pair pair;
        boolean z13;
        boolean z14;
        int i14;
        Pair pair2;
        boolean zBooleanValue;
        final int iIntValue;
        final zzak zzakVar;
        zzam zzamVarZza;
        List list;
        int i15;
        zzap zzapVar;
        int i16;
        zzbf zzbfVarZzq;
        zzan zzanVarZzw;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        zzjk zzjkVar;
        zzjk zzjkVar2;
        zzabi zzabiVar;
        zzabi zzabiVar2;
        zzax zzaxVar;
        zzf zzfVar;
        zzbf zzbfVarZzq2;
        boolean z19;
        zzbf zzbfVarZzq3;
        ?? r14;
        int iZzi;
        int i17;
        boolean z20;
        ?? Zzq;
        int iZzs;
        ?? r10;
        zzbf zzbfVarZzq4;
        ?? r42;
        long j11;
        boolean z21;
        ?? r43;
        zzbf zzbfVarZzq5;
        boolean z22;
        boolean zZzg;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        int i18;
        boolean z29;
        zzax zzaxVarZze;
        ?? r44;
        zzef zzefVar;
        zzbd zzbdVar;
        int i19;
        int i20;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        long jZzak;
        long jZzak2;
        int iZzs2;
        int iZzr;
        int i21;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        long jZzr;
        long jZzr2;
        zzxk zzxkVar;
        final int i22 = i11;
        zzms zzmsVar2 = this.zzaa;
        this.zzaa = zzmsVar;
        zzbf zzbfVar = zzmsVar2.zza;
        zzbf zzbfVar2 = zzmsVar.zza;
        boolean z30 = !zzbfVar.equals(zzbfVar2);
        if (!zzbfVar2.zzg() || !zzbfVar.zzg()) {
            if (zzbfVar2.zzg() != zzbfVar.zzg()) {
                pair2 = new Pair(Boolean.TRUE, 3);
            } else {
                zzxk zzxkVar2 = zzmsVar2.zzb;
                Object obj5 = zzxkVar2.zza;
                zzbd zzbdVar2 = this.zzp;
                int i23 = zzbfVar.zzo(obj5, zzbdVar2).zzc;
                zzbe zzbeVar = this.zza;
                Object obj6 = zzbfVar.zzb(i23, zzbeVar, 0L).zzb;
                zzxk zzxkVar3 = zzmsVar.zzb;
                if (obj6.equals(zzbfVar2.zzb(zzbfVar2.zzo(zzxkVar3.zza, zzbdVar2).zzc, zzbeVar, 0L).zzb)) {
                    if (!z10) {
                        i13 = i22;
                        z12 = false;
                    } else if (i22 != 0) {
                        i13 = i22;
                        z12 = true;
                    } else if (zzxkVar2.zzd < zzxkVar3.zzd) {
                        pair = new Pair(Boolean.TRUE, 0);
                        i22 = 0;
                        z13 = true;
                    } else {
                        z12 = true;
                        i13 = 0;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                    z13 = z12;
                    i22 = i13;
                } else {
                    if (z10) {
                        if (i22 == 0) {
                            i22 = 0;
                            i14 = 1;
                            z13 = true;
                        } else {
                            z14 = true;
                            z13 = true;
                        }
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
                    } else {
                        z14 = false;
                        z13 = false;
                    }
                    if (z14 && i22 == 1) {
                        i14 = 2;
                    } else {
                        if (!z30) {
                            throw new IllegalStateException();
                        }
                        i14 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (zzbfVar2.zzg()) {
                    zzakVar = null;
                } else {
                    zzakVar = zzbfVar2.zzb(zzbfVar2.zzo(zzmsVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd;
                }
                this.zzZ = zzan.zza;
            } else {
                zzakVar = null;
            }
            if (zBooleanValue || !zzmsVar2.zzj.equals(zzmsVar.zzj)) {
                zzamVarZza = this.zzZ.zza();
                list = zzmsVar.zzj;
                for (i15 = 0; i15 < list.size(); i15++) {
                    zzapVar = (zzap) list.get(i15);
                    for (i16 = 0; i16 < zzapVar.zza(); i16++) {
                        zzapVar.zzb(i16).zza(zzamVarZza);
                    }
                }
                this.zzZ = zzamVarZza.zzw();
            }
            zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                zzanVarZzw = this.zzZ;
            } else {
                zzak zzakVar4 = zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzd;
                zzam zzamVarZza2 = this.zzZ.zza();
                zzamVarZza2.zzv(zzakVar4.zzd);
                zzanVarZzw = zzamVarZza2.zzw();
            }
            z15 = !zzanVarZzw.equals(this.zzN);
            this.zzN = zzanVarZzw;
            if (zzmsVar2.zzl != zzmsVar.zzl) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (zzmsVar2.zze != zzmsVar.zze) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17 || z16) {
                zzas();
            }
            if (zzmsVar2.zzg != zzmsVar.zzg) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z30) {
                this.zzn.zze(0, new zzea() { // from class: com.google.android.gms.internal.ads.zzkx
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj7) {
                        int i24 = zzlh.zzd;
                        ((zzaz) obj7).zzb(zzmsVar.zza, i10);
                    }
                });
            }
            if (z13) {
                zzbdVar = new zzbd();
                if (zzbfVar.zzg()) {
                    i19 = i12;
                    i20 = i19;
                    obj = null;
                    zzakVar2 = null;
                    obj2 = null;
                } else {
                    Object obj7 = zzmsVar2.zzb.zza;
                    zzbfVar.zzo(obj7, zzbdVar);
                    int i24 = zzbdVar.zzc;
                    int iZze = zzbfVar.zze(obj7);
                    zzbe zzbeVar2 = this.zza;
                    obj = zzbfVar.zzb(i24, zzbeVar2, 0L).zzb;
                    zzakVar2 = zzbeVar2.zzd;
                    obj2 = obj7;
                    i19 = i24;
                    i20 = iZze;
                }
                if (i22 == 0) {
                    zzxkVar = zzmsVar2.zzb;
                    if (zzxkVar.zzb()) {
                        jZzak = zzbdVar.zzh(zzxkVar.zzb, zzxkVar.zzc);
                        jZzak2 = zzak(zzmsVar2);
                    } else {
                        if (zzxkVar.zze != -1) {
                            jZzak = zzak(this.zzaa);
                        } else {
                            jZzak = zzbdVar.zzd;
                        }
                        jZzak2 = jZzak;
                    }
                } else if (zzmsVar2.zzb.zzb()) {
                    jZzak = zzmsVar2.zzs;
                    jZzak2 = zzak(zzmsVar2);
                } else {
                    jZzak = zzmsVar2.zzs;
                    jZzak2 = jZzak;
                }
                String str = zzfl.zza;
                zzxk zzxkVar4 = zzmsVar2.zzb;
                final zzba zzbaVar = new zzba(obj, i19, zzakVar2, obj2, i20, zzfl.zzr(jZzak), zzfl.zzr(jZzak2), zzxkVar4.zzb, zzxkVar4.zzc);
                iZzs2 = zzs();
                iZzr = zzr();
                if (this.zzaa.zza.zzg()) {
                    i21 = iZzr;
                    obj3 = null;
                    zzakVar3 = null;
                    obj4 = null;
                } else {
                    zzms zzmsVar3 = this.zzaa;
                    Object obj8 = zzmsVar3.zzb.zza;
                    zzmsVar3.zza.zzo(obj8, this.zzp);
                    int iZze2 = this.zzaa.zza.zze(obj8);
                    zzbf zzbfVar3 = this.zzaa.zza;
                    zzbe zzbeVar3 = this.zza;
                    i21 = iZze2;
                    obj3 = zzbfVar3.zzb(iZzs2, zzbeVar3, 0L).zzb;
                    zzakVar3 = zzbeVar3.zzd;
                    obj4 = obj8;
                }
                jZzr = zzfl.zzr(j10);
                if (this.zzaa.zzb.zzb()) {
                    jZzr2 = zzfl.zzr(zzak(this.zzaa));
                } else {
                    jZzr2 = jZzr;
                }
                zzxk zzxkVar5 = this.zzaa.zzb;
                final zzba zzbaVar2 = new zzba(obj3, iZzs2, zzakVar3, obj4, i21, jZzr, jZzr2, zzxkVar5.zzb, zzxkVar5.zzc);
                this.zzn.zze(11, new zzea() { // from class: com.google.android.gms.internal.ads.zzky
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        ((zzaz) obj9).zzo(zzbaVar, zzbaVar2, i22);
                    }
                });
            } else {
                z16 = z16;
                z15 = z15;
                z17 = z17;
                z18 = z18;
            }
            if (zBooleanValue) {
                this.zzn.zze(1, new zzea() { // from class: com.google.android.gms.internal.ads.zzkz
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        ((zzaz) obj9).zzc(zzakVar, iIntValue);
                    }
                });
            }
            zzjkVar = zzmsVar2.zzf;
            zzjkVar2 = zzmsVar.zzf;
            if (zzjkVar != zzjkVar2) {
                zzefVar = this.zzn;
                zzefVar.zze(10, new zzea() { // from class: com.google.android.gms.internal.ads.zzla
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        ((zzaz) obj9).zzn(zzmsVar.zzf);
                    }
                });
                if (zzjkVar2 != null) {
                    zzefVar.zze(10, new zzea() { // from class: com.google.android.gms.internal.ads.zzkf
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(Object obj9) {
                            int i25 = zzlh.zzd;
                            ((zzaz) obj9).zzm(zzmsVar.zzf);
                        }
                    });
                }
            }
            zzabiVar = zzmsVar2.zzi;
            zzabiVar2 = zzmsVar.zzi;
            if (zzabiVar != zzabiVar2) {
                this.zzj.zzq(zzabiVar2.zze);
                this.zzn.zze(2, new zzea() { // from class: com.google.android.gms.internal.ads.zzkg
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        ((zzaz) obj9).zzd(zzmsVar.zzi.zzd);
                    }
                });
            }
            if (z15) {
                final zzan zzanVar = this.zzN;
                this.zzn.zze(14, new zzea() { // from class: com.google.android.gms.internal.ads.zzkh
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        ((zzaz) obj9).zze(zzanVar);
                    }
                });
            }
            if (z18) {
                this.zzn.zze(3, new zzea() { // from class: com.google.android.gms.internal.ads.zzki
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        ((zzaz) obj9).zzf(zzmsVar.zzg);
                    }
                });
            }
            if (z17 || z16) {
                this.zzn.zze(-1, new zzea() { // from class: com.google.android.gms.internal.ads.zzkj
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        zzms zzmsVar4 = zzmsVar;
                        ((zzaz) obj9).zzh(zzmsVar4.zzl, zzmsVar4.zze);
                    }
                });
            }
            if (z17) {
                this.zzn.zze(4, new zzea() { // from class: com.google.android.gms.internal.ads.zzkk
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        ((zzaz) obj9).zzi(zzmsVar.zze);
                    }
                });
            }
            if (z16 || zzmsVar2.zzm != zzmsVar.zzm) {
                this.zzn.zze(5, new zzea() { // from class: com.google.android.gms.internal.ads.zzkl
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        zzms zzmsVar4 = zzmsVar;
                        ((zzaz) obj9).zzj(zzmsVar4.zzl, zzmsVar4.zzm);
                    }
                });
            }
            if (zzmsVar2.zzn != zzmsVar.zzn) {
                this.zzn.zze(6, new zzea() { // from class: com.google.android.gms.internal.ads.zzkm
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        ((zzaz) obj9).zzk(zzmsVar.zzn);
                    }
                });
            }
            if (zzmsVar2.zzj() != zzmsVar.zzj()) {
                this.zzn.zze(7, new zzea() { // from class: com.google.android.gms.internal.ads.zzkn
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        ((zzaz) obj9).zzl(zzmsVar.zzj());
                    }
                });
            }
            if (!zzmsVar2.zzo.equals(zzmsVar.zzo)) {
                this.zzn.zze(12, new zzea() { // from class: com.google.android.gms.internal.ads.zzko
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i25 = zzlh.zzd;
                        ((zzaz) obj9).zzp(zzmsVar.zzo);
                    }
                });
            }
            zzaxVar = this.zzM;
            zzbb zzbbVar = this.zzg;
            zzax zzaxVar2 = this.zzc;
            String str2 = zzfl.zza;
            boolean zZzx = zzbbVar.zzx();
            zzfVar = (zzf) zzbbVar;
            zzbfVarZzq2 = zzfVar.zzq();
            if (zzbfVarZzq2.zzg() && zzbfVarZzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh) {
                z19 = true;
            } else {
                z19 = false;
            }
            zzbfVarZzq3 = zzfVar.zzq();
            if (zzbfVarZzq3.zzg()) {
                i17 = -1;
                r14 = 0;
                z20 = false;
            } else {
                int iZzs3 = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                r14 = 0;
                r14 = 0;
                iZzi = zzbfVarZzq3.zzi(iZzs3, 0, false);
                i17 = -1;
                if (iZzi != -1) {
                    z20 = true;
                } else {
                    z20 = false;
                }
            }
            Zzq = zzfVar.zzq();
            if (Zzq.zzg()) {
                r10 = r14;
            } else {
                iZzs = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                if (Zzq.zzh(iZzs, r14, r14) != i17) {
                    r10 = 1;
                } else {
                    r10 = r14;
                }
            }
            zzbfVarZzq4 = zzfVar.zzq();
            if (!zzbfVarZzq4.zzg()) {
                r44 = r10;
                j11 = 0;
                if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                    r42 = r44;
                    z21 = true;
                    r43 = r44;
                }
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg() && zzbfVarZzq5.zzb(zzfVar.zzs(), zzfVar.zza, j11).zzi) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                zZzg = zzbbVar.zzq().zzg();
                zzaw zzawVar = new zzaw();
                zzawVar.zzd(zzaxVar2);
                boolean z31 = !zZzx;
                zzawVar.zzb(4, z31);
                if (z19 || zZzx) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                zzawVar.zzb(5, z23);
                if (z20 || zZzx) {
                    z24 = false;
                } else {
                    z24 = true;
                }
                zzawVar.zzb(6, z24);
                if (!zZzg || (!(z20 || !z21 || z19) || zZzx)) {
                    z25 = false;
                } else {
                    z25 = true;
                }
                zzawVar.zzb(7, z25);
                if (r43 != 0 || zZzx) {
                    z26 = false;
                } else {
                    z26 = true;
                }
                zzawVar.zzb(8, z26);
                if (!zZzg || ((r43 == 0 && !(z21 && z22)) || zZzx)) {
                    z27 = false;
                } else {
                    z27 = true;
                }
                zzawVar.zzb(9, z27);
                zzawVar.zzb(10, z31);
                if (z19 || zZzx) {
                    z28 = false;
                } else {
                    z28 = true;
                }
                zzawVar.zzb(11, z28);
                if (z19 || zZzx) {
                    i18 = 12;
                    z29 = false;
                } else {
                    i18 = 12;
                    z29 = true;
                }
                zzawVar.zzb(i18, z29);
                zzaxVarZze = zzawVar.zze();
                this.zzM = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar)) {
                    this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(Object obj9) {
                            this.zza.zzN((zzaz) obj9);
                        }
                    });
                }
                this.zzn.zzf();
            }
            r42 = r10;
            j11 = 0;
            r42 = r44;
            z21 = false;
            r43 = r42;
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z22 = false;
            } else {
                z22 = false;
            }
            zZzg = zzbbVar.zzq().zzg();
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVar2);
            boolean z32 = !zZzx;
            zzawVar2.zzb(4, z32);
            if (z19) {
                z23 = false;
            } else {
                z23 = false;
            }
            zzawVar2.zzb(5, z23);
            if (z20) {
                z24 = false;
            } else {
                z24 = false;
            }
            zzawVar2.zzb(6, z24);
            if (zZzg) {
                z25 = false;
            } else {
                z25 = false;
            }
            zzawVar2.zzb(7, z25);
            if (r43 != 0) {
                z26 = false;
            } else {
                z26 = false;
            }
            zzawVar2.zzb(8, z26);
            if (zZzg) {
                z27 = false;
            } else {
                z27 = false;
            }
            zzawVar2.zzb(9, z27);
            zzawVar2.zzb(10, z32);
            if (z19) {
                z28 = false;
            } else {
                z28 = false;
            }
            zzawVar2.zzb(11, z28);
            if (z19) {
                i18 = 12;
                z29 = false;
            } else {
                i18 = 12;
                z29 = false;
            }
            zzawVar2.zzb(i18, z29);
            zzaxVarZze = zzawVar2.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar)) {
                this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        this.zza.zzN((zzaz) obj9);
                    }
                });
            }
            this.zzn.zzf();
        }
        pair2 = new Pair(Boolean.FALSE, -1);
        pair = pair2;
        z13 = z10;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (zzbfVar2.zzg()) {
                zzakVar = zzbfVar2.zzb(zzbfVar2.zzo(zzmsVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd;
            } else {
                zzakVar = null;
            }
            this.zzZ = zzan.zza;
        } else {
            zzakVar = null;
        }
        if (zBooleanValue) {
            zzamVarZza = this.zzZ.zza();
            list = zzmsVar.zzj;
            while (i15 < list.size()) {
                zzapVar = (zzap) list.get(i15);
                while (i16 < zzapVar.zza()) {
                    zzapVar.zzb(i16).zza(zzamVarZza);
                }
            }
            this.zzZ = zzamVarZza.zzw();
        } else {
            zzamVarZza = this.zzZ.zza();
            list = zzmsVar.zzj;
            while (i15 < list.size()) {
                zzapVar = (zzap) list.get(i15);
                while (i16 < zzapVar.zza()) {
                    zzapVar.zzb(i16).zza(zzamVarZza);
                }
            }
            this.zzZ = zzamVarZza.zzw();
        }
        zzbfVarZzq = zzq();
        if (zzbfVarZzq.zzg()) {
            zzanVarZzw = this.zzZ;
        } else {
            zzak zzakVar5 = zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzd;
            zzam zzamVarZza3 = this.zzZ.zza();
            zzamVarZza3.zzv(zzakVar5.zzd);
            zzanVarZzw = zzamVarZza3.zzw();
        }
        z15 = !zzanVarZzw.equals(this.zzN);
        this.zzN = zzanVarZzw;
        if (zzmsVar2.zzl != zzmsVar.zzl) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (zzmsVar2.zze != zzmsVar.zze) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            zzas();
        } else {
            zzas();
        }
        if (zzmsVar2.zzg != zzmsVar.zzg) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z30) {
            this.zzn.zze(0, new zzea() { // from class: com.google.android.gms.internal.ads.zzkx
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj9) {
                    int i25 = zzlh.zzd;
                    ((zzaz) obj9).zzb(zzmsVar.zza, i10);
                }
            });
        }
        if (z13) {
            zzbdVar = new zzbd();
            if (zzbfVar.zzg()) {
                Object obj9 = zzmsVar2.zzb.zza;
                zzbfVar.zzo(obj9, zzbdVar);
                int i25 = zzbdVar.zzc;
                int iZze3 = zzbfVar.zze(obj9);
                zzbe zzbeVar4 = this.zza;
                obj = zzbfVar.zzb(i25, zzbeVar4, 0L).zzb;
                zzakVar2 = zzbeVar4.zzd;
                obj2 = obj9;
                i19 = i25;
                i20 = iZze3;
            } else {
                i19 = i12;
                i20 = i19;
                obj = null;
                zzakVar2 = null;
                obj2 = null;
            }
            if (i22 == 0) {
                zzxkVar = zzmsVar2.zzb;
                if (zzxkVar.zzb()) {
                    jZzak = zzbdVar.zzh(zzxkVar.zzb, zzxkVar.zzc);
                    jZzak2 = zzak(zzmsVar2);
                } else {
                    if (zzxkVar.zze != -1) {
                        jZzak = zzak(this.zzaa);
                    } else {
                        jZzak = zzbdVar.zzd;
                    }
                    jZzak2 = jZzak;
                }
            } else if (zzmsVar2.zzb.zzb()) {
                jZzak = zzmsVar2.zzs;
                jZzak2 = zzak(zzmsVar2);
            } else {
                jZzak = zzmsVar2.zzs;
                jZzak2 = jZzak;
            }
            String str3 = zzfl.zza;
            zzxk zzxkVar6 = zzmsVar2.zzb;
            final zzba zzbaVar3 = new zzba(obj, i19, zzakVar2, obj2, i20, zzfl.zzr(jZzak), zzfl.zzr(jZzak2), zzxkVar6.zzb, zzxkVar6.zzc);
            iZzs2 = zzs();
            iZzr = zzr();
            if (this.zzaa.zza.zzg()) {
                zzms zzmsVar4 = this.zzaa;
                Object obj10 = zzmsVar4.zzb.zza;
                zzmsVar4.zza.zzo(obj10, this.zzp);
                int iZze4 = this.zzaa.zza.zze(obj10);
                zzbf zzbfVar4 = this.zzaa.zza;
                zzbe zzbeVar5 = this.zza;
                i21 = iZze4;
                obj3 = zzbfVar4.zzb(iZzs2, zzbeVar5, 0L).zzb;
                zzakVar3 = zzbeVar5.zzd;
                obj4 = obj10;
            } else {
                i21 = iZzr;
                obj3 = null;
                zzakVar3 = null;
                obj4 = null;
            }
            jZzr = zzfl.zzr(j10);
            if (this.zzaa.zzb.zzb()) {
                jZzr2 = zzfl.zzr(zzak(this.zzaa));
            } else {
                jZzr2 = jZzr;
            }
            zzxk zzxkVar7 = this.zzaa.zzb;
            final zzba zzbaVar4 = new zzba(obj3, iZzs2, zzakVar3, obj4, i21, jZzr, jZzr2, zzxkVar7.zzb, zzxkVar7.zzc);
            this.zzn.zze(11, new zzea() { // from class: com.google.android.gms.internal.ads.zzky
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    ((zzaz) obj11).zzo(zzbaVar3, zzbaVar4, i22);
                }
            });
        } else {
            z16 = z16;
            z15 = z15;
            z17 = z17;
            z18 = z18;
        }
        if (zBooleanValue) {
            this.zzn.zze(1, new zzea() { // from class: com.google.android.gms.internal.ads.zzkz
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    ((zzaz) obj11).zzc(zzakVar, iIntValue);
                }
            });
        }
        zzjkVar = zzmsVar2.zzf;
        zzjkVar2 = zzmsVar.zzf;
        if (zzjkVar != zzjkVar2) {
            zzefVar = this.zzn;
            zzefVar.zze(10, new zzea() { // from class: com.google.android.gms.internal.ads.zzla
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    ((zzaz) obj11).zzn(zzmsVar.zzf);
                }
            });
            if (zzjkVar2 != null) {
                zzefVar.zze(10, new zzea() { // from class: com.google.android.gms.internal.ads.zzkf
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj11) {
                        int i26 = zzlh.zzd;
                        ((zzaz) obj11).zzm(zzmsVar.zzf);
                    }
                });
            }
        }
        zzabiVar = zzmsVar2.zzi;
        zzabiVar2 = zzmsVar.zzi;
        if (zzabiVar != zzabiVar2) {
            this.zzj.zzq(zzabiVar2.zze);
            this.zzn.zze(2, new zzea() { // from class: com.google.android.gms.internal.ads.zzkg
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    ((zzaz) obj11).zzd(zzmsVar.zzi.zzd);
                }
            });
        }
        if (z15) {
            final zzan zzanVar2 = this.zzN;
            this.zzn.zze(14, new zzea() { // from class: com.google.android.gms.internal.ads.zzkh
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    ((zzaz) obj11).zze(zzanVar2);
                }
            });
        }
        if (z18) {
            this.zzn.zze(3, new zzea() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    ((zzaz) obj11).zzf(zzmsVar.zzg);
                }
            });
        }
        if (z17) {
            this.zzn.zze(-1, new zzea() { // from class: com.google.android.gms.internal.ads.zzkj
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    zzms zzmsVar5 = zzmsVar;
                    ((zzaz) obj11).zzh(zzmsVar5.zzl, zzmsVar5.zze);
                }
            });
        } else {
            this.zzn.zze(-1, new zzea() { // from class: com.google.android.gms.internal.ads.zzkj
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    zzms zzmsVar5 = zzmsVar;
                    ((zzaz) obj11).zzh(zzmsVar5.zzl, zzmsVar5.zze);
                }
            });
        }
        if (z17) {
            this.zzn.zze(4, new zzea() { // from class: com.google.android.gms.internal.ads.zzkk
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    ((zzaz) obj11).zzi(zzmsVar.zze);
                }
            });
        }
        if (z16) {
            this.zzn.zze(5, new zzea() { // from class: com.google.android.gms.internal.ads.zzkl
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    zzms zzmsVar5 = zzmsVar;
                    ((zzaz) obj11).zzj(zzmsVar5.zzl, zzmsVar5.zzm);
                }
            });
        } else {
            this.zzn.zze(5, new zzea() { // from class: com.google.android.gms.internal.ads.zzkl
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    zzms zzmsVar5 = zzmsVar;
                    ((zzaz) obj11).zzj(zzmsVar5.zzl, zzmsVar5.zzm);
                }
            });
        }
        if (zzmsVar2.zzn != zzmsVar.zzn) {
            this.zzn.zze(6, new zzea() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    ((zzaz) obj11).zzk(zzmsVar.zzn);
                }
            });
        }
        if (zzmsVar2.zzj() != zzmsVar.zzj()) {
            this.zzn.zze(7, new zzea() { // from class: com.google.android.gms.internal.ads.zzkn
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    ((zzaz) obj11).zzl(zzmsVar.zzj());
                }
            });
        }
        if (!zzmsVar2.zzo.equals(zzmsVar.zzo)) {
            this.zzn.zze(12, new zzea() { // from class: com.google.android.gms.internal.ads.zzko
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i26 = zzlh.zzd;
                    ((zzaz) obj11).zzp(zzmsVar.zzo);
                }
            });
        }
        zzaxVar = this.zzM;
        zzbb zzbbVar2 = this.zzg;
        zzax zzaxVar3 = this.zzc;
        String str4 = zzfl.zza;
        boolean zZzx2 = zzbbVar2.zzx();
        zzfVar = (zzf) zzbbVar2;
        zzbfVarZzq2 = zzfVar.zzq();
        if (zzbfVarZzq2.zzg()) {
            z19 = false;
        } else {
            z19 = false;
        }
        zzbfVarZzq3 = zzfVar.zzq();
        if (zzbfVarZzq3.zzg()) {
            i17 = -1;
            r14 = 0;
            z20 = false;
        } else {
            int iZzs4 = zzfVar.zzs();
            zzfVar.zzl();
            zzfVar.zzm();
            r14 = 0;
            r14 = 0;
            iZzi = zzbfVarZzq3.zzi(iZzs4, 0, false);
            i17 = -1;
            if (iZzi != -1) {
                z20 = true;
            } else {
                z20 = false;
            }
        }
        Zzq = zzfVar.zzq();
        if (Zzq.zzg()) {
            r10 = r14;
        } else {
            iZzs = zzfVar.zzs();
            zzfVar.zzl();
            zzfVar.zzm();
            if (Zzq.zzh(iZzs, r14, r14) != i17) {
                r10 = 1;
            } else {
                r10 = r14;
            }
        }
        zzbfVarZzq4 = zzfVar.zzq();
        if (!zzbfVarZzq4.zzg()) {
            r44 = r10;
            j11 = 0;
            if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                r42 = r44;
                z21 = true;
                r43 = r44;
            }
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z22 = false;
            } else {
                z22 = false;
            }
            zZzg = zzbbVar2.zzq().zzg();
            zzaw zzawVar3 = new zzaw();
            zzawVar3.zzd(zzaxVar3);
            boolean z33 = !zZzx2;
            zzawVar3.zzb(4, z33);
            if (z19) {
                z23 = false;
            } else {
                z23 = false;
            }
            zzawVar3.zzb(5, z23);
            if (z20) {
                z24 = false;
            } else {
                z24 = false;
            }
            zzawVar3.zzb(6, z24);
            if (zZzg) {
                z25 = false;
            } else {
                z25 = false;
            }
            zzawVar3.zzb(7, z25);
            if (r43 != 0) {
                z26 = false;
            } else {
                z26 = false;
            }
            zzawVar3.zzb(8, z26);
            if (zZzg) {
                z27 = false;
            } else {
                z27 = false;
            }
            zzawVar3.zzb(9, z27);
            zzawVar3.zzb(10, z33);
            if (z19) {
                z28 = false;
            } else {
                z28 = false;
            }
            zzawVar3.zzb(11, z28);
            if (z19) {
                i18 = 12;
                z29 = false;
            } else {
                i18 = 12;
                z29 = false;
            }
            zzawVar3.zzb(i18, z29);
            zzaxVarZze = zzawVar3.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar)) {
                this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj11) {
                        this.zza.zzN((zzaz) obj11);
                    }
                });
            }
            this.zzn.zzf();
        }
        r42 = r10;
        j11 = 0;
        r42 = r44;
        z21 = false;
        r43 = r42;
        zzbfVarZzq5 = zzfVar.zzq();
        if (zzbfVarZzq5.zzg()) {
            z22 = false;
        } else {
            z22 = false;
        }
        zZzg = zzbbVar2.zzq().zzg();
        zzaw zzawVar4 = new zzaw();
        zzawVar4.zzd(zzaxVar3);
        boolean z34 = !zZzx2;
        zzawVar4.zzb(4, z34);
        if (z19) {
            z23 = false;
        } else {
            z23 = false;
        }
        zzawVar4.zzb(5, z23);
        if (z20) {
            z24 = false;
        } else {
            z24 = false;
        }
        zzawVar4.zzb(6, z24);
        if (zZzg) {
            z25 = false;
        } else {
            z25 = false;
        }
        zzawVar4.zzb(7, z25);
        if (r43 != 0) {
            z26 = false;
        } else {
            z26 = false;
        }
        zzawVar4.zzb(8, z26);
        if (zZzg) {
            z27 = false;
        } else {
            z27 = false;
        }
        zzawVar4.zzb(9, z27);
        zzawVar4.zzb(10, z34);
        if (z19) {
            z28 = false;
        } else {
            z28 = false;
        }
        zzawVar4.zzb(11, z28);
        if (z19) {
            i18 = 12;
            z29 = false;
        } else {
            i18 = 12;
            z29 = false;
        }
        zzawVar4.zzb(i18, z29);
        zzaxVarZze = zzawVar4.zze();
        this.zzM = zzaxVarZze;
        if (!zzaxVarZze.equals(zzaxVar)) {
            this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    this.zza.zzN((zzaz) obj11);
                }
            });
        }
        this.zzn.zzf();
    }

    private static long zzak(zzms zzmsVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmsVar.zza;
        zzbfVar.zzo(zzmsVar.zzb.zza, zzbdVar);
        long j10 = zzmsVar.zzc;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    private final zzms zzal(zzms zzmsVar, zzbf zzbfVar, Pair pair) {
        zzxk zzxkVar;
        zzgtj.zza(zzbfVar.zzg() || pair != null);
        zzbf zzbfVar2 = zzmsVar.zza;
        long jZzah = zzah(zzmsVar);
        zzms zzmsVarZzd = zzmsVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            zzxk zzxkVarZzb = zzms.zzb();
            long jZzs = zzfl.zzs(this.zzac);
            zzms zzmsVarZzh = zzmsVarZzd.zzc(zzxkVarZzb, jZzs, jZzs, jZzs, 0L, zzzn.zza, this.zzb, zzgwm.zzi()).zzh(zzxkVarZzb);
            zzmsVarZzh.zzq = zzmsVarZzh.zzs;
            return zzmsVarZzh;
        }
        zzxk zzxkVar2 = zzmsVarZzd.zzb;
        Object obj = zzxkVar2.zza;
        String str = zzfl.zza;
        boolean z10 = !obj.equals(pair.first);
        zzxk zzxkVar3 = z10 ? new zzxk(pair.first, -1L) : zzxkVar2;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzs2 = zzfl.zzs(jZzah);
        if (zzbfVar2.zzg()) {
            zzxkVar = zzxkVar3;
        } else {
            zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (z10 || jZzs2 - jLongValue != 1) {
                zzxkVar = zzxkVar3;
            } else {
                zzbd zzbdVarZzo = zzbfVar2.zzo(obj, zzbdVar);
                zzxkVar = zzxkVar3;
                if (jZzs2 == zzbdVarZzo.zzd) {
                    jZzs2--;
                }
            }
        }
        if (z10 || jLongValue < jZzs2) {
            zzgtj.zzi(!zzxkVar.zzb());
            zzms zzmsVarZzh2 = zzmsVarZzd.zzc(zzxkVar, jLongValue, jLongValue, jLongValue, 0L, z10 ? zzzn.zza : zzmsVarZzd.zzh, z10 ? this.zzb : zzmsVarZzd.zzi, z10 ? zzgwm.zzi() : zzmsVarZzd.zzj).zzh(zzxkVar);
            zzmsVarZzh2.zzq = jLongValue;
            return zzmsVarZzh2;
        }
        if (jLongValue != jZzs2) {
            zzgtj.zzi(!zzxkVar.zzb());
            long jMax = Math.max(0L, zzmsVarZzd.zzr - (jLongValue - jZzs2));
            long j10 = zzmsVarZzd.zzq;
            if (zzmsVarZzd.zzk.equals(zzxkVar2)) {
                j10 = jLongValue + jMax;
            }
            zzms zzmsVarZzc = zzmsVarZzd.zzc(zzxkVar, jLongValue, jLongValue, jLongValue, jMax, zzmsVarZzd.zzh, zzmsVarZzd.zzi, zzmsVarZzd.zzj);
            zzmsVarZzc.zzq = j10;
            return zzmsVarZzc;
        }
        int iZze = zzbfVar.zze(zzmsVarZzd.zzk.zza);
        if (iZze != -1) {
            zzbd zzbdVar2 = this.zzp;
            if (zzbfVar.zzd(iZze, zzbdVar2, false).zzc == zzbfVar.zzo(zzxkVar.zza, zzbdVar2).zzc) {
                return zzmsVarZzd;
            }
        }
        Object obj2 = zzxkVar.zza;
        zzbd zzbdVar3 = this.zzp;
        zzbfVar.zzo(obj2, zzbdVar3);
        long jZzh = zzxkVar.zzb() ? zzbdVar3.zzh(zzxkVar.zzb, zzxkVar.zzc) : zzbdVar3.zzd;
        zzms zzmsVarZzh3 = zzmsVarZzd.zzc(zzxkVar, zzmsVarZzd.zzs, zzmsVarZzd.zzs, zzmsVarZzd.zzd, jZzh - zzmsVarZzd.zzs, zzmsVarZzd.zzh, zzmsVarZzd.zzi, zzmsVarZzd.zzj).zzh(zzxkVar);
        zzmsVarZzh3.zzq = jZzh;
        return zzmsVarZzh3;
    }

    private static zzms zzam(zzms zzmsVar, int i10) {
        zzms zzmsVarZze = zzmsVar.zze(i10);
        return (i10 == 1 || i10 == 4) ? zzmsVarZze.zzg(false) : zzmsVarZze;
    }

    private final Pair zzan(zzbf zzbfVar, int i10, long j10) {
        if (zzbfVar.zzg()) {
            this.zzab = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.zzac = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzbfVar.zza()) {
            i10 = zzbfVar.zzk(false);
            long j11 = zzbfVar.zzb(i10, this.zza, 0L).zzl;
            j10 = zzfl.zzr(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i10, zzfl.zzs(j10));
    }

    private final long zzao(zzbf zzbfVar, zzxk zzxkVar, long j10) {
        zzbfVar.zzo(zzxkVar.zza, this.zzp);
        return j10;
    }

    private final zzmw zzap(zzmv zzmvVar) {
        int iZzag = zzag(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (iZzag == -1) {
            iZzag = 0;
        }
        zzdo zzdoVar = this.zzv;
        zzlu zzluVar = this.zzm;
        return new zzmw(zzluVar, zzmvVar, zzbfVar, iZzag, zzdoVar, zzluVar.zzn());
    }

    private final void zzaq(Object obj) {
        Object obj2 = this.zzO;
        boolean z10 = false;
        if (obj2 != null && obj2 != obj) {
            z10 = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z10 ? this.zzA : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (zZzl) {
            return;
        }
        zzP(zzjk.zzc(new zzlv(3), ErrorCodes.MALFORMED_URL_EXCEPTION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i10, final int i11) {
        if (i10 == this.zzR.zza() && i11 == this.zzR.zzb()) {
            return;
        }
        this.zzR = new zzeu(i10, i11);
        zzef zzefVar = this.zzn;
        zzefVar.zze(24, new zzea() { // from class: com.google.android.gms.internal.ads.zzkr
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(Object obj) {
                int i12 = zzlh.zzd;
                ((zzaz) obj).zzu(i10, i11);
            }
        });
        zzefVar.zzf();
        zzau(2, 14, new zzeu(i10, i11));
    }

    private final void zzas() {
        int iZzh = zzh();
        if (iZzh != 2 && iZzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzat();
            boolean z10 = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzau(int i10, int i11, Object obj) {
        zzna[] zznaVarArr = this.zzh;
        int length = zznaVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzna zznaVar = zznaVarArr[i12];
            if (i10 == -1 || zznaVar.zza() == i10) {
                zzmw zzmwVarZzap = zzap(zznaVar);
                zzmwVarZzap.zzb(i11);
                zzmwVarZzap.zzd(obj);
                zzmwVarZzap.zzg();
            }
        }
        zzna[] zznaVarArr2 = this.zzi;
        int length2 = zznaVarArr2.length;
        for (int i13 = 0; i13 < 2; i13++) {
            zzna zznaVar2 = zznaVarArr2[i13];
            if (zznaVar2 != null && (i10 == -1 || zznaVar2.zza() == i10)) {
                zzmw zzmwVarZzap2 = zzap(zznaVar2);
                zzmwVarZzap2.zzb(i11);
                zzmwVarZzap2.zzd(obj);
                zzmwVarZzap2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzat();
        return zzah(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f10) {
        zzat();
        String str = zzfl.zza;
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzT == fMax) {
            return;
        }
        this.zzT = fMax;
        this.zzm.zzj(fMax);
        zzef zzefVar = this.zzn;
        zzefVar.zze(22, new zzea() { // from class: com.google.android.gms.internal.ads.zzkw
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(Object obj) {
                int i10 = zzlh.zzd;
                ((zzaz) obj).zzr(fMax);
            }
        });
        zzefVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        zzat();
        zzaq(surface);
        int i10 = surface == null ? 0 : -1;
        zzS(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzD(zznp zznpVar) {
        this.zzs.zzv(zznpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzE(zznp zznpVar) {
        zzat();
        this.zzs.zzw(zznpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final int zzF() {
        zzat();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzG(zzxm zzxmVar) {
        zzat();
        List listSingletonList = Collections.singletonList(zzxmVar);
        zzat();
        zzat();
        zzag(this.zzaa);
        zzu();
        this.zzG++;
        List list = this.zzq;
        list.clear();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listSingletonList.size(); i10++) {
            zzmo zzmoVar = new zzmo((zzxm) listSingletonList.get(i10), this.zzr);
            arrayList.add(zzmoVar);
            list.add(i10, new zzld(zzmoVar.zzb, zzmoVar.zza));
        }
        this.zzad = this.zzad.zzg().zzf(0, arrayList.size());
        zzmy zzmyVar = new zzmy(list, this.zzad);
        if (!zzmyVar.zzg() && zzmyVar.zza() < 0) {
            throw new zzw(zzmyVar, -1, -9223372036854775807L);
        }
        int iZzk = zzmyVar.zzk(false);
        zzms zzmsVarZzal = zzal(this.zzaa, zzmyVar, zzan(zzmyVar, iZzk, -9223372036854775807L));
        int i11 = zzmsVarZzal.zze;
        if (i11 == 1) {
            i11 = 1;
        } else if (zzmyVar.zzg()) {
            i11 = 4;
        } else if (iZzk != -1) {
            if (iZzk >= zzmyVar.zza()) {
                i11 = 4;
            } else {
                i11 = 2;
            }
        }
        zzms zzmsVarZzam = zzam(zzmsVarZzal, i11);
        this.zzm.zzy(arrayList, iZzk, zzfl.zzs(-9223372036854775807L), this.zzad);
        zzaj(zzmsVarZzam, 0, (this.zzaa.zzb.zza.equals(zzmsVarZzam.zzb.zza) || this.zzaa.zza.zzg()) ? false : true, 4, zzai(zzmsVarZzam), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfl.zza;
        String strZza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb2 = new StringBuilder(length + 39 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        sb2.append("Release ");
        sb2.append(hexString);
        sb2.append(" [AndroidXMedia3/1.10.0-rc02] [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(strZza);
        sb2.append("]");
        zzeg.zzb("ExoPlayerImpl", sb2.toString());
        zzat();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzlg zzlgVar = this.zzD;
        if (zzlgVar != null && Build.VERSION.SDK_INT >= 34) {
            zzlgVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzef zzefVar = this.zzn;
            zzefVar.zze(10, zzkv.zza);
            zzefVar.zzf();
        }
        this.zzn.zzg();
        this.zzk.zzl(null);
        zzabq zzabqVar = this.zzu;
        zznm zznmVar = this.zzs;
        zzabqVar.zzg(zznmVar);
        zzms zzmsVar = this.zzaa;
        boolean z10 = zzmsVar.zzp;
        zzms zzmsVarZzam = zzam(zzmsVar, 1);
        this.zzaa = zzmsVarZzam;
        zzms zzmsVarZzh = zzmsVarZzam.zzh(zzmsVarZzam.zzb);
        this.zzaa = zzmsVarZzh;
        zzmsVarZzh.zzq = zzmsVarZzh.zzs;
        this.zzaa.zzr = 0L;
        zznmVar.zzy();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        int i10 = zzcz.zza;
        this.zzY = true;
    }

    public final zzjk zzI() {
        zzat();
        return this.zzaa.zzf;
    }

    final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    final /* synthetic */ void zzK(final zzlr zzlrVar) {
        this.zzk.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO(zzlrVar);
            }
        });
    }

    final /* synthetic */ void zzL(int i10, final int i11) {
        zzat();
        Integer numValueOf = Integer.valueOf(i11);
        zzau(1, 10, numValueOf);
        zzau(2, 10, numValueOf);
        zzea zzeaVar = new zzea() { // from class: com.google.android.gms.internal.ads.zzks
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(Object obj) {
                int i12 = zzlh.zzd;
                ((zzaz) obj).zzq(i11);
            }
        };
        zzef zzefVar = this.zzn;
        zzefVar.zze(21, zzeaVar);
        zzefVar.zzf();
    }

    final /* synthetic */ void zzM() {
        String str = zzfl.zza;
        int iGenerateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (iGenerateAudioSessionId == -1) {
            iGenerateAudioSessionId = 0;
        }
        zzdm zzdmVar = this.zzB;
        if (((Integer) zzdmVar.zza()).intValue() != iGenerateAudioSessionId) {
            Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
            zzdmVar.zzc(numValueOf);
            zzau(1, 10, numValueOf);
            zzau(2, 10, numValueOf);
        }
    }

    final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzM);
    }

    final /* synthetic */ void zzO(zzlr zzlrVar) {
        int i10;
        long j10;
        int i11 = this.zzG - zzlrVar.zzb;
        this.zzG = i11;
        boolean z10 = true;
        if (zzlrVar.zzc) {
            this.zzH = zzlrVar.zzd;
            this.zzI = true;
        }
        if (i11 == 0) {
            zzbf zzbfVar = zzlrVar.zza.zza;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List listZzw = ((zzmy) zzbfVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzgtj.zzi(size == list.size());
                for (int i12 = 0; i12 < listZzw.size(); i12++) {
                    ((zzld) list.get(i12)).zzc((zzbf) listZzw.get(i12));
                }
            }
            long j11 = -9223372036854775807L;
            if (this.zzI) {
                boolean z11 = zzlrVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean zEquals = zzlrVar.zza.zzb.equals(this.zzaa.zzb);
                long j12 = zzlrVar.zza.zzd;
                long j13 = this.zzaa.zzs;
                if (z11 || (zEquals && j12 == j13)) {
                    z10 = false;
                }
                if (z10) {
                    int iZzs = zzs();
                    if (zzbfVar.zzg() || zzlrVar.zza.zzb.zzb()) {
                        j10 = zzlrVar.zza.zzd;
                    } else {
                        zzms zzmsVar = zzlrVar.zza;
                        zzxk zzxkVar = zzmsVar.zzb;
                        j10 = zzmsVar.zzd;
                        zzao(zzbfVar, zzxkVar, j10);
                    }
                    j11 = j10;
                    i10 = iZzs;
                } else {
                    i10 = -1;
                }
            } else {
                i10 = -1;
                z10 = false;
            }
            this.zzI = false;
            zzaj(zzlrVar.zza, 1, z10, this.zzH, j11, i10, false);
        }
    }

    final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzaq(surface);
        this.zzP = surface;
    }

    final /* synthetic */ void zzR(Object obj) {
        zzaq(null);
    }

    final /* synthetic */ void zzT(int i10, int i11, Object obj) {
        zzau(1, 19, obj);
    }

    final /* synthetic */ zzef zzU() {
        return this.zzn;
    }

    final /* synthetic */ zznm zzV() {
        return this.zzs;
    }

    final /* synthetic */ Looper zzW() {
        return this.zzt;
    }

    final /* synthetic */ zzdo zzX() {
        return this.zzv;
    }

    final /* synthetic */ zzdm zzY() {
        return this.zzB;
    }

    final /* synthetic */ zzjx zzZ() {
        return this.zzE;
    }

    final /* synthetic */ zzjx zzaa() {
        return this.zzF;
    }

    final /* synthetic */ Object zzab() {
        return this.zzO;
    }

    final /* synthetic */ boolean zzac() {
        return this.zzU;
    }

    final /* synthetic */ void zzad(boolean z10) {
        this.zzU = z10;
    }

    final /* synthetic */ boolean zzae() {
        return this.zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzat();
        zzazVar.getClass();
        this.zzn.zzd(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzat();
        zzms zzmsVar = this.zzaa;
        if (zzmsVar.zze != 1) {
            return;
        }
        zzms zzmsVarZzf = zzmsVar.zzf(null);
        zzms zzmsVarZzam = zzam(zzmsVarZzf, true != zzmsVarZzf.zza.zzg() ? 2 : 4);
        this.zzG++;
        this.zzm.zzd();
        zzaj(zzmsVarZzam, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzat();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzat();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z10) {
        zzat();
        zzms zzmsVar = this.zzaa;
        int i10 = zzmsVar.zzn;
        int i11 = 0;
        if (i10 == 1) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 1;
                i11 = 1;
            }
        }
        if (zzmsVar.zzl == z10 && i10 == i11 && zzmsVar.zzm == 1) {
            return;
        }
        this.zzG++;
        zzms zzmsVarZzi = zzmsVar.zzi(z10, 1, i11);
        this.zzm.zze(z10, 1, i11);
        zzaj(zzmsVarZzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzat();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzat();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzat();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzat();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzat();
        zzP(null);
        new zzcz(zzgwm.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzat();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzat();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzat();
        if (!this.zzaa.zza.zzg()) {
            zzms zzmsVar = this.zzaa;
            return zzmsVar.zza.zze(zzmsVar.zzb.zza);
        }
        int i10 = this.zzab;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzat();
        int iZzag = zzag(this.zzaa);
        if (iZzag == -1) {
            return 0;
        }
        return iZzag;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzat();
        if (!zzx()) {
            zzbf zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                return -9223372036854775807L;
            }
            return zzfl.zzr(zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzms zzmsVar = this.zzaa;
        zzxk zzxkVar = zzmsVar.zzb;
        zzbf zzbfVar = zzmsVar.zza;
        Object obj = zzxkVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfl.zzr(zzbdVar.zzh(zzxkVar.zzb, zzxkVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzat();
        return zzfl.zzr(zzai(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzat();
        if (zzx()) {
            zzms zzmsVar = this.zzaa;
            return zzmsVar.zzk.equals(zzmsVar.zzb) ? zzfl.zzr(this.zzaa.zzq) : zzt();
        }
        zzat();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzms zzmsVar2 = this.zzaa;
        long j10 = 0;
        if (zzmsVar2.zzk.zzd != zzmsVar2.zzb.zzd) {
            return zzfl.zzr(zzmsVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j11 = zzmsVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzms zzmsVar3 = this.zzaa;
            zzmsVar3.zza.zzo(zzmsVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzms zzmsVar4 = this.zzaa;
        zzao(zzmsVar4.zza, zzmsVar4.zzk, j10);
        return zzfl.zzr(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzat();
        return zzfl.zzr(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzat();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }

    private final void zzat() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzfl.zza;
            String str2 = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzV) {
                throw new IllegalStateException(str2);
            }
            zzeg.zzd(ljglrLUdGZhMhQ.BwjKtvGbXtivWD, str2, this.zzW ? null : new IllegalStateException());
            this.zzW = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzf
    protected final void zzc(int i10, long j10, int i11, boolean z10) {
        boolean z11;
        zzat();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzgtj.zza(z11);
            zzbf zzbfVar = this.zzaa.zza;
            if (!zzbfVar.zzg() && i10 >= zzbfVar.zza()) {
                return;
            }
            this.zzs.zzA();
            this.zzG++;
            if (zzx()) {
                zzeg.zzc("ExoPlayerImpl", elEbP.mVHtCqjznopzv);
                zzlr zzlrVar = new zzlr(this.zzaa);
                zzlrVar.zza(1);
                this.zzl.zza(zzlrVar);
                return;
            }
            zzms zzmsVarZzam = this.zzaa;
            int i12 = zzmsVarZzam.zze;
            if (i12 == 3 || (i12 == 4 && !zzbfVar.zzg())) {
                zzmsVarZzam = zzam(this.zzaa, 2);
            }
            int iZzs = zzs();
            zzms zzmsVarZzal = zzal(zzmsVarZzam, zzbfVar, zzan(zzbfVar, i10, j10));
            this.zzm.zzf(zzbfVar, i10, zzfl.zzs(j10));
            zzaj(zzmsVarZzal, 0, true, 1, zzai(zzmsVarZzal), iZzs, false);
        }
    }
}
