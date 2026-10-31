package androidx.work;

/* JADX INFO: compiled from: InputMergerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: compiled from: InputMergerFactory.java */
    class a extends k {
        a() {
        }

        @Override // androidx.work.k
        public j a(String str) {
            return null;
        }
    }

    public static k c() {
        return new a();
    }

    public abstract j a(String str);

    public final j b(String str) {
        j jVarA = a(str);
        return jVarA == null ? j.a(str) : jVarA;
    }
}
