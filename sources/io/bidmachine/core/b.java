package io.bidmachine.core;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: NetworkRequest.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b<RequestDataType, RequestResultType, ErrorResultType> {
    private static final dc.d TASK_MANAGER = new ec.b();
    private InterfaceC0315b<RequestResultType, ErrorResultType> callback;
    private c cancelCallback;
    private ArrayList<h<RequestDataType, RequestResultType, ErrorResultType>> contentEncoders;
    private URLConnection currentConnection;
    private i currentState = i.Idle;
    private g<RequestDataType, RequestResultType, ErrorResultType> dataBinder;
    private ArrayList<h<RequestDataType, RequestResultType, ErrorResultType>> dataEncoders;
    private ErrorResultType errorResult;
    private final e method;
    private final String path;
    private final RequestDataType requestData;
    private RequestResultType requestResult;

    /* JADX INFO: renamed from: io.bidmachine.core.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NetworkRequest.java */
    public interface InterfaceC0315b<RequestResultType, ErrorResultType> {
        void a(ErrorResultType errorresulttype);

        void onSuccess(RequestResultType requestresulttype);
    }

    /* JADX INFO: compiled from: NetworkRequest.java */
    public interface c {
        void onCanceled();
    }

    /* JADX INFO: compiled from: NetworkRequest.java */
    public static class d<RequestDataType, RequestResultType, ErrorResultType> extends h<RequestDataType, RequestResultType, ErrorResultType> {
        @Override // io.bidmachine.core.b.h
        protected byte[] a(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            GZIPInputStream gZIPInputStream;
            ByteArrayInputStream byteArrayInputStream;
            Throwable th;
            ByteArrayOutputStream byteArrayOutputStream;
            if (!"gzip".equals(uRLConnection.getContentEncoding())) {
                return bArr;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int i10 = gZIPInputStream.read(bArr2);
                                if (i10 == -1) {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    io.bidmachine.core.h.m(byteArrayOutputStream);
                                    io.bidmachine.core.h.h(byteArrayOutputStream);
                                    io.bidmachine.core.h.h(byteArrayInputStream);
                                    io.bidmachine.core.h.h(gZIPInputStream);
                                    return byteArray;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i10);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            io.bidmachine.core.h.m(byteArrayOutputStream);
                            io.bidmachine.core.h.h(byteArrayOutputStream);
                            io.bidmachine.core.h.h(byteArrayInputStream);
                            io.bidmachine.core.h.h(gZIPInputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        gZIPInputStream = null;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    byteArrayInputStream = null;
                    th = th4;
                    gZIPInputStream = null;
                }
            } catch (Throwable th5) {
                gZIPInputStream = null;
                byteArrayInputStream = null;
                th = th5;
                byteArrayOutputStream = null;
            }
        }

        @Override // io.bidmachine.core.b.h
        protected byte[] b(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            GZIPOutputStream gZIPOutputStream;
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(bArr);
                        io.bidmachine.core.h.h(gZIPOutputStream);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        io.bidmachine.core.h.m(byteArrayOutputStream2);
                        io.bidmachine.core.h.h(byteArrayOutputStream2);
                        io.bidmachine.core.h.m(null);
                        io.bidmachine.core.h.h(null);
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        io.bidmachine.core.h.m(byteArrayOutputStream);
                        io.bidmachine.core.h.h(byteArrayOutputStream);
                        io.bidmachine.core.h.m(gZIPOutputStream);
                        io.bidmachine.core.h.h(gZIPOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
            }
        }

        @Override // io.bidmachine.core.b.h
        protected void c(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
            uRLConnection.setRequestProperty("Content-Encoding", "gzip");
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.java */
    public enum e {
        Get("GET"),
        Post("POST");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17535a;

        e(String str) {
            this.f17535a = str;
        }

        public void c(URLConnection uRLConnection) throws ProtocolException {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setRequestMethod(this.f17535a);
            }
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.java */
    private final class f implements Runnable {
        private f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            b.this.process();
            if (b.this.callback == null || b.this.isCanceled()) {
                return;
            }
            if (b.this.currentState == i.Success) {
                b.this.callback.onSuccess(b.this.requestResult);
            } else {
                b.this.callback.a(b.this.errorResult);
            }
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.java */
    public enum i {
        Idle,
        Running,
        Success,
        Fail,
        Canceled
    }

    public b(e eVar, String str, RequestDataType requestdatatype) {
        this.method = eVar;
        this.path = str;
        this.requestData = requestdatatype;
    }

    private InputStream obtainErrorStream(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getErrorStream();
        }
        return null;
    }

    private int obtainResponseCode(URLConnection uRLConnection) throws IOException {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:84:0x0142  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:158)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public void process() {
        URLConnection uRLConnection;
        i iVar;
        URL url;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream2;
        g<RequestDataType, RequestResultType, ErrorResultType> gVar;
        BufferedOutputStream bufferedOutputStream;
        this.currentState = i.Running;
        try {
            if (this.path != null) {
                url = new URL(getBaseUrl() + "/" + this.path);
            } else {
                url = new URL(getBaseUrl());
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            try {
                this.currentConnection = uRLConnectionOpenConnection;
                this.method.c(uRLConnectionOpenConnection);
                prepareRequestParams(uRLConnectionOpenConnection);
                byte[] bArrObtainRequestData = obtainRequestData(uRLConnectionOpenConnection);
                if (bArrObtainRequestData != null) {
                    byte[] bArrEncodeRequestData = encodeRequestData(uRLConnectionOpenConnection, bArrObtainRequestData);
                    uRLConnectionOpenConnection.setDoOutput(true);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(uRLConnectionOpenConnection.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArrEncodeRequestData);
                            io.bidmachine.core.h.m(bufferedOutputStream);
                            io.bidmachine.core.h.h(bufferedOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            io.bidmachine.core.h.m(bufferedOutputStream);
                            io.bidmachine.core.h.h(bufferedOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = null;
                    }
                }
                try {
                    int iObtainResponseCode = obtainResponseCode(uRLConnectionOpenConnection);
                    if (isCanceled()) {
                        io.bidmachine.core.h.m(null);
                        io.bidmachine.core.h.h(null);
                        io.bidmachine.core.h.h(null);
                        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                            ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                        }
                        this.currentConnection = null;
                        if (isCanceled()) {
                            return;
                        }
                        this.currentState = this.errorResult == null ? i.Success : i.Fail;
                        return;
                    }
                    if (iObtainResponseCode != 200) {
                        this.errorResult = obtainError(uRLConnectionOpenConnection, iObtainResponseCode);
                        inputStream2 = null;
                        byteArrayOutputStream2 = null;
                    } else {
                        inputStream2 = uRLConnectionOpenConnection.getInputStream();
                        try {
                            byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i10 = inputStream2.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream2.write(bArr, 0, i10);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                if (byteArray != null) {
                                    byteArray = decodeResponseData(uRLConnectionOpenConnection, byteArray);
                                }
                                if (byteArray != null && byteArray.length > 0 && (gVar = this.dataBinder) != null) {
                                    RequestResultType requestresulttypeCreateSuccessResult = gVar.createSuccessResult(this, uRLConnectionOpenConnection, byteArray);
                                    this.requestResult = requestresulttypeCreateSuccessResult;
                                    if (requestresulttypeCreateSuccessResult == null) {
                                        this.errorResult = this.dataBinder.createFailResult(this, uRLConnectionOpenConnection, byteArray);
                                    }
                                }
                            } catch (Throwable th3) {
                                inputStream = inputStream2;
                                th = th3;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                io.bidmachine.core.h.m(byteArrayOutputStream);
                                io.bidmachine.core.h.h(byteArrayOutputStream);
                                io.bidmachine.core.h.h(inputStream);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            byteArrayOutputStream = null;
                            inputStream = inputStream2;
                            th = th4;
                        }
                    }
                    io.bidmachine.core.h.m(byteArrayOutputStream2);
                    io.bidmachine.core.h.h(byteArrayOutputStream2);
                    io.bidmachine.core.h.h(inputStream2);
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                    }
                    this.currentConnection = null;
                    if (isCanceled()) {
                        return;
                    }
                    if (this.errorResult == null) {
                        iVar = i.Success;
                    } else {
                        iVar = i.Fail;
                    }
                    this.currentState = iVar;
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th6) {
                uRLConnection = uRLConnectionOpenConnection;
                th = th6;
                try {
                    io.bidmachine.core.a.o(th);
                    this.errorResult = obtainError(uRLConnection, th);
                    if (uRLConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnection).disconnect();
                    }
                    this.currentConnection = null;
                    if (isCanceled()) {
                        return;
                    }
                    if (this.errorResult == null) {
                        iVar = i.Success;
                    }
                    this.currentState = iVar;
                } catch (Throwable th7) {
                    if (uRLConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnection).disconnect();
                    }
                    this.currentConnection = null;
                    if (!isCanceled()) {
                        this.currentState = this.errorResult == null ? i.Success : i.Fail;
                    }
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            th = th8;
            uRLConnection = null;
        }
    }

    public void addContentEncoder(h<RequestDataType, RequestResultType, ErrorResultType> hVar) {
        if (this.contentEncoders == null) {
            this.contentEncoders = new ArrayList<>();
        }
        this.contentEncoders.add(hVar);
    }

    public void addDataEncoder(h<RequestDataType, RequestResultType, ErrorResultType> hVar) {
        if (this.dataEncoders == null) {
            this.dataEncoders = new ArrayList<>();
        }
        this.dataEncoders.add(hVar);
    }

    public void cancel() {
        this.currentState = i.Canceled;
        c cVar = this.cancelCallback;
        if (cVar != null) {
            cVar.onCanceled();
        }
    }

    protected byte[] decodeResponseData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<h<RequestDataType, RequestResultType, ErrorResultType>> arrayList = this.contentEncoders;
        if (arrayList != null) {
            Iterator<h<RequestDataType, RequestResultType, ErrorResultType>> it = arrayList.iterator();
            while (it.hasNext()) {
                bArr = it.next().a(this, uRLConnection, bArr);
            }
        }
        ArrayList<h<RequestDataType, RequestResultType, ErrorResultType>> arrayList2 = this.dataEncoders;
        if (arrayList2 != null) {
            Iterator<h<RequestDataType, RequestResultType, ErrorResultType>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                bArr = it2.next().a(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    protected byte[] encodeRequestData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<h<RequestDataType, RequestResultType, ErrorResultType>> arrayList = this.dataEncoders;
        if (arrayList != null) {
            for (h<RequestDataType, RequestResultType, ErrorResultType> hVar : arrayList) {
                hVar.c(this, uRLConnection);
                bArr = hVar.b(this, uRLConnection, bArr);
            }
        }
        ArrayList<h<RequestDataType, RequestResultType, ErrorResultType>> arrayList2 = this.contentEncoders;
        if (arrayList2 != null) {
            for (h<RequestDataType, RequestResultType, ErrorResultType> hVar2 : arrayList2) {
                hVar2.c(this, uRLConnection);
                bArr = hVar2.b(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    protected String getBaseUrl() throws Exception {
        return "TODO: implement url";
    }

    public e getMethod() {
        return this.method;
    }

    public String getPath() {
        return this.path;
    }

    public boolean isCanceled() {
        return this.currentState == i.Canceled;
    }

    protected abstract ErrorResultType obtainError(URLConnection uRLConnection, int i10);

    protected abstract ErrorResultType obtainError(URLConnection uRLConnection, Throwable th);

    protected byte[] obtainRequestData(URLConnection uRLConnection) throws Exception {
        g<RequestDataType, RequestResultType, ErrorResultType> gVar = this.dataBinder;
        if (gVar == null) {
            return null;
        }
        gVar.prepareRequest(this, uRLConnection);
        this.dataBinder.prepareHeaders(this, uRLConnection);
        return this.dataBinder.obtainData(this, uRLConnection, this.requestData);
    }

    protected void prepareRequestParams(URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(40000);
        uRLConnection.setReadTimeout(40000);
    }

    public void request() {
        request(TASK_MANAGER);
    }

    public void setCallback(InterfaceC0315b<RequestResultType, ErrorResultType> interfaceC0315b) {
        this.callback = interfaceC0315b;
    }

    public void setCancelCallback(c cVar) {
        this.cancelCallback = cVar;
    }

    public void setDataBinder(g<RequestDataType, RequestResultType, ErrorResultType> gVar) {
        this.dataBinder = gVar;
    }

    public void request(dc.d dVar) {
        try {
            dVar.execute(new f());
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            InterfaceC0315b<RequestResultType, ErrorResultType> interfaceC0315b = this.callback;
            if (interfaceC0315b != null) {
                interfaceC0315b.a(obtainError((URLConnection) null, th));
            }
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.java */
    public static abstract class g<RequestDataType, RequestResultType, ErrorResultType> {
        protected ErrorResultType createFailResult(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        protected abstract RequestResultType createSuccessResult(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception;

        protected abstract byte[] obtainData(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection, RequestDataType requestdatatype) throws Exception;

        protected abstract void prepareHeaders(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection);

        protected void prepareRequest(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection) {
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.java */
    public static abstract class h<RequestDataType, RequestResultType, ErrorResultType> {
        protected abstract byte[] a(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception;

        protected abstract byte[] b(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception;

        protected void c(b<RequestDataType, RequestResultType, ErrorResultType> bVar, URLConnection uRLConnection) {
        }
    }
}
