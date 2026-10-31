package y3;

/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f28645a;

    private b() {
    }

    public static b a() {
        if (f28645a == null) {
            f28645a = new b();
        }
        return f28645a;
    }

    @Override // y3.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
