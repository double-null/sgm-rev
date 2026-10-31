package fe;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.i0;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public static final <T> c<T> a(je.b<T> bVar, ie.c decoder, String str) {
        kotlin.jvm.internal.t.f(bVar, "<this>");
        kotlin.jvm.internal.t.f(decoder, "decoder");
        c<T> cVarC = bVar.c(decoder, str);
        if (cVarC != null) {
            return cVarC;
        }
        je.c.a(str, bVar.e());
        throw new KotlinNothingValueException();
    }

    public static final <T> m<T> b(je.b<T> bVar, ie.f encoder, T value) {
        kotlin.jvm.internal.t.f(bVar, "<this>");
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        m<T> mVarD = bVar.d(encoder, value);
        if (mVarD != null) {
            return mVarD;
        }
        je.c.b(i0.b(value.getClass()), bVar.e());
        throw new KotlinNothingValueException();
    }
}
