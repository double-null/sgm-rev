package u8;

/* JADX INFO: compiled from: Projection.java */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f26559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26562d;

    /* JADX INFO: compiled from: Projection.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b[] f26563a;

        public a(b... bVarArr) {
            this.f26563a = bVarArr;
        }

        public b a(int i10) {
            return this.f26563a[i10];
        }

        public int b() {
            return this.f26563a.length;
        }
    }

    /* JADX INFO: compiled from: Projection.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f26566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f26567d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f26564a = i10;
            x7.a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f26566c = fArr;
            this.f26567d = fArr2;
            this.f26565b = i11;
        }

        public int a() {
            return this.f26566c.length / 3;
        }
    }

    public e(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public static e a(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        int i14;
        int i15;
        float[] fArr;
        int i16;
        int i17 = i10;
        int i18 = i11;
        x7.a.a(f10 > 0.0f);
        x7.a.a(i17 >= 1);
        x7.a.a(i18 >= 1);
        x7.a.a(f11 > 0.0f && f11 <= 180.0f);
        x7.a.a(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f13 = radians / i17;
        float f14 = radians2 / i18;
        int i19 = i18 + 1;
        int i20 = ((i19 * 2) + 2) * i17;
        float[] fArr2 = new float[i20 * 3];
        float[] fArr3 = new float[i20 * 2];
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < i17) {
            float f15 = radians / 2.0f;
            float f16 = (i21 * f13) - f15;
            int i24 = i21 + 1;
            float f17 = (i24 * f13) - f15;
            int i25 = 0;
            while (i25 < i19) {
                float f18 = f16;
                int i26 = i24;
                int i27 = 0;
                int i28 = 2;
                while (i27 < i28) {
                    float f19 = i25 * f14;
                    float f20 = f14;
                    int i29 = i22 + 1;
                    int i30 = i25;
                    double d10 = f10;
                    float f21 = f13;
                    double d11 = (f19 + 3.1415927f) - (radians2 / 2.0f);
                    int i31 = i27;
                    double d12 = i27 == 0 ? f18 : f17;
                    float[] fArr4 = fArr3;
                    float f22 = f17;
                    fArr2[i22] = -((float) (Math.sin(d11) * d10 * Math.cos(d12)));
                    int i32 = i29 + 1;
                    int i33 = i21;
                    fArr2[i29] = (float) (d10 * Math.sin(d12));
                    int i34 = i32 + 1;
                    fArr2[i32] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    int i35 = i23 + 1;
                    fArr4[i23] = f19 / radians2;
                    int i36 = i35 + 1;
                    fArr4[i35] = ((i33 + i31) * f21) / radians;
                    if (i30 == 0 && i31 == 0) {
                        i13 = i11;
                        i14 = i30;
                        i15 = i31;
                    } else {
                        i13 = i11;
                        i14 = i30;
                        i15 = i31;
                        if (i14 != i13 || i15 != 1) {
                            fArr = fArr4;
                            i16 = 2;
                        }
                        i23 = i36;
                        i22 = i34;
                        i27 = i15 + 1;
                        i18 = i13;
                        i25 = i14;
                        fArr3 = fArr;
                        i28 = i16;
                        i21 = i33;
                        i19 = i19;
                        f14 = f20;
                        f13 = f21;
                        f17 = f22;
                    }
                    System.arraycopy(fArr2, i34 - 3, fArr2, i34, 3);
                    i34 += 3;
                    fArr = fArr4;
                    i16 = 2;
                    System.arraycopy(fArr, i36 - 2, fArr, i36, 2);
                    i36 += 2;
                    i23 = i36;
                    i22 = i34;
                    i27 = i15 + 1;
                    i18 = i13;
                    i25 = i14;
                    fArr3 = fArr;
                    i28 = i16;
                    i21 = i33;
                    i19 = i19;
                    f14 = f20;
                    f13 = f21;
                    f17 = f22;
                }
                float f23 = f13;
                int i37 = i25;
                int i38 = i18;
                int i39 = i37 + 1;
                f16 = f18;
                i24 = i26;
                i19 = i19;
                f13 = f23;
                f17 = f17;
                i18 = i38;
                i25 = i39;
            }
            i17 = i10;
            i21 = i24;
        }
        return new e(new a(new b(0, fArr2, fArr3, 1)), i12);
    }

    public static e b(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public e(a aVar, a aVar2, int i10) {
        this.f26559a = aVar;
        this.f26560b = aVar2;
        this.f26561c = i10;
        this.f26562d = aVar == aVar2;
    }
}
