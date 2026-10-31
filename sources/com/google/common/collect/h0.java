package com.google.common.collect;

import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: MultimapBuilder.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h0<K0, V0> {

    /* JADX INFO: compiled from: MultimapBuilder.java */
    class a extends e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11627a;

        a(int i10) {
            this.f11627a = i10;
        }

        @Override // com.google.common.collect.h0.e
        <K, V> Map<K, Collection<V>> c() {
            return o0.c(this.f11627a);
        }
    }

    /* JADX INFO: compiled from: MultimapBuilder.java */
    class b extends e<K0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f11628a;

        b(Comparator comparator) {
            this.f11628a = comparator;
        }

        @Override // com.google.common.collect.h0.e
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f11628a);
        }
    }

    /* JADX INFO: compiled from: MultimapBuilder.java */
    public static abstract class d<K0, V0> extends h0<K0, V0> {
        d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> a0<K, V> e();
    }

    /* JADX INFO: compiled from: MultimapBuilder.java */
    public static abstract class e<K0> {

        /* JADX INFO: compiled from: MultimapBuilder.java */
        class a extends d<K0, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f11630a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f11631b;

            a(e eVar, int i10) {
                this.f11630a = i10;
                this.f11631b = eVar;
            }

            @Override // com.google.common.collect.h0.d
            public <K extends K0, V> a0<K, V> e() {
                return i0.b(this.f11631b.c(), new c(this.f11630a));
            }
        }

        e() {
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i10) {
            h.b(i10, "expectedValuesPerKey");
            return new a(this, i10);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    private h0() {
    }

    /* synthetic */ h0(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i10) {
        h.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e<Comparable> c() {
        return d(n0.e());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        com.google.common.base.p.l(comparator);
        return new b(comparator);
    }

    /* JADX INFO: compiled from: MultimapBuilder.java */
    private static final class c<V> implements com.google.common.base.w<List<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11629a;

        @Override // com.google.common.base.w
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f11629a);
        }

        c(int i10) {
            this.f11629a = h.b(i10, cTJaRZ.jbPiwWFl);
        }
    }
}
