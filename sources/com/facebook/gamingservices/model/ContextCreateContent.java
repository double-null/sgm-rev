package com.facebook.gamingservices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ContextCreateContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContextCreateContent implements ShareModel {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String suggestedPlayerID;

    /* JADX INFO: compiled from: ContextCreateContent.kt */
    public static final class Builder implements ShareModelBuilder<ContextCreateContent, Builder> {
        private String suggestedPlayerID;

        public final String getSuggestedPlayerID$facebook_gamingservices_release() {
            return this.suggestedPlayerID;
        }

        public final Builder setSuggestedPlayerID(String str) {
            this.suggestedPlayerID = str;
            return this;
        }

        public final void setSuggestedPlayerID$facebook_gamingservices_release(String str) {
            this.suggestedPlayerID = str;
        }

        @Override // com.facebook.share.ShareBuilder
        public ContextCreateContent build() {
            return new ContextCreateContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ContextCreateContent contextCreateContent) {
            Builder suggestedPlayerID;
            return (contextCreateContent == null || (suggestedPlayerID = setSuggestedPlayerID(contextCreateContent.getSuggestedPlayerID())) == null) ? this : suggestedPlayerID;
        }

        public final Builder readFrom(Parcel parcel) {
            t.f(parcel, "parcel");
            return readFrom((ContextCreateContent) parcel.readParcelable(ContextCreateContent.class.getClassLoader()));
        }
    }

    /* JADX INFO: compiled from: ContextCreateContent.kt */
    public static final class CREATOR implements Parcelable.Creator<ContextCreateContent> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(k kVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextCreateContent createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new ContextCreateContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextCreateContent[] newArray(int i10) {
            return new ContextCreateContent[i10];
        }
    }

    public /* synthetic */ ContextCreateContent(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getSuggestedPlayerID() {
        return this.suggestedPlayerID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        t.f(out, "out");
        out.writeString(this.suggestedPlayerID);
    }

    private ContextCreateContent(Builder builder) {
        this.suggestedPlayerID = builder.getSuggestedPlayerID$facebook_gamingservices_release();
    }

    public ContextCreateContent(Parcel parcel) {
        t.f(parcel, "parcel");
        this.suggestedPlayerID = parcel.readString();
    }
}
