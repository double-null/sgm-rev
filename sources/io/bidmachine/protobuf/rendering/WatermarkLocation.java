package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.l0;

/* JADX INFO: loaded from: classes4.dex */
public enum WatermarkLocation implements l0.c {
    WM_LOCATION_UNSPECIFIED(0),
    WM_LOCATION_TOP_LEFT(1),
    WM_LOCATION_TOP_CENTER(2),
    WM_LOCATION_TOP_RIGHT(3),
    WM_LOCATION_BOTTOM_LEFT(4),
    WM_LOCATION_BOTTOM_CENTER(5),
    WM_LOCATION_BOTTOM_RIGHT(6),
    UNRECOGNIZED(-1);

    public static final int WM_LOCATION_BOTTOM_CENTER_VALUE = 5;
    public static final int WM_LOCATION_BOTTOM_LEFT_VALUE = 4;
    public static final int WM_LOCATION_BOTTOM_RIGHT_VALUE = 6;
    public static final int WM_LOCATION_TOP_CENTER_VALUE = 2;
    public static final int WM_LOCATION_TOP_LEFT_VALUE = 1;
    public static final int WM_LOCATION_TOP_RIGHT_VALUE = 3;
    public static final int WM_LOCATION_UNSPECIFIED_VALUE = 0;
    private final int value;
    private static final l0.d<WatermarkLocation> internalValueMap = new l0.d<WatermarkLocation>() { // from class: io.bidmachine.protobuf.rendering.WatermarkLocation.1
        @Override // com.explorestack.protobuf.l0.d
        public WatermarkLocation findValueByNumber(int i10) {
            return WatermarkLocation.forNumber(i10);
        }
    };
    private static final WatermarkLocation[] VALUES = values();

    WatermarkLocation(int i10) {
        this.value = i10;
    }

    public static WatermarkLocation forNumber(int i10) {
        switch (i10) {
            case 0:
                return WM_LOCATION_UNSPECIFIED;
            case 1:
                return WM_LOCATION_TOP_LEFT;
            case 2:
                return WM_LOCATION_TOP_CENTER;
            case 3:
                return WM_LOCATION_TOP_RIGHT;
            case 4:
                return WM_LOCATION_BOTTOM_LEFT;
            case 5:
                return WM_LOCATION_BOTTOM_CENTER;
            case 6:
                return WM_LOCATION_BOTTOM_RIGHT;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return RenderingProto.getDescriptor().getEnumTypes().get(2);
    }

    public static l0.d<WatermarkLocation> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.explorestack.protobuf.l0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static WatermarkLocation valueOf(int i10) {
        return forNumber(i10);
    }

    public static WatermarkLocation valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
