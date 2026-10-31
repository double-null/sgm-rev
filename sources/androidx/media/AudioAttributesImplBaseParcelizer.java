package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2999a = versionedParcel.p(audioAttributesImplBase.f2999a, 1);
        audioAttributesImplBase.f3000b = versionedParcel.p(audioAttributesImplBase.f3000b, 2);
        audioAttributesImplBase.f3001c = versionedParcel.p(audioAttributesImplBase.f3001c, 3);
        audioAttributesImplBase.f3002d = versionedParcel.p(audioAttributesImplBase.f3002d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.f2999a, 1);
        versionedParcel.F(audioAttributesImplBase.f3000b, 2);
        versionedParcel.F(audioAttributesImplBase.f3001c, 3);
        versionedParcel.F(audioAttributesImplBase.f3002d, 4);
    }
}
