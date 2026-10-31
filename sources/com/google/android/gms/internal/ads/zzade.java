package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdError;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import k9.dW.xjwcmjDeOXR;
import pb.vBC.NyXuoef;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzade extends zzvt implements zzadt {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private long zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private zznh zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private int zzJ;
    private long zzK;
    private zzbv zzL;
    private zzbv zzM;
    private int zzN;
    private int zzO;
    private zzadr zzP;
    private long zzQ;
    private long zzR;
    private boolean zzS;
    private int zzT;
    private final Context zze;
    private final boolean zzf;
    private final zzaeo zzg;
    private final boolean zzh;
    private final zzadu zzi;
    private final zzads zzj;
    private final zzacn zzk;
    private final long zzl;
    private final zzadv zzm;
    private final PriorityQueue zzn;
    private zzadd zzo;
    private boolean zzp;
    private boolean zzq;
    private zzaeu zzr;
    private boolean zzs;
    private int zzt;
    private List zzu;
    private Surface zzv;
    private zzadg zzw;
    private zzeu zzx;
    private boolean zzy;
    private int zzz;

    protected zzade(zzadc zzadcVar) {
        super(zzadcVar.zze().getApplicationContext(), 2, zzadcVar.zzg(), zzadcVar.zzf(), false, 30.0f);
        Context applicationContext = zzadcVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzr = null;
        this.zzg = new zzaeo(zzadcVar.zzh(), zzadcVar.zzi());
        this.zzf = this.zzr == null;
        this.zzi = new zzadu(applicationContext, this, 0L);
        this.zzj = new zzads();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzx = zzeu.zza;
        this.zzz = 1;
        this.zzA = 0;
        this.zzL = zzbv.zza;
        this.zzO = 0;
        this.zzM = null;
        this.zzN = -1000;
        this.zzQ = -9223372036854775807L;
        this.zzR = -9223372036854775807L;
        this.zzk = new zzacn();
        this.zzn = new PriorityQueue();
        this.zzl = -15000L;
        this.zzm = new zzadv(1.0f);
        this.zzF = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public static int zzaw(zzvm zzvmVar, zzv zzvVar) {
        int i10 = zzvVar.zzw;
        int i11 = zzvVar.zzx;
        if (i10 != -1 && i11 != -1) {
            String str = zzvVar.zzp;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairZze = zzdq.zze(zzvVar);
                if (pairZze == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairZze.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            int i12 = 4;
            switch (str) {
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/av01":
                case "video/x-vnd.on2.vp8":
                    return ((i10 * i11) * 3) / i12;
                case "video/hevc":
                    return Math.max(2097152, ((i10 * i11) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zzvmVar.zzf)))) {
                        String str3 = zzfl.zza;
                        return ((((i10 + 15) / 16) * ((i11 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    i12 = 8;
                    return ((i10 * i11) * 3) / i12;
            }
        }
        return -1;
    }

    private final void zzbA() {
        zzadg zzadgVar = this.zzw;
        if (zzadgVar != null) {
            zzadgVar.release();
            this.zzw = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzbB, reason: merged with bridge method [inline-methods] */
    public final void zzbo() {
        this.zzg.zzg(this.zzv);
        this.zzy = true;
    }

    private final void zzbC() {
        zzbv zzbvVar = this.zzM;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    protected static int zzbm(zzvm zzvmVar, zzv zzvVar) {
        int i10 = zzvVar.zzq;
        if (i10 == -1) {
            return zzaw(zzvmVar, zzvVar);
        }
        List list = zzvVar.zzs;
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return i10 + length;
    }

    protected static final boolean zzbr(zzvm zzvmVar) {
        return Build.VERSION.SDK_INT >= 35 && zzvmVar.zzh;
    }

    private static List zzbs(Context context, zzvv zzvvVar, zzv zzvVar, boolean z10, boolean z11) throws zzvx {
        String str = zzvVar.zzp;
        if (str == null) {
            return zzgwm.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadb.zza(context)) {
            List listZzd = zzwf.zzd(zzvvVar, zzvVar, z10, z11);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzwf.zzc(zzvvVar, zzvVar, z10, z11);
    }

    private final void zzbt(zzxk zzxkVar) {
        int iZze;
        zzbf zzbfVarZzN = zzN();
        if (zzbfVarZzN.zzg() || (iZze = zzbfVarZzN.zze(zzxkVar.zza)) == -1) {
            this.zzR = -9223372036854775807L;
        } else {
            this.zzR = zzbfVarZzN.zzd(iZze, new zzbd(), false).zzd;
        }
    }

    private final void zzbu(Object obj) throws zzjk {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzv == surface) {
            if (surface != null) {
                zzbC();
                Surface surface2 = this.zzv;
                if (surface2 == null || !this.zzy) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzv = surface;
        if (this.zzr == null) {
            this.zzi.zzd(surface);
        }
        this.zzy = false;
        int iZze = zze();
        zzvj zzvjVarZzaI = zzaI();
        if (zzvjVarZzaI != null && this.zzr == null) {
            zzvm zzvmVarZzaL = zzaL();
            zzvmVarZzaL.getClass();
            if (!zzby(zzvmVarZzaL) || this.zzp) {
                zzaM();
                zzaE();
            } else {
                Surface surfaceZzbz = zzbz(zzvmVarZzaL);
                if (surfaceZzbz != null) {
                    zzvjVarZzaI.zzn(surfaceZzbz);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzvjVarZzaI.zzo();
                }
            }
        }
        if (surface != null) {
            zzbC();
        } else {
            this.zzM = null;
            zzaeu zzaeuVar = this.zzr;
            if (zzaeuVar != null) {
                zzaeuVar.zzq();
            }
        }
        if (iZze == 2) {
            zzaeu zzaeuVar2 = this.zzr;
            if (zzaeuVar2 != null) {
                zzaeuVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbv(zziv zzivVar) {
        if (zzcW() || zzivVar.zzd() || this.zzR == -9223372036854775807L) {
            return true;
        }
        return this.zzR - (zzivVar.zze - zzbg()) <= 100000;
    }

    private final boolean zzbw(zziv zzivVar) {
        return zzivVar.zze < zzH();
    }

    private final void zzbx(long j10, long j11, zzv zzvVar) {
        zzadr zzadrVar = this.zzP;
        if (zzadrVar != null) {
            zzadrVar.zzcS(j10, j11, zzvVar, zzaK());
        }
    }

    private final boolean zzby(zzvm zzvmVar) {
        if (this.zzr != null) {
            return true;
        }
        Surface surface = this.zzv;
        return (surface != null && surface.isValid()) || zzbr(zzvmVar) || zzaC(zzvmVar);
    }

    private final Surface zzbz(zzvm zzvmVar) {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            return zzaeuVar.zzk();
        }
        Surface surface = this.zzv;
        if (surface != null) {
            return surface;
        }
        if (zzbr(zzvmVar)) {
            return null;
        }
        zzgtj.zzi(zzaC(zzvmVar));
        zzadg zzadgVar = this.zzw;
        if (zzadgVar != null) {
            if (zzadgVar.zza != zzvmVar.zzf) {
                zzbA();
            }
        }
        if (this.zzw == null) {
            this.zzw = zzadg.zzb(this.zze, zzvmVar.zzf);
        }
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzA(long j10, boolean z10, boolean z11) throws zzjk {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null && !z10) {
            zzaeuVar.zzg(true);
        }
        if (z11) {
            this.zzG = j10;
        }
        super.zzA(j10, z10, z11);
        if (this.zzr == null) {
            this.zzi.zzl();
        }
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
        if (z10) {
            zzaeu zzaeuVar2 = this.zzr;
            if (zzaeuVar2 != null) {
                zzaeuVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzD = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzB() {
        this.zzC = 0;
        this.zzB = zzM().zzb();
        this.zzI = 0L;
        this.zzJ = 0;
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzC() {
        if (this.zzC > 0) {
            long jZzb = zzM().zzb();
            this.zzg.zzd(this.zzC, jZzb - this.zzB);
            this.zzC = 0;
            this.zzB = jZzb;
        }
        int i10 = this.zzJ;
        if (i10 != 0) {
            this.zzg.zze(this.zzI, i10);
            this.zzI = 0L;
            this.zzJ = 0;
        }
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzb();
        } else {
            this.zzi.zzc();
        }
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzD() {
        this.zzM = null;
        this.zzR = -9223372036854775807L;
        this.zzy = false;
        this.zzH = true;
        try {
            super.zzD();
        } finally {
            zzaeo zzaeoVar = this.zzg;
            zzaeoVar.zzi(((zzvt) this).zza);
            zzaeoVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzs = false;
            this.zzQ = -9223372036854775807L;
            zzbA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzF() {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null || !this.zzf) {
            return;
        }
        zzaeuVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzG(zzbf zzbfVar) {
        zzxk zzxkVarZzO = zzO();
        if (zzxkVarZzO != null) {
            zzbt(zzxkVarZzO);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna, com.google.android.gms.internal.ads.zznc
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final boolean zzW(long j10) {
        if (zzbf() == -9223372036854775807L || j10 < this.zzG) {
            return false;
        }
        long jZzaY = zzaY();
        return jZzaY == -9223372036854775807L || j10 > jZzaY;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final void zzX(float f10, float f11) throws zzjk {
        super.zzX(f10, f11);
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzm(f10);
        } else {
            this.zzi.zzn(f10);
        }
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzc(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzY() {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null) {
            this.zzi.zzh();
            return;
        }
        int i10 = this.zzt;
        if (i10 == 0 || i10 == 1) {
            this.zzt = 0;
        } else {
            zzaeuVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final void zzZ(long j10, long j11) throws zzjk {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            try {
                zzaeuVar.zzv(j10, j11);
            } catch (zzaet e10) {
                throw zzP(e10, e10.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.zzZ(j10, j11);
    }

    protected final void zzaA(long j10) {
        zzjb zzjbVar = ((zzvt) this).zza;
        zzjbVar.zzk += j10;
        zzjbVar.zzl++;
        this.zzI += j10;
        this.zzJ++;
    }

    protected final void zzaB(zzvj zzvjVar, int i10, long j10, long j11) {
        Trace.beginSection("releaseOutputBuffer");
        zzvjVar.zzd(i10, j11);
        Trace.endSection();
        ((zzvt) this).zza.zze++;
        this.zzD = 0;
        if (this.zzr == null) {
            zzbv zzbvVar = this.zzL;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzM)) {
                this.zzM = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzv == null) {
                return;
            }
            zzbo();
        }
    }

    protected final boolean zzaC(zzvm zzvmVar) {
        if (zzbq(zzvmVar.zza)) {
            return false;
        }
        return !zzvmVar.zzf || zzadg.zza(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaG(zzvm zzvmVar) {
        return zzby(zzvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaO() {
        zzvm zzvmVarZzaL = zzaL();
        if (this.zzr != null && zzvmVarZzaL != null) {
            String str = zzvmVarZzaL.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaO();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaP() {
        boolean z10;
        zzv zzvVarZzaJ = zzaJ();
        long j10 = this.zzR;
        if (j10 != -9223372036854775807L) {
            if (zzaQ() + j10 + 1 > Long.MAX_VALUE - (zzbg() + this.zzR)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        return this.zzF == null || this.zzH || (zzvVarZzaJ != null && zzvVarZzaJ.zzr > 0) || z10 || zzbe() != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzaR() {
        super.zzaR();
        this.zzn.clear();
        this.zzE = 0;
        this.zzT = 0;
        this.zzH = false;
        zzacn zzacnVar = this.zzk;
        if (zzacnVar != null) {
            zzacnVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzvl zzaT(Throwable th, zzvm zzvmVar) {
        return new zzacy(th, zzvmVar, this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaU(zzv zzvVar) throws zzjk {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null || zzaeuVar.zze()) {
            return true;
        }
        try {
            zzaeuVar.zzd(zzvVar);
            return true;
        } catch (zzaet e10) {
            throw zzP(e10, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzaV(zziv zzivVar) throws zzjk {
        ByteBuffer byteBuffer;
        zzacn zzacnVar = this.zzk;
        if (zzacnVar != null) {
            zzvm zzvmVarZzaL = zzaL();
            zzvmVarZzaL.getClass();
            if (zzvmVarZzaL.zzb.equals("video/av01") && zzivVar.zzc() && (byteBuffer = zzivVar.zzc) != null) {
                zzacnVar.zzb(byteBuffer);
            }
        }
        this.zzT = 0;
        int iZzaW = zzaW(zzivVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaW & 32) == 0) {
            this.zzE++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final int zzaW(zziv zzivVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzF == null || !zzbw(zzivVar) || zzbv(zzivVar)) ? 0 : 32;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:46:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaX(zziv zzivVar) {
        boolean z10;
        ByteBuffer byteBuffer;
        boolean z11 = false;
        if (zzbv(zzivVar)) {
            return false;
        }
        boolean zZzbw = zzbw(zzivVar);
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            long jZzb = zzadvVar.zzb(zzivVar.zze);
            if (jZzb == -9223372036854775807L || jZzb >= this.zzl) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if ((!zZzbw && !z10) || zzivVar.zze()) {
            return false;
        }
        if (!zzivVar.zzf()) {
            zzacn zzacnVar = this.zzk;
            if (zzacnVar != null) {
                zzvm zzvmVarZzaL = zzaL();
                zzvmVarZzaL.getClass();
                if (zzvmVarZzaL.zzb.equals("video/av01") && (byteBuffer = zzivVar.zzc) != null) {
                    boolean z12 = zZzbw || this.zzT <= 0;
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    byteBufferAsReadOnlyBuffer.flip();
                    int iZza = zzacnVar.zza(byteBufferAsReadOnlyBuffer, z12);
                    if (iZza == 0) {
                        zzivVar.zza();
                    } else if (iZza != byteBufferAsReadOnlyBuffer.limit()) {
                        zzadd zzaddVar = this.zzo;
                        zzaddVar.getClass();
                        if (zzaddVar.zzc + iZza < byteBufferAsReadOnlyBuffer.capacity() && !zzivVar.zzk()) {
                            ByteBuffer byteBuffer2 = zzivVar.zzc;
                            byteBuffer2.getClass();
                            byteBuffer2.position(iZza);
                        }
                    }
                }
            }
            if (z11) {
                if (zZzbw) {
                    ((zzvt) this).zza.zzd++;
                } else {
                    this.zzn.add(Long.valueOf(zzivVar.zze));
                    this.zzT++;
                }
            }
            return z11;
        }
        zzivVar.zza();
        z11 = true;
        if (z11) {
            if (zZzbw) {
                ((zzvt) this).zza.zzd++;
            } else {
                this.zzn.add(Long.valueOf(zzivVar.zze));
                this.zzT++;
            }
        }
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzaZ(long j10) {
        super.zzaZ(j10);
        this.zzE--;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final boolean zzaa() {
        boolean zZzba = zzba();
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            return zzaeuVar.zzh(zZzba);
        }
        if (zZzba && zzaI() == null) {
            return true;
        }
        return this.zzi.zzi(zZzba);
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final boolean zzab() {
        if (!super.zzab()) {
            return false;
        }
        zzaeu zzaeuVar = this.zzr;
        return zzaeuVar == null || zzaeuVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final int zzae(zzvv zzvvVar, zzv zzvVar) throws zzvx {
        boolean z10;
        String str = zzvVar.zzp;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i10 = 0;
        boolean z11 = zzvVar.zzt != null;
        List listZzbs = zzbs(context, zzvvVar, zzvVar, z11, false);
        if (z11 && listZzbs.isEmpty()) {
            listZzbs = zzbs(context, zzvvVar, zzvVar, false, false);
        }
        if (listZzbs.isEmpty()) {
            return Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE;
        }
        if (!zzvt.zzbj(zzvVar)) {
            return Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE;
        }
        zzvm zzvmVar = (zzvm) listZzbs.get(0);
        boolean zZzc = zzvmVar.zzc(context, zzvVar);
        if (!zZzc) {
            int i11 = 1;
            while (true) {
                if (i11 >= listZzbs.size()) {
                    z10 = true;
                    break;
                }
                zzvm zzvmVar2 = (zzvm) listZzbs.get(i11);
                if (zzvmVar2.zzc(context, zzvVar)) {
                    zZzc = true;
                    z10 = false;
                    zzvmVar = zzvmVar2;
                    break;
                }
                i11++;
            }
        } else {
            z10 = true;
            break;
        }
        int i12 = true != zZzc ? 3 : 4;
        int i13 = true != zzvmVar.zze(zzvVar) ? 8 : 16;
        int i14 = true != zzvmVar.zzg ? 0 : 64;
        int i15 = true != z10 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadb.zza(context)) {
            i15 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (zZzc) {
            List listZzbs2 = zzbs(context, zzvvVar, zzvVar, z11, true);
            if (!listZzbs2.isEmpty()) {
                zzvm zzvmVar3 = (zzvm) zzwf.zze(context, listZzbs2, zzvVar).get(0);
                if (zzvmVar3.zzc(context, zzvVar) && zzvmVar3.zze(zzvVar)) {
                    i10 = 32;
                }
            }
        }
        return i15 | i12 | i13 | i10 | i14;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final List zzaf(zzvv zzvvVar, zzv zzvVar, boolean z10) throws zzvx {
        Context context = this.zze;
        return zzwf.zze(context, zzbs(context, zzvvVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzjc zzai(zzvm zzvmVar, zzv zzvVar, zzv zzvVar2) {
        int i10;
        int i11;
        int i12;
        zzjc zzjcVarZzf = zzvmVar.zzf(zzvVar, zzvVar2);
        int i13 = zzjcVarZzf.zze;
        zzadd zzaddVar = this.zzo;
        zzaddVar.getClass();
        if (zzvVar2.zzw > zzaddVar.zza || zzvVar2.zzx > zzaddVar.zzb) {
            i13 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (zzbm(zzvmVar, zzvVar2) > zzaddVar.zzc) {
            i13 |= 64;
        }
        if (this.zzA != Integer.MIN_VALUE) {
            float f10 = zzvVar.zzA;
            if (f10 != -1.0f) {
                float f11 = zzvVar2.zzA;
                if (f11 != -1.0f && Math.abs(f11 - f10) > 1.0f && ((i12 = Build.VERSION.SDK_INT) < 30 || (i12 == 30 && Build.MODEL.startsWith("MiTV")))) {
                    i13 |= NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                }
            }
        }
        String str = zzvmVar.zza;
        if (i13 != 0) {
            i11 = i13;
            i10 = 0;
        } else {
            i10 = zzjcVarZzf.zzd;
            i11 = 0;
        }
        return new zzjc(str, zzvVar, zzvVar2, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final float zzak(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        zzvm zzvmVarZzaL;
        float fMax = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f11 = zzvVar2.zzA;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.zzF == null || (zzvmVarZzaL = zzaL()) == null) {
            return f12;
        }
        float fZzh = zzvmVarZzaL.zzh(zzvVar.zzw, zzvVar.zzx);
        return f12 != -1.0f ? Math.max(f12, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzal(String str, zzvg zzvgVar, long j10, long j11) {
        this.zzg.zzb(str, j10, j11);
        this.zzp = zzbq(str);
        zzvm zzvmVarZzaL = zzaL();
        zzvmVarZzaL.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzvmVarZzaL.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzvmVarZzaL.zzb()) {
                if (codecProfileLevel.profile == 16384) {
                    z10 = true;
                    break;
                }
            }
        }
        this.zzq = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzam(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzan(Exception exc) {
        zzeg.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzjc zzao(zzlw zzlwVar) throws zzjk {
        zzjc zzjcVarZzao = super.zzao(zzlwVar);
        zzv zzvVar = zzlwVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzjcVarZzao);
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
        return zzjcVarZzao;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzap(zzv zzvVar, MediaFormat mediaFormat) {
        zzvj zzvjVarZzaI = zzaI();
        if (zzvjVarZzaI != null) {
            zzvjVarZzaI.zzq(this.zzz);
        }
        mediaFormat.getClass();
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        int integer2 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        float f10 = zzvVar.zzC;
        int i10 = zzvVar.zzB;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.zzL = new zzbv(integer, integer2, f10);
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null || !this.zzS) {
            this.zzi.zze(zzvVar.zzA);
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzv(integer);
            zztVarZza.zzw(integer2);
            zztVarZza.zzB(f10);
            zzv zzvVarZzO = zztVarZza.zzO();
            int i12 = this.zzt;
            List listZzi = this.zzu;
            if (listZzi == null) {
                listZzi = zzgwm.zzi();
            }
            zzaeuVar.zzs(1, zzvVarZzO, zzbh(), i12, listZzi);
            this.zzt = 2;
        }
        this.zzS = false;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzaq(long j10, long j11, long j12, boolean z10, boolean z11) throws zzjk {
        int iZzR;
        if (this.zzr != null && this.zzf) {
            j11 -= -this.zzQ;
        }
        if (j10 >= -500000 || z10 || (iZzR = zzR(j11)) == 0) {
            return false;
        }
        this.zzG = j11;
        if (z11) {
            zzjb zzjbVar = ((zzvt) this).zza;
            int i10 = zzjbVar.zzd + iZzR;
            zzjbVar.zzd = i10;
            zzjbVar.zzf += this.zzE;
            zzjbVar.zzd = i10 + this.zzn.size();
        } else {
            ((zzvt) this).zza.zzj++;
            zzaz(iZzR + this.zzn.size(), this.zzE);
        }
        zzaN();
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzar() {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzi();
            long jZzbh = this.zzQ;
            if (jZzbh == -9223372036854775807L) {
                jZzbh = zzbh();
                this.zzQ = jZzbh;
            }
            this.zzr.zzo(-jZzbh);
        } else {
            this.zzi.zza(2);
        }
        this.zzS = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzas(long j10, long j11, zzvj zzvjVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) throws zzjk {
        zzvjVar.getClass();
        long jZzbg = j12 - zzbg();
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzn;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j12) {
                break;
            }
            priorityQueue.poll();
            i13++;
        }
        zzaz(i13, 0);
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            if (!z10 || z11) {
                return zzaeuVar.zzu(j12, new zzada(this, zzvjVar, i10, jZzbg));
            }
            zzax(zzvjVar, i10, jZzbg);
            return true;
        }
        zzadu zzaduVar = this.zzi;
        long jZzbh = zzbh();
        zzads zzadsVar = this.zzj;
        int iZzk = zzaduVar.zzk(j12, j10, j11, jZzbh, z10, z11, zzadsVar);
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            if (iZzk == 5 || iZzk == 4) {
                return false;
            }
            zzadvVar.zza(j12, zzadsVar.zza());
        }
        if (iZzk == 0) {
            long jZzc = zzM().zzc();
            zzbx(jZzbg, jZzc, zzvVar);
            zzaB(zzvjVar, i10, jZzbg, jZzc);
            zzaA(zzadsVar.zza());
            return true;
        }
        if (iZzk != 1) {
            if (iZzk == 2) {
                zzay(zzvjVar, i10, jZzbg);
                zzaA(zzadsVar.zza());
                return true;
            }
            if (iZzk != 3) {
                return false;
            }
            zzax(zzvjVar, i10, jZzbg);
            zzaA(zzadsVar.zza());
            return true;
        }
        long jZzb = zzadsVar.zzb();
        long jZza = zzadsVar.zza();
        if (jZzb == this.zzK) {
            zzax(zzvjVar, i10, jZzbg);
        } else {
            zzbx(jZzbg, jZzb, zzvVar);
            zzaB(zzvjVar, i10, jZzbg, jZzb);
        }
        zzaA(jZza);
        this.zzK = jZzb;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzat(zziz zzizVar) {
        this.zzg.zzk(zzizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzau() {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzi();
        } else if (zzbe() != -9223372036854775807L) {
            zzbe();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzav(zziv zzivVar) throws zzjk {
        if (this.zzq) {
            ByteBuffer byteBuffer = zzivVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzvj zzvjVarZzaI = zzaI();
                        zzvjVarZzaI.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzvjVarZzaI.zzp(bundle);
                    }
                }
            }
        }
    }

    protected final void zzax(zzvj zzvjVar, int i10, long j10) {
        Trace.beginSection("skipVideoBuffer");
        zzvjVar.zzc(i10, false);
        Trace.endSection();
        ((zzvt) this).zza.zzf++;
    }

    protected final void zzay(zzvj zzvjVar, int i10, long j10) {
        Trace.beginSection("dropVideoBuffer");
        zzvjVar.zzc(i10, false);
        Trace.endSection();
        zzaz(0, 1);
    }

    protected final void zzaz(int i10, int i11) {
        zzjb zzjbVar = ((zzvt) this).zza;
        zzjbVar.zzh += i10;
        int i12 = i10 + i11;
        zzjbVar.zzg += i12;
        this.zzC += i12;
        int i13 = this.zzD + i12;
        this.zzD = i13;
        zzjbVar.zzi = Math.max(i13, zzjbVar.zzi);
    }

    final /* synthetic */ Surface zzbp() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzmv
    public final void zzx(int i10, Object obj) throws zzjk {
        if (i10 == 1) {
            zzbu(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            zzadr zzadrVar = (zzadr) obj;
            this.zzP = zzadrVar;
            zzaeu zzaeuVar = this.zzr;
            if (zzaeuVar != null) {
                zzaeuVar.zzl(zzadrVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzO != iIntValue) {
                this.zzO = iIntValue;
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzz = iIntValue2;
            zzvj zzvjVarZzaI = zzaI();
            if (zzvjVarZzaI != null) {
                zzvjVarZzaI.zzq(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzA = iIntValue3;
            zzaeu zzaeuVar2 = this.zzr;
            if (zzaeuVar2 != null) {
                zzaeuVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzaeu zzaeuVar3 = this.zzr;
                if (zzaeuVar3 == null || !zzaeuVar3.zze()) {
                    return;
                }
                zzaeuVar3.zzf();
                return;
            }
            this.zzu = list;
            zzaeu zzaeuVar4 = this.zzr;
            if (zzaeuVar4 != null) {
                zzaeuVar4.zzn(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            zzeu zzeuVar = (zzeu) obj;
            if (zzeuVar.zza() == 0 || zzeuVar.zzb() == 0) {
                return;
            }
            this.zzx = zzeuVar;
            zzaeu zzaeuVar5 = this.zzr;
            if (zzaeuVar5 != null) {
                Surface surface = this.zzv;
                surface.getClass();
                zzaeuVar5.zzp(surface, zzeuVar);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.zzN = ((Integer) obj).intValue();
                zzvj zzvjVarZzaI2 = zzaI();
                if (zzvjVarZzaI2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzN));
                    zzvjVarZzaI2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzv;
                zzbu(null);
                obj.getClass();
                ((zzade) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z10 = this.zzF != null;
                zznh zznhVar = (zznh) obj;
                this.zzF = zznhVar;
                if (z10 != (zznhVar != null)) {
                    zzbd();
                }
                break;
            default:
                super.zzx(i10, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzy(boolean z10, boolean z11) throws zzjk {
        super.zzy(z10, z11);
        zzK();
        this.zzg.zza(((zzvt) this).zza);
        if (!this.zzs) {
            if (this.zzu != null && this.zzr == null) {
                zzadi zzadiVar = new zzadi(this.zze, this.zzi);
                zzadiVar.zza(true);
                zzadiVar.zzc(-this.zzl);
                zzadiVar.zzb(zzM());
                zzadq zzadqVarZzd = zzadiVar.zzd();
                zzadqVarZzd.zza(1);
                this.zzr = zzadqVarZzd.zzb(0);
            }
            this.zzs = true;
        }
        int i10 = !z11 ? 1 : 0;
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null) {
            zzadu zzaduVar = this.zzi;
            zzaduVar.zzg(zzM());
            zzaduVar.zza(i10);
            return;
        }
        zzaeuVar.zzc(new zzacz(this), zzhcn.zza());
        zzadr zzadrVar = this.zzP;
        if (zzadrVar != null) {
            this.zzr.zzl(zzadrVar);
        }
        if (this.zzv != null && !this.zzx.equals(zzeu.zza)) {
            this.zzr.zzp(this.zzv, this.zzx);
        }
        this.zzr.zzr(this.zzA);
        this.zzr.zzm(zzbb());
        List list = this.zzu;
        if (list != null) {
            this.zzr.zzn(list);
        }
        this.zzt = i10;
        zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzz(zzv[] zzvVarArr, long j10, long j11, zzxk zzxkVar) throws zzjk {
        super.zzz(zzvVarArr, j10, j11, zzxkVar);
        zzbt(zzxkVar);
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:101:0x014a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0152  */
    /* JADX WARN: Code duplicated, block: B:104:0x0156  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0162  */
    /* JADX WARN: Code duplicated, block: B:109:0x016a  */
    /* JADX WARN: Code duplicated, block: B:110:0x016e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0176  */
    /* JADX WARN: Code duplicated, block: B:113:0x017a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0182  */
    /* JADX WARN: Code duplicated, block: B:116:0x0186  */
    /* JADX WARN: Code duplicated, block: B:118:0x018e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0192  */
    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:122:0x019e  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:125:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01be  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01da  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207  */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0213  */
    /* JADX WARN: Code duplicated, block: B:152:0x0217  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0223  */
    /* JADX WARN: Code duplicated, block: B:157:0x022b  */
    /* JADX WARN: Code duplicated, block: B:158:0x022f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0237  */
    /* JADX WARN: Code duplicated, block: B:161:0x023b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0243  */
    /* JADX WARN: Code duplicated, block: B:164:0x0247  */
    /* JADX WARN: Code duplicated, block: B:166:0x024f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0253  */
    /* JADX WARN: Code duplicated, block: B:169:0x025b  */
    /* JADX WARN: Code duplicated, block: B:170:0x025f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0267  */
    /* JADX WARN: Code duplicated, block: B:173:0x026b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0273  */
    /* JADX WARN: Code duplicated, block: B:176:0x0277  */
    /* JADX WARN: Code duplicated, block: B:178:0x027f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0283  */
    /* JADX WARN: Code duplicated, block: B:181:0x028b  */
    /* JADX WARN: Code duplicated, block: B:182:0x028f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0298  */
    /* JADX WARN: Code duplicated, block: B:185:0x029c  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:191:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:193:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:194:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:196:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:197:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:199:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:203:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:206:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:209:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:211:0x0303  */
    /* JADX WARN: Code duplicated, block: B:212:0x0307  */
    /* JADX WARN: Code duplicated, block: B:214:0x030f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0313  */
    /* JADX WARN: Code duplicated, block: B:217:0x031b  */
    /* JADX WARN: Code duplicated, block: B:218:0x031f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0327  */
    /* JADX WARN: Code duplicated, block: B:221:0x032b  */
    /* JADX WARN: Code duplicated, block: B:223:0x0333  */
    /* JADX WARN: Code duplicated, block: B:224:0x0337  */
    /* JADX WARN: Code duplicated, block: B:226:0x033f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0343  */
    /* JADX WARN: Code duplicated, block: B:229:0x034b  */
    /* JADX WARN: Code duplicated, block: B:230:0x034f  */
    /* JADX WARN: Code duplicated, block: B:232:0x0357  */
    /* JADX WARN: Code duplicated, block: B:233:0x035b  */
    /* JADX WARN: Code duplicated, block: B:235:0x0363  */
    /* JADX WARN: Code duplicated, block: B:236:0x0367  */
    /* JADX WARN: Code duplicated, block: B:238:0x036f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0373  */
    /* JADX WARN: Code duplicated, block: B:241:0x037b  */
    /* JADX WARN: Code duplicated, block: B:242:0x037f  */
    /* JADX WARN: Code duplicated, block: B:244:0x0387  */
    /* JADX WARN: Code duplicated, block: B:245:0x038b  */
    /* JADX WARN: Code duplicated, block: B:247:0x0393  */
    /* JADX WARN: Code duplicated, block: B:248:0x0397  */
    /* JADX WARN: Code duplicated, block: B:250:0x039f  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:253:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:256:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:257:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:259:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:262:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:263:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:265:0x03da  */
    /* JADX WARN: Code duplicated, block: B:266:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:271:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:272:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:274:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:275:0x0401  */
    /* JADX WARN: Code duplicated, block: B:277:0x0409  */
    /* JADX WARN: Code duplicated, block: B:278:0x040d  */
    /* JADX WARN: Code duplicated, block: B:280:0x0415  */
    /* JADX WARN: Code duplicated, block: B:281:0x0419  */
    /* JADX WARN: Code duplicated, block: B:283:0x0421  */
    /* JADX WARN: Code duplicated, block: B:284:0x0425  */
    /* JADX WARN: Code duplicated, block: B:286:0x042d  */
    /* JADX WARN: Code duplicated, block: B:287:0x0431  */
    /* JADX WARN: Code duplicated, block: B:289:0x0439  */
    /* JADX WARN: Code duplicated, block: B:290:0x043d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0445  */
    /* JADX WARN: Code duplicated, block: B:293:0x0449  */
    /* JADX WARN: Code duplicated, block: B:295:0x0451  */
    /* JADX WARN: Code duplicated, block: B:296:0x0455  */
    /* JADX WARN: Code duplicated, block: B:298:0x045d  */
    /* JADX WARN: Code duplicated, block: B:299:0x0461  */
    /* JADX WARN: Code duplicated, block: B:301:0x0469  */
    /* JADX WARN: Code duplicated, block: B:302:0x046d  */
    /* JADX WARN: Code duplicated, block: B:304:0x0475  */
    /* JADX WARN: Code duplicated, block: B:305:0x0479  */
    /* JADX WARN: Code duplicated, block: B:307:0x0481  */
    /* JADX WARN: Code duplicated, block: B:308:0x0485  */
    /* JADX WARN: Code duplicated, block: B:310:0x048d  */
    /* JADX WARN: Code duplicated, block: B:311:0x0491  */
    /* JADX WARN: Code duplicated, block: B:313:0x0499  */
    /* JADX WARN: Code duplicated, block: B:314:0x049c  */
    /* JADX WARN: Code duplicated, block: B:316:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:317:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:319:0x04af  */
    /* JADX WARN: Code duplicated, block: B:320:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:322:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:323:0x04be  */
    /* JADX WARN: Code duplicated, block: B:326:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:328:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:329:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:331:0x04db  */
    /* JADX WARN: Code duplicated, block: B:332:0x04de  */
    /* JADX WARN: Code duplicated, block: B:334:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:335:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:337:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:338:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:340:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:341:0x0502  */
    /* JADX WARN: Code duplicated, block: B:343:0x050a  */
    /* JADX WARN: Code duplicated, block: B:344:0x050e  */
    /* JADX WARN: Code duplicated, block: B:346:0x0516  */
    /* JADX WARN: Code duplicated, block: B:347:0x051a  */
    /* JADX WARN: Code duplicated, block: B:349:0x0522  */
    /* JADX WARN: Code duplicated, block: B:350:0x0526  */
    /* JADX WARN: Code duplicated, block: B:352:0x052e  */
    /* JADX WARN: Code duplicated, block: B:353:0x0532  */
    /* JADX WARN: Code duplicated, block: B:355:0x053a  */
    /* JADX WARN: Code duplicated, block: B:356:0x053e  */
    /* JADX WARN: Code duplicated, block: B:358:0x0546  */
    /* JADX WARN: Code duplicated, block: B:359:0x054a  */
    /* JADX WARN: Code duplicated, block: B:361:0x0552  */
    /* JADX WARN: Code duplicated, block: B:362:0x0556  */
    /* JADX WARN: Code duplicated, block: B:364:0x055e  */
    /* JADX WARN: Code duplicated, block: B:365:0x0562  */
    /* JADX WARN: Code duplicated, block: B:367:0x056a  */
    /* JADX WARN: Code duplicated, block: B:368:0x056e  */
    /* JADX WARN: Code duplicated, block: B:370:0x0576  */
    /* JADX WARN: Code duplicated, block: B:371:0x057a  */
    /* JADX WARN: Code duplicated, block: B:373:0x0582  */
    /* JADX WARN: Code duplicated, block: B:374:0x0586  */
    /* JADX WARN: Code duplicated, block: B:376:0x058e  */
    /* JADX WARN: Code duplicated, block: B:377:0x0592  */
    /* JADX WARN: Code duplicated, block: B:379:0x059a  */
    /* JADX WARN: Code duplicated, block: B:380:0x059e  */
    /* JADX WARN: Code duplicated, block: B:382:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:383:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:385:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:386:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:388:0x05be  */
    /* JADX WARN: Code duplicated, block: B:389:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:391:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:392:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:394:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:395:0x05da  */
    /* JADX WARN: Code duplicated, block: B:397:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:398:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:400:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:401:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:403:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:404:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:406:0x0606  */
    /* JADX WARN: Code duplicated, block: B:407:0x060a  */
    /* JADX WARN: Code duplicated, block: B:409:0x0612  */
    /* JADX WARN: Code duplicated, block: B:410:0x0616  */
    /* JADX WARN: Code duplicated, block: B:412:0x061e  */
    /* JADX WARN: Code duplicated, block: B:413:0x0622  */
    /* JADX WARN: Code duplicated, block: B:415:0x062a  */
    /* JADX WARN: Code duplicated, block: B:416:0x062e  */
    /* JADX WARN: Code duplicated, block: B:418:0x0636  */
    /* JADX WARN: Code duplicated, block: B:419:0x063a  */
    /* JADX WARN: Code duplicated, block: B:421:0x0642  */
    /* JADX WARN: Code duplicated, block: B:422:0x0646  */
    /* JADX WARN: Code duplicated, block: B:424:0x064e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0652  */
    /* JADX WARN: Code duplicated, block: B:427:0x065a  */
    /* JADX WARN: Code duplicated, block: B:428:0x065d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:430:0x0665  */
    /* JADX WARN: Code duplicated, block: B:431:0x0668  */
    /* JADX WARN: Code duplicated, block: B:433:0x0670  */
    /* JADX WARN: Code duplicated, block: B:434:0x0674  */
    /* JADX WARN: Code duplicated, block: B:436:0x067c  */
    /* JADX WARN: Code duplicated, block: B:437:0x0680  */
    /* JADX WARN: Code duplicated, block: B:439:0x0688  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:440:0x068c  */
    /* JADX WARN: Code duplicated, block: B:442:0x0694  */
    /* JADX WARN: Code duplicated, block: B:443:0x0698  */
    /* JADX WARN: Code duplicated, block: B:445:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:446:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:448:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:449:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:451:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:452:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:454:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:455:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:457:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:458:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:460:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:461:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:463:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:464:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:466:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:467:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:469:0x0701  */
    /* JADX WARN: Code duplicated, block: B:470:0x0705  */
    /* JADX WARN: Code duplicated, block: B:472:0x070d  */
    /* JADX WARN: Code duplicated, block: B:473:0x0711  */
    /* JADX WARN: Code duplicated, block: B:475:0x0719  */
    /* JADX WARN: Code duplicated, block: B:476:0x071d  */
    /* JADX WARN: Code duplicated, block: B:478:0x0725  */
    /* JADX WARN: Code duplicated, block: B:479:0x0729  */
    /* JADX WARN: Code duplicated, block: B:481:0x0731  */
    /* JADX WARN: Code duplicated, block: B:482:0x0734  */
    /* JADX WARN: Code duplicated, block: B:484:0x073c  */
    /* JADX WARN: Code duplicated, block: B:485:0x073f  */
    /* JADX WARN: Code duplicated, block: B:487:0x0747  */
    /* JADX WARN: Code duplicated, block: B:488:0x074a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094 A[Catch: all -> 0x07ad, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:517:0x07a9, B:10:0x0015, B:12:0x0023, B:516:0x07a5, B:45:0x0089, B:48:0x0094, B:83:0x0103, B:508:0x0790), top: B:523:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:490:0x0752  */
    /* JADX WARN: Code duplicated, block: B:491:0x0755  */
    /* JADX WARN: Code duplicated, block: B:493:0x075d  */
    /* JADX WARN: Code duplicated, block: B:494:0x0760  */
    /* JADX WARN: Code duplicated, block: B:496:0x0768  */
    /* JADX WARN: Code duplicated, block: B:497:0x076b  */
    /* JADX WARN: Code duplicated, block: B:499:0x0773  */
    /* JADX WARN: Code duplicated, block: B:500:0x0776  */
    /* JADX WARN: Code duplicated, block: B:502:0x077e  */
    /* JADX WARN: Code duplicated, block: B:503:0x0781  */
    /* JADX WARN: Code duplicated, block: B:505:0x0789  */
    /* JADX WARN: Code duplicated, block: B:506:0x078c  */
    /* JADX WARN: Code duplicated, block: B:508:0x0790 A[Catch: all -> 0x07ad, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:517:0x07a9, B:10:0x0015, B:12:0x0023, B:516:0x07a5, B:45:0x0089, B:48:0x0094, B:83:0x0103, B:508:0x0790), top: B:523:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:512:0x079a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:533:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:550:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:560:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:580:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:590:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:610:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:650:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103 A[Catch: all -> 0x07ad, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:517:0x07a9, B:10:0x0015, B:12:0x0023, B:516:0x07a5, B:45:0x0089, B:48:0x0094, B:83:0x0103, B:508:0x0790), top: B:523:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:89:0x011a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0122  */
    /* JADX WARN: Code duplicated, block: B:92:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x012e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x013a  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected static final boolean zzbq(String str) {
        String str2;
        byte b10;
        String str3;
        byte b11;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzade.class) {
            if (!zzc) {
                int i10 = Build.VERSION.SDK_INT;
                byte b12 = 28;
                byte b13 = -1;
                if (i10 <= 28) {
                    String str4 = Build.DEVICE;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            b11 = !str4.equals("dangal") ? (byte) -1 : (byte) 1;
                            break;
                        case -1220081023:
                            b11 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 3;
                            break;
                        case -1220066608:
                            b11 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1012436106:
                            b11 = !str4.equals("oneday") ? (byte) -1 : (byte) 7;
                            break;
                        case -760312546:
                            b11 = !str4.equals("aquaman") ? (byte) -1 : (byte) 0;
                            break;
                        case -64886864:
                            b11 = !str4.equals("magnolia") ? (byte) -1 : (byte) 4;
                            break;
                        case 3415681:
                            b11 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                            break;
                        case 825323514:
                            b11 = !str4.equals("machuca") ? (byte) -1 : (byte) 5;
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    switch (b11) {
                        default:
                            if (i10 <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                str2 = Build.MODEL;
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 6;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 7;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 0;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 2;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 3;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 4;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 8;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 5;
                                        }
                                        break;
                                    default:
                                        b10 = -1;
                                        break;
                                }
                                switch (b10) {
                                    default:
                                        if (i10 <= 26) {
                                            str3 = Build.DEVICE;
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 54;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 55;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 56;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 74;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 22;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 89;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 90;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 101;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 102;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 103;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 13;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 116;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 137;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 21;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 104;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 95;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 130;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 97;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 98;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 99;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals(UomBEukHFwrS.cLnbMFNKVKBwhoB)) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 52;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 18;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 70;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 118;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 87;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 5;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 6;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 120;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 34;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 126;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 88;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 9;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 119;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 131;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 132;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 91;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 51;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 53;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 105;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 121;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 17;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 138;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 31;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 134;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 20;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 113;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 127;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 129;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 16;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 84;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 73;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 79;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 80;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 86;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 94;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 107;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 115;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 139;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 26;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 27;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b12 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 49;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 0;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 2;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 36;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 37;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 38;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 39;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 40;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 41;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 93;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 109;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 111;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 136;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 50;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 75;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 85;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 92;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 83;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 3;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 4;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 15;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 7;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals(cNMUz.xJpBobKPKgXJhyB)) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 30;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 42;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 43;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 44;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 45;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 46;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 47;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 48;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 108;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 110;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 112;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 128;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 135;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 67;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 76;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 77;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 8;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 25;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 82;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 60;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 11;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 12;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 122;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals(yhXxbqGRMeI.SMpUVd)) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 123;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 124;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 125;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 106;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 114;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 57;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 58;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 59;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 81;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 10;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 72;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 96;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 78;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals(xjwcmjDeOXR.pIQrYpS)) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 71;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 62;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 35;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 61;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 133;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 23;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 24;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 68;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 117;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 100;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 69;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 19;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 29;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = Utf8.REPLACEMENT_BYTE;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 64;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 14;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 32;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 33;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 65;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 66;
                                                    }
                                                    break;
                                                default:
                                                    b12 = -1;
                                                    break;
                                            }
                                            switch (b12) {
                                                default:
                                                    if (str2.hashCode() == -594534941 && str2.equals("JSN-L21")) {
                                                        b13 = 0;
                                                    }
                                                    if (b13 == 0) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case 45:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case 74:
                                                case 75:
                                                case 76:
                                                case 77:
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case 92:
                                                case 93:
                                                case 94:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case 117:
                                                case 118:
                                                case 119:
                                                case 120:
                                                case 121:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case INVALID_METRICS_ENDPOINT_VALUE:
                                                case 126:
                                                case 127:
                                                case 128:
                                                case EMPTY_TPAT_ERROR_VALUE:
                                                case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                                                case MRAID_JS_WRITE_FAILED_VALUE:
                                                case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                                case OMSDK_JS_WRITE_FAILED_VALUE:
                                                case STORE_REGION_CODE_ERROR_VALUE:
                                                case INVALID_CONFIG_RESPONSE_VALUE:
                                                case PRIVACY_URL_ERROR_VALUE:
                                                case TPAT_RETRY_FAILED_VALUE:
                                                case CONFIG_REFRESH_FAILED_VALUE:
                                                case 139:
                                                    z10 = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z10 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z10 = true;
                            break;
                    }
                } else if (i10 <= 27) {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b10 = -1;
                            } else {
                                b10 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b10 = -1;
                            } else {
                                b10 = 5;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            if (i10 <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals(UomBEukHFwrS.cLnbMFNKVKBwhoB)) {
                                            b12 = -1;
                                        } else {
                                            b12 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b12 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals(cNMUz.xJpBobKPKgXJhyB)) {
                                            b12 = -1;
                                        } else {
                                            b12 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals(yhXxbqGRMeI.SMpUVd)) {
                                            b12 = -1;
                                        } else {
                                            b12 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals(xjwcmjDeOXR.pIQrYpS)) {
                                            b12 = -1;
                                        } else {
                                            b12 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Utf8.REPLACEMENT_BYTE;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 66;
                                        }
                                        break;
                                    default:
                                        b12 = -1;
                                        break;
                                }
                                switch (b12) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            b13 = 0;
                                        }
                                        if (b13 == 0) {
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case INVALID_METRICS_ENDPOINT_VALUE:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case EMPTY_TPAT_ERROR_VALUE:
                                    case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                                    case MRAID_JS_WRITE_FAILED_VALUE:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case STORE_REGION_CODE_ERROR_VALUE:
                                    case INVALID_CONFIG_RESPONSE_VALUE:
                                    case PRIVACY_URL_ERROR_VALUE:
                                    case TPAT_RETRY_FAILED_VALUE:
                                    case CONFIG_REFRESH_FAILED_VALUE:
                                    case 139:
                                        z10 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z10 = true;
                            break;
                    }
                } else {
                    str2 = Build.MODEL;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b10 = -1;
                            } else {
                                b10 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b10 = -1;
                            } else {
                                b10 = 5;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            if (i10 <= 26) {
                                str3 = Build.DEVICE;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals(UomBEukHFwrS.cLnbMFNKVKBwhoB)) {
                                            b12 = -1;
                                        } else {
                                            b12 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b12 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals(cNMUz.xJpBobKPKgXJhyB)) {
                                            b12 = -1;
                                        } else {
                                            b12 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals(yhXxbqGRMeI.SMpUVd)) {
                                            b12 = -1;
                                        } else {
                                            b12 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals(xjwcmjDeOXR.pIQrYpS)) {
                                            b12 = -1;
                                        } else {
                                            b12 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Utf8.REPLACEMENT_BYTE;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 66;
                                        }
                                        break;
                                    default:
                                        b12 = -1;
                                        break;
                                }
                                switch (b12) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            b13 = 0;
                                        }
                                        if (b13 == 0) {
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case INVALID_METRICS_ENDPOINT_VALUE:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case EMPTY_TPAT_ERROR_VALUE:
                                    case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                                    case MRAID_JS_WRITE_FAILED_VALUE:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case STORE_REGION_CODE_ERROR_VALUE:
                                    case INVALID_CONFIG_RESPONSE_VALUE:
                                    case PRIVACY_URL_ERROR_VALUE:
                                    case TPAT_RETRY_FAILED_VALUE:
                                    case CONFIG_REFRESH_FAILED_VALUE:
                                    case 139:
                                        z10 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z10 = true;
                            break;
                    }
                }
                zzd = z10;
                zzc = true;
            }
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzvg zzah(zzvm zzvmVar, zzv zzvVar, MediaCrypto mediaCrypto, float f10) {
        int i10;
        int i11;
        zzadd zzaddVar;
        Point pointZzi;
        int i12;
        zzv[] zzvVarArr;
        byte b10;
        boolean z10;
        Pair pairZze;
        int iZzaw;
        zzv[] zzvVarArrZzJ = zzJ();
        int length = zzvVarArrZzJ.length;
        int iZzbm = zzbm(zzvmVar, zzvVar);
        int i13 = zzvVar.zzx;
        int i14 = zzvVar.zzw;
        if (length == 1) {
            if (iZzbm != -1 && (iZzaw = zzaw(zzvmVar, zzvVar)) != -1) {
                iZzbm = Math.min((int) (iZzbm * 1.5f), iZzaw);
            }
            zzaddVar = new zzadd(i14, i13, iZzbm);
            i10 = i13;
            i11 = i14;
        } else {
            int iMax = i13;
            int iMax2 = i14;
            int i15 = 0;
            boolean z11 = false;
            while (i15 < length) {
                zzv zzvVarZzO = zzvVarArrZzJ[i15];
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zzvVarZzO.zzF == null) {
                    zzt zztVarZza = zzvVarZzO.zza();
                    zztVarZza.zzE(zziVar);
                    zzvVarZzO = zztVarZza.zzO();
                }
                if (zzvmVar.zzf(zzvVar, zzvVarZzO).zzd != 0) {
                    int i16 = zzvVarZzO.zzw;
                    b10 = -1;
                    if (i16 != -1) {
                        zzvVarArr = zzvVarArrZzJ;
                        if (zzvVarZzO.zzx != -1) {
                            z10 = false;
                        }
                        z11 |= z10;
                        iMax2 = Math.max(iMax2, i16);
                        iMax = Math.max(iMax, zzvVarZzO.zzx);
                        iZzbm = Math.max(iZzbm, zzbm(zzvmVar, zzvVarZzO));
                    } else {
                        zzvVarArr = zzvVarArrZzJ;
                    }
                    z10 = true;
                    z11 |= z10;
                    iMax2 = Math.max(iMax2, i16);
                    iMax = Math.max(iMax, zzvVarZzO.zzx);
                    iZzbm = Math.max(iZzbm, zzbm(zzvmVar, zzvVarZzO));
                } else {
                    zzvVarArr = zzvVarArrZzJ;
                    b10 = -1;
                }
                i15++;
                zzvVarArrZzJ = zzvVarArr;
            }
            if (z11) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length());
                sb2.append("Resolutions unknown. Codec max resolution: ");
                sb2.append(iMax2);
                sb2.append("x");
                sb2.append(iMax);
                zzeg.zzc("MediaCodecVideoRenderer", sb2.toString());
                boolean z12 = i13 > i14;
                int i17 = z12 ? i13 : i14;
                int i18 = true != z12 ? i13 : i14;
                int[] iArr = zzb;
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        float f11 = i18;
                        i10 = i13;
                        float f12 = i17;
                        i11 = i14;
                        int i20 = iArr[i19];
                        int[] iArr2 = iArr;
                        float f13 = i20;
                        if (i20 > i17 && (i12 = (int) (f13 * (f11 / f12))) > i18) {
                            int i21 = true != z12 ? i20 : i12;
                            if (true != z12) {
                                i20 = i12;
                            }
                            pointZzi = zzvmVar.zzi(i21, i20);
                            float f14 = zzvVar.zzA;
                            if (pointZzi != null) {
                                if (zzvmVar.zzg(pointZzi.x, pointZzi.y, f14)) {
                                    break;
                                }
                            }
                            i19++;
                            i13 = i10;
                            i14 = i11;
                            iArr = iArr2;
                            z12 = z12;
                        }
                    } else {
                        i10 = i13;
                        i11 = i14;
                    }
                    pointZzi = null;
                    break;
                }
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzv(iMax2);
                    zztVarZza2.zzw(iMax);
                    iZzbm = Math.max(iZzbm, zzaw(zzvmVar, zztVarZza2.zzO()));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iMax2).length() + 35 + String.valueOf(iMax).length());
                    sb3.append(NyXuoef.UobWgwbGewa);
                    sb3.append(iMax2);
                    sb3.append("x");
                    sb3.append(iMax);
                    zzeg.zzc("MediaCodecVideoRenderer", sb3.toString());
                }
            } else {
                i10 = i13;
                i11 = i14;
            }
            zzaddVar = new zzadd(iMax2, iMax, iZzbm);
        }
        String str = zzvmVar.zzc;
        this.zzo = zzaddVar;
        boolean z13 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i11);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i10);
        zzej.zza(mediaFormat, zzvVar.zzs);
        float f15 = zzvVar.zzA;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzej.zzb(mediaFormat, "rotation-degrees", zzvVar.zzB);
        zzi zziVar2 = zzvVar.zzF;
        if (zziVar2 != null) {
            zzej.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzej.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzej.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzp) && (pairZze = zzdq.zze(zzvVar)) != null) {
            zzej.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzaddVar.zza);
        mediaFormat.setInteger("max-height", zzaddVar.zzb);
        zzej.zzb(mediaFormat, "max-input-size", zzaddVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z13) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzN));
        }
        zzbi(mediaFormat);
        Surface surfaceZzbz = zzbz(zzvmVar);
        if (this.zzr != null && !zzfl.zzU(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzvg.zzb(zzvmVar, mediaFormat, zzvVar, surfaceZzbz, null);
    }
}
