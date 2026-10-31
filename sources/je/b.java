package je;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b<T> implements fe.d<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T b(ie.c cVar) {
        return (T) ie.c.a.c(cVar, getDescriptor(), 1, fe.i.a(this, cVar, cVar.l(getDescriptor(), 0)), null, 8, null);
    }

    public fe.c<T> c(ie.c decoder, String str) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return decoder.a().e(e(), str);
    }

    public fe.m<T> d(ie.f encoder, T value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        return encoder.a().f(e(), value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fe.c
    public final T deserialize(ie.e decoder) {
        T t10;
        kotlin.jvm.internal.t.f(decoder, "decoder");
        he.f descriptor = getDescriptor();
        ie.c cVarB = decoder.b(descriptor);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (cVarB.q()) {
            t10 = (T) b(cVarB);
        } else {
            t10 = null;
            while (true) {
                int iF = cVarB.f(getDescriptor());
                if (iF == -1) {
                    if (t10 != null) {
                        kotlin.jvm.internal.t.d(t10, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) h0Var.f21514a)).toString());
                }
                if (iF == 0) {
                    h0Var.f21514a = (T) cVarB.l(getDescriptor(), iF);
                } else {
                    if (iF != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) h0Var.f21514a;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(iF);
                        throw new SerializationException(sb2.toString());
                    }
                    T t11 = h0Var.f21514a;
                    if (t11 == 0) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                    h0Var.f21514a = t11;
                    t10 = (T) ie.c.a.c(cVarB, getDescriptor(), iF, fe.i.a(this, cVarB, (String) t11), null, 8, null);
                }
            }
        }
        cVarB.c(descriptor);
        return t10;
    }

    public abstract pd.c<T> e();

    @Override // fe.m
    public final void serialize(ie.f encoder, T value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        fe.m<? super T> mVarB = fe.i.b(this, encoder, value);
        he.f descriptor = getDescriptor();
        ie.d dVarB = encoder.b(descriptor);
        dVarB.A(getDescriptor(), 0, mVarB.getDescriptor().i());
        he.f descriptor2 = getDescriptor();
        kotlin.jvm.internal.t.d(mVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarB.E(descriptor2, 1, mVarB, value);
        dVarB.c(descriptor);
    }
}
