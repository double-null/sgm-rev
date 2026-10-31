package com.google.android.gms.internal.measurement;

import android.app.ActivityManager;
import android.util.Log;
import com.google.common.base.w;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzqh implements w {
    static final /* synthetic */ zzqh zza = new zzqh();

    private /* synthetic */ zzqh() {
    }

    @Override // com.google.common.base.w
    public final /* synthetic */ Object get() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        boolean z10 = false;
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i10 = runningAppProcessInfo.importance;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 17);
            sb2.append("Memory state is: ");
            sb2.append(i10);
            Log.i("PhenotypeProcessReaper", sb2.toString());
            if (runningAppProcessInfo.importance >= 400) {
                z10 = true;
            }
        } catch (RuntimeException e10) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e10);
        }
        return new Boolean(z10);
    }
}
