package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.t;
import ud.k0;
import ud.t1;
import x2.m;
import x2.o;

/* JADX INFO: compiled from: Firebase.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x2.c<?>> getComponents() {
        x2.c cVarC = x2.c.e(o.a(w2.a.class, k0.class)).b(m.j(o.a(w2.a.class, Executor.class))).e(new x2.g() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // x2.g
            public final k0 create(x2.d dVar) {
                Object objF = dVar.f(o.a(w2.a.class, Executor.class));
                t.e(objF, "get(...)");
                return t1.a((Executor) objF);
            }
        }).c();
        t.e(cVarC, "build(...)");
        x2.c cVarC2 = x2.c.e(o.a(w2.c.class, k0.class)).b(m.j(o.a(w2.c.class, Executor.class))).e(new x2.g() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // x2.g
            public final k0 create(x2.d dVar) {
                Object objF = dVar.f(o.a(w2.c.class, Executor.class));
                t.e(objF, "get(...)");
                return t1.a((Executor) objF);
            }
        }).c();
        t.e(cVarC2, "build(...)");
        x2.c cVarC3 = x2.c.e(o.a(w2.b.class, k0.class)).b(m.j(o.a(w2.b.class, Executor.class))).e(new x2.g() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // x2.g
            public final k0 create(x2.d dVar) {
                Object objF = dVar.f(o.a(w2.b.class, Executor.class));
                t.e(objF, "get(...)");
                return t1.a((Executor) objF);
            }
        }).c();
        t.e(cVarC3, "build(...)");
        x2.c cVarC4 = x2.c.e(o.a(w2.d.class, k0.class)).b(m.j(o.a(w2.d.class, Executor.class))).e(new x2.g() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // x2.g
            public final k0 create(x2.d dVar) {
                Object objF = dVar.f(o.a(w2.d.class, Executor.class));
                t.e(objF, "get(...)");
                return t1.a((Executor) objF);
            }
        }).c();
        t.e(cVarC4, "build(...)");
        return kotlin.collections.t.n(cVarC, cVarC2, cVarC3, cVarC4);
    }
}
