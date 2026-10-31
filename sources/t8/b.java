package t8;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import io.bidmachine.media3.common.util.GlUtil;

/* JADX INFO: compiled from: PlaceholderSurface.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f25620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f25621e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThreadC0427b f25623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25624c;

    /* JADX INFO: renamed from: t8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PlaceholderSurface.java */
    private static class HandlerThreadC0427b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.bidmachine.media3.common.util.a f25625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f25626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f25627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f25628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b f25629e;

        public HandlerThreadC0427b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void c(int i10) throws GlUtil.GlException {
            x7.a.e(this.f25625a);
            this.f25625a.i(i10);
            this.f25629e = new b(this, this.f25625a.h(), i10 != 0);
        }

        private void e() {
            x7.a.e(this.f25625a);
            this.f25625a.j();
        }

        public b a(int i10) {
            boolean z10;
            start();
            this.f25626b = new Handler(getLooper(), this);
            this.f25625a = new io.bidmachine.media3.common.util.a(this.f25626b);
            synchronized (this) {
                z10 = false;
                this.f25626b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f25629e == null && this.f25628d == null && this.f25627c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f25628d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f25627c;
            if (error == null) {
                return (b) x7.a.e(this.f25629e);
            }
            throw error;
        }

        public void d() {
            x7.a.e(this.f25626b);
            this.f25626b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        e();
                    } catch (Throwable th) {
                        try {
                            x7.r.d("PlaceholderSurface", "Failed to release placeholder surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    c(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e10) {
                    x7.r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f25628d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    x7.r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f25627c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    x7.r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f25628d = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    private static int a(Context context) {
        if (GlUtil.i(context)) {
            return GlUtil.j() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        if (!f25621e) {
            f25620d = a(context);
            f25621e = true;
        }
        return f25620d != 0;
    }

    public static b c(Context context, boolean z10) {
        x7.a.g(!z10 || b(context));
        return new HandlerThreadC0427b().a(z10 ? f25620d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f25623b) {
            if (!this.f25624c) {
                this.f25623b.d();
                this.f25624c = true;
            }
        }
    }

    private b(HandlerThreadC0427b handlerThreadC0427b, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f25623b = handlerThreadC0427b;
        this.f25622a = z10;
    }
}
