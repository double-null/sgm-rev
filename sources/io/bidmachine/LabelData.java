package io.bidmachine;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: LabelData.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class LabelData {
    private final float heightDp;
    private final Bitmap image;
    private final PositionData positionData;
    private final float widthDp;

    public LabelData(float f10, float f11, Bitmap image, PositionData positionData) {
        kotlin.jvm.internal.t.f(image, "image");
        kotlin.jvm.internal.t.f(positionData, "positionData");
        this.widthDp = f10;
        this.heightDp = f11;
        this.image = image;
        this.positionData = positionData;
    }

    public static /* synthetic */ LabelData copy$default(LabelData labelData, float f10, float f11, Bitmap bitmap, PositionData positionData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = labelData.widthDp;
        }
        if ((i10 & 2) != 0) {
            f11 = labelData.heightDp;
        }
        if ((i10 & 4) != 0) {
            bitmap = labelData.image;
        }
        if ((i10 & 8) != 0) {
            positionData = labelData.positionData;
        }
        return labelData.copy(f10, f11, bitmap, positionData);
    }

    public final float component1() {
        return this.widthDp;
    }

    public final float component2() {
        return this.heightDp;
    }

    public final Bitmap component3() {
        return this.image;
    }

    public final PositionData component4() {
        return this.positionData;
    }

    public final LabelData copy(float f10, float f11, Bitmap image, PositionData positionData) {
        kotlin.jvm.internal.t.f(image, "image");
        kotlin.jvm.internal.t.f(positionData, "positionData");
        return new LabelData(f10, f11, image, positionData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelData)) {
            return false;
        }
        LabelData labelData = (LabelData) obj;
        return Float.compare(this.widthDp, labelData.widthDp) == 0 && Float.compare(this.heightDp, labelData.heightDp) == 0 && kotlin.jvm.internal.t.a(this.image, labelData.image) && this.positionData == labelData.positionData;
    }

    public final float getHeightDp() {
        return this.heightDp;
    }

    public final Bitmap getImage() {
        return this.image;
    }

    public final PositionData getPositionData() {
        return this.positionData;
    }

    public final float getWidthDp() {
        return this.widthDp;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.widthDp) * 31) + Float.hashCode(this.heightDp)) * 31) + this.image.hashCode()) * 31) + this.positionData.hashCode();
    }

    public String toString() {
        return "LabelData(widthDp=" + this.widthDp + ", heightDp=" + this.heightDp + ", image=" + this.image + ", positionData=" + this.positionData + ')';
    }
}
