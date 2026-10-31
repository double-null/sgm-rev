package z7;

import java.io.IOException;

/* JADX INFO: compiled from: DataSourceUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static void a(d dVar) {
        if (dVar != null) {
            try {
                dVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
