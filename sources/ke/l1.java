package ke;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l1 {
    public static final <T> T a(kotlinx.serialization.json.b json, kotlinx.serialization.json.i element, fe.c<? extends T> deserializer) {
        ie.e o0Var;
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(element, "element");
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        if (element instanceof kotlinx.serialization.json.d0) {
            o0Var = new s0(json, (kotlinx.serialization.json.d0) element, null, null, 12, null);
        } else if (element instanceof kotlinx.serialization.json.c) {
            o0Var = new u0(json, (kotlinx.serialization.json.c) element);
        } else {
            if (!(element instanceof kotlinx.serialization.json.w) && !kotlin.jvm.internal.t.a(element, kotlinx.serialization.json.a0.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            o0Var = new o0(json, (kotlinx.serialization.json.g0) element, null, 4, null);
        }
        return (T) o0Var.C(deserializer);
    }

    public static final <T> T b(kotlinx.serialization.json.b bVar, String discriminator, kotlinx.serialization.json.d0 element, fe.c<? extends T> deserializer) {
        kotlin.jvm.internal.t.f(bVar, "<this>");
        kotlin.jvm.internal.t.f(discriminator, "discriminator");
        kotlin.jvm.internal.t.f(element, "element");
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        return (T) new s0(bVar, element, discriminator, deserializer.getDescriptor()).C(deserializer);
    }
}
