package v;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: PrecomputedTextCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class m implements Spannable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f27061d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spannable f27062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PrecomputedText f27064c;

    public a a() {
        return this.f27063b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f27062a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f27062a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f27062a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f27062a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f27062a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f27064c.getSpans(i10, i11, cls) : (T[]) this.f27062a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f27062a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f27062a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f27064c.removeSpan(obj);
        } else {
            this.f27062a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f27064c.setSpan(obj, i10, i11, i12);
        } else {
            this.f27062a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f27062a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f27062a.toString();
    }

    /* JADX INFO: compiled from: PrecomputedTextCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f27065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f27066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f27068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f27069e;

        /* JADX INFO: renamed from: v.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PrecomputedTextCompat.java */
        public static class C0447a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f27070a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f27072c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f27073d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f27071b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0447a(TextPaint textPaint) {
                this.f27070a = textPaint;
            }

            public a a() {
                return new a(this.f27070a, this.f27071b, this.f27072c, this.f27073d);
            }

            public C0447a b(int i10) {
                this.f27072c = i10;
                return this;
            }

            public C0447a c(int i10) {
                this.f27073d = i10;
                return this;
            }

            public C0447a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f27071b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f27069e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f27069e = null;
            }
            this.f27065a = textPaint;
            this.f27066b = textDirectionHeuristic;
            this.f27067c = i10;
            this.f27068d = i11;
        }

        public boolean a(a aVar) {
            if (this.f27067c != aVar.b() || this.f27068d != aVar.c() || this.f27065a.getTextSize() != aVar.e().getTextSize() || this.f27065a.getTextScaleX() != aVar.e().getTextScaleX() || this.f27065a.getTextSkewX() != aVar.e().getTextSkewX() || this.f27065a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f27065a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f27065a.getFlags() != aVar.e().getFlags() || !this.f27065a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f27065a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f27065a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f27067c;
        }

        public int c() {
            return this.f27068d;
        }

        public TextDirectionHeuristic d() {
            return this.f27066b;
        }

        public TextPaint e() {
            return this.f27065a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f27066b == aVar.d();
        }

        public int hashCode() {
            return w.d.b(Float.valueOf(this.f27065a.getTextSize()), Float.valueOf(this.f27065a.getTextScaleX()), Float.valueOf(this.f27065a.getTextSkewX()), Float.valueOf(this.f27065a.getLetterSpacing()), Integer.valueOf(this.f27065a.getFlags()), this.f27065a.getTextLocales(), this.f27065a.getTypeface(), Boolean.valueOf(this.f27065a.isElegantTextHeight()), this.f27066b, Integer.valueOf(this.f27067c), Integer.valueOf(this.f27068d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f27065a.getTextSize());
            sb2.append(", textScaleX=" + this.f27065a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f27065a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f27065a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f27065a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f27065a.getTextLocales());
            sb2.append(", typeface=" + this.f27065a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f27065a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f27066b);
            sb2.append(", breakStrategy=" + this.f27067c);
            sb2.append(", hyphenationFrequency=" + this.f27068d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f27065a = params.getTextPaint();
            this.f27066b = params.getTextDirection();
            this.f27067c = params.getBreakStrategy();
            this.f27068d = params.getHyphenationFrequency();
            this.f27069e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
