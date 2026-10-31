package y9;

import android.text.TextUtils;
import com.google.common.collect.w;
import com.google.common.collect.w0;
import com.google.common.collect.y;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: TextEmphasis.java */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f28797d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final w<String> f28798e = w.G("auto", "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final w<String> f28799f = w.H("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final w<String> f28800g = w.G("filled", MRAIDPresenter.OPEN);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final w<String> f28801h = w.H("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28804c;

    private b(int i10, int i11, int i12) {
        this.f28802a = i10;
        this.f28803b = i11;
        this.f28804c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = com.google.common.base.c.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(w.z(TextUtils.split(strE, f28797d)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113  */
    private static b b(w<String> wVar) {
        byte b10;
        int i10;
        byte b11;
        String str = (String) y.c(w0.e(f28801h, wVar), "outside");
        int iHashCode = str.hashCode();
        int i11 = 2;
        byte b12 = 0;
        byte b13 = 1;
        if (iHashCode != -1392885889) {
            if (iHashCode != -1106037339) {
                if (iHashCode == 92734940 && str.equals("after")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("outside")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals("before")) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        w0.e eVarE = w0.e(f28798e, wVar);
        if (!eVarE.isEmpty()) {
            String str2 = (String) eVarE.iterator().next();
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != 3005871) {
                if (iHashCode2 == 3387192 && str2.equals("none")) {
                    b13 = 0;
                } else {
                    b13 = -1;
                }
            } else if (!str2.equals("auto")) {
                b13 = -1;
            }
            return new b(b13 == 0 ? 0 : -1, 0, i10);
        }
        w0.e eVarE2 = w0.e(f28800g, wVar);
        w0.e eVarE3 = w0.e(f28799f, wVar);
        if (eVarE2.isEmpty() && eVarE3.isEmpty()) {
            return new b(-1, 0, i10);
        }
        String str3 = (String) y.c(eVarE2, "filled");
        int iHashCode3 = str3.hashCode();
        if (iHashCode3 != -1274499742) {
            if (iHashCode3 == 3417674 && str3.equals(MRAIDPresenter.OPEN)) {
                b11 = 0;
            } else {
                b11 = -1;
            }
        } else if (str3.equals("filled")) {
            b11 = 1;
        } else {
            b11 = -1;
        }
        int i12 = b11 != 0 ? 1 : 2;
        String str4 = (String) y.c(eVarE3, "circle");
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1360216880) {
            if (iHashCode4 != -905816648) {
                if (iHashCode4 != 99657 || !str4.equals("dot")) {
                    b12 = -1;
                }
            } else if (str4.equals("sesame")) {
                b12 = 1;
            } else {
                b12 = -1;
            }
        } else if (str4.equals("circle")) {
            b12 = 2;
        } else {
            b12 = -1;
        }
        if (b12 != 0) {
            i11 = b12 != 1 ? 1 : 3;
        }
        return new b(i11, i12, i10);
    }
}
