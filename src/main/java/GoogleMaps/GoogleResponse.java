package GoogleMaps;

public class GoogleResponse {


    private Result[] results ;
    private String status ;
    private String[] html_attributions;



    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(String[] html_attributes) {
        this.html_attributions = html_attributes;
    }
}