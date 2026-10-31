package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfyo implements zzfxj {
    private final Object zza;
    private final zzfyp zzb;
    private final zzfza zzc;
    private final zzfxg zzd;
    private final boolean zze;

    zzfyo(Object obj, zzfyp zzfypVar, zzfza zzfzaVar, zzfxg zzfxgVar, boolean z10) {
        this.zza = obj;
        this.zzb = zzfypVar;
        this.zzc = zzfzaVar;
        this.zzd = zzfxgVar;
        this.zze = z10;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaze zzazeVarZza = zzazf.zza();
        zzazeVarZza.zzd(5);
        zzazeVarZza.zza(zzida.zzt(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzazf) zzazeVarZza.zzbu()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e10) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final synchronized String zza(Context context, String str) {
        byte[] bArrZzj;
        Map mapZzb = this.zzc.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        bArrZzj = zzj(null, mapZzb);
        if (this.zze) {
            mapZzb.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] bArrZzj;
        Map mapZzc = this.zzc.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put(ViewHierarchyConstants.VIEW_KEY, view);
        mapZzc.put("act", activity);
        bArrZzj = zzj(null, mapZzc);
        if (this.zze) {
            mapZzc.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] bArrZzj;
        Map mapZzd = this.zzc.zzd();
        mapZzd.put("f", "c");
        mapZzd.put("ctx", context);
        mapZzd.put("cs", str2);
        mapZzd.put("aid", null);
        mapZzd.put(ViewHierarchyConstants.VIEW_KEY, view);
        mapZzd.put("act", activity);
        bArrZzj = zzj(null, mapZzd);
        if (this.zze) {
            mapZzd.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfyy {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapZze = this.zzc.zze();
            mapZze.put("aid", null);
            mapZze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapZze);
            this.zzd.zzb(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzfyy(2005, e10);
        }
    }

    final zzfyp zze() {
        return this.zzb;
    }

    final synchronized boolean zzf() throws zzfyy {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e10) {
            throw new zzfyy(2001, e10);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzfyy {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod(MRAIDPresenter.CLOSE, new Class[0]).invoke(obj, new Object[0]);
            this.zzd.zzb(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzfyy(2003, e10);
        }
    }

    public final synchronized int zzh() throws zzfyy {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e10) {
            throw new zzfyy(2006, e10);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(obj, new Object[0])).intValue();
    }
}
