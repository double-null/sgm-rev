package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import java.util.Arrays;
import java.util.List;
import x2.g;
import x2.m;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-cls-ndk";

    /* JADX INFO: Access modifiers changed from: private */
    public CrashlyticsNativeComponent buildCrashlyticsNdk(x2.d dVar) {
        Context context = (Context) dVar.a(Context.class);
        return FirebaseCrashlyticsNdk.create(context, !z2.e.g(context));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x2.c<?>> getComponents() {
        return Arrays.asList(x2.c.c(CrashlyticsNativeComponent.class).g(LIBRARY_NAME).b(m.i(Context.class)).e(new g() { // from class: com.google.firebase.crashlytics.ndk.a
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return this.f12235a.buildCrashlyticsNdk(dVar);
            }
        }).d().c(), com.google.firebase.platforminfo.g.b(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
