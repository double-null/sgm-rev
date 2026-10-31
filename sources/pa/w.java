package pa;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class w {

    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wb.i f23854a;

        a(wb.i iVar) {
            this.f23854a = iVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.t.f(context, "context");
            kotlin.jvm.internal.t.f(intent, "intent");
            context.unregisterReceiver(this);
            qb.h.f(Boolean.TRUE, this.f23854a);
        }
    }

    private final long a(Context context, Uri uri) {
        DownloadManager downloadManagerL = wb.d0.l(context);
        if (downloadManagerL != null) {
            return downloadManagerL.enqueue(new DownloadManager.Request(uri).setNotificationVisibility(1));
        }
        return -1L;
    }

    public final void b(Context context, Uri uri, wb.i iVar) {
        long jA;
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(uri, "uri");
        Context applicationContext = context.getApplicationContext();
        try {
            kotlin.jvm.internal.t.e(applicationContext, "applicationContext");
            jA = a(applicationContext, uri);
        } catch (Exception e10) {
            t.i(e10);
            jA = -1;
        }
        if (jA == -1) {
            qb.h.f(Boolean.FALSE, iVar);
            return;
        }
        a aVar = new a(iVar);
        kotlin.jvm.internal.t.e(applicationContext, "applicationContext");
        wb.d0.A(aVar, applicationContext, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }
}
