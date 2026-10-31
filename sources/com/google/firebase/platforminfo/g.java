package com.google.firebase.platforminfo;

import android.content.Context;
import x2.m;

/* JADX INFO: compiled from: LibraryVersionComponent.java */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: compiled from: LibraryVersionComponent.java */
    public interface a<T> {
        String a(T t10);
    }

    public static x2.c<?> b(String str, String str2) {
        return x2.c.l(e.a(str, str2), e.class);
    }

    public static x2.c<?> c(final String str, final a<Context> aVar) {
        return x2.c.m(e.class).b(m.i(Context.class)).e(new x2.g() { // from class: com.google.firebase.platforminfo.f
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return g.d(str, aVar, dVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e d(String str, a aVar, x2.d dVar) {
        return e.a(str, aVar.a((Context) dVar.a(Context.class)));
    }
}
