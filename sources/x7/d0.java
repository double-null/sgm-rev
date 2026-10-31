package x7;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes4.dex */
public class d0 implements h {
    protected d0() {
    }

    @Override // x7.h
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // x7.h
    public n b(Looper looper, Handler.Callback callback) {
        return new e0(new Handler(looper, callback));
    }

    @Override // x7.h
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // x7.h
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // x7.h
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // x7.h
    public void c() {
    }
}
