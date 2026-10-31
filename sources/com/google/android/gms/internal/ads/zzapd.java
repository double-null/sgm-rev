package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzapd implements zzanl {
    private final zzet zza = new zzet();
    private final zzaou zzb = new zzaou();

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i10, int i11, zzank zzankVar, zzdt zzdtVar) {
        zzet zzetVar = this.zza;
        zzetVar.zzb(bArr, i11 + i10);
        zzetVar.zzh(i10);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzetVar.zzg();
            String strZzN = zzetVar.zzN(StandardCharsets.UTF_8);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzetVar.zzh(iZzg);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzetVar.zzN(StandardCharsets.UTF_8))), null);
            }
            while (!TextUtils.isEmpty(zzetVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b10 = -1;
                int iZzg2 = 0;
                while (b10 == -1) {
                    iZzg2 = zzetVar.zzg();
                    String strZzN2 = zzetVar.zzN(StandardCharsets.UTF_8);
                    if (strZzN2 == null) {
                        b10 = 0;
                    } else if ("STYLE".equals(strZzN2)) {
                        b10 = 2;
                    } else {
                        b10 = strZzN2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                zzetVar.zzh(iZzg2);
                if (b10 == 0) {
                    zzanf.zza(new zzapg(arrayList2), zzankVar, zzdtVar);
                    return;
                }
                if (b10 == 1) {
                    while (!TextUtils.isEmpty(zzetVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (b10 != 2) {
                    zzaow zzaowVarZza = zzapc.zza(zzetVar, arrayList);
                    if (zzaowVarZza != null) {
                        arrayList2.add(zzaowVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzetVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzetVar));
                }
            }
        } catch (zzat e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
