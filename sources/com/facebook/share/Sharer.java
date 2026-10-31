package com.facebook.share;

/* JADX INFO: compiled from: Sharer.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface Sharer {

    /* JADX INFO: compiled from: Sharer.kt */
    public static final class Result {
        private final String postId;

        public Result(String str) {
            this.postId = str;
        }

        public final String getPostId() {
            return this.postId;
        }
    }

    boolean getShouldFailOnDataError();

    void setShouldFailOnDataError(boolean z10);
}
