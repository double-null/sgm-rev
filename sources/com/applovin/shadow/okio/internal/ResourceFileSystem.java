package com.applovin.shadow.okio.internal;

import com.android.billingclient.gp.VRfCTjjLv;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.collections.y;
import kotlin.jvm.internal.t;
import rd.c0;
import rd.f0;
import wc.k;
import wc.m;
import wc.q;
import wc.w;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final k roots$delegate;
    private final FileSystem systemFileSystem;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    /* JADX INFO: loaded from: classes.dex */
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !c0.z(path.name(), ".class", true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final Path removeBase(Path path, Path base) {
            t.f(path, "<this>");
            t.f(base, "base");
            return getROOT().resolve(c0.J(f0.B0(path.toString(), base.toString()), '\\', '/', false, 4, null));
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem fileSystem, int i10, kotlin.jvm.internal.k kVar) {
        this(classLoader, z10, (i10 & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<q<FileSystem, Path>> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<q<FileSystem, Path>> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        t.e(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        t.e(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            t.c(url);
            q<FileSystem, Path> fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        t.e(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        t.e(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            t.c(url2);
            q<FileSystem, Path> jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return b0.c0(arrayList, arrayList2);
    }

    private final q<FileSystem, Path> toFileRoot(URL url) {
        if (t.a(url.getProtocol(), ShareInternalUtility.STAGING_PARAM)) {
            return w.a(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final q<FileSystem, Path> toJarRoot(URL url) {
        int iO0;
        String string = url.toString();
        t.e(string, "toString(...)");
        if (!c0.O(string, "jar:file:", false, 2, null) || (iO0 = f0.o0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String strSubstring = string.substring(4, iO0);
        t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return w.a(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, ResourceFileSystem$toJarRoot$zip$1.INSTANCE), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        t.f(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) {
        t.f(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        t.f(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        t.f(source, "source");
        t.f(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        t.f(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws FileNotFoundException {
        t.f(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (q<FileSystem, Path> qVar : getRoots()) {
            FileSystem fileSystemB = qVar.b();
            Path pathC = qVar.c();
            try {
                List<Path> list = fileSystemB.list(pathC.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(u.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it.next(), pathC));
                }
                y.z(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return b0.p0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        t.f(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<q<FileSystem, Path>> it = getRoots().iterator();
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            q<FileSystem, Path> next = it.next();
            FileSystem fileSystemB = next.b();
            Path pathC = next.c();
            List<Path> listListOrNull = fileSystemB.listOrNull(pathC.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(u.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it2.next(), pathC));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                y.z(linkedHashSet, arrayList);
                z10 = true;
            }
        }
        if (z10) {
            return b0.p0(linkedHashSet);
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        t.f(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (q<FileSystem, Path> qVar : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = qVar.b().metadataOrNull(qVar.c().resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) throws FileNotFoundException {
        t.f(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String relativePath = toRelativePath(file);
        for (q<FileSystem, Path> qVar : getRoots()) {
            try {
                return qVar.b().openReadOnly(qVar.c().resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        t.f(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        t.f(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws FileNotFoundException {
        Source source;
        t.f(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        Path path = ROOT;
        InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path, file, false, 2, (Object) null).relativeTo(path).toString());
        if (resourceAsStream != null && (source = Okio.source(resourceAsStream)) != null) {
            return source;
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        t.f(source, "source");
        t.f(target, "target");
        throw new IOException(this + VRfCTjjLv.lqvXVz);
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem systemFileSystem) {
        t.f(classLoader, "classLoader");
        t.f(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots$delegate = m.a(new ResourceFileSystem$roots$2(this));
        if (z10) {
            getRoots().size();
        }
    }
}
