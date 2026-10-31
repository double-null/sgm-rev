package rd;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (kotlin.jvm.internal.t.g(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
