package com.google.android.gms.internal.ads;

import c2.YDwL.tFQWuE;
import java.io.Serializable;
import java.util.List;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgtl implements Serializable, zzgtk {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgtl) {
            return this.zza.equals(((zzgtl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    public final boolean zza(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.zza;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((zzgtk) list.get(i10)).zza(obj)) {
                return false;
            }
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(cNMUz.RPBtnwBapZenDD);
        sb2.append(tFQWuE.fVhgxCpxi);
        boolean z10 = true;
        for (Object obj : this.zza) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
