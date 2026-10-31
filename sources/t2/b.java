package t2;

import com.google.common.base.p;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: Files.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r2.a<File> f25471a = new a();

    /* JADX INFO: compiled from: Files.java */
    class a implements r2.a<File> {
        a() {
        }
    }

    public static void a(File file) throws IOException {
        p.l(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }
}
