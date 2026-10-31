package com.facebook.bolts;

import android.net.Uri;

/* JADX INFO: compiled from: AppLinkResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public interface AppLinkResolver {
    Task<AppLink> getAppLinkFromUrlInBackground(Uri uri);
}
