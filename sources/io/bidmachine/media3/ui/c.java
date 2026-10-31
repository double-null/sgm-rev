package io.bidmachine.media3.ui;

import android.graphics.Color;
import x7.l0;

/* JADX INFO: compiled from: HtmlUtils.java */
/* JADX INFO: loaded from: classes4.dex */
final class c {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i10) {
        return l0.G("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }
}
