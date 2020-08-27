package dtci;

import java.util.function.Function;

public class PasswordValidatorBuilder {
    private int len;
    private PasswordValidator validator = null;
    private Function<PasswordPattern,PasswordPattern> passwordFn;

    private PasswordValidatorBuilder(int len, Function<PasswordPattern,PasswordPattern> fn) {
        this.len = len;
        this.passwordFn = fn;
        this.validator = new PasswordValidator(len, null);
    }
    
    public static PasswordValidatorBuilder builder(int len) {
        return builder(len, Function.identity());
    }

    public static PasswordValidatorBuilder builder(int len, Function<PasswordPattern,PasswordPattern> fn) {
        return new PasswordValidatorBuilder(len, fn);
    }

    public PasswordValidatorBuilder pattern(PasswordPattern pattern) { 
        this.validator.addPasswordPattern(passwordFn.apply(pattern));
        return this;
    }
    
    public PasswordValidator build() {
        PasswordValidator result = this.validator;
        this.validator = new PasswordValidator(this.len, null);
        return result;
    }
}