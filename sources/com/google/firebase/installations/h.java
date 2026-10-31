package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f12274b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f12275c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static h f12276d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y3.a f12277a;

    private h(y3.a aVar) {
        this.f12277a = aVar;
    }

    public static h c() {
        return d(y3.b.a());
    }

    public static h d(y3.a aVar) {
        if (f12276d == null) {
            f12276d = new h(aVar);
        }
        return f12276d;
    }

    static boolean g(String str) {
        return f12275c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f12277a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(w3.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f12274b;
    }
}
