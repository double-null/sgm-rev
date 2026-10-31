package com.vungle.ads;

import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MraidTemplateError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MraidTemplateError(Sdk.SDKError.Reason loggableReason, String str) {
        super(loggableReason, str, null);
        t.f(loggableReason, "loggableReason");
        t.f(str, ljglrLUdGZhMhQ.PcR);
    }
}
