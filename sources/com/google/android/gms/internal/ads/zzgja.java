package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgja extends zzgix {
    private final Map zza;
    private final zzght zzb;
    private final DisplayMetrics zzc;

    zzgja(zzaxm zzaxmVar, zzght zzghtVar, Map map, DisplayMetrics displayMetrics, zzgqh zzgqhVar) {
        super("g8Hou5USbHgGLmPw1BkH9QPyVyp2SXRCRzY3yGPbL7sxfyxqHR6KXwoo/P2bI6wU", "utPmmlJBn3DsRsjWpEfYOH8JhF0hoTbnHHSBi5azvE0=", zzaxmVar, zzghtVar, zzgqhVar.zza(123));
        this.zzb = zzghtVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / ((double) displayMetrics.density));
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr = (Object[]) method.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
        objArr.getClass();
        zzayi zzayiVarZza = zzayj.zza();
        Object obj = objArr[0];
        if (obj != null && objArr[1] != null) {
            zzayiVarZza.zza(((Long) obj).longValue());
            zzayiVarZza.zzb(((Long) objArr[1]).longValue());
        }
        Object obj2 = objArr[2];
        if (obj2 != null) {
            zzayiVarZza.zzh(((Long) obj2).longValue());
        }
        Object obj3 = objArr[3];
        if (obj3 != null) {
            zzayiVarZza.zzf(((Long) obj3).longValue());
        }
        Object obj4 = objArr[4];
        if (obj4 != null) {
            zzayiVarZza.zzc(((Long) obj4).longValue());
        }
        Object obj5 = objArr[5];
        if (obj5 != null) {
            zzayiVarZza.zzs(((Long) obj5).longValue() != 0 ? 2 : 1);
        }
        Object obj6 = objArr[6];
        if (obj6 != null) {
            zzayiVarZza.zzj(((Long) obj6).longValue());
        }
        Object obj7 = objArr[7];
        if (obj7 != null) {
            zzayiVarZza.zzi(((Long) obj7).longValue());
        }
        Object obj8 = objArr[8];
        if (obj8 != null) {
            zzayiVarZza.zzt(((Long) obj8).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzaxmVar) {
            Method methodZzc = this.zzb.zzc("RYti6RI2h2/Y2PXof3Gp1AbX+o/wefouwN7AnDg2eTa2HyxUpoBLBymHRKB/R/xV", "RPcTI+OBxtVdwgZKiN6UGH5Wjl+q93TfecmKmwPvnok=");
            methodZzc.getClass();
            Object[] objArr2 = (Object[]) methodZzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
            objArr2.getClass();
            Object obj9 = objArr2[0];
            if (obj9 != null) {
                zzaxmVar.zzh(((Long) obj9).longValue());
            }
            Object obj10 = objArr2[1];
            if (obj10 != null) {
                zzaxmVar.zzi(((Long) obj10).longValue());
            }
            Object obj11 = objArr2[2];
            if (obj11 != null) {
                zzaxmVar.zzj(((Long) obj11).longValue());
            }
            Object obj12 = objArr2[3];
            if (obj12 != null) {
                zzaxmVar.zzv(((Long) obj12).longValue());
            }
            Object obj13 = objArr2[4];
            if (obj13 != null) {
                zzaxmVar.zzw(((Long) obj13).longValue());
            }
            zzggn zzggnVar = (zzggn) map.get("oe");
            if (zzggnVar != null) {
                long j10 = zzggnVar.zza;
                if (j10 > 0) {
                    zzaxmVar.zzz(j10);
                }
                long j11 = zzggnVar.zzb;
                if (j11 > 0) {
                    zzaxmVar.zzy(j11);
                }
                long j12 = zzggnVar.zzc;
                if (j12 > 0) {
                    zzaxmVar.zzx(j12);
                }
                long j13 = zzggnVar.zzd;
                if (j13 > 0) {
                    zzaxmVar.zzA(j13);
                }
            }
            zzggn zzggnVar2 = (zzggn) map.get("oe");
            if (zzggnVar2 != null && zzggnVar2.zza != 0 && zzc(displayMetrics)) {
                double d10 = zzggnVar2.zze;
                displayMetrics.getClass();
                zzayiVarZza.zzl(zzb(d10, displayMetrics));
                zzayiVarZza.zzm(zzb(zzggnVar2.zzh - zzggnVar2.zzf, displayMetrics));
                zzayiVarZza.zzn(zzb(zzggnVar2.zzi - zzggnVar2.zzg, displayMetrics));
                zzayiVarZza.zzq(zzb(zzggnVar2.zzf, displayMetrics));
                zzayiVarZza.zzr(zzb(zzggnVar2.zzg, displayMetrics));
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                if (motionEvent != null) {
                    long jZzb = zzb(((zzggnVar2.zzf - zzggnVar2.zzh) + motionEvent.getRawX()) - motionEvent.getX(), displayMetrics);
                    if (jZzb != 0) {
                        zzayiVarZza.zzo(jZzb);
                    }
                    long jZzb2 = zzb(((zzggnVar2.zzg - zzggnVar2.zzi) + motionEvent.getRawY()) - motionEvent.getY(), displayMetrics);
                    if (jZzb2 != 0) {
                        zzayiVarZza.zzp(jZzb2);
                    }
                }
            }
            zzaxmVar.zzJ(zzayiVarZza);
            zzggo[] zzggoVarArr = (zzggo[]) map.get("ro");
            if (zzggoVarArr != null && zzc(displayMetrics)) {
                for (int i10 = 0; i10 <= zzggoVarArr.length - 2; i10++) {
                    zzggo zzggoVar = zzggoVarArr[i10];
                    zzayi zzayiVarZza2 = zzayj.zza();
                    double d11 = zzggoVar.zza;
                    displayMetrics.getClass();
                    zzayiVarZza2.zza(zzb(d11, displayMetrics));
                    zzayiVarZza2.zzb(zzb(zzggoVar.zzb, displayMetrics));
                    zzaxmVar.zzK((zzayj) zzayiVarZza2.zzbu());
                }
            }
        }
    }
}
