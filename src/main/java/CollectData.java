import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CollectData {
    public ArrayList<String> SohuA = new ArrayList<String>();
    public ArrayList<String> SohuP = new ArrayList<String>();
    public ArrayList<String> WYA = new ArrayList<String>();
    public ArrayList<String> WYP = new ArrayList<String>();
    public ArrayList<String> SNA = new ArrayList<String>();
    public ArrayList<String> SNP = new ArrayList<String>();
    public ArrayList<String> REC = new ArrayList<String>();
//    public void initial(ArrayList<Double> coordinatex_input, ArrayList<Double> coordinatey_input,ArrayList<Double> degree){
//        this.SohuA = SohuA;
//        this.SohuP = SohuP;
//        this.WYA = WYA;
//        this.WYP = WYP;
//        this.SNA = SNA;
//        this.SNP = SNP;
//
//    }
    public void Collect() throws FileNotFoundException {
//        ArrayList<Double> Coordinatex = new ArrayList<>();
//        ArrayList<Double> Coordinatey = new ArrayList<>();
//        ArrayList<Double> Degree = new ArrayList<>();
        java.io.File File_for_Sohu = new java.io.File("C:\\Users\\87969\\Desktop\\mail\\sohu.txt");
        java.io.File File_for_WY = new java.io.File("C:\\Users\\87969\\Desktop\\mail\\wangyi.txt");
        java.io.File File_for_SN = new java.io.File("C:\\Users\\87969\\Desktop\\mail\\sina.txt");
//        java.io.File File_for_REC = new java.io.File("C:\\Users\\87969\\Desktop\\mail\\MailAddress.txt");

        Scanner Sohu_input = new Scanner(File_for_Sohu);
        Scanner WY_input = new Scanner(File_for_WY);
        Scanner SN_input = new Scanner(File_for_SN);
//        Scanner REC_input = new Scanner(File_for_REC);

        while (Sohu_input.hasNext()){
            SohuA.add(Sohu_input.next());
            SohuP.add(Sohu_input.next());
        }
        while (WY_input.hasNext()){
            WYA.add(WY_input.next());
            WYP.add(WY_input.next());
        }
        while (SN_input.hasNext()){
            SNA.add(SN_input.next());
            SNP.add(SN_input.next());
        }
//        REC.add("1574567465@qq.com");
//        REC.add("1244663414@qq.com");
        REC.add("121795201@qq.com");
//        REC.add("1441197816@qq.com");
//        REC.add("879696519@qq.com");
//        REC.add("cchao012@mail.ustc.edu.cn");
        REC.add("cchao012@mail.ustc.edu.cn");
//        System.out.println(SNA);
//        while (REC_input.hasNext()){
//            REC.add(REC_input.nextLine());
//            REC.add(REC_input.nextLine());
//        }

        Sohu_input.close();
        WY_input.close();
        SN_input.close();
//        REC_input.close();

//        initial(Coordinatex,Coordinatey,Degree);
    }
}
