package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DeviceLoginManager;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: DeviceLoginButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceLoginButton extends LoginButton {
    private Uri deviceRedirectUri;

    /* JADX INFO: compiled from: DeviceLoginButton.kt */
    private final class DeviceLoginClickListener extends LoginButton.LoginClickListener {
        public DeviceLoginClickListener() {
            super();
        }

        @Override // com.facebook.login.widget.LoginButton.LoginClickListener
        protected LoginManager getLoginManager() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                DeviceLoginManager companion = DeviceLoginManager.Companion.getInstance();
                companion.setDefaultAudience(DeviceLoginButton.this.getDefaultAudience());
                companion.setLoginBehavior(LoginBehavior.DEVICE_AUTH);
                companion.setDeviceRedirectUri(DeviceLoginButton.this.getDeviceRedirectUri());
                return companion;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context, AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        t.f(context, "context");
        t.f(attrs, "attrs");
    }

    public final Uri getDeviceRedirectUri() {
        return this.deviceRedirectUri;
    }

    @Override // com.facebook.login.widget.LoginButton
    protected LoginButton.LoginClickListener getNewLoginClickListener() {
        return new DeviceLoginClickListener();
    }

    public final void setDeviceRedirectUri(Uri uri) {
        this.deviceRedirectUri = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        t.f(context, "context");
        t.f(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context) {
        super(context);
        t.f(context, "context");
    }
}
