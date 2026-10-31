package com.facebook.appevents.cloudbridge;

import com.facebook.internal.Utility;
import id.p;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* JADX INFO: loaded from: classes.dex */
final class AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 extends u implements p<String, Integer, g0> {
    final /* synthetic */ List<Map<String, Object>> $processedEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(List<? extends Map<String, ? extends Object>> list) {
        super(2);
        this.$processedEvents = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Integer num, List processedEvents) {
        t.f(processedEvents, "$processedEvents");
        if (b0.G(AppEventsConversionsAPITransformerWebRequests.ACCEPTABLE_HTTP_RESPONSE, num)) {
            return;
        }
        AppEventsConversionsAPITransformerWebRequests.INSTANCE.handleError$facebook_core_release(num, processedEvents, 5);
    }

    @Override // id.p
    public /* bridge */ /* synthetic */ g0 invoke(String str, Integer num) {
        invoke2(str, num);
        return g0.f27756a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, final Integer num) {
        final List<Map<String, Object>> list = this.$processedEvents;
        Utility.runOnNonUiThread(new Runnable() { // from class: com.facebook.appevents.cloudbridge.c
            @Override // java.lang.Runnable
            public final void run() {
                AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1.invoke$lambda$0(num, list);
            }
        });
    }
}
