package k3;

/* JADX INFO: compiled from: MiddleOutStrategy.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21213a;

    public b(int i10) {
        this.f21213a = i10;
    }

    @Override // k3.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f21213a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }
}
