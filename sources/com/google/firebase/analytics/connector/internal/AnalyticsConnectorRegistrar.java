package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.g;
import java.util.Arrays;
import java.util.List;
import x2.m;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v2.a lambda$getComponents$0(x2.d dVar) {
        return v2.b.c((FirebaseApp) dVar.a(FirebaseApp.class), (Context) dVar.a(Context.class), (s3.d) dVar.a(s3.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x2.c<?>> getComponents() {
        return Arrays.asList(x2.c.c(v2.a.class).b(m.i(FirebaseApp.class)).b(m.i(Context.class)).b(m.i(s3.d.class)).e(a.f11898a).d().c(), g.b("fire-analytics", "23.2.0"));
    }
}
