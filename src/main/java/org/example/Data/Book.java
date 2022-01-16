package org.example.Data;

/*
        "kind": "Epika",
        "full_sort_key": "verne jules gabriel$20 000 mil podmorskiej z~1eglugi$2848",
        "title": "20 000 mil podmorskiej żeglugi",
        "url": "https://wolnelektury.pl/katalog/lektura/20-000-mil-podmorskiej-zeglugi/",
        "cover_color": "#961060",
        "author": "Jules Gabriel Verne",
        "cover": "book/cover/20-000-mil-podmorskiej-zeglugi.jpg",
        "epoch": "Pozytywizm",
        "href": "https://wolnelektury.pl/api/books/20-000-mil-podmorskiej-zeglugi/",
        "has_audio": true,
        "genre": "Powieść",
        "simple_thumb": "https://wolnelektury.pl/media/book/cover_api_thumb/20-000-mil-podmorskiej-zeglugi_vTapBJg.jpg",
        "slug": "20-000-mil-podmorskiej-zeglugi",
        "cover_thumb": "book/cover_thumb/20-000-mil-podmorskiej-zeglugi_7sGyWnK.jpg",
        "liked": null
 */
public class Book {
    private String kind;
    private String fullSortKey;
    private String title;
    private String url;
    private String coverColor;
    private String author;
    private String cover;
    private String epoch;
    private String href;
    private String has_audio;
    private String genre;
    private String simple_thumb;
    private String slug;
    private String cover_thumb;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getFullSortKey() {
        return fullSortKey;
    }

    public void setFullSortKey(String fullSortKey) {
        this.fullSortKey = fullSortKey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getHas_audio() {
        return has_audio;
    }

    public void setHas_audio(String has_audio) {
        this.has_audio = has_audio;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSimple_thumb() {
        return simple_thumb;
    }

    public void setSimple_thumb(String simple_thumb) {
        this.simple_thumb = simple_thumb;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getCover_thumb() {
        return cover_thumb;
    }

    public void setCover_thumb(String cover_thumb) {
        this.cover_thumb = cover_thumb;
    }
}
