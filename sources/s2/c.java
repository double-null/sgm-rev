package s2;

import com.google.common.base.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: AbstractStreamingHasher.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f25192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25194c;

    protected c(int i10) {
        this(i10, i10);
    }

    private void f() {
        h.a(this.f25192a);
        while (this.f25192a.remaining() >= this.f25194c) {
            h(this.f25192a);
        }
        this.f25192a.compact();
    }

    private void g() {
        if (this.f25192a.remaining() < 8) {
            f();
        }
    }

    private f j(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f25192a.remaining()) {
            this.f25192a.put(byteBuffer);
            g();
            return this;
        }
        int iPosition = this.f25193b - this.f25192a.position();
        for (int i10 = 0; i10 < iPosition; i10++) {
            this.f25192a.put(byteBuffer.get());
        }
        f();
        while (byteBuffer.remaining() >= this.f25194c) {
            h(byteBuffer);
        }
        this.f25192a.put(byteBuffer);
        return this;
    }

    @Override // s2.f
    public final d b() {
        f();
        h.a(this.f25192a);
        if (this.f25192a.remaining() > 0) {
            i(this.f25192a);
            ByteBuffer byteBuffer = this.f25192a;
            h.b(byteBuffer, byteBuffer.limit());
        }
        return e();
    }

    @Override // s2.f
    public final f c(byte b10) {
        this.f25192a.put(b10);
        g();
        return this;
    }

    @Override // s2.b
    public final f d(byte[] bArr, int i10, int i11) {
        return j(ByteBuffer.wrap(bArr, i10, i11).order(ByteOrder.LITTLE_ENDIAN));
    }

    protected abstract d e();

    protected abstract void h(ByteBuffer byteBuffer);

    protected abstract void i(ByteBuffer byteBuffer);

    protected c(int i10, int i11) {
        p.d(i11 % i10 == 0);
        this.f25192a = ByteBuffer.allocate(i11 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f25193b = i11;
        this.f25194c = i10;
    }
}
