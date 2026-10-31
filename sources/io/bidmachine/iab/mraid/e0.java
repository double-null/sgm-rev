package io.bidmachine.iab.mraid;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f17676a;

    e0(d0 d0Var) {
        this.f17676a = d0Var;
    }

    boolean a(String str) {
        if (str == null) {
            return true;
        }
        if (str.startsWith("sms")) {
            return this.f17676a.d();
        }
        if (str.startsWith("tel")) {
            return this.f17676a.f();
        }
        if (str.startsWith("calendar")) {
            return this.f17676a.b();
        }
        if (str.startsWith("storePicture")) {
            return this.f17676a.e();
        }
        return true;
    }
}
