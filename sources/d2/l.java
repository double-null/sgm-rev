package d2;

/* JADX INFO: compiled from: ForcedSender.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static void a(b2.h<?> hVar, b2.e eVar) {
        if (!(hVar instanceof s)) {
            h2.a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", hVar);
        } else {
            u.c().e().u(((s) hVar).d().f(eVar), 1);
        }
    }
}
