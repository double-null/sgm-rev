package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.l0;

/* JADX INFO: loaded from: classes4.dex */
public enum WatermarkAlgorithm implements l0.c {
    WM_ALGO_UNSPECIFIED(0),
    WM_ALGO_RGB_STRIP(1),
    UNRECOGNIZED(-1);

    public static final int WM_ALGO_RGB_STRIP_VALUE = 1;
    public static final int WM_ALGO_UNSPECIFIED_VALUE = 0;
    private final int value;
    private static final l0.d<WatermarkAlgorithm> internalValueMap = new l0.d<WatermarkAlgorithm>() { // from class: io.bidmachine.protobuf.rendering.WatermarkAlgorithm.1
        @Override // com.explorestack.protobuf.l0.d
        public WatermarkAlgorithm findValueByNumber(int i10) {
            return WatermarkAlgorithm.forNumber(i10);
        }
    };
    private static final WatermarkAlgorithm[] VALUES = values();

    WatermarkAlgorithm(int i10) {
        this.value = i10;
    }

    public static WatermarkAlgorithm forNumber(int i10) {
        if (i10 == 0) {
            return WM_ALGO_UNSPECIFIED;
        }
        if (i10 != 1) {
            return null;
        }
        return WM_ALGO_RGB_STRIP;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return RenderingProto.getDescriptor().getEnumTypes().get(0);
    }

    public static l0.d<WatermarkAlgorithm> internalGetValueMap() {
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
    public static WatermarkAlgorithm valueOf(int i10) {
        return forNumber(i10);
    }

    public static WatermarkAlgorithm valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
