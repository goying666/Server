import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Calendar;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException, InterruptedException {
        long startTime = dateUse.getNowTimeLong();

        Integer times = 1;
        long beginTime = dateUse.getNowTimeLong();

//        AdbCommand.InitGame();

        while (true) {
            long onebeginTime = dateUse.getNowTimeLong();
            AdbCommand.AutoBeatDrum();
            Long allend = Calendar.getInstance().getTimeInMillis();
            logger.info("times : " + times + ", spend time is : " + (allend - onebeginTime) / 1000 + "s" + (allend - onebeginTime) % 1000 + "ms");
            logger.info("All spend time is : " + (allend - startTime) / 60000 + "m" + (allend - startTime) % 60000 / 1000 + "s" + (allend - startTime) % 1000 + "ms");
//          退游重启保护
            if (((allend - startTime) / 60000) > 44) { //判断是否超过59分钟
                AdbCommand.QuitGame();
                Thread.sleep(1000 * 60 * 15);//休息15分钟
                AdbCommand.InitGame();
                startTime = Calendar.getInstance().getTimeInMillis();
            }
//            if(times == 38){
//                while (true){
//
//                }
//            }
            times++;
//            if (times > 300) {
//                try {
//                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
//                    Thread.sleep(300);
//                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
//                    Thread.sleep(300);
//                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 800 1140");
//
////
//////                    移动到合成树哪里
////                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 391 457");
////                    Thread.sleep(150);
////                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 141 735");
////                    Thread.sleep(150);
////                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 300 830");
////                    Thread.sleep(150);
////                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 400 1140");
////                    Thread.sleep(2000);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }
//
//    public static void main(String[] args) {
//        long startTime = dateUse.getNowTimeLong();
//
//        Integer times = 0;
//        long beginTime = dateUse.getNowTimeLong();
//        while (true) {
//            try {
////            1、打鼓——进去
//
//                logger.info("times is : " + times + " 。进入鼓~");
//                for (int num = 0 ;num<3;num++){
//                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 509 1180");
//                    Thread.sleep(200);
//                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 508 1244");
//                    Thread.sleep(200);
//                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 590 1171");
//                    Thread.sleep(200);
//                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 595 1243");
//                    Thread.sleep(200);
//                    Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 83 21");//战斗逃跑
//                    Thread.sleep(200);
//
//                }
//
////            1、打鼓——点击
//                logger.info("times is : " + times + " 。打鼓~");
//                Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 562 1255");
//                Thread.sleep(200);
////            2、退出
//                logger.info("times is : " + times + " 。退出打鼓~");
////                Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
//
//                Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 1021 1212");
//                Thread.sleep(1500);
//                Thread.sleep(5000);
////                Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 487 1154");
////            3、移动
//                logger.info("times is : " + times + " 。移动至下一个~");
////                Thread.sleep(4000);
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            Long allend = Calendar.getInstance().getTimeInMillis();
//            logger.info("times : " + times + ", spend time is : " + (allend - beginTime) / 1000 + "s" + (allend - beginTime) % 1000 + "ms");
//            logger.info("All spend time is : " + (allend - startTime) / 60000 + "m" + (allend - startTime) % 60000 / 1000 + "s" + (allend - startTime) % 1000 + "ms");
//            times++;
//        }
//    }
}
