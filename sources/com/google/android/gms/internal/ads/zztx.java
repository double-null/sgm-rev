package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zztx extends zzvt implements zzmb {
    private final Context zzb;
    private final zzru zzc;
    private final zzse zzd;
    private final zzvf zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzv zzi;
    private zzv zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zztx(Context context, zzvh zzvhVar, zzvv zzvvVar, boolean z10, Handler handler, zzrv zzrvVar, zzse zzseVar) {
        super(context.getApplicationContext(), 1, zzvhVar, zzvvVar, false, 44100.0f);
        zzvf zzvfVar = Build.VERSION.SDK_INT >= 35 ? new zzvf(zzve.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzseVar;
        this.zze = zzvfVar;
        this.zzp = -1000;
        this.zzc = new zzru(handler, zzrvVar);
        this.zzr = -9223372036854775807L;
        zzseVar.zza(new zztw(this, null));
    }

    private static List zzbm(zzvv zzvvVar, zzv zzvVar, boolean z10, zzse zzseVar) throws zzvx {
        zzvm zzvmVarZza;
        if (zzvVar.zzp == null) {
            return zzgwm.zzi();
        }
        return (!zzseVar.zzd(zzvVar) || (zzvmVarZza = zzwf.zza()) == null) ? zzwf.zzc(zzvvVar, zzvVar, false, false) : zzgwm.zzj(zzvmVarZza);
    }

    private final int zzbn(zzvm zzvmVar, zzv zzvVar) {
        "OMX.google.raw.decoder".equals(zzvmVar.zza);
        return zzvVar.zzq;
    }

    private final void zzbo() {
        long jZzg = this.zzd.zzg(zzab());
        if (jZzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzg = Math.max(this.zzk, jZzg);
            }
            this.zzk = jZzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzA(long j10, boolean z10, boolean z11) throws zzjk {
        super.zzA(j10, z10, z11);
        this.zzd.zzB();
        this.zzk = j10;
        this.zzr = -9223372036854775807L;
        this.zzn = false;
        this.zzo = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzB() {
        this.zzd.zzi();
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzC() {
        zzbo();
        this.zzq = false;
        this.zzd.zzA();
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzr = -9223372036854775807L;
        this.zzo = false;
        try {
            this.zzd.zzB();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(((zzvt) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzE() {
        this.zzn = false;
        this.zzo = false;
        this.zzr = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzm) {
            }
        } finally {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzC();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzF() {
        zzvf zzvfVar;
        this.zzd.zzD();
        if (Build.VERSION.SDK_INT < 35 || (zzvfVar = this.zze) == null) {
            return;
        }
        zzvfVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzna, com.google.android.gms.internal.ads.zznc
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    final /* synthetic */ zzvf zzaA() {
        return this.zze;
    }

    final /* synthetic */ void zzaB(boolean z10) {
        this.zzn = true;
    }

    final /* synthetic */ void zzaC(boolean z10) {
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final boolean zzaa() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final boolean zzab() {
        return super.zzab() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final int zzae(zzvv zzvvVar, zzv zzvVar) throws zzvx {
        int i10;
        boolean z10;
        String str = zzvVar.zzp;
        if (!zzas.zza(str)) {
            return 128;
        }
        int i11 = zzvVar.zzO;
        boolean zZzbj = zzvt.zzbj(zzvVar);
        int i12 = 1;
        if (!zZzbj || (i11 != 0 && zzwf.zza() == null)) {
            i10 = 0;
        } else {
            zzse zzseVar = this.zzd;
            zzqs zzqsVarZzf = zzseVar.zzf(zzvVar);
            if (zzqsVarZzf.zzb) {
                i10 = true != zzqsVarZzf.zzc ? 512 : 1536;
                if (zzqsVarZzf.zzd) {
                    i10 |= 2048;
                }
            } else {
                i10 = 0;
            }
            if (zzseVar.zzd(zzvVar)) {
                return i10 | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            zzse zzseVar2 = this.zzd;
            if (zzseVar2.zzd(zzfl.zzA(2, zzvVar.zzH, zzvVar.zzI))) {
                List listZzbm = zzbm(zzvvVar, zzvVar, false, zzseVar2);
                if (!listZzbm.isEmpty()) {
                    if (zZzbj) {
                        zzvm zzvmVar = (zzvm) listZzbm.get(0);
                        Context context = this.zzb;
                        boolean zZzc = zzvmVar.zzc(context, zzvVar);
                        if (!zZzc) {
                            int i13 = 1;
                            while (true) {
                                if (i13 >= listZzbm.size()) {
                                    z10 = true;
                                    break;
                                }
                                zzvm zzvmVar2 = (zzvm) listZzbm.get(i13);
                                if (zzvmVar2.zzc(context, zzvVar)) {
                                    z10 = false;
                                    zZzc = true;
                                    zzvmVar = zzvmVar2;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                        int i14 = true != zZzc ? 3 : 4;
                        int i15 = 8;
                        if (zZzc && zzvmVar.zze(zzvVar)) {
                            i15 = 16;
                        }
                        return i14 | i15 | 32 | (true != zzvmVar.zzg ? 0 : 64) | (true != z10 ? 0 : 128) | i10;
                    }
                    i12 = 2;
                }
            }
        }
        return i12 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final List zzaf(zzvv zzvvVar, zzv zzvVar, boolean z10) throws zzvx {
        return zzwf.zze(this.zzb, zzbm(zzvvVar, zzvVar, false, this.zzd), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzag(zzv zzvVar) {
        zzK();
        return this.zzd.zzd(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzvg zzah(zzvm zzvmVar, zzv zzvVar, MediaCrypto mediaCrypto, float f10) {
        zzv[] zzvVarArrZzJ = zzJ();
        int length = zzvVarArrZzJ.length;
        int iZzbn = zzbn(zzvmVar, zzvVar);
        if (length != 1) {
            for (zzv zzvVar2 : zzvVarArrZzJ) {
                if (zzvmVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    iZzbn = Math.max(iZzbn, zzbn(zzvmVar, zzvVar2));
                }
            }
        }
        this.zzf = iZzbn;
        String str = zzvmVar.zza;
        int i10 = Build.VERSION.SDK_INT;
        this.zzg = false;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzvmVar.zzc;
        int i11 = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i12 = zzvVar.zzH;
        mediaFormat.setInteger("channel-count", i12);
        int i13 = zzvVar.zzI;
        mediaFormat.setInteger("sample-rate", i13);
        zzej.zza(mediaFormat, zzvVar.zzs);
        zzej.zzb(mediaFormat, "max-input-size", i11);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        String str3 = zzvVar.zzp;
        if ("audio/ac4".equals(str3)) {
            Pair pairZze = zzdq.zze(zzvVar);
            if (pairZze != null) {
                zzej.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
                zzej.zzb(mediaFormat, AppLovinEventTypes.USER_COMPLETED_LEVEL, ((Integer) pairZze.second).intValue());
            }
            if (i10 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzfl.zzA(4, i12, i13)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i10 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzp));
        }
        if (Objects.equals(str3, "audio/iamf")) {
            zzqh zzqhVarZzs = this.zzd.zzs();
            if (zzqhVarZzs == null) {
                zzeg.zzc("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int iZza = zztv.zza(zzqhVarZzs);
                int iBitCount = Integer.bitCount(iZza);
                mediaFormat.setInteger("channel-mask", iZza);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        zzbi(mediaFormat);
        this.zzj = (!"audio/raw".equals(zzvmVar.zzb) || "audio/raw".equals(str3)) ? null : zzvVar;
        return zzvg.zza(zzvmVar, mediaFormat, zzvVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzjc zzai(zzvm zzvmVar, zzv zzvVar, zzv zzvVar2) {
        int i10;
        int i11;
        zzjc zzjcVarZzf = zzvmVar.zzf(zzvVar, zzvVar2);
        int i12 = zzjcVarZzf.zze;
        if (zzaF(zzvVar2)) {
            i12 |= 32768;
        }
        if (zzbn(zzvmVar, zzvVar2) > this.zzf) {
            i12 |= 64;
        }
        String str = zzvmVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzjcVarZzf.zzd;
            i11 = 0;
        }
        return new zzjc(str, zzvVar, zzvVar2, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final long zzaj(long j10, long j11, boolean z10) {
        zzse zzseVar = this.zzd;
        boolean z11 = false;
        if (zzseVar.zzn() && this.zzr != -9223372036854775807L) {
            z11 = true;
        }
        if (!this.zzq) {
            return (z11 || super.zzab()) ? 1000000L : 10000L;
        }
        long jZzx = zzseVar.zzx();
        if (this.zzo && z11 && jZzx != -9223372036854775807L) {
            return Math.max(10000L, (long) ((Math.min(jZzx, this.zzr - j10) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final float zzak(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        int iMax = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i10 = zzvVar2.zzI;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzal(String str, zzvg zzvgVar, long j10, long j11) {
        this.zzc.zzb(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzam(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzan(Exception exc) {
        zzeg.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzjc zzao(zzlw zzlwVar) throws zzjk {
        zzv zzvVar = zzlwVar.zzb;
        zzvVar.getClass();
        this.zzi = zzvVar;
        zzjc zzjcVarZzao = super.zzao(zzlwVar);
        this.zzc.zzc(zzvVar, zzjcVarZzao);
        return zzjcVarZzao;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzap(zzv zzvVar, MediaFormat mediaFormat) throws zzjk {
        int iZzB;
        int i10;
        zzv zzvVar2 = this.zzj;
        zzhaf zzhafVarZza = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaI() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzvVar.zzp)) {
                iZzB = zzvVar.zzJ;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iZzB = mediaFormat.getInteger("pcm-encoding");
            } else {
                iZzB = mediaFormat.containsKey("v-bits-per-sample") ? zzfl.zzB(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            zzt zztVar = new zzt();
            zztVar.zzo("audio/raw");
            zztVar.zzI(iZzB);
            zztVar.zzJ(zzvVar.zzK);
            zztVar.zzK(zzvVar.zzL);
            zztVar.zzl(zzvVar.zzl);
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzG(mediaFormat.getInteger("channel-count"));
            zztVar.zzH(mediaFormat.getInteger("sample-rate"));
            zzv zzvVarZzO = zztVar.zzO();
            if (this.zzg && zzvVarZzO.zzH == 6 && (i10 = zzvVar.zzH) < 6) {
                zzhae zzhaeVarZzg = zzhaf.zzg(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    zzhaeVarZzg.zza(i11);
                }
                zzhafVarZza = zzhaeVarZzg.zzb();
            } else if (this.zzh) {
                zzhafVarZza = zzahm.zza(zzvVarZzO.zzH);
            }
            zzvVar = zzvVarZzO;
        }
        try {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                if (zzaH()) {
                    zzK();
                }
                zzgtj.zzi(i12 >= 29);
            }
            zzse zzseVar = this.zzd;
            zzrw zzrwVar = new zzrw(zzvVar);
            zzrwVar.zza(zzhafVarZza);
            zzseVar.zzh(zzrwVar.zzb());
        } catch (zzrz e10) {
            throw zzP(e10, e10.zza, false, 5001);
        }
    }

    protected final void zzaq() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzar() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzas(long j10, long j11, zzvj zzvjVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) throws zzjk {
        byteBuffer.getClass();
        this.zzr = -9223372036854775807L;
        if (this.zzj != null && (i11 & 2) != 0) {
            zzvjVar.getClass();
            zzvjVar.zzc(i10, false);
            return true;
        }
        if (z10) {
            if (zzvjVar != null) {
                zzvjVar.zzc(i10, false);
            }
            ((zzvt) this).zza.zzf += i12;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j12, i12)) {
                this.zzr = j12;
                return false;
            }
            if (zzvjVar != null) {
                zzvjVar.zzc(i10, false);
            }
            ((zzvt) this).zza.zze += i12;
            return true;
        } catch (zzsa e10) {
            zzv zzvVar2 = this.zzi;
            if (zzaH()) {
                zzK();
            }
            throw zzP(e10, zzvVar2, false, 5001);
        } catch (zzsd e11) {
            if (zzaH()) {
                zzK();
            }
            throw zzP(e11, zzvVar, e11.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzat(zziz zzizVar) {
        this.zzc.zzn(zzizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzau() throws zzjk {
        try {
            this.zzd.zzl();
            if (zzbe() != -9223372036854775807L) {
                this.zzr = zzbe();
            }
        } catch (zzsd e10) {
            throw zzP(e10, e10.zzc, e10.zzb, true != zzaH() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzav(zziv zzivVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zzivVar.zza) == null || !Objects.equals(zzvVar.zzp, "audio/opus") || !zzaH()) {
            return;
        }
        ByteBuffer byteBuffer = zzivVar.zzf;
        byteBuffer.getClass();
        zzv zzvVar2 = zzivVar.zza;
        zzvVar2.getClass();
        int i10 = zzvVar2.zzK;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzy(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    final /* synthetic */ zzru zzaz() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final long zzg() {
        if (zze() == 2) {
            zzbo();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final boolean zzh() {
        boolean z10 = this.zzn;
        this.zzn = false;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzi(zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final zzav zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzmv
    public final void zzx(int i10, Object obj) throws zzjk {
        zzvf zzvfVar;
        if (i10 == 2) {
            zzse zzseVar = this.zzd;
            obj.getClass();
            zzseVar.zzz(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            zzd zzdVar = (zzd) obj;
            zzse zzseVar2 = this.zzd;
            zzdVar.getClass();
            zzseVar2.zzr(zzdVar);
            return;
        }
        if (i10 == 6) {
            zze zzeVar = (zze) obj;
            zzse zzseVar3 = this.zzd;
            zzeVar.getClass();
            zzseVar3.zzu(zzeVar);
            return;
        }
        if (i10 == 12) {
            this.zzd.zzv((AudioDeviceInfo) obj);
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.zzp = ((Integer) obj).intValue();
            zzvj zzvjVarZzaI = zzaI();
            if (zzvjVarZzaI == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzp));
            zzvjVarZzaI.zzp(bundle);
            return;
        }
        if (i10 == 19) {
            zzse zzseVar4 = this.zzd;
            obj.getClass();
            zzseVar4.zzw(((Integer) obj).intValue());
            return;
        }
        if (i10 == 9) {
            zzse zzseVar5 = this.zzd;
            obj.getClass();
            zzseVar5.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i10 != 10) {
                super.zzx(i10, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzt(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zzvfVar = this.zze) == null) {
                return;
            }
            zzvfVar.zza(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzy(boolean z10, boolean z11) throws zzjk {
        super.zzy(z10, z11);
        this.zzc.zza(((zzvt) this).zza);
        zzK();
        zzse zzseVar = this.zzd;
        zzseVar.zzb(zzL());
        zzseVar.zzc(zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzna
    public final zzmb zzd() {
        return this;
    }
}
