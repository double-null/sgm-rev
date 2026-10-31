package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzabv implements zzabu {
    zzabv() {
    }

    private static final int zzc(StackTraceElement[] stackTraceElementArr, Class cls, int i10) {
        String name = cls.getName();
        boolean z10 = false;
        for (int i11 = 3; i11 < stackTraceElementArr.length; i11++) {
            if (stackTraceElementArr[i11].getClassName().equals(name)) {
                z10 = true;
            } else if (z10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzabu
    public final StackTraceElement zza(Class cls, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iZzc = zzc(stackTrace, cls, 3);
        if (iZzc != -1) {
            return stackTrace[iZzc];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzabu
    public final StackTraceElement[] zzb(Class cls, int i10, int i11) {
        boolean z10 = true;
        if (i10 != -1 && i10 <= 0) {
            z10 = false;
        }
        zzabr.zzb(z10, "maxDepth must be > 0 or -1");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iZzc = zzc(stackTrace, cls, 3);
        if (iZzc == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - iZzc;
        if (i10 <= 0 || i10 >= length) {
            i10 = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i10];
        System.arraycopy(stackTrace, iZzc, stackTraceElementArr, 0, i10);
        return stackTraceElementArr;
    }
}
