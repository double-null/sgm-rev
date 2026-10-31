package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: GapWorker.java */
/* JADX INFO: loaded from: classes.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal<e> f3388e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Comparator<c> f3389f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f3391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f3392c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<RecyclerView> f3390a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<c> f3393d = new ArrayList<>();

    /* JADX INFO: compiled from: GapWorker.java */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f3401d;
            if ((recyclerView == null) != (cVar2.f3401d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f3398a;
            if (z10 != cVar2.f3398a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f3399b - cVar.f3399b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f3400c - cVar2.f3400c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: GapWorker.java */
    static class b implements RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f3396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3397d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f3397d * 2;
            int[] iArr = this.f3396c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3396c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i12 * 2];
                this.f3396c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3396c;
            iArr4[i12] = i10;
            iArr4[i12 + 1] = i11;
            this.f3397d++;
        }

        void b() {
            int[] iArr = this.f3396c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3397d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f3397d = 0;
            int[] iArr = this.f3396c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || pVar == null || !pVar.t0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.mAdapterHelper.p()) {
                    pVar.p(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                pVar.o(this.f3394a, this.f3395b, recyclerView.mState, this);
            }
            int i10 = this.f3397d;
            if (i10 > pVar.f3216m) {
                pVar.f3216m = i10;
                pVar.f3217n = z10;
                recyclerView.mRecycler.P();
            }
        }

        boolean d(int i10) {
            if (this.f3396c != null) {
                int i11 = this.f3397d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3396c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f3394a = i10;
            this.f3395b = i11;
        }
    }

    /* JADX INFO: compiled from: GapWorker.java */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f3401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3402e;

        c() {
        }

        public void a() {
            this.f3398a = false;
            this.f3399b = 0;
            this.f3400c = 0;
            this.f3401d = null;
            this.f3402e = 0;
        }
    }

    e() {
    }

    private void c() {
        c cVar;
        int size = this.f3390a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f3390a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i10 += recyclerView.mPrefetchRegistry.f3397d;
            }
        }
        this.f3393d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f3390a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.f3394a) + Math.abs(bVar.f3395b);
                for (int i14 = 0; i14 < bVar.f3397d * 2; i14 += 2) {
                    if (i12 >= this.f3393d.size()) {
                        cVar = new c();
                        this.f3393d.add(cVar);
                    } else {
                        cVar = this.f3393d.get(i12);
                    }
                    int[] iArr = bVar.f3396c;
                    int i15 = iArr[i14 + 1];
                    cVar.f3398a = i15 <= iAbs;
                    cVar.f3399b = iAbs;
                    cVar.f3400c = i15;
                    cVar.f3401d = recyclerView2;
                    cVar.f3402e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3393d, f3389f);
    }

    private void d(c cVar, long j10) {
        RecyclerView.f0 f0VarJ = j(cVar.f3401d, cVar.f3402e, cVar.f3398a ? Long.MAX_VALUE : j10);
        if (f0VarJ == null || f0VarJ.mNestedRecyclerView == null || !f0VarJ.isBound() || f0VarJ.isInvalid()) {
            return;
        }
        i(f0VarJ.mNestedRecyclerView.get(), j10);
    }

    private void e(long j10) {
        for (int i10 = 0; i10 < this.f3393d.size(); i10++) {
            c cVar = this.f3393d.get(i10);
            if (cVar.f3401d == null) {
                return;
            }
            d(cVar, j10);
            cVar.a();
        }
    }

    static boolean f(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.mChildHelper.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void i(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f3397d != 0) {
            try {
                androidx.core.os.l.a("RV Nested Prefetch");
                recyclerView.mState.f(recyclerView.mAdapter);
                for (int i10 = 0; i10 < bVar.f3397d * 2; i10 += 2) {
                    j(recyclerView, bVar.f3396c[i10], j10);
                }
                androidx.core.os.l.b();
            } catch (Throwable th) {
                androidx.core.os.l.b();
                throw th;
            }
        }
    }

    private RecyclerView.f0 j(RecyclerView recyclerView, int i10, long j10) {
        if (f(recyclerView, i10)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.f0 f0VarN = wVar.N(i10, false, j10);
            if (f0VarN != null) {
                if (!f0VarN.isBound() || f0VarN.isInvalid()) {
                    wVar.a(f0VarN, false);
                } else {
                    wVar.G(f0VarN.itemView);
                }
            }
            return f0VarN;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f3390a.add(recyclerView);
    }

    void g(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f3391b == 0) {
            this.f3391b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i10, i11);
    }

    void h(long j10) {
        c();
        e(j10);
    }

    public void k(RecyclerView recyclerView) {
        this.f3390a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.l.a("RV Prefetch");
            if (!this.f3390a.isEmpty()) {
                int size = this.f3390a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f3390a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    h(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3392c);
                }
            }
        } finally {
            this.f3391b = 0L;
            androidx.core.os.l.b();
        }
    }
}
