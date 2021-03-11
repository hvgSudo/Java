public class DOB {
    private String date, month, year;

    public DOB () {
        this.date = null;
        this.month = null;
        this.year = null;
    }

    public DOB(String d, String m, String y) {
        this.date = d;
        this.month = m;
        this.year = y;
    }

    public String getDate() { return date; }

    public String getMonth() { return month; }

    public String getYear() { return year; }

    public static DOB enterDOB(String date, String month,
                               String year) {
        return new DOB(date, month, year);
    }
}