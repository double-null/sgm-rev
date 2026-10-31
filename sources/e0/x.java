package e0;

import java.io.File;

/* JADX INFO: compiled from: InterProcessCoordinator.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final v a(File file) {
        kotlin.jvm.internal.t.f(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.t.e(absolutePath, "file.canonicalFile.absolutePath");
        return w.a(absolutePath);
    }
}
