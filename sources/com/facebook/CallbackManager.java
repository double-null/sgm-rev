package com.facebook;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;

/* JADX INFO: compiled from: CallbackManager.kt */
/* JADX INFO: loaded from: classes.dex */
public interface CallbackManager {

    /* JADX INFO: compiled from: CallbackManager.kt */
    public static final class ActivityResultParameters {
        private final Intent data;
        private final int requestCode;
        private final int resultCode;

        public ActivityResultParameters(int i10, int i11, Intent intent) {
            this.requestCode = i10;
            this.resultCode = i11;
            this.data = intent;
        }

        public static /* synthetic */ ActivityResultParameters copy$default(ActivityResultParameters activityResultParameters, int i10, int i11, Intent intent, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = activityResultParameters.requestCode;
            }
            if ((i12 & 2) != 0) {
                i11 = activityResultParameters.resultCode;
            }
            if ((i12 & 4) != 0) {
                intent = activityResultParameters.data;
            }
            return activityResultParameters.copy(i10, i11, intent);
        }

        public final int component1() {
            return this.requestCode;
        }

        public final int component2() {
            return this.resultCode;
        }

        public final Intent component3() {
            return this.data;
        }

        public final ActivityResultParameters copy(int i10, int i11, Intent intent) {
            return new ActivityResultParameters(i10, i11, intent);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityResultParameters)) {
                return false;
            }
            ActivityResultParameters activityResultParameters = (ActivityResultParameters) obj;
            return this.requestCode == activityResultParameters.requestCode && this.resultCode == activityResultParameters.resultCode && kotlin.jvm.internal.t.a(this.data, activityResultParameters.data);
        }

        public final Intent getData() {
            return this.data;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public final int getResultCode() {
            return this.resultCode;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.requestCode) * 31) + Integer.hashCode(this.resultCode)) * 31;
            Intent intent = this.data;
            return iHashCode + (intent == null ? 0 : intent.hashCode());
        }

        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.requestCode + ", resultCode=" + this.resultCode + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: compiled from: CallbackManager.kt */
    public static final class Factory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        public static final CallbackManager create() {
            return new CallbackManagerImpl();
        }
    }

    boolean onActivityResult(int i10, int i11, Intent intent);
}
