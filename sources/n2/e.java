package n2;

import android.os.SystemClock;

/* JADX INFO: compiled from: UptimeClock.java */
/* JADX INFO: loaded from: classes3.dex */
public class e implements a {
    @Override // n2.a
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }
}
