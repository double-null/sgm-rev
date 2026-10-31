package wb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: InlineInstallsHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27708a = new a(null);

    /* JADX INFO: compiled from: InlineInstallsHandler.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public final boolean a(Context context, Uri uri) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(uri, "uri");
        try {
            Intent intentN = p.n(uri, false);
            intentN.setPackage("com.android.vending");
            intentN.putExtra("overlay", true);
            intentN.putExtra("callerId", context.getPackageName());
            if (intentN.resolveActivity(context.getPackageManager()) == null) {
                wc.g0 g0Var = wc.g0.f27756a;
                return false;
            }
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intentN, 0);
            } else {
                context.startActivity(intentN);
            }
            return true;
        } catch (Throwable unused) {
        }
    }
}
