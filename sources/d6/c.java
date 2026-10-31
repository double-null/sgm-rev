package d6;

import android.content.Context;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b6.a f13338a = new b6.a("com.linecorp.linesdk.sharedpreference.encryptionsalt");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f13339b = false;

    private static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f13340a;

        a(Context context) {
            this.f13340a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.f13338a.b(this.f13340a);
        }
    }

    public static b6.a a() {
        return f13338a;
    }

    public static void b(Context context) {
        if (f13339b) {
            return;
        }
        f13339b = true;
        Executors.newSingleThreadExecutor().execute(new a(context.getApplicationContext()));
    }
}
