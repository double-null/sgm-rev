package d7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.adjust.sdk.Constants;
import g7.y;
import io.bidmachine.iab.mraid.b0;
import io.bidmachine.iab.mraid.b1;
import io.bidmachine.iab.mraid.s0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes4.dex */
abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g7.b f13357a = new g7.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f13358b = true;

    private static Pair a(String str) {
        String[] strArrSplit = str.split("/");
        return new Pair(strArrSplit[0], strArrSplit[1]);
    }

    private static void b(s0 s0Var) {
        b1 controller;
        if (s0Var == null || (controller = s0Var.getController()) == null) {
            return;
        }
        controller.K("nativeStorage.fireErrorEvent('internal error');");
    }

    static void c(s0 s0Var, String str) {
        if (f(s0Var, str)) {
            return;
        }
        try {
            Pair pairA = a(f13357a.g(URLDecoder.decode(str, Constants.ENCODING)));
            if (f(s0Var, (String) pairA.first, (String) pairA.second)) {
                return;
            }
            boolean z10 = f13358b;
            if (!z10 && s0Var == null) {
                throw new AssertionError();
            }
            Object obj = s0Var.getContext().getApplicationContext().getSharedPreferences((String) pairA.first, 0).getAll().get(pairA.second);
            if (obj == null) {
                b(s0Var);
                return;
            }
            String strValueOf = String.valueOf(obj);
            if (f(s0Var, strValueOf)) {
                return;
            }
            if (!z10 && str == null) {
                throw new AssertionError();
            }
            e(s0Var, "fireReadDefaultsSuccessEvent", str, Base64.encodeToString(strValueOf.getBytes(), 2));
        } catch (Throwable th) {
            b(s0Var);
            b0.f("NativeStorage", th);
        }
    }

    static void d(s0 s0Var, String str, String str2) {
        if (f(s0Var, str, str2)) {
            return;
        }
        try {
            String strG = f13357a.g(URLDecoder.decode(str, Constants.ENCODING));
            byte[] bArrDecode = Base64.decode(URLDecoder.decode(str2, Constants.ENCODING), 2);
            Pair pairA = a(strG);
            if (f(s0Var, (String) pairA.first, (String) pairA.second)) {
                return;
            }
            if (!f13358b && s0Var == null) {
                throw new AssertionError();
            }
            s0Var.getContext().getApplicationContext().getSharedPreferences((String) pairA.first, 0).edit().putString((String) pairA.second, new String(bArrDecode)).apply();
        } catch (Throwable th) {
            b(s0Var);
            b0.f("NativeStorage", th);
        }
    }

    private static void e(s0 s0Var, String str, String str2, String str3) {
        b1 controller;
        if (s0Var == null || (controller = s0Var.getController()) == null) {
            return;
        }
        controller.K("nativeStorage." + str + "(\"" + str2 + "\", \"" + str3 + "\");");
    }

    private static boolean f(s0 s0Var, String... strArr) {
        if (s0Var == null || s0Var.h() || s0Var.getContext() == null) {
            b(s0Var);
            return true;
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    b(s0Var);
                    return true;
                }
            }
        }
        return false;
    }

    static void g(s0 s0Var, String str) {
        FileInputStream fileInputStreamOpenFileInput;
        if (f(s0Var, str)) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            String strG = f13357a.g(URLDecoder.decode(str, Constants.ENCODING));
            if (!f13358b && s0Var == null) {
                throw new AssertionError();
            }
            Context applicationContext = s0Var.getContext().getApplicationContext();
            File file = strG.contains("/") ? new File(strG) : applicationContext.getFileStreamPath(strG);
            if (file != null && file.exists()) {
                fileInputStreamOpenFileInput = applicationContext.openFileInput(strG);
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        if (fileInputStreamOpenFileInput != null) {
                            while (true) {
                                int i10 = fileInputStreamOpenFileInput.read(bArr);
                                if (-1 == i10) {
                                    break;
                                } else {
                                    byteArrayOutputStream2.write(bArr, 0, i10);
                                }
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        if (byteArray.length > 0) {
                            if (!f13358b && str == null) {
                                throw new AssertionError();
                            }
                            e(s0Var, "fireReadFileSuccessEvent", str, Base64.encodeToString(byteArray, 2));
                        } else {
                            b(s0Var);
                        }
                        y.f(fileInputStreamOpenFileInput);
                        y.f(byteArrayOutputStream2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        try {
                            b(s0Var);
                            b0.f("NativeStorage", th);
                            return;
                        } finally {
                            y.f(fileInputStreamOpenFileInput);
                            y.f(byteArrayOutputStream);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            b(s0Var);
            y.f(null);
            y.f(null);
        } catch (Throwable th3) {
            th = th3;
            fileInputStreamOpenFileInput = null;
        }
    }

    static void h(s0 s0Var, String str, String str2) {
        if (f(s0Var, str, str2)) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            String strG = f13357a.g(URLDecoder.decode(str, Constants.ENCODING));
            byte[] bArrDecode = Base64.decode(URLDecoder.decode(str2, Constants.ENCODING), 2);
            if (!f(s0Var, strG, new String(bArrDecode))) {
                if (!f13358b && s0Var == null) {
                    throw new AssertionError();
                }
                fileOutputStream = strG.contains("/") ? new FileOutputStream(strG) : s0Var.getContext().getApplicationContext().openFileOutput(strG, 0);
                fileOutputStream.write(bArrDecode);
            }
            y.i(fileOutputStream);
            y.f(fileOutputStream);
        } catch (Throwable th) {
            try {
                b(s0Var);
                b0.f("NativeStorage", th);
            } finally {
                y.i(null);
                y.f(null);
            }
        }
    }
}
