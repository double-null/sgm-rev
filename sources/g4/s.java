package g4;

import com.google.gson.JsonIOException;
import java.io.IOException;

/* JADX INFO: compiled from: TypeAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s<T> {

    /* JADX INFO: compiled from: TypeAdapter.java */
    class a extends s<T> {
        a() {
        }

        @Override // g4.s
        public T b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return (T) s.this.b(aVar);
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        public void d(m4.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.u();
            } else {
                s.this.d(cVar, t10);
            }
        }
    }

    public final s<T> a() {
        return new a();
    }

    public abstract T b(m4.a aVar) throws IOException;

    public final l c(T t10) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            d(bVar, t10);
            return bVar.U();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public abstract void d(m4.c cVar, T t10) throws IOException;
}
