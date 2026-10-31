package u8;

import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.i2;
import java.nio.ByteBuffer;
import u7.q;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: CameraMotionRenderer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends io.bidmachine.media3.exoplayer.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final DecoderInputBuffer f26544r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a0 f26545s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f26546t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f26547u;

    public b() {
        super(6);
        this.f26544r = new DecoderInputBuffer(1);
        this.f26545s = new a0();
    }

    private float[] t0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f26545s.U(byteBuffer.array(), byteBuffer.limit());
        this.f26545s.W(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f26545s.u());
        }
        return fArr;
    }

    private void u0() {
        a aVar = this.f26546t;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public int a(q qVar) {
        return "application/x-camera-motion".equals(qVar.f26252o) ? i2.v(4) : i2.v(0);
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public boolean b() {
        return n();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void f0() {
        u0();
    }

    @Override // io.bidmachine.media3.exoplayer.h2, io.bidmachine.media3.exoplayer.i2
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public boolean h() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public void i(long j10, long j11) {
        while (!n() && this.f26547u < 100000 + j10) {
            this.f26544r.g();
            if (q0(X(), this.f26544r, 0) != -4 || this.f26544r.j()) {
                return;
            }
            long j12 = this.f26544r.f18059f;
            this.f26547u = j12;
            boolean z10 = j12 < Z();
            if (this.f26546t != null && !z10) {
                this.f26544r.r();
                float[] fArrT0 = t0((ByteBuffer) l0.i(this.f26544r.f18057d));
                if (fArrT0 != null) {
                    ((a) l0.i(this.f26546t)).c(this.f26547u - c0(), fArrT0);
                }
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void i0(long j10, boolean z10) {
        this.f26547u = Long.MIN_VALUE;
        u0();
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.f2.b
    public void z(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 8) {
            this.f26546t = (a) obj;
        } else {
            super.z(i10, obj);
        }
    }
}
