package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.l0;

/* JADX INFO: loaded from: classes.dex */
public enum SizeUnit implements l0.c {
    SIZE_UNIT_INVALID(0),
    SIZE_UNIT_DIPS(1),
    SIZE_UNIT_INCHES(2),
    SIZE_UNIT_CENTIMETERS(3),
    UNRECOGNIZED(-1);

    public static final int SIZE_UNIT_CENTIMETERS_VALUE = 3;
    public static final int SIZE_UNIT_DIPS_VALUE = 1;
    public static final int SIZE_UNIT_INCHES_VALUE = 2;
    public static final int SIZE_UNIT_INVALID_VALUE = 0;
    private final int value;
    private static final l0.d<SizeUnit> internalValueMap = new l0.d<SizeUnit>() { // from class: com.explorestack.protobuf.adcom.SizeUnit.1
        @Override // com.explorestack.protobuf.l0.d
        public SizeUnit findValueByNumber(int i10) {
            return SizeUnit.forNumber(i10);
        }
    };
    private static final SizeUnit[] VALUES = values();

    SizeUnit(int i10) {
        this.value = i10;
    }

    public static SizeUnit forNumber(int i10) {
        if (i10 == 0) {
            return SIZE_UNIT_INVALID;
        }
        if (i10 == 1) {
            return SIZE_UNIT_DIPS;
        }
        if (i10 == 2) {
            return SIZE_UNIT_INCHES;
        }
        if (i10 != 3) {
            return null;
        }
        return SIZE_UNIT_CENTIMETERS;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(28);
    }

    public static l0.d<SizeUnit> internalGetValueMap() {
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
    public static SizeUnit valueOf(int i10) {
        return forNumber(i10);
    }

    public static SizeUnit valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
