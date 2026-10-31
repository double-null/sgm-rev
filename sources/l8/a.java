package l8;

import j9.h;
import u7.q;

/* JADX INFO: compiled from: MetadataDecoderFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21865a = new C0354a();

    /* JADX INFO: renamed from: l8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MetadataDecoderFactory.java */
    class C0354a implements a {
        C0354a() {
        }

        @Override // l8.a
        public boolean a(q qVar) {
            String str = qVar.f26252o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // l8.a
        public e9.a b(q qVar) {
            String str = qVar.f26252o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new f9.b();
                    case "application/x-icy":
                        return new i9.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new g9.b();
                    case "application/x-scte35":
                        return new l9.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(q qVar);

    e9.a b(q qVar);
}
