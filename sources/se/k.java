package se;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.t;
import me.y;
import rd.c0;

/* JADX INFO: compiled from: StatusLine.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25447d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f25448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25450c;

    /* JADX INFO: compiled from: StatusLine.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final k a(String statusLine) throws IOException {
            y yVar;
            int i10;
            String strSubstring;
            t.f(statusLine, "statusLine");
            if (c0.O(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(t.n("Unexpected status line: ", statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    yVar = y.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(t.n("Unexpected status line: ", statusLine));
                    }
                    yVar = y.HTTP_1_1;
                }
            } else {
                if (!c0.O(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException(t.n("Unexpected status line: ", statusLine));
                }
                yVar = y.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException(t.n("Unexpected status line: ", statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                t.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException(t.n("Unexpected status line: ", statusLine));
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new k(yVar, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(t.n("Unexpected status line: ", statusLine));
            }
        }
    }

    public k(y protocol, int i10, String message) {
        t.f(protocol, "protocol");
        t.f(message, "message");
        this.f25448a = protocol;
        this.f25449b = i10;
        this.f25450c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f25448a == y.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f25449b);
        sb2.append(' ');
        sb2.append(this.f25450c);
        String string = sb2.toString();
        t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
