package com.facebook.appevents.ml;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Operator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Operator {
    public static final Operator INSTANCE = new Operator();

    private Operator() {
    }

    public static final void addmv(MTensor x10, MTensor b10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            t.f(x10, "x");
            t.f(b10, "b");
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            int shape3 = x10.getShape(2);
            float[] data = x10.getData();
            float[] data2 = b10.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                for (int i11 = 0; i11 < shape2; i11++) {
                    for (int i12 = 0; i12 < shape3; i12++) {
                        int i13 = (i10 * shape2 * shape3) + (i11 * shape3) + i12;
                        data[i13] = data[i13] + data2[i12];
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    public static final MTensor concatenate(MTensor[] tensors) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            t.f(tensors, "tensors");
            int shape = tensors[0].getShape(0);
            int shape2 = 0;
            for (MTensor mTensor : tensors) {
                shape2 += mTensor.getShape(1);
            }
            MTensor mTensor2 = new MTensor(new int[]{shape, shape2});
            float[] data = mTensor2.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                int i11 = i10 * shape2;
                int length = tensors.length;
                for (int i12 = 0; i12 < length; i12++) {
                    float[] data2 = tensors[i12].getData();
                    int shape3 = tensors[i12].getShape(1);
                    System.arraycopy(data2, i10 * shape3, data, i11, shape3);
                    i11 += shape3;
                }
            }
            return mTensor2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final MTensor conv1D(MTensor x10, MTensor w10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            t.f(x10, "x");
            t.f(w10, "w");
            int i10 = 0;
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            int shape3 = x10.getShape(2);
            int shape4 = w10.getShape(0);
            int i11 = (shape2 - shape4) + 1;
            int shape5 = w10.getShape(2);
            MTensor mTensor = new MTensor(new int[]{shape, i11, shape5});
            float[] data = x10.getData();
            float[] data2 = mTensor.getData();
            float[] data3 = w10.getData();
            int i12 = 0;
            while (i12 < shape) {
                int i13 = i10;
                while (i13 < shape5) {
                    int i14 = i10;
                    while (i14 < i11) {
                        float f10 = 0.0f;
                        while (i10 < shape4) {
                            for (int i15 = 0; i15 < shape3; i15++) {
                                f10 += data[(shape2 * shape3 * i12) + ((i10 + i14) * shape3) + i15] * data3[(((i10 * shape3) + i15) * shape5) + i13];
                            }
                            i10++;
                        }
                        data2[(i11 * shape5 * i12) + (i14 * shape5) + i13] = f10;
                        i14++;
                        i10 = 0;
                    }
                    i13++;
                    i10 = 0;
                }
                i12++;
                i10 = 0;
            }
            return mTensor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final MTensor dense(MTensor x10, MTensor w10, MTensor b10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            t.f(x10, "x");
            t.f(w10, "w");
            t.f(b10, "b");
            int shape = x10.getShape(0);
            int shape2 = b10.getShape(0);
            MTensor mTensorMul = mul(x10, w10);
            float[] data = b10.getData();
            float[] data2 = mTensorMul.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                for (int i11 = 0; i11 < shape2; i11++) {
                    int i12 = (i10 * shape2) + i11;
                    data2[i12] = data2[i12] + data[i11];
                }
            }
            return mTensorMul;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final MTensor embedding(String[] texts, int i10, MTensor w10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            t.f(texts, "texts");
            t.f(w10, "w");
            int length = texts.length;
            int shape = w10.getShape(1);
            MTensor mTensor = new MTensor(new int[]{length, i10, shape});
            float[] data = mTensor.getData();
            float[] data2 = w10.getData();
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArrVectorize = Utils.INSTANCE.vectorize(texts[i11], i10);
                for (int i12 = 0; i12 < i10; i12++) {
                    System.arraycopy(data2, iArrVectorize[i12] * shape, data, (shape * i10 * i11) + (shape * i12), shape);
                }
            }
            return mTensor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final void flatten(MTensor x10, int i10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            t.f(x10, "x");
            if (i10 >= x10.getShapeSize()) {
                return;
            }
            int shapeSize = x10.getShapeSize();
            int shape = 1;
            for (int i11 = i10; i11 < shapeSize; i11++) {
                shape *= x10.getShape(i11);
            }
            int[] iArr = new int[i10 + 1];
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = x10.getShape(i12);
            }
            iArr[i10] = shape;
            x10.reshape(iArr);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    public static final MTensor maxPool1D(MTensor x10, int i10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            t.f(x10, "x");
            int i11 = 0;
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            int shape3 = x10.getShape(2);
            int i12 = (shape2 - i10) + 1;
            MTensor mTensor = new MTensor(new int[]{shape, i12, shape3});
            float[] data = x10.getData();
            float[] data2 = mTensor.getData();
            int i13 = 0;
            while (i13 < shape) {
                int i14 = i11;
                while (i14 < shape3) {
                    int i15 = i11;
                    while (i15 < i12) {
                        int i16 = i15 * shape3;
                        int i17 = (i13 * i12 * shape3) + i16 + i14;
                        int i18 = (i13 * shape2 * shape3) + i16 + i14;
                        data2[i17] = Float.MIN_VALUE;
                        for (int i19 = i11; i19 < i10; i19++) {
                            data2[i17] = Math.max(data2[i17], data[i18 + (i19 * shape3)]);
                        }
                        i15++;
                        i11 = 0;
                    }
                    i14++;
                    i11 = 0;
                }
                i13++;
                i11 = 0;
            }
            return mTensor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final MTensor mul(MTensor x10, MTensor w10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            t.f(x10, "x");
            t.f(w10, "w");
            int shape = x10.getShape(0);
            int shape2 = w10.getShape(0);
            int shape3 = w10.getShape(1);
            MTensor mTensor = new MTensor(new int[]{shape, shape3});
            float[] data = x10.getData();
            float[] data2 = w10.getData();
            float[] data3 = mTensor.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                for (int i11 = 0; i11 < shape3; i11++) {
                    int i12 = (i10 * shape3) + i11;
                    data3[i12] = 0.0f;
                    for (int i13 = 0; i13 < shape2; i13++) {
                        data3[i12] = data3[i12] + (data[(i10 * shape2) + i13] * data2[(i13 * shape3) + i11]);
                    }
                }
            }
            return mTensor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final void relu(MTensor x10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            t.f(x10, "x");
            float[] data = x10.getData();
            int length = data.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (data[i10] < 0.0f) {
                    data[i10] = 0.0f;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    public static final void softmax(MTensor x10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            t.f(x10, "x");
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            float[] data = x10.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                int i11 = i10 * shape2;
                int i12 = i11 + shape2;
                float f10 = Float.MIN_VALUE;
                for (int i13 = i11; i13 < i12; i13++) {
                    float f11 = data[i13];
                    if (f11 > f10) {
                        f10 = f11;
                    }
                }
                float f12 = 0.0f;
                for (int i14 = i11; i14 < i12; i14++) {
                    float fExp = (float) Math.exp(data[i14] - f10);
                    data[i14] = fExp;
                    f12 += fExp;
                }
                while (i11 < i12) {
                    data[i11] = data[i11] / f12;
                    i11++;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    public static final MTensor transpose2D(MTensor x10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            t.f(x10, "x");
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            MTensor mTensor = new MTensor(new int[]{shape2, shape});
            float[] data = x10.getData();
            float[] data2 = mTensor.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                for (int i11 = 0; i11 < shape2; i11++) {
                    data2[(i11 * shape) + i10] = data[(i10 * shape2) + i11];
                }
            }
            return mTensor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final MTensor transpose3D(MTensor x10) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            t.f(x10, "x");
            int shape = x10.getShape(0);
            int shape2 = x10.getShape(1);
            int shape3 = x10.getShape(2);
            MTensor mTensor = new MTensor(new int[]{shape3, shape2, shape});
            float[] data = x10.getData();
            float[] data2 = mTensor.getData();
            for (int i10 = 0; i10 < shape; i10++) {
                for (int i11 = 0; i11 < shape2; i11++) {
                    for (int i12 = 0; i12 < shape3; i12++) {
                        data2[(i12 * shape * shape2) + (i11 * shape) + i10] = data[(i10 * shape2 * shape3) + (i11 * shape3) + i12];
                    }
                }
            }
            return mTensor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }
}
