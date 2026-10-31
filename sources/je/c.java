package je;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static final Void a(String str, pd.c<?> baseClass) {
        String str2;
        kotlin.jvm.internal.t.f(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.g() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.g() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    public static final Void b(pd.c<?> subClass, pd.c<?> baseClass) {
        kotlin.jvm.internal.t.f(subClass, "subClass");
        kotlin.jvm.internal.t.f(baseClass, "baseClass");
        String strG = subClass.g();
        if (strG == null) {
            strG = String.valueOf(subClass);
        }
        a(strG, baseClass);
        throw new KotlinNothingValueException();
    }
}
