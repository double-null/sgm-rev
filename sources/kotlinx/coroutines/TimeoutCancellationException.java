package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import ud.b2;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient b2 f21540a;

    public TimeoutCancellationException(String str, b2 b2Var) {
        super(str);
        this.f21540a = b2Var;
    }
}
