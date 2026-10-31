package com.google.googlesignin;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.PendingResult;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class TokenRequest {
    private String accountName;
    private boolean doAuthCode;
    private boolean doEmail;
    private boolean doIdToken;
    private boolean forceRefresh;
    private long handle;
    private boolean hidePopups;
    private TokenPendingResult pendingResponse;
    private String[] scopes;
    private boolean useGamesConfig;
    private String webClientId;

    public TokenRequest(boolean z10, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str2, String[] strArr, long j10) {
        this.pendingResponse = new TokenPendingResult(j10);
        this.useGamesConfig = z10;
        this.webClientId = str;
        this.doAuthCode = z11;
        this.forceRefresh = z12;
        this.doEmail = z13;
        this.doIdToken = z14;
        this.hidePopups = z15;
        this.accountName = str2;
        this.handle = j10;
        if (strArr == null || strArr.length <= 0) {
            this.scopes = null;
            return;
        }
        String[] strArr2 = new String[strArr.length];
        this.scopes = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
    }

    public void cancel() {
        this.pendingResponse.cancel();
    }

    public String getAccountName() {
        return this.accountName;
    }

    public boolean getDoAuthCode() {
        return this.doAuthCode;
    }

    public boolean getDoEmail() {
        return this.doEmail;
    }

    public boolean getDoIdToken() {
        return this.doIdToken;
    }

    public boolean getForceRefresh() {
        return this.forceRefresh;
    }

    public long getHandle() {
        return this.handle;
    }

    public boolean getHidePopups() {
        return this.hidePopups;
    }

    public PendingResult<TokenResult> getPendingResponse() {
        return this.pendingResponse;
    }

    public String[] getScopes() {
        return this.scopes;
    }

    public boolean getUseGamesConfig() {
        return this.useGamesConfig;
    }

    public String getWebClientId() {
        String str = this.webClientId;
        return str == null ? "" : str;
    }

    public boolean isValid() {
        String str = this.webClientId;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        if (this.doAuthCode) {
            GoogleSignInHelper.logError("Invalid configuration, auth code requires web client id");
            return false;
        }
        if (!this.doIdToken) {
            return true;
        }
        GoogleSignInHelper.logError("Invalid configuration, id token requires web client id");
        return false;
    }

    public void setResult(int i10, GoogleSignInAccount googleSignInAccount) {
        this.pendingResponse.setResult(googleSignInAccount, i10);
        this.pendingResponse.setStatus(i10);
    }

    public String toString() {
        return String.format(Locale.getDefault(), "%s(a:%b:e:%b:i:%b)", Integer.toHexString(hashCode()), Boolean.valueOf(this.doAuthCode), Boolean.valueOf(this.doEmail), Boolean.valueOf(this.doIdToken));
    }
}
