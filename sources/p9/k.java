package p9;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: MimeTypeResolver.java */
/* JADX INFO: loaded from: classes4.dex */
final class k {
    public static String a(List<w> list) {
        Iterator<w> it = list.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().f23703a.f23674g.f26252o;
            if (u7.w.t(str2)) {
                return "video/mp4";
            }
            if (u7.w.o(str2)) {
                z10 = true;
            } else if (u7.w.q(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static String b(u7.q qVar) {
        String str = qVar.f26252o;
        if (u7.w.t(str)) {
            return "video/mp4";
        }
        if (u7.w.o(str)) {
            return "audio/mp4";
        }
        if (!u7.w.q(str)) {
            return "application/mp4";
        }
        if (Objects.equals(str, "image/heic")) {
            return "image/heif";
        }
        return Objects.equals(str, "image/avif") ? "image/avif" : "application/mp4";
    }
}
