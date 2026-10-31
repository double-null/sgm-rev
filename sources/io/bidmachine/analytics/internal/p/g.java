package io.bidmachine.analytics.internal.p;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuffer f17209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f17210c;

    public g(int i10, int i11) {
        this.f17208a = i11;
        this.f17209b = new StringBuffer(i10);
    }

    public final Long a() {
        return this.f17210c;
    }

    public String toString() {
        return this.f17209b.toString();
    }

    public final void a(String str) throws IOException {
        if (this.f17209b.length() + str.length() < this.f17208a) {
            this.f17209b.append((CharSequence) str).append('\n');
            this.f17210c = Long.valueOf(System.currentTimeMillis());
        }
    }
}
