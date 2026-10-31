package ja;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import android.widget.ImageView;
import io.bidmachine.core.h;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ImageHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: ja.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageHelper.java */
    class C0337a implements c {
        C0337a() {
        }

        @Override // ja.a.c
        public void a(ImageView imageView, Drawable drawable) {
            imageView.setImageDrawable(drawable);
        }

        @Override // ja.a.c
        public void b(String str) {
            io.bidmachine.core.a.c(str);
        }
    }

    /* JADX INFO: compiled from: ImageHelper.java */
    private static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f20741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f20742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<ImageView> f20743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f20744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Drawable f20745e;

        /* JADX INFO: renamed from: ja.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ImageHelper.java */
        class RunnableC0338a implements Runnable {
            RunnableC0338a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ImageView imageView = (ImageView) b.this.f20743c.get();
                if (imageView == null || b.this.f20745e == null) {
                    b.this.f20744d.b("Target ImageView or Bitmap is invalid");
                } else {
                    b.this.f20744d.a(imageView, b.this.f20745e);
                }
            }
        }

        b(Context context, Uri uri, ImageView imageView, c cVar) {
            this.f20742b = context;
            this.f20741a = uri;
            this.f20743c = new WeakReference<>(imageView);
            this.f20744d = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                InputStream inputStreamOpenInputStream = this.f20742b.getContentResolver().openInputStream(this.f20741a);
                try {
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    h.h(inputStreamOpenInputStream);
                    if (options.outWidth != 0 && options.outHeight != 0) {
                        int iC = a.c(this.f20742b);
                        options.inSampleSize = a.a(options, iC, a.b(iC));
                        options.inJustDecodeBounds = false;
                        InputStream inputStreamOpenInputStream2 = this.f20742b.getContentResolver().openInputStream(this.f20741a);
                        try {
                            this.f20745e = new BitmapDrawable(this.f20742b.getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options));
                            h.h(inputStreamOpenInputStream2);
                            h.S(new RunnableC0338a());
                            return;
                        } catch (Throwable th) {
                            h.h(inputStreamOpenInputStream2);
                            throw th;
                        }
                    }
                    this.f20744d.b("Image size is (0;0)");
                } catch (Throwable th2) {
                    h.h(inputStreamOpenInputStream);
                    throw th2;
                }
            } catch (Throwable th3) {
                String message = th3.getMessage();
                c cVar = this.f20744d;
                if (message == null) {
                    message = "ImagePreparation error";
                }
                cVar.b(message);
            }
        }
    }

    /* JADX INFO: compiled from: ImageHelper.java */
    public interface c {
        void a(ImageView imageView, Drawable drawable);

        void b(String str);
    }

    public static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        int i14 = 1;
        while (true) {
            if (i12 / i14 <= i10 && i13 / i14 <= i11) {
                return i14;
            }
            i14 *= 2;
        }
    }

    public static int b(int i10) {
        if (i10 > 700) {
            return 700;
        }
        return i10;
    }

    public static int c(Context context) {
        Size sizeY = h.y(context);
        return Math.min(1200, Math.min(sizeY.getWidth(), sizeY.getHeight()));
    }

    public static void d(Context context, ImageView imageView, Uri uri, Drawable drawable) {
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            e(context, uri, imageView, new C0337a());
        }
    }

    private static void e(Context context, Uri uri, ImageView imageView, c cVar) {
        if (cVar == null) {
            return;
        }
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            cVar.b("ImagePath is invalid");
        } else if (imageView == null) {
            cVar.b("Target ImageView is null");
        } else {
            ja.b.a().execute(new b(context, uri, imageView, cVar));
        }
    }
}
