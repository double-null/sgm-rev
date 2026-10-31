package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzvt extends zzix {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private boolean zzA;
    private float zzB;
    private ArrayDeque zzC;
    private zzvp zzD;
    private zzvm zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private ByteBuffer zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    protected zzjb zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private long zzad;
    private boolean zzae;
    private boolean zzaf;
    private boolean zzag;
    private zzvs zzah;
    private long zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private long zzam;
    private zziz zzan;
    private zziz zzao;
    private zzgww zzap;
    private final Context zzc;
    private final zzvh zzd;
    private final zzvv zze;
    private final float zzf;
    private final zziv zzg;
    private final zziv zzh;
    private final zziv zzi;
    private final zzva zzj;
    private final MediaCodec.BufferInfo zzk;
    private final ArrayDeque zzl;
    private final zzty zzm;
    private final AtomicInteger zzn;
    private zzv zzo;
    private zzv zzp;
    private zzug zzq;
    private zzug zzr;
    private zzmz zzs;
    private MediaCrypto zzt;
    private long zzu;
    private float zzv;
    private float zzw;
    private zzvj zzx;
    private zzv zzy;
    private MediaFormat zzz;

    public zzvt(Context context, int i10, zzvh zzvhVar, zzvv zzvvVar, boolean z10, float f10) {
        super(i10);
        this.zzc = context.getApplicationContext();
        this.zzd = zzvhVar;
        zzvvVar.getClass();
        this.zze = zzvvVar;
        this.zzf = f10;
        this.zzn = new AtomicInteger();
        this.zzg = new zziv(0, 0);
        this.zzh = new zziv(0, 0);
        this.zzi = new zziv(2, 0);
        zzva zzvaVar = new zzva();
        this.zzj = zzvaVar;
        this.zzk = new MediaCodec.BufferInfo();
        this.zzv = 1.0f;
        this.zzw = 1.0f;
        this.zzu = -9223372036854775807L;
        this.zzl = new ArrayDeque();
        this.zzah = zzvs.zza;
        zzvaVar.zzj(0);
        zzvaVar.zzc.order(ByteOrder.nativeOrder());
        this.zzm = new zzty();
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzX = 0;
        this.zzO = -1;
        this.zzP = -1;
        this.zzN = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzai = -9223372036854775807L;
        this.zzL = -9223372036854775807L;
        this.zzY = 0;
        this.zzZ = 0;
        this.zza = new zzjb();
        this.zzal = false;
        this.zzam = 0L;
        this.zzap = zzgww.zzh();
        zziz zzizVar = zziz.zza;
        this.zzan = zzizVar;
        this.zzao = zzizVar;
    }

    private final boolean zzaA(int i10) throws zzjk {
        zzlw zzlwVarZzI = zzI();
        zziv zzivVar = this.zzg;
        zzivVar.zza();
        int iZzQ = zzQ(zzlwVarZzI, zzivVar, i10 | 4);
        if (iZzQ == -5) {
            zzao(zzlwVarZzI);
            return true;
        }
        if (iZzQ != -4 || !zzivVar.zzb()) {
            return false;
        }
        this.zzae = true;
        zzbr();
        return false;
    }

    private final boolean zzaB(long j10) {
        return this.zzu == -9223372036854775807L || zzM().zzb() - j10 < this.zzu;
    }

    private final boolean zzaC() {
        return this.zzP >= 0;
    }

    private final void zzaq() {
        this.zzT = false;
        zzaw();
    }

    private final void zzaw() {
        zzaz();
        this.zzV = false;
        this.zzj.zza();
        this.zzi.zza();
        this.zzU = false;
        this.zzm.zzb();
    }

    private final boolean zzax() {
        if (this.zzx == null) {
            return false;
        }
        if (zzaO()) {
            zzaM();
            return true;
        }
        if (zzaP()) {
            zzay();
            return false;
        }
        this.zzal = true;
        return false;
    }

    private final void zzay() {
        try {
            zzvj zzvjVar = this.zzx;
            zzvjVar.getClass();
            zzvjVar.zzk();
        } finally {
            zzaR();
        }
    }

    private final void zzaz() {
        this.zzad = -9223372036854775807L;
        zzbt().zzf = -9223372036854775807L;
        this.zzai = -9223372036854775807L;
    }

    protected static boolean zzbj(zzv zzvVar) {
        return zzvVar.zzO == 0;
    }

    private final void zzbm() {
        this.zzO = -1;
        this.zzh.zzc = null;
    }

    private final void zzbn() {
        this.zzP = -1;
        this.zzQ = null;
    }

    private final boolean zzbo(zzv zzvVar) throws zzjk {
        if (this.zzx != null && this.zzZ != 3 && zze() != 0) {
            float f10 = this.zzw;
            zzvVar.getClass();
            float fZzak = zzak(f10, zzvVar, zzJ());
            float f11 = this.zzB;
            if (f11 != fZzak) {
                if (fZzak == -1.0f) {
                    zzbq();
                    return false;
                }
                if (f11 != -1.0f || fZzak > this.zzf) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzak);
                    zzvj zzvjVar = this.zzx;
                    zzvjVar.getClass();
                    zzvjVar.zzp(bundle);
                    this.zzB = fZzak;
                }
            }
        }
        return true;
    }

    private final boolean zzbp() throws zzjk {
        if (this.zzaa) {
            this.zzY = 1;
            if (this.zzH) {
                this.zzZ = 3;
                return false;
            }
            this.zzZ = 2;
        } else {
            zzbu();
        }
        return true;
    }

    private final void zzbq() throws zzjk {
        if (this.zzaa) {
            this.zzY = 1;
            this.zzZ = 3;
        } else {
            zzaM();
            zzaE();
        }
    }

    private final void zzbr() throws zzjk {
        int i10 = this.zzZ;
        if (i10 == 1) {
            zzay();
            return;
        }
        if (i10 == 2) {
            zzay();
            zzbu();
        } else if (i10 != 3) {
            this.zzaf = true;
            zzau();
        } else {
            zzaM();
            zzaE();
        }
    }

    private final void zzbs(zzvs zzvsVar) {
        this.zzah = zzvsVar;
        if (zzvsVar.zzd != -9223372036854775807L) {
            this.zzaj = true;
        }
    }

    private final zzvs zzbt() {
        ArrayDeque arrayDeque = this.zzl;
        return !arrayDeque.isEmpty() ? (zzvs) arrayDeque.getLast() : this.zzah;
    }

    private final void zzbu() throws zzjk {
        zzug zzugVar = this.zzr;
        zzugVar.getClass();
        this.zzq = zzugVar;
        this.zzY = 0;
        this.zzZ = 0;
    }

    private final boolean zzbv(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        zzv zzvVar = this.zzp;
        if (zzvVar == null || !Objects.equals(zzvVar.zzp, "audio/opus")) {
            return true;
        }
        return !zzgv.zzf(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzA(long j10, boolean z10, boolean z11) throws zzjk {
        ArrayDeque arrayDeque = this.zzl;
        if (!arrayDeque.isEmpty()) {
            this.zzah = (zzvs) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z11) {
            this.zzae = false;
            this.zzaf = false;
            if (this.zzT) {
                zzaw();
            } else {
                zzaN();
            }
            zzfh zzfhVar = this.zzah.zze;
            if (zzfhVar.zzc() > 0) {
                this.zzag = true;
            }
            zzfhVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzD() {
        this.zzo = null;
        zzbs(zzvs.zza);
        this.zzl.clear();
        if (this.zzT) {
            zzaq();
        } else {
            zzax();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzE() {
        try {
            zzaq();
            zzaM();
        } finally {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final long zzV(long j10, long j11) {
        return zzaj(j10, j11, this.zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public void zzX(float f10, float f11) throws zzjk {
        this.zzv = f10;
        this.zzw = f11;
        zzbo(this.zzy);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17861. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.ads.zzna
    public void zzZ(long r28, long r30) throws com.google.android.gms.internal.ads.zzjk {
        /*
            Method dump skipped, instruction units count: 1786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvt.zzZ(long, long):void");
    }

    public final void zzaD() {
        this.zzak = true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b6 A[Catch: Exception -> 0x0104, TryCatch #10 {Exception -> 0x0104, blocks: (B:63:0x00fa, B:75:0x0145, B:77:0x0159, B:80:0x0168, B:84:0x017b, B:86:0x0183, B:88:0x018b, B:90:0x0195, B:92:0x019d, B:94:0x01a5, B:98:0x01b0, B:100:0x01b6, B:104:0x01c1, B:106:0x01ca, B:131:0x0221, B:133:0x0228, B:135:0x022e, B:136:0x023c, B:111:0x01d7, B:113:0x01df, B:115:0x01e7, B:117:0x01ef, B:119:0x01f7, B:121:0x01ff, B:123:0x0207, B:125:0x0211, B:127:0x021b), top: B:197:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca A[Catch: Exception -> 0x0104, TryCatch #10 {Exception -> 0x0104, blocks: (B:63:0x00fa, B:75:0x0145, B:77:0x0159, B:80:0x0168, B:84:0x017b, B:86:0x0183, B:88:0x018b, B:90:0x0195, B:92:0x019d, B:94:0x01a5, B:98:0x01b0, B:100:0x01b6, B:104:0x01c1, B:106:0x01ca, B:131:0x0221, B:133:0x0228, B:135:0x022e, B:136:0x023c, B:111:0x01d7, B:113:0x01df, B:115:0x01e7, B:117:0x01ef, B:119:0x01f7, B:121:0x01ff, B:123:0x0207, B:125:0x0211, B:127:0x021b), top: B:197:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01d7 A[Catch: Exception -> 0x0104, TryCatch #10 {Exception -> 0x0104, blocks: (B:63:0x00fa, B:75:0x0145, B:77:0x0159, B:80:0x0168, B:84:0x017b, B:86:0x0183, B:88:0x018b, B:90:0x0195, B:92:0x019d, B:94:0x01a5, B:98:0x01b0, B:100:0x01b6, B:104:0x01c1, B:106:0x01ca, B:131:0x0221, B:133:0x0228, B:135:0x022e, B:136:0x023c, B:111:0x01d7, B:113:0x01df, B:115:0x01e7, B:117:0x01ef, B:119:0x01f7, B:121:0x01ff, B:123:0x0207, B:125:0x0211, B:127:0x021b), top: B:197:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0207 A[Catch: Exception -> 0x0104, TryCatch #10 {Exception -> 0x0104, blocks: (B:63:0x00fa, B:75:0x0145, B:77:0x0159, B:80:0x0168, B:84:0x017b, B:86:0x0183, B:88:0x018b, B:90:0x0195, B:92:0x019d, B:94:0x01a5, B:98:0x01b0, B:100:0x01b6, B:104:0x01c1, B:106:0x01ca, B:131:0x0221, B:133:0x0228, B:135:0x022e, B:136:0x023c, B:111:0x01d7, B:113:0x01df, B:115:0x01e7, B:117:0x01ef, B:119:0x01f7, B:121:0x01ff, B:123:0x0207, B:125:0x0211, B:127:0x021b), top: B:197:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:135:0x022e A[Catch: Exception -> 0x0104, TryCatch #10 {Exception -> 0x0104, blocks: (B:63:0x00fa, B:75:0x0145, B:77:0x0159, B:80:0x0168, B:84:0x017b, B:86:0x0183, B:88:0x018b, B:90:0x0195, B:92:0x019d, B:94:0x01a5, B:98:0x01b0, B:100:0x01b6, B:104:0x01c1, B:106:0x01ca, B:131:0x0221, B:133:0x0228, B:135:0x022e, B:136:0x023c, B:111:0x01d7, B:113:0x01df, B:115:0x01e7, B:117:0x01ef, B:119:0x01f7, B:121:0x01ff, B:123:0x0207, B:125:0x0211, B:127:0x021b), top: B:197:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:140:0x024a A[Catch: Exception -> 0x026e, TryCatch #0 {Exception -> 0x026e, blocks: (B:138:0x0242, B:140:0x024a, B:142:0x0252, B:144:0x0257), top: B:179:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02a3 A[Catch: zzvp -> 0x02d0, TryCatch #7 {zzvp -> 0x02d0, blocks: (B:159:0x028a, B:161:0x02a3, B:163:0x02ac, B:166:0x02ba, B:167:0x02bc, B:162:0x02a6, B:168:0x02bd, B:170:0x02c3, B:171:0x02cf), top: B:192:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x02a6 A[Catch: zzvp -> 0x02d0, TryCatch #7 {zzvp -> 0x02d0, blocks: (B:159:0x028a, B:161:0x02a3, B:163:0x02ac, B:166:0x02ba, B:167:0x02bc, B:162:0x02a6, B:168:0x02bd, B:170:0x02c3, B:171:0x02cf), top: B:192:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0159 A[Catch: Exception -> 0x0104, TRY_LEAVE, TryCatch #10 {Exception -> 0x0104, blocks: (B:63:0x00fa, B:75:0x0145, B:77:0x0159, B:80:0x0168, B:84:0x017b, B:86:0x0183, B:88:0x018b, B:90:0x0195, B:92:0x019d, B:94:0x01a5, B:98:0x01b0, B:100:0x01b6, B:104:0x01c1, B:106:0x01ca, B:131:0x0221, B:133:0x0228, B:135:0x022e, B:136:0x023c, B:111:0x01d7, B:113:0x01df, B:115:0x01e7, B:117:0x01ef, B:119:0x01f7, B:121:0x01ff, B:123:0x0207, B:125:0x0211, B:127:0x021b), top: B:197:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:84:0x017b A[Catch: Exception -> 0x0104, TryCatch #10 {Exception -> 0x0104, blocks: (B:63:0x00fa, B:75:0x0145, B:77:0x0159, B:80:0x0168, B:84:0x017b, B:86:0x0183, B:88:0x018b, B:90:0x0195, B:92:0x019d, B:94:0x01a5, B:98:0x01b0, B:100:0x01b6, B:104:0x01c1, B:106:0x01ca, B:131:0x0221, B:133:0x0228, B:135:0x022e, B:136:0x023c, B:111:0x01d7, B:113:0x01df, B:115:0x01e7, B:117:0x01ef, B:119:0x01f7, B:121:0x01ff, B:123:0x0207, B:125:0x0211, B:127:0x021b), top: B:197:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0183 A[Catch: Exception -> 0x0104, TryCatch #10 {Exception -> 0x0104, blocks: (B:63:0x00fa, B:75:0x0145, B:77:0x0159, B:80:0x0168, B:84:0x017b, B:86:0x0183, B:88:0x018b, B:90:0x0195, B:92:0x019d, B:94:0x01a5, B:98:0x01b0, B:100:0x01b6, B:104:0x01c1, B:106:0x01ca, B:131:0x0221, B:133:0x0228, B:135:0x022e, B:136:0x023c, B:111:0x01d7, B:113:0x01df, B:115:0x01e7, B:117:0x01ef, B:119:0x01f7, B:121:0x01ff, B:123:0x0207, B:125:0x0211, B:127:0x021b), top: B:197:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.google.android.gms.internal.ads.zzvh] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.gms.internal.ads.zzvg] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.android.gms.internal.ads.zzvm] */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzvt] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.zzvm, java.lang.Object] */
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
    protected final void zzaE() throws zzjk {
        zzv zzvVar;
        zzv zzvVar2;
        ?? r10;
        ?? Zzah;
        zzvp zzvpVar;
        zzvp zzvpVar2;
        zzv zzvVar3;
        ?? r18;
        long jZzb;
        int i10;
        boolean z10;
        boolean z11;
        ?? r19;
        if (this.zzx != null || this.zzT || (zzvVar = this.zzo) == null) {
            return;
        }
        ?? r11 = 1;
        if (zzaF(zzvVar)) {
            zzaq();
            String str = zzvVar.zzp;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzj.zzm(32);
            } else {
                this.zzj.zzm(1);
            }
            this.zzT = true;
            return;
        }
        zzug zzugVar = this.zzr;
        this.zzq = zzugVar;
        if (zzugVar != null) {
            zzgtj.zzi(true);
            this.zzq.zza();
        }
        try {
            zzv zzvVar4 = this.zzo;
            zzvVar4.getClass();
            MediaCrypto mediaCrypto = null;
            if (this.zzC == null) {
                try {
                    List listZzaf = zzaf(this.zze, zzvVar4, false);
                    listZzaf.isEmpty();
                    this.zzC = new ArrayDeque();
                    if (!listZzaf.isEmpty()) {
                        this.zzC.add((zzvm) listZzaf.get(0));
                    }
                    this.zzD = null;
                } catch (zzvx e10) {
                    throw new zzvp(zzvVar4, (Throwable) e10, false, -49998);
                }
            }
            try {
                if (this.zzC.isEmpty()) {
                    throw new zzvp(zzvVar4, (Throwable) null, false, -49999);
                }
                ArrayDeque arrayDeque = this.zzC;
                arrayDeque.getClass();
                ?? r12 = arrayDeque;
                zzv zzvVar5 = zzvVar;
                while (this.zzx == null) {
                    ?? r13 = (zzvm) r12.peekFirst();
                    r13.getClass();
                    zzaU(zzvVar4);
                    if (!zzaG(r13)) {
                        return;
                    }
                    try {
                        this.zzE = r13;
                        zzv zzvVar6 = this.zzo;
                        zzvVar6.getClass();
                        String str2 = r13.zza;
                        float fZzak = zzak(this.zzw, zzvVar6, zzJ());
                        if (fZzak <= this.zzf) {
                            fZzak = -1.0f;
                        }
                        long jZzb2 = zzM().zzb();
                        try {
                            Zzah = zzah(r13, zzvVar6, mediaCrypto, fZzak);
                            r13 = Build.VERSION.SDK_INT;
                            try {
                                if (r13 >= 31) {
                                    try {
                                        LogSessionId logSessionIdZza = zzL().zza();
                                        ?? r110 = r12;
                                        try {
                                            r19 = r110;
                                            if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                                zzvVar3 = zzvVar5;
                                                try {
                                                    Zzah.zzb.setString("log-session-id", logSessionIdZza.getStringId());
                                                    r10 = "log-session-id";
                                                    r18 = r110;
                                                    zzvVar2 = zzvVar3;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    Zzah = r110;
                                                    zzvVar2 = zzvVar3;
                                                    r10 = 1;
                                                    zzeg.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r13.zza), e);
                                                    Zzah.removeFirst();
                                                    zzvpVar = new zzvp(zzvVar4, (Throwable) e, false, (zzvm) r13);
                                                    zzan(zzvpVar);
                                                    zzvpVar2 = this.zzD;
                                                    if (zzvpVar2 == null) {
                                                        this.zzD = zzvpVar;
                                                    } else {
                                                        this.zzD = zzvpVar2.zza(zzvpVar);
                                                    }
                                                    if (Zzah.isEmpty()) {
                                                        throw this.zzD;
                                                    }
                                                    r12 = Zzah;
                                                    mediaCrypto = null;
                                                    r11 = r10;
                                                    zzvVar5 = zzvVar2;
                                                }
                                            }
                                            StringBuilder sb2 = new StringBuilder(str2.length() + 12);
                                            sb2.append("createCodec:");
                                            sb2.append(str2);
                                            Trace.beginSection(sb2.toString());
                                            zzvj zzvjVarZzc = this.zzd.zzc(Zzah);
                                            this.zzx = zzvjVarZzc;
                                            r10 = 0;
                                            this.zzM = zzvjVarZzc.zzm(new zzvr(this, null));
                                            Trace.endSection();
                                            jZzb = zzM().zzb();
                                            if (r13.zzc(this.zzc, zzvVar6)) {
                                                this.zzB = fZzak;
                                                this.zzy = zzvVar6;
                                                if (r13 <= 25) {
                                                    i10 = 0;
                                                } else {
                                                    i10 = 0;
                                                }
                                                this.zzF = i10;
                                                if (r13 == 29) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                this.zzG = z10;
                                                this.zzH = false;
                                                String str3 = r13.zza;
                                                if (r13 > 25) {
                                                    z11 = r13 > 29 ? false : false;
                                                } else if (r13 > 29) {
                                                }
                                                this.zzK = z11;
                                                this.zzx.getClass();
                                                if (zze() == 2) {
                                                    this.zzN = zzM().zzb() + 1000;
                                                }
                                                r10 = 1;
                                                r10 = 1;
                                                r10 = 1;
                                                this.zza.zza++;
                                                long j10 = jZzb - jZzb2;
                                                if (r13 >= 31) {
                                                    zzvj zzvjVar = this.zzx;
                                                    zzvjVar.getClass();
                                                    zzvjVar.zzr(new ArrayList(this.zzap));
                                                }
                                                r13 = r13;
                                                Zzah = r18;
                                                zzal(str2, Zzah, jZzb, j10);
                                            } else {
                                                Object[] objArr = new Object[2];
                                                objArr[0] = zzv.zze(zzvVar6);
                                                try {
                                                    objArr[1] = str2;
                                                    String str4 = zzfl.zza;
                                                    zzeg.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                                                    this.zzB = fZzak;
                                                    this.zzy = zzvVar6;
                                                    if (r13 <= 25 || !"OMX.Exynos.avc.dec.secure".equals(str2)) {
                                                        i10 = 0;
                                                    } else {
                                                        String str5 = Build.MODEL;
                                                        if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                                                            i10 = 2;
                                                        } else {
                                                            i10 = 0;
                                                        }
                                                    }
                                                    this.zzF = i10;
                                                    if (r13 == 29 || !"c2.android.aac.decoder".equals(str2)) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = true;
                                                    }
                                                    this.zzG = z10;
                                                    this.zzH = false;
                                                    String str6 = r13.zza;
                                                    if (r13 > 25 && "OMX.rk.video_decoder.avc".equals(str6)) {
                                                        z11 = true;
                                                    } else if ((r13 > 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str6) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str6) || "OMX.bcm.vdec.avc.tunnel".equals(str6) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str6) || "OMX.bcm.vdec.hevc.tunnel".equals(str6) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str6))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && r13.zzf)) {
                                                        z11 = true;
                                                    }
                                                    this.zzK = z11;
                                                    this.zzx.getClass();
                                                    if (zze() == 2) {
                                                        this.zzN = zzM().zzb() + 1000;
                                                    }
                                                    r10 = 1;
                                                    r10 = 1;
                                                    r10 = 1;
                                                    try {
                                                        this.zza.zza++;
                                                        long j11 = jZzb - jZzb2;
                                                        if (r13 >= 31 && !this.zzap.isEmpty()) {
                                                            zzvj zzvjVar2 = this.zzx;
                                                            zzvjVar2.getClass();
                                                            zzvjVar2.zzr(new ArrayList(this.zzap));
                                                        }
                                                        r13 = r13;
                                                        Zzah = r18;
                                                        try {
                                                            zzal(str2, Zzah, jZzb, j11);
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        Zzah = r18;
                                                        zzeg.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r13.zza), e);
                                                        Zzah.removeFirst();
                                                        zzvpVar = new zzvp(zzvVar4, (Throwable) e, false, (zzvm) r13);
                                                        zzan(zzvpVar);
                                                        zzvpVar2 = this.zzD;
                                                        if (zzvpVar2 == null) {
                                                            this.zzD = zzvpVar;
                                                        } else {
                                                            this.zzD = zzvpVar2.zza(zzvpVar);
                                                        }
                                                        if (Zzah.isEmpty()) {
                                                            throw this.zzD;
                                                        }
                                                    }
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    r10 = 1;
                                                    Zzah = r18;
                                                    zzeg.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r13.zza), e);
                                                    Zzah.removeFirst();
                                                    zzvpVar = new zzvp(zzvVar4, (Throwable) e, false, (zzvm) r13);
                                                    zzan(zzvpVar);
                                                    zzvpVar2 = this.zzD;
                                                    if (zzvpVar2 == null) {
                                                        this.zzD = zzvpVar;
                                                    } else {
                                                        this.zzD = zzvpVar2.zza(zzvpVar);
                                                    }
                                                    if (Zzah.isEmpty()) {
                                                        throw this.zzD;
                                                    }
                                                    r12 = Zzah;
                                                    mediaCrypto = null;
                                                    r11 = r10;
                                                    zzvVar5 = zzvVar2;
                                                }
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            zzvVar3 = zzvVar5;
                                        }
                                    } catch (Exception e16) {
                                        e = e16;
                                        zzvVar2 = zzvVar5;
                                        Zzah = r12;
                                    }
                                    r12 = Zzah;
                                    mediaCrypto = null;
                                    r11 = r10;
                                    zzvVar5 = zzvVar2;
                                } else {
                                    r19 = r12;
                                }
                                StringBuilder sb3 = new StringBuilder(str2.length() + 12);
                                sb3.append("createCodec:");
                                sb3.append(str2);
                                Trace.beginSection(sb3.toString());
                                zzvj zzvjVarZzc2 = this.zzd.zzc(Zzah);
                                this.zzx = zzvjVarZzc2;
                                r10 = 0;
                                this.zzM = zzvjVarZzc2.zzm(new zzvr(this, null));
                                Trace.endSection();
                                jZzb = zzM().zzb();
                                if (r13.zzc(this.zzc, zzvVar6)) {
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = zzv.zze(zzvVar6);
                                    objArr2[1] = str2;
                                    String str7 = zzfl.zza;
                                    zzeg.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr2));
                                    this.zzB = fZzak;
                                    this.zzy = zzvVar6;
                                    if (r13 <= 25) {
                                        i10 = 0;
                                    } else {
                                        i10 = 0;
                                    }
                                    this.zzF = i10;
                                    if (r13 == 29) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    this.zzG = z10;
                                    this.zzH = false;
                                    String str8 = r13.zza;
                                    if (r13 > 25) {
                                        if (r13 > 29) {
                                        }
                                    } else if (r13 > 29) {
                                    }
                                    this.zzK = z11;
                                    this.zzx.getClass();
                                    if (zze() == 2) {
                                        this.zzN = zzM().zzb() + 1000;
                                    }
                                    r10 = 1;
                                    r10 = 1;
                                    r10 = 1;
                                    this.zza.zza++;
                                    long j12 = jZzb - jZzb2;
                                    if (r13 >= 31) {
                                        zzvj zzvjVar3 = this.zzx;
                                        zzvjVar3.getClass();
                                        zzvjVar3.zzr(new ArrayList(this.zzap));
                                    }
                                    r13 = r13;
                                    Zzah = r18;
                                    zzal(str2, Zzah, jZzb, j12);
                                } else {
                                    this.zzB = fZzak;
                                    this.zzy = zzvVar6;
                                    if (r13 <= 25) {
                                        i10 = 0;
                                    } else {
                                        i10 = 0;
                                    }
                                    this.zzF = i10;
                                    if (r13 == 29) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    this.zzG = z10;
                                    this.zzH = false;
                                    String str9 = r13.zza;
                                    if (r13 > 25) {
                                        if (r13 > 29) {
                                        }
                                    } else if (r13 > 29) {
                                    }
                                    this.zzK = z11;
                                    this.zzx.getClass();
                                    if (zze() == 2) {
                                        this.zzN = zzM().zzb() + 1000;
                                    }
                                    r10 = 1;
                                    r10 = 1;
                                    r10 = 1;
                                    this.zza.zza++;
                                    long j13 = jZzb - jZzb2;
                                    if (r13 >= 31) {
                                        zzvj zzvjVar4 = this.zzx;
                                        zzvjVar4.getClass();
                                        zzvjVar4.zzr(new ArrayList(this.zzap));
                                    }
                                    r13 = r13;
                                    Zzah = r18;
                                    zzal(str2, Zzah, jZzb, j13);
                                }
                            } catch (Throwable th) {
                                r13 = r13;
                                Zzah = r18;
                                r10 = 1;
                                Trace.endSection();
                                throw th;
                            }
                            zzvVar2 = zzvVar5;
                            r10 = zzvVar5;
                            r18 = r19;
                        } catch (Exception e17) {
                            e = e17;
                            Zzah = r12;
                            zzvVar2 = zzvVar5;
                        }
                    } catch (Exception e18) {
                        e = e18;
                        r13 = r13;
                        zzvVar2 = zzvVar5;
                        r10 = r11;
                        Zzah = r12;
                    }
                    r12 = Zzah;
                    mediaCrypto = null;
                    r11 = r10;
                    zzvVar5 = zzvVar2;
                }
                this.zzC = mediaCrypto;
            } catch (zzvp e19) {
                e = e19;
                throw zzP(e, zzvVar, false, 4001);
            }
        } catch (zzvp e20) {
            e = e20;
            throw zzP(e, zzvVar, false, 4001);
        }
    }

    protected final boolean zzaF(zzv zzvVar) {
        return this.zzr == null && zzag(zzvVar);
    }

    protected boolean zzaG(zzvm zzvmVar) {
        return true;
    }

    protected final boolean zzaH() {
        return this.zzT;
    }

    protected final zzvj zzaI() {
        return this.zzx;
    }

    protected final zzv zzaJ() {
        return this.zzy;
    }

    protected final MediaFormat zzaK() {
        return this.zzz;
    }

    protected final zzvm zzaL() {
        return this.zzE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzaM() {
        try {
            zzvj zzvjVar = this.zzx;
            if (zzvjVar != null) {
                zzvjVar.zzl();
                this.zza.zzb++;
                zzvm zzvmVar = this.zzE;
                zzvmVar.getClass();
                zzam(zzvmVar.zza);
            }
        } finally {
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaS();
        }
    }

    protected final boolean zzaN() throws zzjk {
        boolean zZzax = zzax();
        if (zZzax) {
            zzaE();
        }
        return zZzax;
    }

    protected boolean zzaO() {
        int i10 = this.zzZ;
        if (i10 == 3 || ((this.zzG && !this.zzac) || (this.zzH && this.zzab))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            zzbu();
            return false;
        } catch (zzjk e10) {
            zzeg.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    protected boolean zzaP() {
        return true;
    }

    protected final long zzaQ() {
        return this.zzam;
    }

    protected void zzaR() {
        zzbm();
        zzbn();
        zzaz();
        this.zzN = -9223372036854775807L;
        this.zzab = false;
        this.zzL = -9223372036854775807L;
        this.zzaa = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzY = 0;
        this.zzZ = 0;
        this.zzX = this.zzW ? 1 : 0;
        this.zzal = false;
        this.zzam = 0L;
    }

    protected final void zzaS() {
        zzaR();
        this.zzC = null;
        this.zzE = null;
        this.zzy = null;
        this.zzz = null;
        this.zzA = false;
        this.zzac = false;
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzM = false;
        this.zzW = false;
        this.zzX = 0;
    }

    protected zzvl zzaT(Throwable th, zzvm zzvmVar) {
        return new zzvl(th, zzvmVar);
    }

    protected boolean zzaU(zzv zzvVar) throws zzjk {
        return true;
    }

    protected int zzaW(zziv zzivVar) {
        return 0;
    }

    protected boolean zzaX(zziv zzivVar) {
        return false;
    }

    protected final long zzaY() {
        return this.zzai;
    }

    protected void zzaZ(long j10) {
        this.zzai = j10;
        while (true) {
            ArrayDeque arrayDeque = this.zzl;
            if (arrayDeque.isEmpty() || j10 < ((zzvs) arrayDeque.peek()).zzb) {
                return;
            }
            zzvs zzvsVar = (zzvs) arrayDeque.poll();
            zzvsVar.getClass();
            zzbs(zzvsVar);
            zzar();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public boolean zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public boolean zzab() {
        return this.zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final int zzad(zzv zzvVar) throws zzjk {
        try {
            return zzae(this.zze, zzvVar);
        } catch (zzvx e10) {
            throw zzP(e10, zzvVar, false, 4002);
        }
    }

    protected abstract int zzae(zzvv zzvvVar, zzv zzvVar) throws zzvx;

    protected abstract List zzaf(zzvv zzvvVar, zzv zzvVar, boolean z10) throws zzvx;

    protected boolean zzag(zzv zzvVar) {
        return false;
    }

    protected abstract zzvg zzah(zzvm zzvmVar, zzv zzvVar, MediaCrypto mediaCrypto, float f10);

    protected zzjc zzai(zzvm zzvmVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    protected long zzaj(long j10, long j11, boolean z10) {
        return super.zzV(j10, j11);
    }

    protected float zzak(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    protected void zzal(String str, zzvg zzvgVar, long j10, long j11) {
        throw null;
    }

    protected void zzam(String str) {
        throw null;
    }

    protected void zzan(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    protected zzjc zzao(zzlw zzlwVar) throws zzjk {
        int i10;
        boolean z10 = true;
        this.zzag = true;
        zzv zzvVarZzO = zzlwVar.zzb;
        zzvVarZzO.getClass();
        String str = zzvVarZzO.zzp;
        if (str == null) {
            throw zzP(new IllegalArgumentException("Sample MIME type is null."), zzvVarZzO, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9") || (str.equals("video/dolby-vision") && Objects.equals(zzwf.zzg(zzvVarZzO), "video/av01"))) && !zzvVarZzO.zzs.isEmpty()) {
            zzt zztVarZza = zzvVarZzO.zza();
            zztVarZza.zzr(null);
            zzvVarZzO = zztVarZza.zzO();
        }
        zzv zzvVar = zzvVarZzO;
        zzug zzugVar = zzlwVar.zza;
        this.zzr = zzugVar;
        this.zzo = zzvVar;
        if (this.zzT) {
            this.zzV = true;
            return null;
        }
        zzvj zzvjVar = this.zzx;
        if (zzvjVar == null) {
            this.zzC = null;
            zzaE();
            return null;
        }
        zzvm zzvmVar = this.zzE;
        zzvmVar.getClass();
        zzv zzvVar2 = this.zzy;
        zzvVar2.getClass();
        zzug zzugVar2 = this.zzq;
        if (zzugVar2 != zzugVar) {
            zzbq();
            return new zzjc(zzvmVar.zza, zzvVar2, zzvVar, 0, 128);
        }
        zzjc zzjcVarZzai = zzai(zzvmVar, zzvVar2, zzvVar);
        int i11 = zzjcVarZzai.zzd;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (zzbo(zzvVar)) {
                        this.zzy = zzvVar;
                        if (zzugVar != zzugVar2 && !zzbp()) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 16;
                    }
                } else if (zzbo(zzvVar)) {
                    this.zzW = true;
                    this.zzX = 1;
                    int i12 = this.zzF;
                    if (i12 != 2 && (i12 != 1 || zzvVar.zzw != zzvVar2.zzw || zzvVar.zzx != zzvVar2.zzx)) {
                        z10 = false;
                    }
                    this.zzI = z10;
                    this.zzy = zzvVar;
                    if (zzugVar != zzugVar2 && !zzbp()) {
                        i10 = 2;
                    }
                } else {
                    i10 = 16;
                }
            } else if (zzbo(zzvVar)) {
                this.zzy = zzvVar;
                if (zzugVar != zzugVar2) {
                    if (!zzbp()) {
                        i10 = 2;
                    }
                } else if (this.zzaa) {
                    this.zzY = 1;
                    if (this.zzH) {
                        this.zzZ = 3;
                        i10 = 2;
                    } else {
                        this.zzZ = 1;
                    }
                }
            } else {
                i10 = 16;
            }
            return (i11 != 0 || (this.zzx == zzvjVar && this.zzZ != 3)) ? zzjcVarZzai : new zzjc(zzvmVar.zza, zzvVar2, zzvVar, 0, i10);
        }
        zzbq();
        i10 = 0;
        if (i11 != 0) {
        }
    }

    protected void zzap(zzv zzvVar, MediaFormat mediaFormat) throws zzjk {
        throw null;
    }

    protected abstract boolean zzas(long j10, long j11, zzvj zzvjVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) throws zzjk;

    protected abstract void zzat(zziz zzizVar);

    protected void zzau() throws zzjk {
        throw null;
    }

    protected void zzav(zziv zzivVar) throws zzjk {
        throw null;
    }

    protected final boolean zzba() {
        if (this.zzo == null) {
            return false;
        }
        if (zzS() || zzaC()) {
            return true;
        }
        return this.zzN != -9223372036854775807L && zzM().zzb() < this.zzN;
    }

    protected final float zzbb() {
        return this.zzv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzmz zzbc() {
        return this.zzs;
    }

    protected final boolean zzbd() throws zzjk {
        return zzbo(this.zzy);
    }

    protected final long zzbe() {
        return this.zzah.zzf;
    }

    protected final long zzbf() {
        return this.zzad;
    }

    protected final long zzbg() {
        return this.zzah.zzd;
    }

    protected final long zzbh() {
        return this.zzah.zzc;
    }

    protected final void zzbi(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.zzan.zzb(mediaFormat);
        }
    }

    final /* synthetic */ void zzbk(zzlw zzlwVar) {
        this.zzn.set(zzQ(zzlwVar, this.zzh, 0));
    }

    final /* synthetic */ zzmz zzbl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zznc
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzmv
    public void zzx(int i10, Object obj) throws zzjk {
        if (i10 != 11) {
            return;
        }
        zzmz zzmzVar = (zzmz) obj;
        zzmzVar.getClass();
        this.zzs = zzmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzy(boolean z10, boolean z11) throws zzjk {
        this.zza = new zzjb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r7 >= r5) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void zzz(com.google.android.gms.internal.ads.zzv[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzxk r18) throws com.google.android.gms.internal.ads.zzjk {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zzvs r1 = r0.zzah
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L27
            com.google.android.gms.internal.ads.zzvs r1 = new com.google.android.gms.internal.ads.zzvs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzbs(r1)
            boolean r1 = r0.zzak
            if (r1 == 0) goto L5b
            r12.zzar()
            return
        L27:
            java.util.ArrayDeque r1 = r0.zzl
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L5c
            long r5 = r0.zzad
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L3f
            long r7 = r0.zzai
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L5c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L5c
        L3f:
            com.google.android.gms.internal.ads.zzvs r1 = new com.google.android.gms.internal.ads.zzvs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzbs(r1)
            com.google.android.gms.internal.ads.zzvs r1 = r0.zzah
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L5b
            r12.zzar()
        L5b:
            return
        L5c:
            com.google.android.gms.internal.ads.zzvs r9 = new com.google.android.gms.internal.ads.zzvs
            long r3 = r0.zzad
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvt.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzxk):void");
    }

    protected void zzar() {
    }

    protected void zzaV(zziv zzivVar) throws zzjk {
    }
}
