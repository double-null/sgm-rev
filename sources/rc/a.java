package rc;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: compiled from: DefaultLoggerInstance.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24991a;

    public a(String str) {
        this.f24991a = str;
    }

    private static String o(Throwable th) {
        StringWriter stringWriter = new StringWriter(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    @Override // rc.c
    public void a(qc.b<String> bVar) {
        r(5, null, null, bVar, null);
    }

    @Override // rc.c
    public void b(String str) {
        r(3, null, str, null, null);
    }

    @Override // rc.c
    public void c(qc.b<String> bVar) {
        r(6, null, null, bVar, null);
    }

    @Override // rc.c
    public void d(qc.b<String> bVar) {
        r(3, null, null, bVar, null);
    }

    @Override // rc.c
    public void e(Object obj, String str) {
        r(3, obj, str, null, null);
    }

    @Override // rc.c
    public void f(Throwable th) {
        r(5, null, null, null, th);
    }

    @Override // rc.c
    public void g(String str) {
        r(5, null, str, null, null);
    }

    @Override // rc.c
    public void h(String str) {
        r(6, null, str, null, null);
    }

    @Override // rc.c
    public void i(Object obj, qc.b<String> bVar) {
        r(3, obj, null, bVar, null);
    }

    @Override // rc.c
    public void j(Object obj, Throwable th) {
        r(5, obj, null, null, th);
    }

    @Override // rc.c
    public void k(Object obj, qc.b<String> bVar) {
        r(6, obj, null, bVar, null);
    }

    @Override // rc.c
    public void l(Object obj, String str) {
        r(5, obj, str, null, null);
    }

    @Override // rc.c
    public void m(Object obj, qc.b<String> bVar) {
        r(5, obj, null, bVar, null);
    }

    protected String n(Object obj, String str, qc.b<String> bVar, Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        if (obj != null) {
            sb2.append("[");
            sb2.append(obj);
            sb2.append("] ");
        }
        if (str != null) {
            sb2.append(str);
        } else if (bVar != null) {
            sb2.append(bVar.get());
        }
        if (th != null) {
            if (sb2.length() != 0) {
                sb2.append("\n");
            }
            sb2.append(o(th));
        }
        return sb2.toString();
    }

    protected boolean p(int i10) {
        return true;
    }

    protected void q(int i10, String str) {
        if (str.length() <= 1000) {
            s(i10, this.f24991a, str);
            return;
        }
        int length = ((str.length() + 1000) - 1) / 1000;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + 1000;
            s(i10, this.f24991a, str.substring(i12, Math.min(str.length(), i13)));
            i11++;
            i12 = i13;
        }
    }

    protected void r(int i10, Object obj, String str, qc.b<String> bVar, Throwable th) {
        if (p(i10)) {
            q(i10, n(obj, str, bVar, th));
        }
    }

    protected void s(int i10, String str, String str2) {
        Log.println(i10, str, str2);
    }
}
