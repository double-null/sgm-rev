package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;

/* JADX INFO: compiled from: LoginResult.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginResult {
    private final AccessToken accessToken;
    private final AuthenticationToken authenticationToken;
    private final Set<String> recentlyDeniedPermissions;
    private final Set<String> recentlyGrantedPermissions;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginResult(AccessToken accessToken, Set<String> recentlyGrantedPermissions, Set<String> recentlyDeniedPermissions) {
        this(accessToken, null, recentlyGrantedPermissions, recentlyDeniedPermissions, 2, null);
        kotlin.jvm.internal.t.f(accessToken, "accessToken");
        kotlin.jvm.internal.t.f(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        kotlin.jvm.internal.t.f(recentlyDeniedPermissions, "recentlyDeniedPermissions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            accessToken = loginResult.accessToken;
        }
        if ((i10 & 2) != 0) {
            authenticationToken = loginResult.authenticationToken;
        }
        if ((i10 & 4) != 0) {
            set = loginResult.recentlyGrantedPermissions;
        }
        if ((i10 & 8) != 0) {
            set2 = loginResult.recentlyDeniedPermissions;
        }
        return loginResult.copy(accessToken, authenticationToken, set, set2);
    }

    public final AccessToken component1() {
        return this.accessToken;
    }

    public final AuthenticationToken component2() {
        return this.authenticationToken;
    }

    public final Set<String> component3() {
        return this.recentlyGrantedPermissions;
    }

    public final Set<String> component4() {
        return this.recentlyDeniedPermissions;
    }

    public final LoginResult copy(AccessToken accessToken, AuthenticationToken authenticationToken, Set<String> recentlyGrantedPermissions, Set<String> recentlyDeniedPermissions) {
        kotlin.jvm.internal.t.f(accessToken, "accessToken");
        kotlin.jvm.internal.t.f(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        kotlin.jvm.internal.t.f(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        return new LoginResult(accessToken, authenticationToken, recentlyGrantedPermissions, recentlyDeniedPermissions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResult)) {
            return false;
        }
        LoginResult loginResult = (LoginResult) obj;
        return kotlin.jvm.internal.t.a(this.accessToken, loginResult.accessToken) && kotlin.jvm.internal.t.a(this.authenticationToken, loginResult.authenticationToken) && kotlin.jvm.internal.t.a(this.recentlyGrantedPermissions, loginResult.recentlyGrantedPermissions) && kotlin.jvm.internal.t.a(this.recentlyDeniedPermissions, loginResult.recentlyDeniedPermissions);
    }

    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final AuthenticationToken getAuthenticationToken() {
        return this.authenticationToken;
    }

    public final Set<String> getRecentlyDeniedPermissions() {
        return this.recentlyDeniedPermissions;
    }

    public final Set<String> getRecentlyGrantedPermissions() {
        return this.recentlyGrantedPermissions;
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode() * 31;
        AuthenticationToken authenticationToken = this.authenticationToken;
        return ((((iHashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31) + this.recentlyGrantedPermissions.hashCode()) * 31) + this.recentlyDeniedPermissions.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.accessToken + ", authenticationToken=" + this.authenticationToken + ", recentlyGrantedPermissions=" + this.recentlyGrantedPermissions + ", recentlyDeniedPermissions=" + this.recentlyDeniedPermissions + ')';
    }

    public LoginResult(AccessToken accessToken, AuthenticationToken authenticationToken, Set<String> recentlyGrantedPermissions, Set<String> recentlyDeniedPermissions) {
        kotlin.jvm.internal.t.f(accessToken, "accessToken");
        kotlin.jvm.internal.t.f(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        kotlin.jvm.internal.t.f(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.accessToken = accessToken;
        this.authenticationToken = authenticationToken;
        this.recentlyGrantedPermissions = recentlyGrantedPermissions;
        this.recentlyDeniedPermissions = recentlyDeniedPermissions;
    }

    public /* synthetic */ LoginResult(AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2, int i10, kotlin.jvm.internal.k kVar) {
        this(accessToken, (i10 & 2) != 0 ? null : authenticationToken, set, set2);
    }
}
