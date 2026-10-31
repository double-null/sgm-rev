package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.l0;

/* JADX INFO: loaded from: classes4.dex */
public enum WatermarkPayloadType implements l0.c {
    WM_PAYLOAD_UNSPECIFIED(0),
    WM_PAYLOAD_BID_ID(1),
    WM_PAYLOAD_RAW_CRID(2),
    UNRECOGNIZED(-1);

    public static final int WM_PAYLOAD_BID_ID_VALUE = 1;
    public static final int WM_PAYLOAD_RAW_CRID_VALUE = 2;
    public static final int WM_PAYLOAD_UNSPECIFIED_VALUE = 0;
    private final int value;
    private static final l0.d<WatermarkPayloadType> internalValueMap = new l0.d<WatermarkPayloadType>() { // from class: io.bidmachine.protobuf.rendering.WatermarkPayloadType.1
        @Override // com.explorestack.protobuf.l0.d
        public WatermarkPayloadType findValueByNumber(int i10) {
            return WatermarkPayloadType.forNumber(i10);
        }
    };
    private static final WatermarkPayloadType[] VALUES = values();

    WatermarkPayloadType(int i10) {
        this.value = i10;
    }

    public static WatermarkPayloadType forNumber(int i10) {
        if (i10 == 0) {
            return WM_PAYLOAD_UNSPECIFIED;
        }
        if (i10 == 1) {
            return WM_PAYLOAD_BID_ID;
        }
        if (i10 != 2) {
            return null;
        }
        return WM_PAYLOAD_RAW_CRID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return RenderingProto.getDescriptor().getEnumTypes().get(1);
    }

    public static l0.d<WatermarkPayloadType> internalGetValueMap() {
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
    public static WatermarkPayloadType valueOf(int i10) {
        return forNumber(i10);
    }

    public static WatermarkPayloadType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
