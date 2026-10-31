package c2;

import android.util.SparseArray;

/* JADX INFO: compiled from: ComplianceData.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: compiled from: ComplianceData.java */
    public static abstract class a {
        public abstract p a();

        public abstract a b(s sVar);

        public abstract a c(b bVar);
    }

    /* JADX INFO: compiled from: ComplianceData.java */
    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final SparseArray<b> f4651d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f4653a;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray<b> sparseArray = new SparseArray<>();
            f4651d = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i10) {
            this.f4653a = i10;
        }
    }

    public static a a() {
        return new f.b();
    }

    public abstract s b();

    public abstract b c();
}
