package i4;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import g4.m;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: Streams.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k {
    public static g4.l a(m4.a aVar) throws JsonParseException {
        boolean z10;
        try {
            try {
                aVar.L();
                z10 = false;
                try {
                    return TypeAdapters.X.b(aVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return m.f15373a;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (EOFException e11) {
                e = e11;
                z10 = true;
            }
        } catch (MalformedJsonException e12) {
            throw new JsonSyntaxException(e12);
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        } catch (NumberFormatException e14) {
            throw new JsonSyntaxException(e14);
        }
    }

    public static void b(g4.l lVar, m4.c cVar) throws IOException {
        TypeAdapters.X.d(cVar, lVar);
    }
}
