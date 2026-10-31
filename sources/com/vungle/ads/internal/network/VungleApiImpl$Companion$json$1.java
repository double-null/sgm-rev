package com.vungle.ads.internal.network;

import id.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.e;
import wc.g0;

/* JADX INFO: compiled from: VungleApiImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
final class VungleApiImpl$Companion$json$1 extends u implements l<e, g0> {
    public static final VungleApiImpl$Companion$json$1 INSTANCE = new VungleApiImpl$Companion$json$1();

    VungleApiImpl$Companion$json$1() {
        super(1);
    }

    @Override // id.l
    public /* bridge */ /* synthetic */ g0 invoke(e eVar) {
        invoke2(eVar);
        return g0.f27756a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(e Json) {
        t.f(Json, "$this$Json");
        Json.f(true);
        Json.d(true);
        Json.e(false);
        Json.c(true);
    }
}
