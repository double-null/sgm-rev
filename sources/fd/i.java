package fd;

import java.io.File;
import kotlin.jvm.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
public class i extends h {
    public static final d j(File file, e direction) {
        t.f(file, "<this>");
        t.f(direction, "direction");
        return new d(file, direction);
    }

    public static final d k(File file) {
        t.f(file, "<this>");
        return j(file, e.BOTTOM_UP);
    }

    public static d l(File file) {
        t.f(file, "<this>");
        return j(file, e.TOP_DOWN);
    }
}
