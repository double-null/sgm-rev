package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* JADX INFO: compiled from: LongSparseArray.java */
/* JADX INFO: loaded from: classes.dex */
public class e<E> implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f1619e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f1621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f1622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1623d;

    public e() {
        this(10);
    }

    private void g() {
        int i10 = this.f1623d;
        long[] jArr = this.f1621b;
        Object[] objArr = this.f1622c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1619e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1620a = false;
        this.f1623d = i11;
    }

    public void a() {
        int i10 = this.f1623d;
        Object[] objArr = this.f1622c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1623d = 0;
        this.f1620a = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f1621b = (long[]) this.f1621b.clone();
            eVar.f1622c = (Object[]) this.f1622c.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Deprecated
    public void d(long j10) {
        l(j10);
    }

    public E h(long j10) {
        return i(j10, null);
    }

    public E i(long j10, E e10) {
        E e11;
        int iB = d.b(this.f1621b, this.f1623d, j10);
        return (iB < 0 || (e11 = (E) this.f1622c[iB]) == f1619e) ? e10 : e11;
    }

    public long j(int i10) {
        if (this.f1620a) {
            g();
        }
        return this.f1621b[i10];
    }

    public void k(long j10, E e10) {
        int iB = d.b(this.f1621b, this.f1623d, j10);
        if (iB >= 0) {
            this.f1622c[iB] = e10;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f1623d;
        if (i10 < i11) {
            Object[] objArr = this.f1622c;
            if (objArr[i10] == f1619e) {
                this.f1621b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f1620a && i11 >= this.f1621b.length) {
            g();
            i10 = ~d.b(this.f1621b, this.f1623d, j10);
        }
        int i12 = this.f1623d;
        if (i12 >= this.f1621b.length) {
            int iF = d.f(i12 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f1621b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1622c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1621b = jArr;
            this.f1622c = objArr2;
        }
        int i13 = this.f1623d;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f1621b;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f1622c;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f1623d - i10);
        }
        this.f1621b[i10] = j10;
        this.f1622c[i10] = e10;
        this.f1623d++;
    }

    public void l(long j10) {
        int iB = d.b(this.f1621b, this.f1623d, j10);
        if (iB >= 0) {
            Object[] objArr = this.f1622c;
            Object obj = objArr[iB];
            Object obj2 = f1619e;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f1620a = true;
            }
        }
    }

    public void m(int i10) {
        Object[] objArr = this.f1622c;
        Object obj = objArr[i10];
        Object obj2 = f1619e;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f1620a = true;
        }
    }

    public int n() {
        if (this.f1620a) {
            g();
        }
        return this.f1623d;
    }

    public E o(int i10) {
        if (this.f1620a) {
            g();
        }
        return (E) this.f1622c[i10];
    }

    public String toString() {
        if (n() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1623d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1623d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i10));
            sb2.append('=');
            E eO = o(i10);
            if (eO != this) {
                sb2.append(eO);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public e(int i10) {
        this.f1620a = false;
        if (i10 == 0) {
            this.f1621b = d.f1617b;
            this.f1622c = d.f1618c;
        } else {
            int iF = d.f(i10);
            this.f1621b = new long[iF];
            this.f1622c = new Object[iF];
        }
    }
}
