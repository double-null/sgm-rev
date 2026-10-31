package com.facebook.appevents.iap;

import java.util.Currency;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: InAppPurchase.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InAppPurchase {
    private final double amount;
    private final Currency currency;
    private final String eventName;

    public InAppPurchase(String eventName, double d10, Currency currency) {
        t.f(eventName, "eventName");
        t.f(currency, "currency");
        this.eventName = eventName;
        this.amount = d10;
        this.currency = currency;
    }

    public static /* synthetic */ InAppPurchase copy$default(InAppPurchase inAppPurchase, String str, double d10, Currency currency, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inAppPurchase.eventName;
        }
        if ((i10 & 2) != 0) {
            d10 = inAppPurchase.amount;
        }
        if ((i10 & 4) != 0) {
            currency = inAppPurchase.currency;
        }
        return inAppPurchase.copy(str, d10, currency);
    }

    public final String component1() {
        return this.eventName;
    }

    public final double component2() {
        return this.amount;
    }

    public final Currency component3() {
        return this.currency;
    }

    public final InAppPurchase copy(String eventName, double d10, Currency currency) {
        t.f(eventName, "eventName");
        t.f(currency, "currency");
        return new InAppPurchase(eventName, d10, currency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppPurchase)) {
            return false;
        }
        InAppPurchase inAppPurchase = (InAppPurchase) obj;
        return t.a(this.eventName, inAppPurchase.eventName) && Double.compare(this.amount, inAppPurchase.amount) == 0 && t.a(this.currency, inAppPurchase.currency);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return (((this.eventName.hashCode() * 31) + Double.hashCode(this.amount)) * 31) + this.currency.hashCode();
    }

    public String toString() {
        return "InAppPurchase(eventName=" + this.eventName + ", amount=" + this.amount + ", currency=" + this.currency + ')';
    }
}
