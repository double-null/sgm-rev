package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f3111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f3112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i f3113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f3114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f3115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f3116x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f3117y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f3118z;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f3119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f3123e;

        a() {
            e();
        }

        void a() {
            this.f3121c = this.f3122d ? this.f3119a.i() : this.f3119a.m();
        }

        public void b(View view, int i10) {
            if (this.f3122d) {
                this.f3121c = this.f3119a.d(view) + this.f3119a.o();
            } else {
                this.f3121c = this.f3119a.g(view);
            }
            this.f3120b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f3119a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.f3120b = i10;
            if (this.f3122d) {
                int i11 = (this.f3119a.i() - iO) - this.f3119a.d(view);
                this.f3121c = this.f3119a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f3121c - this.f3119a.e(view);
                    int iM = this.f3119a.m();
                    int iMin = iE - (iM + Math.min(this.f3119a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f3121c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f3119a.g(view);
            int iM2 = iG - this.f3119a.m();
            this.f3121c = iG;
            if (iM2 > 0) {
                int i12 = (this.f3119a.i() - Math.min(0, (this.f3119a.i() - iO) - this.f3119a.d(view))) - (iG + this.f3119a.e(view));
                if (i12 < 0) {
                    this.f3121c -= Math.min(iM2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < b0Var.b();
        }

        void e() {
            this.f3120b = -1;
            this.f3121c = Integer.MIN_VALUE;
            this.f3122d = false;
            this.f3123e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3120b + ", mCoordinate=" + this.f3121c + ", mLayoutFromEnd=" + this.f3122d + ", mValid=" + this.f3123e + '}';
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3127d;

        protected b() {
        }

        void a() {
            this.f3124a = 0;
            this.f3125b = false;
            this.f3126c = false;
            this.f3127d = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3134g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f3138k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f3140m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f3128a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3135h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f3136i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f3137j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List<RecyclerView.f0> f3139l = null;

        c() {
        }

        private View e() {
            int size = this.f3139l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f3139l.get(i10).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f3131d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f3131d = -1;
            } else {
                this.f3131d = ((RecyclerView.q) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.b0 b0Var) {
            int i10 = this.f3131d;
            return i10 >= 0 && i10 < b0Var.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.f3139l != null) {
                return e();
            }
            View viewO = wVar.o(this.f3131d);
            this.f3131d += this.f3132e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f3139l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f3139l.get(i11).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.f3131d) * this.f3132e) >= 0 && iA < i10) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3143c;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f3141a >= 0;
        }

        void b() {
            this.f3141a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3141a);
            parcel.writeInt(this.f3142b);
            parcel.writeInt(this.f3143c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f3141a = parcel.readInt();
            this.f3142b = parcel.readInt();
            this.f3143c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f3141a = dVar.f3141a;
            this.f3142b = dVar.f3142b;
            this.f3143c = dVar.f3143c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private boolean A2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View viewE2;
        boolean z10 = false;
        if (J() == 0) {
            return false;
        }
        View viewV = V();
        if (viewV != null && aVar.d(viewV, b0Var)) {
            aVar.c(viewV, g0(viewV));
            return true;
        }
        boolean z11 = this.f3114v;
        boolean z12 = this.f3117y;
        if (z11 != z12 || (viewE2 = e2(wVar, b0Var, aVar.f3122d, z12)) == null) {
            return false;
        }
        aVar.b(viewE2, g0(viewE2));
        if (!b0Var.e() && K1()) {
            int iG = this.f3113u.g(viewE2);
            int iD = this.f3113u.d(viewE2);
            int iM = this.f3113u.m();
            int i10 = this.f3113u.i();
            boolean z13 = iD <= iM && iG < iM;
            if (iG >= i10 && iD > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f3122d) {
                    iM = i10;
                }
                aVar.f3121c = iM;
            }
        }
        return true;
    }

    private boolean B2(RecyclerView.b0 b0Var, a aVar) {
        int i10;
        if (!b0Var.e() && (i10 = this.A) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                aVar.f3120b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z10 = this.D.f3143c;
                    aVar.f3122d = z10;
                    if (z10) {
                        aVar.f3121c = this.f3113u.i() - this.D.f3142b;
                    } else {
                        aVar.f3121c = this.f3113u.m() + this.D.f3142b;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z11 = this.f3116x;
                    aVar.f3122d = z11;
                    if (z11) {
                        aVar.f3121c = this.f3113u.i() - this.B;
                    } else {
                        aVar.f3121c = this.f3113u.m() + this.B;
                    }
                    return true;
                }
                View viewC = C(this.A);
                if (viewC == null) {
                    if (J() > 0) {
                        aVar.f3122d = (this.A < g0(I(0))) == this.f3116x;
                    }
                    aVar.a();
                } else {
                    if (this.f3113u.e(viewC) > this.f3113u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f3113u.g(viewC) - this.f3113u.m() < 0) {
                        aVar.f3121c = this.f3113u.m();
                        aVar.f3122d = false;
                        return true;
                    }
                    if (this.f3113u.i() - this.f3113u.d(viewC) < 0) {
                        aVar.f3121c = this.f3113u.i();
                        aVar.f3122d = true;
                        return true;
                    }
                    aVar.f3121c = aVar.f3122d ? this.f3113u.d(viewC) + this.f3113u.o() : this.f3113u.g(viewC);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void C2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (B2(b0Var, aVar) || A2(wVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f3120b = this.f3117y ? b0Var.b() - 1 : 0;
    }

    private void D2(int i10, int i11, boolean z10, RecyclerView.b0 b0Var) {
        int iM;
        this.f3112t.f3140m = u2();
        this.f3112t.f3133f = i10;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        L1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f3112t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f3135h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f3136i = iMax;
        if (z11) {
            cVar.f3135h = i12 + this.f3113u.j();
            View viewH2 = h2();
            c cVar2 = this.f3112t;
            cVar2.f3132e = this.f3116x ? -1 : 1;
            int iG0 = g0(viewH2);
            c cVar3 = this.f3112t;
            cVar2.f3131d = iG0 + cVar3.f3132e;
            cVar3.f3129b = this.f3113u.d(viewH2);
            iM = this.f3113u.d(viewH2) - this.f3113u.i();
        } else {
            View viewI2 = i2();
            this.f3112t.f3135h += this.f3113u.m();
            c cVar4 = this.f3112t;
            cVar4.f3132e = this.f3116x ? 1 : -1;
            int iG1 = g0(viewI2);
            c cVar5 = this.f3112t;
            cVar4.f3131d = iG1 + cVar5.f3132e;
            cVar5.f3129b = this.f3113u.g(viewI2);
            iM = (-this.f3113u.g(viewI2)) + this.f3113u.m();
        }
        c cVar6 = this.f3112t;
        cVar6.f3130c = i11;
        if (z10) {
            cVar6.f3130c = i11 - iM;
        }
        cVar6.f3134g = iM;
    }

    private void E2(int i10, int i11) {
        this.f3112t.f3130c = this.f3113u.i() - i11;
        c cVar = this.f3112t;
        cVar.f3132e = this.f3116x ? -1 : 1;
        cVar.f3131d = i10;
        cVar.f3133f = 1;
        cVar.f3129b = i11;
        cVar.f3134g = Integer.MIN_VALUE;
    }

    private void F2(a aVar) {
        E2(aVar.f3120b, aVar.f3121c);
    }

    private void G2(int i10, int i11) {
        this.f3112t.f3130c = i11 - this.f3113u.m();
        c cVar = this.f3112t;
        cVar.f3131d = i10;
        cVar.f3132e = this.f3116x ? 1 : -1;
        cVar.f3133f = -1;
        cVar.f3129b = i11;
        cVar.f3134g = Integer.MIN_VALUE;
    }

    private void H2(a aVar) {
        G2(aVar.f3120b, aVar.f3121c);
    }

    private int N1(RecyclerView.b0 b0Var) {
        if (J() == 0) {
            return 0;
        }
        S1();
        return k.a(b0Var, this.f3113u, W1(!this.f3118z, true), V1(!this.f3118z, true), this, this.f3118z);
    }

    private int O1(RecyclerView.b0 b0Var) {
        if (J() == 0) {
            return 0;
        }
        S1();
        return k.b(b0Var, this.f3113u, W1(!this.f3118z, true), V1(!this.f3118z, true), this, this.f3118z, this.f3116x);
    }

    private int P1(RecyclerView.b0 b0Var) {
        if (J() == 0) {
            return 0;
        }
        S1();
        return k.c(b0Var, this.f3113u, W1(!this.f3118z, true), V1(!this.f3118z, true), this, this.f3118z);
    }

    private View U1() {
        return a2(0, J());
    }

    private View Y1() {
        return a2(J() - 1, -1);
    }

    private View c2() {
        return this.f3116x ? U1() : Y1();
    }

    private View d2() {
        return this.f3116x ? Y1() : U1();
    }

    private int f2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i11;
        int i12 = this.f3113u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -w2(-i12, wVar, b0Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f3113u.i() - i14) <= 0) {
            return i13;
        }
        this.f3113u.r(i11);
        return i11 + i13;
    }

    private int g2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int iM;
        int iM2 = i10 - this.f3113u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -w2(iM2, wVar, b0Var);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f3113u.m()) <= 0) {
            return i11;
        }
        this.f3113u.r(-iM);
        return i11 - iM;
    }

    private View h2() {
        return I(this.f3116x ? 0 : J() - 1);
    }

    private View i2() {
        return I(this.f3116x ? J() - 1 : 0);
    }

    private void o2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, int i11) {
        if (!b0Var.g() || J() == 0 || b0Var.e() || !K1()) {
            return;
        }
        List<RecyclerView.f0> listK = wVar.k();
        int size = listK.size();
        int iG0 = g0(I(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.f0 f0Var = listK.get(i12);
            if (!f0Var.isRemoved()) {
                if (((f0Var.getLayoutPosition() < iG0) != this.f3116x ? (byte) -1 : (byte) 1) == -1) {
                    iE += this.f3113u.e(f0Var.itemView);
                } else {
                    iE2 += this.f3113u.e(f0Var.itemView);
                }
            }
        }
        this.f3112t.f3139l = listK;
        if (iE > 0) {
            G2(g0(i2()), i10);
            c cVar = this.f3112t;
            cVar.f3135h = iE;
            cVar.f3130c = 0;
            cVar.a();
            T1(wVar, this.f3112t, b0Var, false);
        }
        if (iE2 > 0) {
            E2(g0(h2()), i11);
            c cVar2 = this.f3112t;
            cVar2.f3135h = iE2;
            cVar2.f3130c = 0;
            cVar2.a();
            T1(wVar, this.f3112t, b0Var, false);
        }
        this.f3112t.f3139l = null;
    }

    private void q2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f3128a || cVar.f3140m) {
            return;
        }
        int i10 = cVar.f3134g;
        int i11 = cVar.f3136i;
        if (cVar.f3133f == -1) {
            s2(wVar, i10, i11);
        } else {
            t2(wVar, i10, i11);
        }
    }

    private void r2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                m1(i10, wVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                m1(i12, wVar);
            }
        }
    }

    private void s2(RecyclerView.w wVar, int i10, int i11) {
        int iJ = J();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f3113u.h() - i10) + i11;
        if (this.f3116x) {
            for (int i12 = 0; i12 < iJ; i12++) {
                View viewI = I(i12);
                if (this.f3113u.g(viewI) < iH || this.f3113u.q(viewI) < iH) {
                    r2(wVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iJ - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewI2 = I(i14);
            if (this.f3113u.g(viewI2) < iH || this.f3113u.q(viewI2) < iH) {
                r2(wVar, i13, i14);
                return;
            }
        }
    }

    private void t2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iJ = J();
        if (!this.f3116x) {
            for (int i13 = 0; i13 < iJ; i13++) {
                View viewI = I(i13);
                if (this.f3113u.d(viewI) > i12 || this.f3113u.p(viewI) > i12) {
                    r2(wVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iJ - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewI2 = I(i15);
            if (this.f3113u.d(viewI2) > i12 || this.f3113u.p(viewI2) > i12) {
                r2(wVar, i14, i15);
                return;
            }
        }
    }

    private void v2() {
        if (this.f3111s == 1 || !l2()) {
            this.f3116x = this.f3115w;
        } else {
            this.f3116x = !this.f3115w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View C(int i10) {
        int iJ = J();
        if (iJ == 0) {
            return null;
        }
        int iG0 = i10 - g0(I(0));
        if (iG0 >= 0 && iG0 < iJ) {
            View viewI = I(iG0);
            if (g0(viewI) == i10) {
                return viewI;
            }
        }
        return super.C(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean F1() {
        return (X() == 1073741824 || o0() == 1073741824 || !p0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.H0(recyclerView, wVar);
        if (this.C) {
            j1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        I1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View I0(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int iQ1;
        v2();
        if (J() == 0 || (iQ1 = Q1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        S1();
        D2(iQ1, (int) (this.f3113u.n() * 0.33333334f), false, b0Var);
        c cVar = this.f3112t;
        cVar.f3134g = Integer.MIN_VALUE;
        cVar.f3128a = false;
        T1(wVar, cVar, b0Var, true);
        View viewD2 = iQ1 == -1 ? d2() : c2();
        View viewI2 = iQ1 == -1 ? i2() : h2();
        if (!viewI2.hasFocusable()) {
            return viewD2;
        }
        if (viewD2 == null) {
            return null;
        }
        return viewI2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(AccessibilityEvent accessibilityEvent) {
        super.J0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(X1());
            accessibilityEvent.setToIndex(Z1());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean K1() {
        return this.D == null && this.f3114v == this.f3117y;
    }

    protected void L1(RecyclerView.b0 b0Var, int[] iArr) {
        int i10;
        int iJ2 = j2(b0Var);
        if (this.f3112t.f3133f == -1) {
            i10 = 0;
        } else {
            i10 = iJ2;
            iJ2 = 0;
        }
        iArr[0] = iJ2;
        iArr[1] = i10;
    }

    void M1(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f3131d;
        if (i10 < 0 || i10 >= b0Var.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f3134g));
    }

    int Q1(int i10) {
        if (i10 == 1) {
            return (this.f3111s != 1 && l2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f3111s != 1 && l2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f3111s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f3111s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f3111s == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f3111s == 0 ? 1 : Integer.MIN_VALUE;
    }

    c R1() {
        return new c();
    }

    void S1() {
        if (this.f3112t == null) {
            this.f3112t = R1();
        }
    }

    int T1(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10 = cVar.f3130c;
        int i11 = cVar.f3134g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f3134g = i11 + i10;
            }
            q2(wVar, cVar);
        }
        int i12 = cVar.f3130c + cVar.f3135h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f3140m && i12 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            n2(wVar, b0Var, cVar, bVar);
            if (!bVar.f3125b) {
                cVar.f3129b += bVar.f3124a * cVar.f3133f;
                if (!bVar.f3126c || cVar.f3139l != null || !b0Var.e()) {
                    int i13 = cVar.f3130c;
                    int i14 = bVar.f3124a;
                    cVar.f3130c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f3134g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f3124a;
                    cVar.f3134g = i16;
                    int i17 = cVar.f3130c;
                    if (i17 < 0) {
                        cVar.f3134g = i16 + i17;
                    }
                    q2(wVar, cVar);
                }
                if (z10 && bVar.f3127d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f3130c;
    }

    View V1(boolean z10, boolean z11) {
        return this.f3116x ? b2(0, J(), z10, z11) : b2(J() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iF2;
        int i14;
        View viewC;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.D == null && this.A == -1) && b0Var.b() == 0) {
            j1(wVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f3141a;
        }
        S1();
        this.f3112t.f3128a = false;
        v2();
        View viewV = V();
        a aVar = this.E;
        if (!aVar.f3123e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f3122d = this.f3116x ^ this.f3117y;
            C2(wVar, b0Var, aVar2);
            this.E.f3123e = true;
        } else if (viewV != null && (this.f3113u.g(viewV) >= this.f3113u.i() || this.f3113u.d(viewV) <= this.f3113u.m())) {
            this.E.c(viewV, g0(viewV));
        }
        c cVar = this.f3112t;
        cVar.f3133f = cVar.f3138k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        L1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.f3113u.m();
        int iMax2 = Math.max(0, this.H[1]) + this.f3113u.j();
        if (b0Var.e() && (i14 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewC = C(i14)) != null) {
            if (this.f3116x) {
                i15 = this.f3113u.i() - this.f3113u.d(viewC);
                iG = this.B;
            } else {
                iG = this.f3113u.g(viewC) - this.f3113u.m();
                i15 = this.B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f3122d ? !this.f3116x : this.f3116x) {
            i16 = 1;
        }
        p2(wVar, b0Var, aVar3, i16);
        w(wVar);
        this.f3112t.f3140m = u2();
        this.f3112t.f3137j = b0Var.e();
        this.f3112t.f3136i = 0;
        a aVar4 = this.E;
        if (aVar4.f3122d) {
            H2(aVar4);
            c cVar2 = this.f3112t;
            cVar2.f3135h = iMax;
            T1(wVar, cVar2, b0Var, false);
            c cVar3 = this.f3112t;
            i11 = cVar3.f3129b;
            int i18 = cVar3.f3131d;
            int i19 = cVar3.f3130c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            F2(this.E);
            c cVar4 = this.f3112t;
            cVar4.f3135h = iMax2;
            cVar4.f3131d += cVar4.f3132e;
            T1(wVar, cVar4, b0Var, false);
            c cVar5 = this.f3112t;
            i10 = cVar5.f3129b;
            int i20 = cVar5.f3130c;
            if (i20 > 0) {
                G2(i18, i11);
                c cVar6 = this.f3112t;
                cVar6.f3135h = i20;
                T1(wVar, cVar6, b0Var, false);
                i11 = this.f3112t.f3129b;
            }
        } else {
            F2(aVar4);
            c cVar7 = this.f3112t;
            cVar7.f3135h = iMax2;
            T1(wVar, cVar7, b0Var, false);
            c cVar8 = this.f3112t;
            i10 = cVar8.f3129b;
            int i21 = cVar8.f3131d;
            int i22 = cVar8.f3130c;
            if (i22 > 0) {
                iMax += i22;
            }
            H2(this.E);
            c cVar9 = this.f3112t;
            cVar9.f3135h = iMax;
            cVar9.f3131d += cVar9.f3132e;
            T1(wVar, cVar9, b0Var, false);
            c cVar10 = this.f3112t;
            i11 = cVar10.f3129b;
            int i23 = cVar10.f3130c;
            if (i23 > 0) {
                E2(i21, i10);
                c cVar11 = this.f3112t;
                cVar11.f3135h = i23;
                T1(wVar, cVar11, b0Var, false);
                i10 = this.f3112t.f3129b;
            }
        }
        if (J() > 0) {
            if (this.f3116x ^ this.f3117y) {
                int iF3 = f2(i10, wVar, b0Var, true);
                i12 = i11 + iF3;
                i13 = i10 + iF3;
                iF2 = g2(i12, wVar, b0Var, false);
            } else {
                int iG2 = g2(i11, wVar, b0Var, true);
                i12 = i11 + iG2;
                i13 = i10 + iG2;
                iF2 = f2(i13, wVar, b0Var, false);
            }
            i11 = i12 + iF2;
            i10 = i13 + iF2;
        }
        o2(wVar, b0Var, i11, i10);
        if (b0Var.e()) {
            this.E.e();
        } else {
            this.f3113u.s();
        }
        this.f3114v = this.f3117y;
    }

    View W1(boolean z10, boolean z11) {
        return this.f3116x ? b2(J() - 1, -1, z10, z11) : b2(0, J(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.b0 b0Var) {
        super.X0(b0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int X1() {
        View viewB2 = b2(0, J(), false, true);
        if (viewB2 == null) {
            return -1;
        }
        return g0(viewB2);
    }

    public int Z1() {
        View viewB2 = b2(J() - 1, -1, false, true);
        if (viewB2 == null) {
            return -1;
        }
        return g0(viewB2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i10) {
        if (J() == 0) {
            return null;
        }
        int i11 = (i10 < g0(I(0))) != this.f3116x ? -1 : 1;
        return this.f3111s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    View a2(int i10, int i11) {
        byte b10;
        int i12;
        int i13;
        S1();
        if (i11 > i10) {
            b10 = 1;
        } else {
            b10 = i11 < i10 ? (byte) -1 : (byte) 0;
        }
        if (b10 == 0) {
            return I(i10);
        }
        if (this.f3113u.g(I(i10)) < this.f3113u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f3111s == 0 ? this.f3208e.a(i10, i11, i12, i13) : this.f3209f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.D = dVar;
            if (this.A != -1) {
                dVar.b();
            }
            s1();
        }
    }

    View b2(int i10, int i11, boolean z10, boolean z11) {
        S1();
        int i12 = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return this.f3111s == 0 ? this.f3208e.a(i10, i11, i13, i12) : this.f3209f.a(i10, i11, i13, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable c1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (J() > 0) {
            S1();
            boolean z10 = this.f3114v ^ this.f3116x;
            dVar.f3143c = z10;
            if (z10) {
                View viewH2 = h2();
                dVar.f3142b = this.f3113u.i() - this.f3113u.d(viewH2);
                dVar.f3141a = g0(viewH2);
            } else {
                View viewI2 = i2();
                dVar.f3141a = g0(viewI2);
                dVar.f3142b = this.f3113u.g(viewI2) - this.f3113u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    View e2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int iJ;
        int i11;
        S1();
        int iJ2 = J();
        if (z11) {
            iJ = J() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iJ2;
            iJ = 0;
            i11 = 1;
        }
        int iB = b0Var.b();
        int iM = this.f3113u.m();
        int i12 = this.f3113u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iJ != i10) {
            View viewI = I(iJ);
            int iG0 = g0(viewI);
            int iG = this.f3113u.g(viewI);
            int iD = this.f3113u.d(viewI);
            if (iG0 >= 0 && iG0 < iB) {
                if (!((RecyclerView.q) viewI.getLayoutParams()).c()) {
                    boolean z12 = iD <= iM && iG < iM;
                    boolean z13 = iG >= i12 && iD > i12;
                    if (!z12 && !z13) {
                        return viewI;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = viewI;
                        } else if (view == null) {
                            view = viewI;
                        }
                    } else if (z12) {
                        view2 = viewI;
                    } else if (view == null) {
                        view = viewI;
                    }
                } else if (view3 == null) {
                    view3 = viewI;
                }
            }
            iJ += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.D == null) {
            super.g(str);
        }
    }

    @Deprecated
    protected int j2(RecyclerView.b0 b0Var) {
        if (b0Var.d()) {
            return this.f3113u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.f3111s == 0;
    }

    public int k2() {
        return this.f3111s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.f3111s == 1;
    }

    protected boolean l2() {
        return Y() == 1;
    }

    public boolean m2() {
        return this.f3118z;
    }

    void n2(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int iD0;
        int iF;
        View viewD = cVar.d(wVar);
        if (viewD == null) {
            bVar.f3125b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.f3139l == null) {
            if (this.f3116x == (cVar.f3133f == -1)) {
                d(viewD);
            } else {
                e(viewD, 0);
            }
        } else {
            if (this.f3116x == (cVar.f3133f == -1)) {
                b(viewD);
            } else {
                c(viewD, 0);
            }
        }
        z0(viewD, 0, 0);
        bVar.f3124a = this.f3113u.e(viewD);
        if (this.f3111s == 1) {
            if (l2()) {
                iF = n0() - e0();
                iD0 = iF - this.f3113u.f(viewD);
            } else {
                iD0 = d0();
                iF = this.f3113u.f(viewD) + iD0;
            }
            if (cVar.f3133f == -1) {
                int i13 = cVar.f3129b;
                i12 = i13;
                i11 = iF;
                i10 = i13 - bVar.f3124a;
            } else {
                int i14 = cVar.f3129b;
                i10 = i14;
                i11 = iF;
                i12 = bVar.f3124a + i14;
            }
        } else {
            int iF0 = f0();
            int iF2 = this.f3113u.f(viewD) + iF0;
            if (cVar.f3133f == -1) {
                int i15 = cVar.f3129b;
                i11 = i15;
                i10 = iF0;
                i12 = iF2;
                iD0 = i15 - bVar.f3124a;
            } else {
                int i16 = cVar.f3129b;
                i10 = iF0;
                i11 = bVar.f3124a + i16;
                i12 = iF2;
                iD0 = i16;
            }
        }
        y0(viewD, iD0, i10, i11, i12);
        if (qVar.c() || qVar.b()) {
            bVar.f3126c = true;
        }
        bVar.f3127d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        if (this.f3111s != 0) {
            i10 = i11;
        }
        if (J() == 0 || i10 == 0) {
            return;
        }
        S1();
        D2(i10 > 0 ? 1 : -1, Math.abs(i10), true, b0Var);
        M1(b0Var, this.f3112t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.D;
        if (dVar == null || !dVar.a()) {
            v2();
            z10 = this.f3116x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z10 = dVar2.f3143c;
            i11 = dVar2.f3141a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.b0 b0Var) {
        return N1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.b0 b0Var) {
        return O1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.b0 b0Var) {
        return P1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.b0 b0Var) {
        return N1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.b0 b0Var) {
        return O1(b0Var);
    }

    boolean u2() {
        return this.f3113u.k() == 0 && this.f3113u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.b0 b0Var) {
        return P1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3111s == 1) {
            return 0;
        }
        return w2(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void w1(int i10) {
        this.A = i10;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        s1();
    }

    int w2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        S1();
        this.f3112t.f3128a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        D2(i11, iAbs, true, b0Var);
        c cVar = this.f3112t;
        int iT1 = cVar.f3134g + T1(wVar, cVar, b0Var, false);
        if (iT1 < 0) {
            return 0;
        }
        if (iAbs > iT1) {
            i10 = i11 * iT1;
        }
        this.f3113u.r(-i10);
        this.f3112t.f3138k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3111s == 0) {
            return 0;
        }
        return w2(i10, wVar, b0Var);
    }

    public void x2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        g(null);
        if (i10 != this.f3111s || this.f3113u == null) {
            i iVarB = i.b(this, i10);
            this.f3113u = iVarB;
            this.E.f3119a = iVarB;
            this.f3111s = i10;
            s1();
        }
    }

    public void y2(boolean z10) {
        g(null);
        if (z10 == this.f3115w) {
            return;
        }
        this.f3115w = z10;
        s1();
    }

    public void z2(boolean z10) {
        g(null);
        if (this.f3117y == z10) {
            return;
        }
        this.f3117y = z10;
        s1();
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f3111s = 1;
        this.f3115w = false;
        this.f3116x = false;
        this.f3117y = false;
        this.f3118z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        x2(i10);
        y2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f3111s = 1;
        this.f3115w = false;
        this.f3116x = false;
        this.f3117y = false;
        this.f3118z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d dVarH0 = RecyclerView.p.h0(context, attributeSet, i10, i11);
        x2(dVarH0.f3224a);
        y2(dVarH0.f3226c);
        z2(dVarH0.f3227d);
    }

    void p2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i10) {
    }
}
