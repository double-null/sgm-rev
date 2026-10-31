package j8;

import a8.f;
import android.graphics.Bitmap;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.i2;
import io.bidmachine.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;
import u7.q;
import u7.w;
import x7.l0;

/* JADX INFO: compiled from: BitmapFactoryImageDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends f<DecoderInputBuffer, d, ImageDecoderException> implements j8.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f20676o;

    /* JADX INFO: renamed from: j8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BitmapFactoryImageDecoder.java */
    class C0336a extends d {
        C0336a() {
        }

        @Override // a8.e
        public void p() {
            a.this.t(this);
        }
    }

    /* JADX INFO: compiled from: BitmapFactoryImageDecoder.java */
    public interface b {
        Bitmap a(byte[] bArr, int i10) throws ImageDecoderException;
    }

    /* JADX INFO: compiled from: BitmapFactoryImageDecoder.java */
    public static final class c implements j8.c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f20678b = new b() { // from class: j8.b
            @Override // j8.a.b
            public final Bitmap a(byte[] bArr, int i10) {
                return a.x(bArr, i10);
            }
        };

        @Override // j8.c.a
        public int a(q qVar) {
            String str = qVar.f26252o;
            if (str == null || !w.q(str)) {
                return i2.v(0);
            }
            return l0.E0(qVar.f26252o) ? i2.v(4) : i2.v(1);
        }

        @Override // j8.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a(this.f20678b, null);
        }
    }

    /* synthetic */ a(b bVar, C0336a c0336a) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap B(byte[] bArr, int i10) throws ImageDecoderException {
        try {
            return z7.b.a(bArr, i10, null, -1);
        } catch (ParserException e10) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new ImageDecoderException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bitmap x(byte[] bArr, int i10) throws ImageDecoderException {
        return B(bArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a8.f
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException k(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a8.f
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException l(DecoderInputBuffer decoderInputBuffer, d dVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) x7.a.e(decoderInputBuffer.f18057d);
            x7.a.g(byteBuffer.hasArray());
            x7.a.a(byteBuffer.arrayOffset() == 0);
            dVar.f20680e = this.f20676o.a(byteBuffer.array(), byteBuffer.remaining());
            dVar.f147b = decoderInputBuffer.f18059f;
            return null;
        } catch (ImageDecoderException e10) {
            return e10;
        }
    }

    @Override // a8.f, a8.d
    public /* bridge */ /* synthetic */ d a() throws ImageDecoderException {
        return (d) super.a();
    }

    @Override // a8.f
    protected DecoderInputBuffer i() {
        return new DecoderInputBuffer(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a8.f
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public d j() {
        return new C0336a();
    }

    private a(b bVar) {
        super(new DecoderInputBuffer[1], new d[1]);
        this.f20676o = bVar;
    }
}
