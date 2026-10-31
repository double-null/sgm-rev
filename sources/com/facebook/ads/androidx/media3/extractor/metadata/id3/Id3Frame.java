package com.facebook.ads.androidx.media3.extractor.metadata.id3;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC05622c;
import com.facebook.ads.redexgen.core.C2298or;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String A00;

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9S() {
        return AbstractC05622c.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C2298or A9T() {
        return AbstractC05622c.A00(this);
    }

    public Id3Frame(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.A00;
    }
}
