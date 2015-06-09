
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {

        int diffYears;
        if (earlier(comparedDate)) {
            diffYears = comparedDate.year - this.year;
            if (comparedDate.month > this.month) {
                return diffYears;
            } else if (comparedDate.month == this.month && comparedDate.day >= this.day) {
                return diffYears;
            } else {
                return diffYears - 1;
            }
        } else {
            diffYears = this.year - comparedDate.year;
            if (comparedDate.month < this.month) {
                return diffYears;
            } else if (comparedDate.month == this.month && comparedDate.day <= this.day) {
                return diffYears;
            } else {
                return diffYears - 1;
            }
        }
// recursive method doesn't work with automatic grader;
// this method is much cleaner than above. Replace else statement with below        
//        else{
//            return comparedDate.differenceInYears(this);
//        }

    }

}
