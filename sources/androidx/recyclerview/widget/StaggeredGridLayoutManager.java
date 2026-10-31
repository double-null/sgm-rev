package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    f[] f3250t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i f3251u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    i f3252v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f3253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f3254x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final androidx.recyclerview.widget.f f3255y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f3249s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f3256z = false;
    boolean A = false;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.R1();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f3262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f3263f;

        b() {
            c();
        }

        void a() {
            this.f3259b = this.f3260c ? StaggeredGridLayoutManager.this.f3251u.i() : StaggeredGridLayoutManager.this.f3251u.m();
        }

        void b(int i10) {
            if (this.f3260c) {
                this.f3259b = StaggeredGridLayoutManager.this.f3251u.i() - i10;
            } else {
                this.f3259b = StaggeredGridLayoutManager.this.f3251u.m() + i10;
            }
        }

        void c() {
            this.f3258a = -1;
            this.f3259b = Integer.MIN_VALUE;
            this.f3260c = false;
            this.f3261d = false;
            this.f3262e = false;
            int[] iArr = this.f3263f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3263f;
            if (iArr == null || iArr.length < length) {
                this.f3263f = new int[StaggeredGridLayoutManager.this.f3250t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f3263f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        f f3265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3266f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f3266f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int[] f3276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f3278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<d.a> f3279g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f3280h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f3281i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f3282j;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        void a() {
            this.f3276d = null;
            this.f3275c = 0;
            this.f3273a = -1;
            this.f3274b = -1;
        }

        void b() {
            this.f3276d = null;
            this.f3275c = 0;
            this.f3277e = 0;
            this.f3278f = null;
            this.f3279g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3273a);
            parcel.writeInt(this.f3274b);
            parcel.writeInt(this.f3275c);
            if (this.f3275c > 0) {
                parcel.writeIntArray(this.f3276d);
            }
            parcel.writeInt(this.f3277e);
            if (this.f3277e > 0) {
                parcel.writeIntArray(this.f3278f);
            }
            parcel.writeInt(this.f3280h ? 1 : 0);
            parcel.writeInt(this.f3281i ? 1 : 0);
            parcel.writeInt(this.f3282j ? 1 : 0);
            parcel.writeList(this.f3279g);
        }

        e(Parcel parcel) {
            this.f3273a = parcel.readInt();
            this.f3274b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f3275c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f3276d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f3277e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f3278f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3280h = parcel.readInt() == 1;
            this.f3281i = parcel.readInt() == 1;
            this.f3282j = parcel.readInt() == 1;
            this.f3279g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f3275c = eVar.f3275c;
            this.f3273a = eVar.f3273a;
            this.f3274b = eVar.f3274b;
            this.f3276d = eVar.f3276d;
            this.f3277e = eVar.f3277e;
            this.f3278f = eVar.f3278f;
            this.f3280h = eVar.f3280h;
            this.f3281i = eVar.f3281i;
            this.f3282j = eVar.f3282j;
            this.f3279g = eVar.f3279g;
        }
    }

    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<View> f3283a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3284b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3285c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3286d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f3287e;

        f(int i10) {
            this.f3287e = i10;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f3265e = this;
            this.f3283a.add(view);
            this.f3285c = Integer.MIN_VALUE;
            if (this.f3283a.size() == 1) {
                this.f3284b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3286d += StaggeredGridLayoutManager.this.f3251u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int iL = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f3251u.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f3251u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f3285c = iL;
                    this.f3284b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList<View> arrayList = this.f3283a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f3285c = StaggeredGridLayoutManager.this.f3251u.d(view);
            if (cVarN.f3266f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f3270b == 1) {
                this.f3285c += aVarF.a(this.f3287e);
            }
        }

        void d() {
            d.a aVarF;
            View view = this.f3283a.get(0);
            c cVarN = n(view);
            this.f3284b = StaggeredGridLayoutManager.this.f3251u.g(view);
            if (cVarN.f3266f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f3270b == -1) {
                this.f3284b -= aVarF.a(this.f3287e);
            }
        }

        void e() {
            this.f3283a.clear();
            q();
            this.f3286d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f3256z ? i(this.f3283a.size() - 1, -1, true) : i(0, this.f3283a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f3256z ? i(0, this.f3283a.size(), true) : i(this.f3283a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iM = StaggeredGridLayoutManager.this.f3251u.m();
            int i12 = StaggeredGridLayoutManager.this.f3251u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f3283a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f3251u.g(view);
                int iD = StaggeredGridLayoutManager.this.f3251u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iM : iD >= iM) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iM && iD <= i12) {
                            return StaggeredGridLayoutManager.this.g0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.g0(view);
                        }
                        if (iG < iM || iD > i12) {
                            return StaggeredGridLayoutManager.this.g0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f3286d;
        }

        int k() {
            int i10 = this.f3285c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f3285c;
        }

        int l(int i10) {
            int i11 = this.f3285c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3283a.size() == 0) {
                return i10;
            }
            c();
            return this.f3285c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f3283a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3283a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3256z && staggeredGridLayoutManager.g0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3256z && staggeredGridLayoutManager2.g0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3283a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f3283a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3256z && staggeredGridLayoutManager3.g0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3256z && staggeredGridLayoutManager4.g0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f3284b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f3284b;
        }

        int p(int i10) {
            int i11 = this.f3284b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3283a.size() == 0) {
                return i10;
            }
            d();
            return this.f3284b;
        }

        void q() {
            this.f3284b = Integer.MIN_VALUE;
            this.f3285c = Integer.MIN_VALUE;
        }

        void r(int i10) {
            int i11 = this.f3284b;
            if (i11 != Integer.MIN_VALUE) {
                this.f3284b = i11 + i10;
            }
            int i12 = this.f3285c;
            if (i12 != Integer.MIN_VALUE) {
                this.f3285c = i12 + i10;
            }
        }

        void s() {
            int size = this.f3283a.size();
            View viewRemove = this.f3283a.remove(size - 1);
            c cVarN = n(viewRemove);
            cVarN.f3265e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f3286d -= StaggeredGridLayoutManager.this.f3251u.e(viewRemove);
            }
            if (size == 1) {
                this.f3284b = Integer.MIN_VALUE;
            }
            this.f3285c = Integer.MIN_VALUE;
        }

        void t() {
            View viewRemove = this.f3283a.remove(0);
            c cVarN = n(viewRemove);
            cVarN.f3265e = null;
            if (this.f3283a.size() == 0) {
                this.f3285c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3286d -= StaggeredGridLayoutManager.this.f3251u.e(viewRemove);
            }
            this.f3284b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f3265e = this;
            this.f3283a.add(0, view);
            this.f3284b = Integer.MIN_VALUE;
            if (this.f3283a.size() == 1) {
                this.f3285c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3286d += StaggeredGridLayoutManager.this.f3251u.e(view);
            }
        }

        void v(int i10) {
            this.f3284b = i10;
            this.f3285c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d dVarH0 = RecyclerView.p.h0(context, attributeSet, i10, i11);
        G2(dVarH0.f3224a);
        I2(dVarH0.f3225b);
        H2(dVarH0.f3226c);
        this.f3255y = new androidx.recyclerview.widget.f();
        Z1();
    }

    private void A2(RecyclerView.w wVar, int i10) {
        for (int iJ = J() - 1; iJ >= 0; iJ--) {
            View viewI = I(iJ);
            if (this.f3251u.g(viewI) < i10 || this.f3251u.q(viewI) < i10) {
                return;
            }
            c cVar = (c) viewI.getLayoutParams();
            if (cVar.f3266f) {
                for (int i11 = 0; i11 < this.f3249s; i11++) {
                    if (this.f3250t[i11].f3283a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3249s; i12++) {
                    this.f3250t[i12].s();
                }
            } else if (cVar.f3265e.f3283a.size() == 1) {
                return;
            } else {
                cVar.f3265e.s();
            }
            l1(viewI, wVar);
        }
    }

    private void B2(RecyclerView.w wVar, int i10) {
        while (J() > 0) {
            View viewI = I(0);
            if (this.f3251u.d(viewI) > i10 || this.f3251u.p(viewI) > i10) {
                return;
            }
            c cVar = (c) viewI.getLayoutParams();
            if (cVar.f3266f) {
                for (int i11 = 0; i11 < this.f3249s; i11++) {
                    if (this.f3250t[i11].f3283a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3249s; i12++) {
                    this.f3250t[i12].t();
                }
            } else if (cVar.f3265e.f3283a.size() == 1) {
                return;
            } else {
                cVar.f3265e.t();
            }
            l1(viewI, wVar);
        }
    }

    private void C2() {
        if (this.f3252v.k() == 1073741824) {
            return;
        }
        int iJ = J();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < iJ; i10++) {
            View viewI = I(i10);
            float fE = this.f3252v.e(viewI);
            if (fE >= fMax) {
                if (((c) viewI.getLayoutParams()).e()) {
                    fE = (fE * 1.0f) / this.f3249s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f3254x;
        int iRound = Math.round(fMax * this.f3249s);
        if (this.f3252v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f3252v.n());
        }
        O2(iRound);
        if (this.f3254x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iJ; i12++) {
            View viewI2 = I(i12);
            c cVar = (c) viewI2.getLayoutParams();
            if (!cVar.f3266f) {
                if (s2() && this.f3253w == 1) {
                    int i13 = this.f3249s;
                    int i14 = cVar.f3265e.f3287e;
                    viewI2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f3254x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f3265e.f3287e;
                    int i16 = this.f3254x * i15;
                    int i17 = i15 * i11;
                    if (this.f3253w == 1) {
                        viewI2.offsetLeftAndRight(i16 - i17);
                    } else {
                        viewI2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void D2() {
        if (this.f3253w == 1 || !s2()) {
            this.A = this.f3256z;
        } else {
            this.A = !this.f3256z;
        }
    }

    private void F2(int i10) {
        androidx.recyclerview.widget.f fVar = this.f3255y;
        fVar.f3407e = i10;
        fVar.f3406d = this.A != (i10 == -1) ? -1 : 1;
    }

    private void J2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3249s; i12++) {
            if (!this.f3250t[i12].f3283a.isEmpty()) {
                P2(this.f3250t[i12], i10, i11);
            }
        }
    }

    private boolean K2(RecyclerView.b0 b0Var, b bVar) {
        bVar.f3258a = this.G ? f2(b0Var.b()) : b2(b0Var.b());
        bVar.f3259b = Integer.MIN_VALUE;
        return true;
    }

    private void L1(View view) {
        for (int i10 = this.f3249s - 1; i10 >= 0; i10--) {
            this.f3250t[i10].a(view);
        }
    }

    private void M1(b bVar) {
        e eVar = this.I;
        int i10 = eVar.f3275c;
        if (i10 > 0) {
            if (i10 == this.f3249s) {
                for (int i11 = 0; i11 < this.f3249s; i11++) {
                    this.f3250t[i11].e();
                    e eVar2 = this.I;
                    int i12 = eVar2.f3276d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f3281i ? this.f3251u.i() : this.f3251u.m();
                    }
                    this.f3250t[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.f3273a = eVar3.f3274b;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f3282j;
        H2(eVar4.f3280h);
        D2();
        e eVar5 = this.I;
        int i13 = eVar5.f3273a;
        if (i13 != -1) {
            this.C = i13;
            bVar.f3260c = eVar5.f3281i;
        } else {
            bVar.f3260c = this.A;
        }
        if (eVar5.f3277e > 1) {
            d dVar = this.E;
            dVar.f3267a = eVar5.f3278f;
            dVar.f3268b = eVar5.f3279g;
        }
    }

    private void N2(int i10, RecyclerView.b0 b0Var) {
        int iN;
        int iN2;
        int iC;
        androidx.recyclerview.widget.f fVar = this.f3255y;
        boolean z10 = false;
        fVar.f3404b = 0;
        fVar.f3405c = i10;
        if (!w0() || (iC = b0Var.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.A == (iC < i10)) {
                iN = this.f3251u.n();
                iN2 = 0;
            } else {
                iN2 = this.f3251u.n();
                iN = 0;
            }
        }
        if (M()) {
            this.f3255y.f3408f = this.f3251u.m() - iN2;
            this.f3255y.f3409g = this.f3251u.i() + iN;
        } else {
            this.f3255y.f3409g = this.f3251u.h() + iN;
            this.f3255y.f3408f = -iN2;
        }
        androidx.recyclerview.widget.f fVar2 = this.f3255y;
        fVar2.f3410h = false;
        fVar2.f3403a = true;
        if (this.f3251u.k() == 0 && this.f3251u.h() == 0) {
            z10 = true;
        }
        fVar2.f3411i = z10;
    }

    private void P1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f3407e == 1) {
            if (cVar.f3266f) {
                L1(view);
                return;
            } else {
                cVar.f3265e.a(view);
                return;
            }
        }
        if (cVar.f3266f) {
            y2(view);
        } else {
            cVar.f3265e.u(view);
        }
    }

    private void P2(f fVar, int i10, int i11) {
        int iJ = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + iJ <= i11) {
                this.B.set(fVar.f3287e, false);
            }
        } else if (fVar.k() - iJ >= i11) {
            this.B.set(fVar.f3287e, false);
        }
    }

    private int Q1(int i10) {
        if (J() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < i2()) != this.A ? -1 : 1;
    }

    private int Q2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean S1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.f3251u.i()) {
                ArrayList<View> arrayList = fVar.f3283a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f3266f;
            }
        } else if (fVar.o() > this.f3251u.m()) {
            return !fVar.n(fVar.f3283a.get(0)).f3266f;
        }
        return false;
    }

    private int T1(RecyclerView.b0 b0Var) {
        if (J() == 0) {
            return 0;
        }
        return k.a(b0Var, this.f3251u, d2(!this.N), c2(!this.N), this, this.N);
    }

    private int U1(RecyclerView.b0 b0Var) {
        if (J() == 0) {
            return 0;
        }
        return k.b(b0Var, this.f3251u, d2(!this.N), c2(!this.N), this, this.N, this.A);
    }

    private int V1(RecyclerView.b0 b0Var) {
        if (J() == 0) {
            return 0;
        }
        return k.c(b0Var, this.f3251u, d2(!this.N), c2(!this.N), this, this.N);
    }

    private int W1(int i10) {
        if (i10 == 1) {
            return (this.f3253w != 1 && s2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f3253w != 1 && s2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f3253w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f3253w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f3253w == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f3253w == 0 ? 1 : Integer.MIN_VALUE;
    }

    private d.a X1(int i10) {
        d.a aVar = new d.a();
        aVar.f3271c = new int[this.f3249s];
        for (int i11 = 0; i11 < this.f3249s; i11++) {
            aVar.f3271c[i11] = i10 - this.f3250t[i11].l(i10);
        }
        return aVar;
    }

    private d.a Y1(int i10) {
        d.a aVar = new d.a();
        aVar.f3271c = new int[this.f3249s];
        for (int i11 = 0; i11 < this.f3249s; i11++) {
            aVar.f3271c[i11] = this.f3250t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void Z1() {
        this.f3251u = i.b(this, this.f3253w);
        this.f3252v = i.b(this, 1 - this.f3253w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int a2(RecyclerView.w wVar, androidx.recyclerview.widget.f fVar, RecyclerView.b0 b0Var) {
        int i10;
        int iK2;
        f fVarO2;
        int iE;
        int i11;
        int iE2;
        int iE3;
        boolean z10;
        ?? r10 = 0;
        this.B.set(0, this.f3249s, true);
        if (this.f3255y.f3411i) {
            i10 = fVar.f3407e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i10 = fVar.f3407e == 1 ? fVar.f3409g + fVar.f3404b : fVar.f3408f - fVar.f3404b;
        }
        int i12 = i10;
        J2(fVar.f3407e, i12);
        int i13 = this.A ? this.f3251u.i() : this.f3251u.m();
        ?? r11 = false;
        while (fVar.a(b0Var) && (this.f3255y.f3411i || !this.B.isEmpty())) {
            View viewB = fVar.b(wVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = this.E.g(iA);
            ?? r12 = iG == -1 ? 1 : r10;
            if (r12 != 0) {
                fVarO2 = cVar.f3266f ? this.f3250t[r10] : o2(fVar);
                this.E.n(iA, fVarO2);
            } else {
                fVarO2 = this.f3250t[iG];
            }
            f fVar2 = fVarO2;
            cVar.f3265e = fVar2;
            if (fVar.f3407e == 1) {
                d(viewB);
            } else {
                e(viewB, r10);
            }
            u2(viewB, cVar, r10);
            if (fVar.f3407e == 1) {
                int iK3 = cVar.f3266f ? k2(i13) : fVar2.l(i13);
                int iE4 = this.f3251u.e(viewB) + iK3;
                if (r12 != 0 && cVar.f3266f) {
                    d.a aVarX1 = X1(iK3);
                    aVarX1.f3270b = -1;
                    aVarX1.f3269a = iA;
                    this.E.a(aVarX1);
                }
                i11 = iE4;
                iE = iK3;
            } else {
                int iN2 = cVar.f3266f ? n2(i13) : fVar2.p(i13);
                iE = iN2 - this.f3251u.e(viewB);
                if (r12 != 0 && cVar.f3266f) {
                    d.a aVarY1 = Y1(iN2);
                    aVarY1.f3270b = 1;
                    aVarY1.f3269a = iA;
                    this.E.a(aVarY1);
                }
                i11 = iN2;
            }
            if (cVar.f3266f && fVar.f3406d == -1) {
                if (r12 != 0) {
                    this.M = true;
                } else {
                    if (!(fVar.f3407e == 1 ? N1() : O1())) {
                        d.a aVarF = this.E.f(iA);
                        if (aVarF != null) {
                            aVarF.f3272d = true;
                        }
                        this.M = true;
                    }
                }
            }
            P1(viewB, cVar, fVar);
            if (s2() && this.f3253w == 1) {
                int i14 = cVar.f3266f ? this.f3252v.i() : this.f3252v.i() - (((this.f3249s - 1) - fVar2.f3287e) * this.f3254x);
                iE3 = i14;
                iE2 = i14 - this.f3252v.e(viewB);
            } else {
                int iM = cVar.f3266f ? this.f3252v.m() : (fVar2.f3287e * this.f3254x) + this.f3252v.m();
                iE2 = iM;
                iE3 = this.f3252v.e(viewB) + iM;
            }
            if (this.f3253w == 1) {
                y0(viewB, iE2, iE, iE3, i11);
            } else {
                y0(viewB, iE, iE2, i11, iE3);
            }
            if (cVar.f3266f) {
                J2(this.f3255y.f3407e, i12);
            } else {
                P2(fVar2, this.f3255y.f3407e, i12);
            }
            z2(wVar, this.f3255y);
            if (!this.f3255y.f3410h || !viewB.hasFocusable()) {
                z10 = false;
            } else if (cVar.f3266f) {
                this.B.clear();
                z10 = false;
            } else {
                z10 = false;
                this.B.set(fVar2.f3287e, false);
            }
            r10 = z10;
            r11 = true;
        }
        ?? r13 = r10;
        if (r11 == false) {
            z2(wVar, this.f3255y);
        }
        if (this.f3255y.f3407e == -1) {
            iK2 = this.f3251u.m() - n2(this.f3251u.m());
        } else {
            iK2 = k2(this.f3251u.i()) - this.f3251u.i();
        }
        return iK2 > 0 ? Math.min(fVar.f3404b, iK2) : r13 == true ? 1 : 0;
    }

    private int b2(int i10) {
        int iJ = J();
        for (int i11 = 0; i11 < iJ; i11++) {
            int iG0 = g0(I(i11));
            if (iG0 >= 0 && iG0 < i10) {
                return iG0;
            }
        }
        return 0;
    }

    private int f2(int i10) {
        for (int iJ = J() - 1; iJ >= 0; iJ--) {
            int iG0 = g0(I(iJ));
            if (iG0 >= 0 && iG0 < i10) {
                return iG0;
            }
        }
        return 0;
    }

    private void g2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10;
        int iK2 = k2(Integer.MIN_VALUE);
        if (iK2 != Integer.MIN_VALUE && (i10 = this.f3251u.i() - iK2) > 0) {
            int i11 = i10 - (-E2(-i10, wVar, b0Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f3251u.r(i11);
        }
    }

    private void h2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int iM;
        int iN2 = n2(Integer.MAX_VALUE);
        if (iN2 != Integer.MAX_VALUE && (iM = iN2 - this.f3251u.m()) > 0) {
            int iE2 = iM - E2(iM, wVar, b0Var);
            if (!z10 || iE2 <= 0) {
                return;
            }
            this.f3251u.r(-iE2);
        }
    }

    private int k2(int i10) {
        int iL = this.f3250t[0].l(i10);
        for (int i11 = 1; i11 < this.f3249s; i11++) {
            int iL2 = this.f3250t[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int l2(int i10) {
        int iP = this.f3250t[0].p(i10);
        for (int i11 = 1; i11 < this.f3249s; i11++) {
            int iP2 = this.f3250t[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int m2(int i10) {
        int iL = this.f3250t[0].l(i10);
        for (int i11 = 1; i11 < this.f3249s; i11++) {
            int iL2 = this.f3250t[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int n2(int i10) {
        int iP = this.f3250t[0].p(i10);
        for (int i11 = 1; i11 < this.f3249s; i11++) {
            int iP2 = this.f3250t[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f o2(androidx.recyclerview.widget.f fVar) {
        int i10;
        int i11;
        int i12;
        if (w2(fVar.f3407e)) {
            i11 = this.f3249s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f3249s;
            i11 = 0;
            i12 = 1;
        }
        f fVar2 = null;
        if (fVar.f3407e == 1) {
            int iM = this.f3251u.m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                f fVar3 = this.f3250t[i11];
                int iL = fVar3.l(iM);
                if (iL < i13) {
                    fVar2 = fVar3;
                    i13 = iL;
                }
                i11 += i12;
            }
            return fVar2;
        }
        int i14 = this.f3251u.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            f fVar4 = this.f3250t[i11];
            int iP = fVar4.p(i14);
            if (iP > i15) {
                fVar2 = fVar4;
                i15 = iP;
            }
            i11 += i12;
        }
        return fVar2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    private void p2(int i10, int i11, int i12) {
        int i13;
        int i14;
        int iJ2;
        int iJ3 = this.A ? j2() : i2();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            this.E.h(i14);
            if (i12 != 1) {
                this.E.j(i10, i11);
            } else if (i12 != 2) {
                this.E.k(i10, i11);
            } else if (i12 == 8) {
                this.E.k(i10, 1);
                this.E.j(i11, 1);
            }
            if (i13 <= iJ3) {
                return;
            }
            if (this.A) {
                iJ2 = i2();
            } else {
                iJ2 = j2();
            }
            if (i14 <= iJ2) {
                s1();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        this.E.h(i14);
        if (i12 != 1) {
            this.E.j(i10, i11);
        } else if (i12 != 2) {
            this.E.k(i10, i11);
        } else if (i12 == 8) {
            this.E.k(i10, 1);
            this.E.j(i11, 1);
        }
        if (i13 <= iJ3) {
            return;
        }
        if (this.A) {
            iJ2 = i2();
        } else {
            iJ2 = j2();
        }
        if (i14 <= iJ2) {
            s1();
        }
    }

    private void t2(View view, int i10, int i11, boolean z10) {
        j(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iQ2 = Q2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iQ3 = Q2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? G1(view, iQ2, iQ3, cVar) : E1(view, iQ2, iQ3, cVar)) {
            view.measure(iQ2, iQ3);
        }
    }

    private void u2(View view, c cVar, boolean z10) {
        if (cVar.f3266f) {
            if (this.f3253w == 1) {
                t2(view, this.J, RecyclerView.p.K(W(), X(), f0() + c0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                t2(view, RecyclerView.p.K(n0(), o0(), d0() + e0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z10);
                return;
            }
        }
        if (this.f3253w == 1) {
            t2(view, RecyclerView.p.K(this.f3254x, o0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.K(W(), X(), f0() + c0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            t2(view, RecyclerView.p.K(n0(), o0(), d0() + e0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.K(this.f3254x, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x015a  */
    private void v2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        boolean z11;
        e eVar;
        b bVar = this.L;
        if (!(this.I == null && this.C == -1) && b0Var.b() == 0) {
            j1(wVar);
            bVar.c();
            return;
        }
        boolean z12 = (bVar.f3262e && this.C == -1 && this.I == null) ? false : true;
        if (z12) {
            bVar.c();
            if (this.I != null) {
                M1(bVar);
            } else {
                D2();
                bVar.f3260c = this.A;
            }
            M2(b0Var, bVar);
            bVar.f3262e = true;
        }
        if (this.I == null && this.C == -1 && (bVar.f3260c != this.G || s2() != this.H)) {
            this.E.b();
            bVar.f3261d = true;
        }
        if (J() > 0 && ((eVar = this.I) == null || eVar.f3275c < 1)) {
            if (bVar.f3261d) {
                for (int i10 = 0; i10 < this.f3249s; i10++) {
                    this.f3250t[i10].e();
                    int i11 = bVar.f3259b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.f3250t[i10].v(i11);
                    }
                }
            } else if (z12 || this.L.f3263f == null) {
                for (int i12 = 0; i12 < this.f3249s; i12++) {
                    this.f3250t[i12].b(this.A, bVar.f3259b);
                }
                this.L.d(this.f3250t);
            } else {
                for (int i13 = 0; i13 < this.f3249s; i13++) {
                    f fVar = this.f3250t[i13];
                    fVar.e();
                    fVar.v(this.L.f3263f[i13]);
                }
            }
        }
        w(wVar);
        this.f3255y.f3403a = false;
        this.M = false;
        O2(this.f3252v.n());
        N2(bVar.f3258a, b0Var);
        if (bVar.f3260c) {
            F2(-1);
            a2(wVar, this.f3255y, b0Var);
            F2(1);
            androidx.recyclerview.widget.f fVar2 = this.f3255y;
            fVar2.f3405c = bVar.f3258a + fVar2.f3406d;
            a2(wVar, fVar2, b0Var);
        } else {
            F2(1);
            a2(wVar, this.f3255y, b0Var);
            F2(-1);
            androidx.recyclerview.widget.f fVar3 = this.f3255y;
            fVar3.f3405c = bVar.f3258a + fVar3.f3406d;
            a2(wVar, fVar3, b0Var);
        }
        C2();
        if (J() > 0) {
            if (this.A) {
                g2(wVar, b0Var, true);
                h2(wVar, b0Var, false);
            } else {
                h2(wVar, b0Var, true);
                g2(wVar, b0Var, false);
            }
        }
        if (z10 && !b0Var.e()) {
            if (this.F != 0 && J() > 0 && (this.M || q2() != null)) {
                n1(this.P);
                z11 = R1();
            }
        }
        if (b0Var.e()) {
            this.L.c();
        }
        this.G = bVar.f3260c;
        this.H = s2();
        if (z11) {
            this.L.c();
            v2(wVar, b0Var, false);
        }
    }

    private boolean w2(int i10) {
        if (this.f3253w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == s2();
    }

    private void y2(View view) {
        for (int i10 = this.f3249s - 1; i10 >= 0; i10--) {
            this.f3250t[i10].u(view);
        }
    }

    private void z2(RecyclerView.w wVar, androidx.recyclerview.widget.f fVar) {
        int iMin;
        if (!fVar.f3403a || fVar.f3411i) {
            return;
        }
        if (fVar.f3404b == 0) {
            if (fVar.f3407e == -1) {
                A2(wVar, fVar.f3409g);
                return;
            } else {
                B2(wVar, fVar.f3408f);
                return;
            }
        }
        if (fVar.f3407e == -1) {
            int i10 = fVar.f3408f;
            int iL2 = i10 - l2(i10);
            A2(wVar, iL2 < 0 ? fVar.f3409g : fVar.f3409g - Math.min(iL2, fVar.f3404b));
        } else {
            int iM2 = m2(fVar.f3409g) - fVar.f3409g;
            if (iM2 < 0) {
                iMin = fVar.f3408f;
            } else {
                iMin = Math.min(iM2, fVar.f3404b) + fVar.f3408f;
            }
            B2(wVar, iMin);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B0(int i10) {
        super.B0(i10);
        for (int i11 = 0; i11 < this.f3249s; i11++) {
            this.f3250t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(Rect rect, int i10, int i11) {
        int iN;
        int iN2;
        int iD0 = d0() + e0();
        int iF0 = f0() + c0();
        if (this.f3253w == 1) {
            iN2 = RecyclerView.p.n(i11, rect.height() + iF0, a0());
            iN = RecyclerView.p.n(i10, (this.f3254x * this.f3249s) + iD0, b0());
        } else {
            iN = RecyclerView.p.n(i10, rect.width() + iD0, b0());
            iN2 = RecyclerView.p.n(i11, (this.f3254x * this.f3249s) + iF0, a0());
        }
        A1(iN, iN2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C0(int i10) {
        super.C0(i10);
        for (int i11 = 0; i11 < this.f3249s; i11++) {
            this.f3250t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return this.f3253w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i10 = 0; i10 < this.f3249s; i10++) {
            this.f3250t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int E2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        x2(i10, b0Var);
        int iA2 = a2(wVar, this.f3255y, b0Var);
        if (this.f3255y.f3404b >= iA2) {
            i10 = i10 < 0 ? -iA2 : iA2;
        }
        this.f3251u.r(-i10);
        this.G = this.A;
        androidx.recyclerview.widget.f fVar = this.f3255y;
        fVar.f3404b = 0;
        z2(wVar, fVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void G2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        g(null);
        if (i10 == this.f3253w) {
            return;
        }
        this.f3253w = i10;
        i iVar = this.f3251u;
        this.f3251u = this.f3252v;
        this.f3252v = iVar;
        s1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.H0(recyclerView, wVar);
        n1(this.P);
        for (int i10 = 0; i10 < this.f3249s; i10++) {
            this.f3250t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        I1(gVar);
    }

    public void H2(boolean z10) {
        g(null);
        e eVar = this.I;
        if (eVar != null && eVar.f3280h != z10) {
            eVar.f3280h = z10;
        }
        this.f3256z = z10;
        s1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View I0(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View viewB;
        View viewM;
        if (J() == 0 || (viewB = B(view)) == null) {
            return null;
        }
        D2();
        int iW1 = W1(i10);
        if (iW1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewB.getLayoutParams();
        boolean z10 = cVar.f3266f;
        f fVar = cVar.f3265e;
        int iJ2 = iW1 == 1 ? j2() : i2();
        N2(iJ2, b0Var);
        F2(iW1);
        androidx.recyclerview.widget.f fVar2 = this.f3255y;
        fVar2.f3405c = fVar2.f3406d + iJ2;
        fVar2.f3404b = (int) (this.f3251u.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f3255y;
        fVar3.f3410h = true;
        fVar3.f3403a = false;
        a2(wVar, fVar3, b0Var);
        this.G = this.A;
        if (!z10 && (viewM = fVar.m(iJ2, iW1)) != null && viewM != viewB) {
            return viewM;
        }
        if (w2(iW1)) {
            for (int i11 = this.f3249s - 1; i11 >= 0; i11--) {
                View viewM2 = this.f3250t[i11].m(iJ2, iW1);
                if (viewM2 != null && viewM2 != viewB) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f3249s; i12++) {
                View viewM3 = this.f3250t[i12].m(iJ2, iW1);
                if (viewM3 != null && viewM3 != viewB) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f3256z ^ true) == (iW1 == -1);
        if (!z10) {
            View viewC = C(z11 ? fVar.f() : fVar.g());
            if (viewC != null && viewC != viewB) {
                return viewC;
            }
        }
        if (w2(iW1)) {
            for (int i13 = this.f3249s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f3287e) {
                    View viewC2 = C(z11 ? this.f3250t[i13].f() : this.f3250t[i13].g());
                    if (viewC2 != null && viewC2 != viewB) {
                        return viewC2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f3249s; i14++) {
                View viewC3 = C(z11 ? this.f3250t[i14].f() : this.f3250t[i14].g());
                if (viewC3 != null && viewC3 != viewB) {
                    return viewC3;
                }
            }
        }
        return null;
    }

    public void I2(int i10) {
        g(null);
        if (i10 != this.f3249s) {
            r2();
            this.f3249s = i10;
            this.B = new BitSet(this.f3249s);
            this.f3250t = new f[this.f3249s];
            for (int i11 = 0; i11 < this.f3249s; i11++) {
                this.f3250t[i11] = new f(i11);
            }
            s1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(AccessibilityEvent accessibilityEvent) {
        super.J0(accessibilityEvent);
        if (J() > 0) {
            View viewD2 = d2(false);
            View viewC2 = c2(false);
            if (viewD2 == null || viewC2 == null) {
                return;
            }
            int iG0 = g0(viewD2);
            int iG1 = g0(viewC2);
            if (iG0 < iG1) {
                accessibilityEvent.setFromIndex(iG0);
                accessibilityEvent.setToIndex(iG1);
            } else {
                accessibilityEvent.setFromIndex(iG1);
                accessibilityEvent.setToIndex(iG0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean K1() {
        return this.I == null;
    }

    boolean L2(RecyclerView.b0 b0Var, b bVar) {
        int i10;
        if (!b0Var.e() && (i10 = this.C) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.f3273a == -1 || eVar.f3275c < 1) {
                    View viewC = C(this.C);
                    if (viewC != null) {
                        bVar.f3258a = this.A ? j2() : i2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f3260c) {
                                bVar.f3259b = (this.f3251u.i() - this.D) - this.f3251u.d(viewC);
                            } else {
                                bVar.f3259b = (this.f3251u.m() + this.D) - this.f3251u.g(viewC);
                            }
                            return true;
                        }
                        if (this.f3251u.e(viewC) > this.f3251u.n()) {
                            bVar.f3259b = bVar.f3260c ? this.f3251u.i() : this.f3251u.m();
                            return true;
                        }
                        int iG = this.f3251u.g(viewC) - this.f3251u.m();
                        if (iG < 0) {
                            bVar.f3259b = -iG;
                            return true;
                        }
                        int i11 = this.f3251u.i() - this.f3251u.d(viewC);
                        if (i11 < 0) {
                            bVar.f3259b = i11;
                            return true;
                        }
                        bVar.f3259b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.C;
                        bVar.f3258a = i12;
                        int i13 = this.D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f3260c = Q1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f3261d = true;
                    }
                } else {
                    bVar.f3259b = Integer.MIN_VALUE;
                    bVar.f3258a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    void M2(RecyclerView.b0 b0Var, b bVar) {
        if (L2(b0Var, bVar) || K2(b0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f3258a = 0;
    }

    boolean N1() {
        int iL = this.f3250t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3249s; i10++) {
            if (this.f3250t[i10].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    boolean O1() {
        int iP = this.f3250t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3249s; i10++) {
            if (this.f3250t[i10].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    void O2(int i10) {
        this.f3254x = i10 / this.f3249s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f3252v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q0(RecyclerView recyclerView, int i10, int i11) {
        p2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView) {
        this.E.b();
        s1();
    }

    boolean R1() {
        int iI2;
        int iJ2;
        if (J() == 0 || this.F == 0 || !q0()) {
            return false;
        }
        if (this.A) {
            iI2 = j2();
            iJ2 = i2();
        } else {
            iI2 = i2();
            iJ2 = j2();
        }
        if (iI2 == 0 && q2() != null) {
            this.E.b();
            t1();
            s1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i10 = this.A ? -1 : 1;
        int i11 = iJ2 + 1;
        d.a aVarE = this.E.e(iI2, i11, i10, true);
        if (aVarE == null) {
            this.M = false;
            this.E.d(i11);
            return false;
        }
        d.a aVarE2 = this.E.e(iI2, aVarE.f3269a, i10 * (-1), true);
        if (aVarE2 == null) {
            this.E.d(aVarE.f3269a);
        } else {
            this.E.d(aVarE2.f3269a + 1);
        }
        t1();
        s1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView, int i10, int i11, int i12) {
        p2(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i10, int i11) {
        p2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        p2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        v2(wVar, b0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.b0 b0Var) {
        super.X0(b0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i10) {
        int iQ1 = Q1(i10);
        PointF pointF = new PointF();
        if (iQ1 == 0) {
            return null;
        }
        if (this.f3253w == 0) {
            pointF.x = iQ1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iQ1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.I = eVar;
            if (this.C != -1) {
                eVar.a();
                this.I.b();
            }
            s1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable c1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f3280h = this.f3256z;
        eVar.f3281i = this.G;
        eVar.f3282j = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f3267a) == null) {
            eVar.f3277e = 0;
        } else {
            eVar.f3278f = iArr;
            eVar.f3277e = iArr.length;
            eVar.f3279g = dVar.f3268b;
        }
        if (J() > 0) {
            eVar.f3273a = this.G ? j2() : i2();
            eVar.f3274b = e2();
            int i10 = this.f3249s;
            eVar.f3275c = i10;
            eVar.f3276d = new int[i10];
            for (int i11 = 0; i11 < this.f3249s; i11++) {
                if (this.G) {
                    iP = this.f3250t[i11].l(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f3251u.i();
                        iP -= iM;
                    }
                } else {
                    iP = this.f3250t[i11].p(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f3251u.m();
                        iP -= iM;
                    }
                }
                eVar.f3276d[i11] = iP;
            }
        } else {
            eVar.f3273a = -1;
            eVar.f3274b = -1;
            eVar.f3275c = 0;
        }
        return eVar;
    }

    View c2(boolean z10) {
        int iM = this.f3251u.m();
        int i10 = this.f3251u.i();
        View view = null;
        for (int iJ = J() - 1; iJ >= 0; iJ--) {
            View viewI = I(iJ);
            int iG = this.f3251u.g(viewI);
            int iD = this.f3251u.d(viewI);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewI;
                }
                if (view == null) {
                    view = viewI;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(int i10) {
        if (i10 == 0) {
            R1();
        }
    }

    View d2(boolean z10) {
        int iM = this.f3251u.m();
        int i10 = this.f3251u.i();
        int iJ = J();
        View view = null;
        for (int i11 = 0; i11 < iJ; i11++) {
            View viewI = I(i11);
            int iG = this.f3251u.g(viewI);
            if (this.f3251u.d(viewI) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewI;
                }
                if (view == null) {
                    view = viewI;
                }
            }
        }
        return view;
    }

    int e2() {
        View viewC2 = this.A ? c2(true) : d2(true);
        if (viewC2 == null) {
            return -1;
        }
        return g0(viewC2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.I == null) {
            super.g(str);
        }
    }

    int i2() {
        if (J() == 0) {
            return 0;
        }
        return g0(I(0));
    }

    int j2() {
        int iJ = J();
        if (iJ == 0) {
            return 0;
        }
        return g0(I(iJ - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.f3253w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.f3253w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.f3253w != 0) {
            i10 = i11;
        }
        if (J() == 0 || i10 == 0) {
            return;
        }
        x2(i10, b0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f3249s) {
            this.O = new int[this.f3249s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f3249s; i13++) {
            androidx.recyclerview.widget.f fVar = this.f3255y;
            if (fVar.f3406d == -1) {
                iL = fVar.f3408f;
                iP = this.f3250t[i13].p(iL);
            } else {
                iL = this.f3250t[i13].l(fVar.f3409g);
                iP = this.f3255y.f3409g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f3255y.a(b0Var); i15++) {
            cVar.a(this.f3255y.f3405c, this.O[i15]);
            androidx.recyclerview.widget.f fVar2 = this.f3255y;
            fVar2.f3405c += fVar2.f3406d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    View q2() {
        int i10;
        int i11;
        boolean z10;
        int iJ = J() - 1;
        BitSet bitSet = new BitSet(this.f3249s);
        bitSet.set(0, this.f3249s, true);
        byte b10 = (this.f3253w == 1 && s2()) ? (byte) 1 : (byte) -1;
        if (this.A) {
            i10 = -1;
        } else {
            i10 = iJ + 1;
            iJ = 0;
        }
        int i12 = iJ < i10 ? 1 : -1;
        while (iJ != i10) {
            View viewI = I(iJ);
            c cVar = (c) viewI.getLayoutParams();
            if (bitSet.get(cVar.f3265e.f3287e)) {
                if (S1(cVar.f3265e)) {
                    return viewI;
                }
                bitSet.clear(cVar.f3265e.f3287e);
            }
            if (!cVar.f3266f && (i11 = iJ + i12) != i10) {
                View viewI2 = I(i11);
                if (this.A) {
                    int iD = this.f3251u.d(viewI);
                    int iD2 = this.f3251u.d(viewI2);
                    if (iD < iD2) {
                        return viewI;
                    }
                    if (iD == iD2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    int iG = this.f3251u.g(viewI);
                    int iG2 = this.f3251u.g(viewI2);
                    if (iG > iG2) {
                        return viewI;
                    }
                    if (iG == iG2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    if ((cVar.f3265e.f3287e - ((c) viewI2.getLayoutParams()).f3265e.f3287e < 0) != (b10 < 0)) {
                        return viewI;
                    }
                } else {
                    continue;
                }
            }
            iJ += i12;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r0() {
        return this.F != 0;
    }

    public void r2() {
        this.E.b();
        s1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.b0 b0Var) {
        return V1(b0Var);
    }

    boolean s2() {
        return Y() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.b0 b0Var) {
        return V1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return E2(i10, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void w1(int i10) {
        e eVar = this.I;
        if (eVar != null && eVar.f3273a != i10) {
            eVar.a();
        }
        this.C = i10;
        this.D = Integer.MIN_VALUE;
        s1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return E2(i10, wVar, b0Var);
    }

    void x2(int i10, RecyclerView.b0 b0Var) {
        int iI2;
        int i11;
        if (i10 > 0) {
            iI2 = j2();
            i11 = 1;
        } else {
            iI2 = i2();
            i11 = -1;
        }
        this.f3255y.f3403a = true;
        N2(iI2, b0Var);
        F2(i11);
        androidx.recyclerview.widget.f fVar = this.f3255y;
        fVar.f3405c = iI2 + fVar.f3406d;
        fVar.f3404b = Math.abs(i10);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f3267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<a> f3268b;

        d() {
        }

        private int i(int i10) {
            if (this.f3268b == null) {
                return -1;
            }
            a aVarF = f(i10);
            if (aVarF != null) {
                this.f3268b.remove(aVarF);
            }
            int size = this.f3268b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.f3268b.get(i11).f3269a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = this.f3268b.get(i11);
            this.f3268b.remove(i11);
            return aVar.f3269a;
        }

        private void l(int i10, int i11) {
            List<a> list = this.f3268b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f3268b.get(size);
                int i12 = aVar.f3269a;
                if (i12 >= i10) {
                    aVar.f3269a = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List<a> list = this.f3268b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f3268b.get(size);
                int i13 = aVar.f3269a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f3268b.remove(size);
                    } else {
                        aVar.f3269a = i13 - i11;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f3268b == null) {
                this.f3268b = new ArrayList();
            }
            int size = this.f3268b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.f3268b.get(i10);
                if (aVar2.f3269a == aVar.f3269a) {
                    this.f3268b.remove(i10);
                }
                if (aVar2.f3269a >= aVar.f3269a) {
                    this.f3268b.add(i10, aVar);
                    return;
                }
            }
            this.f3268b.add(aVar);
        }

        void b() {
            int[] iArr = this.f3267a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3268b = null;
        }

        void c(int i10) {
            int[] iArr = this.f3267a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f3267a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f3267a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3267a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List<a> list = this.f3268b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3268b.get(size).f3269a >= i10) {
                        this.f3268b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List<a> list = this.f3268b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f3268b.get(i13);
                int i14 = aVar.f3269a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f3270b == i12 || (z10 && aVar.f3272d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List<a> list = this.f3268b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f3268b.get(size);
                if (aVar.f3269a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f3267a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f3267a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f3267a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f3267a.length;
            }
            int iMin = Math.min(i11 + 1, this.f3267a.length);
            Arrays.fill(this.f3267a, i10, iMin, -1);
            return iMin;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f3267a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3267a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f3267a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f3267a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3267a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f3267a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, f fVar) {
            c(i10);
            this.f3267a[i10] = fVar.f3287e;
        }

        int o(int i10) {
            int length = this.f3267a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0062a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f3269a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f3270b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int[] f3271c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f3272d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0062a implements Parcelable.Creator<a> {
                C0062a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f3269a = parcel.readInt();
                this.f3270b = parcel.readInt();
                this.f3272d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f3271c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f3271c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3269a + ", mGapDir=" + this.f3270b + ", mHasUnwantedGapAfter=" + this.f3272d + ", mGapPerSpan=" + Arrays.toString(this.f3271c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3269a);
                parcel.writeInt(this.f3270b);
                parcel.writeInt(this.f3272d ? 1 : 0);
                int[] iArr = this.f3271c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3271c);
                }
            }

            a() {
            }
        }
    }
}
