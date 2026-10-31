package m0;

import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import id.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f<?>> f22041a = new ArrayList();

    public final <T extends c0> void a(pd.c<T> clazz, l<? super a, ? extends T> initializer) {
        t.f(clazz, "clazz");
        t.f(initializer, "initializer");
        this.f22041a.add(new f<>(hd.a.a(clazz), initializer));
    }

    public final d0.b b() {
        f[] fVarArr = (f[]) this.f22041a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
