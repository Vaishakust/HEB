var $jscomp = $jscomp || {};
$jscomp.scope = {};
$jscomp.createTemplateTagFirstArg = function(a) {
    return a.raw = a
};
$jscomp.createTemplateTagFirstArgWithRaw = function(a, b) {
    a.raw = b;
    return a
};
$jscomp.arrayIteratorImpl = function(a) {
    var b = 0;
    return function() {
        return b < a.length ? {
            done: !1,
            value: a[b++]
        } : {
            done: !0
        }
    }
};
$jscomp.arrayIterator = function(a) {
    return {
        next: $jscomp.arrayIteratorImpl(a)
    }
};
$jscomp.makeIterator = function(a) {
    var b = "undefined" != typeof Symbol && Symbol.iterator && a[Symbol.iterator];
    return b ? b.call(a) : $jscomp.arrayIterator(a)
};
var isFirefox = "undefined" !== typeof InstallTrigger,
    isSafari = /^((?!chrome|android).)*safari/i.test(navigator.userAgent),
    inputText = "",
    recorderActive = !1,
    attrArr = ",withid,withclass,withname,withplaceholder,withtext",
    _document = "",
    frameOriframe = "";

function getDocument() {
    _document = "";
    if (document.querySelector("*[xpathtest='1']")) _document = document;
    else try {
        getAlliframe(document);
        for (var a = Object.keys(allIframes).length, b = 0; b < a; b++)
            for (var c = allIframes["iframe" + b], d = 0; d < c.length; d++) try {
                if (c[d].contentWindow.document.querySelector("*[xpathtest='1']")) {
                    _document = c[d].contentWindow.document;
                    frameOriframe = "iframe";
                    return
                }
            } catch (e) {}
    } catch (e) {}
}

function iframeOfFrame(a) {
    for (var b = document.querySelectorAll("iframe"), c = 0; c < b.length; c++) try {
        if (b[c].contentWindow.document = a.ownerDocument) {
            frameOriframe = "iframe";
            return
        }
    } catch (e) {}
    var d = document.querySelectorAll("frame");
    for (c = 0; c < d.length; c++) try {
        if (b[c].contentWindow.document = a.ownerDocument) {
            frameOriframe = "frame";
            break
        }
    } catch (e) {}
}

function isEven(a) {
    return 0 == a % 2
}

function isOdd(a) {
    return 1 == Math.abs(a % 2)
}


function validAfterClosedSquare(a) {
    a = a.split("]");
    for (var b = 1; b <= a.length - 1; b++)
        if (a[b].charAt(0) && "/" != a[b].charAt(0) && "[" != a[b].charAt(0)) return !1;
    return !0
}

function errorInSelector(a, b) {
    var c = /^[A-Za-z]+$/;
    if (b.includes("\u201c")) return 'XPath does not support tilted \u201c quote. Use vertical " quote.';
    if (b.includes("\u201d")) return 'XPath does not support tilted \u201d quote. Use vertical " quote.';
    if (b.includes("\u2018")) return "XPath does not support tilted \u2018 quote. Use vertical ' quote.";
    if (b.includes("\u2019")) return "XPath does not support tilted \u2019 quote. Use vertical ' quote.";
    if (b.includes("///") || b.includes("////") || b.includes("/////") ||
        b.includes("//////")) return "more than 2 / together not allowed";
    if ("//" == b) return a.includes("css") ? "// not allowed." : "add tagName after //";
    if ("/" == b.charAt(b.length - 1)) return a.includes("css") ? "forward slash / not allowed." : "add tagName after forward slash /";
    var d = b.match(/'/g) ? b.match(/'/g).length : 0;
    if (isOdd(d)) return "single quote ' missing";
    d = b.match(/"/g) ? b.match(/"/g).length : 0;
    if (isOdd(d)) return 'double quote " missing';
    d = b.match(/\(/g) ? b.match(/\(/g).length : 0;
    var e = b.match(/\)/g) ? b.match(/\)/g).length :
        0;
    if (d != e) return d > e ? "close parenthesis ) missing" : "open parenthesis ( missing";
    d = b.match(/\[/g) ? b.match(/\[/g).length : 0;
    e = b.match(/\]/g) ? b.match(/\]/g).length : 0;
    if (d != e) return d > e ? "close square bracket ] missing" : "open square bracket [ missing";
    d = b.match(/:/g) ? b.match(/:/g).length : 0;
    if (isOdd(d)) return a.includes("css") ? "colon : not allowed." : "colon : missing";
    d = /[^[\]]+(?=])/g;
    if (b.includes("[") && b.includes("]") && !d.exec(b)) return "Value inside square brackets [] missing";
    if ((2 < b.split("]").length ||
            2 == b.split("]").length && b.split("]")[1]) && !validAfterClosedSquare(b)) return a.includes("css") ? "after ] only [ allowed" : "after ] only / and [ allowed";
    if (b.includes("::") && !b.split("::")[1]) return "tagName missing after ::";
    if (b.split("::")[1] && !c.test(b.split("::")[1])) return "only tagName allowed after ::";
    if (b.includes("/"))
        for (b = b.replaceAll("//", "/"), d = b.split("/"), e = 0; e < d.length - 1; e++)
            if ((!d[e] || !c.text(d[e].charAt(0)) && "." != d[e].charAt(0) && "*" != d[e].charAt(0)) && d[e]) return "after / only . * and tagname allowed";
    if (/[^[\]]+(?=])/g.exec(b) && (c = replaceAll(b, "[" + /[^[\]]+(?=])/g.exec(b)[0] + "]", ""), !isSpecialCharValidForSelector(c))) return "special char not allowed outside []";
    /\(([^)]+)\)/.exec(b) && replaceAll(b, "(" + /\(([^)]+)\)/.exec(b)[0] + ")", "");
    return b.includes(";") ? "semicolon ; not allowed" : b.includes("{") || b.includes("}") ? "curly brackets { } not allowed" : b.includes("normalise-space") ? "wrong spelling, use 'normalize' in place of 'normalise'" : b.includes("ends-with(") ? "ends-with() is XPath2.0 function which browser doesn't support. Use XPath1.0 functions." :
        b.includes("upper-case(") ? "upper-case() is XPath2.0 function which browser doesn't support. Use XPath1.0 functions." : b.includes("lower-case(") ? "lower-case() is XPath2.0 function which browser doesn't support. Use XPath1.0 functions." : b.includes("matches(") ? "matches() is XPath2.0 function which browser doesn't support. Use XPath1.0 functions." : "Check the syntax & spelling."
}

function replaceAll(a, b, c) {
    return a.split(b).join(c)
}
var oldNodes = [],
    oldAttribute = "",
    allNodes = [],
    idChecked = "";
_document = "";
var pageUrl = "websiteUrl-" + document.URL,
    inspectedElement = "",
    elementInShadowDom = "",
    element = "",
    suggestedFlag = !1,
    passResultsToDevtoolsScript = function(a, b, c, d) {
        try {
            element.nodeName.toLowerCase()
        } catch (h) {}
        b.includes("//text()") && (b = b.replace("//text()", "//*[text()") + "]");
        _document = _document ? _document : document;
        a = "." === b ? "xpath" : a;
        var e = "";
        try {
            if (!a.includes("xpath") && "." !== b || elementInShadowDom) var f = elementInShadowDom ? inspectedElement.getRootNode().host.shadowRoot.querySelectorAll(b) : _document.querySelectorAll(b);
            else {
                if (absXpathForInspected && (e = _document.evaluate(absXpathForInspected, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotItem(0), (isSVGChild(e) || "svg" == e.nodeName.toLowerCase()) && b.includes("/svg"))) {
                    chrome.runtime.sendMessage({
                        count: "wrong" + a + "errorInfoInvalid svg xpath format."
                    });
                    for (var k = 0; k < oldNodes.length; k++) deleteAttribute(oldNodes[k], a, c);
                    oldNodes = [];
                    allNodes = [];
                    return
                }
                f = _document.evaluate(b, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null)
            }
        } catch (h) {
            b ? (d = errorInSelector(a,
                b), a = "css" == a ? "cssSelector" : a, elementInShadowDom && (a.includes("xpath") || "." === b) && (a = "cssSelector", d = "xpath doesn't support ShadowDOM."), chrome.runtime.sendMessage({
                count: "wrong" + a + "errorInfo" + d
            })) : chrome.runtime.sendMessage({
                count: "blank"
            });
            for (k = 0; k < oldNodes.length; k++) deleteAttribute(oldNodes[k], a, c);
            oldNodes = [];
            allNodes = [];
            return
        }
        e = a.includes("xpath") ? f.snapshotLength : f.length;
        for (k = 0; k < oldNodes.length; k++) deleteAttribute(oldNodes[k], a, c);
        oldNodes = [];
        allNodes = [];
        for (k = 0; k < e; k++) {
            var g = a.includes("xpath") ?
                f.snapshotItem(k) : f[k];
            0 === k && "/" !== b && "." !== b && "/." !== b && "//." !== b && "//.." !== b && 1 == g.nodeType && (isFirefox ? g.scrollIntoView({
                behavior: "smooth",
                block: "center",
                inline: "nearest"
            }) : g.scrollIntoViewIfNeeded());
            oldNodes.push(g);
            oldAttribute = a;
            1 == g.nodeType ? (appendAttribute(g, a, k + 1), allNodes.push(g.outerHTML)) : (2 == g.nodeType || 3 == g.nodeType) && 0 < g.textContent.trim().length ? allNodes.push(g.textContent.trim()) : void 0 == g.value ? allNodes.push(" ") : allNodes.push(g.name + '="' + g.value + '"')
        }
        chrome.runtime.sendMessage({
            count: allNodes
        });
        a.includes("xpath") && 1 < e && (e = _document.evaluate(absXpathForInspected, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotItem(0), (f = e.getAttribute("xpath")) && chrome.runtime.sendMessage({
            count: "1-sanjayMatchingNode--sanjayXpathIndex-(" + b + ")[" + f + "]"
        }));
        if (_document !== document) {
            "onlyEditor" !== hubMode && (b = _document, f = ["frame", getIframeXpath(_document), parentiframeXpath], parentiframeXpath = [], chrome.runtime.sendMessage({
                count: f
            }), _document = b);
            try {
                var l = _document.querySelectorAll("style[selectorshub]");
                for (k = 0; k < l.length; k++) l[k].remove()
            } catch (h) {}
            k = "[xpath], [css]{outline: 2px dashed #00bcd4 !important}";
            l = _document.createElement("style");
            l.setAttribute("SelectorsHub", "sh");
            l.textContent = k;
            _document.documentElement.appendChild(l);
            k = '[xpath="1"], [css="1"]{outline:2px dashed #f29a00 !important}';
            l = _document.createElement("style");
            l.setAttribute("SelectorsHub", "sh");
            l.textContent = k;
            _document.documentElement.appendChild(l)
        } else if (elementInShadowDom) {
            try {
                for (l = inspectedElement.getRootNode().host.shadowRoot.querySelectorAll("style[selectorshub]"),
                    k = 0; k < l.length; k++) l[k].remove()
            } catch (h) {}
            k = "[xpath], [css]{outline: 2px dashed #0715f7f7 !important}";
            l = _document.createElement("style");
            l.setAttribute("SelectorsHub", "sh");
            l.textContent = k;
            inspectedElement.getRootNode().host.shadowRoot.appendChild(l);
            k = '[xpath="1"], [css="1"]{outline:2px dashed #ffa500 !important}';
            l = _document.createElement("style");
            l.setAttribute("SelectorsHub", "sh");
            l.textContent = k;
            inspectedElement.getRootNode().host.shadowRoot.appendChild(l)
        }
        pageUrl = "websiteUrl-" + document.URL;
        if (c && !elementInShadowDom) {
            c = _document.querySelector("[" + a + '="1"]');
            a = ["", 0];
            try {
                suggestedFlag = !0, createAbsXpath(c), a = createCssSelector(c, d)
            } catch (h) {}
            suggestedFlag = !1;
            1 !== a[1] && (a = createRelXpath(c, d));
            d = ["suggestedSelector", a];
            0 != a[1] && chrome.runtime.sendMessage({
                count: d
            })
        }
    },
    appendAttribute = function(a, b, c) {
        b.includes("xpath") && (b = "xpath");
        try {
            a.setAttribute(b, c)
        } catch (d) {}
    },
    deleteAttribute = function(a, b, c) {
        try {
            b = oldAttribute, a.removeAttribute(b), a.nodeName.toLowerCase().includes("svg") ? a.style.border =
                "" : a.style.outline = ""
        } catch (d) {}
    };

function getElementsByXPath(a) {
    try {
        var b = [],
            c = document.evaluate(a, document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null);
        a = 0;
        for (var d = c.snapshotLength; a < d; ++a) b.push(c.snapshotItem(a));
        return b.length
    } catch (e) {
        console.warn(e, "NOT VALID")
    }
}

function calculateElements(a) {
    if (!a.xpath) return !1;
    var b = getElementsByXPath(a.xpath);
    b && chrome.runtime.sendMessage({
        type: "elementsCount",
        id: a.id,
        elementCount: b
    });
    return !1
}
var allDocuments = [];

function getAllDocument() {
    allDocuments.push(document);
    for (var a = document.querySelectorAll("iframe"), b = 0; b < a.length; b++) try {
        allDocuments.push(a[b].contentWindow.document), frameOriframe = "iframe"
    } catch (c) {}
    a = document.querySelectorAll("frame");
    for (b = 0; b < a.length; b++) try {
        allDocuments.push(a[b].contentWindow.document), frameOriframe = "frame"
    } catch (c) {}
}
var contextElement = null,
    contextSelectors = [],
    rightClickFunction = "",
    buildContextMenuResultFunction = "";


function copyValueToClipboard(a) {
    var b = document.createElement("textarea");
    b.value = a;
    document.body.appendChild(b);
    b.select();
    document.execCommand("copy");
    document.body.removeChild(b)
}
var generateContextMenu = !1;

function createSelectorsForContextMenu(a) {
    _document = a.ownerDocument;
    generateContextMenu = !0;
    var b = "";
    elementInShadowDom = isInShadow(a);
    var c = ["withid", "withclass", "withname", "withplaceholder", "withtext"];
    a.nodeName.toLowerCase();
    absXpath = createAbsXpath(a)[0];
    contextSelectors[0] = b + createRelXpath(a, c)[0];
    globalRelXpath = contextSelectors[0];
    contextSelectors[1] = createCssSelector(a, c)[0].trim();
    contextSelectors[2] = 'document.querySelector("' + contextSelectors[1].trim() + '")';
    contextSelectors[3] = b + absXpath;
    contextSelectors[4] =
        b + createTestRigorPath(a)[0];
    a.ownerDocument !== document ? (b = "This element is in iframe - ", contextSelectors[0] = b + contextSelectors[0], contextSelectors[1] = b + contextSelectors[1], contextSelectors[2] = b + contextSelectors[2], contextSelectors[3] = b + contextSelectors[3], contextSelectors[4] = b + contextSelectors[4]) : elementInShadowDom && (b = "This element is in shadowDOM - ", contextSelectors[1] = b + contextSelectors[1], contextSelectors[2] = b + contextSelectors[2], elementInShadowDom = !1);
    generateContextMenu = !1
}
var contextMenu = "active";

function createIdSelector(a) {
    _document = a.ownerDocument;
    if (a.id && !elementInShadowDom) {
        var b = a.id;
        b = deleteLineGap(b);
        var c = "//*[@id='" + b + "']";
        a = elementInShadowDom ? cssSelectorMatchingNode(a, "#" + b) : _document.evaluate(c, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        c = [];
        c.push(b);
        c.push(a);
        return c
    }
}

function createClassNameSelector(a) {
    _document = a.ownerDocument;
    if (a.attributes["class"]) {
        var b = a.attributes["class"].value;
        b = deleteLineGap(b);
        var c = "." + b.replace(/ /g, ".");
        a = cssSelectorMatchingNode(a, c);
        c = [];
        c.push(b);
        c.push(a);
        return c
    }
}

function createNameSelector(a) {
    _document = a.ownerDocument;
    if (a.name) {
        var b = a.name;
        b = deleteLineGap(b);
        var c = a.nodeName.toLowerCase() + "[name='" + b + "']";
        a = cssSelectorMatchingNode(a, c);
        c = [];
        c.push(b);
        c.push(a);
        return c
    }
}

function createTagNameSelector(a) {
    _document = a.ownerDocument;
    var b = a.nodeName.toLowerCase(),
        c = a.nodeName.toLowerCase();
    a = cssSelectorMatchingNode(a, c);
    c = [];
    c.push(b);
    c.push(a);
    return c
}

function createTestRigorPath(a) {
    a = createSelectorName(a);
    a = deleteLineGap(a);
    var b = [];
    b.push('"' + a + '"');
    b.push(1);
    return b
}

function createLinkTextSelector(a) {
    _document = a.ownerDocument;
    if ("a" === a.nodeName.toLowerCase() && !elementInShadowDom && (a = [].reduce.call(a.childNodes, function(d, e) {
            return d + (3 === e.nodeType ? e.textContent : "")
        }, "").trim(), 0 !== a.length)) {
        var b = "//a[text()='" + a + "']";
        a.includes("'") && (b = '//a[text()="' + a + '"]');
        b = _document.evaluate(b, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        var c = [];
        c.push(a);
        c.push(b);
        return c
    }
}

function createPartialLinkTextSelector(a) {
    _document = a.ownerDocument;
    if ("a" === a.nodeName.toLowerCase() && !elementInShadowDom && (a = [].reduce.call(a.childNodes, function(d, e) {
            return d + (3 === e.nodeType ? e.textContent : "")
        }, "").trim(), 0 !== a.length)) {
        5 < a.length && (a = a.slice(0, a.length - 2).slice(0, 20));
        var b = "//a[contains(text(),'" + a + "')]";
        a.includes("'") && (b = '//a[contains(text(),"' + a + '")]');
        b = _document.evaluate(b, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        var c = [];
        c.push(a);
        c.push(b);
        return c
    }
}

function buildAbsXpath(a) {
    if ("html" === a.nodeName.toLowerCase()) return "/html[1]";
    if ("body" === a.nodeName.toLowerCase()) return "/html[1]/body[1]";
    for (var b = 0, c = a.parentNode.childNodes, d = 0; d < c.length; d++) {
        var e = c[d];
        if (e === a) {
            var f = buildAbsXpath(a.parentNode) + "/" + a.nodeName.toLowerCase() + "[" + (b + 1) + "]";
            break
        }
        1 === e.nodeType && e.nodeName.toLowerCase() === a.nodeName.toLowerCase() && b++
    }
    return f
}
var absXpath = "";

function createAbsXpath(a) {
    var b = a.nodeName.toLowerCase();
    b.includes("#comment") ? absXpath = "This is a comment and selectors can't be generated for comment." : b.includes("<pseudo:") ? absXpath = "This is a pseudo element and selectors can't be generated for pseudo element." : b.includes("#document-fragment") ? absXpath = "This is a shadow-root and xpath can't be written for it. Please inspect an element." : elementInShadowDom ? (absXpath = "This element is inside Shadow DOM & for such elements XPath won't support.",
        absXpath = shadowDOMOpenOrClosed.includes("closed") ? "This element is inside closed Shadow DOM which is inaccessible so for such elements we can't verify/write selectors." : absXpath) : absXpath = buildAbsXpath(a);
    a = 0;
    if (absXpath.includes("svg")) {
        b = absXpath.split("svg")[0];
        for (var c = absXpath.split("svg")[1].split("/"), d = "", e = 0; e < c.length; e++) d = 0 === e ? "*[name()='svg']" + c[e] : d + "/*[name()='" + c[e].split("[")[0] + "'][" + c[e].split("[")[1];
        absXpath = b + d
    }
    try {
        a = _document.evaluate(absXpath, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,
            null).snapshotLength
    } catch (f) {
        a = 0
    }
    b = [];
    b.push(absXpath);
    b.push(a);
    return b
}
var tempXpath = "",
    indexes = [],
    matchIndex = [],
    containsFlag = !1;

function deleteLineGap(a) {
    a && (a = 0 < a.split("\n")[0].length ? a.split("\n")[0] : a.split("\n")[1]);
    return a
}
var containsText = "",
    equalsText = "";

function deleteGarbageFromInnerText(a) {
    a = deleteLineGap(a);
    a = a.split(/[^\u0000-\u00ff]/).reduce(function(b, c) {
        return b.length > c.length ? b : c
    }, "").trim();
    return a = a.split("/")[0].trim()
}

function isSVGChild(a) {
    for (var b = 0; 4 > b; b++)
        if (a.parentNode) {
            if ("svg" === a.parentNode.nodeName.toLowerCase()) return !0;
            a = a.parentNode
        } return !1
}

function getPrecedingSiblings(a) {
    for (var b = []; a = a.previousSibling;) 3 !== a.nodeType && 8 !== a.nodeType && b.push(a.nodeName.toLowerCase());
    return b
}

function getFollowingSiblings(a) {
    for (var b = []; a = a.nextSibling;) 3 !== a.nodeType && 8 !== a.nodeType && b.push(a.nodeName.toLowerCase());
    return b
}

function getAllSiblings(a) {
    var b = [];
    a = a.parentNode.firstChild;
    do 3 !== a.nodeType && 8 !== a.nodeType && b.push(a.nodeName.toLowerCase()); while (a = a.nextSibling);
    return b
}

function getAllAncestors(a) {
    for (var b = []; a.parentNode && "#document" != a.parentNode.nodeName.toLowerCase() && "html" != a.parentNode.nodeName.toLowerCase();) 3 !== a.parentNode && 8 !== a.parentNode && (a = a.parentNode, b.push(a.nodeName.toLowerCase()));
    return b
}

function getAllDescendants(a) {
    a = a.getElementsByTagName("*");
    for (var b = [], c = 0; c < a.length; c++) 3 != a[c].nodeType && 8 != a[c].nodeType && b.push(a[c].nodeName.toLowerCase());
    return b
}

function getAllChildren(a) {
    a = a.children;
    for (var b = [], c = 0; c < a.length; c++) 3 != a[c].nodeType && 8 != a[c].nodeType && b.push(a[c].nodeName.toLowerCase());
    return b
}

function containsNewLineBlankSpaceStartEnd(a) {
    return /\r|\n/.exec(a) || " " == a.charAt(0) || " " == a.charAt(a.length - 1) ? !0 : !1
}

function placeZerosAtEnd(a) {
    return a.filter(isntZero).concat(a.filter(isZero))
}

function isntZero(a) {
    return "a" == a.charAt(0) ? !0 : 0 < a.charAt(0)
}

function isZero(a) {
    return 0 == a.charAt(0)
}
var listOfTextAndAttr = [],
    xpathListOfTextAndAttr = [],
    cssListOfTextAndAttr = [],
    hubMode = "",
    absXpathForInspected = "";

function prepareListOfAttrText(a) {
    isFirefox || (_document = a.ownerDocument, inspectedElement = a, elementInShadowDom = isInShadow(a), iframeOfFrame(a));
    listOfTextAndAttr = [];
    xpathListOfTextAndAttr = [];
    cssListOfTextAndAttr = [];
    listOfTextAndAttr.push("z$*[shub]");
    var b = "",
        c = "",
        d = "",
        e = b = "",
        f = "",
        k = a.nodeName.toLowerCase();
    try {
        d = [].reduce.call(a.childNodes, function(l, h) {
                return l + (3 === h.nodeType ? h.textContent : "")
            }, "").trim(), b = [].reduce.call(a.childNodes, function(l, h) {
                return l + (3 === h.nodeType ? h.textContent : "")
            }, ""),
            e = a.innerText.trim(), e = deleteLineGap(e), e = d != e ? e : ""
    } catch (l) {}
    elementInShadowDom || (k.includes("svg") || isSVGChild(a) ? (f = "//*[local-name()='" + k + "']", xpathListOfTextAndAttr.push(f), xpathListOfTextAndAttr.push("//*[name()='" + k + "']")) : xpathListOfTextAndAttr.push("//" + k), e && (e.includes("'") || e.includes("\u2019") ? (xpathListOfTextAndAttr.push('[text()="' + e + '"]'), xpathListOfTextAndAttr.push('[starts-with(text(),"' + e + '")]'), xpathListOfTextAndAttr.push('[.="' + e + '"]'), xpathListOfTextAndAttr.push('[contains(text(),"' +
        e + '")]'), xpathListOfTextAndAttr.push('[contains(.,"' + e + '")]')) : (xpathListOfTextAndAttr.push("[text()='" + e + "']"), xpathListOfTextAndAttr.push("[starts-with(text(),'" + e + "')]"), xpathListOfTextAndAttr.push("[.='" + e + "']"), xpathListOfTextAndAttr.push("[contains(text(),'" + e + "')]"), xpathListOfTextAndAttr.push("[contains(.,'" + e + "')]"))), d && (isNaN(d) || xpathListOfTextAndAttr.push("[text()=" + b + "]"), b = 0 == b.indexOf("\n") ? d : b, d.includes("'") || d.includes("\u2019") ? (xpathListOfTextAndAttr.push('[text()="' + b + '"]'),
        xpathListOfTextAndAttr.push('[starts-with(text(),"' + b + '")]'), xpathListOfTextAndAttr.push('[.="' + b + '"]'), xpathListOfTextAndAttr.push('[contains(text(),"' + d + '")]'), xpathListOfTextAndAttr.push('[contains(.,"' + d + '")]'), xpathListOfTextAndAttr.push('[normalize-space()="' + d + '"]'), xpathListOfTextAndAttr.push('normalize-space()="' + d + '"]'), xpathListOfTextAndAttr.push('[contains(normalize-space(),"' + d + '")]'), xpathListOfTextAndAttr.push('contains(normalize-space(),"' + d + '")]')) : (xpathListOfTextAndAttr.push("[text()='" +
        b + "']"), xpathListOfTextAndAttr.push("[starts-with(text(),'" + b + "')]"), xpathListOfTextAndAttr.push("[.='" + b + "']"), xpathListOfTextAndAttr.push("[contains(text(),'" + d + "')]"), xpathListOfTextAndAttr.push("[contains(.,'" + d + "')]"), xpathListOfTextAndAttr.push("[normalize-space()='" + d + "']"), xpathListOfTextAndAttr.push("normalize-space()='" + d + "']"), xpathListOfTextAndAttr.push("[contains(normalize-space(),'" + d + "')]"), xpathListOfTextAndAttr.push("contains(normalize-space(),'" + d + "')]"))), xpathListOfTextAndAttr.push("text()"));
    cssListOfTextAndAttr.push(k);
    if (0 != a.attributes.length && !c)
        for (d = 0; d < a.attributes.length; d++) b = a.attributes[d].name, c = a.attributes[d].nodeValue, null == c || "" == c || "xpath" === b || "xpathtest" === b || "xpathtest" === b || "onclick" === b || listOfTextAndAttr.includes(b) || (c.includes("'") || c.includes("\u2019") ? (cssListOfTextAndAttr.push("[" + b + '="' + c + '"]'), cssListOfTextAndAttr.push("[" + b + '$="' + c + '"]'), cssListOfTextAndAttr.push("[" + b + '^="' + c + '"]'), cssListOfTextAndAttr.push("[" + b + '*="' + c + '"]'), elementInShadowDom || (xpathListOfTextAndAttr.push("[@" +
            b + '="' + c + '"]'), xpathListOfTextAndAttr.push("@" + b + '="' + c + '"]')), elementInShadowDom || xpathListOfTextAndAttr.push("[contains(@" + b + ',"' + c.trim() + '")]')) : (cssListOfTextAndAttr.push("[" + b + "='" + c + "']"), cssListOfTextAndAttr.push("[" + b + "$='" + c + "']"), cssListOfTextAndAttr.push("[" + b + "^='" + c + "']"), cssListOfTextAndAttr.push("[" + b + "*='" + c + "']"), elementInShadowDom || (xpathListOfTextAndAttr.push("[@" + b + "='" + c + "']"), xpathListOfTextAndAttr.push("@" + b + "='" + c + "']")), elementInShadowDom || xpathListOfTextAndAttr.push("[contains(@" +
            b + ",'" + c.trim() + "')]")), xpathListOfTextAndAttr.push("@" + b), "class" == b ? cssListOfTextAndAttr.push("." + c.split(" ").join(".")) : "id" == b && cssListOfTextAndAttr.push("#" + c));
    if (xpathListOfTextAndAttr) {
        absXpathForInspected = createAbsXpath(a)[0];
        d = absXpathForInspected.split("[")[absXpathForInspected.split("[").length - 1].split("]")[0];
        xpathListOfTextAndAttr.push("[position()=" + d + "]");
        xpathListOfTextAndAttr.push("[last()]");
        for (d = f ? 2 : 1; d < xpathListOfTextAndAttr.length; d++) {
            c = 0;
            try {
                var g = f ? f : "//" + k;
                "[" != xpathListOfTextAndAttr[d].charAt(0) &&
                    "]" == xpathListOfTextAndAttr[d].charAt(xpathListOfTextAndAttr.length - 1) ? c = _document.evaluate(g + "[" + xpathListOfTextAndAttr[d], _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength : "[" != xpathListOfTextAndAttr[d].charAt(0) && "]" != xpathListOfTextAndAttr[d].charAt(xpathListOfTextAndAttr.length - 1) ? (c = _document.evaluate(g + "/" + xpathListOfTextAndAttr[d], _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, c = "abc") : c = _document.evaluate(g + xpathListOfTextAndAttr[d], _document,
                        null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                xpathListOfTextAndAttr[d] = c + "-sanjayMatchingNode-" + xpathListOfTextAndAttr[d]
            } catch (l) {}
        }
        c = _document.evaluate(g, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        xpathListOfTextAndAttr[0] = c + "-sanjayMatchingNode-" + xpathListOfTextAndAttr[0];
        f && (xpathListOfTextAndAttr[1] = c + "-sanjayMatchingNode-" + xpathListOfTextAndAttr[1])
    }
    if (cssListOfTextAndAttr) {
        for (d = 1; d < cssListOfTextAndAttr.length; d++) {
            c = 0;
            try {
                c = "." == cssListOfTextAndAttr[d].charAt(0) ||
                    "#" == cssListOfTextAndAttr[d].charAt(0) ? cssSelectorMatchingNode(a, cssListOfTextAndAttr[d]) : cssSelectorMatchingNode(a, k + cssListOfTextAndAttr[d]), cssListOfTextAndAttr[d] = c + "-sanjayMatchingNode-" + cssListOfTextAndAttr[d]
            } catch (l) {}
        }
        c = cssSelectorMatchingNode(a, cssListOfTextAndAttr[0]);
        cssListOfTextAndAttr[0] = c + "-sanjayMatchingNode-" + cssListOfTextAndAttr[0]
    }
    xpathListOfTextAndAttr.sort();
    cssListOfTextAndAttr.sort();
    xpathListOfTextAndAttr = placeZerosAtEnd(xpathListOfTextAndAttr);
    cssListOfTextAndAttr = placeZerosAtEnd(cssListOfTextAndAttr);
    f = [];
    f = [];
    f = [];
    f = [];
    f = [];
    cssListOfTextAndAttr.push("abc-sanjayMatchingNode-:first-child");
    cssListOfTextAndAttr.push("abc-sanjayMatchingNode-:last-child");
    cssListOfTextAndAttr.push("abc-sanjayMatchingNode-:nth-child()");
    cssListOfTextAndAttr.push("abc-sanjayMatchingNode-:nth-last-child()");
    cssListOfTextAndAttr.push("abc-sanjayMatchingNode-:first-of-type");
    cssListOfTextAndAttr.push("abc-sanjayMatchingNode-:last-of-type");
    cssListOfTextAndAttr.push("abc-sanjayMatchingNode-:nth-of-type()");
    cssListOfTextAndAttr.push("abc-sanjayMatchingNode-:nth-last-of-type()");
    xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-sibling::");
    xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-contains()");
    xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-starts-with");
    f = getPrecedingSiblings(a);
    0 < f.length && (xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-preceding::"), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-preceding-sibling::"), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-]/preceding-sibling::"));
    for (d = 0; d < f.length; d++) xpathListOfTextAndAttr.includes("abc-sanjayMatchingNode-preceding-sibling::" +
        f[d]) || xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-preceding-sibling::" + f[d]);
    f = getFollowingSiblings(a);
    0 < f.length && (xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-following::"), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-following-sibling::"), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-]/following-sibling::"));
    for (d = 0; d < f.length; d++) 0 == d && cssListOfTextAndAttr.push("abc-sanjayMatchingNode- + " + f[d]), xpathListOfTextAndAttr.includes("abc-sanjayMatchingNode-following-sibling::" +
        f[d]) || cssListOfTextAndAttr.includes("abc-sanjayMatchingNode- ~ " + f[d]) || (cssListOfTextAndAttr.push("abc-sanjayMatchingNode- ~ " + f[d]), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-following-sibling::" + f[d]));
    a.parentNode && (xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-]/.."), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-parent::"), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-]/parent::"), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-parent::" + a.parentNode.nodeName.toLowerCase()));
    f = getAllChildren(a);
    0 < f.length && (xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-child::"), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-]/child::"));
    for (d = 0; d < f.length; d++) xpathListOfTextAndAttr.includes("abc-sanjayMatchingNode-child::" + f[d]) || cssListOfTextAndAttr.includes("abc-sanjayMatchingNode- > " + f[d]) || (cssListOfTextAndAttr.push("abc-sanjayMatchingNode- > " + f[d]), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-child::" + f[d]));
    f = getAllAncestors(a);
    0 < f.length && (xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-ancestor::"),
        xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-]/ancestor::"));
    for (d = 0; d < f.length; d++) xpathListOfTextAndAttr.includes("abc-sanjayMatchingNode-ancestor::" + f[d]) || xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-ancestor::" + f[d]);
    f = getAllDescendants(a);
    0 < f.length && (xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-]/descendant::"), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-descendant::"));
    for (d = 0; d < f.length; d++) xpathListOfTextAndAttr.includes("abc-sanjayMatchingNode-descendant::" +
        f[d]) || cssListOfTextAndAttr.includes("abc-sanjayMatchingNode- " + f[d]) || (cssListOfTextAndAttr.push("abc-sanjayMatchingNode- " + f[d]), xpathListOfTextAndAttr.push("abc-sanjayMatchingNode-descendant::" + f[d]));
    listOfTextAndAttr.push(xpathListOfTextAndAttr);
    listOfTextAndAttr.push(cssListOfTextAndAttr);
    
 //   (2 > a.offsetWidth || 2 > a.offsetHeight || "hidden" === a.style.visibility || "none" === a.style.visibility || "script" === a.tagName.toLowerCase() || "style" === a.tagName.toLowerCase()) && chrome.runtime.sendMessage({
   //     count: 'elementInfo-Alert: This element is not interactable through selenium(automation) as it is not visible in UI. Try any near by element.<a class="training" href="https://bit.ly/sh_courses_recordings" target="_blank"> Learn more...</a>'
  //  });
    "input" === a.tagName.toLowerCase() &&
        a.disabled && chrome.runtime.sendMessage({
            count: "elementInfo-Alert: Input box is disabled, enable it to enter value."
        });
    if (isFirefox) chrome.runtime.sendMessage({
        count: listOfTextAndAttr
    });
    else return listOfTextAndAttr;
    listOfTextAndAttr = [];
    xpathListOfTextAndAttr = [];
    cssListOfTextAndAttr = []
}
var listOfAttr = {};

function getListOfAttr(a) {
    for (var b = chooseAttrsForXpath[0], c, d, e = 0; e < a.attributes.length; e++) c = a.attributes[e].name, d = a.attributes[e].nodeValue, null == d || "" == d || "style" === c && "style" !== b || "id" === c || "xpath" === c || "xpathtest" === c || chooseAttrsForXpath.includes("without" + c) && b != c || (listOfAttr[c] = d);
    return listOfAttr
}

function buildRelXpath(a, b) {
    var c = chooseAttrsForXpath[0],
        d = !1,
        e = b.nodeName.toLowerCase(),
        f = e.includes("body") ? "" : [].reduce.call(b.childNodes, function(p, v) {
            return p + (3 === v.nodeType ? v.textContent : "")
        }, "").trim();
    if (f.includes("  ") || f.includes("\n") || f.match(/[^\u0000-\u00ff]/)) d = !0;
    if (f.includes("  ") || f.includes("\n")) f = deleteGarbageFromInnerText(f);
    e.includes("svg") && (e = "*");
    f.includes("'") ? (f = f.split("  ")[0], dotText = '[contains(.,"' + f + '")]', equalsText = '[normalize-space()="' + f + '"]', containsText =
        50 < f.length || d ? '[contains(text(),"' + f.slice(0, 50) + '")]' : '[normalize-space()="' + f + '"]') : (f = f.split("  ")[0], dotText = "[contains(.,'" + f + "')]", equalsText = "[normalize-space()='" + f + "']", containsText = 50 < f.length || d ? "[contains(text(),'" + f.slice(0, 50) + "')]" : "[normalize-space()='" + f + "']");
    equalsText = containsText;
    if (chooseAttrsForXpath.includes("withouttext") && "text" != c.toLowerCase() || generateCssSelectorFlag) f = "";
    if (f && ("a" == e || "button" == e || "label" == e || "h" == e.charAt(0)) && "" == b.id && "" == c.toLowerCase()) {
        var k =
            "//" + e + equalsText,
            g = a.evaluate(k, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        if (1 === g) {
            g = "//" + e + dotText;
            g = a.evaluate(g, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
            if (1 === g) return k;
            g = b.firstChild.textContent;
            g = deleteGarbageFromInnerText(g);
            var l = "//" + e + ("[normalize-space()='" + g + "']");
            g = a.evaluate(l, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
            if (1 === g) return l
        }
    }
    if (e.includes("html") || e.includes("body")) return "//" + e + tempXpath;
    var h =
        g = "";
    var m = {};
    if (!h)
        for (var q = 0; q < b.attributes.length; q++) d = b.attributes[q].name, g = b.attributes[q].nodeValue, null == g || "" == g || "style" === d && "style" !== c || "id" === d || "xpath" === d || "xpathtest" === d || chooseAttrsForXpath.includes("without" + d) && c != d || (m[d] = g);
    q = Object.keys(m).length;
    if (b.getAttribute(c) && "id" !== c.toLowerCase() || "" === b.id || !chooseAttrsForXpath.includes("withid") && "id" !== c.toLowerCase())
        if (0 != q) {
            var t = l = "";
            for (d = 0; d < q; d++) {
                l = tempXpath;
                c in m ? (g = c, h = m[g]) : "placeholder" in m ? (g = "placeholder", h = m[g]) :
                    "title" in m ? (g = "title", h = m[g]) : "name" in m ? (g = "name", h = m[g]) : "value" in m ? (g = "value", h = m[g]) : "aria-label" in m ? (g = "aria-label", h = m[g]) : "alt" in m ? (g = "alt", h = m[g]) : "for" in m ? (g = "for", h = m[g]) : "data-label" in m ? (g = "data-label", h = m[g]) : "date-fieldlabel" in m ? (g = "date-fieldlabel", h = m[g]) : "data-displaylabel" in m ? (g = "data-displaylabel", h = m[g]) : "role" in m ? (g = "role", h = m[g]) : "type" in m ? (g = "type", h = m[g]) : "class" in m ? (g = "class", h = m[g]) : (g = Object.keys(m)[0], h = m[g], isAlphaNumeric(h) && (h = g = ""));
                h = deleteLineGap(h);
                delete m[g];
                if (null != h && "" != h && "xpath" !== g) {
                    var u = "//" + e,
                        r = k = "";
                    h.includes("  ") && (h = h.split("  ")[h.split("  ").length - 1], containsFlag = !0);
                    k = h.includes("'") ? " " !== h.charAt(0) && " " !== h.charAt(h.length - 1) && !containsFlag || xpathForCss ? "//" + e + "[@" + g + '="' + h + '"]' : "//" + e + "[contains(@" + g + ',"' + h.trim() + '")]' : " " !== h.charAt(0) && " " !== h.charAt(h.length - 1) && !containsFlag || xpathForCss ? "//" + e + "[@" + g + "='" + h + "']" : "//" + e + "[contains(@" + g + ",'" + h.trim() + "')]";
                    r = k + l;
                    g = a.evaluate(r, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                    if (1 === g) {
                        if (r.includes("@href") && !c.includes("href") || r.includes("@src") && !c.includes("src") && f)
                            if (n = "//" + e + containsText + l, g = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 0 === g) {
                                if (k = "//" + e + equalsText + l, g = a.evaluate(k, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === g) return k
                            } else if (1 === g) return n;
                        return r
                    }
                    if (f)
                        if (n = "//" + e + containsText + l, g = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 0 === g) {
                            k = "//" + e + equalsText +
                                l;
                            g = a.evaluate(k, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                            if (1 === g) return k;
                            1 < g ? l = k : 0 === g && (l = r)
                        } else if (1 === g) {
                        g = "//" + e + dotText + l;
                        g = a.evaluate(g, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (1 === g) return n;
                        g = b.firstChild.textContent;
                        g = deleteGarbageFromInnerText(g);
                        h = "[normalize-space()='" + g + "']";
                        r = "//" + e + h + l;
                        g = a.evaluate(r, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (1 === g) return r;
                        l = k + h + l;
                        g = a.evaluate(l, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,
                            null).snapshotLength;
                        if (1 === g) return l
                    } else {
                        n = "//" + e + "[contains(text(),'" + f.slice(0, 50) + "')]" + l;
                        g = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (1 === g) return n;
                        n = k + containsText + l;
                        g = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (0 === g) {
                            if (k = k + equalsText + l, g = a.evaluate(k, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === g) return k
                        } else {
                            if (1 === g) return n;
                            if (h.includes("/") || f.includes("/")) h.includes("/") && (n =
                                u + containsText + l), f.includes("/") && (n = n.replace(containsText, ""));
                            l = n
                        }
                    } else l = r, h.includes("/") && (l = "//" + e)
                } else if (f) {
                    n = "//" + e + containsText + l;
                    g = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                    if (0 === g) {
                        if (k = "//" + e + equalsText + l, g = a.evaluate(k, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === g) return k
                    } else {
                        if (1 === g) return n;
                        n = "//" + e + "[contains(text(),'" + f.slice(0, 50) + "')]" + l;
                        g = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (1 === g) return n
                    }
                    l = n
                } else if (null == h || "" == h || g.includes("xpath")) l = "//" + e + l;
                0 == d && (t = l)
            }
            tempXpath = t
        } else if ("" == h && f && !e.includes("script"))
        if (n = "//" + e + containsText + tempXpath, g = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 0 === g) {
            if (tempXpath = "//" + e + equalsText + tempXpath, g = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === g) return tempXpath
        } else {
            if (1 === g) return n;
            n = "//" + e + "[contains(text(),'" + f.slice(0, 50) + "')]" + tempXpath;
            g = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
            if (1 === g) return n;
            tempXpath = n
        }
    else tempXpath = "//" + e + tempXpath;
    else {
        d = b.id;
        d = deleteLineGap(d);
        tempXpath = "//" + e + "[@id='" + d + "']" + tempXpath;
        g = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        if (1 === g) return tempXpath;
        if (f && 0 === b.getElementsByTagName("*").length) {
            var n = "//" + e + containsText + tempXpath;
            g = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
            if (0 ===
                g) {
                if (k = "//" + e + equalsText + tempXpath, g = a.evaluate(k, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === g) return k
            } else if (1 === g) return n
        }
    }
    e = 0;
    f = b.parentNode.childNodes;
    for (q = 0; q < f.length; q++) {
        c = f[q];
        if (c === b)
            if (indexes.push(e + 1), tempXpath = buildRelXpath(a, b.parentNode), tempXpath.includes("/")) {
                g = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                if (1 === g) return tempXpath;
                tempXpath = "/" + tempXpath.replace(/\/\/+/g, "/");
                d = /\/+/g;
                for (m = /[^[\]]+(?=])/g; null !=
                    (match = d.exec(tempXpath));) matchIndex.push(match.index);
                for (d = 0; d < indexes.length; d++)
                    if (0 === d ? (g = tempXpath.slice(matchIndex[matchIndex.length - 1]), null != (match = m.exec(g)) ? (g = g.replace(m, indexes[d]).split("]")[0] + "]", tempXpath = tempXpath.slice(0, matchIndex[matchIndex.length - 1]) + g) : tempXpath = tempXpath + "[" + indexes[d] + "]") : (g = tempXpath.slice(matchIndex[matchIndex.length - (d + 1)], matchIndex[matchIndex.length - d]), null != (match = m.exec(g)) ? (g = g.replace(m, indexes[d]), tempXpath = tempXpath.slice(0, matchIndex[matchIndex.length -
                            (d + 1)]) + g + tempXpath.slice(matchIndex[matchIndex.length - d])) : tempXpath = tempXpath.slice(0, matchIndex[matchIndex.length - d]) + "[" + indexes[d] + "]" + tempXpath.slice(matchIndex[matchIndex.length - d])), g = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === g) {
                        e = /([a-zA-Z])([^/]*)/g;
                        f = tempXpath.match(e).length;
                        for (d += 1; d < f - 1; d++) {
                            g = tempXpath.match(/\/([^\/]+)\/?$/)[1];
                            m = tempXpath.match(e);
                            m.splice(f - d, 1, "/");
                            c = "";
                            for (q = 0; q < m.length - 1; q++) c = m[q] ? c + "/" + m[q] : c + "//" + m[q];
                            c = (c +
                                "/" + g).replace(/\/\/+/g, "//");
                            c = c.replace(/\/\/+/g, "/");
                            c = c.replace(/\/+/g, "//");
                            g = a.evaluate(c, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                            1 === g && (tempXpath = c)
                        }
                        return tempXpath.replace("//html", "")
                    }
            } else return tempXpath;
        1 === c.nodeType && c.nodeName.toLowerCase() === b.nodeName.toLowerCase() && e++
    }
}

function removeLineBreak(a) {
    a && (a = 0 < a.split("\n")[0].length ? a.split("\n")[0] : a.split("\n")[1]);
    return a
}

function formContextRelXpath(a, b) {
    var c = [].reduce.call(b.childNodes, function(h, m) {
        return h + (3 === m.nodeType ? m.textContent : "")
    }, "").trim();
    c = removeLineBreak(c);
    c = c.split("/")[0].trim();
    var d = b.nodeName.toLowerCase();
    d.includes("svg") && (d = "*");
    c.includes("'") ? (c = c.split("  ")[0], containsText = 20 < c.length | doubleSpaceOrJunk ? '[contains(text(),"' + c.slice(0, 25) + '")]' : '[normalize-space()="' + c + '"]', dotText = '[contains(.,"' + c + '")]', equalsText = '[normalize-space()="' + c + '"]') : (c = c.split("  ")[0], containsText = 20 <
        c.length | doubleSpaceOrJunk ? "[contains(text(),'" + c.slice(0, 25) + "')]" : "[normalize-space()='" + c + "']", dotText = "[contains(.,'" + c + "')]", equalsText = "[normalize-space()='" + c + "']");
    equalsText = doubleSpaceOrJunk ? containsText : equalsText;
    generateCssSelectorFlag && (c = "");
    if (c && ("a" == d || "button" == d || "label" == d || "h" == d.charAt(0))) {
        var e = "//" + d + equalsText,
            f = a.evaluate(e, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        if (1 === f) {
            f = a.evaluate("//" + d + dotText, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,
                null).snapshotLength;
            if (1 === f) return e;
            f = b.firstChild.textContent;
            f = deleteGarbageFromInnerText(f);
            var k = "//" + d + ("[normalize-space()='" + f + "']");
            f = a.evaluate(k, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
            if (1 === f) return k
        }
    }
    if (d.includes("html") || d.includes("body")) return "//" + d + tempXpath;
    e = f = "";
    var g = {};
    if ("" !== b.id) {
        f = b.id;
        f = removeLineBreak(f);
        tempXpath = "//" + d + "[@id='" + f + "']" + tempXpath;
        f = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        if (1 ===
            f) return tempXpath;
        if (c && 0 === b.getElementsByTagName("*").length)
            if (g = "//" + d + containsText, f = a.evaluate(g, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 0 === f) {
                if (e = "//" + d + equalsText, f = a.evaluate(e, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === f) return e
            } else if (1 === f) return g
    } else if (0 != b.attributes.length) {
        if (!e)
            for (k = 0; k < b.attributes.length; k++) f = b.attributes[k].name, e = b.attributes[k].nodeValue, e.includes("/") || null == e || "" == e || "style" === f || "id" === f || "xpath" ===
                f || "xpathtest" === f || (g[f] = e);
        f = "placeholder" in g ? "placeholder" : "title" in g ? "title" : "value" in g ? "value" : "name" in g ? "name" : "aria-label" in g ? "aria-label" : "alt" in g ? "alt" : "for" in g ? "for" : "data-label" in g ? "data-label" : "date-fieldlabel" in g ? "date-fieldlabel" : "data-displaylabel" in g ? "data-displaylabel" : "role" in g ? "role" : "type" in g ? "type" : "class" in g ? "class" : Object.keys(g)[0];
        e = g[f];
        e = removeLineBreak(e);
        if (null != e && "" != e && "xpath" !== f) {
            var l = "//" + d + tempXpath;
            k = "";
            e.includes("  ") && (e = e.split("  ")[e.split("  ").length -
                1], containsFlag = !0);
            k = e.includes("'") ? " " === e.charAt(0) || " " === e.charAt(e.length - 1) || containsFlag ? "//" + d + "[contains(@" + f + ',"' + e.trim() + '")]' + tempXpath : "//" + d + "[@" + f + '="' + e + '"]' + tempXpath : " " === e.charAt(0) || " " === e.charAt(e.length - 1) || containsFlag ? "//" + d + "[contains(@" + f + ",'" + e.trim() + "')]" + tempXpath : "//" + d + "[@" + f + "='" + e + "']" + tempXpath;
            f = a.evaluate(k, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
            if (1 === f) {
                if (k.includes("@href") && !userAttr.includes("href") || k.includes("@src") && !userAttr.includes("src") &&
                    c)
                    if (g = "//" + d + containsText, f = a.evaluate(g, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 0 === f) {
                        if (e = "//" + d + equalsText, f = a.evaluate(e, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === f) return e
                    } else if (1 === f) return g;
                return k
            }
            if (c)
                if (g = "//" + d + containsText, f = a.evaluate(g, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 0 === f) {
                    e = "//" + d + equalsText;
                    f = a.evaluate(e, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                    if (1 === f) return e;
                    tempXpath = 1 < f ? e : k
                } else {
                    if (1 === f) return g;
                    g = k + containsText;
                    f = a.evaluate(g, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                    if (0 === f) {
                        if (e = k + equalsText, f = a.evaluate(e, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === f) return e
                    } else {
                        if (1 === f) return g;
                        if (e.includes("/") || c.includes("/")) e.includes("/") && (g = l + containsText), c.includes("/") && (g = g.replace(containsText, ""));
                        tempXpath = g
                    }
                }
            else tempXpath = k, e.includes("/") && (tempXpath = "//" + d + l)
        } else if (c) {
            g = "//" + d + containsText;
            f = a.evaluate(g, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
            if (0 === f) {
                if (e = "//" + d + equalsText, f = a.evaluate(e, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === f) return e
            } else if (1 === f) return g;
            tempXpath = g + tempXpath
        } else if (null == e || "" == e || f.includes("xpath")) tempXpath = "//" + d + tempXpath
    } else if ("" == e && c && !d.includes("script"))
        if (g = "//" + d + containsText + tempXpath, f = a.evaluate(g, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 0 === f) {
            if (tempXpath =
                "//" + d + equalsText + tempXpath, f = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === f) return tempXpath
        } else {
            if (1 === f) return g;
            tempXpath = g
        }
    else tempXpath = "//" + d + tempXpath;
    d = 0;
    e = b.parentNode.childNodes;
    for (k = 0; k < e.length; k++) {
        g = e[k];
        if (g === b)
            if (indexes.push(d + 1), tempXpath = formContextRelXpath(a, b.parentNode), tempXpath.includes("/")) {
                f = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                if (1 === f) return tempXpath;
                tempXpath = "/" + tempXpath.replace(/\/\/+/g,
                    "/");
                f = /\/+/g;
                for (l = /[^[\]]+(?=])/g; null != (match = f.exec(tempXpath));) matchIndex.push(match.index);
                for (c = 0; c < indexes.length; c++)
                    if (0 === c ? (f = tempXpath.slice(matchIndex[matchIndex.length - 1]), null != (match = l.exec(f)) ? (f = f.replace(l, indexes[c]).split("]")[0] + "]", tempXpath = tempXpath.slice(0, matchIndex[matchIndex.length - 1]) + f) : tempXpath = tempXpath + "[" + indexes[c] + "]") : (f = tempXpath.slice(matchIndex[matchIndex.length - (c + 1)], matchIndex[matchIndex.length - c]), null != (match = l.exec(f)) ? (f = f.replace(l, indexes[c]), tempXpath =
                            tempXpath.slice(0, matchIndex[matchIndex.length - (c + 1)]) + f + tempXpath.slice(matchIndex[matchIndex.length - c])) : tempXpath = tempXpath.slice(0, matchIndex[matchIndex.length - c]) + "[" + indexes[c] + "]" + tempXpath.slice(matchIndex[matchIndex.length - c])), f = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === f) {
                        d = /([a-zA-Z])([^/]*)/g;
                        e = tempXpath.match(d).length;
                        for (c += 1; c < e - 1; c++) {
                            f = tempXpath.match(/\/([^\/]+)\/?$/)[1];
                            l = tempXpath.match(d);
                            l.splice(e - c, 1, "/");
                            g = "";
                            for (k = 0; k < l.length -
                                1; k++) g = l[k] ? g + "/" + l[k] : g + "//" + l[k];
                            g = (g + "/" + f).replace(/\/\/+/g, "//");
                            g = g.replace(/\/\/+/g, "/");
                            g = g.replace(/\/+/g, "//");
                            f = a.evaluate(g, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                            1 === f && (tempXpath = g)
                        }
                        return tempXpath.replace("//html", "")
                    }
            } else return tempXpath;
        1 === g.nodeType && g.nodeName.toLowerCase() === b.nodeName.toLowerCase() && d++
    }
}
var chooseAttrsForXpath = [],
    shadowDOMOpenOrClosed = "open";

function isInShadow(a) {
    for (a = a && a.parentNode; a;) {
        if ("[object ShadowRoot]" === a.toString()) return shadowDOMOpenOrClosed = a.mode.toString(), !0;
        a = a.parentNode
    }
    return !1
}

function createRelXpath(a, b) {
    elementInShadowDom && !iframeXPathFlag && (inspectedElement = a);
    chooseAttrsForXpath = b.toString().split(",");
    var c = "",
        d = [];
    try {
        _document = a.ownerDocument
    } catch (k) {
        return d.push("0 element matching."), d.push("0"), d
    }
    var e = a.nodeName.toLowerCase();
    if (e.includes("#comment")) c = "This is a comment and selectors can't be generated for comment.";
    else if (e.includes("::")) c = "This is a pseudo element and selectors can't be generated for pseudo element.";
    else if (elementInShadowDom && !iframeXPathFlag) c =
        "This element is inside Shadow DOM and for such elements XPath won't support.", c = shadowDOMOpenOrClosed.includes("closed") ? "This element is inside closed Shadow DOM which is inaccessible so for such elements we can't verify/write selectors." : c;
    else try {
        c = absXpath.includes("/*[name") ? buildRelXpathForSVG(_document, a) : createOptimizedRelXpath(_document, a)
    } catch (k) {
        frameOriframe && createAbsXpath(a), c = absXpath
    }
    tempXpath = "";
    try {
        var f = _document.evaluate(c, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,
            null).snapshotLength
    } catch (k) {
        f = 0
    }
    d.push(c);
    d.push(f);
    (c.includes("@id=") || c.includes("contains(@id")) && isAttributeDynamic(c, "id") && d.push("id");
    (c.includes("@class=") || c.includes("contains(@class")) && isAttributeDynamic(c, "class") && d.push("class");
    (c.includes("@name=") || c.includes("contains(@name")) && isAttributeDynamic(c, "name") && d.push("name");
    return d
}

function optimizeXpath(a, b) {
    for (var c = b.split("//"), d = c.length, e = b.match(/[^[\]]+(?=])/g), f = 1, k = e.length - 1; 0 < k && !(f++, 3 < e[k].length); k--);
    k = b.split("//" + c[d - f])[1];
    e = 0;
    try {
        e = a.evaluate(k, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength
    } catch (g) {
        return b
    }
    if (1 === e) return k;
    for (d -= f; 0 < d; d--) {
        f = b.replace("//" + c[d], "");
        try {
            e = a.evaluate(f, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === e && (b = f)
        } catch (g) {
            break
        }
    }
    return b
}

function getElementNodename(a) {
    var b = "";
    a.classList.length && (b = [a.nodeName.toLowerCase()], a = a.attributes["class"].value.trim(), a = a.replace(/  +/g, " "), b.push(a.split(" ").join(".")), b = b.join("."));
    return b
}

function getElementChildNumber(a) {
    var b = {},
        c, d = a.parentNode;
    var e = d.children.length;
    for (c = 0; c < e; c++)
        if (d.children[c].classList.length) {
            var f = d.children[c].classList[0];
            b[f] ? b[f].push(d.children[c]) : b[f] = [d.children[c]]
        } c = Object.keys(b).length || -1;
    f = {
        childIndex: -1,
        childLen: e
    };
    b[Object.keys(b)[0]] === e ? (f.childIndex = Array.prototype.indexOf.call(b[a.classList[0]], a), f.childLen = b[Object.keys(b)[0]].length) : c && -1 !== c && c !== e ? (f.childIndex = Array.prototype.indexOf.call(d.children, a), f.childLen = b[Object.keys(b)[0]].length) :
        -1 === c && (f.childIndex = Array.prototype.indexOf.call(d.children, a), f.childLen = e);
    return f
}

function parents(a, b) {
    var c;
    if (void 0 === b) b = [];
    else {
        var d = getElementChildNumber(a);
        (c = getElementNodename(a)) ? (1 <= d.childLen && -1 !== d.childIndex && (c += ":nth-child(" + (d.childIndex + 1) + ")"), b.push(c)) : 5 > b.length && (c = a.nodeName.toLowerCase(), -1 !== d.childIndex && (c += ":nth-child(" + (d.childIndex + 1) + ")"), b.push(c))
    }
    return "BODY" !== a.nodeName ? parents(a.parentNode, b) : b
}

function buildAbsCssSelector(a) {
    if ("html" === a.nodeName.toLowerCase()) return "html";
    if ("body" === a.nodeName.toLowerCase()) return "body";
    if ("#document-fragment" === a.nodeName.toLowerCase()) return "";
    for (var b = a.parentNode.children, c = 0; c < b.length; c++)
        if (b[c] === a) {
            var d = buildAbsCssSelector(a.parentNode) + " > " + a.nodeName.toLowerCase() + ":nth-child(" + (c + 1) + ")";
            d = ">" == d.trim().charAt(0) ? d.trim().slice(1) : d;
            break
        } return d
}
var xpathForCss = !1,
    generateCssSelectorFlag = !1;

function createCssSelector(a, b) {
    xpathForCss = !0;
    elementInShadowDom && !iframeXPathFlag && (inspectedElement = a);
    var c = [],
        d = 0,
        e = "",
        f = chooseAttrsForXpath[0];
    try {
        a || (e = "element is inside iframe & it is not supported by SelectorsHub currently. Please write CSS manually.", d = 0);
        if (shadowDOMOpenOrClosed.includes("closed")) return e = "element is inside closed shadow dom & selectors can't be written for it.", d = 0, c.push(e), c.push(d), c;
        var k = a.nodeName.toLowerCase();
        if (!(a.getAttribute(f) && "id" !== f.toLowerCase() || "" ===
                a.id || !chooseAttrsForXpath.includes("withid") && "id" !== f.toLowerCase())) e = "#" + a.id.trim();
        else if ("body" == k || "head" == k || "html" == k) e = k;
        else if (elementInShadowDom || hostShadowDom) {
            if (!(!a.className || k.includes("svg") || isSVGChild(a) || "class" != f && chooseAttrsForXpath.includes("withoutclass")) && (e = "." + replaceAll(a.className.trim(), " ", "."), d = cssSelectorMatchingNode(a, e), 1 === d)) return c.push(e), c.push(d), c;
            if (k.includes("svg") || isSVGChild(a)) return e = k, d = cssSelectorMatchingNode(a, e), c.push(e), c.push(d), c;
            var g = "",
                l = "",
                h = {};
            e = k;
            for (var m = 0; m < a.attributes.length; m++) g = a.attributes[m].name, l = a.attributes[m].nodeValue, null == l || "" == l || "style" === g && "style" !== f || "id" === g || "xpath" === g || "xpathtest" === g || "cssselectortest" === g || chooseAttrsForXpath.includes("without" + g) && f != g || (h[g] = l);
            for (var q = 0; q < Object.keys(h).length; q++)
                if (g = f in h ? f : "placeholder" in h ? "placeholder" : "title" in h ? "title" : "value" in h ? "value" : "name" in h ? "name" : "aria-label" in h ? "aria-label" : "alt" in h ? "alt" : "for" in h ? "for" : "data-label" in h ? "data-label" :
                    "date-fieldlabel" in h ? "date-fieldlabel" : "data-displaylabel" in h ? "data-displaylabel" : "role" in h ? "role" : "type" in h ? "type" : "class" in h ? "class" : Object.keys(h)[0], l = h[g], l = deleteLineGap(l), delete h[g], null != l && "" != l && "css" !== g && "xpath" !== g && (e = l.includes("'") ? e + "[" + g + '="' + l.trim() + '"]' : e + "[" + g + "='" + l + "']", d = cssSelectorMatchingNode(a, e), 1 === d)) return c.push(e), c.push(d), c
        } else if (!absXpath.includes("/*[local-name")) {
            if (a.className && "class" == f) {
                e = "." + replaceAll(a.className.trim(), " ", ".");
                d = cssSelectorMatchingNode(a,
                    e);
                if (1 === d) return c.push(e), c.push(d), c;
                e = ""
            }
            if (k.includes("svg") || isSVGChild(a)) return e = k, d = cssSelectorMatchingNode(a, e), c.push(e), c.push(d), c;
            l = g = "";
            h = {};
            e = k;
            for (m = 0; m < a.attributes.length; m++) g = a.attributes[m].name, l = a.attributes[m].nodeValue, null == l || "" == l || "style" === g && "style" !== f || "xpath" === g || "xpathtest" === g || "cssselectortest" === g || chooseAttrsForXpath.includes("without" + g) && f != g || (h[g] = l);
            for (q = 0; q < Object.keys(h).length; q++)
                if (g = f in h ? f : "id" in h ? "id" : "placeholder" in h ? "placeholder" : "title" in
                    h ? "title" : "value" in h ? "value" : "name" in h ? "name" : "aria-label" in h ? "aria-label" : "alt" in h ? "alt" : "for" in h ? "for" : "data-label" in h ? "data-label" : "date-fieldlabel" in h ? "date-fieldlabel" : "data-displaylabel" in h ? "data-displaylabel" : "role" in h ? "role" : "type" in h ? "type" : "class" in h ? "class" : Object.keys(h)[0], l = h[g], l = deleteLineGap(l), delete h[g], null != l && "" != l && "css" !== g && "xpath" !== g && (e = "id" == g ? "#" + l.trim() : "class" == g ? "." + replaceAll(l.trim(), " ", ".") : l.includes("'") ? e + "[" + g + '="' + l.trim() + '"]' : e + "[" + g + "='" + l +
                        "']", d = cssSelectorMatchingNode(a, e), 1 === d)) return c.push(e), c.push(d), c;
            f = e = "";
            generateCssSelectorFlag = !0;
            f = suggestedFlag || globalRelXpath.includes("normalize-space()") || globalRelXpath.includes("text()") ? createRelXpath(a, b)[0] : globalRelXpath;
            xpathForCss = generateCssSelectorFlag = !1;
            try {
                if (f.includes("@href") || f.includes("@src")) e = f.replace("//", "").replace(/\[@/g, "[");
                else {
                    var t = f.replace(/\/+/g, "//");
                    t = t.split("//");
                    f = /[^[\]]+(?=])/g;
                    for (m = 1; m < t.length; m++) {
                        var u = t[m];
                        if (u.includes("[")) {
                            var r = t[m].match(f)[0];
                            u = 4 > r.length ? t[m].split("[")[0] + ":nth-child(" + r + ")" : t[m].replace(/\[@/g, "[")
                        }
                        e = e + " " + u
                    }
                }
            } catch (w) {}
            d = cssSelectorMatchingNode(a, e)
        }
        d = cssSelectorMatchingNode(a, e);
        if (1 != d || absXpath.includes("/*[local-name"))
            if (e = buildAbsCssSelector(a), d = cssSelectorMatchingNode(a, e), 1 != d) {
                var n = parents(a, []);
                n = n.reverse();
                var p = n.slice(n.length - 1, n.length),
                    v = n.slice(0, n.length - 1);
                e = "";
                e = 0 != v.length ? v.join(" ") + " > " + p : p
            } d = cssSelectorMatchingNode(a, e)
    } catch (w) {
        e = buildAbsCssSelector(a), d = cssSelectorMatchingNode(a, e)
    }
    c.push(e);
    c.push(d);
    return c
}

function parentCssSelector(a, b) {
    var c = a,
        d = "";
    a.nodeName.toLowerCase();
    for (var e = absXpath.match(/[^[\]]+(?=])/g), f = e.length - 1; 0 <= f; f--) {
        var k = c.id ? "#" + c.id : b.includes("withoutclass") || absXpath.includes("/*[local-name") || !c.className ? c.nodeName.toLowerCase() + ":nth-child(" + e[f] + ")" : c.nodeName.toLowerCase() + "." + replaceAll(c.className.trim(), " ", ".") + ":nth-child(" + e[f] + ")";
        var g = cssSelectorMatchingNode(a, d);
        if (1 == g) return d;
        d = 0 == g ? d ? c.nodeName.toLowerCase() + " > " + d : c.nodeName.toLowerCase() : d ? k + " > " + d :
            k;
        c = c.parentNode;
        if ("body" === c.nodeName.toLowerCase()) return "body > " + d
    }
}

function cssSelectorMatchingNode(a, b) {
    var c = 0;
    if (elementInShadowDom && !iframeXPathFlag) try {
        c = a.getRootNode().host.shadowRoot.querySelectorAll(b).length
    } catch (d) {
        c = 0
    } else try {
        c = _document.querySelectorAll(b).length
    } catch (d) {
        c = 0
    }
    return c
}

function createSelectorName(a) {
    _document = a.ownerDocument;
    var b = _document !== document ? "(inside iframe)" : "",
        c = "",
        d = {};
    var e = "";
    var f = a.nodeName.toLowerCase();
    if (f.includes("path") || "g" == f)
        for (; !a.nodeName.toLowerCase().includes("svg") && (a = a.parentElement, f = a.nodeName.toLowerCase(), !f.includes("svg")););
    f.includes("svg") && (a = a.parentElement ? a.parentElement : a);
    if (f.includes("pseudo")) return f = a.parentElement.className, e = f.includes("icon") ? f.replace(/-/g, "") : getComputedStyle(a, "").getPropertyValue("content"),
        e.trim() + b;
    if ("button input meter output progress select textarea".split(" ").includes(f) && a.id) try {
        return e = _document.querySelector("label[for='" + a.id + "']").textContent, e.trim() + b
    } catch (m) {} else if (f.includes("style") || f.includes("script") || f.includes("body") || f.includes("html") || f.includes("head") || f.includes("link") || f.includes("meta") || f.includes("title") || f.includes("comment")) try {
        return e = a.className ? a.className.split(" ")[0] : a.id ? a.id : f + "Element", e.trim() + b
    } catch (m) {}
    var k = a.textContent.trim();
    k && 2 > k.length && (k = a.parentNode.textContent.trim());
    if (f.includes("label")) e = k;
    else if (0 != a.attributes.length) {
        if (!c)
            for (var g = 0; g < a.attributes.length; g++) e = a.attributes[g].name, c = a.attributes[g].nodeValue, null == c || "" == c || e.includes("style") || e.includes("xpath") || (d[e] = c);
        c = "";
        "placeholder" in d ? c = d.placeholder : k.trim() ? c = k : "aria-label" in d ? c = d["aria-label"] : "name" in d ? c = d.name : "value" in d ? c = d.value : "title" in d ? c = d.title : "alt" in d ? c = d.alt : "for" in d ? c = d["for"] : "data-label" in d ? c = d["data-label"] : "date-fieldlabel" in
            d ? c = d["date-fieldlabel"] : "data-displaylabel" in d ? c = d["data-displaylabel"] : "role" in d ? c = d.role : "id" in d && (c = d.id);
        e = c;
        if (!e) {
            c = "search remove delete close cancel plus add subtract minus cart home logo notification globe".split(" ");
            try {
                var l = a.className.toLowerCase();
                if (l)
                    for (g = 0; g < c.length; g++) l.includes(c[g]) && (e = c[g] + " icon")
            } catch (m) {}
        }
    }
    if (!e || 3 > e.length && k) {
        e = (e = k) ? e : a.textContent.trim();
        if (!e) {
            k = !1;
            if (e && e.text && e.text.length) {
                k = e && e.text && Math.round(e.text.length / 2);
                var h = e.text.slice(0, k);
                k = h == e.text.slice(k)
            }
            k && (e.text = h, e = e.text);
            e = e ? e.text : ""
        }!e && a.parentElement ? e = a.parentElement.textContent.trim() : e || (e = f + "Element")
    }
    e || (a = a.parentElement, e = createSelectorName(a));
    e = e ? e : "";
    e = e.includes("inside iframe") ? e : e + b;
    return e.trim().substr(0, 100)
}

function createOptimizedRelXpath(a, b) {
    var c = "";
    try {
        c = buildRelXpath(a, b)
    } catch (f) {
        tempXpath = "", chooseAttrsForXpath = ["withoutid", "withoutclass"], c = buildRelXpath(a, b)
    }
    var d = /\/\/+/g,
        e = 0;
    try {
        e = c.match(d).length
    } catch (f) {}
    1 < e && c.includes("[") && !c.includes("@href") && !c.includes("@src") && (c = optimizeXpath(a, c));
    void 0 === c && (c = "It might be pseudo element/comment/inside iframe from cross-origin. XPath doesn't support for them.");
    return c
}

function buildRelXpathForSVG(a, b) {
    var c = chooseAttrsForXpath[0],
        d = b.nodeName.toLowerCase();
    tagFormat = "//*[name()='" + d;
    if (d.includes("svg")) {
        try {
            d = tempXpath, tempXpath = "", indexes = [], tempXpath = createOptimizedRelXpath(a, b.parentNode) + "//*[name()='svg']" + d, indexes = []
        } catch (m) {}
        return tempXpath
    }
    var e = "",
        f = {};
    d = "";
    try {
        b.attributes.removeNamedItem("xpath"), d = b.attributes.length
    } catch (m) {
        d = b.attributes.length
    }
    if (b.getAttribute(c) && "id" !== c.toLowerCase() || "" === b.id || !chooseAttrsForXpath.includes("withid"))
        if (0 <
            d) {
            if (!e)
                for (d = 0; d < b.attributes.length; d++) {
                    var k = b.attributes[d].name;
                    e = b.attributes[d].nodeValue;
                    null == e || "" == e || "style" === k && "style" !== c || "id" === k || "xpath" === k || (f[k] = e.trim().slice(0, 10))
                }
            if (0 < Object.keys(f).length)
                if (k = c in f ? c : "placeholder" in f ? "placeholder" : "title" in f ? "title" : "value" in f ? "value" : "name" in f ? "name" : "type" in f ? "type" : "class" in f ? "class" : Object.keys(f)[0], e = f[k], e = deleteLineGap(e), null != e && "" != e && "xpath" !== k) {
                    if (e.includes("  ") && (e = e.split("  ")[e.split("  ").length - 1], containsFlag = !0), tempXpath = e.includes("'") ? tagFormat + '" and contains(@' + k + ',"' + e + '")]' + tempXpath : tagFormat + "' and contains(@" + k + ",'" + e + "')]" + tempXpath, c = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === c) return tempXpath
                } else if (null == e || "" == e || k.includes("xpath"))
                if (tempXpath = tagFormat + "'" + tempXpath, c = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === c) return tempXpath
        } else {
            if (tempXpath = tagFormat + "']" + tempXpath, c = a.evaluate(tempXpath,
                    a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === c) return tempXpath
        }
    else if (d = b.id, d = deleteLineGap(d), tempXpath = tagFormat + "' and @id='" + d + "']" + tempXpath, c = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === c) return tempXpath;
    e = 0;
    f = b.parentNode.childNodes;
    for (d = 0; d < f.length; d++) {
        k = f[d];
        if (k === b)
            if (indexes.push(e + 1), tempXpath = buildRelXpathForSVG(a, b.parentNode), tempXpath.includes("/")) {
                c = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,
                    null).snapshotLength;
                if (1 === c) return tempXpath;
                for (var g = absXpath.split("/*"), l = tempXpath.split("/*"), h = g.length - 1; 0 < h; h--)
                    if (tempXpath = tempXpath.replace(l[h], g[h]), c = a.evaluate(tempXpath, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === c) return tempXpath
            } else return tempXpath;
        1 === k.nodeType && k.nodeName.toLowerCase() === b.nodeName.toLowerCase() && e++
    }
}
var eventHandlers = {};

function addListenersForStudio(a, b, c, d) {
    c.handlerName = a;
    d || (d = !1);
    a = d ? "C_" + b : b;
    eventHandlers[a] || (eventHandlers[a] = []);
    eventHandlers[a].push(c)
}

function parseEventKey(a) {
    return a.match(/^C_/) ? {
        eventName: a.substring(2),
        capture: !0
    } : {
        eventName: a,
        capture: !1
    }
}

function attachEvents() {
    if (!this.attached) {
        this.attached = !0;
        this.eventListeners = {};
        var a = this,
            b = {},
            c;
        for (c in eventHandlers) {
            b.$jscomp$loop$prop$eventKey$25 = c;
            var d = function(g) {
                    return function() {
                        var l = eventHandlers[g.$jscomp$loop$prop$eventKey$25],
                            h = function(t) {
                                for (var u = 0; u < l.length; u++) l[u].call(a, t)
                            };
                        this.window.document.addEventListener(f, h, k);
                        this.eventListeners[g.$jscomp$loop$prop$eventKey$25] = h;
                        var m = document.getElementsByTagName("iframe");
                        if (m)
                            for (var q = 0; q < m.length; q++) m[q].contentDocument &&
                                m[q].contentDocument.addEventListener(f, h, k)
                    }
                }(b),
                e = parseEventKey(b.$jscomp$loop$prop$eventKey$25),
                f = e.eventName,
                k = e.capture;
            d.call(this);
            browser.runtime.sendMessage(chrome.runtime.id, {
                data: "",
                message: "AttachStudio"
            });
            b = {
                $jscomp$loop$prop$eventKey$25: b.$jscomp$loop$prop$eventKey$25
            }
        }
    }
}

function deattachEvents() {
    if (this.attached) {
        this.attached = !1;
        for (var a in this.eventListeners) {
            var b = parseEventKey(a);
            this.window.document.removeEventListener(b.eventName, this.eventListeners[a], b.capture)
        }
        delete this.eventListeners
    }
}

function isAlphaNumeric(a) {
    var b = /\d/;
    return /[a-zA-Z]/.test(a) && b.test(a) || b.test(a) ? !0 : !1
}
var recorderCommands = {
    addSelection: "select",
    clickAt: "Click on",
    doubleClickAt: "Double click on",
    rightClick: "Right click on",
    select: "select",
    sendKeys: "Press Enter Key",
    submit: "Press Enter Key",
    type: "Enter "
};

function record(a, b, c, d) {
    c = void 0 === c ? "" : c;
    if (d) return browser.runtime.sendMessage(chrome.runtime.id, {
        data: recorderCommands[a],
        type: "windowEvent",
        URL: window.location.href,
        dataText: "",
        relXpath: "",
        relCss: ""
    }), !1;
    d = createSelectorName(b);
    try {
        relXpath = createRelXpath(b, attrArr)
    } catch (f) {
        try {
            relXpath = createAbsXpath(b)
        } catch (k) {
            return !1
        }
    }
    var e = "";
    try {
        e = createCssSelector(b, attrArr)
    } catch (f) {}
    b = (c = "password" == b.getAttribute("type") ? "******" : c) ? '"' + c + '" into ' : "";
    d && (d = d.slice(0, 30), browser.runtime.sendMessage(chrome.runtime.id, {
        data: recorderCommands[a] + b + ' "' + d + '"',
        type: "windowEvent",
        URL: window.location.href,
        dataText: c,
        relXpath: relXpath ? relXpath[0] : "",
        relCss: e ? e[0] : "",
        planeLabel: d
    }))
}
var allIframes = {},
    iframeIndex = 0;

function getAlliframe(a) {
    allIframes["doc" + iframeIndex] = a;
    var b = a.querySelectorAll("iframe");
    a = a.querySelectorAll("frame");
    b = 0 < b.length && 0 < a.length ? b.concat(a) : 0 < b.length ? b : a;
    allIframes["iframe" + iframeIndex] = b;
    for (a = 0; a < b.length; a++) {
        var c = b[a];
        try {
            if (c.contentWindow.document.querySelector("iframe") || c.contentWindow.document.querySelector("frame")) iframeIndex += 1, getAlliframe(c.contentWindow.document)
        } catch (d) {}
    }
}
var parentiframeXpath = [],
    iframeXPathFlag = !1;

function getIframeXpath(a) {
    getAlliframe(document);
    for (var b = Object.keys(allIframes).length, c, d = 0; d < b; d++) {
        var e = allIframes["iframe" + d];
        c = allIframes["doc" + d];
        for (var f = 0; f < e.length; f++)
            if (e[f].contentDocument == a) return _document = c, iframeXPathFlag = !0, b = createRelXpath(e[f], ",withid,withclass,withname,withplaceholder,withtext"), iframeXPathFlag = !1, 0 == parentiframeXpath.length && (_document = a), c != document && parentiframeXpath.push(getIframeXpath(c)[0]), b
    }
}

function getIframeSelector(a) {
    for (var b = document.querySelectorAll(frameOriframe), c = 0; c < b.length; c++)
        if (b[c].contentDocument == a) return b = createCssSelector(b[c], ",withid,withclass,withname,withplaceholder,withtext"), _document = a, b
}

function isAttributeDynamic(a, b) {
    var c = new RegExp("@+" + b + "+='(.*?)'", "g"),
        d = a.match(new RegExp("@" + b + ",'(.*?)'", "g"));
    c = a.match(c);
    return isAlphaNumeric(d) ? !0 : isAlphaNumeric(c)
}
var typeTarget, typeLock = 0,
    eventCaptured = 0,
    prevTargetElement = null,
    inputTypes = "text password file datetime datetime-local date month time week number range email url search tel color".split(" ");
addListenersForStudio("type", "change", function(a) {
    if (a.target.nodeName && !preventType && 0 == typeLock && (typeLock = 1)) {
        prevTargetElement = a.target;
        var b = a.target.nodeName.toLowerCase(),
            c = a.target.type;
        if ("input" == b && 0 <= inputTypes.indexOf(c))
            if (0 < a.target.value.length) {
                if (record("type", a.target, a.target.value), eventCaptured = 1, null != enterTarget) {
                    a = a.target.parentElement;
                    for (b = a.nodeName.toLowerCase();
                        "form" != b && "body" != b;) a = a.parentElement, b = a.nodeName.toLowerCase();
                    "form" != b || !a.hasAttribute("id") && !a.hasAttribute("name") ||
                        a.hasAttribute("onsubmit");
                    record("sendKeys", enterTarget, null, !0);
                    enterTarget = null
                }
            } else record("type", a.target, a.target.value);
        else "textarea" == b && record("type", a.target, a.target.value)
    }
    typeLock = 0
});
addListenersForStudio("type", "input", function(a) {
    typeTarget = a.target
});
var preventClickTwice = !1,
    clickCounter = 0;
addListenersForStudio("clickAt", "click", function(a) {
    eventCaptured = 0;
    clickCounter++;
    if (0 == a.button && !preventClick && a.isTrusted) {
        if (!preventClickTwice && 1 === clickCounter) {
            var b = a.target;
            do b = b.offsetParent; while (b);
            b = a.target;
            for (var c = b.getAttribute("type"), d = b.parentNode.nodeName, e = 0; 3 > e; e++) try {
                var f = b.parentNode;
                "FORM" == f.nodeName && (d = f.nodeName)
            } catch (k) {}
            if ("INPUT" != b.nodeName && "SELECT" != b.nodeName || "text" != c && "email" != c && "password" != c && "tel" != c && "number" != c && ("FORM" != d || c) && "FORM" != b.nodeName &&
                "BODY" != b.nodeName || "radio" == c || "checkbox" == c || "button" == c) prevTargetElement = a.target, record("clickAt", a.target);
            preventClickTwice = !0
        }
        setTimeout(function() {
            preventClickTwice = !1;
            clickCounter = 0
        }, 200)
    }
}, !0);
addListenersForStudio("doubleClickAt", "dblclick", function(a) {
    clickCounter = 0;
    var b = a.target;
    "FORM" != b.nodeName && "BODY" != b.nodeName && record("doubleClickAt", a.target)
}, !0);
for (var focusTarget = null, focusValue = null, tempValue = null, preventType = !1, inp = document.getElementsByTagName("input"), i = 0; i < inp.length; i++) 0 <= inputTypes.indexOf(inp[i].type) && (inp[i].addEventListener("focus", function(a) {
    focusTarget = a.target;
    tempValue = focusValue = focusTarget.value;
    preventType = !1
}), inp[i].addEventListener("blur", function(a) {
    tempValue = focusValue = focusTarget = null
}));
var preventClick = !1,
    enterTarget = null,
    varenterValue = null,
    tabCheck = null;
addListenersForStudio("sendKeys", "keydown", function(a) {
    if (a.target.nodeName) {
        var b = a.keyCode,
            c = a.target.nodeName.toLowerCase(),
            d = a.target.type;
        if ("input" == c && 0 <= inputTypes.indexOf(d)) {
            prevTargetElement = a.target;
            if (13 == b) {
                enterTarget = a.target;
                enterValue = enterTarget.value;
                c = a.target.parentElement;
                d = c.nodeName.toLowerCase();
                if (tempValue == enterTarget.value && tabCheck == enterTarget) record("sendKeys", enterTarget, null, !0), enterTarget = null, preventType = !0;
                else if (focusValue == enterTarget.value) {
                    for (;
                        "form" !=
                        d && "body" != d;) c = c.parentElement, d = c.nodeName.toLowerCase();
                    "form" != d || !c.hasAttribute("id") && !c.hasAttribute("name") || c.hasAttribute("onsubmit") ? record("sendKeys", enterTarget, null, !0) : c.hasAttribute("id") ? record("submit", "id=" + c.id, "", !0) : c.hasAttribute("name") && record("submit", "name=" + c.name, "", !0);
                    enterTarget = null
                }
                if (typeTarget.nodeName && !preventType && (typeLock = 1))
                    if (c = typeTarget.nodeName.toLowerCase(), d = typeTarget.type, "input" == c && 0 <= inputTypes.indexOf(d))
                        if (0 < typeTarget.value.length) {
                            if (record("type",
                                    typeTarget, typeTarget.value), null != enterTarget) {
                                c = typeTarget.parentElement;
                                for (d = c.nodeName.toLowerCase();
                                    "form" != d && "body" != d;) c = c.parentElement, d = c.nodeName.toLowerCase();
                                "form" != d || !c.hasAttribute("id") && !c.hasAttribute("name") || c.hasAttribute("onsubmit") ? record("sendKeys", enterTarget, null, !0) : c.hasAttribute("id") ? record("submit", [
                                    ["id=" + c.id, "id"]
                                ], "", !0) : c.hasAttribute("name") && record("submit", [
                                    ["name=" + c.name, "name"]
                                ], "", !0);
                                enterTarget = null
                            }
                        } else record("type", typeTarget, typeTarget.value);
                else "textarea" == c && record("type", typeTarget, typeTarget.value);
                preventClick = !0;
                setTimeout(function() {
                    preventClick = !1
                }, 500);
                setTimeout(function() {
                    enterValue != a.target.value && (enterTarget = null)
                }, 50)
            }
            c = !1;
            38 != b && 40 != b || "" == a.target.value || (null != focusTarget && focusTarget.value != tempValue && (c = !0, tempValue = focusTarget.value), c && record("type", a.target, tempValue), setTimeout(function() {
                tempValue = focusTarget.value
            }, 250), record("sendKeys", a.target, "", !0), tabCheck = a.target);
            9 == b && tabCheck == a.target && (record("sendKeys",
                a.target, "", !0), preventType = !0)
        }
    }
}, !0);
addListenersForStudio("contextMenu", "contextmenu", function(a) {
    var b = a.target;
    "FORM" != b.nodeName && "BODY" != b.nodeName && record("rightClick", a.target)
}, !0);
var checkFocus = 0;
addListenersForStudio("editContent", "focus", function(a) {
    "true" == a.target.contentEditable && (getEle = a.target, contentTest = getEle.innerHTML, checkFocus = 1)
}, !0);

function getOptionSelector(a) {
    a = a.text.replace(/^ *(.*?) *$/, "$1");
    return a.match(/\xA0/) ? "label=regexp:" + a.replace(/[\(\)\[\]\\\^\$\*\+\?\.\|\{\}]/g, function(b) {
        return "\\" + b
    }).replace(/\s+/g, function(b) {
        return b.match(/\xA0/) ? 1 < b.length ? "\\s+" : "\\s" : b
    }) : a
}

function normalizeSpaces(a) {
    if (browserVersion.isIE) return a;
    a = a.replace(/ +/g, " ");
    var b = new RegExp(String.fromCharCode(160), "g");
    return browserVersion.isSafari ? replaceAll(a, String.fromCharCode(160), " ") : a.replace(b, " ")
}

function normalizeNewlines(a) {
    return a.replace(/\r\n|\r/g, "\n")
}

function findClickableWebElement(a) {
    if (!a.nodeName) return null;
    var b = a.nodeName.toLowerCase(),
        c = a.type;
    return a.hasAttribute("onclick") || a.hasAttribute("href") || "button" == b || "input" == b && ("submit" == c || "button" == c || "image" == c || "radio" == c || "checkbox" == c || "reset" == c) ? a : null != a.parentNode ? findClickableWebElement(a.parentNode) : null
}
addListenersForStudio("select", "focus", function(a) {
    if (a.target.nodeName && "select" == a.target.nodeName.toLowerCase() && a.target.multiple) {
        a = a.target.options;
        for (var b = 0; b < a.length; b++) null == a[b]._wasSelected && (a[b]._wasSelected = a[b].selected)
    }
}, !0);
addListenersForStudio("select", "change", function(a) {
    if (a.target.nodeName && "select" == a.target.nodeName.toLowerCase())
        if (prevTargetElement = a.target, a.target.multiple)
            for (var b = a.target.options, c = 0; c < b.length; c++) {
                if (b[c]._wasSelected != b[c].selected) {
                    var d = getOptionSelector(b[c]);
                    b[c].selected ? record("addSelection", a.target, d, !0) : record("removeSelection", a.target, d, !0);
                    b[c]._wasSelected = b[c].selected
                }
            } else record("select", a.target, getOptionSelector(a.target.options[a.target.selectedIndex]))
});

function getText(a) {
    var b = "";
    browserVersion.isFirefox && "1.5" <= browserVersion.firefoxVersion || browserVersion.isKonqueror || browserVersion.isSafari || browserVersion.isOpera ? b = getTextContent(a) : a.textContent ? b = a.textContent : a.innerText && (b = a.innerText);
    b = normalizeNewlines(b);
    b = normalizeSpaces(b);
    return b.trim()
}

function getTextContent(a, b) {
    if (a.style && ("hidden" == a.style.visibility || "none" == a.style.display)) return "";
    if (3 == a.nodeType) {
        var c = a.data;
        b || (c = c.replace(/\n|\r|\t/g, " "));
        return c
    }
    if (1 == a.nodeType && "SCRIPT" != a.nodeName) {
        var d = b || "PRE" == a.nodeName;
        c = "";
        for (var e = 0; e < a.childNodes.length; e++) {
            var f = a.childNodes.item(e);
            c += getTextContent(f, d)
        }
        if ("P" == a.nodeName || "BR" == a.nodeName || "HR" == a.nodeName || "DIV" == a.nodeName) c += "\n";
        return c
    }
    return ""
}

function getInspectedElement() {
    var a = _document.querySelector("*[xpathtest]");
    a && setTimeout(function() {
        a.removeAttribute("xpathtest")
    }, 2);
    return a
}
var globalRelXpath = "";

function onInspectElementClick(a, b, c) {
    var d = "",
        e = "",
        f = "",
        k = "",
        g = "",
        l = "",
        h = "",
        m = "",
        q = "",
        t = "",
        u = "";
    elementInShadowDom = isInShadow(a);
    var r = "";
    try {
        r = a.nodeName.toLowerCase()
    } catch (p) {}
    if ("" == _document || "" == r) r = ["Element inside cross-origin iframe. Copy Selectors by right click on element or open iframe src url in new tab.", "0"];
    else if (r.includes("#comment")) r = ["This is a comment and selectors can't be generated for comment.", "0"];
    else if (r.includes("::")) r = ["This is a pseudo element and selectors will be generated for it's parentElement.",
        "0"
    ];
    else {
        d = createAbsXpath(a);
        absXpath = d[0];
        r = createRelXpath(a, b);
        globalRelXpath = r[0];
        e = createXPathWithIndex(a, b);
        try {
            f = createCssSelector(a, b)
        } catch (p) {}
        l = createIdSelector(a);
        m = createNameSelector(a);
        h = createClassNameSelector(a);
        "a" === a.nodeName.toLowerCase() && (k = createLinkTextSelector(a), g = createPartialLinkTextSelector(a));
        q = createTagNameSelector(a);
        "generatorAndEditorRecording" == c && a && (t = createSelectorName(a));
        if (elementInShadowDom) {
            var n = getAllShadowHost(a, b);
            elementInShadowDom = !0
        }
        u = createTestRigorPath(a)
    }
    a = [];
    a.push(r); //relativexpath
    a.push(f); //CSS selector
    a.push(e); //xpath with index
    a.push(l); //id
    a.push(m); //name
    a.push(h); //classname
    a.push(k); //linkText
    a.push(g); //partial link text
    a.push(d); //absolute xpath
    a.push(q); //tag name
    a.push(t); // selectorname
    a.push(n);
    a.push(u);
    a.push(null);
	
	console.log("elements:"+a);
    if (isFirefox) chrome.runtime.sendMessage({
        showInspected: !0,
        xpath: a
    });
    else return a
}
window.addEventListener("beforeunload", function(a) {
    try {
        chrome.runtime.sendMessage({
            count: "pageReload"
        })
    } catch (b) {}
});
var allShadowDomChildNodes = [],
    node = "";

function replaceShadowDomsWithHtml(a) {
    a = $jscomp.makeIterator(a.querySelectorAll("*"));
    for (var b = a.next(); !b.done; b = a.next())
        if (b = b.value, b.shadowRoot) {
            if (b.shadowRoot.querySelector("*[xpathtest='1']")) {
                node = b.shadowRoot.querySelector("*[xpathtest='1']");
                setTimeout(function() {
                    node.removeAttribute("xpathtest")
                }, 5);
                break
            }
            replaceShadowDomsWithHtml(b.shadowRoot)
        } return node
}
var hostShadowDom = !1;

function getAllShadowHost(a, b) {
    for (var c = (a && a.parentNode).getRootNode().host, d = []; c;) hostShadowDom = !0, elementInShadowDom = isInShadow(c), d.push(createCssSelector(c, b)[0]), c = (c && c.parentNode).getRootNode().host;
    inspectedElement = a;
    return d
}

function executeJs(a) {
    var b = [];
    if (null != a && a.length) {
        var c = a.length;
        for (var d = 0; d < c; d++) b.push(a[d].outerHTML)
    } else null != a && b.push(a.outerHTML);
    return b
}

function getPageUrl() {
    return window.location.hostname
}

function getFormattedTime() {
    var a = new Date,
        b = a.getFullYear(),
        c = a.getMonth() + 1,
        d = a.getDate(),
        e = a.getHours(),
        f = a.getMinutes();
    a = a.getSeconds();
    return b + "-" + c + "-" + d + "-" + e + "-" + f + "-" + a
}

function findCommonParent(a, b) {
    for (var c = "/.."; !a.parentElement.contains(b);) a = a.parentElement, c += "/..";
    return c
}
var referenceElement = "",
    xpathElement = "";

function createXpathForReferenceElement(a) {
    return createRelXpath(a, chooseAttrs)[0]
}

function assignParentElement(a) {
    referenceElement = a
}

function getRelationship(a, b) {
    var c = a.compareDocumentPosition(b);
    return 2 == c ? "//preceding::" : 4 == c ? "//following::" : c
}

function createAxesXpathForElement(a) {
    var b = "",
        c = 0;
    if (isInShadow(a)) b = shadowDOMOpenOrClosed.includes("closed") ? "This element is inside closed Shadow DOM which is inaccessible so for such elements we can't verify/write selectors." : absXpath;
    else {
        var d = createRelXpath(referenceElement, chooseAttrsForXpath)[0],
            e = getRelationship(referenceElement, a),
            f = buildXPathForElement(_document, a, chooseAttrsForXpath),
            k = f.replace("/", "");
        k = "/" === k.charAt(0) ? k.replace("/", "") : k;
        if ("//preceding::" == e || "//following::" == e) b =
            d + e + k, c = _document.evaluate(b, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        1 != c && (b = findCommonParent(referenceElement, a), b = d + b + f);
        c = _document.evaluate(b, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength
    }
    referenceElement = "";
    d = [];
    d.push(b);
    d.push(c);
    if (isFirefox) chrome.runtime.sendMessage({
        axesXpathWithCount: d
    });
    else return d
}

function buildXPathForElement(a, b, c) {
    var d = "",
        e = c[0],
        f = !1,
        k = b.nodeName.toLowerCase(),
        g = k.includes("body") ? "" : [].reduce.call(b.childNodes, function(v, w) {
            return v + (3 === w.nodeType ? w.textContent : "")
        }, "").trim();
    if (g.includes("  ") || g.includes("\n") || g.match(/[^\u0000-\u00ff]/)) f = !0;
    if (g.includes("  ") || g.includes("\n")) g = deleteGarbageFromInnerText(g);
    if ("svg" === b.tagName.toLowerCase() || isSVGChild(b)) k = "*[name()='" + k + "']";
    g.includes("'") ? (g = g.split("  ")[0], dotText = '[contains(.,"' + g + '")]', equalsText = '[normalize-space()="' +
        g + '"]', containsText = 50 < g.length || f ? '[contains(text(),"' + g.slice(0, 50) + '")]' : '[normalize-space()="' + g + '"]') : (g = g.split("  ")[0], dotText = "[contains(.,'" + g + "')]", equalsText = "[normalize-space()='" + g + "']", containsText = 50 < g.length || f ? "[contains(text(),'" + g.slice(0, 50) + "')]" : "[normalize-space()='" + g + "']");
    equalsText = containsText;
    if (c.includes("withouttext") || generateCssSelectorFlag) g = "";
    if (g && ("a" == k || "button" == k || "label" == k || "h" == k.charAt(0))) {
        var l = "//" + k + equalsText,
            h = a.evaluate(l, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,
                null).snapshotLength;
        if (1 === h) {
            h = "//" + k + dotText;
            h = a.evaluate(h, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
            if (1 === h) return l;
            h = b.firstChild.textContent;
            h = deleteGarbageFromInnerText(h);
            var m = "//" + k + ("[normalize-space()='" + h + "']");
            h = a.evaluate(m, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
            if (1 === h) return m
        }
    }
    if (k.includes("html") || k.includes("body")) return "//" + k + d;
    l = h = "";
    f = {};
    if (!l)
        for (var q = 0; q < b.attributes.length; q++) {
            var t = b.attributes[q].name;
            m = b.attributes[q].nodeValue;
            null == m || "" == m || "style" === t && "style" !== e || "id" === t || "xpath" === t || "xpathtest" === t || c.includes("without" + t) && e != t || (f[t] = m)
        }
    q = Object.keys(f).length;
    if (b.getAttribute(e) && "id" !== e.toLowerCase() || "" === b.id || !c.includes("withid") && "id" !== e.toLowerCase())
        if (0 != q) {
            c = m = "";
            for (t = 0; t < q; t++) {
                m = d;
                e in f ? (h = e, l = f[h]) : "placeholder" in f ? (h = "placeholder", l = f[h]) : "title" in f ? (h = "title", l = f[h]) : "name" in f ? (h = "name", l = f[h]) : "value" in f ? (h = "value", l = f[h]) : "aria-label" in f ? (h = "aria-label", l = f[h]) : "alt" in f ? (h = "alt", l =
                    f[h]) : "for" in f ? (h = "for", l = f[h]) : "data-label" in f ? (h = "data-label", l = f[h]) : "date-fieldlabel" in f ? (h = "date-fieldlabel", l = f[h]) : "data-displaylabel" in f ? (h = "data-displaylabel", l = f[h]) : "role" in f ? (h = "role", l = f[h]) : "type" in f ? (h = "type", l = f[h]) : "class" in f ? (h = "class", l = f[h]) : (h = Object.keys(f)[0], l = f[h], isAlphaNumeric(l) && (l = h = ""));
                l = deleteLineGap(l);
                delete f[h];
                if (null != l && "" != l && "xpath" !== h) {
                    var u = "//" + k,
                        r = "",
                        n = "";
                    l.includes("  ") && (l = l.split("  ")[l.split("  ").length - 1], containsFlag = !0);
                    r = l.includes("'") ?
                        " " !== l.charAt(0) && " " !== l.charAt(l.length - 1) && !containsFlag || xpathForCss ? "//" + k + "[@" + h + '="' + l + '"]' : "//" + k + "[contains(@" + h + ',"' + l.trim() + '")]' : " " !== l.charAt(0) && " " !== l.charAt(l.length - 1) && !containsFlag || xpathForCss ? "//" + k + "[@" + h + "='" + l + "']" : "//" + k + "[contains(@" + h + ",'" + l.trim() + "')]";
                    n = r + m;
                    h = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                    if (1 === h) {
                        if (n.includes("@href") && !e.includes("href") || n.includes("@src") && !e.includes("src") && g)
                            if (p = "//" + k + containsText + m, h = a.evaluate(p,
                                    a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 0 === h) {
                                if (l = "//" + k + equalsText + m, h = a.evaluate(l, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === h) return l
                            } else if (1 === h) return p;
                        return n
                    }
                    if (g)
                        if (p = "//" + k + containsText + m, h = a.evaluate(p, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 0 === h) {
                            l = "//" + k + equalsText + m;
                            h = a.evaluate(l, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                            if (1 === h) return l;
                            1 < h ? m = l : 0 === h && (m = n)
                        } else if (1 ===
                        h) {
                        h = "//" + k + dotText + m;
                        h = a.evaluate(h, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (1 === h) return p;
                        h = b.firstChild.textContent;
                        h = deleteGarbageFromInnerText(h);
                        l = "[normalize-space()='" + h + "']";
                        n = "//" + k + l + m;
                        h = a.evaluate(n, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (1 === h) return n;
                        m = r + l + m;
                        h = a.evaluate(m, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (1 === h) return m
                    } else {
                        p = "//" + k + "[contains(text(),'" + g.slice(0, 50) + "')]" + m;
                        h = a.evaluate(p,
                            a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (1 === h) return p;
                        p = r + containsText + m;
                        h = a.evaluate(p, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (0 === h) {
                            if (l = r + equalsText + m, h = a.evaluate(l, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === h) return l
                        } else {
                            if (1 === h) return p;
                            if (l.includes("/") || g.includes("/")) l.includes("/") && (p = u + containsText + m), g.includes("/") && (p = p.replace(containsText, ""));
                            m = p
                        }
                    } else m = n, l.includes("/") && (m = "//" + k)
                } else if (g) {
                    p =
                        "//" + k + containsText + m;
                    h = a.evaluate(p, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                    if (0 === h) {
                        if (l = "//" + k + equalsText + m, h = a.evaluate(l, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === h) return l
                    } else {
                        if (1 === h) return p;
                        p = "//" + k + "[contains(text(),'" + g.slice(0, 50) + "')]" + m;
                        h = a.evaluate(p, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
                        if (1 === h) return p
                    }
                    m = p
                } else if (null == l || "" == l || h.includes("xpath")) m = "//" + k + m;
                0 == t && (c = m)
            }
            d = c
        } else if ("" == l &&
        g && !k.includes("script"))
        if (p = "//" + k + containsText + d, h = a.evaluate(p, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 0 === h) d = "//" + k + equalsText + d, h = a.evaluate(d, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        else {
            if (1 === h) return p;
            p = "//" + k + "[contains(text(),'" + g.slice(0, 50) + "')]" + d;
            h = a.evaluate(p, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
            if (1 === h) return p;
            d = p
        }
    else d = "//" + k + d;
    else if (e = b.id, e = deleteLineGap(e), d = "//" + k + "[@id='" + e + "']" + d, h =
        a.evaluate(d, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 !== h && g && 0 === b.getElementsByTagName("*").length) {
        var p = "//" + k + containsText + d;
        h = a.evaluate(p, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength;
        if (0 === h) {
            if (l = "//" + k + equalsText + d, h = a.evaluate(l, a, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength, 1 === h) return l
        } else if (1 === h) return p
    }
    return d
}

function createXPathWithIndex(a, b) {
    var c = 0;
    if (elementInShadowDom) var d = shadowDOMOpenOrClosed.includes("closed") ? "This element is inside closed Shadow DOM which is inaccessible so for such elements we can't verify/write selectors." : absXpath;
    else {
        d = buildXPathForElement(_document, a, chooseAttrsForXpath);
        c = _document.evaluate(absXpathForInspected, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotItem(0);
        var e = _document.evaluate(d, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null);
        totalMatchFound = e.snapshotLength;
        for (var f = 0, k = 0; k < totalMatchFound; k++) node = e.snapshotItem(k), node === c && (f = k + 1);
        d = "(" + d + ")[" + f + "]";
        c = _document.evaluate(d, _document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotLength
    }
    e = [];
    e.push(d);
    e.push(c);
    return e
};