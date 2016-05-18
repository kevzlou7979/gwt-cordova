package com.florianf.gwtcordova.client.myelemental;

import com.florianf.gwtcordova.client.myelemental.EventTarget;
import com.florianf.gwtcordova.client.myelemental.HTMLElement;
import com.florianf.gwtcordova.client.myelemental.Node;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative = true, namespace = GLOBAL, name="document")
public class Document extends Node {

    public static native void addEventListener(String type, EventListener listener);

    public static native EventTarget getElementById(String id);

    public static native <T> T createElement(String tag);

    public static native HTMLElement getHead();

    @JsProperty
    public static native HTMLElement getBody();
}