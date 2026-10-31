package com.google.firebase.datatransport;

import android.content.Context;
import b2.i;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import d2.u;
import java.util.Arrays;
import java.util.List;
import m3.b;
import x2.c;
import x2.d;
import x2.g;
import x2.m;
import x2.o;

/* JADX INFO: loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.f11199h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$1(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.f11199h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$2(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.f11198g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(i.class).g(LIBRARY_NAME).b(m.i(Context.class)).e(new g() { // from class: m3.c
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return TransportRegistrar.lambda$getComponents$0(dVar);
            }
        }).c(), c.e(o.a(m3.a.class, i.class)).b(m.i(Context.class)).e(new g() { // from class: m3.d
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return TransportRegistrar.lambda$getComponents$1(dVar);
            }
        }).c(), c.e(o.a(b.class, i.class)).b(m.i(Context.class)).e(new g() { // from class: m3.e
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return TransportRegistrar.lambda$getComponents$2(dVar);
            }
        }).c(), com.google.firebase.platforminfo.g.b(LIBRARY_NAME, "19.0.0"));
    }
}
