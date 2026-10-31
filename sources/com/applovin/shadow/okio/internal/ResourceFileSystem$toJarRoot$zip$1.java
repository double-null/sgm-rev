package com.applovin.shadow.okio.internal;

import id.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes.dex */
final class ResourceFileSystem$toJarRoot$zip$1 extends u implements l<ZipEntry, Boolean> {
    public static final ResourceFileSystem$toJarRoot$zip$1 INSTANCE = new ResourceFileSystem$toJarRoot$zip$1();

    ResourceFileSystem$toJarRoot$zip$1() {
        super(1);
    }

    @Override // id.l
    public final Boolean invoke(ZipEntry entry) {
        t.f(entry, "entry");
        return Boolean.valueOf(ResourceFileSystem.Companion.keepPath(entry.getCanonicalPath()));
    }
}
