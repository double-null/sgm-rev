package com.applovin.impl;

import android.util.Xml;
import c0.IbU.elEbP;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Stack f8129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f8130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f8131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f8132e;

    /* JADX INFO: loaded from: classes2.dex */
    class a implements ContentHandler {
        a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i10, i11)).trim();
            if (StringUtils.isValidString(strTrim)) {
                r8.this.f8130c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - r8.this.f8131d;
            com.applovin.impl.sdk.p unused = r8.this.f8128a;
            if (com.applovin.impl.sdk.p.a()) {
                r8.this.f8128a.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            r8 r8Var = r8.this;
            r8Var.f8132e = (b) r8Var.f8129b.pop();
            r8.this.f8132e.d(r8.this.f8130c.toString().trim());
            r8.this.f8130c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !r8.this.f8129b.isEmpty() ? (b) r8.this.f8129b.peek() : null;
                b bVar2 = new b(str2, r8.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                r8.this.f8129b.push(bVar2);
            } catch (Exception e10) {
                com.applovin.impl.sdk.p unused = r8.this.f8128a;
                if (com.applovin.impl.sdk.p.a()) {
                    r8.this.f8128a.a("XmlParser", "Unable to process element <" + str2 + ">", e10);
                }
                throw new SAXException("Failed to start element", e10);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.p unused = r8.this.f8128a;
            if (com.applovin.impl.sdk.p.a()) {
                r8.this.f8128a.a("XmlParser", elEbP.xONDQVo);
            }
            r8.this.f8131d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }
    }

    private static class b extends q8 {
        b(String str, Map map, q8 q8Var) {
            super(str, map, q8Var);
        }

        void a(q8 q8Var) {
            if (q8Var == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f8015e.add(q8Var);
        }

        void d(String str) {
            this.f8014d = str;
        }
    }

    r8(com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f8128a = lVar.Q();
    }

    public static q8 a(String str, com.applovin.impl.sdk.l lVar) {
        return new r8(lVar).a(str);
    }

    public q8 a(String str) throws SAXException {
        if (str != null) {
            this.f8130c = new StringBuilder();
            this.f8129b = new Stack();
            this.f8132e = null;
            Xml.parse(str, new a());
            b bVar = this.f8132e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap map = new HashMap(length);
            for (int i10 = 0; i10 < length; i10++) {
                map.put(attributes.getQName(i10), attributes.getValue(i10));
            }
            return map;
        }
        return Collections.emptyMap();
    }
}
