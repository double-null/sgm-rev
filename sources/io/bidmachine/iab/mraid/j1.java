package io.bidmachine.iab.mraid;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
final class j1 {
    j1() {
    }

    String a(String str) {
        try {
            return new Uri.Builder().scheme("calendar").authority("mraid").appendQueryParameter("eventJson", str).build().toString();
        } catch (Exception e10) {
            b0.f("MraidNativeFeatureUrlFactory", e10);
            return null;
        }
    }

    String b(String str) {
        try {
            return new Uri.Builder().scheme("storePicture").authority("mraid").appendQueryParameter("url", str).build().toString();
        } catch (Exception e10) {
            b0.f("MraidNativeFeatureUrlFactory", e10);
            return null;
        }
    }
}
