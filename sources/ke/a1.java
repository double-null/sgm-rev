package ke;

import java.util.List;

/* JADX INFO: compiled from: PolymorphismValidator.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a1 implements le.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21321b;

    public a1(boolean z10, String discriminator) {
        kotlin.jvm.internal.t.f(discriminator, "discriminator");
        this.f21320a = z10;
        this.f21321b = discriminator;
    }

    private final void f(he.f fVar, pd.c<?> cVar) {
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            String strF = fVar.f(i10);
            if (kotlin.jvm.internal.t.a(strF, this.f21321b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + cVar + " has property '" + strF + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void g(he.f fVar, pd.c<?> cVar) {
        he.m mVarD = fVar.d();
        if ((mVarD instanceof he.d) || kotlin.jvm.internal.t.a(mVarD, he.m.a.f15862a)) {
            throw new IllegalArgumentException("Serializer for " + cVar.g() + " can't be registered as a subclass for polymorphic serialization because its kind " + mVarD + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f21320a) {
            return;
        }
        if (kotlin.jvm.internal.t.a(mVarD, he.n.b.f15865a) || kotlin.jvm.internal.t.a(mVarD, he.n.c.f15866a) || (mVarD instanceof he.e) || (mVarD instanceof he.m.b)) {
            throw new IllegalArgumentException("Serializer for " + cVar.g() + " of kind " + mVarD + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // le.f
    public <T> void a(pd.c<T> kClass, id.l<? super List<? extends fe.d<?>>, ? extends fe.d<?>> provider) {
        kotlin.jvm.internal.t.f(kClass, "kClass");
        kotlin.jvm.internal.t.f(provider, "provider");
    }

    @Override // le.f
    public <Base> void b(pd.c<Base> baseClass, id.l<? super Base, ? extends fe.m<? super Base>> defaultSerializerProvider) {
        kotlin.jvm.internal.t.f(baseClass, "baseClass");
        kotlin.jvm.internal.t.f(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // le.f
    public <T> void c(pd.c<T> cVar, fe.d<T> dVar) {
        le.f.a.b(this, cVar, dVar);
    }

    @Override // le.f
    public <Base> void d(pd.c<Base> baseClass, id.l<? super String, ? extends fe.c<? extends Base>> defaultDeserializerProvider) {
        kotlin.jvm.internal.t.f(baseClass, "baseClass");
        kotlin.jvm.internal.t.f(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // le.f
    public <Base, Sub extends Base> void e(pd.c<Base> baseClass, pd.c<Sub> actualClass, fe.d<Sub> actualSerializer) {
        kotlin.jvm.internal.t.f(baseClass, "baseClass");
        kotlin.jvm.internal.t.f(actualClass, "actualClass");
        kotlin.jvm.internal.t.f(actualSerializer, "actualSerializer");
        he.f descriptor = actualSerializer.getDescriptor();
        g(descriptor, actualClass);
        if (this.f21320a) {
            return;
        }
        f(descriptor, actualClass);
    }
}
