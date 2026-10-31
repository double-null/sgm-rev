package n8;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: ShuffleOrder.java */
/* JADX INFO: loaded from: classes4.dex */
public interface t {

    /* JADX INFO: compiled from: ShuffleOrder.java */
    public static class a implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f22816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f22817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f22818c;

        public a(int i10) {
            this(i10, new Random());
        }

        private static int[] h(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // n8.t
        public t a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f22817b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f22817b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f22816a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // n8.t
        public int b(int i10) {
            int i11 = this.f22818c[i10] - 1;
            if (i11 >= 0) {
                return this.f22817b[i11];
            }
            return -1;
        }

        @Override // n8.t
        public int c(int i10) {
            int i11 = this.f22818c[i10] + 1;
            int[] iArr = this.f22817b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // n8.t
        public int d() {
            int[] iArr = this.f22817b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // n8.t
        public t e() {
            return new a(0, new Random(this.f22816a.nextLong()));
        }

        @Override // n8.t
        public int f() {
            int[] iArr = this.f22817b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // n8.t
        public t g(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f22816a.nextInt(this.f22817b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f22816a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f22817b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f22817b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f22816a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // n8.t
        public int getLength() {
            return this.f22817b.length;
        }

        private a(int i10, Random random) {
            this(h(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f22817b = iArr;
            this.f22816a = random;
            this.f22818c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f22818c[iArr[i10]] = i10;
            }
        }
    }

    t a(int i10, int i11);

    int b(int i10);

    int c(int i10);

    int d();

    t e();

    int f();

    t g(int i10, int i11);

    int getLength();
}
