package androidx.room;

import java.io.File;

/* JADX INFO: compiled from: SQLiteCopyOpenHelperFactory.java */
/* JADX INFO: loaded from: classes.dex */
class k implements x0.c.InterfaceC0464c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f3560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x0.c.InterfaceC0464c f3561c;

    k(String str, File file, x0.c.InterfaceC0464c interfaceC0464c) {
        this.f3559a = str;
        this.f3560b = file;
        this.f3561c = interfaceC0464c;
    }

    @Override // x0.c.InterfaceC0464c
    public x0.c a(x0.c.b bVar) {
        return new j(bVar.f27937a, this.f3559a, this.f3560b, bVar.f27939c.f27936a, this.f3561c.a(bVar));
    }
}
