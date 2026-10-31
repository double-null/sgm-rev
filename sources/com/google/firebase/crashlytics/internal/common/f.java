package com.google.firebase.crashlytics.internal.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: BytesBackedNativeSessionFile.java */
/* JADX INFO: loaded from: classes4.dex */
class f implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f12125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12127c;

    f(String str, String str2, byte[] bArr) {
        this.f12126b = str;
        this.f12127c = str2;
        this.f12125a = bArr;
    }

    private byte[] a() {
        if (b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f12125a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean b() {
        byte[] bArr = this.f12125a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    public InputStream j() {
        if (b()) {
            return null;
        }
        return new ByteArrayInputStream(this.f12125a);
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    public e3.h0.d.b k() {
        byte[] bArrA = a();
        if (bArrA == null) {
            return null;
        }
        return e3.h0.d.b.a().b(bArrA).c(this.f12126b).a();
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    public String l() {
        return this.f12127c;
    }
}
