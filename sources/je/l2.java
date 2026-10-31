package je;

import java.util.Iterator;
import je.j2;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l2<Element, Array, Builder extends j2<Array>> extends v<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.f f20959b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(fe.d<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        kotlin.jvm.internal.t.f(primitiveSerializer, "primitiveSerializer");
        this.f20959b = new k2(primitiveSerializer.getDescriptor());
    }

    @Override // je.a
    protected final Iterator<Element> d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // je.a, fe.c
    public final Array deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // je.v, fe.d, fe.m, fe.c
    public final he.f getDescriptor() {
        return this.f20959b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Builder a() {
        return k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(Builder builder) {
        kotlin.jvm.internal.t.f(builder, "<this>");
        return builder.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(Builder builder, int i10) {
        kotlin.jvm.internal.t.f(builder, "<this>");
        builder.b(i10);
    }

    protected abstract Array r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.v
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(Builder builder, int i10, Element element) {
        kotlin.jvm.internal.t.f(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // je.v, fe.m
    public final void serialize(ie.f encoder, Array array) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        int iE = e(array);
        he.f fVar = this.f20959b;
        ie.d dVarB = encoder.B(fVar, iE);
        u(dVarB, array, iE);
        dVarB.c(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Array l(Builder builder) {
        kotlin.jvm.internal.t.f(builder, "<this>");
        return (Array) builder.a();
    }

    protected abstract void u(ie.d dVar, Array array, int i10);
}
