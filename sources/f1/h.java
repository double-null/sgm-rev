package f1;

import android.content.Context;
import androidx.work.l;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: WorkDatabasePathHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14562a = l.f("WrkDbPathHelper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f14563b = {"-journal", "-shm", yhXxbqGRMeI.OWjCwahB};

    public static File a(Context context) {
        return c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        if (b(context).exists()) {
            l.c().a(f14562a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> mapF = f(context);
            for (File file : mapF.keySet()) {
                File file2 = mapF.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        l.c().h(f14562a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    l.c().a(f14562a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    public static Map<File, File> f(Context context) {
        HashMap map = new HashMap();
        File fileB = b(context);
        File fileA = a(context);
        map.put(fileB, fileA);
        for (String str : f14563b) {
            map.put(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
        }
        return map;
    }
}
