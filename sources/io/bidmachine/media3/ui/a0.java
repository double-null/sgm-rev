package io.bidmachine.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import pb.vBC.NyXuoef;
import x7.l0;

/* JADX INFO: compiled from: SpannedToHtmlConverter.java */
/* JADX INFO: loaded from: classes4.dex */
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f20086a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f20088b;

        private b(String str, Map<String, String> map) {
            this.f20087a = str;
            this.f20088b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Comparator<c> f20089e = new Comparator() { // from class: io.bidmachine.media3.ui.b0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return a0.c.e((a0.c) obj, (a0.c) obj2);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Comparator<c> f20090f = new Comparator() { // from class: io.bidmachine.media3.ui.c0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return a0.c.f((a0.c) obj, (a0.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f20094d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f20092b, cVar.f20092b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f20093c.compareTo(cVar2.f20093c);
            return iCompareTo != 0 ? iCompareTo : cVar.f20094d.compareTo(cVar2.f20094d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int f(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f20091a, cVar.f20091a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f20093c.compareTo(cVar.f20093c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f20094d.compareTo(cVar.f20094d);
        }

        private c(int i10, int i11, String str, String str2) {
            this.f20091a = i10;
            this.f20092b = i11;
            this.f20093c = str;
            this.f20094d = str2;
        }
    }

    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f20095a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<c> f20096b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", com.google.common.collect.v.t());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), com.google.common.collect.v.t());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(io.bidmachine.media3.ui.c.a("bg_" + iIntValue), l0.G("background-color:%s;", io.bidmachine.media3.ui.c.b(iIntValue)));
        }
        SparseArray<d> sparseArrayC = c(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i10);
            sb2.append(b(spanned.subSequence(i11, iKeyAt)));
            d dVar = sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f20096b, c.f20090f);
            Iterator it2 = dVar.f20096b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).f20094d);
            }
            Collections.sort(dVar.f20095a, c.f20089e);
            Iterator it3 = dVar.f20095a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).f20093c);
            }
            i10++;
            i11 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), map);
    }

    private static String b(CharSequence charSequence) {
        return f20086a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f10) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f10);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                x7.a.e(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f20095a.add(cVar);
                f(sparseArray, spanEnd).f20096b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof w7.d) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof w7.h)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof w7.f) {
                return "<rt>" + b(((w7.f) obj).f27589a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return l0.G("<span style='color:%s;'>", io.bidmachine.media3.ui.c.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return l0.G("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof w7.d) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return l0.G("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f10));
        }
        if (obj instanceof RelativeSizeSpan) {
            return l0.G("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return l0.G("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof w7.f)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof w7.h)) {
                return null;
            }
            w7.h hVar = (w7.h) obj;
            return l0.G("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(hVar.f27594a, hVar.f27595b), g(hVar.f27596c));
        }
        int i10 = ((w7.f) obj).f27590b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static d f(SparseArray<d> sparseArray, int i10) {
        d dVar = sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append(NyXuoef.VMAl);
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
