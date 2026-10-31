package com.unity3d.player;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.unity3d.player.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2371g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set f12896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f12900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12902g;

    RunnableC2371g(Set set, String str, int i10, long j10, long j11, int i11, int i12) {
        this.f12896a = set;
        this.f12897b = str;
        this.f12898c = i10;
        this.f12899d = j10;
        this.f12900e = j11;
        this.f12901f = i11;
        this.f12902g = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f12896a.iterator();
        while (it.hasNext()) {
            ((IAssetPackManagerDownloadStatusCallback) it.next()).onStatusUpdate(this.f12897b, this.f12898c, this.f12899d, this.f12900e, this.f12901f, this.f12902g);
        }
    }
}
