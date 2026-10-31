package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import be.LNO.fzLzfW;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.o0;
import kotlin.jvm.internal.l0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DeviceAuthDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public class DeviceAuthDialog extends androidx.fragment.app.d {
    private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED = 1349173;
    private static final int LOGIN_ERROR_SUBCODE_CODE_EXPIRED = 1349152;
    private static final int LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING = 1349172;
    private static final String REQUEST_STATE_KEY = "request_state";
    private final AtomicBoolean completed = new AtomicBoolean();
    private TextView confirmationCode;
    private volatile GraphRequestAsyncTask currentGraphRequestPoll;
    private volatile RequestState currentRequestState;
    private DeviceAuthMethodHandler deviceAuthMethodHandler;
    private TextView instructions;
    private boolean isBeingDestroyed;
    private boolean isRetry;
    private View progressBar;
    private LoginClient.Request request;
    private volatile ScheduledFuture<?> scheduledPoll;
    public static final Companion Companion = new Companion(null);
    private static final String DEVICE_LOGIN_ENDPOINT = "device/login";
    private static final String DEVICE_LOGIN_STATUS_ENDPOINT = "device/login_status";
    private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING = 1349174;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    static final class PermissionsLists {
        private List<String> declinedPermissions;
        private List<String> expiredPermissions;
        private List<String> grantedPermissions;

        public PermissionsLists(List<String> grantedPermissions, List<String> declinedPermissions, List<String> expiredPermissions) {
            kotlin.jvm.internal.t.f(grantedPermissions, "grantedPermissions");
            kotlin.jvm.internal.t.f(declinedPermissions, "declinedPermissions");
            kotlin.jvm.internal.t.f(expiredPermissions, "expiredPermissions");
            this.grantedPermissions = grantedPermissions;
            this.declinedPermissions = declinedPermissions;
            this.expiredPermissions = expiredPermissions;
        }

        public final List<String> getDeclinedPermissions() {
            return this.declinedPermissions;
        }

        public final List<String> getExpiredPermissions() {
            return this.expiredPermissions;
        }

        public final List<String> getGrantedPermissions() {
            return this.grantedPermissions;
        }

        public final void setDeclinedPermissions(List<String> list) {
            kotlin.jvm.internal.t.f(list, "<set-?>");
            this.declinedPermissions = list;
        }

        public final void setExpiredPermissions(List<String> list) {
            kotlin.jvm.internal.t.f(list, "<set-?>");
            this.expiredPermissions = list;
        }

        public final void setGrantedPermissions(List<String> list) {
            kotlin.jvm.internal.t.f(list, "<set-?>");
            this.grantedPermissions = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    static final class RequestState implements Parcelable {
        private String authorizationUri;
        private long interval;
        private long lastPoll;
        private String requestCode;
        private String userCode;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator<RequestState>() { // from class: com.facebook.login.DeviceAuthDialog$RequestState$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DeviceAuthDialog.RequestState createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.t.f(parcel, "parcel");
                return new DeviceAuthDialog.RequestState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DeviceAuthDialog.RequestState[] newArray(int i10) {
                return new DeviceAuthDialog.RequestState[i10];
            }
        };

        /* JADX INFO: compiled from: DeviceAuthDialog.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public RequestState() {
        }

        protected RequestState(Parcel parcel) {
            kotlin.jvm.internal.t.f(parcel, "parcel");
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getAuthorizationUri() {
            return this.authorizationUri;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final String getRequestCode() {
            return this.requestCode;
        }

        public final String getUserCode() {
            return this.userCode;
        }

        public final void setInterval(long j10) {
            this.interval = j10;
        }

        public final void setLastPoll(long j10) {
            this.lastPoll = j10;
        }

        public final void setRequestCode(String str) {
            this.requestCode = str;
        }

        public final void setUserCode(String str) {
            this.userCode = str;
            l0 l0Var = l0.f21527a;
            String str2 = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.t.e(str2, "format(locale, format, *args)");
            this.authorizationUri = str2;
        }

        public final boolean withinLastRefreshWindow() {
            return this.lastPoll != 0 && (new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.t.f(dest, "dest");
            dest.writeString(this.authorizationUri);
            dest.writeString(this.userCode);
            dest.writeString(this.requestCode);
            dest.writeLong(this.interval);
            dest.writeLong(this.lastPoll);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_pollRequest_$lambda$5(DeviceAuthDialog this$0, GraphResponse response) {
        FacebookException facebookException;
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(response, "response");
        if (this$0.completed.get()) {
            return;
        }
        FacebookRequestError error = response.getError();
        if (error == null) {
            try {
                JSONObject jSONObject = response.getJSONObject();
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                String string = jSONObject.getString("access_token");
                kotlin.jvm.internal.t.e(string, "resultObject.getString(\"access_token\")");
                this$0.onSuccess(string, jSONObject.getLong(AccessToken.EXPIRES_IN_KEY), Long.valueOf(jSONObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
                return;
            } catch (JSONException e10) {
                this$0.onError(new FacebookException(e10));
                return;
            }
        }
        int subErrorCode = error.getSubErrorCode();
        boolean z10 = true;
        if (subErrorCode != LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING && subErrorCode != LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING) {
            z10 = false;
        }
        if (z10) {
            this$0.schedulePoll();
            return;
        }
        if (subErrorCode == LOGIN_ERROR_SUBCODE_CODE_EXPIRED) {
            RequestState requestState = this$0.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            LoginClient.Request request = this$0.request;
            if (request != null) {
                this$0.startLogin(request);
                return;
            } else {
                this$0.onCancel();
                return;
            }
        }
        if (subErrorCode == LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED) {
            this$0.onCancel();
            return;
        }
        FacebookRequestError error2 = response.getError();
        if (error2 == null || (facebookException = error2.getException()) == null) {
            facebookException = new FacebookException();
        }
        this$0.onError(facebookException);
    }

    private final void completeLogin(String str, PermissionsLists permissionsLists, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.onSuccess(str2, FacebookSdk.getApplicationId(), str, permissionsLists.getGrantedPermissions(), permissionsLists.getDeclinedPermissions(), permissionsLists.getExpiredPermissions(), AccessTokenSource.DEVICE_AUTH, date, null, date2);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final GraphRequest getPollRequest() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.currentRequestState;
        bundle.putString("code", requestState != null ? requestState.getRequestCode() : null);
        bundle.putString("access_token", getApplicationAccessToken());
        return GraphRequest.Companion.newPostRequestWithBundle(null, DEVICE_LOGIN_STATUS_ENDPOINT, bundle, new GraphRequest.Callback() { // from class: com.facebook.login.f
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                DeviceAuthDialog._get_pollRequest_$lambda$5(this.f11137a, graphResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeContentView$lambda$2(DeviceAuthDialog this$0, View view) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.onCancel();
    }

    private final void onSuccess(final String str, long j10, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, "id,permissions,name");
        final Date date = null;
        final Date date2 = j10 != 0 ? new Date(new Date().getTime() + (j10 * 1000)) : null;
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date = new Date(l10.longValue() * 1000);
        }
        GraphRequest graphRequestNewGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(new AccessToken(str, FacebookSdk.getApplicationId(), AppEventsConstants.EVENT_PARAM_VALUE_NO, null, null, null, null, date2, null, date, null, 1024, null), TournamentShareDialogURIBuilder.f11075me, new GraphRequest.Callback() { // from class: com.facebook.login.b
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                DeviceAuthDialog.onSuccess$lambda$10(this.f11125a, str, date2, date, graphResponse);
            }
        });
        graphRequestNewGraphPathRequest.setHttpMethod(HttpMethod.GET);
        graphRequestNewGraphPathRequest.setParameters(bundle);
        graphRequestNewGraphPathRequest.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$10(DeviceAuthDialog this$0, String accessToken, Date date, Date date2, GraphResponse response) {
        EnumSet<SmartLoginOption> smartLoginOptions;
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(accessToken, "$accessToken");
        kotlin.jvm.internal.t.f(response, "response");
        if (this$0.completed.get()) {
            return;
        }
        FacebookRequestError error = response.getError();
        if (error != null) {
            FacebookException exception = error.getException();
            if (exception == null) {
                exception = new FacebookException();
            }
            this$0.onError(exception);
            return;
        }
        try {
            JSONObject jSONObject = response.getJSONObject();
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            String string = jSONObject.getString("id");
            kotlin.jvm.internal.t.e(string, "jsonObject.getString(\"id\")");
            PermissionsLists permissionsListsHandlePermissionResponse = Companion.handlePermissionResponse(jSONObject);
            String string2 = jSONObject.getString("name");
            kotlin.jvm.internal.t.e(string2, "jsonObject.getString(\"name\")");
            RequestState requestState = this$0.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
            if (!kotlin.jvm.internal.t.a((appSettingsWithoutQuery == null || (smartLoginOptions = appSettingsWithoutQuery.getSmartLoginOptions()) == null) ? null : Boolean.valueOf(smartLoginOptions.contains(SmartLoginOption.RequireConfirm)), Boolean.TRUE) || this$0.isRetry) {
                this$0.completeLogin(string, permissionsListsHandlePermissionResponse, accessToken, date, date2);
            } else {
                this$0.isRetry = true;
                this$0.presentConfirmation(string, permissionsListsHandlePermissionResponse, accessToken, string2, date, date2);
            }
        } catch (JSONException e10) {
            this$0.onError(new FacebookException(e10));
        }
    }

    private final void poll() {
        RequestState requestState = this.currentRequestState;
        if (requestState != null) {
            requestState.setLastPoll(new Date().getTime());
        }
        this.currentGraphRequestPoll = getPollRequest().executeAsync();
    }

    private final void presentConfirmation(final String str, final PermissionsLists permissionsLists, final String str2, String str3, final Date date, final Date date2) {
        String string = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_title);
        kotlin.jvm.internal.t.e(string, "resources.getString(R.st…login_confirmation_title)");
        String string2 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_continue_as);
        kotlin.jvm.internal.t.e(string2, "resources.getString(R.st…confirmation_continue_as)");
        String string3 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_cancel);
        kotlin.jvm.internal.t.e(string3, "resources.getString(R.st…ogin_confirmation_cancel)");
        l0 l0Var = l0.f21527a;
        String str4 = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        kotlin.jvm.internal.t.e(str4, "format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: com.facebook.login.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DeviceAuthDialog.presentConfirmation$lambda$6(this.f11129a, str, permissionsLists, str2, date, date2, dialogInterface, i10);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: com.facebook.login.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DeviceAuthDialog.presentConfirmation$lambda$8(this.f11135a, dialogInterface, i10);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentConfirmation$lambda$6(DeviceAuthDialog this$0, String userId, PermissionsLists permissions, String accessToken, Date date, Date date2, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(userId, "$userId");
        kotlin.jvm.internal.t.f(permissions, "$permissions");
        kotlin.jvm.internal.t.f(accessToken, "$accessToken");
        this$0.completeLogin(userId, permissions, accessToken, date, date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentConfirmation$lambda$8(DeviceAuthDialog this$0, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        View viewInitializeContentView = this$0.initializeContentView(false);
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.setContentView(viewInitializeContentView);
        }
        LoginClient.Request request = this$0.request;
        if (request != null) {
            this$0.startLogin(request);
        }
    }

    private final void schedulePoll() {
        RequestState requestState = this.currentRequestState;
        Long lValueOf = requestState != null ? Long.valueOf(requestState.getInterval()) : null;
        if (lValueOf != null) {
            this.scheduledPoll = DeviceAuthMethodHandler.Companion.getBackgroundExecutor().schedule(new Runnable() { // from class: com.facebook.login.e
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceAuthDialog.schedulePoll$lambda$3(this.f11136a);
                }
            }, lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedulePoll$lambda$3(DeviceAuthDialog this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.poll();
    }

    private final void setCurrentRequestState(RequestState requestState) {
        this.currentRequestState = requestState;
        TextView textView = this.confirmationCode;
        View view = null;
        if (textView == null) {
            kotlin.jvm.internal.t.u("confirmationCode");
            textView = null;
        }
        textView.setText(requestState.getUserCode());
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), DeviceRequestsHelper.generateQRCode(requestState.getAuthorizationUri()));
        TextView textView2 = this.instructions;
        if (textView2 == null) {
            kotlin.jvm.internal.t.u("instructions");
            textView2 = null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.confirmationCode;
        if (textView3 == null) {
            kotlin.jvm.internal.t.u("confirmationCode");
            textView3 = null;
        }
        textView3.setVisibility(0);
        View view2 = this.progressBar;
        if (view2 == null) {
            kotlin.jvm.internal.t.u("progressBar");
        } else {
            view = view2;
        }
        view.setVisibility(8);
        if (!this.isRetry && DeviceRequestsHelper.startAdvertisementService(requestState.getUserCode())) {
            new InternalAppEventsLogger(getContext()).logEventImplicitly(AnalyticsEvents.EVENT_SMART_LOGIN_SERVICE);
        }
        if (requestState.withinLastRefreshWindow()) {
            schedulePoll();
        } else {
            poll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLogin$lambda$1(DeviceAuthDialog this$0, GraphResponse response) {
        FacebookException facebookException;
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(response, "response");
        if (this$0.isBeingDestroyed) {
            return;
        }
        if (response.getError() != null) {
            FacebookRequestError error = response.getError();
            if (error == null || (facebookException = error.getException()) == null) {
                facebookException = new FacebookException();
            }
            this$0.onError(facebookException);
            return;
        }
        JSONObject jSONObject = response.getJSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            requestState.setUserCode(jSONObject.getString("user_code"));
            requestState.setRequestCode(jSONObject.getString("code"));
            requestState.setInterval(jSONObject.getLong("interval"));
            this$0.setCurrentRequestState(requestState);
        } catch (JSONException e10) {
            this$0.onError(new FacebookException(e10));
        }
    }

    public Map<String, String> additionalDeviceInfo() {
        return null;
    }

    public String getApplicationAccessToken() {
        return Validate.hasAppID() + '|' + Validate.hasClientToken();
    }

    @Override // androidx.lifecycle.e
    public /* bridge */ /* synthetic */ m0.a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    protected int getLayoutResId(boolean z10) {
        return z10 ? com.facebook.common.R.layout.com_facebook_smart_device_dialog_fragment : com.facebook.common.R.layout.com_facebook_device_auth_dialog_fragment;
    }

    protected View initializeContentView(boolean z10) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        kotlin.jvm.internal.t.e(layoutInflater, "requireActivity().layoutInflater");
        TextView textView = null;
        View viewInflate = layoutInflater.inflate(getLayoutResId(z10), (ViewGroup) null);
        kotlin.jvm.internal.t.e(viewInflate, "inflater.inflate(getLayo…esId(isSmartLogin), null)");
        View viewFindViewById = viewInflate.findViewById(com.facebook.common.R.id.progress_bar);
        kotlin.jvm.internal.t.e(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.progressBar = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(com.facebook.common.R.id.confirmation_code);
        kotlin.jvm.internal.t.d(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.confirmationCode = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(com.facebook.common.R.id.cancel_button);
        kotlin.jvm.internal.t.d(viewFindViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAuthDialog.initializeContentView$lambda$2(this.f11139a, view);
            }
        });
        View viewFindViewById4 = viewInflate.findViewById(com.facebook.common.R.id.com_facebook_device_auth_instructions);
        kotlin.jvm.internal.t.d(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById4;
        this.instructions = textView2;
        if (textView2 == null) {
            kotlin.jvm.internal.t.u("instructions");
        } else {
            textView = textView2;
        }
        textView.setText(Html.fromHtml(getString(com.facebook.common.R.string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    protected boolean onBackButtonPressed() {
        return true;
    }

    protected void onCancel() {
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.onCancel();
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        final androidx.fragment.app.e eVarRequireActivity = requireActivity();
        final int i10 = com.facebook.common.R.style.com_facebook_auth_dialog;
        Dialog dialog = new Dialog(eVarRequireActivity, i10) { // from class: com.facebook.login.DeviceAuthDialog$onCreateDialog$dialog$1
            @Override // android.app.Dialog
            public void onBackPressed() {
                if (this.this$0.onBackButtonPressed()) {
                    super.onBackPressed();
                }
            }
        };
        dialog.setContentView(initializeContentView(DeviceRequestsHelper.isAvailable() && !this.isRetry));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        LoginClient loginClient;
        kotlin.jvm.internal.t.f(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        kotlin.jvm.internal.t.d(eVarRequireActivity, "null cannot be cast to non-null type com.facebook.FacebookActivity");
        LoginFragment loginFragment = (LoginFragment) ((FacebookActivity) eVarRequireActivity).getCurrentFragment();
        this.deviceAuthMethodHandler = (DeviceAuthMethodHandler) ((loginFragment == null || (loginClient = loginFragment.getLoginClient()) == null) ? null : loginClient.getCurrentHandler());
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable(REQUEST_STATE_KEY)) != null) {
            setCurrentRequestState(requestState);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        GraphRequestAsyncTask graphRequestAsyncTask = this.currentGraphRequestPoll;
        if (graphRequestAsyncTask != null) {
            graphRequestAsyncTask.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.scheduledPoll;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.t.f(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.isBeingDestroyed) {
            return;
        }
        onCancel();
    }

    protected void onError(FacebookException ex) {
        kotlin.jvm.internal.t.f(ex, "ex");
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.onError(ex);
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public void startLogin(LoginClient.Request request) {
        kotlin.jvm.internal.t.f(request, "request");
        this.request = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.getPermissions()));
        Utility.putNonEmptyString(bundle, ServerProtocol.DIALOG_PARAM_REDIRECT_URI, request.getDeviceRedirectUriString());
        Utility.putNonEmptyString(bundle, DeviceRequestsHelper.DEVICE_TARGET_USER_ID, request.getDeviceAuthTargetUserId());
        bundle.putString("access_token", getApplicationAccessToken());
        Map<String, String> mapAdditionalDeviceInfo = additionalDeviceInfo();
        bundle.putString(DeviceRequestsHelper.DEVICE_INFO_PARAM, DeviceRequestsHelper.getDeviceInfo(mapAdditionalDeviceInfo != null ? o0.u(mapAdditionalDeviceInfo) : null));
        GraphRequest.Companion.newPostRequestWithBundle(null, DEVICE_LOGIN_ENDPOINT, bundle, new GraphRequest.Callback() { // from class: com.facebook.login.g
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                DeviceAuthDialog.startLogin$lambda$1(this.f11138a, graphResponse);
            }
        }).executeAsync();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.t.f(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.currentRequestState != null) {
            outState.putParcelable(fzLzfW.MEizTvizKUE, this.currentRequestState);
        }
    }

    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PermissionsLists handlePermissionResponse(JSONObject jSONObject) throws JSONException {
            String strOptString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                String permission = jSONObjectOptJSONObject.optString("permission");
                kotlin.jvm.internal.t.e(permission, "permission");
                if (!(permission.length() == 0) && !kotlin.jvm.internal.t.a(permission, "installed") && (strOptString = jSONObjectOptJSONObject.optString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)) != null) {
                    int iHashCode = strOptString.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && strOptString.equals("declined")) {
                                arrayList2.add(permission);
                            }
                        } else if (strOptString.equals("granted")) {
                            arrayList.add(permission);
                        }
                    } else if (strOptString.equals("expired")) {
                        arrayList3.add(permission);
                    }
                }
            }
            return new PermissionsLists(arrayList, arrayList2, arrayList3);
        }

        public final String getDEVICE_LOGIN_ENDPOINT$facebook_common_release() {
            return DeviceAuthDialog.DEVICE_LOGIN_ENDPOINT;
        }

        public final String getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release() {
            return DeviceAuthDialog.DEVICE_LOGIN_STATUS_ENDPOINT;
        }

        public final int getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release() {
            return DeviceAuthDialog.LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING;
        }

        public static /* synthetic */ void getDEVICE_LOGIN_ENDPOINT$facebook_common_release$annotations() {
        }

        public static /* synthetic */ void getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release$annotations() {
        }

        public static /* synthetic */ void getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release$annotations() {
        }
    }
}
