package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import kotlin.collections.u0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CameraEffectTextures.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CameraEffectTextures implements ShareModel {
    private final Bundle textures;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new Parcelable.Creator<CameraEffectTextures>() { // from class: com.facebook.share.model.CameraEffectTextures$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            t.f(parcel, "parcel");
            return new CameraEffectTextures(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraEffectTextures[] newArray(int i10) {
            return new CameraEffectTextures[i10];
        }
    };

    /* JADX INFO: compiled from: CameraEffectTextures.kt */
    public static final class Builder implements ShareModelBuilder<CameraEffectTextures, Builder> {
        private final Bundle textures = new Bundle();

        private final Builder putParcelableTexture(String str, Parcelable parcelable) {
            if ((str.length() > 0) && parcelable != null) {
                this.textures.putParcelable(str, parcelable);
            }
            return this;
        }

        public final Bundle getTextures$facebook_common_release() {
            return this.textures;
        }

        public final Builder putTexture(String key, Bitmap bitmap) {
            t.f(key, "key");
            return putParcelableTexture(key, bitmap);
        }

        @Override // com.facebook.share.ShareBuilder
        public CameraEffectTextures build() {
            return new CameraEffectTextures(this, null);
        }

        public final Builder putTexture(String key, Uri uri) {
            t.f(key, "key");
            return putParcelableTexture(key, uri);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.textures.putAll(cameraEffectTextures.textures);
            }
            return this;
        }

        public final Builder readFrom(Parcel parcel) {
            t.f(parcel, "parcel");
            return readFrom((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }
    }

    /* JADX INFO: compiled from: CameraEffectTextures.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ CameraEffectTextures(Builder builder, k kVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Object get(String str) {
        Bundle bundle = this.textures;
        if (bundle != null) {
            return bundle.get(str);
        }
        return null;
    }

    public final Bitmap getTextureBitmap(String str) {
        Bundle bundle = this.textures;
        Object obj = bundle != null ? bundle.get(str) : null;
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public final Uri getTextureUri(String str) {
        Bundle bundle = this.textures;
        Object obj = bundle != null ? bundle.get(str) : null;
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    public final Set<String> keySet() {
        Bundle bundle = this.textures;
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        return setKeySet == null ? u0.e() : setKeySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        t.f(out, "out");
        out.writeBundle(this.textures);
    }

    private CameraEffectTextures(Builder builder) {
        this.textures = builder.getTextures$facebook_common_release();
    }

    public CameraEffectTextures(Parcel parcel) {
        t.f(parcel, "parcel");
        this.textures = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }
}
