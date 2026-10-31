package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgk extends zzadp implements zzafd {
    private zzgk() {
        throw null;
    }

    public final int zza() {
        return ((zzgl) this.zza).zzf();
    }

    public final zzgj zzb(int i10) {
        return ((zzgl) this.zza).zzh(i10);
    }

    public final zzgk zzc(int i10, zzgi zzgiVar) {
        zzaY();
        ((zzgl) this.zza).zzu(i10, (zzgj) zzgiVar.zzbd());
        return this;
    }

    public final List zzd() {
        return Collections.unmodifiableList(((zzgl) this.zza).zzi());
    }

    public final zzgk zze() {
        zzaY();
        ((zzgl) this.zza).zzv();
        return this;
    }

    public final zzgk zzf() {
        zzaY();
        ((zzgl) this.zza).zzw();
        return this;
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzgl) this.zza).zzl());
    }

    public final String zzh() {
        return ((zzgl) this.zza).zzm();
    }

    public final List zzi() {
        return Collections.unmodifiableList(((zzgl) this.zza).zzr());
    }

    /* synthetic */ zzgk(byte[] bArr) {
        super(zzgl.zzw);
    }
}
