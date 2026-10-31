package io.bidmachine.iab.mraid;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f17668a = {"sms", "tel", "inlineVideo", "calendar", "storePicture"};

    private static ArrayList a(d0 d0Var) {
        ArrayList arrayList = new ArrayList();
        if (d0Var.f()) {
            arrayList.add("tel");
        }
        if (d0Var.d()) {
            arrayList.add("sms");
        }
        if (d0Var.c()) {
            arrayList.add("inlineVideo");
        }
        if (d0Var.b()) {
            arrayList.add("calendar");
        }
        if (d0Var.e()) {
            arrayList.add("storePicture");
        }
        return arrayList;
    }

    public static String[] b(Context context) {
        return (String[]) a(new d0(context, f17668a)).toArray(new String[0]);
    }
}
