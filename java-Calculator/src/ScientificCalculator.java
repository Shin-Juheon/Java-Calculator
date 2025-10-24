public class ScientificCalculator extends AdvancedCalculator {
    // 계산기 v3.0 개선 버전
    // 이슈 https://github.com/Shin-Juheon/Java-Calculator/issues/14

    // 제곱 연산자 두 수로 제곱 완료
    // https://github.com/Shin-Juheon/Java-Calculator/issues/15
    public int Power() {
        int num = num1;
        int exponent = num2;

        if (exponent == 0) {
            result = 1;
            return result;
        }
        result = num;

        for (int i = 1; i < exponent; i++) {
            setNumbers(result, num);
            result = multiply();
        }
        return result;
    }
}


// ---------- 수정 전 버전 ----------
//    // 계산기 v3.0 개발
//    // 이슈 https://github.com/Shin-Juheon/Java-Calculator/issues/9
//
//    // 제곱 연산자 두 수로 제곱 완료
//    // https://github.com/Shin-Juheon/Java-Calculator/issues/10
//    public int Power() {
//        int num = num1;
//        int exponent = num2;
//        result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result *= num;
//        }
//        return result;
//    }
//}
