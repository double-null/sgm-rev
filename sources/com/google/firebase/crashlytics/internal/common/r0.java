package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: NativeSessionFileGzipper.java */
/* JADX INFO: loaded from: classes4.dex */
class r0 {
    private static void a(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        gZIPOutputStream2.finish();
                        h.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i10);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    h.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static void b(File file, List<q0> list) {
        for (q0 q0Var : list) {
            InputStream inputStreamJ = null;
            try {
                inputStreamJ = q0Var.j();
                if (inputStreamJ != null) {
                    a(inputStreamJ, new File(file, q0Var.l()));
                }
            } catch (IOException unused) {
            } finally {
                h.g(null);
            }
        }
    }
}
