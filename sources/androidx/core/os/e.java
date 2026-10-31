package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: ConfigurationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: compiled from: ConfigurationCompat.java */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, h hVar) {
            configuration.setLocales((LocaleList) hVar.c());
        }
    }

    public static h a(Configuration configuration) {
        return h.d(a.a(configuration));
    }
}
