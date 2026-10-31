package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaa implements zzz {
    private final zzad zza = new zzad();
    private volatile zzz zzb;

    zzaa(zzz zzzVar) {
        this.zzb = zzzVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == null) {
            obj = "<supplier that returned null>";
        }
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
