package com.vungle.ads.internal.network.converters;

import fe.u;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.k0;
import kotlinx.serialization.json.v;
import me.c0;
import pd.l;

/* JADX INFO: compiled from: JsonConverter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonConverter<E> implements Converter<c0, E> {
    public static final Companion Companion = new Companion(null);
    private static final b json = v.b(null, JsonConverter$Companion$json$1.INSTANCE, 1, null);
    private final l kType;

    /* JADX INFO: compiled from: JsonConverter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public JsonConverter(l kType) {
        t.f(kType, "kType");
        this.kType = kType;
    }

    @Override // com.vungle.ads.internal.network.converters.Converter
    public E convert(c0 c0Var) throws IOException {
        if (c0Var != null) {
            try {
                InputStream inputStreamByteStream = c0Var.byteStream();
                if (inputStreamByteStream != null) {
                    E e10 = (E) k0.a(json, u.b(b.f21551d.a(), this.kType), inputStreamByteStream);
                    fd.b.a(c0Var, null);
                    return e10;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(c0Var, th);
                    throw th2;
                }
            }
        }
        fd.b.a(c0Var, null);
        return null;
    }
}
