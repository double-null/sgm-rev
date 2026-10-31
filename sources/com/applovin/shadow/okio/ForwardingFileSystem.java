package com.applovin.shadow.okio;

import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i0;

/* JADX INFO: compiled from: ForwardingFileSystem.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    /* JADX INFO: renamed from: com.applovin.shadow.okio.ForwardingFileSystem$listRecursively$1, reason: invalid class name */
    /* JADX INFO: compiled from: ForwardingFileSystem.kt */
    static final class AnonymousClass1 extends kotlin.jvm.internal.u implements id.l<Path, Path> {
        AnonymousClass1() {
            super(1);
        }

        @Override // id.l
        public final Path invoke(Path it) {
            kotlin.jvm.internal.t.f(it, "it");
            return ForwardingFileSystem.this.onPathResult(it, "listRecursively");
        }
    }

    public ForwardingFileSystem(FileSystem delegate) {
        kotlin.jvm.internal.t.f(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", ShareInternalUtility.STAGING_PARAM), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", ShareConstants.FEED_SOURCE_PARAM), onPathParameter(target, "atomicMove", "target"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", ShareConstants.FEED_SOURCE_PARAM), onPathParameter(target, "createSymlink", "target"));
    }

    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        kotlin.jvm.internal.t.f(dir, "dir");
        List<Path> list = this.delegate.list(onPathParameter(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        kotlin.collections.x.x(arrayList);
        return arrayList;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        kotlin.jvm.internal.t.f(dir, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        kotlin.collections.x.x(arrayList);
        return arrayList;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public qd.g<Path> listRecursively(Path dir, boolean z10) {
        kotlin.jvm.internal.t.f(dir, "dir");
        return qd.r.v(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), z10), new AnonymousClass1());
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        kotlin.jvm.internal.t.f(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : fileMetadataMetadataOrNull.copy((251 & 1) != 0 ? fileMetadataMetadataOrNull.isRegularFile : false, (251 & 2) != 0 ? fileMetadataMetadataOrNull.isDirectory : false, (251 & 4) != 0 ? fileMetadataMetadataOrNull.symlinkTarget : onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), (251 & 8) != 0 ? fileMetadataMetadataOrNull.size : null, (251 & 16) != 0 ? fileMetadataMetadataOrNull.createdAtMillis : null, (251 & 32) != 0 ? fileMetadataMetadataOrNull.lastModifiedAtMillis : null, (251 & 64) != 0 ? fileMetadataMetadataOrNull.lastAccessedAtMillis : null, (251 & 128) != 0 ? fileMetadataMetadataOrNull.extras : null);
    }

    public Path onPathParameter(Path path, String functionName, String parameterName) {
        kotlin.jvm.internal.t.f(path, "path");
        kotlin.jvm.internal.t.f(functionName, "functionName");
        kotlin.jvm.internal.t.f(parameterName, "parameterName");
        return path;
    }

    public Path onPathResult(Path path, String functionName) {
        kotlin.jvm.internal.t.f(path, "path");
        kotlin.jvm.internal.t.f(functionName, "functionName");
        return path;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", ShareInternalUtility.STAGING_PARAM));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", ShareInternalUtility.STAGING_PARAM), z10, z11);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", ShareInternalUtility.STAGING_PARAM), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws IOException {
        kotlin.jvm.internal.t.f(file, "file");
        return this.delegate.source(onPathParameter(file, ShareConstants.FEED_SOURCE_PARAM, ShareInternalUtility.STAGING_PARAM));
    }

    public String toString() {
        return i0.b(getClass()).g() + '(' + this.delegate + ')';
    }
}
