package yb;

/* JADX INFO: compiled from: BaseTypeConversion.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T> implements h<T> {
    @Override // yb.h
    public T a(String str, T t10) {
        T tD;
        return (str == null || (tD = d(str)) == null) ? t10 : tD;
    }

    protected abstract T c(Object obj);

    protected abstract T d(String str);

    public T e(Object obj, T t10) {
        T tC;
        return (obj == null || (tC = c(obj)) == null) ? t10 : tC;
    }
}
