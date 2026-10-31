package k3;

/* JADX INFO: compiled from: MiddleOutFallbackStrategy.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d[] f21211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f21212c;

    public a(int i10, d... dVarArr) {
        this.f21210a = i10;
        this.f21211b = dVarArr;
        this.f21212c = new b(i10);
    }

    @Override // k3.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f21210a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f21211b) {
            if (stackTraceElementArrA.length <= this.f21210a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f21210a ? this.f21212c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
