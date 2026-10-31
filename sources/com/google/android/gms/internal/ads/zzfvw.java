package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfvw implements zzfvu {
    private final zzfvu zza;

    public zzfvw(zzfvu zzfvuVar) {
        this.zza = zzfvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final JSONObject zza(View view) {
        JSONObject jSONObjectZzb = zzfwe.zzb(0, 0, 0, 0);
        int iZzb = zzfwh.zzb();
        int i10 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZzb.put("noOutputDevice", i10 == 0);
        } catch (JSONException e10) {
            zzfwf.zza("Error with setting output device status", e10);
        }
        return jSONObjectZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final void zzb(View view, JSONObject jSONObject, zzfvt zzfvtVar, boolean z10, boolean z11) {
        boolean z12;
        View rootView;
        ArrayList arrayList = new ArrayList();
        zzfvi zzfviVarZza = zzfvi.zza();
        if (zzfviVarZza != null) {
            Collection collectionZzf = zzfviVarZza.zzf();
            int size = collectionZzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzf.iterator();
            while (it.hasNext()) {
                View viewZzi = ((zzfuo) it.next()).zzi();
                if (viewZzi != null) {
                    if (!viewZzi.isAttachedToWindow() || !viewZzi.isShown()) {
                        z12 = false;
                        break;
                    }
                    View view2 = viewZzi;
                    while (true) {
                        if (view2 == null) {
                            z12 = true;
                            break;
                        } else if (view2.getAlpha() == 0.0f) {
                            z12 = false;
                            break;
                        } else {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                    if (z12 && (rootView = viewZzi.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                        identityHashMap.put(rootView, rootView);
                        float z13 = rootView.getZ();
                        int size2 = arrayList.size();
                        while (size2 > 0) {
                            int i10 = size2 - 1;
                            if (((View) arrayList.get(i10)).getZ() <= z13) {
                                break;
                            } else {
                                size2 = i10;
                            }
                        }
                        arrayList.add(size2, rootView);
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzfvtVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
