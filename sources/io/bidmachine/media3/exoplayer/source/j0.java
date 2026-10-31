package io.bidmachine.media3.exoplayer.source;

import android.util.SparseArray;

/* JADX INFO: compiled from: SpannedData.java */
/* JADX INFO: loaded from: classes4.dex */
final class j0<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.l<V> f19633c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f19632b = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19631a = -1;

    public j0(x7.l<V> lVar) {
        this.f19633c = lVar;
    }

    public void a(int i10, V v10) {
        if (this.f19631a == -1) {
            x7.a.g(this.f19632b.size() == 0);
            this.f19631a = 0;
        }
        if (this.f19632b.size() > 0) {
            SparseArray<V> sparseArray = this.f19632b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            x7.a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                x7.l<V> lVar = this.f19633c;
                SparseArray<V> sparseArray2 = this.f19632b;
                lVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f19632b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f19632b.size(); i10++) {
            this.f19633c.accept(this.f19632b.valueAt(i10));
        }
        this.f19631a = -1;
        this.f19632b.clear();
    }

    public void c(int i10) {
        for (int size = this.f19632b.size() - 1; size >= 0 && i10 < this.f19632b.keyAt(size); size--) {
            this.f19633c.accept(this.f19632b.valueAt(size));
            this.f19632b.removeAt(size);
        }
        this.f19631a = this.f19632b.size() > 0 ? Math.min(this.f19631a, this.f19632b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f19632b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f19632b.keyAt(i12)) {
                return;
            }
            this.f19633c.accept(this.f19632b.valueAt(i11));
            this.f19632b.removeAt(i11);
            int i13 = this.f19631a;
            if (i13 > 0) {
                this.f19631a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V e(int i10) {
        if (this.f19631a == -1) {
            this.f19631a = 0;
        }
        while (true) {
            int i11 = this.f19631a;
            if (i11 <= 0 || i10 >= this.f19632b.keyAt(i11)) {
                break;
            }
            this.f19631a--;
        }
        while (this.f19631a < this.f19632b.size() - 1 && i10 >= this.f19632b.keyAt(this.f19631a + 1)) {
            this.f19631a++;
        }
        return this.f19632b.valueAt(this.f19631a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f19632b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f19632b.size() == 0;
    }
}
