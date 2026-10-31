package com.facebook.appevents.ml;

import kotlin.collections.j0;
import kotlin.collections.o;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import od.h;

/* JADX INFO: compiled from: MTensor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MTensor {
    public static final Companion Companion = new Companion(null);
    private int capacity;
    private float[] data;
    private int[] shape;

    /* JADX INFO: compiled from: MTensor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getCapacity(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i10 = iArr[0];
            j0 it = new h(1, o.A(iArr)).iterator();
            while (it.hasNext()) {
                i10 *= iArr[it.nextInt()];
            }
            return i10;
        }
    }

    public MTensor(int[] shape) {
        t.f(shape, "shape");
        this.shape = shape;
        int capacity = Companion.getCapacity(shape);
        this.capacity = capacity;
        this.data = new float[capacity];
    }

    public final float[] getData() {
        return this.data;
    }

    public final int getShape(int i10) {
        return this.shape[i10];
    }

    public final int getShapeSize() {
        return this.shape.length;
    }

    public final void reshape(int[] shape) {
        t.f(shape, "shape");
        this.shape = shape;
        int capacity = Companion.getCapacity(shape);
        float[] fArr = new float[capacity];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, capacity));
        this.data = fArr;
        this.capacity = capacity;
    }
}
