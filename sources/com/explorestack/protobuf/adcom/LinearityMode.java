package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.l0;

/* JADX INFO: loaded from: classes.dex */
public enum LinearityMode implements l0.c {
    LINEARITY_MODE_INVALID(0),
    LINEARITY_MODE_LINEAR(1),
    LINEARITY_MODE_NON_LINEAR(2),
    UNRECOGNIZED(-1);

    public static final int LINEARITY_MODE_INVALID_VALUE = 0;
    public static final int LINEARITY_MODE_LINEAR_VALUE = 1;
    public static final int LINEARITY_MODE_NON_LINEAR_VALUE = 2;
    private final int value;
    private static final l0.d<LinearityMode> internalValueMap = new l0.d<LinearityMode>() { // from class: com.explorestack.protobuf.adcom.LinearityMode.a
        @Override // com.explorestack.protobuf.l0.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinearityMode findValueByNumber(int i10) {
            return LinearityMode.forNumber(i10);
        }
    };
    private static final LinearityMode[] VALUES = values();

    LinearityMode(int i10) {
        this.value = i10;
    }

    public static LinearityMode forNumber(int i10) {
        if (i10 == 0) {
            return LINEARITY_MODE_INVALID;
        }
        if (i10 == 1) {
            return LINEARITY_MODE_LINEAR;
        }
        if (i10 != 2) {
            return null;
        }
        return LINEARITY_MODE_NON_LINEAR;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(17);
    }

    public static l0.d<LinearityMode> internalGetValueMap() {
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
    public static LinearityMode valueOf(int i10) {
        return forNumber(i10);
    }

    public static LinearityMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
