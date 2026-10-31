package b7;

import com.explorestack.protobuf.adcom.NativeAssetPosition;
import io.bidmachine.PositionData;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PositionDataMapper.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: compiled from: PositionDataMapper.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeAssetPosition.values().length];
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NativeAssetPosition.ASSET_POSITION_BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final PositionData a(NativeAssetPosition data) {
        PositionData positionData;
        t.f(data, "data");
        try {
            int i10 = a.$EnumSwitchMapping$0[data.ordinal()];
            if (i10 == 1) {
                positionData = PositionData.TopLeft;
            } else if (i10 == 2) {
                positionData = PositionData.TopRight;
            } else if (i10 == 3) {
                positionData = PositionData.BottomLeft;
            } else {
                if (i10 != 4) {
                    return null;
                }
                positionData = PositionData.BottomRight;
            }
            return positionData;
        } catch (Throwable unused) {
            return null;
        }
    }
}
