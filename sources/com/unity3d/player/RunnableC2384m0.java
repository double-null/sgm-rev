package com.unity3d.player;

import android.content.Context;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.unity3d.player.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2384m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f12941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f12942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f12943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f12944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f12945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f12946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f12947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f12948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f12949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ boolean f12950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ Semaphore f12951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12952m;

    RunnableC2384m0(UnityPlayer unityPlayer, UnityPlayer unityPlayer2, String str, int i10, boolean z10, boolean z11, boolean z12, boolean z13, String str2, int i11, boolean z14, boolean z15, Semaphore semaphore) {
        this.f12952m = unityPlayer;
        this.f12940a = unityPlayer2;
        this.f12941b = str;
        this.f12942c = i10;
        this.f12943d = z10;
        this.f12944e = z11;
        this.f12945f = z12;
        this.f12946g = z13;
        this.f12947h = str2;
        this.f12948i = i11;
        this.f12949j = z14;
        this.f12950k = z15;
        this.f12951l = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                UnityPlayer unityPlayer = this.f12952m;
                if (unityPlayer.mSoftInput != null) {
                    unityPlayer.dismissSoftInput();
                }
                UnityPlayer unityPlayer2 = this.f12952m;
                int iA = SoftInputProvider.a();
                Context context = this.f12952m.mContext;
                UnityPlayer unityPlayer3 = this.f12940a;
                unityPlayer2.mSoftInput = j6.a.a(iA) != 2 ? new C2364c0(context, unityPlayer3) : new X(context, unityPlayer3);
                this.f12952m.mSoftInput.a(this.f12941b, this.f12942c, this.f12943d, this.f12944e, this.f12945f, this.f12946g, this.f12947h, this.f12948i, this.f12949j, this.f12950k);
                S s10 = this.f12952m.mSoftInput;
                s10.f12800f = new C2382l0(this);
                s10.e();
                this.f12952m.nativeReportKeyboardConfigChanged();
            } catch (Exception e10) {
                AbstractC2409z.Log(6, "Exception when opening Softinput " + e10);
            }
        } finally {
            this.f12951l.release();
        }
    }
}
