package zd;

import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f29202a = new i();

    private i() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return kotlin.collections.b0.p0(ServiceLoader.load(cls, classLoader));
        }
    }

    private final List<String> e(URL url) throws IOException {
        String string = url.toString();
        if (!rd.c0.O(string, "jar", false, 2, null)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> listF = f29202a.f(bufferedReader);
                fd.b.a(bufferedReader, null);
                return listF;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(bufferedReader, th);
                    throw th2;
                }
            }
        }
        String strY0 = rd.f0.Y0(rd.f0.T0(string, "jar:file:", null, 2, null), '!', null, 2, null);
        String strT0 = rd.f0.T0(string, "!/", null, 2, null);
        JarFile jarFile = new JarFile(strY0, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strT0)), Constants.ENCODING));
            try {
                List<String> listF2 = f29202a.f(bufferedReader2);
                fd.b.a(bufferedReader2, null);
                jarFile.close();
                return listF2;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    fd.b.a(bufferedReader2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                try {
                    jarFile.close();
                    throw th6;
                } catch (Throwable th7) {
                    wc.f.a(th5, th7);
                    throw th5;
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) throws IOException {
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return kotlin.collections.b0.p0(linkedHashSet);
            }
            String string = rd.f0.d1(rd.f0.Z0(line, "#", null, 2, null)).toString();
            int i10 = 0;
            while (true) {
                if (i10 >= string.length()) {
                    z10 = true;
                    break;
                }
                char cCharAt = string.charAt(i10);
                if (!(cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    public final List<s> c() {
        s sVar;
        if (!j.a()) {
            return b(s.class, s.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            s sVar2 = null;
            try {
                sVar = (s) s.class.cast(Class.forName("vd.a", true, s.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                sVar = null;
            }
            if (sVar == null) {
                return b(s.class, s.class.getClassLoader());
            }
            arrayList.add(sVar);
            try {
                sVar2 = (s) s.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, s.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (sVar2 == null) {
                return arrayList;
            }
            arrayList.add(sVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(s.class, s.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        kotlin.jvm.internal.t.e(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.y.z(arrayList, f29202a.e((URL) it.next()));
        }
        Set setT0 = kotlin.collections.b0.t0(arrayList);
        if (!(!setT0.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.u.u(setT0, 10));
        Iterator it2 = setT0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f29202a.a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
