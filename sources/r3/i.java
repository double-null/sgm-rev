package r3;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* JADX INFO: compiled from: ProtobufValueEncoderContext.java */
/* JADX INFO: loaded from: classes4.dex */
class i implements o3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24893a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24894b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o3.b f24895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f24896d;

    i(f fVar) {
        this.f24896d = fVar;
    }

    private void a() {
        if (this.f24893a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f24893a = true;
    }

    void b(o3.b bVar, boolean z10) {
        this.f24893a = false;
        this.f24895c = bVar;
        this.f24894b = z10;
    }

    @Override // o3.f
    public o3.f e(String str) throws IOException {
        a();
        this.f24896d.i(this.f24895c, str, this.f24894b);
        return this;
    }

    @Override // o3.f
    public o3.f g(boolean z10) throws IOException {
        a();
        this.f24896d.o(this.f24895c, z10, this.f24894b);
        return this;
    }
}
