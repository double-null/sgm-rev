package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: loaded from: classes.dex */
    class a implements h.c {
        a() {
        }

        @Override // androidx.profileinstaller.h.c
        public void a(int i10, Object obj) {
            h.f3076b.a(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }

        @Override // androidx.profileinstaller.h.c
        public void b(int i10, Object obj) {
            h.f3076b.b(i10, obj);
        }
    }

    static void a(h.c cVar) {
        Process.sendSignal(Process.myPid(), 10);
        cVar.a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        VMRunner.invoke("NeNxkxhgY00pWulG", new Object[]{this, context, intent});
    }
}
