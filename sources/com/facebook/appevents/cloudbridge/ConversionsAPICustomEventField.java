package com.facebook.appevents.cloudbridge;

import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsConstants;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
/* JADX INFO: loaded from: classes.dex */
public enum ConversionsAPICustomEventField {
    VALUE_TO_SUM("value"),
    EVENT_TIME("event_time"),
    EVENT_NAME("event_name"),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE("content_type"),
    DESCRIPTION("description"),
    LEVEL(AppLovinEventTypes.USER_COMPLETED_LEVEL),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS(GraphResponse.SUCCESS_KEY),
    ORDER_ID("order_id"),
    AD_TYPE(AppEventsConstants.EVENT_PARAM_AD_TYPE),
    CURRENCY(AppLovinEventParameters.REVENUE_CURRENCY);

    private final String rawValue;

    ConversionsAPICustomEventField(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
