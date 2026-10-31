package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.w;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlc extends zzlt {
    private final Context zza;
    private final w zzb;

    zzlc(Context context, w wVar) {
        this.zza = context;
        this.zzb = wVar;
    }

    public final boolean equals(Object obj) {
        w wVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzlt) {
            zzlt zzltVar = (zzlt) obj;
            if (this.zza.equals(zzltVar.zza()) && ((wVar = this.zzb) != null ? wVar.equals(zzltVar.zzb()) : zzltVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        w wVar = this.zzb;
        return (iHashCode * 1000003) ^ (wVar == null ? 0 : wVar.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    final w zzb() {
        return this.zzb;
    }
}
