package x9;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s9.e;
import s9.r;
import x7.a0;
import x7.l;

/* JADX INFO: compiled from: SubripParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f28256d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f28257e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f28258a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f28259b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f28260c = new a0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    private w7.a d(Spanned spanned, String str) {
        byte b10;
        byte b11;
        w7.a.b bVarO = new w7.a.b().o(spanned);
        if (str == null) {
            return bVarO.a();
        }
        switch (str) {
            case "{\an1}":
                b10 = 0;
                break;
            case "{\an2}":
                b10 = 6;
                break;
            case "{\an3}":
                b10 = 3;
                break;
            case "{\an4}":
                b10 = 1;
                break;
            case "{\an5}":
                b10 = 7;
                break;
            case "{\an6}":
                b10 = 4;
                break;
            case "{\an7}":
                b10 = 2;
                break;
            case "{\an8}":
                b10 = 8;
                break;
            case "{\an9}":
                b10 = 5;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2) {
            bVarO.l(0);
        } else if (b10 == 3 || b10 == 4 || b10 == 5) {
            bVarO.l(2);
        } else {
            bVarO.l(1);
        }
        switch (str) {
            case "{\an1}":
                b11 = 0;
                break;
            case "{\an2}":
                b11 = 1;
                break;
            case "{\an3}":
                b11 = 2;
                break;
            case "{\an4}":
                b11 = 6;
                break;
            case "{\an5}":
                b11 = 7;
                break;
            case "{\an6}":
                b11 = 8;
                break;
            case "{\an7}":
                b11 = 3;
                break;
            case "{\an8}":
                b11 = 4;
                break;
            case "{\an9}":
                b11 = 5;
                break;
            default:
                b11 = -1;
                break;
        }
        if (b11 == 0 || b11 == 1 || b11 == 2) {
            bVarO.i(2);
        } else if (b11 == 3 || b11 == 4 || b11 == 5) {
            bVarO.i(0);
        } else {
            bVarO.i(1);
        }
        return bVarO.k(f(bVarO.d())).h(f(bVarO.c()), 0).a();
    }

    private Charset e(a0 a0Var) {
        Charset charsetR = a0Var.R();
        return charsetR != null ? charsetR : StandardCharsets.UTF_8;
    }

    public static float f(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long g(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) x7.a.e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) x7.a.e(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    private String h(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f28257e.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // s9.r
    public void b(byte[] bArr, int i10, int i11, r.b bVar, l<e> lVar) {
        String str;
        String str2;
        l<e> lVar2;
        l<e> lVar3 = lVar;
        String str3 = "SubripParser";
        this.f28260c.U(bArr, i10 + i11);
        this.f28260c.W(i10);
        Charset charsetE = e(this.f28260c);
        ArrayList arrayList = (bVar.f25345a == -9223372036854775807L || !bVar.f25346b) ? null : new ArrayList();
        while (true) {
            String strT = this.f28260c.t(charsetE);
            if (strT == null) {
                break;
            }
            if (strT.length() != 0) {
                try {
                    Integer.parseInt(strT);
                    String strT2 = this.f28260c.t(charsetE);
                    if (strT2 == null) {
                        x7.r.h(str3, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f28256d.matcher(strT2);
                    if (matcher.matches()) {
                        long jG = g(matcher, 1);
                        long jG2 = g(matcher, 6);
                        int i12 = 0;
                        this.f28258a.setLength(0);
                        this.f28259b.clear();
                        String strT3 = this.f28260c.t(charsetE);
                        while (!TextUtils.isEmpty(strT3)) {
                            if (this.f28258a.length() > 0) {
                                this.f28258a.append("<br>");
                            }
                            this.f28258a.append(h(strT3, this.f28259b));
                            strT3 = this.f28260c.t(charsetE);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f28258a.toString());
                        while (true) {
                            if (i12 >= this.f28259b.size()) {
                                str2 = null;
                                break;
                            }
                            str2 = this.f28259b.get(i12);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        long j10 = bVar.f25345a;
                        if (j10 == -9223372036854775807L || jG >= j10) {
                            lVar2 = lVar;
                            lVar2.accept(new e(u.I(d(spannedFromHtml, str2)), jG, jG2 - jG));
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new e(u.I(d(spannedFromHtml, str2)), jG, jG2 - jG));
                            }
                            lVar2 = lVar;
                        }
                        lVar3 = lVar2;
                        str3 = str3;
                    } else {
                        str = str3;
                        x7.r.h(str, "Skipping invalid timing: " + strT2);
                        lVar3 = lVar3;
                        str3 = str;
                    }
                } catch (NumberFormatException unused) {
                    str = str3;
                    x7.r.h(str, "Skipping invalid index: " + strT);
                }
            }
        }
        l<e> lVar4 = lVar3;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lVar4.accept((e) it.next());
            }
        }
    }

    @Override // s9.r
    public int c() {
        return 1;
    }
}
