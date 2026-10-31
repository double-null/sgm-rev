package io.bidmachine.media3.decoder;

import a8.a;
import a8.c;
import java.nio.ByteBuffer;
import u7.q;
import u7.t;

/* JADX INFO: loaded from: classes4.dex */
public class DecoderInputBuffer extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f18055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f18056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f18057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f18060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f18061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f18062i;

    public static final class InsufficientCapacityException extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18064b;

        public InsufficientCapacityException(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f18063a = i10;
            this.f18064b = i11;
        }
    }

    static {
        t.a("media3.decoder");
    }

    public DecoderInputBuffer(int i10) {
        this(i10, 0);
    }

    private ByteBuffer p(int i10) {
        int i11 = this.f18061h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f18057d;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static DecoderInputBuffer t() {
        return new DecoderInputBuffer(0);
    }

    @Override // a8.a
    public void g() {
        super.g();
        ByteBuffer byteBuffer = this.f18057d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f18060g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f18058e = false;
    }

    public void q(int i10) {
        int i11 = i10 + this.f18062i;
        ByteBuffer byteBuffer = this.f18057d;
        if (byteBuffer == null) {
            this.f18057d = p(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f18057d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferP = p(i12);
        byteBufferP.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferP.put(byteBuffer);
        }
        this.f18057d = byteBufferP;
    }

    public final void r() {
        ByteBuffer byteBuffer = this.f18057d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f18060g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean s() {
        return h(1073741824);
    }

    public void u(int i10) {
        ByteBuffer byteBuffer = this.f18060g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f18060g = ByteBuffer.allocate(i10);
        } else {
            this.f18060g.clear();
        }
    }

    public DecoderInputBuffer(int i10, int i11) {
        this.f18056c = new c();
        this.f18061h = i10;
        this.f18062i = i11;
    }
}
