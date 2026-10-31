package q4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: GenericGF.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f24404h = new a(4201, 4096, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f24405i = new a(1033, 1024, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f24406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f24407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f24408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f24409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f24410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f24411o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f24412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f24413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f24414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f24415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f24417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f24418g;

    static {
        a aVar = new a(67, 64, 1);
        f24406j = aVar;
        f24407k = new a(19, 16, 1);
        f24408l = new a(285, UserVerificationMethods.USER_VERIFY_HANDPRINT, 0);
        a aVar2 = new a(Sdk.SDKError.Reason.MRAID_ERROR_VALUE, UserVerificationMethods.USER_VERIFY_HANDPRINT, 1);
        f24409m = aVar2;
        f24410n = aVar2;
        f24411o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f24417f = i10;
        this.f24416e = i11;
        this.f24418g = i12;
        this.f24412a = new int[i11];
        this.f24413b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f24412a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f24413b[this.f24412a[i15]] = i15;
        }
        this.f24414c = new b(this, new int[]{0});
        this.f24415d = new b(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f24414c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    int c(int i10) {
        return this.f24412a[i10];
    }

    public int d() {
        return this.f24418g;
    }

    b e() {
        return this.f24414c;
    }

    int f(int i10) {
        if (i10 != 0) {
            return this.f24412a[(this.f24416e - this.f24413b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    int g(int i10) {
        if (i10 != 0) {
            return this.f24413b[i10];
        }
        throw new IllegalArgumentException();
    }

    int h(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f24412a;
        int[] iArr2 = this.f24413b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f24416e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f24417f) + ',' + this.f24416e + ')';
    }
}
