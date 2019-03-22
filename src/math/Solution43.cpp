class Solution {
public:
    string multiply(string num1, string num2) {
        //处理num1和num2都为0时的特殊情况
        if(num1 == "0" || num2 == "0"){
            return "0";
        }
        //默认num1长度大于等于num2，如果不是，交换2个数
        if(num1.length() < num2.length()){
            string temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        string result = "";//储存最后相乘结果
        int i,j;
        int len1 = num1.length();//num1长度
        int len2 = num2.length();//num2长度
        int add = 0;
        //从第0位开始，到len2 + len1 - 2位为止
        for(i = len1 + len2 - 2;i >= 0;i--){
            int num = 0;
            // 得到所有位数之和等于i的组合，相加之后并加上之前的进位
            for(j = len2 - 1;j >=0;j--){
                int index = i - j;
                if(index >= 0 && index < len1){
                    int a = num1[index] - '0';
                    int b = num2[j] - '0';
                    num += a*b;
                }
            }
            num += add;
            // 结果整除10作为下次进位
            add = num / 10;
            //结果mod10作为这个位置上的数
            char a = '0' + num % 10;
            result  = a + result;
        }
        //最后处理一下最高位的进位
        if(add != 0){
            stringstream ss;
            ss<<add;
            result  = ss.str() + result;
        }
        return result;
    }
};