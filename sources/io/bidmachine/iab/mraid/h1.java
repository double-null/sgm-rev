package io.bidmachine.iab.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends GestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f17689a;

    private static final class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile long f17691b;

        public final long a() {
            return this.f17691b;
        }

        public final boolean b() {
            return this.f17690a;
        }

        public final void c() {
            this.f17690a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e10) {
            kotlin.jvm.internal.t.f(e10, "e");
            this.f17690a = true;
            this.f17691b = System.currentTimeMillis();
            return super.onSingleTapUp(e10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(Context context) {
        this(context, new a());
        kotlin.jvm.internal.t.f(context, "context");
    }

    public final long a() {
        return this.f17689a.a();
    }

    public final boolean b() {
        return this.f17689a.b();
    }

    public final void c() {
        this.f17689a.c();
    }

    private h1(Context context, a aVar) {
        super(context, aVar);
        this.f17689a = aVar;
        setIsLongpressEnabled(false);
    }
}
