package zd;

/* JADX INFO: compiled from: SystemProps.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f29199a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f29199a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
