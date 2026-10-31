package com.google.firebase.crashlytics.internal.common;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: FileBackedNativeSessionFile.java */
/* JADX INFO: loaded from: classes4.dex */
class m0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f12177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12179c;

    m0(String str, String str2, File file) {
        this.f12178b = str;
        this.f12179c = str2;
        this.f12177a = file;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private byte[] a() {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamJ = j();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamJ == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamJ != null) {
                            inputStreamJ.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i10 = inputStreamJ.read(bArr);
                            if (i10 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamJ.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i10);
                        } catch (Throwable th) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    byteArrayOutputStream.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                if (inputStreamJ != null) {
                    try {
                        inputStreamJ.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
            if (inputStreamJ != null) {
                inputStreamJ.close();
            }
            throw th5;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    public InputStream j() {
        if (this.f12177a.exists() && this.f12177a.isFile()) {
            try {
                return new FileInputStream(this.f12177a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    public e3.h0.d.b k() {
        byte[] bArrA = a();
        if (bArrA != null) {
            return e3.h0.d.b.a().b(bArrA).c(this.f12178b).a();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    public String l() {
        return this.f12179c;
    }
}
