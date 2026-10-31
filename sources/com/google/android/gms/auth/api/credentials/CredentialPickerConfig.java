package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zbb();
    final int zba;
    private final boolean zbb;
    private final boolean zbc;
    private final int zbd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    public static class Builder {
        private boolean zba = false;
        private boolean zbb = true;
        private int zbc = 1;

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(2, this.zba, this.zbb, false, this.zbc);
        }

        @Deprecated
        public Builder setForNewAccount(boolean z10) {
            this.zbc = true == z10 ? 3 : 1;
            return this;
        }

        public Builder setPrompt(int i10) {
            this.zbc = i10;
            return this;
        }

        public Builder setShowAddAccountButton(boolean z10) {
            this.zba = z10;
            return this;
        }

        public Builder setShowCancelButton(boolean z10) {
            this.zbb = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    CredentialPickerConfig(int i10, boolean z10, boolean z11, boolean z12, int i11) {
        this.zba = i10;
        this.zbb = z10;
        this.zbc = z11;
        if (i10 < 2) {
            this.zbd = true == z12 ? 3 : 1;
        } else {
            this.zbd = i11;
        }
    }

    @Deprecated
    public boolean isForNewAccount() {
        return this.zbd == 3;
    }

    public boolean shouldShowAddAccountButton() {
        return this.zbb;
    }

    public boolean shouldShowCancelButton() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        SafeParcelWriter.writeInt(parcel, 4, this.zbd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zba);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
