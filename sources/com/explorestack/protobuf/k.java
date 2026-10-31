package com.explorestack.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: ByteBufferWriter.java */
/* JADX INFO: loaded from: classes.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SoftReference<byte[]>> f10604a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f10605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f10606c;

    static {
        Class<?> clsE = e("java.io.FileOutputStream");
        f10605b = clsE;
        f10606c = b(clsE);
    }

    private static byte[] a() {
        SoftReference<byte[]> softReference = f10604a.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static long b(Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (z2.J()) {
                return z2.M(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static byte[] c(int i10) {
        int iMax = Math.max(i10, 1024);
        byte[] bArrA = a();
        if (bArrA == null || d(iMax, bArrA.length)) {
            bArrA = new byte[iMax];
            if (iMax <= 16384) {
                f(bArrA);
            }
        }
        return bArrA;
    }

    private static boolean d(int i10, int i11) {
        return i11 < i10 && ((float) i11) < ((float) i10) * 0.5f;
    }

    private static Class<?> e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void f(byte[] bArr) {
        f10604a.set(new SoftReference<>(bArr));
    }

    static void g(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!h(byteBuffer, outputStream)) {
                byte[] bArrC = c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrC.length);
                    byteBuffer.get(bArrC, 0, iMin);
                    outputStream.write(bArrC, 0, iMin);
                }
            }
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    private static boolean h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j10 = f10606c;
        if (j10 < 0 || !f10605b.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) z2.G(outputStream, j10);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
