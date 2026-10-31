package rd;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a0 extends z {
    public static Double m(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        try {
            if (q.f25074b.e(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float n(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        try {
            if (q.f25074b.e(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
