package com.facebook.login;

import android.net.Uri;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Collection;

/* JADX INFO: compiled from: DeviceLoginManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceLoginManager extends LoginManager {
    public static final Companion Companion = new Companion(null);
    private static final wc.k<DeviceLoginManager> instance$delegate = wc.m.a(DeviceLoginManager$Companion$instance$2.INSTANCE);
    private String deviceAuthTargetUserId;
    private Uri deviceRedirectUri;

    /* JADX INFO: compiled from: DeviceLoginManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final DeviceLoginManager getInstance() {
            return (DeviceLoginManager) DeviceLoginManager.access$getInstance$delegate$cp().getValue();
        }
    }

    public static final /* synthetic */ wc.k access$getInstance$delegate$cp() {
        if (CrashShieldHandler.isObjectCrashing(DeviceLoginManager.class)) {
            return null;
        }
        try {
            return instance$delegate;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceLoginManager.class);
            return null;
        }
    }

    @Override // com.facebook.login.LoginManager
    protected LoginClient.Request createLoginRequest(Collection<String> collection) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            LoginClient.Request requestCreateLoginRequest = super.createLoginRequest(collection);
            Uri uri = this.deviceRedirectUri;
            if (uri != null) {
                requestCreateLoginRequest.setDeviceRedirectUriString(uri.toString());
            }
            String str = this.deviceAuthTargetUserId;
            if (str != null) {
                requestCreateLoginRequest.setDeviceAuthTargetUserId(str);
            }
            return requestCreateLoginRequest;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getDeviceAuthTargetUserId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.deviceAuthTargetUserId;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final Uri getDeviceRedirectUri() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.deviceRedirectUri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void setDeviceAuthTargetUserId(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.deviceAuthTargetUserId = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setDeviceRedirectUri(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.deviceRedirectUri = uri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
