package d0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: DataStoreFile.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final File a(Context context, String fileName) {
        t.f(context, "<this>");
        t.f(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
