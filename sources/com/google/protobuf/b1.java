package com.google.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: OneofInfo.java */
/* JADX INFO: loaded from: classes4.dex */
final class b1 {
    private final Field caseField;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f12457id;
    private final Field valueField;

    public b1(int i10, Field field, Field field2) {
        this.f12457id = i10;
        this.caseField = field;
        this.valueField = field2;
    }

    public Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f12457id;
    }

    public Field getValueField() {
        return this.valueField;
    }
}
