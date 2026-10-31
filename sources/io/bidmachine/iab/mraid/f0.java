package io.bidmachine.iab.mraid;

import android.net.Uri;
import b2.Bo.yeILL;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i1 f17682a = new i1();

    public Uri b(Uri uri) {
        try {
            return Uri.parse(Uri.decode(uri.getQueryParameter("url")));
        } catch (Exception e10) {
            b0.f("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }

    public v a(Uri uri) {
        try {
            return this.f17682a.a(Uri.decode(uri.getQueryParameter(yeILL.rSxyR)));
        } catch (Exception e10) {
            b0.f("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }
}
