package com.google.android.gms.common.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zas implements Executor {
    private static volatile zas zaa;
    private static Context zab;

    private zas() {
    }

    public static zas zaa(Context context) {
        zas zasVar = zaa;
        if (zasVar == null) {
            synchronized (zas.class) {
                zasVar = zaa;
                if (zasVar == null) {
                    zab = (Context) Preconditions.checkNotNull(context.getApplicationContext());
                    zas zasVar2 = new zas();
                    zaa = zasVar2;
                    zasVar = zasVar2;
                }
            }
        }
        return zasVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zar.zaa.post(runnable);
    }
}
