package com.vungle.ads.internal;

import id.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: AdInternal.kt */
/* JADX INFO: loaded from: classes4.dex */
final class AdInternal$Companion$json$1 extends u implements l<kotlinx.serialization.json.e, g0> {
    public static final AdInternal$Companion$json$1 INSTANCE = new AdInternal$Companion$json$1();

    AdInternal$Companion$json$1() {
        super(1);
    }

    @Override // id.l
    public /* bridge */ /* synthetic */ g0 invoke(kotlinx.serialization.json.e eVar) {
        invoke2(eVar);
        return g0.f27756a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(kotlinx.serialization.json.e Json) {
        t.f(Json, "$this$Json");
        Json.f(true);
        Json.d(true);
        Json.e(false);
    }
}
