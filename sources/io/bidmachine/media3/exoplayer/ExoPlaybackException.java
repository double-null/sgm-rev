package io.bidmachine.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import io.bidmachine.media3.common.PlaybackException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f18066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u7.q f18068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.bidmachine.media3.exoplayer.source.r.b f18070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f18071p;

    private ExoPlaybackException(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    public static ExoPlaybackException c(Throwable th, String str, int i10, u7.q qVar, int i11, boolean z10, int i12) {
        return new ExoPlaybackException(1, th, null, i12, str, i10, qVar, qVar == null ? 4 : i11, z10);
    }

    public static ExoPlaybackException e(IOException iOException, int i10) {
        return new ExoPlaybackException(0, iOException, i10);
    }

    public static ExoPlaybackException f(RuntimeException runtimeException, int i10) {
        return new ExoPlaybackException(2, runtimeException, i10);
    }

    private static String g(int i10, String str, String str2, int i11, u7.q qVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + qVar + ", format_supported=" + x7.l0.d0(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    ExoPlaybackException b(io.bidmachine.media3.exoplayer.source.r.b bVar) {
        return new ExoPlaybackException((String) x7.l0.i(getMessage()), getCause(), this.f17926a, this.f18065j, this.f18066k, this.f18067l, this.f18068m, this.f18069n, bVar, this.f17927b, this.f18071p);
    }

    private ExoPlaybackException(int i10, Throwable th, String str, int i11, String str2, int i12, u7.q qVar, int i13, boolean z10) {
        this(g(i10, str, str2, i12, qVar, i13), th, i11, i10, str2, i12, qVar, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private ExoPlaybackException(String str, Throwable th, int i10, int i11, String str2, int i12, u7.q qVar, int i13, io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, boolean z10) {
        super(str, th, i10, Bundle.EMPTY, j10);
        x7.a.a(!z10 || i11 == 1);
        x7.a.a(th != null || i11 == 3);
        this.f18065j = i11;
        this.f18066k = str2;
        this.f18067l = i12;
        this.f18068m = qVar;
        this.f18069n = i13;
        this.f18070o = bVar;
        this.f18071p = z10;
    }
}
