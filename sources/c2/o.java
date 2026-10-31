package c2;

/* JADX INFO: compiled from: ClientInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: compiled from: ClientInfo.java */
    public static abstract class a {
        public abstract o a();

        public abstract a b(c2.a aVar);

        public abstract a c(b bVar);
    }

    /* JADX INFO: compiled from: ClientInfo.java */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f4648a;

        b(int i10) {
            this.f4648a = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract c2.a b();

    public abstract b c();
}
