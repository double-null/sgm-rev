package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.l0;

/* JADX INFO: loaded from: classes.dex */
public enum NativeImageAssetType implements l0.c {
    NATIVE_IMAGE_ASSET_TYPE_INVALID(0),
    NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE(1),
    NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE(3),
    UNRECOGNIZED(-1);

    public static final int NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE_VALUE = 1;
    public static final int NATIVE_IMAGE_ASSET_TYPE_INVALID_VALUE = 0;
    public static final int NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE_VALUE = 3;
    private final int value;
    private static final l0.d<NativeImageAssetType> internalValueMap = new l0.d<NativeImageAssetType>() { // from class: com.explorestack.protobuf.adcom.NativeImageAssetType.1
        @Override // com.explorestack.protobuf.l0.d
        public NativeImageAssetType findValueByNumber(int i10) {
            return NativeImageAssetType.forNumber(i10);
        }
    };
    private static final NativeImageAssetType[] VALUES = values();

    NativeImageAssetType(int i10) {
        this.value = i10;
    }

    public static NativeImageAssetType forNumber(int i10) {
        if (i10 == 0) {
            return NATIVE_IMAGE_ASSET_TYPE_INVALID;
        }
        if (i10 == 1) {
            return NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE;
        }
        if (i10 != 3) {
            return null;
        }
        return NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(21);
    }

    public static l0.d<NativeImageAssetType> internalGetValueMap() {
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
    public static NativeImageAssetType valueOf(int i10) {
        return forNumber(i10);
    }

    public static NativeImageAssetType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
