package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2381l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAssetPackManagerStatusQueryCallback f12931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f12932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String[] f12933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f12934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f12935e;

    RunnableC2381l(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j10, String[] strArr, int[] iArr, int[] iArr2) {
        this.f12931a = iAssetPackManagerStatusQueryCallback;
        this.f12932b = j10;
        this.f12933c = strArr;
        this.f12934d = iArr;
        this.f12935e = iArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12931a.onStatusResult(this.f12932b, this.f12933c, this.f12934d, this.f12935e);
    }
}
