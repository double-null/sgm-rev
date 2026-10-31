package s9;

import java.util.Objects;

/* JADX INFO: compiled from: DefaultSubtitleParserFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements r.a {
    @Override // s9.r.a
    public boolean a(u7.q qVar) {
        String str = qVar.f26252o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // s9.r.a
    public int b(u7.q qVar) {
        String str = qVar.f26252o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // s9.r.a
    public r c(u7.q qVar) {
        String str = qVar.f26252o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new u9.a(qVar.f26255r);
                case "application/pgs":
                    return new v9.a();
                case "application/x-mp4-vtt":
                    return new ba.a();
                case "text/vtt":
                    return new ba.g();
                case "application/x-quicktime-tx3g":
                    return new z9.a(qVar.f26255r);
                case "text/x-ssa":
                    return new w9.b(qVar.f26255r);
                case "application/vobsub":
                    return new aa.a(qVar.f26255r);
                case "application/x-subrip":
                    return new x9.a();
                case "application/ttml+xml":
                    return new y9.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
