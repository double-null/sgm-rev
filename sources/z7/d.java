package z7;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes4.dex */
public interface d extends u7.h {

    /* JADX INFO: compiled from: DataSource.java */
    public interface a {
        d a();
    }

    void a(o oVar);

    default Map<String, List<String>> c() {
        return Collections.emptyMap();
    }

    void close() throws IOException;

    long i(g gVar) throws IOException;

    Uri m();
}
