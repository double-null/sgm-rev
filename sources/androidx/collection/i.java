package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* JADX INFO: compiled from: SparseArrayCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class i<E> implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f1646e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f1648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f1649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1650d;

    public i() {
        this(10);
    }

    private void g() {
        int i10 = this.f1650d;
        int[] iArr = this.f1648b;
        Object[] objArr = this.f1649c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1646e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1647a = false;
        this.f1650d = i11;
    }

    public void a(int i10, E e10) {
        int i11 = this.f1650d;
        if (i11 != 0 && i10 <= this.f1648b[i11 - 1]) {
            k(i10, e10);
            return;
        }
        if (this.f1647a && i11 >= this.f1648b.length) {
            g();
        }
        int i12 = this.f1650d;
        if (i12 >= this.f1648b.length) {
            int iE = d.e(i12 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f1648b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1649c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1648b = iArr;
            this.f1649c = objArr;
        }
        this.f1648b[i12] = i10;
        this.f1649c[i12] = e10;
        this.f1650d = i12 + 1;
    }

    public void b() {
        int i10 = this.f1650d;
        Object[] objArr = this.f1649c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1650d = 0;
        this.f1647a = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f1648b = (int[]) this.f1648b.clone();
            iVar.f1649c = (Object[]) this.f1649c.clone();
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E h(int i10) {
        return i(i10, null);
    }

    public E i(int i10, E e10) {
        E e11;
        int iA = d.a(this.f1648b, this.f1650d, i10);
        return (iA < 0 || (e11 = (E) this.f1649c[iA]) == f1646e) ? e10 : e11;
    }

    public int j(int i10) {
        if (this.f1647a) {
            g();
        }
        return this.f1648b[i10];
    }

    public void k(int i10, E e10) {
        int iA = d.a(this.f1648b, this.f1650d, i10);
        if (iA >= 0) {
            this.f1649c[iA] = e10;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f1650d;
        if (i11 < i12) {
            Object[] objArr = this.f1649c;
            if (objArr[i11] == f1646e) {
                this.f1648b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f1647a && i12 >= this.f1648b.length) {
            g();
            i11 = ~d.a(this.f1648b, this.f1650d, i10);
        }
        int i13 = this.f1650d;
        if (i13 >= this.f1648b.length) {
            int iE = d.e(i13 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f1648b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1649c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1648b = iArr;
            this.f1649c = objArr2;
        }
        int i14 = this.f1650d;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f1648b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f1649c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f1650d - i11);
        }
        this.f1648b[i11] = i10;
        this.f1649c[i11] = e10;
        this.f1650d++;
    }

    public int l() {
        if (this.f1647a) {
            g();
        }
        return this.f1650d;
    }

    public E m(int i10) {
        if (this.f1647a) {
            g();
        }
        return (E) this.f1649c[i10];
    }

    public String toString() {
        if (l() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1650d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1650d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i10));
            sb2.append('=');
            E eM = m(i10);
            if (eM != this) {
                sb2.append(eM);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public i(int i10) {
        this.f1647a = false;
        if (i10 == 0) {
            this.f1648b = d.f1616a;
            this.f1649c = d.f1618c;
        } else {
            int iE = d.e(i10);
            this.f1648b = new int[iE];
            this.f1649c = new Object[iE];
        }
    }
}
