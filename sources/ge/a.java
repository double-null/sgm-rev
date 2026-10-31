package ge;

import fe.d;
import java.util.List;
import java.util.Map;
import je.a0;
import je.b3;
import je.c0;
import je.e1;
import je.e3;
import je.f;
import je.f1;
import je.f3;
import je.h;
import je.h1;
import je.h3;
import je.i;
import je.i3;
import je.j0;
import je.k;
import je.k3;
import je.l;
import je.l3;
import je.n3;
import je.o2;
import je.o3;
import je.p3;
import je.q;
import je.q1;
import je.q3;
import je.r;
import je.r1;
import je.t0;
import je.t2;
import je.u0;
import je.u2;
import je.v2;
import je.w1;
import je.z0;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.v;
import pd.c;
import td.b;
import wc.b0;
import wc.e0;
import wc.f0;
import wc.g0;
import wc.x;
import wc.y;
import wc.z;

/* JADX INFO: compiled from: BuiltinSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static final d<Long> A(v vVar) {
        t.f(vVar, "<this>");
        return f1.f20900a;
    }

    public static final d<Short> B(k0 k0Var) {
        t.f(k0Var, "<this>");
        return u2.f21019a;
    }

    public static final d<String> C(l0 l0Var) {
        t.f(l0Var, "<this>");
        return v2.f21024a;
    }

    public static final d<sd.a> D(sd.a.C0418a c0418a) {
        t.f(c0418a, "<this>");
        return c0.f20874a;
    }

    public static final d<b> E(b.a aVar) {
        t.f(aVar, "<this>");
        return q3.f20992a;
    }

    public static final d<x> F(x.a aVar) {
        t.f(aVar, "<this>");
        return f3.f20903a;
    }

    public static final d<z> G(z.a aVar) {
        t.f(aVar, "<this>");
        return i3.f20942a;
    }

    public static final d<b0> H(b0.a aVar) {
        t.f(aVar, "<this>");
        return l3.f20960a;
    }

    public static final d<e0> I(e0.a aVar) {
        t.f(aVar, "<this>");
        return o3.f20975a;
    }

    public static final d<g0> J(g0 g0Var) {
        t.f(g0Var, "<this>");
        return p3.f20986b;
    }

    public static final <T, E extends T> d<E[]> a(c<T> kClass, d<E> elementSerializer) {
        t.f(kClass, "kClass");
        t.f(elementSerializer, "elementSerializer");
        return new o2(kClass, elementSerializer);
    }

    public static final d<boolean[]> b() {
        return h.f20925c;
    }

    public static final d<byte[]> c() {
        return k.f20951c;
    }

    public static final d<char[]> d() {
        return q.f20988c;
    }

    public static final d<double[]> e() {
        return a0.f20864c;
    }

    public static final d<float[]> f() {
        return j0.f20946c;
    }

    public static final d<int[]> g() {
        return t0.f21011c;
    }

    public static final <T> d<List<T>> h(d<T> elementSerializer) {
        t.f(elementSerializer, "elementSerializer");
        return new f(elementSerializer);
    }

    public static final d<long[]> i() {
        return e1.f20894c;
    }

    public static final <K, V> d<Map.Entry<K, V>> j(d<K> keySerializer, d<V> valueSerializer) {
        t.f(keySerializer, "keySerializer");
        t.f(valueSerializer, "valueSerializer");
        return new h1(keySerializer, valueSerializer);
    }

    public static final <K, V> d<Map<K, V>> k(d<K> keySerializer, d<V> valueSerializer) {
        t.f(keySerializer, "keySerializer");
        t.f(valueSerializer, "valueSerializer");
        return new z0(keySerializer, valueSerializer);
    }

    public static final d l() {
        return q1.f20990a;
    }

    public static final <K, V> d<wc.q<K, V>> m(d<K> keySerializer, d<V> valueSerializer) {
        t.f(keySerializer, "keySerializer");
        t.f(valueSerializer, "valueSerializer");
        return new w1(keySerializer, valueSerializer);
    }

    public static final d<short[]> n() {
        return t2.f21013c;
    }

    public static final <A, B, C> d<wc.v<A, B, C>> o(d<A> aSerializer, d<B> bSerializer, d<C> cSerializer) {
        t.f(aSerializer, "aSerializer");
        t.f(bSerializer, "bSerializer");
        t.f(cSerializer, "cSerializer");
        return new b3(aSerializer, bSerializer, cSerializer);
    }

    public static final d<y> p() {
        return e3.f20896c;
    }

    public static final d<wc.a0> q() {
        return h3.f20932c;
    }

    public static final d<wc.c0> r() {
        return k3.f20956c;
    }

    public static final d<f0> s() {
        return n3.f20969c;
    }

    public static final <T> d<T> t(d<T> dVar) {
        t.f(dVar, "<this>");
        return dVar.getDescriptor().b() ? dVar : new r1(dVar);
    }

    public static final d<Boolean> u(kotlin.jvm.internal.d dVar) {
        t.f(dVar, "<this>");
        return i.f20933a;
    }

    public static final d<Byte> v(e eVar) {
        t.f(eVar, "<this>");
        return l.f20957a;
    }

    public static final d<Character> w(g gVar) {
        t.f(gVar, "<this>");
        return r.f20994a;
    }

    public static final d<Double> x(kotlin.jvm.internal.l lVar) {
        t.f(lVar, "<this>");
        return je.b0.f20867a;
    }

    public static final d<Float> y(m mVar) {
        t.f(mVar, "<this>");
        return je.k0.f20952a;
    }

    public static final d<Integer> z(s sVar) {
        t.f(sVar, "<this>");
        return u0.f21014a;
    }
}
