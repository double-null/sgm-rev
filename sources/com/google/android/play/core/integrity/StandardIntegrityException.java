package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
public class StandardIntegrityException extends ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f11225a;

    StandardIntegrityException(int i10, Throwable th) {
        super(new Status(i10, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i10), com.google.android.play.core.integrity.model.b.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f11225a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f11225a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
