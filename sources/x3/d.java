package x3;

/* JADX INFO: compiled from: InstallationResponse.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: compiled from: InstallationResponse.java */
    public static abstract class a {
        public abstract d a();

        public abstract a b(f fVar);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* JADX INFO: compiled from: InstallationResponse.java */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new x3.a.b();
    }

    public abstract f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
