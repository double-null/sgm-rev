package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjg implements zzly {
    public static final zzgwm zza = zzgwm.zzn(ShareInternalUtility.STAGING_PARAM, AppLovinEventTypes.USER_VIEWED_CONTENT, "data", "android.resource", "rawresource", "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzabr zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgwp zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    private final int zzm(zzqf zzqfVar) {
        Integer num = (Integer) this.zzn.get(zzqfVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzqf zzqfVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzjf zzjfVar = (zzjf) concurrentHashMap.get(zzqfVar);
        if (zzjfVar != null) {
            int i10 = zzjfVar.zza - 1;
            zzjfVar.zza = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(zzqfVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzabr zzabrVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((zzjf) it.next()).zzc;
        }
        zzabrVar.zzf(i10);
    }

    private final boolean zzp(zzlx zzlxVar) {
        zzbf zzbfVar = zzlxVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzlxVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i10, int i11, String str, String str2) {
        zzgtj.zzh(i10 >= i11, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzqf zzqfVar) {
        zzjf zzjfVar = (zzjf) this.zzo.get(zzqfVar);
        zzjfVar.getClass();
        return zzjfVar.zzc() * NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
    }

    private final int zzs(zzqf zzqfVar) {
        zzjf zzjfVar = (zzjf) this.zzo.get(zzqfVar);
        zzjfVar.getClass();
        return zzjfVar.zzc;
    }

    private static final boolean zzt(boolean z10) {
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zza(zzqf zzqfVar) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.zzp;
        zzgtj.zzj(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id2;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzjf zzjfVar = (zzjf) concurrentHashMap.get(zzqfVar);
        if (zzjfVar == null) {
            concurrentHashMap.put(zzqfVar, new zzjf());
        } else {
            zzjfVar.zza++;
        }
        zzjf zzjfVar2 = (zzjf) concurrentHashMap.get(zzqfVar);
        zzjfVar2.getClass();
        int iZzm = zzm(zzqfVar);
        if (iZzm == -1) {
            iZzm = 13107200;
        }
        zzjfVar2.zzc = iZzm;
        zzjfVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzb(zzlx zzlxVar, zzzn zzznVar, zzaba[] zzabaVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzqf zzqfVar = zzlxVar.zza;
        int iZzm = zzm(zzqfVar);
        zzjf zzjfVar = (zzjf) concurrentHashMap.get(zzqfVar);
        zzjfVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzlxVar);
            int length = zzabaVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < length) {
                    zzaba zzabaVar = zzabaVarArr[i10];
                    if (zzabaVar != null) {
                        switch (zzabaVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i12 = 144310272;
                                break;
                            case 2:
                                i12 = !zZzp ? 131072000 : 19660800;
                                break;
                            case 3:
                            case 5:
                            default:
                                i12 = 131072;
                                break;
                            case 4:
                                i12 = 26214400;
                                break;
                        }
                        i11 += i12;
                    }
                    i10++;
                } else {
                    String str = zzfl.zza;
                    iZzm = Math.max(13107200, Math.min(i11, 210239488));
                }
            }
        }
        zzjfVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzc(zzqf zzqfVar) {
        zzn(zzqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzd(zzqf zzqfVar) {
        zzn(zzqfVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final zzabl zze(zzqf zzqfVar) {
        return new zzje(this, zzqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final long zzf(zzqf zzqfVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzg(zzqf zzqfVar) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzh(zzlx zzlxVar) {
        boolean z10;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzqf zzqfVar = zzlxVar.zza;
        zzjf zzjfVar = (zzjf) concurrentHashMap.get(zzqfVar);
        zzjfVar.getClass();
        int iZzr = zzr(zzqfVar);
        int iZzs = zzs(zzqfVar);
        boolean z11 = false;
        if (zzqfVar.equals(zzqf.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzlxVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j10 = zZzp ? this.zzh : this.zzg;
        float f10 = zzlxVar.zzf;
        if (f10 > 1.0f) {
            jMin = Math.min(zzfl.zzx(jMin, f10), j10);
        }
        long j11 = zzlxVar.zze;
        if (j11 < Math.max(jMin, 500000L)) {
            boolean zZzt = zzt(zZzp);
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            boolean z12 = runtime.totalMemory() < jMaxMemory || runtime.freeMemory() + ((long) this.zzd.zzh()) >= jMaxMemory / 25;
            if (zZzt) {
                if (!z12) {
                    if (iZzr < iZzs) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (true != z10) {
                    }
                }
                zzjfVar.zzb = z11;
                if (!z11 && zZzt && !z12) {
                    zzeg.zzb("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                }
                if (!zzjfVar.zzb && j11 < 500000) {
                    zzeg.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else {
                if (iZzr < iZzs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (true != z10) {
                }
                zzjfVar.zzb = z11;
                if (!z11) {
                    zzeg.zzb("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                }
                if (!zzjfVar.zzb) {
                    zzeg.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            }
            z11 = true;
            zzjfVar.zzb = z11;
            if (!z11) {
                zzeg.zzb("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!zzjfVar.zzb) {
                zzeg.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || iZzr >= iZzs) {
            zzjfVar.zzb = false;
        }
        return zzjfVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzi(zzlx zzlxVar) {
        long jMin;
        boolean z10;
        boolean z11 = zzlxVar.zzg;
        long j10 = zzlxVar.zze;
        float f10 = zzlxVar.zzf;
        boolean zZzp = zzp(zzlxVar);
        long jZzy = zzfl.zzy(j10, f10);
        if (z11) {
            if (zZzp) {
                jMin = this.zzl;
                z10 = true;
            } else {
                jMin = this.zzk;
                z10 = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z10 = true;
        } else {
            jMin = this.zzi;
            z10 = false;
        }
        long j11 = zzlxVar.zzh;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin > 0 && jZzy < jMin) {
            if (zzt(z10)) {
                return false;
            }
            zzqf zzqfVar = zzlxVar.zza;
            if (zzr(zzqfVar) < zzs(zzqfVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzj(zzqf zzqfVar, zzbf zzbfVar, zzxk zzxkVar, long j10) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzjf) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    final /* synthetic */ zzabr zzk() {
        return this.zzd;
    }

    final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }

    public zzjg() {
        zzabr zzabrVar = new zzabr(true, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        zzgwp zzgwpVarZza = zzgwp.zza();
        zzq(1000, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        String str = UyXgnuLGEkgnZE.QNEFfAF;
        zzq(1000, 0, str, AppEventsConstants.EVENT_PARAM_VALUE_NO);
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", str);
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzabrVar;
        this.zze = zzfl.zzs(50000L);
        this.zzf = zzfl.zzs(1000L);
        this.zzg = zzfl.zzs(50000L);
        this.zzh = zzfl.zzs(50000L);
        this.zzi = zzfl.zzs(1000L);
        this.zzj = zzfl.zzs(1000L);
        this.zzk = zzfl.zzs(2000L);
        this.zzl = zzfl.zzs(1000L);
        this.zzm = zzfl.zzs(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgwp.zzc(zzgwpVarZza);
        this.zzp = -1L;
    }
}
