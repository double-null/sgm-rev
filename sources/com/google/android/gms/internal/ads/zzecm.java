package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzecm {
    private final zzebw zza;
    private final zzdwz zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzecm(zzebw zzebwVar, zzdwz zzdwzVar) {
        this.zza = zzebwVar;
        this.zzb = zzdwzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzdwy zzdwyVarZzc;
        zzdwy zzdwyVarZzc2;
        zzbxq zzbxqVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbrp zzbrpVar = (zzbrp) it.next();
                String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkK)).booleanValue() || (zzdwyVarZzc2 = this.zzb.zzc(zzbrpVar.zza)) == null || (zzbxqVar = zzdwyVarZzc2.zzc) == null) ? "" : zzbxqVar.toString();
                String str = string;
                boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkL)).booleanValue() && (zzdwyVarZzc = this.zzb.zzc(zzbrpVar.zza)) != null && zzdwyVarZzc.zzd;
                List list2 = this.zzd;
                String str2 = zzbrpVar.zza;
                list2.add(new zzecl(str2, str, this.zzb.zzd(str2), zzbrpVar.zzb ? 1 : 0, zzbrpVar.zzd, zzbrpVar.zzc, z10));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzb(new zzeck(this));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: all -> 0x003d, LOOP:0: B:13:0x0027->B:15:0x002d, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:9:0x001c, B:10:0x001f, B:12:0x0021, B:13:0x0027, B:15:0x002d, B:16:0x003b), top: B:21:0x0008 }] */
    public final JSONArray zzb() throws JSONException {
        Iterator it;
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (this.zze) {
                it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzecl) it.next()).zza());
                }
            } else {
                zzebw zzebwVar = this.zza;
                if (zzebwVar.zze()) {
                    zzc(zzebwVar.zzd());
                    it = this.zzd.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((zzecl) it.next()).zza());
                    }
                } else {
                    zza();
                }
            }
        }
        return jSONArray;
    }
}
