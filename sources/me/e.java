package me;

import java.io.IOException;

/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface e extends Cloneable {

    /* JADX INFO: compiled from: Call.kt */
    public interface a {
        e a(z zVar);
    }

    void cancel();

    b0 execute() throws IOException;

    void f(f fVar);

    boolean isCanceled();
}
