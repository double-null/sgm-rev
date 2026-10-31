package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaab;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zacl;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    protected final GoogleApiManager zaa;
    private final Context zab;
    private final String zac;
    private final AttributionSourceWrapper zad;
    private final Api zae;
    private final Api.ApiOptions zaf;
    private final ApiKey zag;
    private final Looper zah;
    private final int zai;
    private final UserHandle zaj;
    private final GoogleApiClient zak;
    private final StatusExceptionMapper zal;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
    public static class Settings {
        public static final Settings DEFAULT_SETTINGS = new Builder().build();
        public final StatusExceptionMapper zaa;
        public final Looper zab;
        final UserHandle zac;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
        public static class Builder {
            private StatusExceptionMapper zaa;
            private Looper zab;
            private UserHandle zac;

            public Settings build() {
                if (this.zaa == null) {
                    this.zaa = new ApiExceptionMapper();
                }
                if (this.zab == null) {
                    this.zab = Looper.getMainLooper();
                }
                return new Settings(this.zaa, null, this.zab, this.zac, null);
            }

            public Builder setLooper(Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            public Builder setMapper(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper;
                return this;
            }

            public Builder setUserHandle(UserHandle userHandle) {
                if (Build.VERSION.SDK_INT >= 33) {
                    this.zac = userHandle;
                }
                return this;
            }
        }

        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper, UserHandle userHandle) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
            this.zac = userHandle;
        }

        /* synthetic */ Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper, UserHandle userHandle, byte[] bArr) {
            this(statusExceptionMapper, null, looper, userHandle);
        }
    }

    public GoogleApi(Activity activity, Api<O> api, O o10, Settings settings) {
        this(activity, activity, api, o10, settings);
    }

    private final BaseImplementation.ApiMethodImpl zad(int i10, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zaa.zak(this, i10, apiMethodImpl);
        return apiMethodImpl;
    }

    private final Task zae(int i10, TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.zal(this, i10, taskApiCall, taskCompletionSource, this.zal);
        return taskCompletionSource.getTask();
    }

    public GoogleApiClient asGoogleApiClient() {
        return this.zak;
    }

    protected ClientSettings.Builder createClientSettingsBuilder() {
        Account account;
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.zaf;
        boolean z10 = apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions;
        if (!z10 || (googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).getGoogleSignInAccount()) == null) {
            account = apiOptions instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) apiOptions).getAccount() : null;
        } else {
            account = googleSignInAccount2.getAccount();
        }
        builder.zaa(account);
        Set<Scope> setEmptySet = (!z10 || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).getGoogleSignInAccount()) == null) ? Collections.emptySet() : googleSignInAccount.getRequestedScopes();
        builder.zab(setEmptySet);
        Context context = this.zab;
        builder.zac(context.getClass().getName());
        builder.setRealClientPackageName(context.getPackageName());
        return builder;
    }

    protected Task<Boolean> disconnectService() {
        return this.zaa.zaj(this);
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(T t10) {
        zad(2, t10);
        return t10;
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(T t10) {
        zad(0, t10);
        return t10;
    }

    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(T t10, U u10) {
        Preconditions.checkNotNull(t10);
        Preconditions.checkNotNull(u10);
        Preconditions.checkNotNull(t10.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u10.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(t10.getListenerKey(), u10.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zan(this, t10, u10, zab.zaa);
    }

    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(T t10) {
        zad(1, t10);
        return t10;
    }

    protected String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    public final ApiKey<O> getApiKey() {
        return this.zag;
    }

    public O getApiOptions() {
        return (O) this.zaf;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    protected String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    protected String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zah;
    }

    public <L> ListenerHolder<L> registerListener(L l10, String str) {
        return ListenerHolders.createListenerHolder(l10, this.zah, str);
    }

    public final int zab() {
        return this.zai;
    }

    public final zacl zac(Context context, Handler handler) {
        return new zacl(context, handler, createClientSettingsBuilder().build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Api.Client zaf(Looper looper, zabk zabkVar) {
        ClientSettings clientSettingsBuild = createClientSettingsBuilder().build();
        Api.Client clientBuildClient = ((Api.AbstractClientBuilder) Preconditions.checkNotNull(this.zae.zab())).buildClient(this.zab, looper, clientSettingsBuild, this.zaf, (GoogleApiClient.ConnectionCallbacks) zabkVar, (GoogleApiClient.OnConnectionFailedListener) zabkVar);
        UserHandle userHandle = this.zaj;
        if (userHandle != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setUserHandle(userHandle);
        }
        AttributionSourceWrapper attributionSourceWrapper = this.zad;
        if (attributionSourceWrapper != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setAttributionSourceWrapper(attributionSourceWrapper);
            return clientBuildClient;
        }
        if (attributionSourceWrapper != null && (clientBuildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) clientBuildClient).zab(attributionSourceWrapper);
            return clientBuildClient;
        }
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (clientBuildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) clientBuildClient).zaa(contextAttributionTag);
        }
        return clientBuildClient;
    }

    @Deprecated
    public GoogleApi(Activity activity, Api<O> api, O o10, StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        builder.setLooper(activity.getMainLooper());
        this(activity, (Api) api, (Api.ApiOptions) o10, builder.build());
    }

    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey, int i10) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zaa.zao(this, listenerKey, i10);
    }

    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    private GoogleApi(Context context, Activity activity, Api api, Api.ApiOptions apiOptions, Settings settings) {
        String apiFallbackAttributionTag;
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) Preconditions.checkNotNull(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            apiFallbackAttributionTag = androidx.core.content.a.c(context);
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = i10 >= 31 ? new AttributionSourceWrapper(context.getAttributionSource()) : null;
        this.zae = api;
        this.zaf = apiOptions;
        this.zah = settings.zab;
        UserHandle userHandle = settings.zac;
        this.zaj = userHandle;
        ApiKey sharedApiKey = ApiKey.getSharedApiKey(api, apiOptions, apiFallbackAttributionTag, userHandle);
        this.zag = sharedApiKey;
        this.zak = new zabp(this);
        GoogleApiManager googleApiManagerZaa = GoogleApiManager.zaa(context2);
        this.zaa = googleApiManagerZaa;
        this.zai = googleApiManagerZaa.zac();
        this.zal = settings.zaa;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaab.zaa(activity, googleApiManagerZaa, sharedApiKey);
        }
        googleApiManagerZaa.zad(this);
    }

    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Listener has already been released.");
        UnregisterListenerMethod unregisterListenerMethod = registrationMethods.zaa;
        Preconditions.checkNotNull(unregisterListenerMethod.getListenerKey(), "Listener has already been released.");
        return this.zaa.zan(this, registrationMethods.register, unregisterListenerMethod, registrationMethods.zab);
    }

    public GoogleApi(Context context, Api<O> api, O o10, Settings settings) {
        this(context, null, api, o10, settings);
    }

    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o10, StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        this(context, api, o10, builder.build());
    }
}
