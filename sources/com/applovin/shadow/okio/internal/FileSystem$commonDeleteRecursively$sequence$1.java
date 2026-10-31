package com.applovin.shadow.okio.internal;

import ad.d;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Path;
import id.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import qd.i;
import wc.g0;
import wc.s;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes.dex */
@f(c = "com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend")
final class FileSystem$commonDeleteRecursively$sequence$1 extends k implements p<i<? super Path>, zc.f<? super g0>, Object> {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, zc.f<? super FileSystem$commonDeleteRecursively$sequence$1> fVar) {
        super(2, fVar);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, fVar);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = d.f();
        int i10 = this.label;
        if (i10 == 0) {
            s.b(obj);
            i iVar = (i) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            kotlin.collections.i iVar2 = new kotlin.collections.i();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (FileSystem.collectRecursively(iVar, fileSystem, iVar2, path, false, true, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return g0.f27756a;
    }

    @Override // id.p
    public final Object invoke(i<? super Path> iVar, zc.f<? super g0> fVar) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(iVar, fVar)).invokeSuspend(g0.f27756a);
    }
}
