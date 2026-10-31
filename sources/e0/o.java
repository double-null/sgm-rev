package e0;

import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: FileMoves.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final boolean a(File file, File toFile) {
        kotlin.jvm.internal.t.f(file, "<this>");
        kotlin.jvm.internal.t.f(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? d.f13566a.a(file, toFile) : file.renameTo(toFile);
    }
}
