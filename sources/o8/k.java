package o8;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.IOException;
import java.util.Arrays;
import u7.q;
import x7.l0;

/* JADX INFO: compiled from: DataChunk.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f23215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f23216k;

    public k(z7.d dVar, z7.g gVar, int i10, q qVar, int i11, Object obj, byte[] bArr) {
        super(dVar, gVar, i10, qVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f23215j = bArr == null ? l0.f28141f : bArr;
    }

    private void h(int i10) {
        byte[] bArr = this.f23215j;
        if (bArr.length < i10 + Http2.INITIAL_MAX_FRAME_SIZE) {
            this.f23215j = Arrays.copyOf(bArr, bArr.length + Http2.INITIAL_MAX_FRAME_SIZE);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public final void b() {
        this.f23216k = true;
    }

    protected abstract void f(byte[] bArr, int i10) throws IOException;

    public byte[] g() {
        return this.f23215j;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public final void load() throws IOException {
        try {
            this.f23176i.i(this.f23169b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f23216k) {
                h(i11);
                i10 = this.f23176i.read(this.f23215j, i11, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f23216k) {
                f(this.f23215j, i11);
            }
        } finally {
            z7.f.a(this.f23176i);
        }
    }
}
