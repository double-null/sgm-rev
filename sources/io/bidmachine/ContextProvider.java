package io.bidmachine;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public interface ContextProvider {
    Activity getActivity();

    Context getApplicationContext();

    Context getContext();
}
