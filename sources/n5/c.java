package n5;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Executors;
import s5.i;
import s5.k;
import w5.d;
import w5.e;
import w5.g;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22738a;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f22739a;

        a(c cVar, Context context) {
            this.f22739a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebSettings.getDefaultUserAgent(this.f22739a);
            } catch (Throwable unused) {
                d.a("Ignoring failure while retrieving default WebView user agent");
            }
        }
    }

    private void c(Context context) {
        g.b(context, "Application Context cannot be null");
    }

    private void e(Context context) {
        Executors.newSingleThreadExecutor().execute(new a(this, context));
    }

    void a(Context context) {
        c(context);
        if (d()) {
            return;
        }
        b(true);
        i.d().b(context);
        s5.b.k().a(context);
        w5.a.b(context);
        w5.c.d(context);
        e.c(context);
        s5.g.c().b(context);
        s5.a.a().b(context);
        k.f().b(context);
        e(context);
    }

    void b(boolean z10) {
        this.f22738a = z10;
    }

    boolean d() {
        return this.f22738a;
    }
}
