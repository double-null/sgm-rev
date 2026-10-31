package b8;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: compiled from: PlaybackLooperProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f4170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f4171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4172d;

    public x() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f4169a) {
            if (this.f4170b == null) {
                x7.a.g(this.f4172d == 0 && this.f4171c == null);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.f4171c = handlerThread;
                handlerThread.start();
                this.f4170b = this.f4171c.getLooper();
            }
            this.f4172d++;
            looper = this.f4170b;
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f4169a) {
            x7.a.g(this.f4172d > 0);
            int i10 = this.f4172d - 1;
            this.f4172d = i10;
            if (i10 == 0 && (handlerThread = this.f4171c) != null) {
                handlerThread.quit();
                this.f4171c = null;
                this.f4170b = null;
            }
        }
    }

    public x(Looper looper) {
        this.f4169a = new Object();
        this.f4170b = looper;
        this.f4171c = null;
        this.f4172d = 0;
    }
}
