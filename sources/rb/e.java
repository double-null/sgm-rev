package rb;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes5.dex */
public class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f24990a = new Handler(Looper.getMainLooper());

    @Override // rb.c
    protected Handler c() {
        return f24990a;
    }
}
