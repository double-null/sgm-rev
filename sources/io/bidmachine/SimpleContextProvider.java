package io.bidmachine;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: SimpleContextProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SimpleContextProvider implements ContextProvider {
    private final Context applicationContext;

    public SimpleContextProvider(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // io.bidmachine.ContextProvider
    public Activity getActivity() {
        return f1.a();
    }

    @Override // io.bidmachine.ContextProvider
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // io.bidmachine.ContextProvider
    public Context getContext() {
        return this.applicationContext;
    }
}
