package com.example.kuwako.rsskuwako;

/**
 * Created by m_kuwako on 16/07/31.
 */
public class Item {
    private String title;
    private String body;
    private String imgUrl;
    private String sourceUrl;
    private String mainImg;

    public Item(String title, String body, String imgUrl, String sourceUrl) {
        this.title = title;
        this.body = body;
        this.imgUrl = imgUrl;
        this.sourceUrl = sourceUrl;

        // TODO picassoかなんかで画像を取得する処理
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getMainImg() {
        return mainImg;
    }

    public void setMainImg(String mainImg) {
        this.mainImg = mainImg;
    }
}
