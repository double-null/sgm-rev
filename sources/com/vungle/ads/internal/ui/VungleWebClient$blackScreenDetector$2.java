package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.util.BlackScreenDetector;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: VungleWebClient.kt */
/* JADX INFO: loaded from: classes4.dex */
final class VungleWebClient$blackScreenDetector$2 extends u implements id.a<BlackScreenDetector> {
    public static final VungleWebClient$blackScreenDetector$2 INSTANCE = new VungleWebClient$blackScreenDetector$2();

    VungleWebClient$blackScreenDetector$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final BlackScreenDetector invoke() {
        return new BlackScreenDetector();
    }
}
