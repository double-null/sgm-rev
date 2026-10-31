package com.google.zxing;

/* JADX INFO: loaded from: classes4.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FormatException f12460c;

    static {
        FormatException formatException = new FormatException();
        f12460c = formatException;
        formatException.setStackTrace(ReaderException.f12463b);
    }

    private FormatException() {
    }

    public static FormatException b() {
        return ReaderException.f12462a ? new FormatException() : f12460c;
    }
}
