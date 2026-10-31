package ie;

import fe.m;
import je.o1;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements f, d {
    @Override // ie.d
    public final void A(he.f descriptor, int i10, String value) {
        t.f(descriptor, "descriptor");
        t.f(value, "value");
        if (H(descriptor, i10)) {
            G(value);
        }
    }

    @Override // ie.f
    public d B(he.f fVar, int i10) {
        return f.a.a(this, fVar, i10);
    }

    @Override // ie.f
    public void D(int i10) {
        J(Integer.valueOf(i10));
    }

    @Override // ie.d
    public <T> void E(he.f descriptor, int i10, m<? super T> serializer, T t10) {
        t.f(descriptor, "descriptor");
        t.f(serializer, "serializer");
        if (H(descriptor, i10)) {
            q(serializer, t10);
        }
    }

    @Override // ie.d
    public final void F(he.f descriptor, int i10, char c10) {
        t.f(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            y(c10);
        }
    }

    @Override // ie.f
    public void G(String value) {
        t.f(value, "value");
        J(value);
    }

    public boolean H(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return true;
    }

    public <T> void I(m<? super T> mVar, T t10) {
        f.a.c(this, mVar, t10);
    }

    public void J(Object value) {
        t.f(value, "value");
        throw new SerializationException("Non-serializable " + i0.b(value.getClass()) + " is not supported by " + i0.b(getClass()) + " encoder");
    }

    @Override // ie.f
    public d b(he.f descriptor) {
        t.f(descriptor, "descriptor");
        return this;
    }

    @Override // ie.d
    public void c(he.f descriptor) {
        t.f(descriptor, "descriptor");
    }

    @Override // ie.d
    public final void e(he.f descriptor, int i10, float f10) {
        t.f(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            x(f10);
        }
    }

    @Override // ie.f
    public void f(double d10) {
        J(Double.valueOf(d10));
    }

    @Override // ie.f
    public void g(byte b10) {
        J(Byte.valueOf(b10));
    }

    @Override // ie.d
    public final void h(he.f descriptor, int i10, int i11) {
        t.f(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            D(i11);
        }
    }

    @Override // ie.d
    public final void i(he.f descriptor, int i10, byte b10) {
        t.f(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            g(b10);
        }
    }

    @Override // ie.d
    public final void j(he.f descriptor, int i10, boolean z10) {
        t.f(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            v(z10);
        }
    }

    @Override // ie.d
    public final void k(he.f descriptor, int i10, double d10) {
        t.f(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            f(d10);
        }
    }

    @Override // ie.f
    public void l(he.f enumDescriptor, int i10) {
        t.f(enumDescriptor, "enumDescriptor");
        J(Integer.valueOf(i10));
    }

    @Override // ie.f
    public void m(long j10) {
        J(Long.valueOf(j10));
    }

    @Override // ie.f
    public f n(he.f descriptor) {
        t.f(descriptor, "descriptor");
        return this;
    }

    @Override // ie.d
    public <T> void o(he.f descriptor, int i10, m<? super T> serializer, T t10) {
        t.f(descriptor, "descriptor");
        t.f(serializer, "serializer");
        if (H(descriptor, i10)) {
            I(serializer, t10);
        }
    }

    @Override // ie.d
    public final void p(he.f descriptor, int i10, long j10) {
        t.f(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            m(j10);
        }
    }

    @Override // ie.f
    public <T> void q(m<? super T> mVar, T t10) {
        f.a.d(this, mVar, t10);
    }

    @Override // ie.f
    public void r() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // ie.d
    public final void s(he.f descriptor, int i10, short s10) {
        t.f(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            u(s10);
        }
    }

    @Override // ie.d
    public final f t(he.f descriptor, int i10) {
        t.f(descriptor, "descriptor");
        return H(descriptor, i10) ? n(descriptor.h(i10)) : o1.f20971a;
    }

    @Override // ie.f
    public void u(short s10) {
        J(Short.valueOf(s10));
    }

    @Override // ie.f
    public void v(boolean z10) {
        J(Boolean.valueOf(z10));
    }

    @Override // ie.d
    public boolean w(he.f fVar, int i10) {
        return d.a.a(this, fVar, i10);
    }

    @Override // ie.f
    public void x(float f10) {
        J(Float.valueOf(f10));
    }

    @Override // ie.f
    public void y(char c10) {
        J(Character.valueOf(c10));
    }

    @Override // ie.f
    public void z() {
        f.a.b(this);
    }
}
