package com.iab.omid.library.applovin.devicevolume;

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
    private final Handler f12541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f12543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.a f12544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f12545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f12546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f12547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f12548h;

    class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.applovin.devicevolume.d$a$a, reason: collision with other inner class name */
        class RunnableC0160a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f12550a;

            RunnableC0160a(float f10) {
                this.f12550a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f12545e.a(this.f12550a);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f12547g.set(false);
            if (((Float) d.this.f12546f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f12541a.post(new RunnableC0160a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.applovin.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f12546f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f12547g = new AtomicBoolean(false);
        this.f12548h = Executors.newSingleThreadExecutor();
        this.f12541a = handler;
        this.f12542b = context;
        this.f12543c = (AudioManager) context.getSystemService("audio");
        this.f12544d = aVar;
        this.f12545e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f12544d.a(this.f12543c.getStreamVolume(3), this.f12543c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f12547g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f12548h.submit(new a());
    }

    public void b() {
        d();
        this.f12542b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f12542b.getContentResolver().unregisterContentObserver(this);
    }
}
