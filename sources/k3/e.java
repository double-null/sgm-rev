package k3;

import java.util.Stack;

/* JADX INFO: compiled from: TrimmedThrowableData.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f21217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f21218d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f21215a = str;
        this.f21216b = str2;
        this.f21217c = stackTraceElementArr;
        this.f21218d = eVar;
    }

    public static e a(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
