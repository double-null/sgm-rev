package com.google.android.gms.internal.measurement;

import com.google.common.base.w;
import com.google.common.base.x;
import com.google.common.io.BaseEncoding;
import java.io.File;
import s2.g;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmz {
    private final BaseEncoding zza = BaseEncoding.a();
    private final w zzb;
    private final w zzc;

    public zzmz(final zzacr zzacrVar, final String str, String str2) {
        this.zzb = x.a(new w() { // from class: com.google.android.gms.internal.measurement.zzmy
            @Override // com.google.common.base.w
            public final /* synthetic */ Object get() {
                return this.zza.zzb(zzacrVar);
            }
        });
        final String str3 = "";
        this.zzc = x.a(new w(str, str3) { // from class: com.google.android.gms.internal.measurement.zzmx
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzc = "";

            @Override // com.google.common.base.w
            public final /* synthetic */ Object get() {
                return this.zza.zzc(this.zzb, this.zzc);
            }
        });
    }

    public final File zza() {
        String str = (String) this.zzb.get();
        String str2 = (String) this.zzc.get();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3);
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(".pb");
        return new File(sb2.toString());
    }

    final /* synthetic */ String zzb(zzacr zzacrVar) {
        return this.zza.b(zzacrVar.zzm());
    }

    final /* synthetic */ String zzc(String str, String str2) {
        return this.zza.b(g.a().b().a(str.getBytes()).c((byte) 0).a("".getBytes()).b().b());
    }
}
