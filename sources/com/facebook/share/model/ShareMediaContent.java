package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ShareMediaContent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Builder> {
    private final List<ShareMedia<?, ?>> media;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new Parcelable.Creator<ShareMediaContent>() { // from class: com.facebook.share.model.ShareMediaContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareMediaContent createFromParcel(Parcel source) {
            t.f(source, "source");
            return new ShareMediaContent(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareMediaContent[] newArray(int i10) {
            return new ShareMediaContent[i10];
        }
    };

    /* JADX INFO: compiled from: ShareMediaContent.kt */
    public static final class Builder extends ShareContent.Builder<ShareMediaContent, Builder> {
        private final List<ShareMedia<?, ?>> media = new ArrayList();

        public final Builder addMedia(List<? extends ShareMedia<?, ?>> list) {
            if (list != null) {
                Iterator<? extends ShareMedia<?, ?>> it = list.iterator();
                while (it.hasNext()) {
                    addMedium(it.next());
                }
            }
            return this;
        }

        public final Builder addMedium(ShareMedia<?, ?> shareMedia) {
            ShareMedia<?, ?> shareMediaBuild;
            if (shareMedia != null) {
                if (shareMedia instanceof SharePhoto) {
                    shareMediaBuild = new SharePhoto.Builder().readFrom((SharePhoto) shareMedia).build();
                } else {
                    if (!(shareMedia instanceof ShareVideo)) {
                        throw new IllegalArgumentException("medium must be either a SharePhoto or ShareVideo");
                    }
                    shareMediaBuild = new ShareVideo.Builder().readFrom((ShareVideo) shareMedia).build();
                }
                this.media.add(shareMediaBuild);
            }
            return this;
        }

        public final List<ShareMedia<?, ?>> getMedia$facebook_common_release() {
            return this.media;
        }

        public final Builder setMedia(List<? extends ShareMedia<?, ?>> list) {
            this.media.clear();
            addMedia(list);
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ShareMediaContent build() {
            return new ShareMediaContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareMediaContent shareMediaContent) {
            return shareMediaContent == null ? this : ((Builder) super.readFrom(shareMediaContent)).addMedia(shareMediaContent.getMedia());
        }
    }

    /* JADX INFO: compiled from: ShareMediaContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public /* synthetic */ ShareMediaContent(Builder builder, k kVar) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<ShareMedia<?, ?>> getMedia() {
        return this.media;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        t.f(out, "out");
        super.writeToParcel(out, i10);
        out.writeParcelableArray((Parcelable[]) this.media.toArray(new ShareMedia[0]), i10);
    }

    private ShareMediaContent(Builder builder) {
        super(builder);
        this.media = b0.p0(builder.getMedia$facebook_common_release());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMediaContent(Parcel source) {
        List<ShareMedia<?, ?>> listK;
        super(source);
        t.f(source, "source");
        Parcelable[] parcelableArray = source.readParcelableArray(ShareMedia.class.getClassLoader());
        if (parcelableArray == null) {
            listK = kotlin.collections.t.k();
        } else {
            listK = new ArrayList<>();
            for (Parcelable parcelable : parcelableArray) {
                ShareMedia<?, ?> shareMedia = (ShareMedia) parcelable;
                if (shareMedia != null) {
                    listK.add(shareMedia);
                }
            }
        }
        this.media = listK;
    }
}
