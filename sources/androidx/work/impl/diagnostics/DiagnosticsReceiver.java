package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.l;
import androidx.work.n;
import androidx.work.v;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3738a = l.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        l.c().a(f3738a, "Requesting diagnostics", new Throwable[0]);
        try {
            v.d(context).b(n.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            l.c().b(f3738a, "WorkManager is not initialized", e10);
        }
    }
}
