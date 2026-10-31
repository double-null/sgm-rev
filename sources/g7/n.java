package g7;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f15457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f15458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f15459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f15460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f15461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f15462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f15463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Float f15464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Float f15465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f15466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f15467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f15468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f15469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f15470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f15471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f15472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f15473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f15474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Float f15475s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Float f15476t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Float f15477u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f15478v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Float f15479w;

    public n() {
    }

    public void A0(Boolean bool) {
        this.f15460d = bool;
    }

    public Float B() {
        Float f10 = this.f15464h;
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    public void B0(Number number) {
        this.f15476t = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public Integer C(Context context) {
        Integer num = this.f15469m;
        if (num != null) {
            return Integer.valueOf(y.h(context, num.intValue()));
        }
        return 0;
    }

    public Integer D(Context context) {
        Integer num = this.f15466j;
        if (num != null) {
            return Integer.valueOf(y.h(context, num.intValue()));
        }
        return 0;
    }

    public Integer F(Context context) {
        Integer num = this.f15467k;
        if (num != null) {
            return Integer.valueOf(y.h(context, num.intValue()));
        }
        return 0;
    }

    public Integer G(Context context) {
        Integer num = this.f15468l;
        if (num != null) {
            return Integer.valueOf(y.h(context, num.intValue()));
        }
        return 0;
    }

    public Integer H() {
        Integer num = this.f15457a;
        return num != null ? num : Integer.valueOf(a.f15389a);
    }

    public Float I(Context context) {
        Float f10 = this.f15475s;
        return f10 != null ? Float.valueOf(y.h(context, f10.floatValue())) : Float.valueOf(0.0f);
    }

    public String K() {
        return this.f15463g;
    }

    public Integer N() {
        Integer num = this.f15462f;
        if (num != null) {
            return num;
        }
        return 48;
    }

    public Integer U(Context context) {
        Float f10 = this.f15476t;
        if (f10 == null) {
            return -2;
        }
        if (f10.floatValue() == -1.0f) {
            return Integer.valueOf(this.f15476t.intValue());
        }
        return this.f15476t.floatValue() == -2.0f ? Integer.valueOf(this.f15476t.intValue()) : Integer.valueOf(y.h(context, this.f15476t.floatValue()));
    }

    public boolean Y() {
        return this.f15458b != null;
    }

    public boolean a0() {
        return this.f15457a != null;
    }

    public void b(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = i0();
    }

    public void c(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = w(context).intValue();
        marginLayoutParams.topMargin = z(context).intValue();
        marginLayoutParams.rightMargin = x(context).intValue();
        marginLayoutParams.bottomMargin = v(context).intValue();
    }

    public Boolean d0() {
        Boolean bool = this.f15459c;
        return bool != null ? bool : Boolean.FALSE;
    }

    public void e(Context context, View view) {
        view.setPadding(D(context).intValue(), G(context).intValue(), F(context).intValue(), C(context).intValue());
    }

    public Boolean e0() {
        Boolean bool = this.f15460d;
        return bool != null ? bool : Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public void f(RelativeLayout.LayoutParams layoutParams) {
        int iIntValue = t().intValue();
        if (iIntValue == 1) {
            layoutParams.addRule(14);
        } else if (iIntValue == 3) {
            layoutParams.addRule(9);
        } else if (iIntValue == 5) {
            layoutParams.addRule(11);
        } else if (iIntValue == 17) {
            layoutParams.addRule(14);
        }
        int iIntValue2 = N().intValue();
        if (iIntValue2 == 16 || iIntValue2 == 17) {
            layoutParams.addRule(15);
        } else if (iIntValue2 == 48) {
            layoutParams.addRule(10);
        } else {
            if (iIntValue2 != 80) {
                return;
            }
            layoutParams.addRule(12);
        }
    }

    public n g(n nVar) {
        n nVar2 = new n();
        nVar2.h0(this);
        nVar2.h0(nVar);
        return nVar2;
    }

    public String h() {
        return this.f15474r;
    }

    public void h0(n nVar) {
        if (nVar == null) {
            return;
        }
        Integer num = nVar.f15457a;
        if (num != null) {
            this.f15457a = num;
        }
        Integer num2 = nVar.f15458b;
        if (num2 != null) {
            this.f15458b = num2;
        }
        Boolean bool = nVar.f15459c;
        if (bool != null) {
            this.f15459c = bool;
        }
        Boolean bool2 = nVar.f15460d;
        if (bool2 != null) {
            this.f15460d = bool2;
        }
        Integer num3 = nVar.f15461e;
        if (num3 != null) {
            this.f15461e = num3;
        }
        Integer num4 = nVar.f15462f;
        if (num4 != null) {
            this.f15462f = num4;
        }
        String str = nVar.f15463g;
        if (str != null) {
            this.f15463g = str;
        }
        Float f10 = nVar.f15464h;
        if (f10 != null) {
            this.f15464h = f10;
        }
        Float f11 = nVar.f15465i;
        if (f11 != null) {
            this.f15465i = f11;
        }
        Integer num5 = nVar.f15466j;
        if (num5 != null) {
            this.f15466j = num5;
        }
        Integer num6 = nVar.f15467k;
        if (num6 != null) {
            this.f15467k = num6;
        }
        Integer num7 = nVar.f15468l;
        if (num7 != null) {
            this.f15468l = num7;
        }
        Integer num8 = nVar.f15469m;
        if (num8 != null) {
            this.f15469m = num8;
        }
        Integer num9 = nVar.f15470n;
        if (num9 != null) {
            this.f15470n = num9;
        }
        Integer num10 = nVar.f15472p;
        if (num10 != null) {
            this.f15472p = num10;
        }
        Integer num11 = nVar.f15471o;
        if (num11 != null) {
            this.f15471o = num11;
        }
        Integer num12 = nVar.f15473q;
        if (num12 != null) {
            this.f15473q = num12;
        }
        String str2 = nVar.f15474r;
        if (str2 != null) {
            this.f15474r = str2;
        }
        Float f12 = nVar.f15475s;
        if (f12 != null) {
            this.f15475s = f12;
        }
        Float f13 = nVar.f15476t;
        if (f13 != null) {
            this.f15476t = f13;
        }
        Float f14 = nVar.f15477u;
        if (f14 != null) {
            this.f15477u = f14;
        }
        Integer num13 = nVar.f15478v;
        if (num13 != null) {
            this.f15478v = num13;
        }
        Float f15 = nVar.f15479w;
        if (f15 != null) {
            this.f15479w = f15;
        }
    }

    public int i0() {
        return N().intValue() | t().intValue();
    }

    public void j0(String str) {
        this.f15474r = str;
    }

    public Integer k() {
        Integer num = this.f15458b;
        return num != null ? num : Integer.valueOf(a.f15391c);
    }

    public void k0(Integer num) {
        this.f15458b = num;
    }

    public void l0(Float f10) {
        this.f15479w = f10;
    }

    public void m0(Integer num) {
        this.f15478v = num;
    }

    public Float n(Context context) {
        Float f10 = this.f15479w;
        return f10 != null ? Float.valueOf(y.h(context, f10.floatValue())) : Float.valueOf(y.h(context, 16.0f));
    }

    public void n0(Number number) {
        this.f15477u = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public Integer o() {
        Integer num = this.f15478v;
        if (num != null) {
            return num;
        }
        return 0;
    }

    public void o0(Float f10) {
        this.f15465i = f10;
    }

    public Integer p(Context context) {
        Float f10 = this.f15477u;
        if (f10 == null) {
            return -2;
        }
        if (f10.floatValue() == -1.0f) {
            return Integer.valueOf(this.f15477u.intValue());
        }
        return this.f15477u.floatValue() == -2.0f ? Integer.valueOf(this.f15477u.intValue()) : Integer.valueOf(y.h(context, this.f15477u.floatValue()));
    }

    public void p0(Integer num) {
        this.f15461e = num;
    }

    public void q0(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f15470n = num;
        this.f15471o = num2;
        this.f15472p = num3;
        this.f15473q = num4;
    }

    public void r0(String str) {
        if (TextUtils.isEmpty(str)) {
            q0(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = y.g(strArrSplit[0]).intValue();
            q0(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = y.g(strArrSplit[0]).intValue();
            int iIntValue3 = y.g(strArrSplit[1]).intValue();
            q0(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = y.g(strArrSplit[0]).intValue();
                int iIntValue5 = y.g(strArrSplit[1]).intValue();
                q0(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(y.g(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                q0(Integer.valueOf(y.g(strArrSplit[3]).intValue()), Integer.valueOf(y.g(strArrSplit[0]).intValue()), Integer.valueOf(y.g(strArrSplit[1]).intValue()), Integer.valueOf(y.g(strArrSplit[2]).intValue()));
            }
        }
    }

    public Float s() {
        return this.f15465i;
    }

    public void s0(Float f10) {
        this.f15464h = f10;
    }

    public Integer t() {
        Integer num = this.f15461e;
        if (num != null) {
            return num;
        }
        return 3;
    }

    public void t0(Boolean bool) {
        this.f15459c = bool;
    }

    public void u0(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f15466j = num;
        this.f15468l = num2;
        this.f15467k = num3;
        this.f15469m = num4;
    }

    public Integer v(Context context) {
        Integer num = this.f15473q;
        if (num != null) {
            return Integer.valueOf(y.h(context, num.intValue()));
        }
        return 0;
    }

    public void v0(String str) {
        if (TextUtils.isEmpty(str)) {
            u0(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = y.g(strArrSplit[0]).intValue();
            u0(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = y.g(strArrSplit[0]).intValue();
            int iIntValue3 = y.g(strArrSplit[1]).intValue();
            u0(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = y.g(strArrSplit[0]).intValue();
                int iIntValue5 = y.g(strArrSplit[1]).intValue();
                u0(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(y.g(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                u0(Integer.valueOf(y.g(strArrSplit[3]).intValue()), Integer.valueOf(y.g(strArrSplit[0]).intValue()), Integer.valueOf(y.g(strArrSplit[1]).intValue()), Integer.valueOf(y.g(strArrSplit[2]).intValue()));
            }
        }
    }

    public Integer w(Context context) {
        Integer num = this.f15470n;
        if (num != null) {
            return Integer.valueOf(y.h(context, num.intValue()));
        }
        return 0;
    }

    public void w0(Integer num) {
        this.f15457a = num;
    }

    public Integer x(Context context) {
        Integer num = this.f15472p;
        if (num != null) {
            return Integer.valueOf(y.h(context, num.intValue()));
        }
        return 0;
    }

    public void x0(Float f10) {
        this.f15475s = f10;
    }

    public void y0(String str) {
        this.f15463g = str;
    }

    public Integer z(Context context) {
        Integer num = this.f15471o;
        if (num != null) {
            return Integer.valueOf(y.h(context, num.intValue()));
        }
        return 0;
    }

    public void z0(Integer num) {
        this.f15462f = num;
    }

    public n(n nVar) {
        h0(nVar);
    }
}
