package e0;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: Serializer.kt */
/* JADX INFO: loaded from: classes.dex */
public interface g0<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, zc.f<? super T> fVar);

    Object writeTo(T t10, OutputStream outputStream, zc.f<? super wc.g0> fVar);
}
