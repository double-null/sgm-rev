package fc;

import android.os.Looper;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: UIHandlerTaskManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends b {
    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        Looper mainLooper = Looper.getMainLooper();
        t.e(mainLooper, "getMainLooper()");
        super(mainLooper);
    }
}
