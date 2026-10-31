package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaab {
    private static final zzaad zza = zzb(zzaad.zzd);

    private static zzaad zzb(String[] strArr) {
        zzaaj zzaajVar;
        try {
            zzaajVar = zzaak.zza;
        } catch (NoClassDefFoundError unused) {
            zzaajVar = null;
        }
        if (zzaajVar != null) {
            return zzaajVar;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzaad) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                sb2.append('\n');
                sb2.append(str);
                sb2.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb2.append(th);
            }
        }
        throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
    }
}
