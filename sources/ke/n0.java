package ke;

import java.util.Arrays;

/* JADX INFO: compiled from: JsonPath.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f21384a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f21385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21386c;

    /* JADX INFO: compiled from: JsonPath.kt */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21387a = new a();

        private a() {
        }
    }

    public n0() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f21385b = iArr;
        this.f21386c = -1;
    }

    private final void e() {
        int i10 = this.f21386c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f21384a, i10);
        kotlin.jvm.internal.t.e(objArrCopyOf, "copyOf(...)");
        this.f21384a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f21385b, i10);
        kotlin.jvm.internal.t.e(iArrCopyOf, "copyOf(...)");
        this.f21385b = iArrCopyOf;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f21386c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f21384a[i11];
            if (obj instanceof he.f) {
                he.f fVar = (he.f) obj;
                if (!kotlin.jvm.internal.t.a(fVar.d(), he.n.b.f15865a)) {
                    int i12 = this.f21385b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.f(i12));
                    }
                } else if (this.f21385b[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f21385b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f21387a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "toString(...)");
        return string;
    }

    public final void b() {
        int i10 = this.f21386c;
        int[] iArr = this.f21385b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f21386c = i10 - 1;
        }
        int i11 = this.f21386c;
        if (i11 != -1) {
            this.f21386c = i11 - 1;
        }
    }

    public final void c(he.f sd2) {
        kotlin.jvm.internal.t.f(sd2, "sd");
        int i10 = this.f21386c + 1;
        this.f21386c = i10;
        if (i10 == this.f21384a.length) {
            e();
        }
        this.f21384a[i10] = sd2;
    }

    public final void d() {
        int[] iArr = this.f21385b;
        int i10 = this.f21386c;
        if (iArr[i10] == -2) {
            this.f21384a[i10] = a.f21387a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f21385b;
        int i10 = this.f21386c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f21386c = i11;
            if (i11 == this.f21384a.length) {
                e();
            }
        }
        Object[] objArr = this.f21384a;
        int i12 = this.f21386c;
        objArr[i12] = obj;
        this.f21385b[i12] = -2;
    }

    public final void g(int i10) {
        this.f21385b[this.f21386c] = i10;
    }

    public String toString() {
        return a();
    }
}
