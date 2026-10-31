package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: ViewBoundsCheck.java */
/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f3429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f3430b = new a();

    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3431a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3435e;

        a() {
        }

        void a(int i10) {
            this.f3431a = i10 | this.f3431a;
        }

        boolean b() {
            int i10 = this.f3431a;
            if ((i10 & 7) != 0 && (i10 & (c(this.f3434d, this.f3432b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f3431a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f3434d, this.f3433c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f3431a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f3435e, this.f3432b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f3431a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f3435e, this.f3433c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f3431a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f3432b = i10;
            this.f3433c = i11;
            this.f3434d = i12;
            this.f3435e = i13;
        }
    }

    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    m(b bVar) {
        this.f3429a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iC = this.f3429a.c();
        int iD = this.f3429a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f3429a.a(i10);
            this.f3430b.e(iC, iD, this.f3429a.b(viewA), this.f3429a.e(viewA));
            if (i12 != 0) {
                this.f3430b.d();
                this.f3430b.a(i12);
                if (this.f3430b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f3430b.d();
                this.f3430b.a(i13);
                if (this.f3430b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f3430b.e(this.f3429a.c(), this.f3429a.d(), this.f3429a.b(view), this.f3429a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f3430b.d();
        this.f3430b.a(i10);
        return this.f3430b.b();
    }
}
