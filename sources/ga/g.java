package ga;

import ga.g;

/* JADX INFO: compiled from: RequestParams.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g<SelfType extends g<SelfType>> {
    public static <T extends g<T>> T resolveParams(T t10, T t11) {
        if (t10 == null) {
            return t11;
        }
        if (t11 != null) {
            t10.merge(t11);
        }
        return t10;
    }

    public abstract void merge(SelfType selftype);
}
