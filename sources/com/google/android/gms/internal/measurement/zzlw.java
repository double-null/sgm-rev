package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.p;
import com.google.common.base.w;
import com.google.common.base.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlw {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb = new Object();
    private static volatile zzlt zzc = null;
    private static volatile boolean zzd = false;
    private static final AtomicInteger zze;

    static {
        new AtomicReference();
        p.m(zzlu.zza, "BuildInfo must be non-null");
        zze = new AtomicInteger();
    }

    public static void zza(final Context context) {
        if (zzc != null || context == null) {
            return;
        }
        Object obj = zzb;
        synchronized (obj) {
            if (zzc == null) {
                synchronized (obj) {
                    zzlt zzltVar = zzc;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzltVar == null || zzltVar.zza() != context) {
                        if (zzltVar != null) {
                            zzld.zza();
                            zzma.zza();
                        }
                        zzc = new zzlc(context, x.a(new w() { // from class: com.google.android.gms.internal.measurement.zzlv
                            @Override // com.google.common.base.w
                            public final /* synthetic */ Object get() {
                                int i10 = zzlw.zza;
                                return zzlf.zza(context);
                            }
                        }));
                        zze.incrementAndGet();
                    }
                }
            }
        }
    }
}
