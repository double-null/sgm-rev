package ke;

import java.lang.annotation.Annotation;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: compiled from: Polymorphic.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z0 {

    /* JADX INFO: compiled from: Polymorphic.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.serialization.json.a.values().length];
            try {
                iArr[kotlinx.serialization.json.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.serialization.json.a.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.serialization.json.a.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void b(he.m kind) {
        kotlin.jvm.internal.t.f(kind, "kind");
        if (kind instanceof he.m.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof he.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof he.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final String c(he.f fVar, kotlinx.serialization.json.b json) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        kotlin.jvm.internal.t.f(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof kotlinx.serialization.json.f) {
                return ((kotlinx.serialization.json.f) annotation).discriminator();
            }
        }
        return json.e().e();
    }

    public static final Void d(String str, kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.t.f(element, "element");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + kotlin.jvm.internal.i0.b(element.getClass()).g() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(fe.m<?> mVar, fe.m<?> mVar2, String str) {
        if ((mVar instanceof fe.j) && je.v0.a(mVar2.getDescriptor()).contains(str)) {
            String strI = ((fe.j) mVar).getDescriptor().i();
            throw new IllegalStateException(("Sealed class '" + mVar2.getDescriptor().i() + "' cannot be serialized as base class '" + strI + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
