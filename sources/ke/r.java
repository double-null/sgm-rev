package ke;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: compiled from: CharsetReader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f21404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f21405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharsetDecoder f21406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ByteBuffer f21407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private char f21409f;

    public r(InputStream inputStream, Charset charset) {
        kotlin.jvm.internal.t.f(inputStream, "inputStream");
        kotlin.jvm.internal.t.f(charset, "charset");
        this.f21404a = inputStream;
        this.f21405b = charset;
        this.f21406c = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(l.f21375c.d());
        this.f21407d = byteBufferWrap;
        byteBufferWrap.flip();
    }

    private final int a(char[] cArr, int i10, int i11) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i10, i11);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z10 = false;
        while (true) {
            CoderResult coderResultDecode = this.f21406c.decode(this.f21407d, charBufferWrap, z10);
            if (coderResultDecode.isUnderflow()) {
                if (!z10 && charBufferWrap.hasRemaining()) {
                    if (b() < 0) {
                        if (charBufferWrap.position() == 0 && !this.f21407d.hasRemaining()) {
                            z10 = true;
                            break;
                        }
                        this.f21406c.reset();
                        z10 = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z10) {
            this.f21406c.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    private final int b() {
        this.f21407d.compact();
        try {
            int iLimit = this.f21407d.limit();
            int iPosition = this.f21407d.position();
            int i10 = this.f21404a.read(this.f21407d.array(), this.f21407d.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i10 < 0) {
                return i10;
            }
            ByteBuffer byteBuffer = this.f21407d;
            kotlin.jvm.internal.t.d(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(iPosition + i10);
            return this.f21407d.remaining();
        } finally {
            this.f21407d.flip();
        }
    }

    private final int c() {
        if (this.f21408e) {
            this.f21408e = false;
            return this.f21409f;
        }
        char[] cArr = new char[2];
        int iD = d(cArr, 0, 2);
        if (iD == -1) {
            return -1;
        }
        if (iD == 1) {
            return cArr[0];
        }
        if (iD == 2) {
            this.f21409f = cArr[1];
            this.f21408e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + iD).toString());
    }

    public final int d(char[] array, int i10, int i11) {
        kotlin.jvm.internal.t.f(array, "array");
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (!((i10 >= 0 && i10 < array.length) && i11 >= 0 && i10 + i11 <= array.length)) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i10 + ", " + i11 + ", " + array.length).toString());
        }
        if (this.f21408e) {
            array[i10] = this.f21409f;
            i10++;
            i11--;
            this.f21408e = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        }
        if (i11 != 1) {
            return a(array, i10, i11) + i12;
        }
        int iC = c();
        if (iC != -1) {
            array[i10] = (char) iC;
            return i12 + 1;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    public final void e() {
        l lVar = l.f21375c;
        byte[] bArrArray = this.f21407d.array();
        kotlin.jvm.internal.t.e(bArrArray, "array(...)");
        lVar.c(bArrArray);
    }
}
