package dtci;

/**
 * password pattern and error message pojo
 */
public class PasswordPattern {

    private int minCount = 1;
    private String pattern;
    private String errorMsg;

    public PasswordPattern(String pattern, int min, String errMsg) {
        this.minCount = min;
        this.pattern = pattern;
        this.errorMsg = errMsg;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getPattern() {
        return this.pattern;
    }

    public int minCount() {
        return this.minCount;
    }
}