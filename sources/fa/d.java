package fa;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import x7.l0;

/* JADX INFO: compiled from: DefaultTrackNameProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f14768a;

    public d(Resources resources) {
        this.f14768a = (Resources) x7.a.e(resources);
    }

    private String b(u7.q qVar) {
        int i10 = qVar.E;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 == 1) {
            return this.f14768a.getString(v.f14854q);
        }
        if (i10 == 2) {
            return this.f14768a.getString(v.f14863z);
        }
        if (i10 == 6 || i10 == 7) {
            return this.f14768a.getString(v.B);
        }
        return i10 != 8 ? this.f14768a.getString(v.A) : this.f14768a.getString(v.C);
    }

    private String c(u7.q qVar) {
        int i10 = qVar.f26247j;
        return i10 == -1 ? "" : this.f14768a.getString(v.f14853p, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(u7.q qVar) {
        return TextUtils.isEmpty(qVar.f26239b) ? "" : qVar.f26239b;
    }

    private String e(u7.q qVar) {
        String strJ = j(f(qVar), h(qVar));
        return TextUtils.isEmpty(strJ) ? d(qVar) : strJ;
    }

    private String f(u7.q qVar) {
        String str = qVar.f26241d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale localeY = l0.Y();
        String displayName = localeForLanguageTag.getDisplayName(localeY);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeY) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(u7.q qVar) {
        int i10 = qVar.f26259v;
        int i11 = qVar.f26260w;
        return (i10 == -1 || i11 == -1) ? "" : this.f14768a.getString(v.f14855r, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(u7.q qVar) {
        String string = (qVar.f26243f & 2) != 0 ? this.f14768a.getString(v.f14856s) : "";
        if ((qVar.f26243f & 4) != 0) {
            string = j(string, this.f14768a.getString(v.f14859v));
        }
        if ((qVar.f26243f & 8) != 0) {
            string = j(string, this.f14768a.getString(v.f14858u));
        }
        return (qVar.f26243f & 1088) != 0 ? j(string, this.f14768a.getString(v.f14857t)) : string;
    }

    private static int i(u7.q qVar) {
        int iK = u7.w.k(qVar.f26252o);
        if (iK != -1) {
            return iK;
        }
        if (u7.w.n(qVar.f26248k) != null) {
            return 2;
        }
        if (u7.w.c(qVar.f26248k) != null) {
            return 1;
        }
        if (qVar.f26259v == -1 && qVar.f26260w == -1) {
            return (qVar.E == -1 && qVar.F == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f14768a.getString(v.f14852o, string, str);
            }
        }
        return string;
    }

    @Override // fa.y
    public String a(u7.q qVar) {
        String strJ;
        int i10 = i(qVar);
        if (i10 == 2) {
            strJ = j(h(qVar), g(qVar), c(qVar));
        } else {
            strJ = i10 == 1 ? j(e(qVar), b(qVar), c(qVar)) : e(qVar);
        }
        if (strJ.length() != 0) {
            return strJ;
        }
        String str = qVar.f26241d;
        return (str == null || str.trim().isEmpty()) ? this.f14768a.getString(v.D) : this.f14768a.getString(v.E, str);
    }
}
