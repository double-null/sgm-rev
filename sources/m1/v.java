package m1;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

/* JADX INFO: compiled from: WorkTypeConverters.java */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: compiled from: WorkTypeConverters.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f22130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f22131d;

        static {
            int[] iArr = new int[androidx.work.p.values().length];
            f22131d = iArr;
            try {
                iArr[androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22131d[androidx.work.p.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[androidx.work.m.values().length];
            f22130c = iArr2;
            try {
                iArr2[androidx.work.m.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22130c[androidx.work.m.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22130c[androidx.work.m.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22130c[androidx.work.m.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22130c[androidx.work.m.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[androidx.work.a.values().length];
            f22129b = iArr3;
            try {
                iArr3[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22129b[androidx.work.a.f3612b.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[androidx.work.u.a.values().length];
            f22128a = iArr4;
            try {
                iArr4[androidx.work.u.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22128a[androidx.work.u.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22128a[androidx.work.u.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22128a[androidx.work.u.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22128a[androidx.work.u.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22128a[androidx.work.u.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(androidx.work.a aVar) {
        int i10 = a.f22129b[aVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static androidx.work.d b(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable th;
        IOException e10;
        androidx.work.d dVar = new androidx.work.d();
        if (bArr == null) {
            return dVar;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    try {
                        for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                            dVar.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e12) {
                        e10 = e12;
                        e10.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e15) {
                        e15.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e16) {
                e16.printStackTrace();
            }
        } catch (IOException e17) {
            objectInputStream = null;
            e10 = e17;
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static byte[] c(androidx.work.d dVar) throws Throwable {
        boolean zHasNext;
        ?? r10 = 0;
        ObjectOutputStream objectOutputStream = null;
        r10 = 0;
        if (dVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeInt(dVar.c());
                        Iterator<androidx.work.d.a> it = dVar.b().iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            if (zHasNext) {
                                androidx.work.d.a next = it.next();
                                objectOutputStream2.writeUTF(next.a().toString());
                                objectOutputStream2.writeBoolean(next.b());
                            } else {
                                try {
                                    break;
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                        objectOutputStream2.close();
                        byteArrayOutputStream.close();
                        r10 = zHasNext;
                    } catch (IOException e11) {
                        e = e11;
                        objectOutputStream = objectOutputStream2;
                        e.printStackTrace();
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        byteArrayOutputStream.close();
                        r10 = objectOutputStream;
                    } catch (Throwable th) {
                        th = th;
                        r10 = objectOutputStream2;
                        if (r10 != 0) {
                            try {
                                r10.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e14) {
                            e14.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e15) {
                e = e15;
            }
        } catch (IOException e16) {
            e16.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static androidx.work.a d(int i10) {
        if (i10 == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return androidx.work.a.f3612b;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static androidx.work.m e(int i10) {
        if (i10 == 0) {
            return androidx.work.m.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return androidx.work.m.CONNECTED;
        }
        if (i10 == 2) {
            return androidx.work.m.UNMETERED;
        }
        if (i10 == 3) {
            return androidx.work.m.NOT_ROAMING;
        }
        if (i10 == 4) {
            return androidx.work.m.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return androidx.work.m.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static androidx.work.p f(int i10) {
        if (i10 == 0) {
            return androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return androidx.work.p.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static androidx.work.u.a g(int i10) {
        if (i10 == 0) {
            return androidx.work.u.a.ENQUEUED;
        }
        if (i10 == 1) {
            return androidx.work.u.a.RUNNING;
        }
        if (i10 == 2) {
            return androidx.work.u.a.SUCCEEDED;
        }
        if (i10 == 3) {
            return androidx.work.u.a.FAILED;
        }
        if (i10 == 4) {
            return androidx.work.u.a.BLOCKED;
        }
        if (i10 == 5) {
            return androidx.work.u.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static int h(androidx.work.m mVar) {
        int i10 = a.f22130c[mVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && mVar == androidx.work.m.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + mVar + " to int");
    }

    public static int i(androidx.work.p pVar) {
        int i10 = a.f22131d[pVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + pVar + " to int");
    }

    public static int j(androidx.work.u.a aVar) {
        switch (a.f22128a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}
