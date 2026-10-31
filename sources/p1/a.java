package p1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: AppLinks.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static Bundle a(Intent intent) {
        return intent.getBundleExtra("al_applink_data");
    }

    public static Uri b(Context context, Intent intent) {
        String string;
        Bundle bundleA = a(intent);
        if (bundleA == null || (string = bundleA.getString("target_url")) == null) {
            return null;
        }
        b.d(context, "al_nav_in", intent, null);
        return Uri.parse(string);
    }
}
