package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.adjust.sdk.network.ErrorCodes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbal implements zzbak {
    protected static volatile zzbbs zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzbbk zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected zzbal(Context context) {
        try {
            zzazo.zza();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdG)).booleanValue()) {
                this.zzr = new zzbbk();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzo() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        LinkedList linkedList = this.zzc;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3 A[Catch: Exception -> 0x00ed, TryCatch #0 {Exception -> 0x00ed, blocks: (B:45:0x00a6, B:48:0x00b3, B:57:0x00d7, B:58:0x00e7), top: B:73:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7 A[Catch: Exception -> 0x00ed, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ed, blocks: (B:45:0x00a6, B:48:0x00b3, B:57:0x00d7, B:58:0x00e7), top: B:73:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final String zzp(Context context, String str, int i10, View view, Activity activity, byte[] bArr) {
        zzbaj zzbajVarZzh;
        String str2;
        int i11;
        Exception exc;
        int i12;
        int i13;
        long jCurrentTimeMillis;
        String strZzb;
        int i14;
        int i15;
        zzaxm zzaxmVarZza;
        int i16;
        int i17;
        int i18 = i10;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdv)).booleanValue();
        zzaxm zzaxmVarZzb = null;
        if (zBooleanValue) {
            zzbajVarZzh = zza != null ? zza.zzh() : null;
            str2 = "be";
        } else {
            zzbajVarZzh = null;
            str2 = null;
        }
        int i19 = 1;
        try {
            if (i18 == 3) {
                zzaxmVarZzb = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i17 = 1002;
                } catch (Exception e10) {
                    exc = e10;
                    i11 = 3;
                    i19 = 1;
                    if (!zBooleanValue) {
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzaxmVarZzb != null) {
                        try {
                            if (((zzaym) zzaxmVarZzb.zzbu()).zzbr() == 0) {
                                strZzb = Integer.toString(5);
                            } else {
                                zzaym zzaymVar = (zzaym) zzaxmVarZzb.zzbu();
                                int i20 = zzazo.zzc;
                                strZzb = zzazo.zzb(zzaymVar.zzaN(), str);
                                if (zBooleanValue) {
                                    if (i18 == i11) {
                                        i14 = ErrorCodes.SSL_HANDSHAKE_EXCEPTION;
                                    } else if (i18 == i12) {
                                        i14 = 1010;
                                    } else {
                                        i14 = 1004;
                                    }
                                    zzbajVarZzh.zza(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (Exception e11) {
                            strZzb = Integer.toString(7);
                            if (zBooleanValue && zzbajVarZzh != null) {
                                if (i18 == i11) {
                                    i15 = ErrorCodes.IO_EXCEPTION;
                                } else {
                                    i15 = i18 == i12 ? 1011 : 1005;
                                }
                                zzbajVarZzh.zza(i15, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e11);
                            }
                        }
                    } else {
                        strZzb = Integer.toString(5);
                    }
                    return strZzb;
                }
            } else {
                if (i18 == 2) {
                    zzaxmVarZza = zzc(context, view, activity);
                    i16 = 1008;
                } else {
                    zzaxmVarZza = zza(context, null);
                    i16 = 1000;
                }
                zzaxmVarZzb = zzaxmVarZza;
                i17 = i16;
            }
            if (!zBooleanValue || zzbajVarZzh == null) {
                i11 = 3;
            } else {
                i11 = 3;
                try {
                    zzbajVarZzh.zza(i17, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (Exception e12) {
                    e = e12;
                    exc = e;
                    if (!zBooleanValue && zzbajVarZzh != null) {
                        if (i18 == i11) {
                            i13 = 1003;
                            i12 = 2;
                        } else {
                            i12 = 2;
                            if (i18 == 2) {
                                i13 = 1009;
                            } else {
                                i13 = 1001;
                                i18 = i19;
                            }
                        }
                        zzbajVarZzh.zza(i13, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzaxmVarZzb != null) {
                        strZzb = Integer.toString(5);
                    } else if (((zzaym) zzaxmVarZzb.zzbu()).zzbr() == 0) {
                        strZzb = Integer.toString(5);
                    } else {
                        zzaym zzaymVar2 = (zzaym) zzaxmVarZzb.zzbu();
                        int i21 = zzazo.zzc;
                        strZzb = zzazo.zzb(zzaymVar2.zzaN(), str);
                        if (zBooleanValue) {
                            if (i18 == i11) {
                                i14 = ErrorCodes.SSL_HANDSHAKE_EXCEPTION;
                            } else if (i18 == i12) {
                                i14 = 1010;
                            } else {
                                i14 = 1004;
                            }
                            zzbajVarZzh.zza(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                        }
                    }
                    return strZzb;
                }
            }
        } catch (Exception e13) {
            e = e13;
            i11 = 3;
        }
        i12 = 2;
        jCurrentTimeMillis = System.currentTimeMillis();
        if (zzaxmVarZzb != null) {
            strZzb = Integer.toString(5);
        } else if (((zzaym) zzaxmVarZzb.zzbu()).zzbr() == 0) {
            strZzb = Integer.toString(5);
        } else {
            zzaym zzaymVar3 = (zzaym) zzaxmVarZzb.zzbu();
            int i22 = zzazo.zzc;
            strZzb = zzazo.zzb(zzaymVar3.zzaN(), str);
            if (zBooleanValue && zzbajVarZzh != null) {
                if (i18 == i11) {
                    i14 = ErrorCodes.SSL_HANDSHAKE_EXCEPTION;
                } else if (i18 == i12) {
                    i14 = 1010;
                } else {
                    i14 = 1004;
                }
                zzbajVarZzh.zza(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strZzb;
    }

    protected abstract zzaxm zza(Context context, zzawy zzawyVar);

    protected abstract zzaxm zzb(Context context, View view, Activity activity);

    protected abstract zzaxm zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzbak
    public final synchronized void zzd(MotionEvent motionEvent) {
        Long l10;
        if (this.zzu) {
            zzo();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d10 = rawX - this.zzs;
            double d11 = rawY - this.zzt;
            this.zzk += Math.sqrt((d10 * d10) + (d11 * d11));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.zzb = motionEventObtain;
                    LinkedList linkedList = this.zzc;
                    linkedList.add(motionEventObtain);
                    if (linkedList.size() > 6) {
                        ((MotionEvent) linkedList.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zzn(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += (long) (motionEvent.getHistorySize() + 1);
                    zzbbu zzbbuVarZzm = zzm(motionEvent);
                    Long l11 = zzbbuVarZzm.zzd;
                    if (l11 != null && zzbbuVarZzm.zzg != null) {
                        this.zzi += l11.longValue() + zzbbuVarZzm.zzg.longValue();
                    }
                    if (this.zzq != null && (l10 = zzbbuVarZzm.zze) != null && zzbbuVarZzm.zzh != null) {
                        this.zzj += l10.longValue() + zzbbuVarZzm.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzbbi unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final synchronized void zze(int i10, int i11, int i12) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdt)).booleanValue()) {
                zzo();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            float f10 = displayMetrics.density;
            this.zzb = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final String zzg(Context context, String str, View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbbk zzbbkVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdG)).booleanValue() || (zzbbkVar = this.zzr) == null) {
            return;
        }
        zzbbkVar.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final String zzj(Context context, View view, Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final String zzl(Context context) {
        if (zzbbv.zzd()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    protected abstract zzbbu zzm(MotionEvent motionEvent) throws zzbbi;

    protected abstract long zzn(StackTraceElement[] stackTraceElementArr) throws zzbbi;

    @Override // com.google.android.gms.internal.ads.zzbak
    public void zzh(View view) {
    }
}
