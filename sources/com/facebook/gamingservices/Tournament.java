package com.facebook.gamingservices;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.DateFormatter;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Tournament.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Tournament implements ShareModel {
    public static final CREATOR CREATOR = new CREATOR(null);

    @h4.c("tournament_end_time")
    public String endTime;

    @h4.c("id")
    public final String identifier;

    @h4.c(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD)
    public final String payload;

    @h4.c(SDKConstants.PARAM_TOURNAMENTS_TITLE)
    public final String title;

    /* JADX INFO: compiled from: Tournament.kt */
    public static final class Builder implements ShareModelBuilder<Tournament, Builder> {
        private String endTime;
        private ZonedDateTime expiration;
        private String identifier;
        private String payload;
        private String title;

        public Builder(String identifier, ZonedDateTime zonedDateTime, String str, String str2) {
            t.f(identifier, "identifier");
            this.identifier = identifier;
            this.expiration = zonedDateTime;
            this.title = str;
            this.payload = str2;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, ZonedDateTime zonedDateTime, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = builder.identifier;
            }
            if ((i10 & 2) != 0) {
                zonedDateTime = builder.expiration;
            }
            if ((i10 & 4) != 0) {
                str2 = builder.title;
            }
            if ((i10 & 8) != 0) {
                str3 = builder.payload;
            }
            return builder.copy(str, zonedDateTime, str2, str3);
        }

        public final String component1() {
            return this.identifier;
        }

        public final ZonedDateTime component2() {
            return this.expiration;
        }

        public final String component3() {
            return this.title;
        }

        public final String component4() {
            return this.payload;
        }

        public final Builder copy(String identifier, ZonedDateTime zonedDateTime, String str, String str2) {
            t.f(identifier, "identifier");
            return new Builder(identifier, zonedDateTime, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return t.a(this.identifier, builder.identifier) && t.a(this.expiration, builder.expiration) && t.a(this.title, builder.title) && t.a(this.payload, builder.payload);
        }

        public final Builder expiration(ZonedDateTime zonedDateTime) {
            this.expiration = zonedDateTime;
            if (Build.VERSION.SDK_INT >= 26 && zonedDateTime != null) {
                this.endTime = zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
            }
            return this;
        }

        public final String getEndTime() {
            return this.endTime;
        }

        public final ZonedDateTime getExpiration() {
            return this.expiration;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getPayload() {
            return this.payload;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.identifier.hashCode() * 31;
            ZonedDateTime zonedDateTime = this.expiration;
            int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.payload;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final Builder identifier(String identifier) {
            t.f(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public final Builder payload(String str) {
            this.payload = str;
            return this;
        }

        public final void setEndTime(String str) {
            this.endTime = str;
        }

        public final void setExpiration(ZonedDateTime zonedDateTime) {
            this.expiration = zonedDateTime;
        }

        public final void setIdentifier(String str) {
            t.f(str, "<set-?>");
            this.identifier = str;
        }

        public final void setPayload(String str) {
            this.payload = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public String toString() {
            return "Builder(identifier=" + this.identifier + ", expiration=" + this.expiration + ", title=" + this.title + ", payload=" + this.payload + ')';
        }

        @Override // com.facebook.share.ShareBuilder
        public Tournament build() {
            return new Tournament(this.identifier, this.endTime, this.title, this.payload);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(Tournament tournament) {
            Builder builderPayload;
            return (tournament == null || (builderPayload = identifier(tournament.identifier).expiration(tournament.getExpiration()).title(tournament.title).payload(tournament.payload)) == null) ? this : builderPayload;
        }

        public /* synthetic */ Builder(String str, ZonedDateTime zonedDateTime, String str2, String str3, int i10, kotlin.jvm.internal.k kVar) {
            this(str, (i10 & 2) != 0 ? null : zonedDateTime, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
        }
    }

    /* JADX INFO: compiled from: Tournament.kt */
    public static final class CREATOR implements Parcelable.Creator<Tournament> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Tournament createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new Tournament(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Tournament[] newArray(int i10) {
            return new Tournament[i10];
        }
    }

    public Tournament(String identifier, String str, String str2, String str3) {
        t.f(identifier, "identifier");
        this.identifier = identifier;
        this.endTime = str;
        this.title = str2;
        this.payload = str3;
        setExpiration(str != null ? DateFormatter.INSTANCE.format$facebook_gamingservices_release(str) : null);
    }

    private final void setExpiration(ZonedDateTime zonedDateTime) {
        if (Build.VERSION.SDK_INT < 26 || zonedDateTime == null) {
            return;
        }
        this.endTime = zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        setExpiration(zonedDateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ZonedDateTime getExpiration() {
        String str = this.endTime;
        if (str != null) {
            return DateFormatter.INSTANCE.format$facebook_gamingservices_release(str);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        t.f(out, "out");
        out.writeString(this.identifier);
        out.writeString(this.endTime);
        out.writeString(this.title);
        out.writeString(this.payload);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Tournament(Parcel parcel) {
        this(parcel.toString(), parcel.toString(), parcel.toString(), parcel.toString());
        t.f(parcel, "parcel");
    }
}
