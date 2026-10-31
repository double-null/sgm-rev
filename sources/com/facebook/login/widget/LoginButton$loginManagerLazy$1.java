package com.facebook.login.widget;

import com.facebook.login.LoginManager;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LoginButton.kt */
/* JADX INFO: loaded from: classes3.dex */
final class LoginButton$loginManagerLazy$1 extends u implements id.a<LoginManager> {
    public static final LoginButton$loginManagerLazy$1 INSTANCE = new LoginButton$loginManagerLazy$1();

    LoginButton$loginManagerLazy$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final LoginManager invoke() {
        return LoginManager.Companion.getInstance();
    }
}
