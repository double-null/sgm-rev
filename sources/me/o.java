package me;

import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Credentials.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f22514a = new o();

    private o() {
    }

    public static final String a(String username, String password, Charset charset) {
        kotlin.jvm.internal.t.f(username, "username");
        kotlin.jvm.internal.t.f(password, "password");
        kotlin.jvm.internal.t.f(charset, "charset");
        return kotlin.jvm.internal.t.n(KBBdKxoAiHo.ZNqSSN, af.h.f361d.c(username + ':' + password, charset).b());
    }
}
