package com.explorestack.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f10168a;

    public UninitializedMessageException(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f10168a = null;
    }

    private static String c(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public UninitializedMessageException(List<String> list) {
        super(c(list));
        this.f10168a = list;
    }
}
