package x7;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: Clock.java */
/* JADX INFO: loaded from: classes4.dex */
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f28124a = new d0();

    long a();

    n b(Looper looper, Handler.Callback callback);

    void c();

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();
}
