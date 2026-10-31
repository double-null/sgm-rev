package com.applovin.shadow.okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: NioFileSystemFileHandle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NioFileSystemFileHandle extends FileHandle {
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z10, FileChannel fileChannel) {
        super(z10);
        kotlin.jvm.internal.t.f(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized void protectedClose() {
        this.fileChannel.close();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized void protectedFlush() {
        this.fileChannel.force(true);
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized int protectedRead(long j10, byte[] array, int i10, int i11) {
        kotlin.jvm.internal.t.f(array, "array");
        this.fileChannel.position(j10);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i10, i11);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.fileChannel.read(byteBufferWrap);
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
            this.fileChannel.truncate(j10);
        }
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized long protectedSize() {
        return this.fileChannel.size();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    protected synchronized void protectedWrite(long j10, byte[] array, int i10, int i11) {
        kotlin.jvm.internal.t.f(array, "array");
        this.fileChannel.position(j10);
        this.fileChannel.write(ByteBuffer.wrap(array, i10, i11));
    }
}
