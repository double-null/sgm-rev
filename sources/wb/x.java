package wb;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: SharedPreferenceUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x {
    public static final void a(SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.t.f(sharedPreferences, "<this>");
        for (String key : sharedPreferences.getAll().keySet()) {
            kotlin.jvm.internal.t.e(key, "key");
            l(sharedPreferences, key);
        }
    }

    public static final void b(SharedPreferences sharedPreferences, id.l<? super SharedPreferences.Editor, wc.g0> editAction) {
        kotlin.jvm.internal.t.f(sharedPreferences, "<this>");
        kotlin.jvm.internal.t.f(editAction, "editAction");
        try {
            SharedPreferences.Editor edit$lambda$8$lambda$7 = sharedPreferences.edit();
            kotlin.jvm.internal.t.e(edit$lambda$8$lambda$7, "edit$lambda$8$lambda$7");
            editAction.invoke(edit$lambda$8$lambda$7);
            edit$lambda$8$lambda$7.apply();
            wc.g0 g0Var = wc.g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    public static final int c(SharedPreferences sharedPreferences, String key, int i10) {
        kotlin.jvm.internal.t.f(sharedPreferences, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        try {
            if (sharedPreferences.contains(key)) {
                return sharedPreferences.getInt(key, i10);
            }
            wc.g0 g0Var = wc.g0.f27756a;
            return i10;
        } catch (Throwable unused) {
        }
    }

    public static final long d(SharedPreferences sharedPreferences, String key, long j10) {
        kotlin.jvm.internal.t.f(sharedPreferences, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        try {
            if (sharedPreferences.contains(key)) {
                return sharedPreferences.getLong(key, j10);
            }
            wc.g0 g0Var = wc.g0.f27756a;
            return j10;
        } catch (Throwable unused) {
        }
    }

    public static final String e(SharedPreferences sharedPreferences, String key, String str) {
        String string;
        kotlin.jvm.internal.t.f(sharedPreferences, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        try {
            if (sharedPreferences.contains(key) && (string = sharedPreferences.getString(key, str)) != null) {
                return string;
            }
            wc.g0 g0Var = wc.g0.f27756a;
        } catch (Throwable unused) {
        }
        return str;
    }

    public static final SharedPreferences.Editor f(SharedPreferences.Editor editor, String key, Integer num) {
        kotlin.jvm.internal.t.f(editor, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        if (num == null) {
            editor.remove(key);
        } else {
            editor.putInt(key, num.intValue());
        }
        return editor;
    }

    public static final void g(SharedPreferences sharedPreferences, String key, Integer num) {
        kotlin.jvm.internal.t.f(sharedPreferences, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        if (num == null) {
            l(sharedPreferences, key);
            return;
        }
        SharedPreferences.Editor putOrRemove$lambda$12 = sharedPreferences.edit();
        kotlin.jvm.internal.t.e(putOrRemove$lambda$12, "putOrRemove$lambda$12");
        putOrRemove$lambda$12.putInt(key, num.intValue());
        putOrRemove$lambda$12.apply();
    }

    public static final SharedPreferences.Editor h(SharedPreferences.Editor editor, String key, Long l10) {
        kotlin.jvm.internal.t.f(editor, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        if (l10 == null) {
            editor.remove(key);
        } else {
            editor.putLong(key, l10.longValue());
        }
        return editor;
    }

    public static final void i(SharedPreferences sharedPreferences, String key, Long l10) {
        kotlin.jvm.internal.t.f(sharedPreferences, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        if (l10 == null) {
            l(sharedPreferences, key);
            return;
        }
        SharedPreferences.Editor putOrRemove$lambda$12 = sharedPreferences.edit();
        kotlin.jvm.internal.t.e(putOrRemove$lambda$12, "putOrRemove$lambda$12");
        putOrRemove$lambda$12.putLong(key, l10.longValue());
        putOrRemove$lambda$12.apply();
    }

    public static final SharedPreferences.Editor j(SharedPreferences.Editor editor, String key, String str) {
        kotlin.jvm.internal.t.f(editor, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        if (str == null) {
            editor.remove(key);
        } else {
            editor.putString(key, str);
        }
        return editor;
    }

    public static final void k(SharedPreferences sharedPreferences, String key, String str) {
        kotlin.jvm.internal.t.f(sharedPreferences, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        if (str == null) {
            l(sharedPreferences, key);
            return;
        }
        SharedPreferences.Editor putOrRemove$lambda$12 = sharedPreferences.edit();
        kotlin.jvm.internal.t.e(putOrRemove$lambda$12, "putOrRemove$lambda$12");
        putOrRemove$lambda$12.putString(key, str);
        putOrRemove$lambda$12.apply();
    }

    public static final void l(SharedPreferences sharedPreferences, String key) {
        kotlin.jvm.internal.t.f(sharedPreferences, "<this>");
        kotlin.jvm.internal.t.f(key, "key");
        sharedPreferences.edit().remove(key).apply();
    }
}
