package h7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.view.View;
import com.pairip.VMRunner;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final WeakHashMap f15638a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BroadcastReceiver f15639b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final IntentFilter f15640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f15641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f15642e;

    public interface a {
        void a(boolean z10);
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("3DZI5rcdmEfPdwcj", new Object[]{this, context, intent});
        }
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        f15640c = intentFilter;
        f15641d = false;
        f15642e = false;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    private static synchronized void a(Context context) {
        if (!f15641d) {
            synchronized (d.class) {
                if (!f15641d) {
                    f15642e = ((PowerManager) context.getSystemService("power")).isScreenOn();
                    context.getApplicationContext().registerReceiver(f15639b, f15640c);
                    f15641d = true;
                }
            }
        }
    }

    public static void d(View view, a aVar) {
        a(view.getContext());
        WeakHashMap weakHashMap = f15638a;
        synchronized (weakHashMap) {
            weakHashMap.put(view, aVar);
        }
    }

    public static boolean e(Context context) {
        a(context);
        return f15642e;
    }

    public static void f(View view) {
        if (f15641d) {
            WeakHashMap weakHashMap = f15638a;
            synchronized (weakHashMap) {
                weakHashMap.remove(view);
            }
        }
    }
}
