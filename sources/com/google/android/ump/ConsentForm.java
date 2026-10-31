package com.google.android.ump;

import android.app.Activity;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes.dex */
public interface ConsentForm {

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(FormError formError);
    }

    void show(Activity activity, OnConsentFormDismissedListener onConsentFormDismissedListener);
}
