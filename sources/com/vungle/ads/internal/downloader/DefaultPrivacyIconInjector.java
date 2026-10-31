package com.vungle.ads.internal.downloader;

import android.util.Base64;
import com.vungle.ads.internal.Constants;
import fd.b;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: DefaultPrivacyIconInjector.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DefaultPrivacyIconInjector {
    public static final DefaultPrivacyIconInjector INSTANCE = new DefaultPrivacyIconInjector();

    private DefaultPrivacyIconInjector() {
    }

    private final boolean writePrivacyFileFromString(File file) {
        Object objC;
        try {
            r.a aVar = r.f27774b;
            byte[] bArrDecode = Base64.decode(Constants.LO_PRIVACY_ICON_STRING, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArrDecode);
                g0 g0Var = g0.f27756a;
                b.a(fileOutputStream, null);
                objC = r.c(Boolean.TRUE);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th3));
        }
        Boolean bool = Boolean.FALSE;
        if (r.k(objC)) {
            objC = bool;
        }
        return ((Boolean) objC).booleanValue();
    }

    public final File injectPrivacyIcon(File dir) {
        t.f(dir, "dir");
        File file = new File(dir, Constants.PRIVACY_ICON_FILE_NAME);
        if (file.exists() || writePrivacyFileFromString(file)) {
            return file;
        }
        return null;
    }
}
