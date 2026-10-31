package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: ComparisonChain.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f11660a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m f11661b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final m f11662c = new b(1);

    /* JADX INFO: compiled from: ComparisonChain.java */
    class a extends m {
        a() {
            super(null);
        }

        @Override // com.google.common.collect.m
        public m d(int i10, int i11) {
            return k(Integer.compare(i10, i11));
        }

        @Override // com.google.common.collect.m
        public m e(long j10, long j11) {
            return k(Long.compare(j10, j11));
        }

        @Override // com.google.common.collect.m
        public <T> m f(T t10, T t11, Comparator<T> comparator) {
            return k(comparator.compare(t10, t11));
        }

        @Override // com.google.common.collect.m
        public m g(boolean z10, boolean z11) {
            return k(Boolean.compare(z10, z11));
        }

        @Override // com.google.common.collect.m
        public m h(boolean z10, boolean z11) {
            return k(Boolean.compare(z11, z10));
        }

        @Override // com.google.common.collect.m
        public int i() {
            return 0;
        }

        m k(int i10) {
            if (i10 < 0) {
                return m.f11661b;
            }
            return i10 > 0 ? m.f11662c : m.f11660a;
        }
    }

    private m() {
    }

    /* synthetic */ m(a aVar) {
        this();
    }

    public static m j() {
        return f11660a;
    }

    public abstract m d(int i10, int i11);

    public abstract m e(long j10, long j11);

    public abstract <T> m f(T t10, T t11, Comparator<T> comparator);

    public abstract m g(boolean z10, boolean z11);

    public abstract m h(boolean z10, boolean z11);

    public abstract int i();

    /* JADX INFO: compiled from: ComparisonChain.java */
    private static final class b extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f11663d;

        b(int i10) {
            super(null);
            this.f11663d = i10;
        }

        @Override // com.google.common.collect.m
        public int i() {
            return this.f11663d;
        }

        @Override // com.google.common.collect.m
        public m d(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.m
        public m e(long j10, long j11) {
            return this;
        }

        @Override // com.google.common.collect.m
        public m g(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.m
        public m h(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.m
        public <T> m f(T t10, T t11, Comparator<T> comparator) {
            return this;
        }
    }
}
