package f0;

import androidx.datastore.core.CorruptionException;
import e0.g;
import id.l;
import java.io.IOException;
import kotlin.jvm.internal.t;
import zc.f;

/* JADX INFO: compiled from: ReplaceFileCorruptionHandler.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l<CorruptionException, T> f14532a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super CorruptionException, ? extends T> produceNewData) {
        t.f(produceNewData, "produceNewData");
        this.f14532a = produceNewData;
    }

    @Override // e0.g
    public Object a(CorruptionException corruptionException, f<? super T> fVar) throws IOException {
        return this.f14532a.invoke(corruptionException);
    }
}
