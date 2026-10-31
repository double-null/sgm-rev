package d2;

import android.util.Base64;

/* JADX INFO: compiled from: TransportContext.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: compiled from: TransportContext.java */
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(b2.e eVar);
    }

    public static a a() {
        return new d.b().d(b2.e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract b2.e d();

    public boolean e() {
        return c() != null;
    }

    public p f(b2.e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
