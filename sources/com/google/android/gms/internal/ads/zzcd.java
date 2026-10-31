package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcd {
    private final zzgub zza;
    private final Handler zzb;
    private zzcc zzc;
    private zzd zzd;
    private int zzf;
    private zzch zzh;
    private float zzg = 1.0f;
    private int zze = 0;

    public zzcd(final Context context, Looper looper, zzcc zzccVar) {
        this.zza = zzguf.zza(new zzgub() { // from class: com.google.android.gms.internal.ads.zzcb
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object zza() {
                return zzcj.zza(context);
            }
        });
        this.zzc = zzccVar;
        this.zzb = new Handler(looper);
    }

    private final void zzf() {
        int i10 = this.zze;
        if (i10 == 1 || i10 == 0 || this.zzh == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.zza.zza();
        zzch zzchVar = this.zzh;
        if (Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(zzchVar.zzc());
        } else {
            audioManager.abandonAudioFocus(zzchVar.zzb());
        }
    }

    private final void zzg(int i10) {
        if (this.zze == i10) {
            return;
        }
        this.zze = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.zzg != f10) {
            this.zzg = f10;
            zzcc zzccVar = this.zzc;
            if (zzccVar != null) {
                zzccVar.zza(f10);
            }
        }
    }

    private final void zzh(int i10) {
        zzcc zzccVar = this.zzc;
        if (zzccVar != null) {
            zzccVar.zzb(i10);
        }
    }

    public final float zza() {
        return this.zzg;
    }

    public final void zzb(zzd zzdVar) {
        if (Objects.equals(this.zzd, zzdVar)) {
            return;
        }
        this.zzd = zzdVar;
        this.zzf = zzdVar == null ? 0 : 1;
    }

    public final int zzc(boolean z10, int i10) {
        int iRequestAudioFocus;
        if (i10 == 1 || this.zzf != 1) {
            zzf();
            zzg(0);
            return 1;
        }
        int i11 = 3;
        if (!z10) {
            int i12 = this.zze;
            if (i12 != 1) {
                return i12 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.zze == 2) {
            return 1;
        }
        if (this.zzh == null) {
            zzce zzceVar = new zzce(1);
            zzd zzdVar = this.zzd;
            zzdVar.getClass();
            zzceVar.zzb(zzdVar);
            zzceVar.zzc(true);
            zzceVar.zza(new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.zzca
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final /* synthetic */ void onAudioFocusChange(int i13) {
                    this.zza.zze(i13);
                }
            }, this.zzb);
            this.zzh = zzceVar.zzd();
        }
        AudioManager audioManager = (AudioManager) this.zza.zza();
        zzch zzchVar = this.zzh;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            iRequestAudioFocus = audioManager.requestAudioFocus(zzchVar.zzc());
        } else {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListenerZzb = zzchVar.zzb();
            zzd zzdVarZza = zzchVar.zza();
            if (i13 >= 26) {
                try {
                    int volumeControlStream = zzdVarZza.zza().getVolumeControlStream();
                    if (volumeControlStream != Integer.MIN_VALUE) {
                        i11 = volumeControlStream;
                    }
                } catch (RuntimeException unused) {
                }
            }
            iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListenerZzb, i11, 1);
        }
        if (iRequestAudioFocus == 1 || iRequestAudioFocus == 2) {
            zzg(2);
            return 1;
        }
        zzg(1);
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        zzf();
        zzg(0);
    }

    final /* synthetic */ void zze(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                zzg(4);
                return;
            } else {
                zzh(0);
                zzg(3);
                return;
            }
        }
        if (i10 == -1) {
            zzh(-1);
            zzf();
            zzg(1);
        } else if (i10 == 1) {
            zzg(2);
            zzh(1);
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
            sb2.append("Unknown focus change type: ");
            sb2.append(i10);
            zzeg.zzc("AudioFocusManager", sb2.toString());
        }
    }
}
