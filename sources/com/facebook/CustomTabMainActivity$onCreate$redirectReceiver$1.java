package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: CustomTabMainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabMainActivity$onCreate$redirectReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ CustomTabMainActivity this$0;

    CustomTabMainActivity$onCreate$redirectReceiver$1(CustomTabMainActivity customTabMainActivity) {
        this.this$0 = customTabMainActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(intent, "intent");
        Intent intent2 = new Intent(this.this$0, (Class<?>) CustomTabMainActivity.class);
        intent2.setAction(CustomTabMainActivity.REFRESH_ACTION);
        String str = CustomTabMainActivity.EXTRA_URL;
        intent2.putExtra(str, intent.getStringExtra(str));
        intent2.addFlags(603979776);
        this.this$0.startActivity(intent2);
    }
}
