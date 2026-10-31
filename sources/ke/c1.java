package ke;

/* JADX INFO: compiled from: ReaderJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c1 {
    public static final b1 a(kotlinx.serialization.json.b json, f0 reader, char[] buffer) {
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(reader, "reader");
        kotlin.jvm.internal.t.f(buffer, "buffer");
        return !json.e().a() ? new b1(reader, buffer) : new d1(reader, buffer);
    }

    public static /* synthetic */ b1 b(kotlinx.serialization.json.b bVar, f0 f0Var, char[] cArr, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cArr = p.f21399c.d();
        }
        return a(bVar, f0Var, cArr);
    }
}
