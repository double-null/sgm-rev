package io.bidmachine.media3.common;

import android.os.Bundle;
import x7.l0;

/* JADX INFO: loaded from: classes4.dex */
public class PlaybackException extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f17920d = l0.C0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f17921e = l0.C0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f17922f = l0.C0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f17923g = l0.C0(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f17924h = l0.C0(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f17925i = l0.C0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f17928c;

    protected PlaybackException(String str, Throwable th, int i10, Bundle bundle, long j10) {
        super(str, th);
        this.f17926a = i10;
        this.f17928c = bundle;
        this.f17927b = j10;
    }
}
