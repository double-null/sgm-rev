package io.bidmachine.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: compiled from: SubtitleViewUtils.java */
/* JADX INFO: loaded from: classes4.dex */
final class g0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof w7.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void e(w7.a.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            g((Spannable) x7.a.e(bVar.e()), new com.google.common.base.q() { // from class: io.bidmachine.media3.ui.f0
                @Override // com.google.common.base.q
                public final boolean apply(Object obj) {
                    return g0.c(obj);
                }
            });
        }
        f(bVar);
    }

    public static void f(w7.a.b bVar) {
        bVar.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            g((Spannable) x7.a.e(bVar.e()), new com.google.common.base.q() { // from class: io.bidmachine.media3.ui.e0
                @Override // com.google.common.base.q
                public final boolean apply(Object obj) {
                    return g0.d(obj);
                }
            });
        }
    }

    private static void g(Spannable spannable, com.google.common.base.q<Object> qVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (qVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }
}
