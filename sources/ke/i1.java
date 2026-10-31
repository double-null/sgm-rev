package ke;

/* JADX INFO: compiled from: StringJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i1 {
    public static final h1 a(kotlinx.serialization.json.b json, String source) {
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(source, "source");
        return !json.e().a() ? new h1(source) : new j1(source);
    }
}
