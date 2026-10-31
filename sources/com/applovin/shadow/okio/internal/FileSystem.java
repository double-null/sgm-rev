package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.Source;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import com.vungle.ads.internal.protos.Sdk;
import id.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import qd.g;
import qd.i;
import wc.g0;
import wc.s;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FileSystem {

    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileSystem.kt */
    /* JADX INFO: loaded from: classes.dex */
    @f(c = "com.applovin.shadow.okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE, 145}, m = "collectRecursively")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(zc.f<? super AnonymousClass1> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileSystem.kt */
    /* JADX INFO: loaded from: classes.dex */
    @f(c = "com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
    static final class C05051 extends k implements p<i<? super Path>, zc.f<? super g0>, Object> {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ com.applovin.shadow.okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05051(Path path, com.applovin.shadow.okio.FileSystem fileSystem, boolean z10, zc.f<? super C05051> fVar) {
            super(2, fVar);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            C05051 c05051 = new C05051(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, fVar);
            c05051.L$0 = obj;
            return c05051;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            i iVar;
            kotlin.collections.i iVar2;
            Iterator<Path> it;
            Object objF = ad.d.f();
            int i10 = this.label;
            if (i10 == 0) {
                s.b(obj);
                i iVar3 = (i) this.L$0;
                kotlin.collections.i iVar4 = new kotlin.collections.i();
                iVar4.addLast(this.$dir);
                iVar = iVar3;
                iVar2 = iVar4;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                kotlin.collections.i iVar5 = (kotlin.collections.i) this.L$1;
                i iVar6 = (i) this.L$0;
                s.b(obj);
                iVar2 = iVar5;
                iVar = iVar6;
            }
            while (it.hasNext()) {
                Path next = it.next();
                com.applovin.shadow.okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z10 = this.$followSymlinks;
                this.L$0 = iVar;
                this.L$1 = iVar2;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(iVar, fileSystem, iVar2, next, z10, false, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }

        @Override // id.p
        public final Object invoke(i<? super Path> iVar, zc.f<? super g0> fVar) {
            return ((C05051) create(iVar, fVar)).invokeSuspend(g0.f27756a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f9 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:17:0x0059, B:48:0x00f3, B:50:0x00f9, B:54:0x0104), top: B:73:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code duplicated, block: B:66:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:48:0x00f3->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [qd.i] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, qd.i, qd.i<? super com.applovin.shadow.okio.Path>] */
    /* JADX WARN: Type inference failed for: r17v1, types: [qd.i] */
    public static final Object collectRecursively(i<? super Path> iVar, com.applovin.shadow.okio.FileSystem fileSystem, kotlin.collections.i<Path> iVar2, Path path, boolean z10, boolean z11, zc.f<? super g0> fVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        com.applovin.shadow.okio.FileSystem fileSystem2;
        kotlin.collections.i<Path> iVar3;
        boolean z12;
        ?? r12;
        boolean z13;
        com.applovin.shadow.okio.FileSystem fileSystem3;
        kotlin.collections.i<Path> iVar4;
        ?? r13;
        com.applovin.shadow.okio.FileSystem fileSystem4;
        Path path2;
        boolean z14;
        boolean z15;
        Iterator<Path> it;
        Path next;
        boolean z16;
        Path path3 = path;
        boolean z17 = z11;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = ad.d.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            s.b(obj);
            if (z17) {
                fileSystem2 = fileSystem;
                iVar3 = iVar2;
                z12 = z10;
            } else {
                anonymousClass1.L$0 = iVar;
                fileSystem2 = fileSystem;
                anonymousClass1.L$1 = fileSystem2;
                iVar3 = iVar2;
                anonymousClass1.L$2 = iVar3;
                anonymousClass1.L$3 = path3;
                z12 = z10;
                anonymousClass1.Z$0 = z12;
                anonymousClass1.Z$1 = z17;
                anonymousClass1.label = 1;
                if (iVar.a(path3, anonymousClass1) == objF) {
                    return objF;
                }
            }
            r12 = iVar;
            z13 = z12;
            fileSystem3 = fileSystem2;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    z15 = anonymousClass1.Z$1;
                    z14 = anonymousClass1.Z$0;
                    it = (Iterator) anonymousClass1.L$4;
                    path2 = (Path) anonymousClass1.L$3;
                    iVar4 = (kotlin.collections.i) anonymousClass1.L$2;
                    fileSystem4 = (com.applovin.shadow.okio.FileSystem) anonymousClass1.L$1;
                    i iVar5 = (i) anonymousClass1.L$0;
                    try {
                        s.b(obj);
                        r13 = iVar5;
                        while (it.hasNext()) {
                            next = it.next();
                            if (z15) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            anonymousClass1.L$0 = r13;
                            anonymousClass1.L$1 = fileSystem4;
                            anonymousClass1.L$2 = iVar4;
                            anonymousClass1.L$3 = path2;
                            anonymousClass1.L$4 = it;
                            anonymousClass1.Z$0 = z14;
                            anonymousClass1.Z$1 = z15;
                            anonymousClass1.label = 2;
                            if (collectRecursively(r13, fileSystem4, iVar4, next, z14, z16, anonymousClass1) == objF) {
                                return objF;
                            }
                        }
                        iVar4.removeLast();
                        z17 = z15;
                        path3 = path2;
                        r12 = r13;
                        if (z17) {
                            return g0.f27756a;
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.label = 3;
                        if (r12.a(path3, anonymousClass1) == objF) {
                            return objF;
                        }
                    } catch (Throwable th) {
                        th = th;
                        iVar4.removeLast();
                        throw th;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f27756a;
            }
            boolean z18 = anonymousClass1.Z$1;
            boolean z19 = anonymousClass1.Z$0;
            Path path4 = (Path) anonymousClass1.L$3;
            iVar3 = (kotlin.collections.i) anonymousClass1.L$2;
            fileSystem3 = (com.applovin.shadow.okio.FileSystem) anonymousClass1.L$1;
            i iVar6 = (i) anonymousClass1.L$0;
            s.b(obj);
            z17 = z18;
            z13 = z19;
            path3 = path4;
            r12 = iVar6;
        }
        List<Path> listListOrNull = fileSystem3.listOrNull(path3);
        if (listListOrNull == null) {
            listListOrNull = t.k();
        }
        if (!listListOrNull.isEmpty()) {
            Path path5 = path3;
            int i12 = 0;
            while (true) {
                if (z13 && iVar3.contains(path5)) {
                    throw new IOException("symlink cycle at " + path3);
                }
                Path pathSymlinkTarget = symlinkTarget(fileSystem3, path5);
                if (pathSymlinkTarget != null) {
                    i12++;
                    path5 = pathSymlinkTarget;
                } else if (z13 || i12 == 0) {
                    iVar3.addLast(path5);
                    try {
                        r13 = r12;
                        fileSystem4 = fileSystem3;
                        iVar4 = iVar3;
                        path2 = path3;
                        z14 = z13;
                        z15 = z17;
                        it = listListOrNull.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            if (z15) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            anonymousClass1.L$0 = r13;
                            anonymousClass1.L$1 = fileSystem4;
                            anonymousClass1.L$2 = iVar4;
                            anonymousClass1.L$3 = path2;
                            anonymousClass1.L$4 = it;
                            anonymousClass1.Z$0 = z14;
                            anonymousClass1.Z$1 = z15;
                            anonymousClass1.label = 2;
                            if (collectRecursively(r13, fileSystem4, iVar4, next, z14, z16, anonymousClass1) == objF) {
                                return objF;
                            }
                        }
                        iVar4.removeLast();
                        z17 = z15;
                        path3 = path2;
                        r12 = r13;
                    } catch (Throwable th2) {
                        th = th2;
                        iVar4 = iVar3;
                        iVar4.removeLast();
                        throw th;
                    }
                }
            }
        }
        if (z17) {
            return g0.f27756a;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.label = 3;
        if (r12.a(path3, anonymousClass1) == objF) {
            return objF;
        }
        return g0.f27756a;
    }

    public static final void commonCopy(com.applovin.shadow.okio.FileSystem fileSystem, Path source, Path target) throws IOException {
        Long lValueOf;
        Throwable th;
        Long lValueOf2;
        kotlin.jvm.internal.t.f(fileSystem, "<this>");
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(target, "target");
        Source source2 = fileSystem.source(source);
        Throwable th2 = null;
        try {
            BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(target));
            try {
                lValueOf2 = Long.valueOf(bufferedSinkBuffer.writeAll(source2));
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (Throwable th4) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th5) {
                        wc.f.a(th4, th5);
                    }
                }
                th = th4;
                lValueOf2 = null;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.t.c(lValueOf2);
            lValueOf = Long.valueOf(lValueOf2.longValue());
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th6) {
                    th2 = th6;
                }
            }
            if (th2 != null) {
                throw th2;
            }
            kotlin.jvm.internal.t.c(lValueOf);
        } catch (Throwable th7) {
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th8) {
                    wc.f.a(th7, th8);
                }
            }
            th2 = th7;
            lValueOf = null;
        }
    }

    public static final void commonDeleteRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path fileOrDirectory, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(fileSystem, "<this>");
        kotlin.jvm.internal.t.f(fileOrDirectory, "fileOrDirectory");
        Iterator it = qd.k.b(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean commonExists(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        kotlin.jvm.internal.t.f(fileSystem, "<this>");
        kotlin.jvm.internal.t.f(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final g<Path> commonListRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path dir, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(fileSystem, "<this>");
        kotlin.jvm.internal.t.f(dir, "dir");
        return qd.k.b(new C05051(dir, fileSystem, z10, null));
    }

    public static final FileMetadata commonMetadata(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        kotlin.jvm.internal.t.f(fileSystem, "<this>");
        kotlin.jvm.internal.t.f(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public static final Path symlinkTarget(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        kotlin.jvm.internal.t.f(fileSystem, "<this>");
        kotlin.jvm.internal.t.f(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        kotlin.jvm.internal.t.c(pathParent);
        return pathParent.resolve(symlinkTarget);
    }

    public static final void commonCreateDirectories(com.applovin.shadow.okio.FileSystem fileSystem, Path dir, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(fileSystem, "<this>");
        kotlin.jvm.internal.t.f(dir, "dir");
        kotlin.collections.i iVar = new kotlin.collections.i();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            iVar.addFirst(pathParent);
        }
        if (z10 && iVar.isEmpty()) {
            throw new IOException(dir + cTJaRZ.rNfTqEzwpO);
        }
        Iterator<E> it = iVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }
}
