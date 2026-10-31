package com.vungle.ads.fpd;

import id.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.e;
import wc.g0;

/* JADX INFO: compiled from: FirstPartyData.kt */
/* JADX INFO: loaded from: classes4.dex */
final class FirstPartyData$Companion$JSON$1 extends u implements l<e, g0> {
    public static final FirstPartyData$Companion$JSON$1 INSTANCE = new FirstPartyData$Companion$JSON$1();

    FirstPartyData$Companion$JSON$1() {
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
        Json.g(true);
        Json.e(false);
        Json.d(false);
    }
}
