package androidx.core.os;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: CancellationSignal.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f1882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f1883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1884d;

    /* JADX INFO: compiled from: CancellationSignal.java */
    public interface a {
        void onCancel();
    }

    private void d() {
        while (this.f1884d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f1881a) {
                return;
            }
            this.f1881a = true;
            this.f1884d = true;
            a aVar = this.f1882b;
            Object obj = this.f1883c;
            if (aVar != null) {
                try {
                    aVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f1884d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f1884d = false;
                notifyAll();
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f1881a;
        }
        return z10;
    }

    public void c(a aVar) {
        synchronized (this) {
            d();
            if (this.f1882b == aVar) {
                return;
            }
            this.f1882b = aVar;
            if (this.f1881a && aVar != null) {
                aVar.onCancel();
            }
        }
    }
}
