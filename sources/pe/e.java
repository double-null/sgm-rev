package pe;

import af.a0;
import af.j;
import id.l;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: FaultHidingSink.kt */
/* JADX INFO: loaded from: classes5.dex */
public class e extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<IOException, g0> f24344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(a0 delegate, l<? super IOException, g0> onException) {
        super(delegate);
        t.f(delegate, "delegate");
        t.f(onException, "onException");
        this.f24344b = onException;
    }

    @Override // af.j, af.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f24345c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f24345c = true;
            this.f24344b.invoke(e10);
        }
    }

    @Override // af.j, af.a0, java.io.Flushable
    public void flush() {
        if (this.f24345c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f24345c = true;
            this.f24344b.invoke(e10);
        }
    }

    @Override // af.j, af.a0
    public void y(af.e source, long j10) throws EOFException {
        t.f(source, "source");
        if (this.f24345c) {
            source.skip(j10);
            return;
        }
        try {
            super.y(source, j10);
        } catch (IOException e10) {
            this.f24345c = true;
            this.f24344b.invoke(e10);
        }
    }
}
