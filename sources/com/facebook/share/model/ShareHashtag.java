package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ShareHashtag.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ShareHashtag implements ShareModel {
    private final String hashtag;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new Parcelable.Creator<ShareHashtag>() { // from class: com.facebook.share.model.ShareHashtag$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareHashtag createFromParcel(Parcel source) {
            t.f(source, "source");
            return new ShareHashtag(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareHashtag[] newArray(int i10) {
            return new ShareHashtag[i10];
        }
    };

    /* JADX INFO: compiled from: ShareHashtag.kt */
    public static final class Builder implements ShareModelBuilder<ShareHashtag, Builder> {
        private String hashtag;

        public final String getHashtag() {
            return this.hashtag;
        }

        public final Builder readFrom$facebook_common_release(Parcel parcel) {
            t.f(parcel, "parcel");
            return readFrom((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        public final Builder setHashtag(String str) {
            this.hashtag = str;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ShareHashtag build() {
            return new ShareHashtag(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : setHashtag(shareHashtag.getHashtag());
        }
    }

    /* JADX INFO: compiled from: ShareHashtag.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ShareHashtag(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getHashtag() {
        return this.hashtag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        t.f(dest, "dest");
        dest.writeString(this.hashtag);
    }

    private ShareHashtag(Builder builder) {
        this.hashtag = builder.getHashtag();
    }

    public ShareHashtag(Parcel parcel) {
        t.f(parcel, "parcel");
        this.hashtag = parcel.readString();
    }
}
