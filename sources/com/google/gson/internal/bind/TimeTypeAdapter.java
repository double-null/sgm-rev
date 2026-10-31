package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import g4.f;
import g4.s;
import g4.t;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeTypeAdapter extends s<Time> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f12381b = new t() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // g4.t
        public <T> s<T> a(f fVar, l4.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f12382a = new SimpleDateFormat("hh:mm:ss a");

    @Override // g4.s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Time b(m4.a aVar) throws IOException {
        if (aVar.L() == m4.b.NULL) {
            aVar.H();
            return null;
        }
        try {
            return new Time(this.f12382a.parse(aVar.J()).getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    @Override // g4.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void d(m4.c cVar, Time time) throws IOException {
        cVar.K(time == null ? null : this.f12382a.format((Date) time));
    }
}
