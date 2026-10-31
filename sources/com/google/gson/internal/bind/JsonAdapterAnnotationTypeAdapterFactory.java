package com.google.gson.internal.bind;

import g4.f;
import g4.k;
import g4.q;
import g4.s;
import g4.t;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i4.c f12352a;

    public JsonAdapterAnnotationTypeAdapterFactory(i4.c cVar) {
        this.f12352a = cVar;
    }

    @Override // g4.t
    public <T> s<T> a(f fVar, l4.a<T> aVar) {
        h4.b bVar = (h4.b) aVar.c().getAnnotation(h4.b.class);
        if (bVar == null) {
            return null;
        }
        return (s<T>) b(this.f12352a, fVar, aVar, bVar);
    }

    s<?> b(i4.c cVar, f fVar, l4.a<?> aVar, h4.b bVar) {
        s<?> treeTypeAdapter;
        Object objA = cVar.a(l4.a.a(bVar.value())).a();
        if (objA instanceof s) {
            treeTypeAdapter = (s) objA;
        } else if (objA instanceof t) {
            treeTypeAdapter = ((t) objA).a(fVar, aVar);
        } else {
            boolean z10 = objA instanceof q;
            if (!z10 && !(objA instanceof k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z10 ? (q) objA : null, objA instanceof k ? (k) objA : null, fVar, aVar, null);
        }
        return (treeTypeAdapter == null || !bVar.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.a();
    }
}
