package chapter14;

public class PasswordTest {
    private String password;    // 비밀번호

    public String getPassword() {
        return password;
    }

    //
    public void setPassword(String password) throws PasswordException {
        // 1. 비밀번호가 null인 경우
        if (password == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다");  // 예외 발생
        }
        // 2. 문자열로만 이루어진 경우
        else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 문자열로만 이루어질 수 없습니다"); // 예외 발생
        }
        // 3. 5자 이하인 경우
        else if (password.length() <= 5) {
            throw new PasswordException("비밀번호는 5자 이상이어야 합니다");  // 예외 발생
        }
        this.password = password;
    }

    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();

        // given
        String password1 = null;
        // when
        try {
            test.setPassword(password1);
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        // given
        String password2 = "abcdefg";
        // when
        try {
            test.setPassword(password2);
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        // given
        String password3 = "abc1";
        // when
        try {
            test.setPassword(password3);
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }

}
