package v8;

/* JADX INFO: compiled from: MpegAudioUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f27310a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f27311b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f27312c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f27313d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f27314e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f27315f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f27316g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: MpegAudioUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f27318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f27320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f27321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f27322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f27323g;

        public a() {
        }

        public a(a aVar) {
            this.f27317a = aVar.f27317a;
            this.f27318b = aVar.f27318b;
            this.f27319c = aVar.f27319c;
            this.f27320d = aVar.f27320d;
            this.f27321e = aVar.f27321e;
            this.f27322f = aVar.f27322f;
            this.f27323g = aVar.f27323g;
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!f0.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f27317a = i11;
            this.f27318b = f0.f27310a[3 - i12];
            int i15 = f0.f27311b[i14];
            this.f27320d = i15;
            if (i11 == 2) {
                this.f27320d = i15 / 2;
            } else if (i11 == 0) {
                this.f27320d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f27323g = f0.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? f0.f27312c[i13 - 1] : f0.f27313d[i13 - 1];
                this.f27322f = i17;
                this.f27319c = (((i17 * 12) / this.f27320d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? f0.f27314e[i13 - 1] : f0.f27315f[i13 - 1];
                    this.f27322f = i18;
                    this.f27319c = ((i18 * 144) / this.f27320d) + i16;
                } else {
                    int i19 = f0.f27316g[i13 - 1];
                    this.f27322f = i19;
                    this.f27319c = (((i12 == 1 ? 72 : 144) * i19) / this.f27320d) + i16;
                }
            }
            this.f27321e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f27311b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f27312c[i13 - 1] : f27313d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f27314e[i13 - 1] : f27315f[i13 - 1];
        } else {
            i15 = f27316g[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i15) / i16) + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
