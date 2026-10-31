package rd;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: CharJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b {
    public static int a(int i10) {
        boolean z10 = false;
        if (2 <= i10 && i10 < 37) {
            z10 = true;
        }
        if (z10) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new od.h(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static final boolean c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
