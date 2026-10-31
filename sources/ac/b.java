package ac;

import android.content.Context;
import android.net.Uri;
import fd.h;
import id.l;
import java.io.File;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: FileUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final File a(File file, String childPathname) {
        t.f(childPathname, "childPathname");
        return new File(file, childPathname);
    }

    public static final File b(File file, String url) {
        t.f(url, "url");
        String strC = a.c(url);
        if (strC != null) {
            return a(file, strC);
        }
        return null;
    }

    public static final File c(File file, String tempFilePrefix) {
        t.f(tempFilePrefix, "tempFilePrefix");
        return a(file, tempFilePrefix + System.nanoTime());
    }

    public static /* synthetic */ File d(File file, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "temp";
        }
        return c(file, str);
    }

    public static final void e(File file, l<? super File, Boolean> canDelete) {
        t.f(canDelete, "canDelete");
        if (file == null || !g(file)) {
            return;
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                t.e(fileArrListFiles, "listFiles()");
                for (File file2 : fileArrListFiles) {
                    if (file2 != null && canDelete.invoke(file2).booleanValue()) {
                        f(file2);
                    }
                }
                g0 g0Var = g0.f27756a;
            }
        } catch (Throwable unused) {
        }
    }

    public static final boolean f(File file) {
        Boolean boolValueOf;
        File[] fileArrListFiles;
        if (file == null || !g(file)) {
            return true;
        }
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                t.e(fileArrListFiles, "listFiles()");
                for (File file2 : fileArrListFiles) {
                    a.b(file2);
                }
            }
            boolValueOf = Boolean.valueOf(file.delete());
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return t.a(boolValueOf, Boolean.TRUE);
    }

    public static final boolean g(File file) {
        Boolean boolValueOf;
        t.f(file, "<this>");
        try {
            boolValueOf = Boolean.valueOf(file.exists());
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return t.a(boolValueOf, Boolean.TRUE);
    }

    public static final File h(Context context) {
        t.f(context, "<this>");
        if (a.a()) {
            return context.getExternalFilesDir(null);
        }
        return null;
    }

    public static final boolean i(File file) {
        return file != null && g(file) && file.length() > 0;
    }

    public static final String j(File file) {
        t.f(file, "<this>");
        try {
            return h.f(file, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Uri k(File file) {
        t.f(file, "<this>");
        Uri uriFromFile = Uri.fromFile(file);
        t.e(uriFromFile, "fromFile(this)");
        return uriFromFile;
    }

    public static final Uri l(File file) {
        if (file == null) {
            return null;
        }
        try {
            return k(file);
        } catch (Throwable unused) {
            return null;
        }
    }
}
