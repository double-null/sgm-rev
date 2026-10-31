package s9;

import io.bidmachine.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends a8.f<o, p, SubtitleDecoderException> implements l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f25323o;

    /* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
    class a extends p {
        a() {
        }

        @Override // a8.e
        public void p() {
            j.this.t(this);
        }
    }

    protected j(String str) {
        super(new o[2], new p[2]);
        this.f25323o = str;
        w(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a8.f
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException k(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a8.f
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException l(o oVar, p pVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) x7.a.e(oVar.f18057d);
            pVar.q(oVar.f18059f, C(byteBuffer.array(), byteBuffer.limit(), z10), oVar.f25339j);
            pVar.f149d = false;
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    protected abstract k C(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a8.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final o i() {
        return new o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a8.f
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final p j() {
        return new a();
    }

    @Override // s9.l
    public void b(long j10) {
    }
}
