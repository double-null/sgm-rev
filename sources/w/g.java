package w;

import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Pools.kt */
/* JADX INFO: loaded from: classes2.dex */
public class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f27489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27490b;

    public g(int i10) {
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.f27489a = new Object[i10];
    }

    private final boolean c(T t10) {
        int i10 = this.f27490b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f27489a[i11] == t10) {
                return true;
            }
        }
        return false;
    }

    @Override // w.f
    public boolean a(T instance) {
        t.f(instance, "instance");
        if (!(!c(instance))) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        int i10 = this.f27490b;
        Object[] objArr = this.f27489a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f27490b = i10 + 1;
        return true;
    }

    @Override // w.f
    public T b() {
        int i10 = this.f27490b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T t10 = (T) this.f27489a[i11];
        t.d(t10, KBBdKxoAiHo.iHlCIoscpihhpZc);
        this.f27489a[i11] = null;
        this.f27490b--;
        return t10;
    }
}
