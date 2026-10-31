package y4;

/* JADX INFO: compiled from: QRCode.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x4.b f28657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x4.a f28658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x4.c f28659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28660d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f28661e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f28661e;
    }

    public void c(x4.a aVar) {
        this.f28658b = aVar;
    }

    public void d(int i10) {
        this.f28660d = i10;
    }

    public void e(b bVar) {
        this.f28661e = bVar;
    }

    public void f(x4.b bVar) {
        this.f28657a = bVar;
    }

    public void g(x4.c cVar) {
        this.f28659c = cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f28657a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f28658b);
        sb2.append("\n version: ");
        sb2.append(this.f28659c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f28660d);
        if (this.f28661e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f28661e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
