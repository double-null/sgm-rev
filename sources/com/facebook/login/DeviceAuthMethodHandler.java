package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pb.vBC.NyXuoef;

/* JADX INFO: compiled from: DeviceAuthMethodHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {
    private static ScheduledThreadPoolExecutor backgroundExecutor;
    private final String nameForLogging;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new Parcelable.Creator<DeviceAuthMethodHandler>() { // from class: com.facebook.login.DeviceAuthMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.t.f(parcel, NyXuoef.PRyTgkb);
            return new DeviceAuthMethodHandler(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceAuthMethodHandler[] newArray(int i10) {
            return new DeviceAuthMethodHandler[i10];
        }
    };

    /* JADX INFO: compiled from: DeviceAuthMethodHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor getBackgroundExecutor() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (DeviceAuthMethodHandler.backgroundExecutor == null) {
                DeviceAuthMethodHandler.backgroundExecutor = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = DeviceAuthMethodHandler.backgroundExecutor;
            if (scheduledThreadPoolExecutor == null) {
                kotlin.jvm.internal.t.u("backgroundExecutor");
                scheduledThreadPoolExecutor = null;
            }
            return scheduledThreadPoolExecutor;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.t.f(loginClient, "loginClient");
        this.nameForLogging = "device_auth";
    }

    public static final synchronized ScheduledThreadPoolExecutor getBackgroundExecutor() {
        return Companion.getBackgroundExecutor();
    }

    private final void showDialog(LoginClient.Request request) {
        androidx.fragment.app.e activity = getLoginClient().getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        DeviceAuthDialog deviceAuthDialogCreateDeviceAuthDialog = createDeviceAuthDialog();
        deviceAuthDialogCreateDeviceAuthDialog.show(activity.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialogCreateDeviceAuthDialog.startLogin(request);
    }

    protected DeviceAuthDialog createDeviceAuthDialog() {
        return new DeviceAuthDialog();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public void onCancel() {
        getLoginClient().completeAndValidate(LoginClient.Result.Companion.createCancelResult(getLoginClient().getPendingRequest(), LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE));
    }

    public void onError(Exception ex) {
        kotlin.jvm.internal.t.f(ex, "ex");
        getLoginClient().completeAndValidate(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, getLoginClient().getPendingRequest(), null, ex.getMessage(), null, 8, null));
    }

    public void onSuccess(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        kotlin.jvm.internal.t.f(accessToken, "accessToken");
        kotlin.jvm.internal.t.f(applicationId, "applicationId");
        kotlin.jvm.internal.t.f(userId, "userId");
        getLoginClient().completeAndValidate(LoginClient.Result.Companion.createTokenResult(getLoginClient().getPendingRequest(), new AccessToken(accessToken, applicationId, userId, collection, collection2, collection3, accessTokenSource, date, date2, date3, null, 1024, null)));
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(LoginClient.Request request) {
        kotlin.jvm.internal.t.f(request, "request");
        showDialog(request);
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.t.f(parcel, "parcel");
        this.nameForLogging = "device_auth";
    }
}
