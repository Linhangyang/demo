package com.linable.helloworld.service.impl;

import com.linable.helloworld.service.Push;

import java.util.List;
import java.util.Map;

/**
 * @author HangYang.Lin
 *         on 2017/5/23.
 */
public class PushA implements Push{

    private String title;

    private String content;

    private Map<String, String> extras;

    private List<String> appIdList;

    public PushA(List<String> appIdList, Map<String, String> extras, String content, String title) {
        this.appIdList = appIdList;
        this.extras = extras;
        this.content = content;
        this.title = title;
    }

    @Override
    public Boolean push() {
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, String> getExtras() {
        return extras;
    }

    public void setExtras(Map<String, String> extras) {
        this.extras = extras;
    }

    public List<String> getAppIdList() {
        return appIdList;
    }

    public void setAppIdList(List<String> appIdList) {
        this.appIdList = appIdList;
    }
}
