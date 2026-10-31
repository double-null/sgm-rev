package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
final class T0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ U0 f12813a;

    T0(U0 u10) {
        this.f12813a = u10;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e1 A[PHI: r7
      0x00e1: PHI (r7v11 com.unity3d.player.U0) = (r7v7 com.unity3d.player.U0), (r7v14 com.unity3d.player.U0) binds: [B:58:0x00df, B:47:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        U0 u10;
        if (message.what != 2269) {
            return false;
        }
        S0 s10 = (S0) message.obj;
        S0 s11 = S0.f12809h;
        if (s10 == s11) {
            U0 u11 = this.f12813a;
            u11.f12823e--;
            u11.f12827i.executeGLThreadJobs();
            U0 u12 = this.f12813a;
            if (!u12.f12820b) {
                return true;
            }
            if (u12.f12827i.getHaveAndroidWindowSupport() && !this.f12813a.f12821c) {
                return true;
            }
            U0 u13 = this.f12813a;
            int i10 = u13.f12826h;
            if (i10 >= 0) {
                if (i10 == 0) {
                    if (u13.f12827i.getSplashEnabled()) {
                        this.f12813a.f12827i.DisableStaticSplashScreen();
                    }
                    UnityPlayer unityPlayer = this.f12813a.f12827i;
                    if (unityPlayer.mActivity != null && unityPlayer.getAutoReportFullyDrawnEnabled()) {
                        this.f12813a.f12827i.mActivity.reportFullyDrawn();
                    }
                }
                this.f12813a.f12826h--;
            }
            if (!this.f12813a.f12827i.isFinishing() && !this.f12813a.f12827i.nativeRender()) {
                this.f12813a.f12827i.finish();
            }
        } else if (s10 == S0.f12804c) {
            Looper.myLooper().quit();
        } else if (s10 == S0.f12803b) {
            this.f12813a.f12820b = true;
        } else if (s10 == S0.f12802a) {
            this.f12813a.f12820b = false;
        } else if (s10 == S0.f12805d) {
            this.f12813a.f12821c = false;
        } else if (s10 == S0.f12806e) {
            u10 = this.f12813a;
            u10.f12821c = true;
            if (u10.f12822d == 3) {
                u10.f12827i.nativeFocusChanged(true);
                this.f12813a.f12822d = 1;
            }
        } else if (s10 == S0.f12807f) {
            U0 u14 = this.f12813a;
            if (u14.f12822d == 1) {
                u14.f12827i.nativeFocusChanged(false);
            }
            this.f12813a.f12822d = 2;
        } else if (s10 == S0.f12808g) {
            u10 = this.f12813a;
            u10.f12822d = 3;
            if (u10.f12821c) {
                u10.f12827i.nativeFocusChanged(true);
                this.f12813a.f12822d = 1;
            }
        } else if (s10 == S0.f12810i) {
            UnityPlayer unityPlayer2 = this.f12813a.f12827i;
            unityPlayer2.nativeSetLaunchURL(unityPlayer2.getLaunchURL());
        } else if (s10 == S0.f12811j) {
            U0 u15 = this.f12813a;
            u15.f12827i.nativeOrientationChanged(u15.f12824f, u15.f12825g);
        }
        U0 u16 = this.f12813a;
        if (u16.f12820b && u16.f12823e <= 0) {
            Message.obtain(u16.f12819a, 2269, s11).sendToTarget();
            this.f12813a.f12823e++;
        }
        return true;
    }
}
