package com.unity3d.player;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: com.unity3d.player.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC2363c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f12874a = {android.R.attr.progressBarStyleLarge, android.R.attr.progressBarStyleLargeInverse, android.R.attr.progressBarStyleSmall, android.R.attr.progressBarStyleSmallInverse};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ProgressBar f12875b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static View f12876c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f12877d = -1;

    public static void a() {
        ProgressBar progressBar = f12875b;
        if (progressBar != null) {
            if (progressBar != null && f12876c != null) {
                ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(f12875b);
                    viewGroup.removeView(f12876c);
                }
                f12875b = null;
                f12876c = null;
            }
            f12877d = -1;
        }
    }

    public static void a(Activity activity, UnityPlayer unityPlayer, int i10) {
        if (i10 >= 0) {
            int[] iArr = f12874a;
            if (i10 >= 4) {
                return;
            }
            if (unityPlayer == null) {
                throw new IllegalArgumentException("ViewGroup cannot be null.");
            }
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            if (f12875b != null) {
                if (f12877d == i10) {
                    return;
                } else {
                    a();
                }
            }
            f12877d = i10;
            ProgressBar progressBar = new ProgressBar(activity, null, iArr[i10]);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            progressBar.setLayoutParams(layoutParams);
            progressBar.setBackground(new ColorDrawable(0));
            progressBar.setIndeterminate(true);
            f12875b = progressBar;
            View view = new View(activity);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(0);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setOnTouchListener(new ViewOnTouchListenerC2359a());
            view.setOnKeyListener(new ViewOnKeyListenerC2361b());
            f12876c = view;
            unityPlayer.addView(view);
            unityPlayer.addView(f12875b);
        }
    }
}
