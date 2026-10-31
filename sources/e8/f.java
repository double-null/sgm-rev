package e8;

import f8.i;
import f8.j;
import java.util.Map;

/* JADX INFO: compiled from: DashUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static z7.g a(j jVar, String str, i iVar, int i10, Map<String, String> map) {
        return new z7.g.b().i(iVar.b(str)).h(iVar.f14711a).g(iVar.f14712b).f(b(jVar, iVar)).b(i10).e(map).a();
    }

    public static String b(j jVar, i iVar) {
        String strA = jVar.a();
        return strA != null ? strA : iVar.b(jVar.f14717c.get(0).f14661a).toString();
    }
}
