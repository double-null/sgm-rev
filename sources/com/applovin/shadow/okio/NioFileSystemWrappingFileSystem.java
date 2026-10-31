package com.applovin.shadow.okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i0;

/* JADX INFO: compiled from: NioFileSystemWrappingFileSystem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {
    private final java.nio.file.FileSystem nioFileSystem;

    public NioFileSystemWrappingFileSystem(java.nio.file.FileSystem nioFileSystem) {
        kotlin.jvm.internal.t.f(nioFileSystem, "nioFileSystem");
        this.nioFileSystem = nioFileSystem;
    }

    private final java.nio.file.Path resolve(Path path) {
        java.nio.file.Path path2 = this.nioFileSystem.getPath(path.toString(), new String[0]);
        kotlin.jvm.internal.t.e(path2, "getPath(...)");
        return path2;
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        List listC = kotlin.collections.s.c();
        listC.add(StandardOpenOption.APPEND);
        if (!z10) {
            listC.add(StandardOpenOption.CREATE);
        }
        List listA = kotlin.collections.s.a(listC);
        java.nio.file.Path pathResolve = resolve(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listA.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathResolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.t.e(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        return Okio.sink(outputStreamNewOutputStream);
    }

    @Override // com.applovin.shadow.okio.NioSystemFileSystem, com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(target, "target");
        try {
            kotlin.jvm.internal.t.e(Files.move(resolve(source), resolve(target), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), "move(this, target, *options)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        try {
            Path.Companion companion = Path.Companion;
            java.nio.file.Path realPath = resolve(path).toRealPath(new LinkOption[0]);
            kotlin.jvm.internal.t.e(realPath, "toRealPath(...)");
            return Path.Companion.get$default(companion, realPath, false, 1, (Object) null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        boolean z11;
        kotlin.jvm.internal.t.f(dir, "dir");
        FileMetadata fileMetadataMetadataOrNull = metadataOrNull(dir);
        if (fileMetadataMetadataOrNull != null) {
            z11 = fileMetadataMetadataOrNull.isDirectory();
        }
        if (z11 && z10) {
            throw new IOException(dir + " already exists.");
        }
        try {
            kotlin.jvm.internal.t.e(Files.createDirectory(resolve(dir), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createDirectory(this, *attributes)");
        } catch (IOException e10) {
            if (z11) {
                return;
            }
            throw new IOException("failed to create directory: " + dir, e10);
        }
    }

    @Override // com.applovin.shadow.okio.NioSystemFileSystem, com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(target, "target");
        kotlin.jvm.internal.t.e(Files.createSymbolicLink(resolve(source), resolve(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(this, target, *attributes)");
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        java.nio.file.Path pathResolve = resolve(path);
        try {
            Files.delete(pathResolve);
        } catch (NoSuchFileException unused) {
            if (z10) {
                throw new FileNotFoundException("no such file: " + path);
            }
        } catch (IOException unused2) {
            if (Files.exists(pathResolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to delete " + path);
            }
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        kotlin.jvm.internal.t.f(dir, "dir");
        List<Path> list = list(dir, true);
        kotlin.jvm.internal.t.c(list);
        return list;
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        kotlin.jvm.internal.t.f(dir, "dir");
        return list(dir, false);
    }

    @Override // com.applovin.shadow.okio.NioSystemFileSystem, com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        kotlin.jvm.internal.t.f(path, "path");
        return metadataOrNull(resolve(path));
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        try {
            FileChannel fileChannelOpen = FileChannel.open(resolve(file), StandardOpenOption.READ);
            kotlin.jvm.internal.t.c(fileChannelOpen);
            return new NioFileSystemFileHandle(false, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        if (!((z10 && z11) ? false : true)) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        List listC = kotlin.collections.s.c();
        listC.add(StandardOpenOption.READ);
        listC.add(StandardOpenOption.WRITE);
        if (z10) {
            listC.add(StandardOpenOption.CREATE_NEW);
        } else if (!z11) {
            listC.add(StandardOpenOption.CREATE);
        }
        List listA = kotlin.collections.s.a(listC);
        try {
            java.nio.file.Path pathResolve = resolve(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listA.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathResolve, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            kotlin.jvm.internal.t.c(fileChannelOpen);
            return new NioFileSystemFileHandle(true, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        List listC = kotlin.collections.s.c();
        if (z10) {
            listC.add(StandardOpenOption.CREATE_NEW);
        }
        List listA = kotlin.collections.s.a(listC);
        try {
            java.nio.file.Path pathResolve = resolve(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listA.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathResolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            kotlin.jvm.internal.t.e(outputStreamNewOutputStream, "newOutputStream(this, *options)");
            return Okio.sink(outputStreamNewOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(resolve(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            kotlin.jvm.internal.t.e(inputStreamNewInputStream, "newInputStream(this, *options)");
            return Okio.source(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // com.applovin.shadow.okio.NioSystemFileSystem, com.applovin.shadow.okio.JvmSystemFileSystem
    public String toString() {
        String strG = i0.b(this.nioFileSystem.getClass()).g();
        kotlin.jvm.internal.t.c(strG);
        return strG;
    }

    private final List<Path> list(Path path, boolean z10) throws IOException {
        java.nio.file.Path pathResolve = resolve(path);
        try {
            List listB = gd.e.b(pathResolve, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(Path.Companion.get$default(Path.Companion, (java.nio.file.Path) it.next(), false, 1, (Object) null));
            }
            kotlin.collections.x.x(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z10) {
                return null;
            }
            if (Files.exists(pathResolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to list " + path);
            }
            throw new FileNotFoundException("no such file: " + path);
        }
    }
}
