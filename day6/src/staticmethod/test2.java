package staticmethod;

public class test2 {
    public static void main(String[] args) {
        //登录
        //开发一个验证码程序
        String code = VerifyCodeUtil.generateVerificationCode(4);
        System.out.println(code);
        }

    }

