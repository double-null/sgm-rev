package com.applovin.shadow.okhttp3.internal.cache2;

import com.applovin.shadow.okio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: FileOperator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        t.f(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j10, Buffer sink, long j11) throws IOException {
        t.f(sink, "sink");
        if (j11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j10, j11, sink);
            j10 += jTransferTo;
            j11 -= jTransferTo;
        }
    }

    public final void write(long j10, Buffer source, long j11) throws IOException {
        t.f(source, "source");
        if (j11 < 0 || j11 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j10, j11);
            j10 += jTransferFrom;
            j11 -= jTransferFrom;
        }
    }
}
