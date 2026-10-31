package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import b2.Bo.yeILL;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final com.linecorp.linesdk.auth.internal.b f12667b = new com.linecorp.linesdk.auth.internal.b(6, 9, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final d f12668a;

    /* JADX INFO: renamed from: com.linecorp.linesdk.auth.internal.a$a, reason: collision with other inner class name */
    static class C0166a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f12669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f12670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f12671c;

        C0166a(Intent intent, Bundle bundle, boolean z10) {
            this.f12669a = intent;
            this.f12670b = bundle;
            this.f12671c = z10;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f12672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f12673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f12674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f12675d;

        b(Intent intent, Bundle bundle, String str, boolean z10) {
            this.f12672a = intent;
            this.f12673b = bundle;
            this.f12674c = str;
            this.f12675d = z10;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f12676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f12677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f12678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f12679d;

        c(String str, String str2, String str3, String str4) {
            this.f12676a = str;
            this.f12677b = str2;
            this.f12678c = str3;
            this.f12679d = str4;
        }

        static c a(String str) {
            return new c(null, null, null, str);
        }

        final boolean b() {
            return !TextUtils.isEmpty(this.f12676a);
        }

        final boolean c() {
            return TextUtils.isEmpty(this.f12679d) && !b();
        }

        final c6.b d() {
            if (!c()) {
                return new c6.b(this.f12679d);
            }
            try {
                return new c6.b(new JSONObject().putOpt("error", this.f12677b).putOpt(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION, this.f12678c).toString());
            } catch (JSONException e10) {
                return new c6.b(e10);
            }
        }
    }

    a(d dVar) {
        this.f12668a = dVar;
    }

    static List<Intent> a(Uri uri, Collection<ResolveInfo> collection, Bundle bundle) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ResolveInfo resolveInfo : collection) {
            Intent intent = new Intent(yeILL.mqfCMCMJt);
            intent.setData(uri);
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            arrayList.add(intent);
        }
        return arrayList;
    }
}
