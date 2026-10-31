package i9;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u7.v;

/* JADX INFO: compiled from: IcyDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends e9.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f16105c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f16106a = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f16107b = StandardCharsets.ISO_8859_1.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            String string = this.f16106a.decode(byteBuffer).toString();
            this.f16106a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f16106a.reset();
            byteBuffer.rewind();
            try {
                return this.f16107b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f16107b.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th) {
            this.f16106a.reset();
            byteBuffer.rewind();
            throw th;
        }
    }

    @Override // e9.c
    protected v b(e9.b bVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new v(new c(bArr, null, null));
        }
        Matcher matcher = f16105c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = com.google.common.base.c.e(strGroup);
                strE.hashCode();
                if (strE.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strE.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new v(new c(bArr, str, str2));
    }
}
