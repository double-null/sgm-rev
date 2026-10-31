package z4;

import android.content.Context;
import android.webkit.WebSettings;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import e5.g;
import e5.i;
import e5.k;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28943a;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f28944a;

        a(d dVar, Context context) {
            this.f28944a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebSettings.getDefaultUserAgent(this.f28944a);
        }
    }

    private void f(Context context) {
        Executors.newSingleThreadExecutor().execute(new a(this, context));
    }

    void a(Context context) {
        c(context);
        if (d()) {
            return;
        }
        b(true);
        i.d().b(context);
        e5.b.k().a(context);
        i5.a.b(context);
        i5.c.d(context);
        i5.e.c(context);
        g.c().b(context);
        e5.a.a().b(context);
        k.f().b(context);
        f(context);
    }

    void b(boolean z10) {
        this.f28943a = z10;
    }

    boolean d() {
        return this.f28943a;
    }

    void e() {
        i5.g.a();
        e5.a.a().e();
    }

    private void c(Context context) {
        i5.g.d(context, vgmm.FxyzHG);
    }
}
