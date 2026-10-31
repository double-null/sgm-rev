package z4;

import i5.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f28945a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f28946b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f28947c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f28948d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f28949e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f28950f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f28951g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    static String a(String str, String str2) {
        g.f(str, "HTML is null or empty");
        int[][] iArrD = d(str);
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 16);
        if (f(str, sb2, f28946b, str2, iArrD)) {
            return sb2.toString();
        }
        if (c(str, sb2, f28945a, str2, iArrD)) {
            return sb2.toString();
        }
        if (f(str, sb2, f28948d, str2, iArrD)) {
            return sb2.toString();
        }
        if (c(str, sb2, f28947c, str2, iArrD)) {
            return sb2.toString();
        }
        if (f(str, sb2, f28950f, str2, iArrD)) {
            return sb2.toString();
        }
        if (c(str, sb2, f28949e, str2, iArrD)) {
            return sb2.toString();
        }
        if (c(str, sb2, f28951g, str2, iArrD)) {
            return sb2.toString();
        }
        return str2 + str;
    }

    private static boolean b(int i10, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i10 >= iArr2[0] && i10 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean c(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!b(iStart, iArr)) {
                sb2.append(str.substring(0, matcher.end()));
                sb2.append(str2);
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = iEnd;
        }
        return false;
    }

    private static int[][] d(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str.indexOf("<!--", i10);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str.indexOf("-->", iIndexOf);
                int[] iArr = new int[2];
                if (iIndexOf2 >= 0) {
                    iArr[0] = iIndexOf;
                    iArr[1] = iIndexOf2;
                    arrayList.add(iArr);
                    i10 = iIndexOf2 + 3;
                } else {
                    iArr[0] = iIndexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i10 = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }

    static String e(String str, String str2) {
        return a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    private static boolean f(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!b(iStart, iArr)) {
                sb2.append(str.substring(0, matcher.end() - 2));
                sb2.append(">");
                sb2.append(str2);
                sb2.append("</");
                sb2.append(matcher.group(1));
                sb2.append(">");
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i10 = iEnd;
        }
        return false;
    }
}
