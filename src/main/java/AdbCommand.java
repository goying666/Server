import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdbCommand {
    private String COMMAND_ = "";

    public static void InitGame() {
        try {
//            返回桌面，并打开游戏，退出各种广告，调整角度
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent KEYCODE_HOME");
            Thread.sleep(300);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 670 1040");
            Thread.sleep(1000 * 40);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
            Thread.sleep(300);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
            Thread.sleep(300);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
            Thread.sleep(300);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
            Thread.sleep(300);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 380 1140");
            Thread.sleep(300);
//                    设置角度
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input swipe 290 420 900 420 100");
            Thread.sleep(350);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input swipe 290 420 900 420 100");
            Thread.sleep(350);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input swipe 290 420 550 420 100");
            Thread.sleep(350);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void AutoBeatDrum() {
        try {
            ClickDrum(); 
            Thread.sleep(800);
            GoNextOne();
            Thread.sleep(100);
            BeatDrum();
            Thread.sleep(3530);
            GoBack();
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void BeatDrum() {
        try {
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 562 1177");//打鼓
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void GoNextOne() {
        try {
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 1021 1212");//下一个点
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void GoBack() {
        try {
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 83 21");//战斗逃跑
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void QuitGame() {
        try {
            Thread.sleep(3000);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
            Thread.sleep(300);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
            Thread.sleep(300);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
            Thread.sleep(300);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input keyevent 4");
            Thread.sleep(300);
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 800 1140");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void CatchPetOk() {
        try {
            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 360 1780");//抓宠物，确认按键
            Thread.sleep(100);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void ClickDrum() {
        try {

            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 523 1153");//打鼓
            Thread.sleep(50);
//            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 535 1145");//打鼓
//            Thread.sleep(50);
//            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 510 1145");//打鼓
//            Thread.sleep(50);
//            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 510 1167");//打鼓
//            Thread.sleep(50);
//            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 535 1168");//打鼓
//            Thread.sleep(50);
//            Runtime.getRuntime().exec("adb -s SJE5T17704005675 shell input tap 541 1111");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    /*
//     * 删除手机照片文件方法
//     */
//    public void deletecamerafile() {
//        try {
//            Process process = Runtime.getRuntime().exec("adb shell");
//            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            process.getOutputStream().write("cd /mnt/sdcard/DCIM/\r\n".getBytes());
//            process.getOutputStream().write("rm -r Camera/ \r\n".getBytes());
//            process.getOutputStream().flush(); //刷新流
//            Thread.sleep(2000);
//            input.close();
//            process.destroy();
//            System.out.println("手机中的照片清除完毕...");
//        } catch (IOException e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//    }
//    /*
//     * pull照片的 方法
//     */
//    public void pullphoto(String path,String Storage_place) {
//        get_photo_name(Storage_place);
//        Process process2 ;
//        try {
//            if(Storage_place == "contrast_photo") {
//                process2 = Runtime.getRuntime().exec("cmd /c adb pull /mnt/sdcard/DCIM/Camera/"+new Tools_Sql().getcontrast_photo_name()+"  "+path);
//                Thread.sleep(3000);
//                process2.destroy();
//            }else if (Storage_place=="test_photo") {
//                process2 = Runtime.getRuntime().exec("cmd /c adb pull /mnt/sdcard/DCIM/Camera/"+new Tools_Sql().getTest_photo_name()+"  "+path);
//                Thread.sleep(3000);
//                process2.destroy();
//            }else if (Storage_place == "error_photo") {
//                process2 = Runtime.getRuntime().exec("cmd /c adb pull /mnt/sdcard/DCIM/Camera/"+new Tools_Sql().getTest_photo_name()+"  "+path);
//                Thread.sleep(3000);
//                process2.destroy();
//
//            }
//            System.out.println("照片从手机上下载完成....");
//
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//    }
//    /*
//     * 得到当前测试照片名称的方法
//     */
//    public void get_photo_name(String Storage_place) {
//        try {
//            Process process = Runtime.getRuntime().exec("adb shell");
//            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            process.getOutputStream().write("cd /mnt/sdcard/DCIM/Camera/\r\n".getBytes());
//            process.getOutputStream().write("ls\r\n".getBytes());
//            process.getOutputStream().flush();
//            String s = input.readLine();
//            if(Storage_place == "contrast_photo" ) {
//                new Tools_Sql().setcontrast_photo_name(s);
//                System.out.println("照片名称是："+new Tools_Sql().getcontrast_photo_name());
//            }else if (Storage_place == "test_photo") {
//                new Tools_Sql().setTest_photo_name(s);
//                System.out.println("照片名称是："+new Tools_Sql().getTest_photo_name());
//            }else if (Storage_place == "error_photo") {
//                new Tools_Sql().setTest_photo_name(s);
//                System.out.println("照片名称是："+new Tools_Sql().getTest_photo_name());
//
//            }
//
//            input.close();
//            process.destroy();
//
//
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
}
