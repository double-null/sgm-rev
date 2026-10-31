package fd;

import java.io.File;
import kotlin.jvm.internal.t;
import rd.f0;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes5.dex */
class g {
    private static final int a(String str) {
        int iH0;
        int iH1 = f0.h0(str, File.separatorChar, 0, false, 4, null);
        if (iH1 != 0) {
            if (iH1 > 0 && str.charAt(iH1 - 1) == ':') {
                return iH1 + 1;
            }
            if (iH1 == -1 && f0.Z(str, ':', false, 2, null)) {
                return str.length();
            }
            return 0;
        }
        if (str.length() > 1) {
            char cCharAt = str.charAt(1);
            char c10 = File.separatorChar;
            if (cCharAt == c10 && (iH0 = f0.h0(str, c10, 2, false, 4, null)) >= 0) {
                int iH2 = f0.h0(str, File.separatorChar, iH0 + 1, false, 4, null);
                return iH2 >= 0 ? iH2 + 1 : str.length();
            }
        }
        return 1;
    }

    public static final boolean b(File file) {
        t.f(file, "<this>");
        String path = file.getPath();
        t.e(path, "getPath(...)");
        return a(path) > 0;
    }
}
