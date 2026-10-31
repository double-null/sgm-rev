package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AppLinkManager.kt */
/* JADX INFO: loaded from: classes.dex */
final class AppLinkManager$preferences$2 extends u implements id.a<SharedPreferences> {
    public static final AppLinkManager$preferences$2 INSTANCE = new AppLinkManager$preferences$2();

    AppLinkManager$preferences$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final SharedPreferences invoke() {
        return FacebookSdk.getApplicationContext().getSharedPreferences(AppLinkManager.APPLINK_INFO, 0);
    }
}
