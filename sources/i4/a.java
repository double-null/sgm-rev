package i4;

/* JADX INFO: compiled from: $Gson$Preconditions.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t10) {
        t10.getClass();
        return t10;
    }
}
