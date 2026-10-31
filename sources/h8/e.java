package h8;

import android.net.Uri;
import c8.b2;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import s9.r;
import u7.q;
import x7.g0;

/* JADX INFO: compiled from: HlsExtractorFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final e f15725a = new c();

    f e(Uri uri, q qVar, List<q> list, g0 g0Var, Map<String, List<String>> map, v8.q qVar2, b2 b2Var) throws IOException;

    default e a(r.a aVar) {
        return this;
    }

    default e b(int i10) {
        return this;
    }

    default e c(boolean z10) {
        return this;
    }

    default q d(q qVar) {
        return qVar;
    }
}
