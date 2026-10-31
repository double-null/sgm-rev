package com.facebook.bolts;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CancellationToken.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CancellationToken {
    private final CancellationTokenSource tokenSource;

    public CancellationToken(CancellationTokenSource tokenSource) {
        t.f(tokenSource, "tokenSource");
        this.tokenSource = tokenSource;
    }

    public final boolean isCancellationRequested() {
        return this.tokenSource.isCancellationRequested();
    }

    public final CancellationTokenRegistration register(Runnable runnable) {
        return this.tokenSource.register$facebook_bolts_release(runnable);
    }

    public final void throwIfCancellationRequested() throws CancellationException {
        this.tokenSource.throwIfCancellationRequested$facebook_bolts_release();
    }

    public String toString() {
        l0 l0Var = l0.f21527a;
        String str = String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{CancellationToken.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(this.tokenSource.isCancellationRequested())}, 3));
        t.e(str, "format(locale, format, *args)");
        return str;
    }
}
