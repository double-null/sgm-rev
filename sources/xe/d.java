package xe;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f28583a = new d();

    private d() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        t.f(record, "record");
        c cVar = c.f28580a;
        String loggerName = record.getLoggerName();
        t.e(loggerName, "record.loggerName");
        int iB = e.b(record);
        String message = record.getMessage();
        t.e(message, "record.message");
        cVar.a(loggerName, iB, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
