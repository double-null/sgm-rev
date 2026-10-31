package u7;

import c0.IbU.elEbP;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackGroup.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f26052f = x7.l0.C0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f26053g = x7.l0.C0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q[] f26057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26058e;

    public e0(q... qVarArr) {
        this("", qVarArr);
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int e(int i10) {
        return i10 | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    private void f() {
        String strD = d(this.f26057d[0].f26241d);
        int iE = e(this.f26057d[0].f26243f);
        int i10 = 1;
        while (true) {
            q[] qVarArr = this.f26057d;
            if (i10 >= qVarArr.length) {
                return;
            }
            if (!strD.equals(d(qVarArr[i10].f26241d))) {
                q[] qVarArr2 = this.f26057d;
                c("languages", qVarArr2[0].f26241d, qVarArr2[i10].f26241d, i10);
                return;
            } else {
                if (iE != e(this.f26057d[i10].f26243f)) {
                    c("role flags", Integer.toBinaryString(this.f26057d[0].f26243f), Integer.toBinaryString(this.f26057d[i10].f26243f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public q a(int i10) {
        return this.f26057d[i10];
    }

    public int b(q qVar) {
        int i10 = 0;
        while (true) {
            q[] qVarArr = this.f26057d;
            if (i10 >= qVarArr.length) {
                return -1;
            }
            if (qVar == qVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f26055b.equals(e0Var.f26055b) && Arrays.equals(this.f26057d, e0Var.f26057d);
    }

    public int hashCode() {
        if (this.f26058e == 0) {
            this.f26058e = ((527 + this.f26055b.hashCode()) * 31) + Arrays.hashCode(this.f26057d);
        }
        return this.f26058e;
    }

    public String toString() {
        return this.f26055b + ": " + Arrays.toString(this.f26057d);
    }

    public e0(String str, q... qVarArr) {
        x7.a.a(qVarArr.length > 0);
        this.f26055b = str;
        this.f26057d = qVarArr;
        this.f26054a = qVarArr.length;
        int iK = w.k(qVarArr[0].f26252o);
        this.f26056c = iK == -1 ? w.k(qVarArr[0].f26251n) : iK;
        f();
    }

    private static void c(String str, String str2, String str3, int i10) {
        x7.r.d("TrackGroup", "", new IllegalStateException("Different " + str + elEbP.YEUuHLqLP + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }
}
