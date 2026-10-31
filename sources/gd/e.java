package gd;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public class e extends c {
    public static final List<Path> a(Path path, String glob) throws IOException {
        t.f(path, "<this>");
        t.f(glob, "glob");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            t.c(directoryStreamNewDirectoryStream);
            List<Path> listP0 = b0.p0(directoryStreamNewDirectoryStream);
            fd.b.a(directoryStreamNewDirectoryStream, null);
            return listP0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(directoryStreamNewDirectoryStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ List b(Path path, String str, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = "*";
        }
        return a(path, str);
    }
}
