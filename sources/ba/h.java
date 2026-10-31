package ba;

import io.bidmachine.media3.common.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: WebvttParserUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f4227a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(a0 a0Var) {
        String strS;
        while (true) {
            String strS2 = a0Var.s();
            if (strS2 == null) {
                return null;
            }
            if (f4227a.matcher(strS2).matches()) {
                do {
                    strS = a0Var.s();
                    if (strS == null) {
                        break;
                    }
                } while (!strS.isEmpty());
            } else {
                Matcher matcher = e.f4201a.matcher(strS2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(a0 a0Var) {
        String strS = a0Var.s();
        return strS != null && strS.startsWith("WEBVTT");
    }

    public static float c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] strArrN1 = l0.n1(str, "\\.");
        long j10 = 0;
        for (String str2 : l0.m1(strArrN1[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrN1.length == 2) {
            String strTrim = strArrN1[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static void e(a0 a0Var) throws ParserException {
        int iF = a0Var.f();
        if (b(a0Var)) {
            return;
        }
        a0Var.W(iF);
        throw ParserException.b("Expected WEBVTT. Got " + a0Var.s(), null);
    }
}
