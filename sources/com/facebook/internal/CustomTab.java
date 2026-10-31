package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.CustomTabPrefetchHelper;
import java.util.ArrayList;

/* JADX INFO: compiled from: CustomTab.kt */
/* JADX INFO: loaded from: classes.dex */
public class CustomTab {
    public static final Companion Companion = new Companion(null);
    private Uri uri;

    /* JADX INFO: compiled from: CustomTab.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public Uri getURIForAction(String action, Bundle bundle) {
            kotlin.jvm.internal.t.f(action, "action");
            return Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + action, bundle);
        }
    }

    public CustomTab(String action, Bundle bundle) {
        kotlin.jvm.internal.t.f(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        GamingAction[] gamingActionArrValues = GamingAction.values();
        ArrayList arrayList = new ArrayList(gamingActionArrValues.length);
        for (GamingAction gamingAction : gamingActionArrValues) {
            arrayList.add(gamingAction.getRawValue());
        }
        this.uri = arrayList.contains(action) ? Utility.buildUri(ServerProtocol.getGamingDialogAuthority(), "/dialog/" + action, bundle) : Companion.getURIForAction(action, bundle);
    }

    public static Uri getURIForAction(String str, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(CustomTab.class)) {
            return null;
        }
        try {
            return Companion.getURIForAction(str, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CustomTab.class);
            return null;
        }
    }

    protected final Uri getUri() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.uri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean openCustomTab(Activity activity, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.t.f(activity, "activity");
            androidx.browser.customtabs.d dVarA = new androidx.browser.customtabs.d.C0023d(CustomTabPrefetchHelper.Companion.getPreparedSessionOnce()).a();
            dVarA.f1558a.setPackage(str);
            try {
                dVarA.a(activity, this.uri);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    protected final void setUri(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(uri, "<set-?>");
            this.uri = uri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
