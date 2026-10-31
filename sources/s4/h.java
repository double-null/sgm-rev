package s4;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: EncoderContext.java */
/* JADX INFO: loaded from: classes4.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f25211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.zxing.b f25212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.zxing.b f25213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final StringBuilder f25214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f25215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f25217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25218i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f25210a = sb2.toString();
        this.f25211b = l.FORCE_NONE;
        this.f25214e = new StringBuilder(str.length());
        this.f25216g = -1;
    }

    private int h() {
        return this.f25210a.length() - this.f25218i;
    }

    public int a() {
        return this.f25214e.length();
    }

    public StringBuilder b() {
        return this.f25214e;
    }

    public char c() {
        return this.f25210a.charAt(this.f25215f);
    }

    public String d() {
        return this.f25210a;
    }

    public int e() {
        return this.f25216g;
    }

    public int f() {
        return h() - this.f25215f;
    }

    public k g() {
        return this.f25217h;
    }

    public boolean i() {
        return this.f25215f < h();
    }

    public void j() {
        this.f25216g = -1;
    }

    public void k() {
        this.f25217h = null;
    }

    public void l(com.google.zxing.b bVar, com.google.zxing.b bVar2) {
        this.f25212c = bVar;
        this.f25213d = bVar2;
    }

    public void m(int i10) {
        this.f25218i = i10;
    }

    public void n(l lVar) {
        this.f25211b = lVar;
    }

    public void o(int i10) {
        this.f25216g = i10;
    }

    public void p() {
        q(a());
    }

    public void q(int i10) {
        k kVar = this.f25217h;
        if (kVar == null || i10 > kVar.a()) {
            this.f25217h = k.l(i10, this.f25211b, this.f25212c, this.f25213d, true);
        }
    }

    public void r(char c10) {
        this.f25214e.append(c10);
    }

    public void s(String str) {
        this.f25214e.append(str);
    }
}
