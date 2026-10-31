package xe;

import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;
import me.x;
import rd.f0;
import rd.h0;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f28580a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet<Logger> f28581b = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f28582c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = x.class.getPackage();
        String name = r10 == null ? null : r10.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = x.class.getName();
        t.e(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = ue.d.class.getName();
        t.e(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = qe.e.class.getName();
        t.e(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f28582c = o0.s(linkedHashMap);
    }

    private c() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f28581b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.f28583a);
        }
    }

    private final String d(String str) {
        String str2 = f28582c.get(str);
        return str2 == null ? h0.j1(str, 23) : str2;
    }

    public final void a(String loggerName, int i10, String message, Throwable th) {
        int iMin;
        t.f(loggerName, "loggerName");
        t.f(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i10)) {
            if (th != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(th));
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int iH0 = f0.h0(message, '\n', i11, false, 4, null);
                if (iH0 == -1) {
                    iH0 = length;
                }
                while (true) {
                    iMin = Math.min(iH0, i11 + Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
                    String strSubstring = message.substring(i11, iMin);
                    t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iH0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f28582c.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}
