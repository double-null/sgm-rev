package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Path;
import id.a;
import java.util.List;
import kotlin.jvm.internal.u;
import wc.q;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes.dex */
final class ResourceFileSystem$roots$2 extends u implements a<List<? extends q<? extends FileSystem, ? extends Path>>> {
    final /* synthetic */ ResourceFileSystem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResourceFileSystem$roots$2(ResourceFileSystem resourceFileSystem) {
        super(0);
        this.this$0 = resourceFileSystem;
    }

    @Override // id.a
    public final List<? extends q<? extends FileSystem, ? extends Path>> invoke() {
        ResourceFileSystem resourceFileSystem = this.this$0;
        return resourceFileSystem.toClasspathRoots(resourceFileSystem.classLoader);
    }
}
