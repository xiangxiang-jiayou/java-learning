package staticmethod;

public class VerifyCodeUtil {
    //构造器私有
    private VerifyCodeUtil() {
    }

    public static String generateVerificationCode(int n) {
        //随机生成数字字母
        String code = "";
        for (int j = 0; j < n; j++) {
            int num = (int) (Math.random() * 62);
            if (num < 10) {
                code += num;
            } else if (num < 36) {
                code += (char) (num - 10 + 'A');
            } else
                code += (char) (num - 36 + 'a');
        }
        return code;


    }
}
