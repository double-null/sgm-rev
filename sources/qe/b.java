package qe;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TaskLogger.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        }
        l0 l0Var = l0.f21527a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        t.e(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, d dVar, String str) {
        Logger loggerA = e.f24784h.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f());
        sb2.append(' ');
        l0 l0Var = l0.f21527a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        t.e(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(aVar.b());
        loggerA.fine(sb2.toString());
    }
}
