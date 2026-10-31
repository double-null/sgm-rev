package kb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.t;
import wb.i0;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21299a = new a();

    /* JADX INFO: renamed from: kb.a$a, reason: collision with other inner class name */
    public static final class PixelCopyOnPixelCopyFinishedListenerC0346a implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f21300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f21301b;

        PixelCopyOnPixelCopyFinishedListenerC0346a(b bVar, Bitmap bitmap) {
            this.f21300a = bVar;
            this.f21301b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f21300a.a(this.f21301b);
            } else {
                this.f21300a.a();
            }
        }
    }

    private a() {
    }

    public final void a(View view, Handler handler, Bitmap.Config config, b screenshotListener) {
        t.f(view, "view");
        t.f(handler, "handler");
        t.f(config, "config");
        t.f(screenshotListener, "screenshotListener");
        if (Build.VERSION.SDK_INT < 26) {
            screenshotListener.a();
            return;
        }
        Window windowJ = i0.j(view);
        if (windowJ == null) {
            screenshotListener.a();
            return;
        }
        Rect rectL = i0.l(view);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rectL.width(), rectL.height(), config);
            t.e(bitmapCreateBitmap, "{\n            Bitmap.cre…ight(), config)\n        }");
            try {
                PixelCopy.request(windowJ, rectL, bitmapCreateBitmap, new PixelCopyOnPixelCopyFinishedListenerC0346a(screenshotListener, bitmapCreateBitmap), handler);
            } catch (Throwable unused) {
                screenshotListener.a();
            }
        } catch (Throwable unused2) {
            screenshotListener.a();
        }
    }
}
