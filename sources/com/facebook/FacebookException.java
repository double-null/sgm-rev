package com.facebook;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: compiled from: FacebookException.kt */
/* JADX INFO: loaded from: classes.dex */
public class FacebookException extends RuntimeException {
    public static final Companion Companion = new Companion(null);
    private static final SecureRandom rand = new SecureRandom();
    public static final long serialVersionUID = 1;

    /* JADX INFO: compiled from: FacebookException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public FacebookException() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(String str, boolean z10) {
        if (z10) {
            try {
                ErrorReportHandler.save(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException(final String str) {
        super(str);
        if (str == null || !FacebookSdk.isInitialized() || rand.nextInt(100) <= 50) {
            return;
        }
        FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new FeatureManager.Callback() { // from class: com.facebook.j
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z10) {
                FacebookException._init_$lambda$0(str, z10);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FacebookException(String str, Object... args) {
        String str2;
        kotlin.jvm.internal.t.f(args, "args");
        if (str != null) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            kotlin.jvm.internal.t.e(str2, "format(this, *args)");
        } else {
            str2 = null;
        }
        this(str2);
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
