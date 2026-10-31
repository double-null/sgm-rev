package a1;

import android.os.Trace;

/* JADX INFO: compiled from: TraceApi18Impl.java */
/* JADX INFO: loaded from: classes.dex */
final class c {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
