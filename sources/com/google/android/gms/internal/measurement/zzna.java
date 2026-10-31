package com.google.android.gms.internal.measurement;

import fd.b;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzna implements zzrt {
    private final boolean zza;

    public zzna(boolean z10) {
        this.zza = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object zza(zzrs openContext) throws IOException {
        zznd zzndVarZzb;
        t.f(openContext, "openContext");
        InputStream inputStreamZzc = zzst.zzc(openContext);
        try {
            int i10 = 4096;
            if (this.zza) {
                if (inputStreamZzc instanceof zzsf) {
                    long length = ((zzsf) inputStreamZzc).zza().length();
                    if (length == 0) {
                        i10 = 512;
                    } else if (length < 4096) {
                        i10 = (int) length;
                    }
                }
                zzndVarZzb = zznd.zzb(zzacv.zzM(inputStreamZzc, i10), true);
                t.e(zzndVarZzb, "parseFrom(...)");
            } else {
                zzndVarZzb = zznd.zzb(zzacv.zzM(inputStreamZzc, 4096), false);
                t.e(zzndVarZzb, "parseFrom(...)");
            }
            b.a(inputStreamZzc, null);
            return zzndVarZzb;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(inputStreamZzc, th);
                throw th2;
            }
        }
    }
}
