package com.google.android.gms.internal.common;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzai extends zzaf {
    public zzai() {
        super(4);
    }

    public final zzai zzb(Object obj) {
        super.zza(obj);
        return this;
    }

    public final zzai zzc(Iterator it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    public final zzam zzd() {
        this.zzc = true;
        return zzam.zzq(this.zza, this.zzb);
    }

    zzai(int i10) {
        super(4);
    }
}
