package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.login.CustomTabLoginMethodHandler;

/* JADX INFO: compiled from: InstagramCustomTab.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InstagramCustomTab extends CustomTab {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: InstagramCustomTab.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final Uri getURIForAction(String action, Bundle bundle) {
            kotlin.jvm.internal.t.f(action, "action");
            if (kotlin.jvm.internal.t.a(action, CustomTabLoginMethodHandler.OAUTH_DIALOG)) {
                return Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), ServerProtocol.INSTAGRAM_OAUTH_PATH, bundle);
            }
            return Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + action, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramCustomTab(String action, Bundle bundle) {
        super(action, bundle);
        kotlin.jvm.internal.t.f(action, "action");
        setUri(Companion.getURIForAction(action, bundle == null ? new Bundle() : bundle));
    }
}
