package io.bidmachine.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18028a;

    public DataSourceException(int i10) {
        this.f18028a = i10;
    }

    public static boolean b(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f18028a == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(Throwable th, int i10) {
        super(th);
        this.f18028a = i10;
    }

    public DataSourceException(String str, int i10) {
        super(str);
        this.f18028a = i10;
    }

    public DataSourceException(String str, Throwable th, int i10) {
        super(str, th);
        this.f18028a = i10;
    }
}
