package rd;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c extends b {
    public static int d(char c10) {
        int iB = b.b(c10, 10);
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    public static final boolean e(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
