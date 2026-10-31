package fd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes5.dex */
public class h extends g {
    public static final ByteBuffer c(int i10, CharsetEncoder encoder) {
        t.f(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        t.e(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final CharsetEncoder d(Charset charset) {
        t.f(charset, "<this>");
        return charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }

    public static final String e(File file, Charset charset) throws IOException {
        t.f(file, "<this>");
        t.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strD = l.d(inputStreamReader);
            b.a(inputStreamReader, null);
            return strD;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ String f(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = rd.d.f24999b;
        }
        return e(file, charset);
    }

    public static void g(File file, String text, Charset charset) throws IOException {
        t.f(file, "<this>");
        t.f(text, "text");
        t.f(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            i(fileOutputStream, text, charset);
            g0 g0Var = g0.f27756a;
            b.a(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void h(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = rd.d.f24999b;
        }
        g(file, str, charset);
    }

    public static final void i(OutputStream outputStream, String text, Charset charset) throws IOException {
        t.f(outputStream, "<this>");
        t.f(text, "text");
        t.f(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            t.e(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderD = d(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        t.c(charsetEncoderD);
        ByteBuffer byteBufferC = c(8192, charsetEncoderD);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            t.e(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderD.encode(charBufferAllocate, byteBufferC, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferC.array(), 0, byteBufferC.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferC.clear();
            i10 = i12;
        }
    }
}
