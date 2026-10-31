package l2;

/* JADX INFO: compiled from: EventStoreModule_DbNameFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements f2.b<String> {

    /* JADX INFO: compiled from: EventStoreModule_DbNameFactory.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f21672a = new g();
    }

    public static g a() {
        return a.f21672a;
    }

    public static String b() {
        return (String) f2.d.d(f.a());
    }

    @Override // vc.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
