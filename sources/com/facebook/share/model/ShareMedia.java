package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.Builder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ShareMedia.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends Builder<M, B>> implements ShareModel {
    private final Bundle params;

    /* JADX INFO: compiled from: ShareMedia.kt */
    public static abstract class Builder<M extends ShareMedia<M, B>, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {
        public static final Companion Companion = new Companion(null);
        private Bundle params = new Bundle();

        /* JADX INFO: compiled from: ShareMedia.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final List<ShareMedia<?, ?>> readListFrom$facebook_common_release(Parcel parcel) {
                t.f(parcel, "parcel");
                Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
                if (parcelableArray == null) {
                    return kotlin.collections.t.k();
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    if (parcelable instanceof ShareMedia) {
                        arrayList.add(parcelable);
                    }
                }
                return arrayList;
            }

            public final void writeListTo$facebook_common_release(Parcel out, int i10, List<? extends ShareMedia<?, ?>> media) {
                t.f(out, "out");
                t.f(media, "media");
                out.writeParcelableArray((Parcelable[]) media.toArray(new ShareMedia[0]), i10);
            }
        }

        public final Bundle getParams$facebook_common_release() {
            return this.params;
        }

        public final B setParameter(String key, String value) {
            t.f(key, "key");
            t.f(value, "value");
            this.params.putString(key, value);
            t.d(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMedia.Builder");
            return this;
        }

        public final B setParameters(Bundle parameters) {
            t.f(parameters, "parameters");
            this.params.putAll(parameters);
            t.d(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMedia.Builder");
            return this;
        }

        public final void setParams$facebook_common_release(Bundle bundle) {
            t.f(bundle, "<set-?>");
            this.params = bundle;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public B readFrom(M m10) {
            if (m10 != null) {
                return (B) setParameters(((ShareMedia) m10).params);
            }
            t.d(this, "null cannot be cast to non-null type B of com.facebook.share.model.ShareMedia.Builder");
            return this;
        }
    }

    /* JADX INFO: compiled from: ShareMedia.kt */
    public enum Type {
        PHOTO,
        VIDEO
    }

    protected ShareMedia(Builder<M, B> builder) {
        t.f(builder, "builder");
        this.params = new Bundle(builder.getParams$facebook_common_release());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract Type getMediaType();

    public final Bundle getParameters() {
        return new Bundle(this.params);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        t.f(dest, "dest");
        dest.writeBundle(this.params);
    }

    public ShareMedia(Parcel parcel) {
        t.f(parcel, "parcel");
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.params = bundle == null ? new Bundle() : bundle;
    }
}
