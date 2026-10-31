package je;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class z2<Tag> implements ie.f, ie.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Tag> f21046a = new ArrayList<>();

    private final boolean H(he.f fVar, int i10) {
        Z(X(fVar, i10));
        return true;
    }

    @Override // ie.d
    public final void A(he.f descriptor, int i10, String value) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(value, "value");
        T(X(descriptor, i10), value);
    }

    @Override // ie.f
    public ie.d B(he.f fVar, int i10) {
        return ie.f.a.a(this, fVar, i10);
    }

    @Override // ie.f
    public final void D(int i10) {
        Q(Y(), i10);
    }

    @Override // ie.d
    public <T> void E(he.f descriptor, int i10, fe.m<? super T> serializer, T t10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(serializer, "serializer");
        if (H(descriptor, i10)) {
            q(serializer, t10);
        }
    }

    @Override // ie.d
    public final void F(he.f descriptor, int i10, char c10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        L(X(descriptor, i10), c10);
    }

    @Override // ie.f
    public final void G(String value) {
        kotlin.jvm.internal.t.f(value, "value");
        T(Y(), value);
    }

    public <T> void I(fe.m<? super T> mVar, T t10) {
        ie.f.a.c(this, mVar, t10);
    }

    protected abstract void J(Tag tag, boolean z10);

    protected abstract void K(Tag tag, byte b10);

    protected abstract void L(Tag tag, char c10);

    protected abstract void M(Tag tag, double d10);

    protected abstract void N(Tag tag, he.f fVar, int i10);

    protected abstract void O(Tag tag, float f10);

    protected ie.f P(Tag tag, he.f inlineDescriptor) {
        kotlin.jvm.internal.t.f(inlineDescriptor, "inlineDescriptor");
        Z(tag);
        return this;
    }

    protected abstract void Q(Tag tag, int i10);

    protected abstract void R(Tag tag, long j10);

    protected abstract void S(Tag tag, short s10);

    protected abstract void T(Tag tag, String str);

    protected abstract void U(he.f fVar);

    protected final Tag V() {
        return (Tag) kotlin.collections.b0.X(this.f21046a);
    }

    protected final Tag W() {
        return (Tag) kotlin.collections.b0.Y(this.f21046a);
    }

    protected abstract Tag X(he.f fVar, int i10);

    protected final Tag Y() {
        if (!(!this.f21046a.isEmpty())) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.f21046a;
        return arrayList.remove(kotlin.collections.t.m(arrayList));
    }

    protected final void Z(Tag tag) {
        this.f21046a.add(tag);
    }

    @Override // ie.d
    public final void c(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        if (!this.f21046a.isEmpty()) {
            Y();
        }
        U(descriptor);
    }

    @Override // ie.d
    public final void e(he.f descriptor, int i10, float f10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        O(X(descriptor, i10), f10);
    }

    @Override // ie.f
    public final void f(double d10) {
        M(Y(), d10);
    }

    @Override // ie.f
    public final void g(byte b10) {
        K(Y(), b10);
    }

    @Override // ie.d
    public final void h(he.f descriptor, int i10, int i11) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        Q(X(descriptor, i10), i11);
    }

    @Override // ie.d
    public final void i(he.f descriptor, int i10, byte b10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        K(X(descriptor, i10), b10);
    }

    @Override // ie.d
    public final void j(he.f descriptor, int i10, boolean z10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        J(X(descriptor, i10), z10);
    }

    @Override // ie.d
    public final void k(he.f descriptor, int i10, double d10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        M(X(descriptor, i10), d10);
    }

    @Override // ie.f
    public final void l(he.f enumDescriptor, int i10) {
        kotlin.jvm.internal.t.f(enumDescriptor, "enumDescriptor");
        N(Y(), enumDescriptor, i10);
    }

    @Override // ie.f
    public final void m(long j10) {
        R(Y(), j10);
    }

    @Override // ie.f
    public ie.f n(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return P(Y(), descriptor);
    }

    @Override // ie.d
    public final void p(he.f descriptor, int i10, long j10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        R(X(descriptor, i10), j10);
    }

    @Override // ie.f
    public abstract <T> void q(fe.m<? super T> mVar, T t10);

    @Override // ie.d
    public final void s(he.f descriptor, int i10, short s10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        S(X(descriptor, i10), s10);
    }

    @Override // ie.d
    public final ie.f t(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return P(X(descriptor, i10), descriptor.h(i10));
    }

    @Override // ie.f
    public final void u(short s10) {
        S(Y(), s10);
    }

    @Override // ie.f
    public final void v(boolean z10) {
        J(Y(), z10);
    }

    @Override // ie.f
    public final void x(float f10) {
        O(Y(), f10);
    }

    @Override // ie.f
    public final void y(char c10) {
        L(Y(), c10);
    }

    @Override // ie.d
    public <T> void o(he.f descriptor, int i10, fe.m<? super T> mVar, T t10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(mVar, TwDPD.tWbBkjGW);
        if (H(descriptor, i10)) {
            I(mVar, t10);
        }
    }
}
