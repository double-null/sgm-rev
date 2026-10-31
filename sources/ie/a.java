package ie;

import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements e, c {
    @Override // ie.e
    public String A() {
        Object objJ = J();
        t.d(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }

    @Override // ie.e
    public boolean B() {
        return true;
    }

    @Override // ie.e
    public <T> T C(fe.c<? extends T> cVar) {
        return (T) e.a.a(this, cVar);
    }

    @Override // ie.c
    public final <T> T D(he.f descriptor, int i10, fe.c<? extends T> deserializer, T t10) {
        t.f(descriptor, "descriptor");
        t.f(deserializer, "deserializer");
        return (deserializer.getDescriptor().b() || B()) ? (T) I(deserializer, t10) : (T) i();
    }

    @Override // ie.c
    public final byte E(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return G();
    }

    @Override // ie.c
    public <T> T F(he.f descriptor, int i10, fe.c<? extends T> deserializer, T t10) {
        t.f(descriptor, "descriptor");
        t.f(deserializer, "deserializer");
        return (T) I(deserializer, t10);
    }

    @Override // ie.e
    public abstract byte G();

    @Override // ie.e
    public int H(he.f enumDescriptor) {
        t.f(enumDescriptor, "enumDescriptor");
        Object objJ = J();
        t.d(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    public <T> T I(fe.c<? extends T> deserializer, T t10) {
        t.f(deserializer, "deserializer");
        return (T) C(deserializer);
    }

    public Object J() {
        throw new SerializationException(i0.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // ie.e
    public c b(he.f descriptor) {
        t.f(descriptor, "descriptor");
        return this;
    }

    @Override // ie.c
    public void c(he.f descriptor) {
        t.f(descriptor, "descriptor");
    }

    @Override // ie.c
    public int e(he.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // ie.e
    public abstract int h();

    @Override // ie.e
    public Void i() {
        return null;
    }

    @Override // ie.c
    public final float j(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return t();
    }

    @Override // ie.e
    public abstract long k();

    @Override // ie.c
    public final String l(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return A();
    }

    @Override // ie.c
    public e m(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return r(descriptor.h(i10));
    }

    @Override // ie.c
    public final double n(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return u();
    }

    @Override // ie.c
    public final char o(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return w();
    }

    @Override // ie.c
    public final boolean p(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return v();
    }

    @Override // ie.c
    public boolean q() {
        return c.a.b(this);
    }

    @Override // ie.e
    public e r(he.f descriptor) {
        t.f(descriptor, "descriptor");
        return this;
    }

    @Override // ie.e
    public abstract short s();

    @Override // ie.e
    public float t() {
        Object objJ = J();
        t.d(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }

    @Override // ie.e
    public double u() {
        Object objJ = J();
        t.d(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    @Override // ie.e
    public boolean v() {
        Object objJ = J();
        t.d(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // ie.e
    public char w() {
        Object objJ = J();
        t.d(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    @Override // ie.c
    public final int x(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return h();
    }

    @Override // ie.c
    public final long y(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return k();
    }

    @Override // ie.c
    public final short z(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return s();
    }
}
