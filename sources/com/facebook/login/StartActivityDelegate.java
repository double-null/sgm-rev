package com.facebook.login;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: StartActivityDelegate.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface StartActivityDelegate {
    Activity getActivityContext();

    void startActivityForResult(Intent intent, int i10);
}
