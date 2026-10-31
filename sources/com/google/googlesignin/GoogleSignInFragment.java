package com.google.googlesignin;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Scope;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class GoogleSignInFragment extends Fragment implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public static final String FRAGMENT_TAG = "signin.SignInFragment";
    private static final int RC_SIGNIN = 9009;
    private static GoogleSignInFragment theFragment;
    private GoogleApiClient mGoogleApiClient;
    private TokenRequest request = null;
    private State state;

    private enum State {
        NEW,
        READY,
        PENDING,
        PENDING_SILENT,
        BUSY
    }

    private void buildClient(TokenRequest tokenRequest) {
        GoogleSignInOptions.Builder builder;
        if (tokenRequest.getUseGamesConfig()) {
            GoogleSignInHelper.logDebug("Using DEFAULT_GAMES_SIGN_IN");
            builder = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN);
        } else {
            GoogleSignInHelper.logDebug("Using DEFAULT_SIGN_IN");
            builder = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN);
        }
        if (tokenRequest.getDoAuthCode()) {
            if (tokenRequest.getWebClientId().isEmpty()) {
                GoogleSignInHelper.logError("Web client ID is needed for Auth Code");
                tokenRequest.setResult(10, null);
                throw new IllegalStateException("Web client ID is needed for Auth Code");
            }
            GoogleSignInHelper.logDebug("Requesting AuthCode force = " + tokenRequest.getForceRefresh() + "client: " + tokenRequest.getWebClientId());
            builder.requestServerAuthCode(tokenRequest.getWebClientId(), tokenRequest.getForceRefresh());
        }
        if (tokenRequest.getDoEmail()) {
            GoogleSignInHelper.logDebug("Requesting email");
            builder.requestEmail();
        }
        if (tokenRequest.getDoIdToken()) {
            if (tokenRequest.getWebClientId().isEmpty()) {
                GoogleSignInHelper.logError("Web client ID is needed for ID Token");
                tokenRequest.setResult(10, null);
                throw new IllegalStateException("Web client ID is needed for Auth Code");
            }
            GoogleSignInHelper.logDebug("Requesting IDToken  client: " + tokenRequest.getWebClientId());
            builder.requestIdToken(tokenRequest.getWebClientId());
        }
        if (tokenRequest.getScopes() != null) {
            for (String str : tokenRequest.getScopes()) {
                GoogleSignInHelper.logDebug("Adding scope: " + str);
                builder.requestScopes(new Scope(str), new Scope[0]);
            }
        }
        if (tokenRequest.getHidePopups() && tokenRequest.getUseGamesConfig()) {
            GoogleSignInHelper.logDebug("hiding popup views for games API");
            builder.addExtension(getGamesExtension());
        }
        if (tokenRequest.getAccountName() != null) {
            GoogleSignInHelper.logDebug("Setting accountName: " + tokenRequest.getAccountName());
            builder.setAccountName(tokenRequest.getAccountName());
        }
        GoogleApiClient.Builder builderAddApi = new GoogleApiClient.Builder(getActivity()).addApi(Auth.GOOGLE_SIGN_IN_API, builder.build());
        if (tokenRequest.getUseGamesConfig()) {
            GoogleSignInHelper.logDebug("Adding games API");
            try {
                builderAddApi.addApi(getGamesAPI());
            } catch (Exception e10) {
                GoogleSignInHelper.logError("Exception getting Games API: " + e10.getMessage());
                tokenRequest.setResult(10, null);
                return;
            }
        }
        if (tokenRequest.getHidePopups()) {
            View view = new View(getActivity());
            view.setVisibility(4);
            view.setClickable(false);
            builderAddApi.setViewForPopups(view);
        }
        GoogleApiClient googleApiClientBuild = builderAddApi.build();
        this.mGoogleApiClient = googleApiClientBuild;
        googleApiClientBuild.connect(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0016 A[Catch: all -> 0x001d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000a, B:9:0x0013, B:11:0x0018, B:10:0x0016), top: B:17:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[Catch: all -> 0x001d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000a, B:9:0x0013, B:11:0x0018, B:10:0x0016), top: B:17:0x0003 }] */
    public synchronized void clearRequest(boolean z10) {
        State state;
        if (z10) {
            TokenRequest tokenRequest = this.request;
            if (tokenRequest != null) {
                tokenRequest.cancel();
            }
            this.request = null;
            if (getActivity() != null) {
                state = State.READY;
            } else {
                state = State.NEW;
            }
            setState(state);
        } else {
            this.request = null;
            if (getActivity() != null) {
                state = State.READY;
            } else {
                state = State.NEW;
            }
            setState(state);
        }
        throw th;
    }

    private Api<? extends Api.ApiOptions.NotRequiredOptions> getGamesAPI() {
        try {
            return (Api) Class.forName("com.google.android.gms.games.Games").getField("API").get(null);
        } catch (ClassNotFoundException e10) {
            throw new IllegalArgumentException("Games API requested, but can't load Games class", e10);
        } catch (IllegalAccessException e11) {
            throw new IllegalArgumentException("Games API requested, but can't load Games API field", e11);
        } catch (NoSuchFieldException e12) {
            throw new IllegalArgumentException("Games API requested, but can't load Games API field", e12);
        }
    }

    private GoogleSignInOptionsExtension getGamesExtension() {
        try {
            Object objInvoke = Class.forName("com.google.android.gms.games.Games$GamesOptions").getMethod("builder()", new Class[0]).invoke(null, new Object[0]);
            objInvoke.getClass().getMethod("setShowConnectingPopup", Boolean.TYPE).invoke(objInvoke, Boolean.FALSE);
            return (GoogleSignInOptionsExtension) objInvoke.getClass().getMethod(InAppPurchaseConstants.METHOD_BUILD, new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (ClassNotFoundException e10) {
            throw new IllegalArgumentException("Games API requested, butcan't load Games$GamesOptions class", e10);
        } catch (IllegalAccessException e11) {
            throw new IllegalArgumentException("Games API requested, butcan't invoke builder() static method.", e11);
        } catch (NoSuchMethodException e12) {
            throw new IllegalArgumentException("Games API requested, butcan't find builder() static method.", e12);
        } catch (InvocationTargetException e13) {
            throw new IllegalArgumentException("Games API requested, butcan't invoke builder() static method.", e13);
        }
    }

    public static GoogleSignInFragment getInstance(Activity activity) {
        GoogleSignInFragment googleSignInFragment = (GoogleSignInFragment) activity.getFragmentManager().findFragmentByTag(FRAGMENT_TAG);
        if (googleSignInFragment == null) {
            googleSignInFragment = theFragment;
        }
        if (googleSignInFragment != null) {
            return googleSignInFragment;
        }
        GoogleSignInHelper.logDebug("Creating fragment");
        GoogleSignInFragment googleSignInFragment2 = new GoogleSignInFragment();
        FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(googleSignInFragment2, FRAGMENT_TAG);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        theFragment = googleSignInFragment2;
        return googleSignInFragment2;
    }

    private synchronized State getState() {
        return this.state;
    }

    private void processRequest(boolean z10) {
        try {
            if (this.request == null) {
                GoogleSignInHelper.logInfo("No pending configuration, returning");
                return;
            }
            setState(State.BUSY);
            this.request.getPendingResponse().setResultCallback(new ResultCallback<TokenResult>() { // from class: com.google.googlesignin.GoogleSignInFragment.2
                @Override // com.google.android.gms.common.api.ResultCallback
                public void onResult(TokenResult tokenResult) {
                    GoogleSignInHelper.logDebug(String.format(Locale.getDefault(), "Calling nativeOnResult: handle: %s, status: %d acct: %s", Long.valueOf(tokenResult.getHandle()), Integer.valueOf(tokenResult.getStatus().getStatusCode()), tokenResult.getAccount()));
                    GoogleSignInHelper.nativeOnResult(tokenResult.getHandle(), tokenResult.getStatus().getStatusCode(), tokenResult.getAccount());
                    GoogleSignInFragment.this.clearRequest(false);
                }
            });
            buildClient(this.request);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" Has connected == ");
            GoogleApiClient googleApiClient = this.mGoogleApiClient;
            Api<GoogleSignInOptions> api = Auth.GOOGLE_SIGN_IN_API;
            sb2.append(googleApiClient.hasConnectedApi(api));
            GoogleSignInHelper.logDebug(sb2.toString());
            if (!this.mGoogleApiClient.hasConnectedApi(api)) {
                if (z10) {
                    Auth.GoogleSignInApi.silentSignIn(this.mGoogleApiClient).setResultCallback(new ResultCallback<GoogleSignInResult>() { // from class: com.google.googlesignin.GoogleSignInFragment.3
                        @Override // com.google.android.gms.common.api.ResultCallback
                        public void onResult(GoogleSignInResult googleSignInResult) {
                            if (googleSignInResult.isSuccess()) {
                                GoogleSignInHelper.nativeOnResult(GoogleSignInFragment.this.request.getHandle(), googleSignInResult.getStatus().getStatusCode(), googleSignInResult.getSignInAccount());
                                GoogleSignInFragment.this.setState(State.READY);
                                return;
                            }
                            GoogleSignInHelper.logError("Error with silentSignIn: " + googleSignInResult.getStatus());
                            GoogleSignInHelper.nativeOnResult(GoogleSignInFragment.this.request.getHandle(), googleSignInResult.getStatus().getStatusCode(), googleSignInResult.getSignInAccount());
                            GoogleSignInFragment.this.setState(State.READY);
                        }
                    });
                } else {
                    startActivityForResult(Auth.GoogleSignInApi.getSignInIntent(this.mGoogleApiClient), RC_SIGNIN);
                }
            }
            GoogleSignInHelper.logDebug("Done with processRequest!");
        } catch (Throwable th) {
            GoogleSignInHelper.logError("Exception caught! " + th.getMessage());
            this.request.setResult(8, null);
        }
    }

    private void processWhenReady(boolean z10) {
        GoogleSignInHelper.logInfo("Fragment not initialized yet, waiting to authenticate");
        setState(z10 ? State.PENDING_SILENT : State.PENDING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setState(State state) {
        this.state = state;
    }

    public void disconnect() {
        GoogleApiClient googleApiClient = this.mGoogleApiClient;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInHelper.logDebug("onActivityResult: " + i10 + " " + i11);
        if (i10 != RC_SIGNIN) {
            super.onActivityResult(i10, i11, intent);
            return;
        }
        GoogleSignInResult signInResultFromIntent = Auth.GoogleSignInApi.getSignInResultFromIntent(intent);
        TokenRequest tokenRequest = this.request;
        if (tokenRequest == null) {
            GoogleSignInHelper.logError("Pending request is null, can't return result!");
            return;
        }
        if (signInResultFromIntent != null) {
            tokenRequest.setResult(signInResultFromIntent.getStatus().getStatusCode(), signInResultFromIntent.getSignInAccount());
        } else {
            if (i11 >= 0) {
                i11 = 13;
            }
            tokenRequest.setResult(i11, null);
            GoogleSignInHelper.logError("GoogleSignIn result is null, returning error.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        GoogleSignInHelper.logDebug("onConnected!");
        if (!this.mGoogleApiClient.hasConnectedApi(Auth.GOOGLE_SIGN_IN_API)) {
            startActivityForResult(Auth.GoogleSignInApi.getSignInIntent(this.mGoogleApiClient), RC_SIGNIN);
        } else {
            GoogleSignInHelper.logDebug("has connected auth!");
            Auth.GoogleSignInApi.silentSignIn(this.mGoogleApiClient).setResultCallback(new ResultCallback<GoogleSignInResult>() { // from class: com.google.googlesignin.GoogleSignInFragment.1
                @Override // com.google.android.gms.common.api.ResultCallback
                public void onResult(GoogleSignInResult googleSignInResult) {
                    if (googleSignInResult.isSuccess()) {
                        GoogleSignInHelper.nativeOnResult(GoogleSignInFragment.this.request.getHandle(), googleSignInResult.getStatus().getStatusCode(), googleSignInResult.getSignInAccount());
                        GoogleSignInFragment.this.setState(State.READY);
                        return;
                    }
                    GoogleSignInHelper.logError("Error with silentSignIn: " + googleSignInResult.getStatus());
                    GoogleSignInHelper.nativeOnResult(GoogleSignInFragment.this.request.getHandle(), googleSignInResult.getStatus().getStatusCode(), googleSignInResult.getSignInAccount());
                    GoogleSignInFragment.this.setState(State.READY);
                }
            });
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        GoogleSignInHelper.logError("Connection failed: " + connectionResult.getErrorCode());
        if (connectionResult.hasResolution()) {
            startActivityForResult(Auth.GoogleSignInApi.getSignInIntent(this.mGoogleApiClient), RC_SIGNIN);
        } else {
            GoogleSignInHelper.nativeOnResult(this.request.getHandle(), connectionResult.getErrorCode(), null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int i10) {
        GoogleSignInHelper.logDebug("onConnectionSuspended() called: " + i10);
    }

    @Override // android.app.Fragment
    public void onResume() {
        GoogleSignInHelper.logDebug("onResume called");
        if (theFragment != this) {
            theFragment = this;
        }
        super.onResume();
        if (getState() == State.PENDING) {
            GoogleSignInHelper.logDebug("State is pending, calling processRequest(false)");
            processRequest(false);
        } else if (getState() == State.PENDING_SILENT) {
            GoogleSignInHelper.logDebug("State is pending_silent, calling processRequest(true)");
            processRequest(true);
        } else {
            GoogleSignInHelper.logDebug("State is now ready");
            setState(State.READY);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        GoogleApiClient googleApiClient = this.mGoogleApiClient;
        if (googleApiClient != null) {
            googleApiClient.connect(2);
        }
    }

    public void signOut() {
        clearRequest(true);
        GoogleApiClient googleApiClient = this.mGoogleApiClient;
        if (googleApiClient != null) {
            Auth.GoogleSignInApi.signOut(googleApiClient);
        }
    }

    public boolean startSignIn() {
        if (this.request == null) {
            GoogleSignInHelper.logError("Request not configured! Failing authenticate");
            return false;
        }
        if (getState() == State.BUSY) {
            GoogleSignInHelper.logError("There is already a pending callback configured.");
            return true;
        }
        if (getState() == State.READY) {
            processRequest(false);
            return true;
        }
        processWhenReady(false);
        return true;
    }

    public boolean startSignInSilently() {
        if (this.request == null) {
            GoogleSignInHelper.logError("Request not configured! Failing authenticate");
            return false;
        }
        if (getState() == State.BUSY) {
            GoogleSignInHelper.logError("There is already a pending callback configured.");
        } else if (getState() == State.READY) {
            processRequest(true);
        } else {
            processWhenReady(true);
        }
        return true;
    }

    public synchronized boolean submitRequest(TokenRequest tokenRequest) {
        if (this.request != null && this.state != State.READY) {
            GoogleSignInHelper.logError(String.format(Locale.getDefault(), "Existing request: %s ignoring %s.  State = %s", this.request, tokenRequest, this.state));
            return false;
        }
        this.request = tokenRequest;
        return true;
    }
}
