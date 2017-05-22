package com.nazim.myapplication.model;

public class Cover {
    private final int id;
    private final int accountId;
    private final String path;
    private final String uploadcareId;
    private final boolean show;
    private final int attachableId;
    private final String attachableType;
    private final int order;

    public Cover(int id, int accountId, String path, String uploadcareId, boolean show, int attachableId,
        String attachableType, int order) {
        this.id = id;
        this.accountId = accountId;
        this.path = path;
        this.uploadcareId = uploadcareId;
        this.show = show;
        this.attachableId = attachableId;
        this.attachableType = attachableType;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getPath() {
        return path;
    }

    public String getUploadcareId() {
        return uploadcareId;
    }

    public boolean isShow() {
        return show;
    }

    public int getAttachableId() {
        return attachableId;
    }

    public String getAttachableType() {
        return attachableType;
    }

    public int getOrder() {
        return order;
    }
}
