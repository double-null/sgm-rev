package com.applovin.shadow.okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: JvmSystemFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
public class JvmSystemFileSystem extends FileSystem {
    private final void requireCreate(Path path) throws IOException {
        if (exists(path)) {
            throw new IOException(path + " already exists.");
        }
    }

    private final void requireExist(Path path) throws IOException {
        if (exists(path)) {
            return;
        }
        throw new IOException(path + " doesn't exist.");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        if (z10) {
            requireExist(file);
        }
        return Okio.sink(file.toFile(), true);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        Path.Companion companion = Path.Companion;
        kotlin.jvm.internal.t.c(canonicalFile);
        return Path.Companion.get$default(companion, canonicalFile, false, 1, (Object) null);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        FileMetadata fileMetadataMetadataOrNull = metadataOrNull(dir);
        boolean z11 = false;
        if (fileMetadataMetadataOrNull != null && fileMetadataMetadataOrNull.isDirectory()) {
            z11 = true;
        }
        if (!z11) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z10) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(target, "target");
        throw new IOException("unsupported");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + path);
        }
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
    public FileMetadata metadataOrNull(Path path) {
        kotlin.jvm.internal.t.f(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) {
        kotlin.jvm.internal.t.f(file, "file");
        return new JvmFileHandle(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        if (!((z10 && z11) ? false : true)) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (z10) {
            requireCreate(file);
        }
        if (z11) {
            requireExist(file);
        }
        return new JvmFileHandle(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        if (z10) {
            requireCreate(file);
        }
        return Okio__JvmOkioKt.sink$default(file.toFile(), false, 1, null);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) {
        kotlin.jvm.internal.t.f(file, "file");
        return Okio.source(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    private final List<Path> list(Path path, boolean z10) throws IOException {
        File file = path.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                kotlin.jvm.internal.t.c(str);
                arrayList.add(path.resolve(str));
            }
            kotlin.collections.x.x(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + path);
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path path, Path target) throws IOException {
        kotlin.jvm.internal.t.f(path, TwDPD.tvzgnIiA);
        kotlin.jvm.internal.t.f(target, "target");
        if (path.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + path + " to " + target);
    }
}
