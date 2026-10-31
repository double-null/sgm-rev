package d5;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f13321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f13322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f13323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d5.a f13324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f13325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f13326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f13327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f13328h;

    class a implements Runnable {

        /* JADX INFO: renamed from: d5.d$a$a, reason: collision with other inner class name */
        class RunnableC0175a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f13330a;

            RunnableC0175a(float f10) {
                this.f13330a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f13325e.a(this.f13330a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f13327g.set(false);
            if (((Float) d.this.f13326f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f13321a.post(new RunnableC0175a(fA));
            }
        }
    }

    public d(Handler handler, Context context, d5.a aVar, c cVar) {
        super(handler);
        this.f13326f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f13327g = new AtomicBoolean(false);
        this.f13328h = Executors.newSingleThreadExecutor();
        this.f13321a = handler;
        this.f13322b = context;
        this.f13323c = (AudioManager) context.getSystemService("audio");
        this.f13324d = aVar;
        this.f13325e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f13324d.a(this.f13323c.getStreamVolume(3), this.f13323c.getStreamMaxVolume(3));
    }

    private void h() {
        this.f13328h.submit(new a());
    }

    public void d() {
        h();
        this.f13322b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void f() {
        this.f13322b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f13327g.getAndSet(true)) {
            return;
        }
        h();
    }
}
