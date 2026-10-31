package androidx.profileinstaller;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: BenchmarkOperation.java */
/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BenchmarkOperation.java */
    private static class C0061a {
        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = a(file2) && z10;
        }
        return z10;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        if (a(C0061a.a(context))) {
            aVar.a(14, null);
        } else {
            aVar.a(15, null);
        }
    }
}
