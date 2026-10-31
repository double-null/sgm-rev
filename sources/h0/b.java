package h0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PreferenceDataStoreFile.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final File a(Context context, String name) {
        t.f(context, "<this>");
        t.f(name, "name");
        return d0.a.a(context, name + ".preferences_pb");
    }
}
