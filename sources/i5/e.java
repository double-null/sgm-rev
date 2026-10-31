package i5;

import a5.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static k f15991a = k.UNKNOWN;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("Hft2fe0VRbf2lHba", new Object[]{this, context, intent});
        }
    }

    public static k a() {
        return i5.a.a() != a5.g.CTV ? k.UNKNOWN : f15991a;
    }

    public static void c(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
