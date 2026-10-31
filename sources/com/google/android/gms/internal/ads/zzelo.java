package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzelo {
    private q0.a zza;
    private final Context zzb;

    zzelo(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        try {
            q0.a aVarA = q0.a.a(this.zzb);
            this.zza = aVarA;
            return aVarA == null ? zzhbw.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : aVarA.b();
        } catch (Exception e10) {
            return zzhbw.zzc(e10);
        }
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        try {
            q0.a aVar = this.zza;
            Objects.requireNonNull(aVar);
            return aVar.c(uri, inputEvent);
        } catch (Exception e10) {
            return zzhbw.zzc(e10);
        }
    }
}
