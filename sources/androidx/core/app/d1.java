package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: RemoteInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f1725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f1726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f1727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f1729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<String> f1730g;

    /* JADX INFO: compiled from: RemoteInput.java */
    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(d1 d1Var) {
            Set<String> setD;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(d1Var.i()).setLabel(d1Var.h()).setChoices(d1Var.e()).setAllowFreeFormInput(d1Var.c()).addExtras(d1Var.g());
            if (Build.VERSION.SDK_INT >= 26 && (setD = d1Var.d()) != null) {
                Iterator<String> it = setD.iterator();
                while (it.hasNext()) {
                    b.d(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(builderAddExtras, d1Var.f());
            }
            return builderAddExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    static class b {
        static void a(d1 d1Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(d1.a(d1Var), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    static class c {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    static RemoteInput a(d1 d1Var) {
        return a.b(d1Var);
    }

    static RemoteInput[] b(d1[] d1VarArr) {
        if (d1VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[d1VarArr.length];
        for (int i10 = 0; i10 < d1VarArr.length; i10++) {
            remoteInputArr[i10] = a(d1VarArr[i10]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f1727d;
    }

    public Set<String> d() {
        return this.f1730g;
    }

    public CharSequence[] e() {
        return this.f1726c;
    }

    public int f() {
        return this.f1728e;
    }

    public Bundle g() {
        return this.f1729f;
    }

    public CharSequence h() {
        return this.f1725b;
    }

    public String i() {
        return this.f1724a;
    }

    public boolean j() {
        return (c() || (e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
