package kotlinx.serialization.json;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v {
    public static final b a(b from, id.l<? super e, wc.g0> builderAction) {
        kotlin.jvm.internal.t.f(from, "from");
        kotlin.jvm.internal.t.f(builderAction, "builderAction");
        e eVar = new e(from);
        builderAction.invoke(eVar);
        return new u(eVar.a(), eVar.b());
    }

    public static /* synthetic */ b b(b bVar, id.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = b.f21551d;
        }
        return a(bVar, lVar);
    }
}
