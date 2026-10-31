package com.explorestack.protobuf;

import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: TypeRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f10781b = Logger.getLogger(q2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Descriptors.Descriptor> f10782a;

    /* JADX INFO: compiled from: TypeRegistry.java */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final q2 f10783a = new q2(Collections.emptyMap());
    }

    q2(Map<String, Descriptors.Descriptor> map) {
        this.f10782a = map;
    }

    public static q2 c() {
        return a.f10783a;
    }

    private static String d(String str) throws InvalidProtocolBufferException {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length != 1) {
            return strArrSplit[strArrSplit.length - 1];
        }
        throw new InvalidProtocolBufferException("Invalid type url found: " + str);
    }

    public Descriptors.Descriptor a(String str) {
        return this.f10782a.get(str);
    }

    public final Descriptors.Descriptor b(String str) throws InvalidProtocolBufferException {
        return a(d(str));
    }
}
