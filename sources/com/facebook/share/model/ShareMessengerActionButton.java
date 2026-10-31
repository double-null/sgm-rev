package com.facebook.share.model;

import android.os.Parcel;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ShareMessengerActionButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ShareMessengerActionButton implements ShareModel {
    private final String title;

    /* JADX INFO: compiled from: ShareMessengerActionButton.kt */
    public static abstract class Builder<M extends ShareMessengerActionButton, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {
        private String title;

        public final String getTitle$facebook_common_release() {
            return this.title;
        }

        public final B setTitle(String str) {
            this.title = str;
            t.d(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMessengerActionButton.Builder");
            return this;
        }

        public final void setTitle$facebook_common_release(String str) {
            this.title = str;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public B readFrom(M m10) {
            if (m10 != null) {
                return (B) setTitle(m10.getTitle());
            }
            t.d(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMessengerActionButton.Builder");
            return this;
        }
    }

    protected ShareMessengerActionButton(Builder<?, ?> builder) {
        t.f(builder, "builder");
        this.title = builder.getTitle$facebook_common_release();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        t.f(dest, "dest");
        dest.writeString(this.title);
    }

    public ShareMessengerActionButton(Parcel parcel) {
        t.f(parcel, "parcel");
        this.title = parcel.readString();
    }
}
