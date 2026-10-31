package me;

import java.io.IOException;

/* JADX INFO: compiled from: Interceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface v {

    /* JADX INFO: compiled from: Interceptor.kt */
    public interface a {
        b0 a(z zVar) throws IOException;

        e call();

        z request();
    }

    b0 intercept(a aVar) throws IOException;
}
