package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import x7.l0;

/* JADX INFO: compiled from: AsynchronousMediaCodecCallback.java */
/* JADX INFO: loaded from: classes4.dex */
final class e extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f19259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f19260c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f19265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f19266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f19267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f19268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IllegalStateException f19271n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private h.c f19272o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19258a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.collection.c f19261d = new androidx.collection.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.collection.c f19262e = new androidx.collection.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f19263f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f19264g = new ArrayDeque<>();

    e(HandlerThread handlerThread) {
        this.f19259b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f19262e.a(-2);
        this.f19264g.add(mediaFormat);
    }

    private void f() {
        if (!this.f19264g.isEmpty()) {
            this.f19266i = this.f19264g.getLast();
        }
        this.f19261d.b();
        this.f19262e.b();
        this.f19263f.clear();
        this.f19264g.clear();
    }

    private boolean i() {
        return this.f19269l > 0 || this.f19270m;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f19271n;
        if (illegalStateException == null) {
            return;
        }
        this.f19271n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f19268k;
        if (cryptoException == null) {
            return;
        }
        this.f19268k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f19267j;
        if (codecException == null) {
            return;
        }
        this.f19267j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f19258a) {
            if (this.f19270m) {
                return;
            }
            long j10 = this.f19269l - 1;
            this.f19269l = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                o(new IllegalStateException());
            } else {
                f();
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f19258a) {
            this.f19271n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f19258a) {
            j();
            int iE = -1;
            if (i()) {
                return -1;
            }
            if (!this.f19261d.d()) {
                iE = this.f19261d.e();
            }
            return iE;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f19258a) {
            j();
            if (i()) {
                return -1;
            }
            if (this.f19262e.d()) {
                return -1;
            }
            int iE = this.f19262e.e();
            if (iE >= 0) {
                x7.a.i(this.f19265h);
                MediaCodec.BufferInfo bufferInfoRemove = this.f19263f.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iE == -2) {
                this.f19265h = this.f19264g.remove();
            }
            return iE;
        }
    }

    public void e() {
        synchronized (this.f19258a) {
            this.f19269l++;
            ((Handler) l0.i(this.f19260c)).post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.mediacodec.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19257a.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f19258a) {
            mediaFormat = this.f19265h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        x7.a.g(this.f19260c == null);
        this.f19259b.start();
        Handler handler = new Handler(this.f19259b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f19260c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f19258a) {
            this.f19268k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f19258a) {
            this.f19267j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f19258a) {
            this.f19261d.a(i10);
            h.c cVar = this.f19272o;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f19258a) {
            MediaFormat mediaFormat = this.f19266i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f19266i = null;
            }
            this.f19262e.a(i10);
            this.f19263f.add(bufferInfo);
            h.c cVar = this.f19272o;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f19258a) {
            b(mediaFormat);
            this.f19266i = null;
        }
    }

    public void p(h.c cVar) {
        synchronized (this.f19258a) {
            this.f19272o = cVar;
        }
    }

    public void q() {
        synchronized (this.f19258a) {
            this.f19270m = true;
            this.f19259b.quit();
            f();
        }
    }
}
