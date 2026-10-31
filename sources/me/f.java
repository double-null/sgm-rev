package me;

import java.io.IOException;

/* JADX INFO: compiled from: Callback.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface f {
    void onFailure(e eVar, IOException iOException);

    void onResponse(e eVar, b0 b0Var) throws IOException;
}
