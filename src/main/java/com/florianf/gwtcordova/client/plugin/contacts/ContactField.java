package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
@JsType
public interface ContactField {

    String getId();

    String getType();

    String getValue();

    String getPref();
}