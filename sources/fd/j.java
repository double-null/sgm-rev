package fd;

import java.io.File;
import kotlin.jvm.internal.t;
import rd.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public class j extends i {
    public static boolean m(File file) {
        t.f(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : i.k(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    public static String n(File file) {
        t.f(file, "<this>");
        String name = file.getName();
        t.e(name, "getName(...)");
        return f0.U0(name, '.', "");
    }

    public static String o(File file) {
        t.f(file, "<this>");
        String name = file.getName();
        t.e(name, "getName(...)");
        return f0.b1(name, ".", null, 2, null);
    }

    public static final File p(File file, File relative) {
        t.f(file, "<this>");
        t.f(relative, "relative");
        if (g.b(relative)) {
            return relative;
        }
        String string = file.toString();
        t.e(string, "toString(...)");
        if ((string.length() == 0) || f0.Z(string, File.separatorChar, false, 2, null)) {
            return new File(string + relative);
        }
        return new File(string + File.separatorChar + relative);
    }

    public static File q(File file, String relative) {
        t.f(file, "<this>");
        t.f(relative, "relative");
        return p(file, new File(relative));
    }
}
