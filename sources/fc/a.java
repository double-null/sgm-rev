package fc;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: BackgroundHandlerTaskManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends b {
    public a() {
        HandlerThread handlerThread = new HandlerThread("BackgroundHandlerTaskManager");
        handlerThread.start();
        super(new Handler(handlerThread.getLooper()));
    }
}
