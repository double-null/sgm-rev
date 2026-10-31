package com.google.firebase.platforminfo;

import java.util.Iterator;
import java.util.Set;
import x2.m;

/* JADX INFO: compiled from: DefaultUserAgentPublisher.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GlobalLibraryVersionRegistrar f12285b;

    c(Set<e> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f12284a = d(set);
        this.f12285b = globalLibraryVersionRegistrar;
    }

    public static x2.c<h> b() {
        return x2.c.c(h.class).b(m.m(e.class)).e(new x2.g() { // from class: com.google.firebase.platforminfo.b
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return c.c(dVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h c(x2.d dVar) {
        return new c(dVar.b(e.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    private static String d(Set<e> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<e> it = set.iterator();
        while (it.hasNext()) {
            e next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // com.google.firebase.platforminfo.h
    public String getUserAgent() {
        if (this.f12285b.getRegisteredVersions().isEmpty()) {
            return this.f12284a;
        }
        return this.f12284a + ' ' + d(this.f12285b.getRegisteredVersions());
    }
}
