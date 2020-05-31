import java.math.BigInteger;

public class Digits{
    public static void main(String[] args){
        BigInteger maxValue = new BigInteger("10000000000000000000");
        BigInteger minValue = new BigInteger("1000000000000000000");
        BigInteger count = new BigInteger("0");
        while(minValue.compareTo(maxValue) == -1){
            if(hasLessThanThreeDigits(minValue)){
                count = count.add(new BigInteger("1")); //pridedam viena
            }
            minValue = minValue.add(new BigInteger("1"));
        }
        System.out.println(count);
    }

    public static boolean hasLessThanThreeDigits(BigInteger number){
        String numberString = number.toString(); //pavercia i string skaiciu
        int[] digitTable = new int[10]; //susikuriam masyva
        while(number.compareTo(new BigInteger("0")) == 1){
            digitTable[number.mod(new BigInteger("10")).intValue()]++; // paimu skaiciaus liekana, dalinta is 10
            if(digitTable[number.mod(new BigInteger("10")).intValue()] > 3){
                return false;
            }
            number = number.divide(new BigInteger("10")); //sumazina skaiciu vienu skaitmeniu nuo galo
        }
        return true;
    }
}
