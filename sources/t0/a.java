package t0;

import androidx.room.h;
import x0.f;

/* JADX INFO: compiled from: EntityInsertionAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> extends d {
    public a(h hVar) {
        super(hVar);
    }

    protected abstract void g(f fVar, T t10);

    public final void h(T t10) {
        f fVarA = a();
        try {
            g(fVarA, t10);
            fVarA.P();
        } finally {
            f(fVarA);
        }
    }
}
