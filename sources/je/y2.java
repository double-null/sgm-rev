package je;

import java.util.ArrayList;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class y2<Tag> implements ie.e, ie.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Tag> f21041a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21042b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(y2 y2Var, fe.c cVar, Object obj) {
        return (cVar.getDescriptor().b() || y2Var.B()) ? y2Var.M(cVar, obj) : y2Var.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object L(y2 y2Var, fe.c cVar, Object obj) {
        return y2Var.M(cVar, obj);
    }

    private final <E> E d0(Tag tag, id.a<? extends E> aVar) {
        c0(tag);
        E eInvoke = aVar.invoke();
        if (!this.f21042b) {
            b0();
        }
        this.f21042b = false;
        return eInvoke;
    }

    @Override // ie.e
    public final String A() {
        return X(b0());
    }

    @Override // ie.e
    public abstract <T> T C(fe.c<? extends T> cVar);

    @Override // ie.c
    public final <T> T D(he.f descriptor, int i10, final fe.c<? extends T> deserializer, final T t10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        return (T) d0(Z(descriptor, i10), new id.a() { // from class: je.w2
            @Override // id.a
            public final Object invoke() {
                return y2.K(this.f21028a, deserializer, t10);
            }
        });
    }

    @Override // ie.c
    public final byte E(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return O(Z(descriptor, i10));
    }

    @Override // ie.c
    public final <T> T F(he.f descriptor, int i10, final fe.c<? extends T> deserializer, final T t10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        return (T) d0(Z(descriptor, i10), new id.a() { // from class: je.x2
            @Override // id.a
            public final Object invoke() {
                return y2.L(this.f21036a, deserializer, t10);
            }
        });
    }

    @Override // ie.e
    public final byte G() {
        return O(b0());
    }

    @Override // ie.e
    public final int H(he.f enumDescriptor) {
        kotlin.jvm.internal.t.f(enumDescriptor, "enumDescriptor");
        return R(b0(), enumDescriptor);
    }

    protected <T> T M(fe.c<? extends T> deserializer, T t10) {
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        return (T) C(deserializer);
    }

    protected abstract boolean N(Tag tag);

    protected abstract byte O(Tag tag);

    protected abstract char P(Tag tag);

    protected abstract double Q(Tag tag);

    protected abstract int R(Tag tag, he.f fVar);

    protected abstract float S(Tag tag);

    protected ie.e T(Tag tag, he.f inlineDescriptor) {
        kotlin.jvm.internal.t.f(inlineDescriptor, "inlineDescriptor");
        c0(tag);
        return this;
    }

    protected abstract int U(Tag tag);

    protected abstract long V(Tag tag);

    protected abstract short W(Tag tag);

    protected abstract String X(Tag tag);

    protected final Tag Y() {
        return (Tag) kotlin.collections.b0.Y(this.f21041a);
    }

    protected abstract Tag Z(he.f fVar, int i10);

    public final ArrayList<Tag> a0() {
        return this.f21041a;
    }

    protected final Tag b0() {
        ArrayList<Tag> arrayList = this.f21041a;
        Tag tagRemove = arrayList.remove(kotlin.collections.t.m(arrayList));
        this.f21042b = true;
        return tagRemove;
    }

    protected final void c0(Tag tag) {
        this.f21041a.add(tag);
    }

    @Override // ie.c
    public int e(he.f fVar) {
        return ie.c.a.a(this, fVar);
    }

    @Override // ie.e
    public final int h() {
        return U(b0());
    }

    @Override // ie.e
    public final Void i() {
        return null;
    }

    @Override // ie.c
    public final float j(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return S(Z(descriptor, i10));
    }

    @Override // ie.e
    public final long k() {
        return V(b0());
    }

    @Override // ie.c
    public final String l(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return X(Z(descriptor, i10));
    }

    @Override // ie.c
    public final ie.e m(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return T(Z(descriptor, i10), descriptor.h(i10));
    }

    @Override // ie.c
    public final double n(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return Q(Z(descriptor, i10));
    }

    @Override // ie.c
    public final char o(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return P(Z(descriptor, i10));
    }

    @Override // ie.c
    public final boolean p(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return N(Z(descriptor, i10));
    }

    @Override // ie.c
    public boolean q() {
        return ie.c.a.b(this);
    }

    @Override // ie.e
    public ie.e r(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return T(b0(), descriptor);
    }

    @Override // ie.e
    public final short s() {
        return W(b0());
    }

    @Override // ie.e
    public final float t() {
        return S(b0());
    }

    @Override // ie.e
    public final double u() {
        return Q(b0());
    }

    @Override // ie.e
    public final boolean v() {
        return N(b0());
    }

    @Override // ie.e
    public final char w() {
        return P(b0());
    }

    @Override // ie.c
    public final int x(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return U(Z(descriptor, i10));
    }

    @Override // ie.c
    public final long y(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return V(Z(descriptor, i10));
    }

    @Override // ie.c
    public final short z(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return W(Z(descriptor, i10));
    }
}
