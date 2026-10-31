package w5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.pairip.VMRunner;
import o5.j;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f27533a = j.UNKNOWN;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("F2UeqPoG5JJkSp8F", new Object[]{this, context, intent});
        }
    }

    public static j a() {
        return w5.a.a() != o5.g.CTV ? j.UNKNOWN : f27533a;
    }

    public static void c(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
