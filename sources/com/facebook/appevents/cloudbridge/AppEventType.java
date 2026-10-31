package com.facebook.appevents.cloudbridge;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
/* JADX INFO: loaded from: classes.dex */
public enum AppEventType {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;

    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final AppEventType invoke(String rawValue) {
            t.f(rawValue, "rawValue");
            if (t.a(rawValue, "MOBILE_APP_INSTALL")) {
                return AppEventType.MOBILE_APP_INSTALL;
            }
            return t.a(rawValue, "CUSTOM_APP_EVENTS") ? AppEventType.CUSTOM : AppEventType.OTHER;
        }
    }
}
