package io.bidmachine.media3.exoplayer.audio;

import java.math.RoundingMode;
import x7.l0;

/* JADX INFO: compiled from: DefaultAudioTrackBufferSizeProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public class k implements DefaultAudioSink.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f18284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f18285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f18286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f18287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f18288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18290h;

    /* JADX INFO: compiled from: DefaultAudioTrackBufferSizeProvider.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f18291a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18292b = 750000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18293c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f18294d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f18295e = 50000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18296f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18297g = 4;

        public k h() {
            return new k(this);
        }
    }

    protected k(a aVar) {
        this.f18284b = aVar.f18291a;
        this.f18285c = aVar.f18292b;
        this.f18286d = aVar.f18293c;
        this.f18287e = aVar.f18294d;
        this.f18288f = aVar.f18295e;
        this.f18289g = aVar.f18296f;
        this.f18290h = aVar.f18297g;
    }

    protected static int b(int i10, int i11, int i12) {
        return com.google.common.primitives.f.d(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static int d(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.DefaultAudioSink.e
    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (((double) c(i10, i11, i12, i13, i14, i15)) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    protected int e(int i10) {
        return com.google.common.primitives.f.d((((long) this.f18288f) * ((long) d(i10))) / 1000000);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    protected int f(int i10, int i11) {
        int i12;
        int iD;
        int i13 = this.f18287e;
        if (i10 != 5) {
            if (i10 == 8) {
                i12 = this.f18290h;
            }
            if (i11 != -1) {
                iD = u2.d.b(i11, 8, RoundingMode.CEILING);
            } else {
                iD = d(i10);
            }
            return com.google.common.primitives.f.d((((long) i13) * ((long) iD)) / 1000000);
        }
        i12 = this.f18289g;
        i13 *= i12;
        if (i11 != -1) {
            iD = u2.d.b(i11, 8, RoundingMode.CEILING);
        } else {
            iD = d(i10);
        }
        return com.google.common.primitives.f.d((((long) i13) * ((long) iD)) / 1000000);
    }

    protected int g(int i10, int i11, int i12) {
        return l0.p(i10 * this.f18286d, b(this.f18284b, i11, i12), b(this.f18285c, i11, i12));
    }
}
