package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.j;
import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzxa {
    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    public static final Runnable zza(Runnable runnable) {
        t.f(runnable, "runnable");
        return new zzwz(new h0(), zzvy.zzb(false), runnable);
    }

    public static final i zzb(i asyncCallable) {
        t.f(asyncCallable, "asyncCallable");
        return new zzwx(zzvy.zzb(false), asyncCallable);
    }

    public static final j zzc(j asyncFunction) {
        t.f(asyncFunction, "asyncFunction");
        return new zzwy(zzvy.zzb(false), asyncFunction);
    }
}
