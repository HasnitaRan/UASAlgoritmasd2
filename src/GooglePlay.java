public class GooglePlay {
    private String author;
    private String category;
    private String changelog;
    private String contentRating;
    private String datPublished;
    private String datePublishedIso;
    private String description;
    private String shortDescription;
    private int fileSize;
    private int numDownloads;
    private int operatingSystems;

    public GooglePlay(){
    }

    public GooglePlay(String au, String cat, String ch, String cR, String dP, int filz, int numD, int oS){
        this.author= au;
        this.category = cat ;
        this.changelog = ch;
        this.contentRating = cR ;
        this.datPublished = dP;
        this.fileSize = filz;
        this.numDownloads = numD;
        this.operatingSystems = oS;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getChangelog() {
        return changelog;
    }

    public void setChangelog(String changelog) {
        this.changelog = changelog;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getDatPublished() {
        return datPublished;
    }

    public void setDatPublished(String datPublished) {
        this.datPublished = datPublished;
    }

    public String getDatePublishedIso() {
        return datePublishedIso;
    }

    public void setDatePublishedIso(String datePublishedIso) {
        this.datePublishedIso = datePublishedIso;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getNumDownloads() {
        return numDownloads;
    }

    public void setNumDownloads(int numDownloads) {
        this.numDownloads = numDownloads;
    }

    public int getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(int operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

}