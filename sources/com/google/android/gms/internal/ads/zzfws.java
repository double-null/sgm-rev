package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfws implements zzfvt {
    private static final zzfws zza = new zzfws();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfwo();
    private static final Runnable zzl = new zzfwp();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfwl zzh = new zzfwl();
    private final zzfvv zzg = new zzfvv();
    private final zzfwm zzi = new zzfwm(new zzfwv());

    zzfws() {
    }

    public static zzfws zzb() {
        return zza;
    }

    private final void zzk(View view, zzfvu zzfvuVar, JSONObject jSONObject, int i10, boolean z10) {
        zzfvuVar.zzb(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvt
    public final void zza(View view, zzfvu zzfvuVar, JSONObject jSONObject, boolean z10) {
        zzfwl zzfwlVar;
        int iZzl;
        boolean z11;
        if (zzfwj.zza(view) != null || (iZzl = (zzfwlVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfvuVar.zza(view);
        zzfwe.zze(jSONObject, jSONObjectZza);
        String strZzg = zzfwlVar.zzg(view);
        if (strZzg != null) {
            zzfwe.zzd(jSONObjectZza, strZzg);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e10) {
                zzfwf.zza("Error with setting has window focus", e10);
            }
            Boolean boolValueOf = Boolean.valueOf(this.zzh.zzk(strZzg));
            if (boolValueOf.booleanValue()) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (JSONException e11) {
                    zzfwf.zza("Error with setting is picture-in-picture active", e11);
                }
            }
            this.zzh.zzf();
        } else {
            zzfwk zzfwkVarZzi = zzfwlVar.zzi(view);
            if (zzfwkVarZzi != null) {
                zzfvl zzfvlVarZzb = zzfwkVarZzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzc = zzfwkVarZzi.zzc();
                int size = arrayListZzc.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put((String) arrayListZzc.get(i10));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfvlVarZzb.zzb());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfvlVarZzb.zzc());
                    jSONObjectZza.put("friendlyObstructionReason", zzfvlVarZzb.zzd());
                } catch (JSONException e12) {
                    zzfwf.zza("Error with setting friendly obstruction", e12);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            zzk(view, zzfvuVar, jSONObjectZza, iZzl, z10 || z11);
        }
        this.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfwn(this));
    }

    public final void zze() {
        zzl();
    }

    final /* synthetic */ void zzf() {
        this.zze = 0;
        this.zzf.clear();
        for (zzfuo zzfuoVar : zzfvi.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfwl zzfwlVar = this.zzh;
        zzfwlVar.zzd();
        zzfvv zzfvvVar = this.zzg;
        long jNanoTime = System.nanoTime();
        zzfvu zzfvuVarZza = zzfvvVar.zza();
        if (zzfwlVar.zzb().size() > 0) {
            for (String str : zzfwlVar.zzb()) {
                JSONObject jSONObjectZza = zzfvuVarZza.zza(null);
                View viewZzh = zzfwlVar.zzh(str);
                zzfvu zzfvuVarZzb = zzfvvVar.zzb();
                String strZzc = zzfwlVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfvuVarZzb.zza(viewZzh);
                    zzfwe.zzd(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e10) {
                        zzfwf.zza("Error with setting not visible reason", e10);
                    }
                    zzfwe.zze(jSONObjectZza, jSONObjectZza2);
                }
                zzfwe.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfwl zzfwlVar2 = this.zzh;
        if (zzfwlVar2.zza().size() > 0) {
            JSONObject jSONObjectZza3 = zzfvuVarZza.zza(null);
            zzk(null, zzfvuVarZza, jSONObjectZza3, 1, false);
            zzfwe.zzf(jSONObjectZza3);
            this.zzi.zza(jSONObjectZza3, zzfwlVar2.zza(), jNanoTime);
        } else {
            this.zzi.zzc();
        }
        zzfwlVar2.zze();
        long jNanoTime2 = System.nanoTime() - this.zzj;
        List<zzfwr> list = this.zzd;
        if (list.size() > 0) {
            for (zzfwr zzfwrVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfwrVar.zzb();
                if (zzfwrVar instanceof zzfwq) {
                    ((zzfwq) zzfwrVar).zza();
                }
            }
        }
        zzfvs.zza().zzc();
    }

    final /* synthetic */ zzfwm zzh() {
        return this.zzi;
    }
}
