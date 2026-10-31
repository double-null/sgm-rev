package wc;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class f {
    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.t.f(th, "<this>");
        kotlin.jvm.internal.t.f(exception, "exception");
        if (th != exception) {
            cd.b.f5529a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        kotlin.jvm.internal.t.f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.t.e(string, "toString(...)");
        return string;
    }
}
