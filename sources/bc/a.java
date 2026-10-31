package bc;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.f0;

/* JADX INFO: compiled from: DefaultLoggerInstance.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0087a f4443c = new C0087a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4445b;

    /* JADX INFO: renamed from: bc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultLoggerInstance.kt */
    public static final class C0087a {
        private C0087a() {
        }

        public /* synthetic */ C0087a(k kVar) {
            this();
        }
    }

    public a(String tag) {
        t.f(tag, "tag");
        this.f4444a = tag;
        this.f4445b = true;
    }

    private final String i(Throwable th) {
        StringWriter stringWriter = new StringWriter(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        t.e(string, "sw.toString()");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void n(a aVar, int i10, Object obj, id.a aVar2, Throwable th, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareAndLog");
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        if ((i11 & 8) != 0) {
            th = null;
        }
        aVar.m(i10, obj, aVar2, th);
    }

    @Override // bc.c
    public void b(Object obj, id.a<String> messageBuilder) {
        t.f(messageBuilder, "messageBuilder");
        n(this, 3, obj, messageBuilder, null, 8, null);
    }

    @Override // bc.c
    public void d(Object obj, id.a<String> messageBuilder) {
        t.f(messageBuilder, "messageBuilder");
        n(this, 6, obj, messageBuilder, null, 8, null);
    }

    @Override // bc.c
    public void g(Object obj, id.a<String> messageBuilder) {
        t.f(messageBuilder, "messageBuilder");
        n(this, 5, obj, messageBuilder, null, 8, null);
    }

    protected final String h(Object obj, id.a<String> aVar, Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        if (obj != null) {
            sb2.append('[' + obj + "] ");
        }
        if (aVar != null) {
            sb2.append(aVar.invoke());
        }
        if (th != null) {
            if (!f0.k0(sb2)) {
                sb2.append("\n");
            }
            sb2.append(i(th));
        }
        String string = sb2.toString();
        t.e(string, "sb.toString()");
        return string;
    }

    public void j(Object obj, Throwable throwable) {
        t.f(throwable, "throwable");
        n(this, 6, obj, null, throwable, 4, null);
    }

    public boolean k(int i10) {
        return this.f4445b;
    }

    protected final void l(int i10, String message) {
        t.f(message, "message");
        if (message.length() <= 1000) {
            o(i10, this.f4444a, message);
            return;
        }
        int length = ((message.length() + 1000) - 1) / 1000;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str = this.f4444a;
            int i13 = i12 + 1000;
            String strSubstring = message.substring(i12, Math.min(message.length(), i13));
            t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            o(i10, str, strSubstring);
            i11++;
            i12 = i13;
        }
    }

    protected final void m(int i10, Object obj, id.a<String> aVar, Throwable th) {
        if (k(i10)) {
            l(i10, h(obj, aVar, th));
        }
    }

    protected final void o(int i10, String tag, String message) {
        t.f(tag, "tag");
        t.f(message, "message");
        Log.println(i10, tag, message);
    }

    public final void p(boolean z10) {
        this.f4445b = z10;
    }
}
