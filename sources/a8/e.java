package a8;

/* JADX INFO: compiled from: DecoderOutputBuffer.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends a8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f149d;

    /* JADX INFO: compiled from: DecoderOutputBuffer.java */
    public interface a<S extends e> {
        void a(S s10);
    }

    @Override // a8.a
    public void g() {
        super.g();
        this.f147b = 0L;
        this.f148c = 0;
        this.f149d = false;
    }

    public abstract void p();
}
