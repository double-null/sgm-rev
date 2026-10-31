package a8;

import android.media.MediaCodec;
import x7.l0;

/* JADX INFO: compiled from: CryptoInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f144j;

    /* JADX INFO: compiled from: CryptoInfo.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f146b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f146b.set(i10, i11);
            this.f145a.setPattern(this.f146b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f145a = cryptoInfo;
            this.f146b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f143i = cryptoInfo;
        this.f144j = l0.f28136a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f143i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f138d == null) {
            int[] iArr = new int[1];
            this.f138d = iArr;
            this.f143i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f138d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f140f = i10;
        this.f138d = iArr;
        this.f139e = iArr2;
        this.f136b = bArr;
        this.f135a = bArr2;
        this.f137c = i11;
        this.f141g = i12;
        this.f142h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f143i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (l0.f28136a >= 24) {
            ((b) x7.a.e(this.f144j)).b(i12, i13);
        }
    }
}
