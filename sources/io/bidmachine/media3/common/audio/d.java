package io.bidmachine.media3.common.audio;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import x7.l0;

/* JADX INFO: compiled from: SonicAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f17978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f17979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AudioProcessor.a f17980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioProcessor.a f17981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioProcessor.a f17982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AudioProcessor.a f17983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f17985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ByteBuffer f17986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ShortBuffer f17987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ByteBuffer f17988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f17989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f17990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17991q;

    public d() {
        this(false);
    }

    private boolean a() {
        return Math.abs(this.f17978d - 1.0f) < 1.0E-4f && Math.abs(this.f17979e - 1.0f) < 1.0E-4f && this.f17981g.f17936a == this.f17980f.f17936a;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public boolean b() {
        c cVar;
        return this.f17991q && ((cVar = this.f17985k) == null || cVar.k() == 0);
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public boolean c() {
        return this.f17981g.f17936a != -1 && (this.f17976b || !a());
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public AudioProcessor.a d(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f17938c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f17977c;
        if (i10 == -1) {
            i10 = aVar.f17936a;
        }
        this.f17980f = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f17937b, 2);
        this.f17981g = aVar2;
        this.f17984j = true;
        return aVar2;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public ByteBuffer e() {
        int iK;
        c cVar = this.f17985k;
        if (cVar != null && (iK = cVar.k()) > 0) {
            if (this.f17986l.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f17986l = byteBufferOrder;
                this.f17987m = byteBufferOrder.asShortBuffer();
            } else {
                this.f17986l.clear();
                this.f17987m.clear();
            }
            cVar.j(this.f17987m);
            this.f17990p += (long) iK;
            this.f17986l.limit(iK);
            this.f17988n = this.f17986l;
        }
        ByteBuffer byteBuffer = this.f17988n;
        this.f17988n = AudioProcessor.f17933a;
        return byteBuffer;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            c cVar = (c) x7.a.e(this.f17985k);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f17989o += (long) iRemaining;
            cVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public void flush() {
        if (c()) {
            AudioProcessor.a aVar = this.f17980f;
            this.f17982h = aVar;
            AudioProcessor.a aVar2 = this.f17981g;
            this.f17983i = aVar2;
            if (this.f17984j) {
                this.f17985k = new c(aVar.f17936a, aVar.f17937b, this.f17978d, this.f17979e, aVar2.f17936a);
            } else {
                c cVar = this.f17985k;
                if (cVar != null) {
                    cVar.i();
                }
            }
        }
        this.f17988n = AudioProcessor.f17933a;
        this.f17989o = 0L;
        this.f17990p = 0L;
        this.f17991q = false;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public void g() {
        c cVar = this.f17985k;
        if (cVar != null) {
            cVar.s();
        }
        this.f17991q = true;
    }

    public long h(long j10) {
        if (this.f17990p < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (((double) this.f17978d) * j10);
        }
        long jL = this.f17989o - ((long) ((c) x7.a.e(this.f17985k)).l());
        int i10 = this.f17983i.f17936a;
        int i11 = this.f17982h.f17936a;
        return i10 == i11 ? l0.f1(j10, jL, this.f17990p) : l0.f1(j10, jL * ((long) i10), this.f17990p * ((long) i11));
    }

    public void i(float f10) {
        x7.a.a(f10 > 0.0f);
        if (this.f17979e != f10) {
            this.f17979e = f10;
            this.f17984j = true;
        }
    }

    public void j(float f10) {
        x7.a.a(f10 > 0.0f);
        if (this.f17978d != f10) {
            this.f17978d = f10;
            this.f17984j = true;
        }
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public void reset() {
        this.f17978d = 1.0f;
        this.f17979e = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f17935e;
        this.f17980f = aVar;
        this.f17981g = aVar;
        this.f17982h = aVar;
        this.f17983i = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f17933a;
        this.f17986l = byteBuffer;
        this.f17987m = byteBuffer.asShortBuffer();
        this.f17988n = byteBuffer;
        this.f17977c = -1;
        this.f17984j = false;
        this.f17985k = null;
        this.f17989o = 0L;
        this.f17990p = 0L;
        this.f17991q = false;
    }

    d(boolean z10) {
        this.f17978d = 1.0f;
        this.f17979e = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f17935e;
        this.f17980f = aVar;
        this.f17981g = aVar;
        this.f17982h = aVar;
        this.f17983i = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f17933a;
        this.f17986l = byteBuffer;
        this.f17987m = byteBuffer.asShortBuffer();
        this.f17988n = byteBuffer;
        this.f17977c = -1;
        this.f17976b = z10;
    }
}
