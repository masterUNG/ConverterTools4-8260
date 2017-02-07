package rtc.suranya.patcharee.convertertools;

/**
 * Created by masterUNG on 12/4/2016 AD.
 */

public class MyConstant {

    private String[] titleStrings, lengthStrings, tempStrings,
            areaStrings, volumeStrings, weightStrings, timeStrings;

    private double[] lengthDoubles, tempDoubles,
            areaDoubles, volumeDoubles, weightDoubles, timeDoubles;

    public String[] getTitleStrings() {

        //show text
        titleStrings = new String[6];
        titleStrings[0] = "Length";
        titleStrings[1] = "Temp";
        titleStrings[2] = "Area";
        titleStrings[3] = "Volume";
        titleStrings[4] = "Weight";
        titleStrings[5] = "Time";

        return titleStrings;
    }

    public String[] getLengthStrings() {

        lengthStrings = new String[10];
        lengthStrings[0] = "มม.";
        lengthStrings[1] = "ซม.";
        lengthStrings[2] = "ม.";
        lengthStrings[3] = "กม.";
        lengthStrings[4] = "นิ้ว";
        lengthStrings[5] = "หลา";
        lengthStrings[6] = "ฟุต";
        lengthStrings[7] = "ไมโคร.นิ้ว";
        lengthStrings[8] = "ไมโคร.ม.";
        lengthStrings[9] = "ไมล์";


        return lengthStrings;
    }

    public double[] getLengthDoubles() {

        lengthDoubles = new double[10];
        lengthDoubles[0] = 1000;
        lengthDoubles[1] = 100;
        lengthDoubles[2] = 1;
        lengthDoubles[3] = 0.001;
        lengthDoubles[4] = 39.3433;
        lengthDoubles[5] = 1.0936133;
        lengthDoubles[6] = 3.2808399;
        lengthDoubles[7] = 0.393700787;
        lengthDoubles[8] = 1000000;
        lengthDoubles[9] = 0.000621371192;


        return lengthDoubles;
    }

    public String[] getTempStrings() {

        tempStrings = new String[2];
        tempStrings[0] = "องศา C";
        tempStrings[1] = "องศา F";


        return tempStrings;
    }

    public double[] getTempDoubles() {

        tempDoubles = new double[3];
        tempDoubles[0] = 1;
        tempDoubles[1] = 1.8000;


        return tempDoubles;
    }

    public String[] getAreaStrings() {

        areaStrings = new String[12];
        areaStrings[0] = "ตร.ม.";
        areaStrings[1] = "ตร.กม.";
        areaStrings[2] = "ตร.ซม.";
        areaStrings[3] = "ตร.มม.";
        areaStrings[4] = "ตร.ไมล์";
        areaStrings[5] = "ตร.ฟุต";
        areaStrings[6] = "ตร.นิ้ว";
        areaStrings[7] = "ตร.หลา";
        areaStrings[8] = "ตร.ไมโครนิ้ว";
        areaStrings[9] = "ตร.ไมโครเมตร";
        areaStrings[10] = "เฮกตาร์";
        areaStrings[11] = "เอเคอร์";

        return areaStrings;
    }

    public double[] getAreaDoubles() {

        areaDoubles = new double[12];
        areaDoubles[0] = 1;
        areaDoubles[1] = 0.000001000000;
        areaDoubles[2] = 10000.00;
        areaDoubles[3] = 1000000;
        areaDoubles[4] = 3.861022;
        areaDoubles[5] = 10.76391;
        areaDoubles[6] = 1550;
        areaDoubles[7] = 1.195990046;
        areaDoubles[8] = 0.015500031;
        areaDoubles[9] = 1000000;
        areaDoubles[10] = 0.0001;
        areaDoubles[11] = 0.024710538;


        return areaDoubles;
    }

    public String[] getVolumeStrings() {

        volumeStrings = new String[13];
        volumeStrings[0] = "ลบ.ม.";
        volumeStrings[1] = "ลบ.นิ้ว.";
        volumeStrings[2] = "ลบ.ซล.";
        volumeStrings[3] = "ลบ.มม.";
        volumeStrings[4] = "ลบ.หลา";
        volumeStrings[5] = "ลบ.ฟุต";
        volumeStrings[6] = "ลิตร";
        volumeStrings[7] = "มล.";
        volumeStrings[8] = "ซล.";
        volumeStrings[9] = "ออนซ์";
        volumeStrings[10] = "ไมโคร.ล.";
        volumeStrings[11] = "กล.";
        volumeStrings[12] = "ควอต";

        return volumeStrings;
    }

    public double[] getVolumeDoubles() {

        volumeDoubles = new double[13];
        volumeDoubles[0] = 1;
        volumeDoubles[1] = 61023.74;
        volumeDoubles[2] = 100000.0;
        volumeDoubles[3] = 1000000000;
        volumeDoubles[4] = 1.307951;
        volumeDoubles[5] = 35.31467;
        volumeDoubles[6] = 1000.000;
        volumeDoubles[7] = 1000000;
        volumeDoubles[8] = 100000.0;
        volumeDoubles[9] = 35195.08;
        volumeDoubles[10] = 1000000000;
        volumeDoubles[11] = 1.000000;
        volumeDoubles[12] = 879.88;

        return volumeDoubles;
    }

    public String[] getWeightStrings() {

        weightStrings = new String[8];
        weightStrings[0] = "กก.";
        weightStrings[1] = "ก.";
        weightStrings[2] = "มก.";
        weightStrings[3] = "ตัน";
        weightStrings[4] = "ปอนด์";
        weightStrings[5] = "ออนซ์";
        weightStrings[6] = "ไมโคร.ก.";
        weightStrings[7] = "กะรัด";

        return weightStrings;
    }

    public double[] getWeightDoubles() {

        weightDoubles = new double[8];
        weightDoubles[0] = 1;
        weightDoubles[1] = 1000.000;
        weightDoubles[2] = 1000000;
        weightDoubles[3] = 0.00110231131;
        weightDoubles[4] = 2.20462262;
        weightDoubles[5] = 35.27396;
        weightDoubles[6] = 1000000000;
        weightDoubles[7] = 5000;

        return weightDoubles;
    }

    public String[] getTimeStrings() {

        timeStrings = new String[5];
        timeStrings[0] = "วินาที";
        timeStrings[1] = "นาที";
        timeStrings[2] = "ชั่วโมง";
        timeStrings[3] = "วัน";
        timeStrings[4] = "สัปดาห์";


        return timeStrings;
    }

    public double[] getTimeDoubles() {
        timeDoubles = new double[5];
        timeDoubles[0] = 86400.00;
        timeDoubles[1] = 1440;
        timeDoubles[2] = 24;
        timeDoubles[3] = 1;
        timeDoubles[4] = 0.142857143;

        return timeDoubles;
    }
}   // Class
