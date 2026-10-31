package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.base.m;
import com.google.common.base.p;
import com.google.common.base.w;
import com.google.common.base.x;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlj {
    private Context zza;
    private w zzb;
    private w zzc;
    private w zzd;
    private w zze;
    private w zzf;

    private zzlj() {
        throw null;
    }

    /* synthetic */ zzlj(byte[] bArr) {
    }

    public final zzlj zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzlk zzb() {
        p.l(this.zza);
        if (this.zzb == null) {
            this.zzb = zzlk.zzf;
        }
        if (this.zzc == null) {
            final Context context = this.zza;
            int i10 = zzlk.zza;
            this.zzc = x.a(new w() { // from class: com.google.android.gms.internal.measurement.zzln
                @Override // com.google.common.base.w
                public final /* synthetic */ Object get() {
                    int i11 = zzlk.zza;
                    return new zzmn(zzjx.zza(context));
                }
            });
        }
        if (this.zzd == null) {
            this.zzd = new w() { // from class: com.google.android.gms.internal.measurement.zzli
                @Override // com.google.common.base.w
                public final /* synthetic */ Object get() {
                    return this.zza.zzc();
                }
            };
        }
        if (this.zze == null) {
            Context context2 = this.zza;
            int i11 = zzlk.zza;
            final ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, zzrx.zza(context2).zza(), new zzsd());
            this.zze = x.a(new w() { // from class: com.google.android.gms.internal.measurement.zzlm
                @Override // com.google.common.base.w
                public final /* synthetic */ Object get() {
                    int i12 = zzlk.zza;
                    return new zzru(arrayList);
                }
            });
        }
        if (this.zzf == null) {
            this.zzf = new w() { // from class: com.google.android.gms.internal.measurement.zzlh
                @Override // com.google.common.base.w
                public final /* synthetic */ Object get() {
                    return this.zza.zzd();
                }
            };
        }
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }

    final /* synthetic */ m zzc() {
        return m.f(new zzqi(this.zzb, 10));
    }

    final /* synthetic */ m zzd() {
        Context context = this.zza;
        int i10 = zzlk.zza;
        try {
            return m.f(context.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return m.b();
        }
    }
}
