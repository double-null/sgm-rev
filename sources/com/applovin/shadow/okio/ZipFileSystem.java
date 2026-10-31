package com.applovin.shadow.okio;

import com.applovin.shadow.okio.internal.FixedLengthSource;
import com.applovin.shadow.okio.internal.ZipEntry;
import com.applovin.shadow.okio.internal.ZipFilesKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: ZipFileSystem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ZipFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final String comment;
    private final Map<Path, ZipEntry> entries;
    private final FileSystem fileSystem;
    private final Path zipPath;

    /* JADX INFO: compiled from: ZipFileSystem.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final Path getROOT() {
            return ZipFileSystem.ROOT;
        }
    }

    public ZipFileSystem(Path zipPath, FileSystem fileSystem, Map<Path, ZipEntry> entries, String str) {
        kotlin.jvm.internal.t.f(zipPath, "zipPath");
        kotlin.jvm.internal.t.f(fileSystem, "fileSystem");
        kotlin.jvm.internal.t.f(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws FileNotFoundException {
        kotlin.jvm.internal.t.f(path, "path");
        Path pathCanonicalizeInternal = canonicalizeInternal(path);
        if (this.entries.containsKey(pathCanonicalizeInternal)) {
            return pathCanonicalizeInternal;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        kotlin.jvm.internal.t.f(dir, "dir");
        List<Path> list = list(dir, true);
        kotlin.jvm.internal.t.c(list);
        return list;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        kotlin.jvm.internal.t.f(dir, "dir");
        return list(dir, false);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws Throwable {
        FileMetadata localHeader;
        Throwable th;
        kotlin.jvm.internal.t.f(path, "path");
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        Throwable th2 = null;
        if (zipEntry == null) {
            return null;
        }
        FileMetadata fileMetadata = new FileMetadata(!zipEntry.isDirectory(), zipEntry.isDirectory(), null, zipEntry.isDirectory() ? null : Long.valueOf(zipEntry.getSize()), null, zipEntry.getLastModifiedAtMillis(), null, null, 128, null);
        if (zipEntry.getOffset() == -1) {
            return fileMetadata;
        }
        FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            try {
                localHeader = ZipFilesKt.readLocalHeader(bufferedSourceBuffer, fileMetadata);
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (Throwable th4) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th5) {
                        wc.f.a(th4, th5);
                    }
                }
                th = th4;
                localHeader = null;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.t.c(localHeader);
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th6) {
                    th2 = th6;
                }
            }
            if (th2 != null) {
                throw th2;
            }
            kotlin.jvm.internal.t.c(localHeader);
            return localHeader;
        } catch (Throwable th7) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th8) {
                    wc.f.a(th7, th8);
                }
            }
            localHeader = null;
            th2 = th7;
        }
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) {
        kotlin.jvm.internal.t.f(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws Throwable {
        BufferedSource bufferedSourceBuffer;
        kotlin.jvm.internal.t.f(file, "file");
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(file));
        if (zipEntry == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        Throwable th = null;
        try {
            bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th4) {
                    wc.f.a(th3, th4);
                }
            }
            bufferedSourceBuffer = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.t.c(bufferedSourceBuffer);
        ZipFilesKt.skipLocalHeader(bufferedSourceBuffer);
        return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSourceBuffer, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSourceBuffer, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
    }

    private final List<Path> list(Path path, boolean z10) throws IOException {
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        if (zipEntry != null) {
            return kotlin.collections.b0.p0(zipEntry.getChildren());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + path);
    }
}
