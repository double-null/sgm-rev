package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import t3.i;
import x2.m;
import x2.o;
import y2.j;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseInstallationsApi lambda$getComponents$0(x2.d dVar) {
        return new c((FirebaseApp) dVar.a(FirebaseApp.class), dVar.d(i.class), (ExecutorService) dVar.f(o.a(w2.a.class, ExecutorService.class)), j.a((Executor) dVar.f(o.a(w2.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x2.c<?>> getComponents() {
        return Arrays.asList(x2.c.c(FirebaseInstallationsApi.class).g(LIBRARY_NAME).b(m.i(FirebaseApp.class)).b(m.h(i.class)).b(m.j(o.a(w2.a.class, ExecutorService.class))).b(m.j(o.a(w2.b.class, Executor.class))).e(new x2.g() { // from class: u3.e
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
            }
        }).c(), t3.h.a(), com.google.firebase.platforminfo.g.b(LIBRARY_NAME, "18.0.0"));
    }
}
