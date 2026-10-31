package com.google.gson.internal.bind;

import g4.i;
import g4.m;
import g4.n;
import g4.o;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: JsonTreeReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends m4.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Reader f12443t = new C0155a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Object f12444u = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Object[] f12445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f12446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String[] f12447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f12448s;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JsonTreeReader.java */
    class C0155a extends Reader {
        C0155a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    }

    private void p0(m4.b bVar) throws IOException {
        if (L() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + L() + u());
    }

    private Object q0() {
        return this.f12445p[this.f12446q - 1];
    }

    private Object r0() {
        Object[] objArr = this.f12445p;
        int i10 = this.f12446q - 1;
        this.f12446q = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void t0(Object obj) {
        int i10 = this.f12446q;
        Object[] objArr = this.f12445p;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f12445p = Arrays.copyOf(objArr, i11);
            this.f12448s = Arrays.copyOf(this.f12448s, i11);
            this.f12447r = (String[]) Arrays.copyOf(this.f12447r, i11);
        }
        Object[] objArr2 = this.f12445p;
        int i12 = this.f12446q;
        this.f12446q = i12 + 1;
        objArr2[i12] = obj;
    }

    private String u() {
        return " at path " + getPath();
    }

    @Override // m4.a
    public int B() throws IOException {
        m4.b bVarL = L();
        m4.b bVar = m4.b.NUMBER;
        if (bVarL != bVar && bVarL != m4.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarL + u());
        }
        int iL = ((o) q0()).l();
        r0();
        int i10 = this.f12446q;
        if (i10 > 0) {
            int[] iArr = this.f12448s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iL;
    }

    @Override // m4.a
    public String F() throws IOException {
        p0(m4.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) q0()).next();
        String str = (String) entry.getKey();
        this.f12447r[this.f12446q - 1] = str;
        t0(entry.getValue());
        return str;
    }

    @Override // m4.a
    public void H() throws IOException {
        p0(m4.b.NULL);
        r0();
        int i10 = this.f12446q;
        if (i10 > 0) {
            int[] iArr = this.f12448s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // m4.a
    public String J() throws IOException {
        m4.b bVarL = L();
        m4.b bVar = m4.b.STRING;
        if (bVarL == bVar || bVarL == m4.b.NUMBER) {
            String strP = ((o) r0()).p();
            int i10 = this.f12446q;
            if (i10 > 0) {
                int[] iArr = this.f12448s;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return strP;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarL + u());
    }

    @Override // m4.a
    public m4.b L() throws IOException {
        if (this.f12446q == 0) {
            return m4.b.END_DOCUMENT;
        }
        Object objQ0 = q0();
        if (objQ0 instanceof Iterator) {
            boolean z10 = this.f12445p[this.f12446q - 2] instanceof n;
            Iterator it = (Iterator) objQ0;
            if (!it.hasNext()) {
                return z10 ? m4.b.END_OBJECT : m4.b.END_ARRAY;
            }
            if (z10) {
                return m4.b.NAME;
            }
            t0(it.next());
            return L();
        }
        if (objQ0 instanceof n) {
            return m4.b.BEGIN_OBJECT;
        }
        if (objQ0 instanceof i) {
            return m4.b.BEGIN_ARRAY;
        }
        if (!(objQ0 instanceof o)) {
            if (objQ0 instanceof m) {
                return m4.b.NULL;
            }
            if (objQ0 == f12444u) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        o oVar = (o) objQ0;
        if (oVar.t()) {
            return m4.b.STRING;
        }
        if (oVar.q()) {
            return m4.b.BOOLEAN;
        }
        if (oVar.s()) {
            return m4.b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // m4.a
    public void b() throws IOException {
        p0(m4.b.BEGIN_ARRAY);
        t0(((i) q0()).iterator());
        this.f12448s[this.f12446q - 1] = 0;
    }

    @Override // m4.a
    public void c() throws IOException {
        p0(m4.b.BEGIN_OBJECT);
        t0(((n) q0()).j().iterator());
    }

    @Override // m4.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12445p = new Object[]{f12444u};
        this.f12446q = 1;
    }

    @Override // m4.a
    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (i10 < this.f12446q) {
            Object[] objArr = this.f12445p;
            Object obj = objArr[i10];
            if (obj instanceof i) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('[');
                    sb2.append(this.f12448s[i10]);
                    sb2.append(']');
                }
            } else if (obj instanceof n) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('.');
                    String str = this.f12447r[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    @Override // m4.a
    public void k() throws IOException {
        p0(m4.b.END_ARRAY);
        r0();
        r0();
        int i10 = this.f12446q;
        if (i10 > 0) {
            int[] iArr = this.f12448s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // m4.a
    public void n() throws IOException {
        p0(m4.b.END_OBJECT);
        r0();
        r0();
        int i10 = this.f12446q;
        if (i10 > 0) {
            int[] iArr = this.f12448s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // m4.a
    public void n0() throws IOException {
        if (L() == m4.b.NAME) {
            F();
            this.f12447r[this.f12446q - 2] = "null";
        } else {
            r0();
            int i10 = this.f12446q;
            if (i10 > 0) {
                this.f12447r[i10 - 1] = "null";
            }
        }
        int i11 = this.f12446q;
        if (i11 > 0) {
            int[] iArr = this.f12448s;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // m4.a
    public boolean p() throws IOException {
        m4.b bVarL = L();
        return (bVarL == m4.b.END_OBJECT || bVarL == m4.b.END_ARRAY) ? false : true;
    }

    public void s0() throws IOException {
        p0(m4.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) q0()).next();
        t0(entry.getValue());
        t0(new o((String) entry.getKey()));
    }

    @Override // m4.a
    public String toString() {
        return a.class.getSimpleName();
    }

    @Override // m4.a
    public boolean v() throws IOException {
        p0(m4.b.BOOLEAN);
        boolean zI = ((o) r0()).i();
        int i10 = this.f12446q;
        if (i10 > 0) {
            int[] iArr = this.f12448s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zI;
    }

    @Override // m4.a
    public double z() throws IOException {
        m4.b bVarL = L();
        m4.b bVar = m4.b.NUMBER;
        if (bVarL != bVar && bVarL != m4.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarL + u());
        }
        double dJ = ((o) q0()).j();
        if (!s() && (Double.isNaN(dJ) || Double.isInfinite(dJ))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dJ);
        }
        r0();
        int i10 = this.f12446q;
        if (i10 > 0) {
            int[] iArr = this.f12448s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dJ;
    }

    @Override // m4.a
    public long C() throws IOException {
        m4.b bVarL = L();
        m4.b bVar = m4.b.NUMBER;
        if (bVarL != bVar && bVarL != m4.b.STRING) {
            throw new IllegalStateException(CwEo.DbmGfridl + bVar + " but was " + bVarL + u());
        }
        long jM = ((o) q0()).m();
        r0();
        int i10 = this.f12446q;
        if (i10 > 0) {
            int[] iArr = this.f12448s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jM;
    }
}
