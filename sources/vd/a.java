package vd;

import android.os.Looper;
import java.util.List;
import ud.k2;
import zd.s;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements s {
    @Override // zd.s
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // zd.s
    public k2 b(List<? extends s> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new e(g.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // zd.s
    public int c() {
        return 1073741823;
    }
}
