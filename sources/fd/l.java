package fd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.t;
import qd.n;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {
    public static final long a(Reader reader, Writer out, int i10) throws IOException {
        t.f(reader, "<this>");
        t.f(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final qd.g<String> c(BufferedReader bufferedReader) {
        t.f(bufferedReader, "<this>");
        return n.e(new k(bufferedReader));
    }

    public static final String d(Reader reader) {
        t.f(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        t.e(string, "toString(...)");
        return string;
    }
}
