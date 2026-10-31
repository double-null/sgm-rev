package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import kotlin.collections.u0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CameraEffectArguments.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CameraEffectArguments implements ShareModel {
    private final Bundle params;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new Parcelable.Creator<CameraEffectArguments>() { // from class: com.facebook.share.model.CameraEffectArguments$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new CameraEffectArguments(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraEffectArguments[] newArray(int i10) {
            return new CameraEffectArguments[i10];
        }
    };

    /* JADX INFO: compiled from: CameraEffectArguments.kt */
    public static final class Builder implements ShareModelBuilder<CameraEffectArguments, Builder> {
        private final Bundle params = new Bundle();

        public final Bundle getParams$facebook_common_release() {
            return this.params;
        }

        public final Builder putArgument(String key, String value) {
            t.f(key, "key");
            t.f(value, "value");
            this.params.putString(key, value);
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public CameraEffectArguments build() {
            return new CameraEffectArguments(this, null);
        }

        public final Builder putArgument(String key, String[] arrayValue) {
            t.f(key, "key");
            t.f(arrayValue, "arrayValue");
            this.params.putStringArray(key, arrayValue);
            return this;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.params.putAll(cameraEffectArguments.params);
            }
            return this;
        }

        public final Builder readFrom(Parcel parcel) {
            t.f(parcel, "parcel");
            return readFrom((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }
    }

    /* JADX INFO: compiled from: CameraEffectArguments.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CameraEffectArguments(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Object get(String str) {
        Bundle bundle = this.params;
        if (bundle != null) {
            return bundle.get(str);
        }
        return null;
    }

    public final String getString(String str) {
        Bundle bundle = this.params;
        if (bundle != null) {
            return bundle.getString(str);
        }
        return null;
    }

    public final String[] getStringArray(String str) {
        Bundle bundle = this.params;
        if (bundle != null) {
            return bundle.getStringArray(str);
        }
        return null;
    }

    public final Set<String> keySet() {
        Bundle bundle = this.params;
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        return setKeySet == null ? u0.e() : setKeySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        t.f(out, "out");
        out.writeBundle(this.params);
    }

    private CameraEffectArguments(Builder builder) {
        this.params = builder.getParams$facebook_common_release();
    }

    public CameraEffectArguments(Parcel parcel) {
        t.f(parcel, "parcel");
        this.params = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }
}
