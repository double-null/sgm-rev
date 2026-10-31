package com.facebook.gamingservices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ContextSwitchContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContextSwitchContent implements ShareModel {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String contextID;

    /* JADX INFO: compiled from: ContextSwitchContent.kt */
    public static final class Builder implements ShareModelBuilder<ContextSwitchContent, Builder> {
        private String contextID;

        public final String getContextID$facebook_gamingservices_release() {
            return this.contextID;
        }

        public final Builder setContextID(String str) {
            this.contextID = str;
            return this;
        }

        public final void setContextID$facebook_gamingservices_release(String str) {
            this.contextID = str;
        }

        @Override // com.facebook.share.ShareBuilder
        public ContextSwitchContent build() {
            return new ContextSwitchContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ContextSwitchContent contextSwitchContent) {
            Builder contextID;
            return (contextSwitchContent == null || (contextID = setContextID(contextSwitchContent.getContextID())) == null) ? this : contextID;
        }

        public final Builder readFrom(Parcel parcel) {
            t.f(parcel, "parcel");
            return readFrom((ContextSwitchContent) parcel.readParcelable(ContextSwitchContent.class.getClassLoader()));
        }
    }

    /* JADX INFO: compiled from: ContextSwitchContent.kt */
    public static final class CREATOR implements Parcelable.Creator<ContextSwitchContent> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(k kVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextSwitchContent createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new ContextSwitchContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContextSwitchContent[] newArray(int i10) {
            return new ContextSwitchContent[i10];
        }
    }

    public /* synthetic */ ContextSwitchContent(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getContextID() {
        return this.contextID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        t.f(out, "out");
        out.writeString(this.contextID);
    }

    private ContextSwitchContent(Builder builder) {
        this.contextID = builder.getContextID$facebook_gamingservices_release();
    }

    public ContextSwitchContent(Parcel parcel) {
        t.f(parcel, "parcel");
        this.contextID = parcel.readString();
    }
}
