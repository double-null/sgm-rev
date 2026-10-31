package a3;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import z2.f;

/* JADX INFO: compiled from: BlockingAnalyticsEventLogger.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements a, AnalyticsEventLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f21a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f23c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CountDownLatch f25e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f24d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26f = false;

    public b(d dVar, int i10, TimeUnit timeUnit) {
        this.f21a = dVar;
        this.f22b = i10;
        this.f23c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void a(String str, Bundle bundle) {
        synchronized (this.f24d) {
            f.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f25e = new CountDownLatch(1);
            this.f26f = false;
            this.f21a.a(str, bundle);
            f.f().i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f25e.await(this.f22b, this.f23c)) {
                    this.f26f = true;
                    f.f().i("App exception callback received from Analytics listener.");
                } else {
                    f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f25e = null;
        }
    }

    @Override // a3.a
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f25e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
