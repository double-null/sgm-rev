package androidx.datastore.core;

import java.io.IOException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CorruptionException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CorruptionException extends IOException {
    public /* synthetic */ CorruptionException(String str, Throwable th, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(String message, Throwable th) {
        super(message, th);
        t.f(message, "message");
    }
}
