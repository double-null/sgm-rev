package w9;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.common.primitives.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: SsaStyle.java */
/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f27636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f27637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f27638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f27640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f27642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27643j;

    /* JADX INFO: compiled from: SsaStyle.java */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f27648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f27649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f27650g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f27651h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f27652i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f27653j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f27654k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f27644a = i10;
            this.f27645b = i11;
            this.f27646c = i12;
            this.f27647d = i13;
            this.f27648e = i14;
            this.f27649f = i15;
            this.f27650g = i16;
            this.f27651h = i17;
            this.f27652i = i18;
            this.f27653j = i19;
            this.f27654k = i20;
        }

        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < strArrSplit.length; i20++) {
                String strE = com.google.common.base.c.e(strArrSplit[i20].trim());
                strE.hashCode();
                switch (strE) {
                    case "italic":
                        i16 = i20;
                        break;
                    case "underline":
                        i17 = i20;
                        break;
                    case "strikeout":
                        i18 = i20;
                        break;
                    case "primarycolour":
                        i12 = i20;
                        break;
                    case "bold":
                        i15 = i20;
                        break;
                    case "name":
                        i10 = i20;
                        break;
                    case "fontsize":
                        i14 = i20;
                        break;
                    case "borderstyle":
                        i19 = i20;
                        break;
                    case "alignment":
                        i11 = i20;
                        break;
                    case "outlinecolour":
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: SsaStyle.java */
    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f27655c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f27656d = Pattern.compile(l0.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f27657e = Pattern.compile(l0.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f27658f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f27660b;

        private b(int i10, PointF pointF) {
            this.f27659a = i10;
            this.f27660b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f27658f.matcher(str);
            if (matcher.find()) {
                return c.e((String) x7.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f27655c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) x7.a.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f27656d.matcher(str);
            Matcher matcher2 = f27657e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    r.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) x7.a.e(strGroup)).trim()), Float.parseFloat(((String) x7.a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f27655c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f27634a = str;
        this.f27635b = i10;
        this.f27636c = num;
        this.f27637d = num2;
        this.f27638e = f10;
        this.f27639f = z10;
        this.f27640g = z11;
        this.f27641h = z12;
        this.f27642i = z13;
        this.f27643j = i11;
    }

    public static c b(String str, a aVar) {
        x7.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = aVar.f27654k;
        if (length != i10) {
            r.h("SsaStyle", l0.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f27644a].trim();
            int i11 = aVar.f27645b;
            int iE = i11 != -1 ? e(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f27646c;
            Integer numH = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f27647d;
            Integer numH2 = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f27648e;
            float fI = i14 != -1 ? i(strArrSplit[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f27649f;
            boolean z10 = i15 != -1 && f(strArrSplit[i15].trim());
            int i16 = aVar.f27650g;
            boolean z11 = i16 != -1 && f(strArrSplit[i16].trim());
            int i17 = aVar.f27651h;
            boolean z12 = i17 != -1 && f(strArrSplit[i17].trim());
            int i18 = aVar.f27652i;
            boolean z13 = i18 != -1 && f(strArrSplit[i18].trim());
            int i19 = aVar.f27653j;
            return new c(strTrim, iE, numH, numH2, fI, z10, z11, z12, z13, i19 != -1 ? g(strArrSplit[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            r.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        r.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            r.i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (d(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        r.h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            x7.a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(f.d(((j10 >> 24) & 255) ^ 255), f.d(j10 & 255), f.d((j10 >> 8) & 255), f.d((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            r.i("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            r.i("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
