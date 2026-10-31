package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: AppGroupCreationContent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppGroupCreationContent implements ShareModel {
    private final AppGroupPrivacy appGroupPrivacy;
    private final String description;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new Parcelable.Creator<AppGroupCreationContent>() { // from class: com.facebook.share.model.AppGroupCreationContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppGroupCreationContent createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new AppGroupCreationContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppGroupCreationContent[] newArray(int i10) {
            return new AppGroupCreationContent[i10];
        }
    };

    /* JADX INFO: compiled from: AppGroupCreationContent.kt */
    public enum AppGroupPrivacy {
        Open,
        Closed
    }

    /* JADX INFO: compiled from: AppGroupCreationContent.kt */
    public static final class Builder implements ShareModelBuilder<AppGroupCreationContent, Builder> {
        private AppGroupPrivacy appGroupPrivacy;
        private String description;
        private String name;

        public final AppGroupPrivacy getAppGroupPrivacy$facebook_common_release() {
            return this.appGroupPrivacy;
        }

        public final String getDescription$facebook_common_release() {
            return this.description;
        }

        public final String getName$facebook_common_release() {
            return this.name;
        }

        public final Builder setAppGroupPrivacy(AppGroupPrivacy appGroupPrivacy) {
            this.appGroupPrivacy = appGroupPrivacy;
            return this;
        }

        public final void setAppGroupPrivacy$facebook_common_release(AppGroupPrivacy appGroupPrivacy) {
            this.appGroupPrivacy = appGroupPrivacy;
        }

        public final Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public final void setDescription$facebook_common_release(String str) {
            this.description = str;
        }

        public final Builder setName(String str) {
            this.name = str;
            return this;
        }

        public final void setName$facebook_common_release(String str) {
            this.name = str;
        }

        @Override // com.facebook.share.ShareBuilder
        public AppGroupCreationContent build() {
            return new AppGroupCreationContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(AppGroupCreationContent appGroupCreationContent) {
            return appGroupCreationContent == null ? this : setName(appGroupCreationContent.getName()).setDescription(appGroupCreationContent.getDescription()).setAppGroupPrivacy(appGroupCreationContent.getAppGroupPrivacy());
        }
    }

    /* JADX INFO: compiled from: AppGroupCreationContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ AppGroupCreationContent(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final AppGroupPrivacy getAppGroupPrivacy() {
        return this.appGroupPrivacy;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        t.f(out, "out");
        out.writeString(this.name);
        out.writeString(this.description);
        out.writeSerializable(this.appGroupPrivacy);
    }

    private AppGroupCreationContent(Builder builder) {
        this.name = builder.getName$facebook_common_release();
        this.description = builder.getDescription$facebook_common_release();
        this.appGroupPrivacy = builder.getAppGroupPrivacy$facebook_common_release();
    }

    public AppGroupCreationContent(Parcel parcel) {
        t.f(parcel, "parcel");
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.appGroupPrivacy = (AppGroupPrivacy) parcel.readSerializable();
    }
}
