package com.applovin.shadow.okio;

import com.applovin.shadow.okio.internal.ResourceFileSystem;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX INFO: compiled from: FileSystem.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            kotlin.jvm.internal.t.f(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }
    }

    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m151write$default(FileSystem fileSystem, Path file, boolean z10, id.l writerAction, int i10, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        kotlin.jvm.internal.t.f(file, "file");
        kotlin.jvm.internal.t.f(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(file, z10));
        Throwable th = null;
        try {
            objInvoke = writerAction.invoke(bufferedSinkBuffer);
            kotlin.jvm.internal.r.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.r.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.r.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    wc.f.a(th3, th4);
                }
            }
            kotlin.jvm.internal.r.a(1);
            objInvoke = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.t.c(objInvoke);
        return objInvoke;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.t.e(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        kotlin.jvm.internal.t.e(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.appendingSink(path, z10);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectories(path, z10);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectory(path, z10);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.delete(path, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.deleteRecursively(path, z10);
    }

    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public static /* synthetic */ qd.g listRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.listRecursively(path, z10);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z10, boolean z11, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return fileSystem.openReadWrite(path, z10, z11);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.sink(path, z10);
    }

    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m152read(Path file, id.l<? super BufferedSource, ? extends T> readerAction) throws Throwable {
        T tInvoke;
        kotlin.jvm.internal.t.f(file, "file");
        kotlin.jvm.internal.t.f(readerAction, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
        Throwable th = null;
        try {
            tInvoke = readerAction.invoke(bufferedSourceBuffer);
            kotlin.jvm.internal.r.b(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.r.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.r.b(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th4) {
                    wc.f.a(th3, th4);
                }
            }
            kotlin.jvm.internal.r.a(1);
            th = th3;
            tInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.t.c(tInvoke);
        return tInvoke;
    }

    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m153write(Path file, boolean z10, id.l<? super BufferedSink, ? extends T> writerAction) throws Throwable {
        T tInvoke;
        kotlin.jvm.internal.t.f(file, "file");
        kotlin.jvm.internal.t.f(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, z10));
        Throwable th = null;
        try {
            tInvoke = writerAction.invoke(bufferedSinkBuffer);
            kotlin.jvm.internal.r.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.r.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.r.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    wc.f.a(th3, th4);
                }
            }
            kotlin.jvm.internal.r.a(1);
            th = th3;
            tInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.t.c(tInvoke);
        return tInvoke;
    }

    public final Sink appendingSink(Path file) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        return appendingSink(file, false);
    }

    public abstract Sink appendingSink(Path path, boolean z10) throws IOException;

    public abstract void atomicMove(Path path, Path path2) throws IOException;

    public abstract Path canonicalize(Path path) throws IOException;

    public void copy(Path source, Path target) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(target, "target");
        com.applovin.shadow.okio.internal.FileSystem.commonCopy(this, source, target);
    }

    public final void createDirectories(Path dir, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(dir, "dir");
        com.applovin.shadow.okio.internal.FileSystem.commonCreateDirectories(this, dir, z10);
    }

    public final void createDirectory(Path dir) throws IOException {
        kotlin.jvm.internal.t.f(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(Path path, boolean z10) throws IOException;

    public abstract void createSymlink(Path path, Path path2) throws IOException;

    public final void delete(Path path) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        delete(path, false);
    }

    public abstract void delete(Path path, boolean z10) throws IOException;

    public void deleteRecursively(Path fileOrDirectory, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(fileOrDirectory, "fileOrDirectory");
        com.applovin.shadow.okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, z10);
    }

    public final boolean exists(Path path) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonExists(this, path);
    }

    public abstract List<Path> list(Path path) throws IOException;

    public abstract List<Path> listOrNull(Path path);

    public qd.g<Path> listRecursively(Path dir, boolean z10) {
        kotlin.jvm.internal.t.f(dir, "dir");
        return com.applovin.shadow.okio.internal.FileSystem.commonListRecursively(this, dir, z10);
    }

    public final FileMetadata metadata(Path path) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonMetadata(this, path);
    }

    public abstract FileMetadata metadataOrNull(Path path) throws IOException;

    public abstract FileHandle openReadOnly(Path path) throws IOException;

    public final FileHandle openReadWrite(Path file) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        return openReadWrite(file, false, false);
    }

    public abstract FileHandle openReadWrite(Path path, boolean z10, boolean z11) throws IOException;

    public final Sink sink(Path file) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        return sink(file, false);
    }

    public abstract Sink sink(Path path, boolean z10) throws IOException;

    public abstract Source source(Path path) throws IOException;

    public final void createDirectories(Path dir) throws IOException {
        kotlin.jvm.internal.t.f(dir, "dir");
        createDirectories(dir, false);
    }

    public final void deleteRecursively(Path fileOrDirectory) throws IOException {
        kotlin.jvm.internal.t.f(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    public final qd.g<Path> listRecursively(Path dir) {
        kotlin.jvm.internal.t.f(dir, "dir");
        return listRecursively(dir, false);
    }
}
