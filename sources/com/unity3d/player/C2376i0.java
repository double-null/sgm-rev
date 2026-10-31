package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.unity3d.player.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2376i0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2369f f12912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UnityPlayer f12913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private K f12914c;

    public C2376i0(Context context, UnityPlayer unityPlayer) {
        int i10;
        super(context);
        this.f12914c = new K(context);
        this.f12913b = unityPlayer;
        C2369f c2369f = new C2369f(context, unityPlayer);
        this.f12912a = c2369f;
        c2369f.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        if (a()) {
            this.f12912a.getHolder().setFormat(-3);
            this.f12912a.setZOrderOnTop(true);
            i10 = 0;
        } else {
            this.f12912a.getHolder().setFormat(-1);
            i10 = -16777216;
        }
        setBackgroundColor(i10);
        this.f12912a.getHolder().addCallback(new SurfaceHolderCallbackC2374h0(this));
        this.f12912a.setFocusable(true);
        this.f12912a.setFocusableInTouchMode(true);
        this.f12912a.setContentDescription(a(context));
        addView(this.f12912a, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private static String a(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName()));
    }

    public final void b() {
        K k10 = this.f12914c;
        UnityPlayer unityPlayer = this.f12913b;
        J j10 = k10.f12745b;
        if (j10 != null && j10.getParent() != null) {
            unityPlayer.removeView(k10.f12745b);
        }
        this.f12914c.f12745b = null;
    }

    public final boolean c() {
        C2369f c2369f = this.f12912a;
        return c2369f != null && c2369f.a();
    }

    final void a(float f10) {
        this.f12912a.a(f10);
    }

    private static boolean a() {
        Activity activity = UnityPlayer.currentActivity;
        if (activity == null) {
            return false;
        }
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowIsTranslucent});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }
}
