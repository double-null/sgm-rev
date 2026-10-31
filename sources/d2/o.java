package d2;

/* JADX INFO: compiled from: SendRequest.java */
/* JADX INFO: loaded from: classes3.dex */
abstract class o {

    /* JADX INFO: compiled from: SendRequest.java */
    public static abstract class a {
        public abstract o a();

        abstract a b(b2.b bVar);

        abstract a c(b2.c<?> cVar);

        abstract a d(b2.g<?, byte[]> gVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    o() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract b2.b b();

    abstract b2.c<?> c();

    public byte[] d() {
        return e().apply(c().c());
    }

    abstract b2.g<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
