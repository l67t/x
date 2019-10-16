import java.util.Scanner;

public class WC {

    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("指令说明：");
        System.out.println("wc.exe -c  //返回文件的字符数");
        System.out.println("wc.exe -w  //返回文件的单词数");
        System.out.println("wc.exe -l  //返回文件的行数");
        System.out.println("wc.exe -a  //返回文件的空行数、代码行数、注释行数");
        System.out.println("*********************************************");    
        Scanner scan=new Scanner(System.in);
        String order=null;
        while((order=scan.nextLine())!="") {
        switch(order) {
        case "wc.exe -c":System.out.println("请输入文件路径:");
                         new Codecount();break;
        case "wc.exe -w":System.out.println("请输入文件路径:");
                         new Wordcount();break;
        case "wc.exe -l":System.out.println("请输入文件路径:");
                         new Linecount();break;
        case "wc.exe -a":System.out.println("请输入文件路径:");
                          new Extra();break;                
        default:System.out.println("指令输入错误，请重新输入指令:");
        }
        
    }
        scan.close();
        
}}