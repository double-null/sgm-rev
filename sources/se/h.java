package se;

import kotlin.jvm.internal.t;
import me.c0;
import me.w;

/* JADX INFO: compiled from: RealResponseBody.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final af.g f25443c;

    public h(String str, long j10, af.g source) {
        t.f(source, "source");
        this.f25441a = str;
        this.f25442b = j10;
        this.f25443c = source;
    }

    @Override // me.c0
    public long contentLength() {
        return this.f25442b;
    }

    @Override // me.c0
    public w contentType() {
        String str = this.f25441a;
        if (str == null) {
            return null;
        }
        return w.f22559e.b(str);
    }

    @Override // me.c0
    public af.g source() {
        return this.f25443c;
    }
}
