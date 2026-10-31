package com.google.gson.internal.bind;

import g4.i;
import g4.l;
import g4.m;
import g4.n;
import g4.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: JsonTreeWriter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends m4.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Writer f12449o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final o f12450p = new o("closed");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<l> f12451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f12452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f12453n;

    /* JADX INFO: compiled from: JsonTreeWriter.java */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f12449o);
        this.f12451l = new ArrayList();
        this.f12453n = m.f15373a;
    }

    private l Y() {
        List<l> list = this.f12451l;
        return list.get(list.size() - 1);
    }

    private void a0(l lVar) {
        if (this.f12452m != null) {
            if (!lVar.f() || o()) {
                ((n) Y()).i(this.f12452m, lVar);
            }
            this.f12452m = null;
            return;
        }
        if (this.f12451l.isEmpty()) {
            this.f12453n = lVar;
            return;
        }
        l lVarY = Y();
        if (!(lVarY instanceof i)) {
            throw new IllegalStateException();
        }
        ((i) lVarY).i(lVar);
    }

    @Override // m4.c
    public m4.c H(long j10) throws IOException {
        a0(new o(Long.valueOf(j10)));
        return this;
    }

    @Override // m4.c
    public m4.c I(Boolean bool) throws IOException {
        if (bool == null) {
            return u();
        }
        a0(new o(bool));
        return this;
    }

    @Override // m4.c
    public m4.c J(Number number) throws IOException {
        if (number == null) {
            return u();
        }
        if (!p()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a0(new o(number));
        return this;
    }

    @Override // m4.c
    public m4.c K(String str) throws IOException {
        if (str == null) {
            return u();
        }
        a0(new o(str));
        return this;
    }

    @Override // m4.c
    public m4.c L(boolean z10) throws IOException {
        a0(new o(Boolean.valueOf(z10)));
        return this;
    }

    public l U() {
        if (this.f12451l.isEmpty()) {
            return this.f12453n;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f12451l);
    }

    @Override // m4.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f12451l.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f12451l.add(f12450p);
    }

    @Override // m4.c
    public m4.c e() throws IOException {
        i iVar = new i();
        a0(iVar);
        this.f12451l.add(iVar);
        return this;
    }

    @Override // m4.c
    public m4.c f() throws IOException {
        n nVar = new n();
        a0(nVar);
        this.f12451l.add(nVar);
        return this;
    }

    @Override // m4.c
    public m4.c k() throws IOException {
        if (this.f12451l.isEmpty() || this.f12452m != null) {
            throw new IllegalStateException();
        }
        if (!(Y() instanceof i)) {
            throw new IllegalStateException();
        }
        List<l> list = this.f12451l;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // m4.c
    public m4.c n() throws IOException {
        if (this.f12451l.isEmpty() || this.f12452m != null) {
            throw new IllegalStateException();
        }
        if (!(Y() instanceof n)) {
            throw new IllegalStateException();
        }
        List<l> list = this.f12451l;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // m4.c
    public m4.c s(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f12451l.isEmpty() || this.f12452m != null) {
            throw new IllegalStateException();
        }
        if (!(Y() instanceof n)) {
            throw new IllegalStateException();
        }
        this.f12452m = str;
        return this;
    }

    @Override // m4.c
    public m4.c u() throws IOException {
        a0(m.f15373a);
        return this;
    }

    @Override // m4.c, java.io.Flushable
    public void flush() throws IOException {
    }
}
