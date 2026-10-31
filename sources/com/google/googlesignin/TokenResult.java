package com.google.googlesignin;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class TokenResult implements Result {
    private GoogleSignInAccount account;
    private long handle;
    private Status status;

    TokenResult() {
        this.status = new Status(4);
        this.account = null;
    }

    public GoogleSignInAccount getAccount() {
        return this.account;
    }

    public long getHandle() {
        return this.handle;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.status;
    }

    public void setHandle(long j10) {
        this.handle = j10;
    }

    public void setStatus(int i10) {
        this.status = new Status(i10);
    }

    public String toString() {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[2];
        objArr[0] = this.status;
        Object obj = this.account;
        if (obj == null) {
            obj = "<null>";
        }
        objArr[1] = obj;
        return String.format(locale, "Status: %s %s", objArr);
    }

    TokenResult(GoogleSignInAccount googleSignInAccount, int i10) {
        this.status = new Status(i10);
        this.account = googleSignInAccount;
    }
}
