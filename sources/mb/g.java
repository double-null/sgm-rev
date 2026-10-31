package mb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Iterator;
import java.util.List;
import pb.a0;
import pb.g1;
import pb.h1;

/* JADX INFO: loaded from: classes5.dex */
public class g extends RelativeLayout {

    public static class a extends RelativeLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f22237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f22239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f22240d;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f22239c = 1.0f;
            this.f22240d = 1.0f;
            this.f22237a = i10;
            this.f22238b = i11;
        }

        private View b(List list, String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pa.d dVar = (pa.d) it.next();
                if (dVar.g().j().equals(str)) {
                    return dVar.o();
                }
            }
            return null;
        }

        private void c() {
            int[] rules = getRules();
            if ((this.f22239c > 0.0f || this.f22237a > 0) && rules[9] == -1 && rules[11] == -1) {
                removeRule(9);
                removeRule(11);
                addRule(14);
            }
            if ((this.f22240d > 0.0f || this.f22238b > 0) && rules[10] == -1 && rules[12] == -1) {
                removeRule(10);
                removeRule(12);
                addRule(15);
            }
        }

        private void f(g1 g1Var, g1 g1Var2, List list) {
            g(g1Var, h1.Left, 5, 1, 9, list);
            g(g1Var2, h1.Right, 7, 0, 11, list);
        }

        private void g(g1 g1Var, h1 h1Var, int i10, int i11, int i12, List list) {
            if (g1Var == null) {
                return;
            }
            View viewB = b(list, g1Var.a());
            if (viewB == null) {
                addRule(i12);
                return;
            }
            if (g1Var.b() != h1Var) {
                i10 = i11;
            }
            addRule(i10, viewB.getId());
        }

        private boolean h(g1 g1Var, int i10, int i11) {
            if (i11 < 0 || g1Var == null) {
                return false;
            }
            addRule(i10);
            return true;
        }

        private void k(g1 g1Var, g1 g1Var2, List list) {
            g(g1Var, h1.f24099d, 6, 3, 10, list);
            g(g1Var2, h1.Bottom, 8, 2, 12, list);
        }

        public void d(float f10) {
            this.f22240d = f10;
        }

        public void e(Context context, a0 a0Var, List list) {
            j(a0Var.o());
            d(a0Var.d());
            setMargins(a0Var.h(context), a0Var.j(context), -a0Var.i(context), -a0Var.g(context));
            g1 g1VarL = a0Var.l();
            g1 g1VarA = a0Var.a();
            if (!h(a0Var.c(), 15, a0Var.p(context))) {
                k(g1VarL, g1VarA, list);
            }
            g1 g1VarF = a0Var.f();
            g1 g1VarK = a0Var.k();
            if (!h(a0Var.b(), 14, a0Var.e(context))) {
                f(g1VarF, g1VarK, list);
            }
            c();
        }

        public void j(float f10) {
            this.f22239c = f10;
        }
    }

    public g(Context context) {
        super(context);
    }

    private void c(int i10, int i11, View view, a aVar) {
        Integer numA;
        Integer numA2;
        float f10 = aVar.f22239c;
        if (f10 > 0.0f && f10 < 1.0f && (numA2 = a(aVar.f22237a, i10, view.getMeasuredWidth(), f10)) != null) {
            ((RelativeLayout.LayoutParams) aVar).width = numA2.intValue();
        }
        float f11 = aVar.f22240d;
        if (f11 <= 0.0f || f11 >= 1.0f || (numA = a(aVar.f22238b, i11, view.getMeasuredHeight(), f11)) == null) {
            return;
        }
        ((RelativeLayout.LayoutParams) aVar).height = numA.intValue();
    }

    Integer a(int i10, int i11, int i12, float f10) {
        if (i10 <= 0) {
            if (i10 == -1) {
                i10 = i11;
            } else {
                if (i10 != -2 || i12 == 0) {
                    return null;
                }
                i10 = i12;
            }
        }
        if (i10 == 0) {
            return null;
        }
        return Integer.valueOf(Math.round(i10 * f10));
    }

    void b(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof a) {
                c(size, size2, childAt, (a) layoutParams);
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        b(i10, i11);
        super.onMeasure(i10, i11);
    }
}
