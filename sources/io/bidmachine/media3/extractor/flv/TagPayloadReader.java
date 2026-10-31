package io.bidmachine.media3.extractor.flv;

import io.bidmachine.media3.common.ParserException;
import v8.o0;
import x7.a0;

/* JADX INFO: loaded from: classes4.dex */
abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final o0 f20015a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(o0 o0Var) {
        this.f20015a = o0Var;
    }

    public final boolean a(a0 a0Var, long j10) throws ParserException {
        return b(a0Var) && c(a0Var, j10);
    }

    protected abstract boolean b(a0 a0Var) throws ParserException;

    protected abstract boolean c(a0 a0Var, long j10) throws ParserException;
}
