import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        CollectData collectData = new CollectData();
        collectData.Collect();

        ArrayList<String> SohuA = new ArrayList<String>();
        ArrayList<String> SohuP = new ArrayList<String>();
        ArrayList<String> WYA = new ArrayList<String>();
        ArrayList<String> WYP = new ArrayList<String>();
        ArrayList<String> SNA = new ArrayList<String>();
        ArrayList<String> SNP = new ArrayList<String>();
        String[] BasicMessage = new String[2];
        ArrayList<String> REC = new ArrayList<String>();


        BasicMessage[0] = "唉";
        BasicMessage[1] = "陈超你为什么还没有女朋友呢？";
        SohuA = collectData.SohuA;
        SohuP = collectData.SohuP;
        WYA = collectData.WYA;
        WYP = collectData.WYP;
        SNA = collectData.SNA;
        SNP = collectData.SNP;
        REC = collectData.REC;

        int count = 1000;
        int i = 0;
        int Sohu_N = 0;
        int WY_N = 0;
        int SN_N = SNA.size();
        while ( i < count){
            /////////
//            if(Sohu_N == (SohuA.size()-1)){
//                Sohu_N = 0;
//            }
//            else{
//                Sohu_N++;
//            }
//
//            if(WY_N == (WYA.size()-1)){
//                WY_N = 0;
//            }
//            else{
//                WY_N++;
//            }
//
//            if(SN_N == (SNA.size()-1)){
//                SN_N = 0;
//            }
//            else{
//                SN_N++;
//            }
            ///////////
            int temp = (i + 1)%5 ;
            int temp2 = (i + 1)%SNA.size();
            int temp3 = (i + 1)%SohuA.size();
            int temp4 = (i + 1)%WYA.size();
            SohuMailtask sohuMailtask = new SohuMailtask(BasicMessage,SohuA.get(temp3),REC.get(temp),SohuP.get(temp3));
//            WangYiMailtask wangYiMailtask = new WangYiMailtask(BasicMessage,WYA.get(temp4),REC.get(temp),WYP.get(temp4));
//            SinaMailtask sinaMailtask = new SinaMailtask(BasicMessage,SNA.get(temp2),REC.get(temp),SNP.get(temp2));
            Thread thread1 = new Thread(sohuMailtask);
//            Thread thread2 = new Thread(wangYiMailtask);
//            Thread thread3 = new Thread(sinaMailtask);

            System.out.println("第" + i + "次轰炸开始");
            thread1.start();
//            thread2.start();
//            thread3.start();
            i++;
            Thread.sleep(10000);


        }
    }
}
