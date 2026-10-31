package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import rd.c;
import rd.o;

/* JADX INFO: compiled from: SensitiveUserDataUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SensitiveUserDataUtils {
    public static final SensitiveUserDataUtils INSTANCE = new SensitiveUserDataUtils();

    private SensitiveUserDataUtils() {
    }

    private final boolean isCreditCard(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            String strF = new o("\\s").f(ViewHierarchy.getTextOfView(textView), "");
            int length = strF.length();
            if (length >= 12 && length <= 19) {
                int i10 = 0;
                boolean z10 = false;
                for (int i11 = length - 1; -1 < i11; i11--) {
                    char cCharAt = strF.charAt(i11);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iD = c.d(cCharAt);
                    if (z10 && (iD = iD * 2) > 9) {
                        iD = (iD % 10) + 1;
                    }
                    i10 += iD;
                    z10 = !z10;
                }
                return i10 % 10 == 0;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isEmail(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            boolean z10 = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            String textOfView = ViewHierarchy.getTextOfView(textView);
            if (textOfView == null) {
                return false;
            }
            if (textOfView.length() != 0) {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(textOfView).matches();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPassword(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPersonName(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPhoneNumber(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPostalAddress(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final boolean isSensitiveUserData(View view) {
        if (CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            SensitiveUserDataUtils sensitiveUserDataUtils = INSTANCE;
            return sensitiveUserDataUtils.isPassword((TextView) view) || sensitiveUserDataUtils.isCreditCard((TextView) view) || sensitiveUserDataUtils.isPersonName((TextView) view) || sensitiveUserDataUtils.isPostalAddress((TextView) view) || sensitiveUserDataUtils.isPhoneNumber((TextView) view) || sensitiveUserDataUtils.isEmail((TextView) view);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveUserDataUtils.class);
            return false;
        }
    }
}
