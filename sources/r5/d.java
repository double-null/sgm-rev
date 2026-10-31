package r5;

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
    private final Handler f24897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f24899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r5.a f24900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f24901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f24902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f24903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f24904h;

    class a implements Runnable {

        /* JADX INFO: renamed from: r5.d$a$a, reason: collision with other inner class name */
        class RunnableC0405a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f24906a;

            RunnableC0405a(float f10) {
                this.f24906a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f24901e.a(this.f24906a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f24903g.set(false);
            if (((Float) d.this.f24902f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f24897a.post(new RunnableC0405a(fA));
            }
        }
    }

    public d(Handler handler, Context context, r5.a aVar, c cVar) {
        super(handler);
        this.f24902f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f24903g = new AtomicBoolean(false);
        this.f24904h = Executors.newSingleThreadExecutor();
        this.f24897a = handler;
        this.f24898b = context;
        this.f24899c = (AudioManager) context.getSystemService("audio");
        this.f24900d = aVar;
        this.f24901e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f24900d.a(this.f24899c.getStreamVolume(3), this.f24899c.getStreamMaxVolume(3));
    }

    private void h() {
        this.f24904h.submit(new a());
    }

    public void d() {
        h();
        this.f24898b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void f() {
        this.f24898b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f24903g.getAndSet(true)) {
            return;
        }
        h();
    }
}
