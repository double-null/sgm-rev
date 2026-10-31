package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.l0;

/* JADX INFO: loaded from: classes.dex */
public enum NativeDataAssetType implements l0.c {
    NATIVE_DATA_ASSET_TYPE_INVALID(0),
    NATIVE_DATA_ASSET_TYPE_SPONSORED(1),
    NATIVE_DATA_ASSET_TYPE_DESC(2),
    NATIVE_DATA_ASSET_TYPE_RATING(3),
    NATIVE_DATA_ASSET_TYPE_LIKES(4),
    NATIVE_DATA_ASSET_TYPE_DOWNLOADS(5),
    NATIVE_DATA_ASSET_TYPE_PRICE(6),
    NATIVE_DATA_ASSET_TYPE_SALE_PRICE(7),
    NATIVE_DATA_ASSET_TYPE_PHONE(8),
    NATIVE_DATA_ASSET_TYPE_ADDRESS(9),
    NATIVE_DATA_ASSET_TYPE_DESC2(10),
    NATIVE_DATA_ASSET_TYPE_DISPLAY_URL(11),
    NATIVE_DATA_ASSET_TYPE_CTA_TEXT(12),
    NATIVE_DATA_ASSET_TYPE_PRIVACY_SHEET(13),
    NATIVE_DATA_ASSET_TYPE_DISCLAIMER(14),
    UNRECOGNIZED(-1);

    public static final int NATIVE_DATA_ASSET_TYPE_ADDRESS_VALUE = 9;
    public static final int NATIVE_DATA_ASSET_TYPE_CTA_TEXT_VALUE = 12;
    public static final int NATIVE_DATA_ASSET_TYPE_DESC2_VALUE = 10;
    public static final int NATIVE_DATA_ASSET_TYPE_DESC_VALUE = 2;
    public static final int NATIVE_DATA_ASSET_TYPE_DISCLAIMER_VALUE = 14;
    public static final int NATIVE_DATA_ASSET_TYPE_DISPLAY_URL_VALUE = 11;
    public static final int NATIVE_DATA_ASSET_TYPE_DOWNLOADS_VALUE = 5;
    public static final int NATIVE_DATA_ASSET_TYPE_INVALID_VALUE = 0;
    public static final int NATIVE_DATA_ASSET_TYPE_LIKES_VALUE = 4;
    public static final int NATIVE_DATA_ASSET_TYPE_PHONE_VALUE = 8;
    public static final int NATIVE_DATA_ASSET_TYPE_PRICE_VALUE = 6;
    public static final int NATIVE_DATA_ASSET_TYPE_PRIVACY_SHEET_VALUE = 13;
    public static final int NATIVE_DATA_ASSET_TYPE_RATING_VALUE = 3;
    public static final int NATIVE_DATA_ASSET_TYPE_SALE_PRICE_VALUE = 7;
    public static final int NATIVE_DATA_ASSET_TYPE_SPONSORED_VALUE = 1;
    private final int value;
    private static final l0.d<NativeDataAssetType> internalValueMap = new l0.d<NativeDataAssetType>() { // from class: com.explorestack.protobuf.adcom.NativeDataAssetType.1
        @Override // com.explorestack.protobuf.l0.d
        public NativeDataAssetType findValueByNumber(int i10) {
            return NativeDataAssetType.forNumber(i10);
        }
    };
    private static final NativeDataAssetType[] VALUES = values();

    NativeDataAssetType(int i10) {
        this.value = i10;
    }

    public static NativeDataAssetType forNumber(int i10) {
        switch (i10) {
            case 0:
                return NATIVE_DATA_ASSET_TYPE_INVALID;
            case 1:
                return NATIVE_DATA_ASSET_TYPE_SPONSORED;
            case 2:
                return NATIVE_DATA_ASSET_TYPE_DESC;
            case 3:
                return NATIVE_DATA_ASSET_TYPE_RATING;
            case 4:
                return NATIVE_DATA_ASSET_TYPE_LIKES;
            case 5:
                return NATIVE_DATA_ASSET_TYPE_DOWNLOADS;
            case 6:
                return NATIVE_DATA_ASSET_TYPE_PRICE;
            case 7:
                return NATIVE_DATA_ASSET_TYPE_SALE_PRICE;
            case 8:
                return NATIVE_DATA_ASSET_TYPE_PHONE;
            case 9:
                return NATIVE_DATA_ASSET_TYPE_ADDRESS;
            case 10:
                return NATIVE_DATA_ASSET_TYPE_DESC2;
            case 11:
                return NATIVE_DATA_ASSET_TYPE_DISPLAY_URL;
            case 12:
                return NATIVE_DATA_ASSET_TYPE_CTA_TEXT;
            case 13:
                return NATIVE_DATA_ASSET_TYPE_PRIVACY_SHEET;
            case 14:
                return NATIVE_DATA_ASSET_TYPE_DISCLAIMER;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.a().getEnumTypes().get(20);
    }

    public static l0.d<NativeDataAssetType> internalGetValueMap() {
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
    public static NativeDataAssetType valueOf(int i10) {
        return forNumber(i10);
    }

    public static NativeDataAssetType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
