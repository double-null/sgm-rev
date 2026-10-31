package d2;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: TransportRuntimeComponent.java */
/* JADX INFO: loaded from: classes3.dex */
abstract class v implements Closeable {

    /* JADX INFO: compiled from: TransportRuntimeComponent.java */
    interface a {
        a a(Context context);

        v build();
    }

    v() {
    }

    abstract l2.d b();

    abstract u c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b().close();
    }
}
