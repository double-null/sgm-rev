package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import be.LNO.fzLzfW;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcgr extends zzcgt implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzchn zzd;
    private final zzcho zze;
    private final boolean zzf;
    private final zzdzl zzg;
    private int zzh;
    private int zzi;
    private MediaPlayer zzj;
    private Uri zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzchl zzo;
    private final boolean zzp;
    private int zzq;
    private zzcgs zzr;
    private boolean zzs;
    private Integer zzt;

    public zzcgr(Context context, zzchn zzchnVar, boolean z10, boolean z11, zzchm zzchmVar, zzcho zzchoVar, zzdzl zzdzlVar) {
        super(context);
        this.zzh = 0;
        this.zzi = 0;
        this.zzs = false;
        this.zzt = null;
        this.zzd = zzchnVar;
        this.zze = zzchoVar;
        this.zzp = z10;
        this.zzf = z11;
        zzchoVar.zza(this);
        this.zzg = zzdzlVar;
    }

    private final void zzD() {
        zzdzl zzdzlVar;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzk == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            com.google.android.gms.ads.internal.zzt.zzv();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzj = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzj.setOnCompletionListener(this);
            this.zzj.setOnErrorListener(this);
            this.zzj.setOnInfoListener(this);
            this.zzj.setOnPreparedListener(this);
            this.zzj.setOnVideoSizeChangedListener(this);
            this.zzn = 0;
            if (this.zzp) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoL)).booleanValue() && (zzdzlVar = this.zzg) != null) {
                    zzdzk zzdzkVarZza = zzdzlVar.zza();
                    zzdzkVarZza.zzc("action", "svp_ampv");
                    zzdzkVarZza.zzd();
                }
                zzchl zzchlVar = new zzchl(getContext());
                this.zzo = zzchlVar;
                zzchlVar.zzb(surfaceTexture, getWidth(), getHeight());
                zzchl zzchlVar2 = this.zzo;
                zzchlVar2.start();
                SurfaceTexture surfaceTextureZze = zzchlVar2.zze();
                if (surfaceTextureZze != null) {
                    surfaceTexture = surfaceTextureZze;
                } else {
                    this.zzo.zzd();
                    this.zzo = null;
                }
            }
            this.zzj.setDataSource(getContext(), this.zzk);
            com.google.android.gms.ads.internal.zzt.zzw();
            this.zzj.setSurface(new Surface(surfaceTexture));
            this.zzj.setAudioStreamType(3);
            this.zzj.setScreenOnWhilePlaying(true);
            this.zzj.prepareAsync();
            zzH(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e10);
            onError(this.zzj, 1, 0);
        }
    }

    private final void zzE(boolean z10) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.zzd();
            this.zzo = null;
        }
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            if (z10) {
                this.zzi = 0;
            }
        }
    }

    private final boolean zzF() {
        int i10;
        return (this.zzj == null || (i10 = this.zzh) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    private final void zzG(float f10) {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void zzH(int i10) {
        if (i10 == 3) {
            this.zze.zze();
            this.zzb.zzd();
        } else if (this.zzh == 3) {
            this.zze.zzf();
            this.zzb.zze();
        }
        this.zzh = i10;
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.zzn = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzH(5);
        this.zzi = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgj(this));
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer info: ");
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int defaultSize = View.getDefaultSize(this.zzl, i10);
        int defaultSize2 = View.getDefaultSize(this.zzm, i11);
        if (this.zzl > 0 && this.zzm > 0 && this.zzo == null) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i15 = (this.zzm * size) / this.zzl;
                    if (mode2 == Integer.MIN_VALUE || i15 <= size2) {
                        defaultSize2 = i15;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i14 = (this.zzl * size2) / this.zzm;
                        if (mode != Integer.MIN_VALUE && i14 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i12 = this.zzl;
                        i13 = this.zzm;
                        if (mode2 == Integer.MIN_VALUE || i13 <= size2) {
                            i14 = i12;
                            size2 = i13;
                        } else {
                            i14 = (size2 * i12) / i13;
                        }
                        if (mode == Integer.MIN_VALUE && i14 > size) {
                            defaultSize2 = (i13 * size) / i12;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i14;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i16 = this.zzl;
                int i17 = i16 * size2;
                int i18 = this.zzm;
                int i19 = size * i18;
                if (i17 < i19) {
                    defaultSize = i17 / i18;
                } else {
                    if (i17 > i19) {
                        defaultSize2 = i19 / i16;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i15 = (this.zzm * size) / this.zzl;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i15;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i14 = (this.zzl * size2) / this.zzm;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i12 = this.zzl;
                        i13 = this.zzm;
                        if (mode2 == Integer.MIN_VALUE) {
                            i14 = i12;
                            size2 = i13;
                        } else {
                            i14 = i12;
                            size2 = i13;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i13 * size) / i12;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i14;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.zzc(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzH(2);
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgi(this, mediaPlayer));
        this.zzl = mediaPlayer.getVideoWidth();
        this.zzm = mediaPlayer.getVideoHeight();
        int i10 = this.zzq;
        if (i10 != 0) {
            zzi(i10);
        }
        if (this.zzf && zzF() && this.zzj.getCurrentPosition() > 0 && this.zzi != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzj.start();
            int currentPosition = this.zzj.getCurrentPosition();
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            while (zzF() && this.zzj.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis <= 250) {
            }
            this.zzj.pause();
            zzq();
        }
        int i11 = this.zzl;
        int i12 = this.zzm;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40 + String.valueOf(i12).length());
        sb2.append("AdMediaPlayerView stream dimensions: ");
        sb2.append(i11);
        sb2.append(" x ");
        sb2.append(i12);
        com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2.toString());
        if (this.zzi == 3) {
            zze();
        }
        zzq();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzD();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgl(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null && this.zzq == 0) {
            this.zzq = mediaPlayer.getCurrentPosition();
        }
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.zzd();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgn(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i12 = this.zzi;
        boolean z10 = false;
        if (this.zzl == i10 && this.zzm == i11) {
            z10 = true;
        }
        if (this.zzj != null && i12 == 3 && z10) {
            int i13 = this.zzq;
            if (i13 != 0) {
                zzi(i13);
            }
            zze();
        }
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.zzc(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgm(this, i10, i11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzr);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 35 + String.valueOf(i11).length());
        sb2.append("AdMediaPlayerView size changed: ");
        sb2.append(i10);
        sb2.append(" x ");
        sb2.append(i11);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        this.zzl = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzm = videoHeight;
        if (this.zzl == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 47);
        sb2.append("AdMediaPlayerView window visibility changed to ");
        sb2.append(i10);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzcgr.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb2.append(name);
        sb2.append("@");
        sb2.append(hexString);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final String zza() {
        return "MediaPlayer".concat(true != this.zzp ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzb(zzcgs zzcgsVar) {
        this.zzr = zzcgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzc(String str) {
        Uri uri = Uri.parse(str);
        zzbhb zzbhbVarZza = zzbhb.zza(uri);
        if (zzbhbVarZza == null || zzbhbVarZza.zza != null) {
            if (zzbhbVarZza != null) {
                uri = Uri.parse(zzbhbVarZza.zza);
            }
            this.zzk = uri;
            this.zzq = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            this.zzi = 0;
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzF()) {
            this.zzj.start();
            zzH(3);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgo(this));
        }
        this.zzi = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzF() && this.zzj.isPlaying()) {
            this.zzj.pause();
            zzH(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgp(this));
        }
        this.zzi = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzg() {
        if (zzF()) {
            return this.zzj.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzh() {
        if (zzF()) {
            return this.zzj.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzi(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 23);
        sb2.append("AdMediaPlayerView seek ");
        sb2.append(i10);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        if (!zzF()) {
            this.zzq = i10;
        } else {
            this.zzj.seekTo(i10);
            this.zzq = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzj(float f10, float f11) {
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzk() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzl() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzm() {
        if (this.zzt != null) {
            return (zzo() * ((long) this.zzn)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzo() {
        if (this.zzt != null) {
            return ((long) zzg()) * ((long) this.zzt.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzp() {
        if (Build.VERSION.SDK_INT < 26 || !zzF()) {
            return -1;
        }
        return this.zzj.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcgt, com.google.android.gms.internal.ads.zzchq
    public final void zzq() {
        zzG(this.zzb.zzc());
    }

    final /* synthetic */ void zzr(int i10) {
        zzcgs zzcgsVar = this.zzr;
        if (zzcgsVar != null) {
            zzcgsVar.onWindowVisibilityChanged(i10);
        }
    }

    final /* synthetic */ void zzs(MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcB)).booleanValue() || this.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    this.zzt = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) && format2.containsKey(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)) {
                                    int integer = format2.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                                    int integer2 = format2.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(integer).length() + 1 + String.valueOf(integer2).length());
                                    sb2.append(integer);
                                    sb2.append("x");
                                    sb2.append(integer2);
                                    map.put("resolution", sb2.toString());
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                this.zzd.zze("onMetadataEvent", map);
            }
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdMediaPlayerView.reportMetadata");
        }
    }

    final /* synthetic */ zzcgs zzt() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzu() {
        return this.zzs;
    }

    final /* synthetic */ void zzv(boolean z10) {
        this.zzs = true;
    }

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, fzLzfW.ZSNnlpWFGuwAI);
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(Integer.valueOf(EventTypeExtended.EVENT_TYPE_EXTENDED_BURL_VALUE), "MEDIA_INFO_NOT_SEEKABLE");
        map.put(Integer.valueOf(EventTypeExtended.EVENT_TYPE_EXTENDED_NURL_VALUE), "MEDIA_INFO_METADATA_UPDATE");
        map.put(Integer.valueOf(EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(Integer.valueOf(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb2.append(edUJlCZxhVnO.TpjnqvjCXBoM);
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        String string = sb2.toString();
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
        zzH(-1);
        this.zzi = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgk(this, str, str2));
        return true;
    }
}
