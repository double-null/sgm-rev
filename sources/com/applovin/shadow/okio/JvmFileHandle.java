package com.applovin.shadow.okio;

import java.io.RandomAccessFile;

/* JADX INFO: compiled from: JvmFileHandle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class JvmFileHandle extends FileHandle {
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        kotlin.jvm.internal.t.f(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized int protectedRead(long j10, byte[] array, int i10, int i11) {
        kotlin.jvm.internal.t.f(array, "array");
        this.randomAccessFile.seek(j10);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.randomAccessFile.read(array, i10, i11 - i12);
            if (i13 == -1) {
                if (i12 != 0) {
                    break;
                }
                return -1;
            }
            i12 += i13;
        }
        return i12;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized void protectedResize(long j10) {
        long size = size();
        long j11 = j10 - size;
        if (j11 > 0) {
            int i10 = (int) j11;
            protectedWrite(size, new byte[i10], 0, i10);
        } else {
            this.randomAccessFile.setLength(j10);
        }
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized void protectedWrite(long j10, byte[] array, int i10, int i11) {
        kotlin.jvm.internal.t.f(array, "array");
        this.randomAccessFile.seek(j10);
        this.randomAccessFile.write(array, i10, i11);
    }
}
