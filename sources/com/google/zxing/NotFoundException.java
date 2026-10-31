package com.google.zxing;

/* JADX INFO: loaded from: classes4.dex */
public final class NotFoundException extends ReaderException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final NotFoundException f12461c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f12461c = notFoundException;
        notFoundException.setStackTrace(ReaderException.f12463b);
    }

    private NotFoundException() {
    }
}
