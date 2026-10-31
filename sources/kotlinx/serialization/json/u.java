package kotlinx.serialization.json;

import ke.a1;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes5.dex */
final class u extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g configuration, le.c module) {
        super(configuration, module, null);
        kotlin.jvm.internal.t.f(configuration, "configuration");
        kotlin.jvm.internal.t.f(module, "module");
        g();
    }

    private final void g() {
        if (kotlin.jvm.internal.t.a(a(), le.d.a())) {
            return;
        }
        a().a(new a1(e().p(), e().e()));
    }
}
