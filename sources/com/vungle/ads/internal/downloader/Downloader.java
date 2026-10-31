package com.vungle.ads.internal.downloader;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Downloader.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface Downloader {

    /* JADX INFO: compiled from: Downloader.kt */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface NetworkType {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: Downloader.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static int CELLULAR = 1;
            private static int WIFI = 2;
            private static int ANY = 1 | 2;

            private Companion() {
            }

            public final int getANY() {
                return ANY;
            }

            public final int getCELLULAR() {
                return CELLULAR;
            }

            public final int getWIFI() {
                return WIFI;
            }

            public final void setANY(int i10) {
                ANY = i10;
            }

            public final void setCELLULAR(int i10) {
                CELLULAR = i10;
            }

            public final void setWIFI(int i10) {
                WIFI = i10;
            }
        }
    }

    /* JADX INFO: compiled from: Downloader.kt */
    public static final class RequestException extends Exception {
        public RequestException(String str) {
            super(str);
        }
    }

    void cancel(DownloadRequest downloadRequest);

    void cancelAll();

    void download(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener);
}
